package com.civet.util;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.UUID;

public class Util {

	/**
	 * 默认按照64bite大小读文件
	 * 
	 * @param fileName
	 * @param charset
	 * @param args
	 *            一次读写的大小
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public static String readFileByByte64(String fileName, String charset, int... args){
		InputStream is = null;
		String result="";
		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			is = new FileInputStream(new File(fileName));
			int len = 0;
			byte[] b = new byte[args.length > 0 ? args[0] : 64];
			while ((len = is.read(b)) != -1) {
				baos.write(b, 0, len);
			}
			is.close();
			result=baos.toString(charset);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (is != null) {
				try {
					is.close();
				} catch (Exception e) {
				}
			}
		}
		return result;
	}

	/***
	 * 以字节为单位读取文件，常用于读二进制文件，如图片、声音、影像等文件。
	 * 
	 * @param fileName
	 * @return
	 * @throws Exception
	 */
	public static ByteArrayOutputStream readFileByBytes(String fileName) throws Exception {
		// File file = new File(fileName);
		InputStream in = new FileInputStream(new File(fileName));
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			int _temp = 0;
			// in.read() 返回下一个byte 的data
			while ((_temp = in.read()) != -1) {
				// System.out.println(":" + _temp);
				baos.write(_temp);
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e1) {
				}
			}
		}
		return baos;
	}

	/**
	 * 默认按行读取文件全部内容
	 * 
	 * @param fileName
	 * @param charset
	 * @param args
	 *            传一个表示读取的行数 ，传2个参数表示从开始和结束行，结束行大于总行数的时候取到最后一行
	 * @return
	 */
	public static String readFileByLine(String fileName, String charset, int... args) {
		BufferedReader in = null;
		StringBuffer sb = new StringBuffer();
		int start = args.length > 1 ? args[0] : -1;
		int off = args.length > 1 ? args[1] : args.length > 0 ? args[0] : -1;
		int i = 0;
		try {
			in = new BufferedReader(new InputStreamReader(new FileInputStream(new File(fileName)), charset));
			String _temp = null;
			while ((_temp = in.readLine()) != null) {
				if (start != -1 && start >= 0) {
					if (i >= start) {
						if ((--off) < 0) {
							break;
						}
						sb.append(_temp + "\n");

					}
					i++;
					continue;
				}
				if (off != -1 && off >= 0) {
					if ((--off) >= 0) {
						sb.append(_temp + "\n");
						i++;
						continue;
					} else {
						break;
					}
				}
				sb.append(_temp + "\n");
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e1) {
				}
			}
		}
		return sb.toString();
	}

	/**
	 * 按字符读取文件
	 * 
	 * @param fileName
	 * @param charset
	 * @return
	 */
	public static String readFileByChars(String fileName, String charset) {
		BufferedReader in = null;
		StringBuffer sb = new StringBuffer();
		try {
			in = new BufferedReader(new InputStreamReader(new FileInputStream(new File(fileName)), charset));
			int tempchar = 0;
			while ((tempchar = in.read()) != -1) {
				// 对于windows下，\r\n这两个字符在一起时，表示一个换行。
				// 但如果这两个字符分开显示时，会换两次行。
				// 因此，屏蔽掉\r，或者屏蔽\n。否则，将会多出很多空行。
				if (((char) tempchar) != '\r') {
					// System.out.print((char) tempchar);
					sb.append((char) tempchar);
				}
			}
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e1) {
				}
			}
		}
		return sb.toString();
	}

	/***
	 * 按指定大小的字符数组读取文件
	 * 
	 * @param fileName
	 * @param charset
	 * @param args
	 * @return
	 */
	public static String readFileByChars64(String fileName, String charset, int... args) {
		BufferedReader in = null;
		StringBuffer sb = new StringBuffer();
		try {
			// 一次读多个字符
			char[] charArr = new char[args.length > 0 ? args[0] : 64];
			int _temp = 0;
			in = new BufferedReader(new InputStreamReader(new FileInputStream(new File(fileName)), charset));
			// 读入多个字符到字符数组中，charArr为一次读取字符数
			while ((_temp = in.read(charArr)) != -1) {
				// 同样屏蔽掉\r不显示
				if ((_temp == charArr.length) && (charArr[charArr.length - 1] != '\r')) {
					sb.append(charArr);
				} else {
					for (int i = 0; i < _temp; i++) {
						if (charArr[i] == '\r') {
							continue;
						} else {
							sb.append(charArr[i]);
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
				}
			}
		}
		return sb.toString();
	}

	/**
	 * 随机读取文件内容
	 * 
	 * @param fileName
	 */
	public static void readFileByRandomAccess(String fileName) {
		RandomAccessFile randomFile = null;
		try {
			System.out.println("随机读取一段文件内容：");
			// 打开一个随机访问文件流，按只读方式
			randomFile = new RandomAccessFile(fileName, "r");
			// 文件长度，字节数
			long fileLength = randomFile.length();
			// 读文件的起始位置
			int beginIndex = (fileLength > 4) ? 4 : 0;
			// 将读文件的开始位置移到beginIndex位置。
			randomFile.seek(beginIndex);
			byte[] bytes = new byte[10];
			int byteread = 0;
			// 一次读10个字节，如果文件内容不足10个字节，则读剩下的字节。
			// 将一次读取的字节数赋给byteread
			while ((byteread = randomFile.read(bytes)) != -1) {
				System.out.write(bytes, 0, byteread);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (randomFile != null) {
				try {
					randomFile.close();
				} catch (IOException e1) {
				}
			}
		}
	}

	public static boolean createFile(String destFileName) {
		File file = new File(destFileName);
		if (file.exists()) {
			System.out.println("创建单个文件" + destFileName + "失败，目标文件已存在！");
			return false;
		}
		if (destFileName.endsWith(File.separator)) {
			System.out.println("创建单个文件" + destFileName + "失败，目标文件不能为目录！");
			return false;
		}
		// 判断目标文件所在的目录是否存在
		if (!file.getParentFile().exists()) {
			// 如果目标文件所在的目录不存在，则创建父目录
			System.out.println("目标文件所在目录不存在，准备创建它！");
			if (!file.getParentFile().mkdirs()) {
				System.out.println("创建目标文件所在目录失败！");
				return false;
			}
		}
		// 创建目标文件
		try {
			if (file.createNewFile()) {
				System.out.println("创建单个文件" + destFileName + "成功！");
				return true;
			} else {
				System.out.println("创建单个文件" + destFileName + "失败！");
				return false;
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("创建单个文件" + destFileName + "失败！" + e.getMessage());
			return false;
		}
	}

	public static boolean createDir(String destDirName) {
		File dir = new File(destDirName);
		if (dir.exists()) {
			System.out.println("创建目录" + destDirName + "失败，目标目录已经存在");
			return false;
		}
		if (!destDirName.endsWith(File.separator)) {
			destDirName = destDirName + File.separator;
		}
		// 创建目录
		if (dir.mkdirs()) {
			System.out.println("创建目录" + destDirName + "成功！");
			return true;
		} else {
			System.out.println("创建目录" + destDirName + "失败！");
			return false;
		}
	}

	public static String createTempFile(String prefix, String suffix, String dirName) {
		File tempFile = null;
		if (dirName == null) {
			try {
				// 在默认文件夹下创建临时文件
				tempFile = File.createTempFile(prefix, suffix);
				// 返回临时文件的路径
				return tempFile.getCanonicalPath();
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("创建临时文件失败！" + e.getMessage());
				return null;
			}
		} else {
			File dir = new File(dirName);
			// 如果临时文件所在目录不存在，首先创建
			if (!dir.exists()) {
				if (!createDir(dirName)) {
					System.out.println("创建临时文件失败，不能创建临时文件所在的目录！");
					return null;
				}
			}
			try {
				// 在指定目录下创建临时文件
				tempFile = File.createTempFile(prefix, suffix, dir);
				return tempFile.getCanonicalPath();
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("创建临时文件失败！" + e.getMessage());
				return null;
			}
		}
	}

	/***
	 * 使用RandomAccessFile 追加到文件
	 * 
	 * @param fileName
	 * @param content
	 */
	public static void appendToFile(String fileName, String content) {
		try {
			RandomAccessFile randomFile = new RandomAccessFile(fileName, "rw");
			long fileLength = randomFile.length();
			randomFile.seek(fileLength);
			randomFile.writeBytes(content);
			randomFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 使用FileWriter 追加到文件
	 * 
	 * @param fileName
	 * @param content
	 * @param isAppend
	 */
	public static boolean writeFile(String fileName, String content, boolean isAppend) {
		try {
			FileWriter writer = new FileWriter(fileName, isAppend);
			writer.write(content);
			writer.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}

	/***
	 * 获取一个uuid的字符串
	 * 
	 * @return
	 */
	public static String getRandomString() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}

	/**
	 * 获取一个当前时间的毫秒数
	 * 
	 * @return
	 */
	public static String getDateTimeString() {
		return String.valueOf(new Date().getTime());
	}

	/*
	 * public static void main(String[] args) { }
	 */
}
