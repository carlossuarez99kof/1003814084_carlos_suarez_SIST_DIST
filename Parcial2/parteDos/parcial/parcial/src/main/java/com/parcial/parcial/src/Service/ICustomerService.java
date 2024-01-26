package com.parcial.parcial.src.Service;

import com.parcial.parcial.src.Entity.Customer;
import com.parcial.parcial.src.Entity.CustomerProduct;

import java.util.List;
import java.util.Optional;

public interface ICustomerService {

    public List<Customer> all();

    //Obtener por ID
    public Optional<Customer> findById(Long id);

    //Crear
    public Customer save(Customer customer
    );

    //Modificar
    public void update(Customer customer, Long id);

    //Eliminar Físico
    public void deletePhysical(Long id);

    //Eliminar lógico
    public void deleteLogical(Long id);
}
