package LibraryManagement.BookFetch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import LibraryManagement.BookFetch.entity.BookEntity;

public interface BookRepository extends JpaRepository<BookEntity, Integer> {

}
