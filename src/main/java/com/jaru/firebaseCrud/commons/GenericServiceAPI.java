/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.jaru.firebaseCrud.commons;

import java.util.List;
import java.util.Map;

/**
 *
 * @author ANTONIO
 */
public interface GenericServiceAPI <I,O>{
    
    String save(I entity, String id) throws Exception;
    String save(I entity) throws Exception;
    void delete(String id) throws Exception;
    O get(String id) throws Exception;
    Map<String, Object> getAsMap(String id)throws Exception;
    List<O> getAll() throws Exception;
}
