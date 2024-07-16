package com.library.Books.service;

import com.library.Books.client.StudentsClient;
import com.library.Books.config.Students;
import com.library.Books.config.fullresponse;
import com.library.Books.model.Books;
import com.library.Books.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BooksService {
    @Autowired
    private static BooksRepository repo;
    @Autowired
    public StudentsClient studentsClient;

    public BooksService(BooksRepository repo, StudentsClient studentsClient) {
        this.repo = repo;
        this.studentsClient = studentsClient;
    }

    public Books addBook(Books books) {
        return repo.save(books);
    }

    public List<Books> getBooks() {
        return repo.findAll();
    }
    public List<Students> getStudentsByBookId(int bookid) {
        return StudentsClient.findByBookId(bookid);
    }
//        List<Students> users=StudentsClient.findByBookid(bookid);
    public static fullresponse getFullResponseByBookId(int bookid) {
        Books books = repo.findByBookid(bookid);
        if (books != null) {
            fullresponse response = new fullresponse();
            response.setBookid(books.getBookid());
            response.setBookname(books.getBookname());
            response.setAuthorname(books.getAuthorname());
            response.setPublisher(books.getPublisher());
            response.setStudents(getStudentsByBookid(bookid));
            return response;

        }
        return null;
    }

    private static List<Students> getStudentsByBookid(int bookid) {
        return StudentsClient.findByBookId(bookid);
    }
}
