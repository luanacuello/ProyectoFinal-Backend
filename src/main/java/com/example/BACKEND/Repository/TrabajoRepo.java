/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.BACKEND.Repository;

import com.example.BACKEND.Entity.Trabajo;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author luana
 */
public interface TrabajoRepo extends CrudRepository<Trabajo, Integer>{
    
}
