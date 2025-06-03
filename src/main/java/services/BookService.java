package services;

import domain.Book;

public interface BookService {
    Iterable<Book> findAll();
}
