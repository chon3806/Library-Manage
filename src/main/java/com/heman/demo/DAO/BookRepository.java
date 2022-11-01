package com.heman.demo.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.heman.demo.entities.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

}
