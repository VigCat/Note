package com.civet.note.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.civet.note.dao.NoteMapper;
import com.civet.note.entity.Note;
import com.civet.note.service.NoteService;

@Service
class NoteServiceImpl implements NoteService {

	@Resource
	private NoteMapper noteDao;

	@Override
	public int deleteByPrimaryKey(String id) {
		return noteDao.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Note record) {
		return noteDao.insert(record);
	}

	@Override
	public int insertSelective(Note record) {
		return noteDao.insertSelective(record);
	}

	@Override
	public Note selectByPrimaryKey(String id) {
		return noteDao.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Note record) {
		return noteDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Note record) {
		return noteDao.updateByPrimaryKey(record);
	}

	@Override
	public List<Note> selectAll() {
		return noteDao.selectAll();
	}

}
