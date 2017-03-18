package com.civet.note.dao.custom;

import java.util.List;
import java.util.Map;

import com.civet.note.dao.TNoteMapper;
import com.civet.note.entity.TNote;

/**
 * 
 * @author ChengJun
 * @date 2017-02-20 下午8:52:44
 *
 */
public interface NoteMapperCustom extends TNoteMapper {

	List<TNote> selectAll();

	/**
	 * @param menuID
	 * @return
	 */
	List<TNote> selectByParentId(int menuID); 
}
