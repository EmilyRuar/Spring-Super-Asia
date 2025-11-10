package com.example.superasia.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //Lombok
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class productos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //Genera la llave
   private Long id;
   private String nombre;
   private String categoria;
   private int precio;
}
