package com.civet.common.menu.entity;

public class TMenu {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_menu.id
	 * @mbggenerated  Thu Mar 23 22:11:23 CST 2017
	 */
	private String id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_menu.description
	 * @mbggenerated  Thu Mar 23 22:11:23 CST 2017
	 */
	private String description;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_menu.href
	 * @mbggenerated  Thu Mar 23 22:11:23 CST 2017
	 */
	private String href;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_menu.img
	 * @mbggenerated  Thu Mar 23 22:11:23 CST 2017
	 */
	private String img;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_menu.fk_parentid
	 * @mbggenerated  Thu Mar 23 22:11:23 CST 2017
	 */
	private String fkParentid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_menu.title
	 * @mbggenerated  Thu Mar 23 22:11:23 CST 2017
	 */
	private String title;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_menu.isdefault
	 * @mbggenerated  Thu Mar 23 22:11:23 CST 2017
	 */
	private Byte isdefault;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_menu.id
	 * @return  the value of t_menu.id
	 * @mbggenerated  Thu Mar 23 22:11:23 CST 2017
	 */
	public String getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_menu.id
	 * @param id  the value for t_menu.id
	 * @mbggenerated  Thu Mar 23 22:11:23 CST 2017
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_menu.description
	 * @return  the value of t_menu.description
	 * @mbggenerated  Thu Mar 23 22:11:23 CST 2017
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_menu.description
	 * @param description  the value for t_menu.description
	 * @mbggenerated  Thu Mar 23 22:11:23 CST 2017
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_menu.href
	 * @return  the value of t_menu.href
	 * @mbggenerated  Thu Mar 23 22:11:23 CST 2017
	 */
	public String getHref() {
		return href;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_menu.href
	 * @param href  the value for t_menu.href
	 * @mbggenerated  Thu Mar 23 22:11:23 CST 2017
	 */
	public void setHref(String href) {
		this.href = href;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_menu.img
	 * @return  the value of t_menu.img
	 * @mbggenerated  Thu Mar 23 22:11:23 CST 2017
	 */
	public String getImg() {
		return img;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_menu.img
	 * @param img  the value for t_menu.img
	 * @mbggenerated  Thu Mar 23 22:11:23 CST 2017
	 */
	public void setImg(String img) {
		this.img = img;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_menu.fk_parentid
	 * @return  the value of t_menu.fk_parentid
	 * @mbggenerated  Thu Mar 23 22:11:23 CST 2017
	 */
	public String getFkParentid() {
		return fkParentid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_menu.fk_parentid
	 * @param fkParentid  the value for t_menu.fk_parentid
	 * @mbggenerated  Thu Mar 23 22:11:23 CST 2017
	 */
	public void setFkParentid(String fkParentid) {
		this.fkParentid = fkParentid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_menu.title
	 * @return  the value of t_menu.title
	 * @mbggenerated  Thu Mar 23 22:11:23 CST 2017
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_menu.title
	 * @param title  the value for t_menu.title
	 * @mbggenerated  Thu Mar 23 22:11:23 CST 2017
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_menu.isdefault
	 * @return  the value of t_menu.isdefault
	 * @mbggenerated  Thu Mar 23 22:11:23 CST 2017
	 */
	public Byte getIsdefault() {
		return isdefault;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_menu.isdefault
	 * @param isdefault  the value for t_menu.isdefault
	 * @mbggenerated  Thu Mar 23 22:11:23 CST 2017
	 */
	public void setIsdefault(Byte isdefault) {
		this.isdefault = isdefault;
	}
}