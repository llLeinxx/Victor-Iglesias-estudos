package com.Atividade.Atividade.repository;

import com.Atividade.Atividade.domain.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends MongoRepository<Book, String> {
        @Query("{ 'author': { $regex: ?0, $options: 'i' }}")
        List<Book> searchBook(String text);

        Optional<Book> findByAuthor(String author);

        Optional<Book> findByPublished(int published);
}
