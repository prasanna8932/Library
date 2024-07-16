package com.library.Books.controller;

import com.library.Books.config.fullresponse;
import com.library.Books.model.Books;
import com.library.Books.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {
    @Autowired
    private BooksService serv;

    @PostMapping("/addbooks")
    public Books addBooks(@RequestBody Books books) {
        return serv.addBook(books);
    }

    @GetMapping("/getbooks")
    public List<Books> getBooks() {
        return serv.getBooks();
    }

    @GetMapping("with-Students/{bookid}")
    public ResponseEntity<fullresponse> findByBookid(@PathVariable("bookid") int bookid  ){
        return ResponseEntity.ok (BooksService.getFullResponseByBookId(bookid));
    }
}
