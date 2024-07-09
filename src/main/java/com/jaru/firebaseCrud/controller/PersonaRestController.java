/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jaru.firebaseCrud.controller;

import com.jaru.firebaseCrud.dto.PersonaDto;
import com.jaru.firebaseCrud.model.Persona;
import com.jaru.firebaseCrud.service.api.PersonaServiceApi;
import jakarta.websocket.server.PathParam;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ANTONIO
 */
@RestController
@RequestMapping(value="personas/api/v1")
public class PersonaRestController {
    
    @Autowired
    private  PersonaServiceApi personaServiceApi;
    
    @GetMapping(value="/all")
    public List<PersonaDto> getAll() throws Exception{
      return  personaServiceApi.getAll();
    }
    
     @GetMapping(value="/find/{id}")
    public PersonaDto find(@PathVariable String id) throws Exception{
      return  personaServiceApi.get(id);
    }
    
     @PostMapping(value="/save/{id}")
    public ResponseEntity<String> save(@RequestBody Persona persona,@PathVariable String id) throws Exception{
        if (id == null || id.length() == 0 || id.equals("null")) {
			id = personaServiceApi.save(persona);
		} else {
			personaServiceApi.save(persona, id);
		}
		return new ResponseEntity<String>(id, HttpStatus.OK);
    } 
    
     @GetMapping(value="/delete/{id}")
    public ResponseEntity<PersonaDto> delete(@PathVariable String id) throws Exception{
         PersonaDto persona = personaServiceApi.get(id);
         if(persona !=null)
         {
             personaServiceApi.delete(id);
         }else{
          return  new  ResponseEntity<>(HttpStatus.NO_CONTENT);
         }
         
         return  new  ResponseEntity<> (persona,HttpStatus.OK);
    } 
}
