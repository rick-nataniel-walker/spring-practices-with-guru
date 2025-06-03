package controllers;

import domain.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import repository.BookRespository;
import services.BookService;
import services.BookServiceImpl;

@Controller
@RequestMapping("api/books")
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public ResponseEntity<Iterable<Book>> books() {
        Iterable<Book> books = bookService.findAll();
        return ResponseEntity.ok(books);
    }
}
