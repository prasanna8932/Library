package com.library.Books.client;

import com.library.Books.config.Students;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@Component
@FeignClient(name="Students",url="http://localhost:8080/Students")
public interface StudentsClient {
    static List<Students> findByBookId(int bookid) {
        return null;
    }

    @GetMapping("Books/{bookid}")
    public List<Students> findByBookid(@PathVariable int bookid);
}
