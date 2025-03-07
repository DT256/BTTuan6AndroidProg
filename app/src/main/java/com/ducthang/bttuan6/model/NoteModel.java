package com.ducthang.bttuan6.model;
import java.io.Serializable;

public class NoteModel implements Serializable {
    private int IdNote;
    private String NameNote;

    public NoteModel(String nameNote, int idNote) {
        NameNote = nameNote;
        IdNote = idNote;
    }

    public String getNameNote() {
        return NameNote;
    }

    public void setNameNote(String nameNote) {
        NameNote = nameNote;
    }

    public int getIdNote() {
        return IdNote;
    }

    public void setIdNote(int idNote) {
        IdNote = idNote;
    }
}
