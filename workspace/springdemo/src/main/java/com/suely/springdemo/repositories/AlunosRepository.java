/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.suely.springdemo.repositories;

/**
 *
 * @author USUARIO
 */
import com.suely.springdemo.entities.Alunos;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author USUARIO
 */
public interface AlunosRepository extends JpaRepository<Alunos , Long>{
    
}
