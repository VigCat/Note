package com.civet.note.entity;

import java.util.Date;

public class TUser {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_user.id
	 * @mbggenerated  Fri Mar 24 15:50:24 CST 2017
	 */
	private String id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_user.name
	 * @mbggenerated  Fri Mar 24 15:50:24 CST 2017
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_user.logincode
	 * @mbggenerated  Fri Mar 24 15:50:24 CST 2017
	 */
	private String logincode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_user.password
	 * @mbggenerated  Fri Mar 24 15:50:24 CST 2017
	 */
	private String password;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_user.createtime
	 * @mbggenerated  Fri Mar 24 15:50:24 CST 2017
	 */
	private Date createtime;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user.id
	 * @return  the value of t_user.id
	 * @mbggenerated  Fri Mar 24 15:50:24 CST 2017
	 */
	public String getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user.id
	 * @param id  the value for t_user.id
	 * @mbggenerated  Fri Mar 24 15:50:24 CST 2017
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user.name
	 * @return  the value of t_user.name
	 * @mbggenerated  Fri Mar 24 15:50:24 CST 2017
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user.name
	 * @param name  the value for t_user.name
	 * @mbggenerated  Fri Mar 24 15:50:24 CST 2017
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user.logincode
	 * @return  the value of t_user.logincode
	 * @mbggenerated  Fri Mar 24 15:50:24 CST 2017
	 */
	public String getLogincode() {
		return logincode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user.logincode
	 * @param logincode  the value for t_user.logincode
	 * @mbggenerated  Fri Mar 24 15:50:24 CST 2017
	 */
	public void setLogincode(String logincode) {
		this.logincode = logincode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user.password
	 * @return  the value of t_user.password
	 * @mbggenerated  Fri Mar 24 15:50:24 CST 2017
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user.password
	 * @param password  the value for t_user.password
	 * @mbggenerated  Fri Mar 24 15:50:24 CST 2017
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user.createtime
	 * @return  the value of t_user.createtime
	 * @mbggenerated  Fri Mar 24 15:50:24 CST 2017
	 */
	public Date getCreatetime() {
		return createtime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user.createtime
	 * @param createtime  the value for t_user.createtime
	 * @mbggenerated  Fri Mar 24 15:50:24 CST 2017
	 */
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
}