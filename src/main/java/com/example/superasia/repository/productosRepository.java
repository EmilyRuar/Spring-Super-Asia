package com.example.superasia.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.superasia.model.productos;

public interface productosRepository extends JpaRepository<productos, Long> {

    productos save(productos p);

}
