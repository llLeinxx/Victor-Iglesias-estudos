package com.Atividade.Atividade.resources;

import com.Atividade.Atividade.domain.Book;
import com.Atividade.Atividade.dto.BookDTO;
import com.Atividade.Atividade.resources.util.URL;
import com.Atividade.Atividade.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/books")
public class BookResource {

    @Autowired
    private BookService service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<BookDTO>> findAll(){
        List<Book> list = service.findAll();
        List<BookDTO> listDto = list.stream().map(x -> new BookDTO(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<BookDTO> findById(@PathVariable String id){
        Book obj = service.findById(id);
        return ResponseEntity.ok().body(new BookDTO(obj));

    }

    @RequestMapping(value = "/busca", method = RequestMethod.GET)
    public ResponseEntity<Book> findByBook(@RequestParam String nome){
        Book obj = service.findByAuthor(nome);
       return ResponseEntity.ok().body(obj);

    }


    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public ResponseEntity<Void> insert(@RequestBody BookDTO objDto){
        Book obj = service.fromDTO(objDto);
        obj = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).build();

    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> delete(@PathVariable String id){
        service.delete(id);
        return ResponseEntity.noContent().build();

    }


    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Void> update(@RequestBody BookDTO objDto, @PathVariable String id){
        Book obj = service.fromDTO(objDto);
        obj.setId(id);
        obj = service.update(obj);
        return ResponseEntity.noContent().build();

    }

}
