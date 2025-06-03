package services;

import domain.Book;
import org.springframework.stereotype.Service;
import repository.BookRespository;

@Service
public class BookServiceImpl implements BookService {

    private BookRespository bookRepo;

    public BookServiceImpl(BookRespository bookRepo) {
        this.bookRepo = bookRepo;
    }

    @Override
    public Iterable<Book> findAll() {
        return null;
    }
}
