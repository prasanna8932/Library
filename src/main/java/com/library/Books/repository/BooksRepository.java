package com.library.Books.repository;

import com.library.Books.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Books,Integer> {
    Books findByBookid(int bookid);
}
