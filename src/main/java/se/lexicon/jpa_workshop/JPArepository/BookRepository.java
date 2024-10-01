package se.lexicon.jpa_workshop.JPArepository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.lexicon.jpa_workshop.model.Book;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {

    // Custom query to find a book by title
    List<Book> findByTitle(String title);

    // Custom query to find books by author
    List<Book> findByAuthor(String author);

    // Custom query to find all available books
    List<Book> findByAvailableTrue();
}
