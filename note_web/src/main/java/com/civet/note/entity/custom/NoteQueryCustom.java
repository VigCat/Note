package com.civet.note.entity.custom;

import java.util.List;

//import org.apache.catalina.User;

import com.civet.note.entity.Note;

/**
 * 
 * @author ChengJun
 * @date 2017-02-20 上午11:38:31
 *
 */
public class NoteQueryCustom {
	private Note note;
	private List<Note> noteList;

	public Note getNote() {
		return note;
	}

	public void setNote(Note note) {
		this.note = note;
	}

	public List<Note> getNoteList() {
		return noteList;
	}

	public void setNoteList(List<Note> noteList) {
		this.noteList = noteList;
	}

}
