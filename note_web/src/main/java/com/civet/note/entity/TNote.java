package com.civet.note.entity;

public class TNote {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_note.id
	 * @mbggenerated  Tue Feb 28 22:17:04 CST 2017
	 */
	private String id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_note.title
	 * @mbggenerated  Tue Feb 28 22:17:04 CST 2017
	 */
	private String title;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_note.description
	 * @mbggenerated  Tue Feb 28 22:17:04 CST 2017
	 */
	private String description;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_note.url
	 * @mbggenerated  Tue Feb 28 22:17:04 CST 2017
	 */
	private String url;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_note.createtime
	 * @mbggenerated  Tue Feb 28 22:17:04 CST 2017
	 */
	private String createtime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_note.parentId
	 * @mbggenerated  Tue Feb 28 22:17:04 CST 2017
	 */
	private Integer parentid;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_note.id
	 * @return  the value of t_note.id
	 * @mbggenerated  Tue Feb 28 22:17:04 CST 2017
	 */
	public String getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_note.id
	 * @param id  the value for t_note.id
	 * @mbggenerated  Tue Feb 28 22:17:04 CST 2017
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_note.title
	 * @return  the value of t_note.title
	 * @mbggenerated  Tue Feb 28 22:17:04 CST 2017
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_note.title
	 * @param title  the value for t_note.title
	 * @mbggenerated  Tue Feb 28 22:17:04 CST 2017
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_note.description
	 * @return  the value of t_note.description
	 * @mbggenerated  Tue Feb 28 22:17:04 CST 2017
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_note.description
	 * @param description  the value for t_note.description
	 * @mbggenerated  Tue Feb 28 22:17:04 CST 2017
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_note.url
	 * @return  the value of t_note.url
	 * @mbggenerated  Tue Feb 28 22:17:04 CST 2017
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_note.url
	 * @param url  the value for t_note.url
	 * @mbggenerated  Tue Feb 28 22:17:04 CST 2017
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_note.createtime
	 * @return  the value of t_note.createtime
	 * @mbggenerated  Tue Feb 28 22:17:04 CST 2017
	 */
	public String getCreatetime() {
		return createtime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_note.createtime
	 * @param createtime  the value for t_note.createtime
	 * @mbggenerated  Tue Feb 28 22:17:04 CST 2017
	 */
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_note.parentId
	 * @return  the value of t_note.parentId
	 * @mbggenerated  Tue Feb 28 22:17:04 CST 2017
	 */
	public Integer getParentid() {
		return parentid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_note.parentId
	 * @param parentid  the value for t_note.parentId
	 * @mbggenerated  Tue Feb 28 22:17:04 CST 2017
	 */
	public void setParentid(Integer parentid) {
		this.parentid = parentid;
	}
}