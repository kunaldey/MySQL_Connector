package com.aafes.mysql.resource;

import com.aafes.mysql.model.Books;
import com.aafes.mysql.repository.BooksRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/books")
public class BooksResource {

    @Autowired
    BooksRepo BooksRepo;

    @GetMapping(value = "/all")
    public List<Books> getAll(){
        return BooksRepo.findAll();
    }

    @PostMapping(value = "/loadBook")
    public List<Books> addBooks (@RequestBody final Books booksRepo){
        BooksRepo.save(booksRepo);
        return BooksRepo.findAll();
    }
}
