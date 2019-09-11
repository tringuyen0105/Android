package com.example.mynote.models;
import java.util.Date;

public class Note {

    private Integer noteId;
    private String content;
    private Boolean isImportant;
    private Date createdDate;

    public Note(Integer noteId, String content, Boolean isImportant, Date createdDate) {
        this.noteId = noteId;
        this.content = content;
        this.isImportant = isImportant;
        this.createdDate = createdDate;
    }

    public Note(Integer noteId, String content, Boolean isImportant) {
        this.noteId = noteId;
        this.content = content;
        this.isImportant = isImportant;
        this.createdDate = new Date();
    }

    public Integer getNoteId() {
        return noteId;
    }

    public void setNoteId(Integer noteId) {
        this.noteId = noteId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getImportant() {
        return isImportant;
    }

    public void setImportant(Boolean important) {
        isImportant = important;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
