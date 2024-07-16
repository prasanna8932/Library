package com.library.Books.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Students {
    public int id;
    public String name;
    public String branch;
    public int year;
    public String email;
    public String phonenumber;
    public int bookid;


}
