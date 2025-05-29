package bootstrap;

import domain.Author;
import domain.Book;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import repository.AuthorRepository;
import repository.BookRespository;


@Component
public class BootstrapData implements CommandLineRunner {

    private final BookRespository bookRepo;
    private final AuthorRepository authorRepo;

    public BootstrapData(BookRespository bookRepo, AuthorRepository authorRepo) {
        this.bookRepo = bookRepo;
        this.authorRepo = authorRepo;
        System.out.println("Iin Bootstrap");
    }

    @Override
    public void run(String... args) throws Exception {
        Author SheanCovey =  new Author();
        SheanCovey.setFirstName("Shean");
        SheanCovey.setLastName("Covey");

        Book seveLaws = new Book();
        seveLaws.setTitle("Seven habits of most successful people");
        seveLaws.setIsBn("12345");

        Author sheanCoveySaved = authorRepo.save(SheanCovey);
        Book sevenLawsSaved = bookRepo.save(seveLaws);

        sheanCoveySaved.getBooks().add(sevenLawsSaved);
        sevenLawsSaved.getAuthors().add(sheanCoveySaved);

        System.out.println("Iin Bootstrap");
        System.out.println("Books: "+ bookRepo.count());
        System.out.println("Authors: "+ authorRepo.count());

    }
}
