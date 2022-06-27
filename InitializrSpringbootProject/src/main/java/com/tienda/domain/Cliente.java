package com.tienda.domain;

import lombok.Data;

@Data
public class Cliente {
    String nombre;
    String apellidos;
    String correo;
    String telefono;
    public Cliente(){// Cómo se creó el otro constructor ... el default debe crearse.
    }
    public Cliente(String nombre,String apellidos,String correo,String telefono){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.correo=correo;
        this.telefono=telefono;
}
    }
