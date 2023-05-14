/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.BACKEND.Repository;

import com.example.BACKEND.Entity.Estudio;
import org.springframework.data.repository.CrudRepository;


public interface EstudioRepo extends CrudRepository<Estudio, Integer> {
    
}
