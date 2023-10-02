/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.suely.springdemo.controllers;

/**
 *
 * @author USUARIO
 */
import com.suely.springdemo.entities.Alunos;
import com.suely.springdemo.repositories.AlunosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author USUARIO
 */
@RestController
@RequestMapping(value = "/alunos")
public class AlunosController {

    @Autowired
    private AlunosRepository repository;

    @GetMapping
    public List findAll() {
        return repository.findAll();
    }

    /**
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/{id}")

    public ResponseEntity<Alunos> findById(@PathVariable Long id) {
        return repository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());

    }

    @PostMapping
    public Alunos create(@RequestBody Alunos alunos) {
        return repository.save(alunos);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity update(@PathVariable("id") long id,
            @RequestBody Alunos alunos) {
        return (ResponseEntity) repository.findById(id)
                .map((Alunos record) -> {
                    record.setName(alunos.getName());
                    Alunos updated = repository.save(record);
                    return ResponseEntity.ok().body(updated);
                }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping(path = {"/{id}"})
    public ResponseEntity<?> delete(@PathVariable long id) {
        return repository.findById(id)
                .map(record -> {
                    repository.deleteById(id);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }
}

