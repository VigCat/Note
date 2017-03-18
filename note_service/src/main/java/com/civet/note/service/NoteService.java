package com.civet.note.service;

import java.util.List;

import com.civet.note.entity.Note;

public interface NoteService {

	int deleteByPrimaryKey(String id);

	int insert(Note record);

	int insertSelective(Note record);

	Note selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(Note record);

	int updateByPrimaryKey(Note record);

	List<Note> selectAll();
}
