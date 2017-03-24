package com.civet.note.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.civet.note.dao.custom.NoteMapperCustom;
import com.civet.note.entity.TNote;
import com.civet.note.service.NoteService;

@Service
class NoteServiceImpl implements NoteService {

	@Resource
	private NoteMapperCustom noteDao;

	@Override
	public List<TNote> selectAll() {
		return noteDao.selectAll();
	}

	@Override
	public List<TNote> selectByParentId(int menuID) {
		return noteDao.selectByParentId(menuID);
	}
	
	
	/*以上为自定义的方法*/

	@Override
	public int insert(TNote record) {
		return noteDao.insert(record);
	}

	@Override
	public int insertSelective(TNote record) {
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(TNote record) {
		return noteDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(String id,TNote record) {
		record.setId(id);
		return noteDao.updateByPrimaryKey(record);
	}

	@Override
	public int deleteByPrimaryKey(String id) {
		return noteDao.deleteByPrimaryKey(id);
	}

	@Override
	public TNote selectByPrimaryKey(String id) {
		return noteDao.selectByPrimaryKey(id);
	}
}
