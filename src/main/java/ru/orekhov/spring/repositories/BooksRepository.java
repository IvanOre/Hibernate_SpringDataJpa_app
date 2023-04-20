package ru.orekhov.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.orekhov.spring.models.Book;

import java.util.List;

public interface BooksRepository extends JpaRepository<Book,Integer> {
    List<Book> findByTitleStartingWith(String title);
}
