package com.tienda.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="cliente")
public class Cliente implements Serializable{
    private static final long serialVersionUID = 1L;
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcliente;
    String nombre;
    String apellidos;
    String correo;
    String telefono;
    public Cliente(){// Cómo se creó el otro
        // constructor ... el default debe crearse ...
   }
    public Cliente(String nombre,String apellidos,
            String correo,String telefono){
        this.nombre=nombre;

        this.apellidos=apellidos;
        this.correo=correo;
        this.telefono=telefono;
        
}
    }
