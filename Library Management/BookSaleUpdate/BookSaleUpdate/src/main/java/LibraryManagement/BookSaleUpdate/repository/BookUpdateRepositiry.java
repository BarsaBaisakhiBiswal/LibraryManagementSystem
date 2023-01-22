package LibraryManagement.BookSaleUpdate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import LibraryManagement.BookSaleUpdate.entity.BookUpdateEntity;


@Repository
public interface BookUpdateRepositiry extends JpaRepository<BookUpdateEntity, Integer>{

}
