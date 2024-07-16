package com.library.Books.model;

import com.library.Books.config.Students;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "books")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Books {
    @Id
    @GeneratedValue
    public int bookid;
    public  String bookname;
    public String authorname;
    public String publisher;
    public int publicationyear;

}
