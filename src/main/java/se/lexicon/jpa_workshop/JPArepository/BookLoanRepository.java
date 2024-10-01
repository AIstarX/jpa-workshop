package se.lexicon.jpa_workshop.JPArepository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.lexicon.jpa_workshop.model.BookLoan;
import se.lexicon.jpa_workshop.model.User;

import java.time.LocalDate;
import java.util.List;

public interface BookLoanRepository extends JpaRepository<BookLoan, Integer> {

    List<BookLoan> findByBorrower(User borrower);

    List<BookLoan> findByDueDateBefore(LocalDate date);

    //Query to find overdue loans (where return date is null and due date is before today)
    List<BookLoan> findByDueDateBeforeAndReturnDateIsNull(LocalDate today);
}
