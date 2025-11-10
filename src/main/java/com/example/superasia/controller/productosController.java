package com.example.superasia.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.superasia.model.productos;
import com.example.superasia.service.productosService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/productos")
public class productosController {
    @Autowired
    private productosService productosService;


    @GetMapping()
    public List<productos> obtenerTodos() {
        return productosService.getAll();
    }

    @PostMapping()
    public productos save(@RequestBody productos p){
        return productosService.saveProductos(p);
    }
    

}
