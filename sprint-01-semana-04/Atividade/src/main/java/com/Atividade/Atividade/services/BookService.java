package com.Atividade.Atividade.services;

import java.util.List;
import java.util.Optional;

import com.Atividade.Atividade.domain.Book;
import com.Atividade.Atividade.dto.BookDTO;
import com.Atividade.Atividade.repository.BookRepository;
import com.Atividade.Atividade.services.exception.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository repo;

    public List<Book> findAll(){
        return repo.findAll();
    }

    public Book findById(String id){
        Optional<Book> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public Book findByAuthor(String id){
       Optional<Book> obj = repo.findByAuthor(id);
     return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }


    public Book insert(Book obj){
        return repo.insert(obj);
    }

    public void delete(String id){
        findById(id);
        repo.deleteById(id);
    }

    public Book update(Book obj){
        Book newObj = repo.findById(obj.getId()).get();

        updateData(newObj, obj);

        return repo.save(newObj);
    }

    private void updateData(Book newObj, Book obj) {
        newObj.setBook(obj.getBook());
        newObj.setAuthor(obj.getAuthor());
        newObj.setGender(obj.getGender());
        newObj.setPublished(obj.getPublished());
    }

    public Book fromDTO(BookDTO objDto){

        return new Book(objDto.getId(), objDto.getBook(), objDto.getGender(), objDto.getPublished(), objDto.getAuthor());
    }

    public List<Book> searchBook(String text){
        return repo.searchBook(text);
    }
}
