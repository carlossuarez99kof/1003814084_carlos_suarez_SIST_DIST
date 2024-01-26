package com.parcial.parcial.src.Service;

import com.parcial.parcial.src.Entity.CustomerProduct;

import java.util.List;
import java.util.Optional;

public interface ICustomeProductrService {

    public List<CustomerProduct> all();

    //Obtener por ID
    public Optional<CustomerProduct> findById(Long id);

    //Crear
    public CustomerProduct save(CustomerProduct persona);

    //Modificar
    public void update(CustomerProduct customerProduct, Long id);

    //Eliminar Físico
    public void deletePhysical(Long id);

    //Eliminar lógico
    public void deleteLogical(Long id);
}
