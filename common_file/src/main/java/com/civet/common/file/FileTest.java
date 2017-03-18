package com.civet.common.file;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ChengJun
 * @date 2017-03-02 下午8:22:30
 *
 */
public class FileTest {

	public static String readFileByByte64(String fileName, String charset, int... args) throws UnsupportedEncodingException {
		InputStream is = null;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			is = new FileInputStream(new File(fileName));
			int len = 0;
			byte[] b = new byte[args.length > 0 ? args[0] : 64];
			while ((len = is.read(b)) != -1) {
				baos.write(b, 0, len);
			}
			is.close();
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
		return  baos.toString(charset);
	}

	/**
	 * 以字节为单位读取文件，常用于读二进制文件，如图片、声音、影像等文件。
	 * 
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
				if (start != -1&&start>=0) {
					if (i >= start) {
						if ((--off)<0) {
							break;
						}
						sb.append(_temp + "\n");
						
					}
					i++;
					continue;
				}
				if (off != -1&&off>=0) {
					if ((--off)>=0) {
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

	public static void main(String[] args) {
		/*String fileName = "C:/temp/newTemp.txt";
		try {
			System.out.println(FileTest.readFileByLine(fileName, "utf-8"));
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		test();
	}
	public static void test(){
//		System.out.println(new Date().getTime() );
//		String path = request.getServletContext().getRealPath("/"); 
		
	}
	public static String getUserDate(String sformat) {
		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat(sformat);
		String dateString = formatter.format(currentTime);
		return dateString;
	}
	public static String dateToStr(Date dateDate) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = formatter.format(dateDate);
		return dateString;
	}

}
