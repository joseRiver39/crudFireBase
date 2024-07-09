/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jaru.firebaseCrud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author ANTONIO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PersonaDto {
    private String id;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
}
