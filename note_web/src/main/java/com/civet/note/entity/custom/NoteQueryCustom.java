package com.civet.note.entity.custom;

import java.util.List;

import com.civet.note.entity.TNote;

/**
 * 
 * @author ChengJun
 * @date 2017-02-20 上午11:38:31
 *
 */
public class NoteQueryCustom {
	private TNote TNote;
	private List<TNote> noteList;

	public TNote getNote() {
		return TNote;
	}

	public void setNote(TNote TNote) {
		this.TNote = TNote;
	}

	public List<TNote> getNoteList() {
		return noteList;
	}

	public void setNoteList(List<TNote> noteList) {
		this.noteList = noteList;
	}

}
