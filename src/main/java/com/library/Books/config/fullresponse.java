package com.library.Books.config;

import lombok.*;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class fullresponse {
    public int bookid;
    public  String bookname;
    public String authorname;
    public String publisher;
    public List<Students> Students;

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public List<Students> getStudents() {
        return Students;
    }

    public void setStudents(List<Students> students) {
        Students = students;
    }
}
