package com.parcial.parcial.src.Service;

import com.parcial.parcial.src.Entity.Customer;
import com.parcial.parcial.src.Entity.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {

    public List<Product> all();

    //Obtener por ID
    public Optional<Product> findById(Long id);

    //Crear
    public Product save(Product  product
    );

    //Modificar
    public void update(Product product, Long id);

    //Eliminar Físico
    public void deletePhysical(Long id);

    //Eliminar lógico
    public void deleteLogical(Long id);
}
