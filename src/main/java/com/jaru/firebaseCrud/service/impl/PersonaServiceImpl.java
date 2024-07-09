/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jaru.firebaseCrud.service.impl;

import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.Firestore;
import com.jaru.firebaseCrud.commons.GenericServiceImpl;
import com.jaru.firebaseCrud.dto.PersonaDto;
import com.jaru.firebaseCrud.model.Persona;
import com.jaru.firebaseCrud.service.api.PersonaServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ANTONIO
 */
@Service
public class PersonaServiceImpl extends GenericServiceImpl<Persona, PersonaDto> implements PersonaServiceApi{

    @Autowired
    private Firestore firestore;

    public PersonaServiceImpl() {
        super(PersonaDto.class);
    }
     
    @Override
    public CollectionReference getCollection() {
      return firestore.collection("personas");
    }
    
}
