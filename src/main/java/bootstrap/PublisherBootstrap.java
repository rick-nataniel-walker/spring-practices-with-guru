package bootstrap;

import domain.Publisher;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import repository.PublisherRepository;

@Component
public class PublisherBootstrap implements CommandLineRunner {
    private final PublisherRepository publisherRepo;

    public PublisherBootstrap(PublisherRepository publisherRepo) {
        this.publisherRepo = publisherRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        Publisher publisher = new Publisher();
        publisher.setPublisherName("Khossa pubs, inc");
        publisher.setAddress("Av. 25 de Setembro");
        publisher.setCity("Maputo");
        publisher.setState("Mozambique");
        publisher.setZip("1106");

        publisherRepo.save(publisher);

        System.out.println("Publishers in DB: "+publisherRepo.count());
    }
}
