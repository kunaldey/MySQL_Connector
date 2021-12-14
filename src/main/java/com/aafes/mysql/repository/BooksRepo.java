package com.aafes.mysql.repository;

import com.aafes.mysql.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepo extends JpaRepository<Books, Integer> {
}
