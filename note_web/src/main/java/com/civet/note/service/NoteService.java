package com.civet.note.service;

import java.util.List;

import com.civet.note.entity.TNote;

public interface NoteService {

	int deleteByPrimaryKey(String id);

	int insert(TNote record);

	int insertSelective(TNote record);

	TNote selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(TNote record);

	int updateByPrimaryKey(String id,TNote record);

	/*一下为新加的方法*/
	
	/**
	 * 查询所有
	 * @return
	 */
	List<TNote> selectAll();

	List<TNote> selectByParentId(int menuID);
}
