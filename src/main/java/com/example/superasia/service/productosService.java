package com.example.superasia.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.superasia.model.productos;
import com.example.superasia.repository.productosRepository;
@Service
public class productosService {
    @Autowired //Inyecta una dependencia
    private productosRepository productosRepository;

    public List<productos>getAll(){
        return productosRepository.findAll();

    }
    public productos saveProductos(productos p){
        return productosRepository.save(p);

    }

}
