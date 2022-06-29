package com.konchalov.bookmarket.repository;

import com.konchalov.bookmarket.entity.Author;
import com.konchalov.bookmarket.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BookRepository extends JpaRepository<Book, Long> {
   @Query(value = "select sum(b.cost) from Author a join a.books b where a = :id")
   double getCostAllBooksByAuthor(@Param("id") Author author);
}
