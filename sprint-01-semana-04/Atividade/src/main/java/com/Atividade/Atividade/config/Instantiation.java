package com.Atividade.Atividade.config;

import com.Atividade.Atividade.domain.Book;
import com.Atividade.Atividade.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private BookRepository bookRepository;
    @Override
    public void run(String... args) throws Exception {

        bookRepository.deleteAll();
        
        Book book1 = new Book("1984", "1984", "Científica", 1949, "George Orwell");
        Book book2 = new Book("Dom Casmurro", "Dom Casmurro", "Romance", 1899, "Machado de Assis");
        Book book3 = new Book("The Lord of the Rings", "The Lord of the Rings", "Fantasia", 1954, "J.R.R. Tolkien");
        Book book4 = new Book("Animal Farm", "Animal Farm", "Fábula", 1945, "George Orwell");

       bookRepository.saveAll(Arrays.asList(book1, book2, book3, book4));
    }
}
