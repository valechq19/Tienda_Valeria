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
    private Long idCliente;
    private String nombre;
    private String apellidos;
    private String correo;
    private String telefono;
    
    @JoinColumn(name="id_credito", referencedColumnName = "id_credito")
    @ManyToOne
    private Credito credito;
    
    
    public Cliente(){
   }
    public Cliente(String nombre,String apellidos,
            String correo,String telefono){
        this.nombre=nombre;

        this.apellidos=apellidos;
        this.correo=correo;
        this.telefono=telefono;
        
}
    }
