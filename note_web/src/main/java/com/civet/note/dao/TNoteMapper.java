package com.civet.note.dao;

import com.civet.note.entity.TNote;

public interface TNoteMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_note
	 * @mbggenerated  Fri Mar 24 15:50:58 CST 2017
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_note
	 * @mbggenerated  Fri Mar 24 15:50:58 CST 2017
	 */
	int insert(TNote record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_note
	 * @mbggenerated  Fri Mar 24 15:50:58 CST 2017
	 */
	int insertSelective(TNote record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_note
	 * @mbggenerated  Fri Mar 24 15:50:58 CST 2017
	 */
	TNote selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_note
	 * @mbggenerated  Fri Mar 24 15:50:58 CST 2017
	 */
	int updateByPrimaryKeySelective(TNote record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_note
	 * @mbggenerated  Fri Mar 24 15:50:58 CST 2017
	 */
	int updateByPrimaryKey(TNote record);
}