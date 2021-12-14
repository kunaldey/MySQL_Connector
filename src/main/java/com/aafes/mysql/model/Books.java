package com.aafes.mysql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Books {

    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer id;
    @Column(name="BookName")
    private String BookName;
    @Column(name="BookAuthor")
    private String BookAuthor;
    @Column(name="IsBorrowed")
    private Integer IsBorrowed;
    @Column(name="BorrowedBy")
    private String BorrowedBy;
    @Column(name="BorrowDate")
    private Date BorrowDate;

    public Books() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getBookAuthor() {
        return BookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        BookAuthor = bookAuthor;
    }

    public Integer getIsBorrowed() {
        return IsBorrowed;
    }

    public void setIsBorrowed(Integer isBorrowed) {
        IsBorrowed = isBorrowed;
    }

    public String getBorrowedBy() {
        return BorrowedBy;
    }

    public void setBorrowedBy(String borrowedBy) {
        BorrowedBy = borrowedBy;
    }

    public Date getBorrowDate() {
        return BorrowDate;
    }

    public void setBorrowDate(Date borrowDate) {
        BorrowDate = borrowDate;
    }
}
