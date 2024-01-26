package com.parcial.parcial.src.ServiceImpl;

import com.parcial.parcial.src.Entity.CustomerProduct;
import com.parcial.parcial.src.Entity.Product;
import com.parcial.parcial.src.Repository.CustomerProductRespository;
import com.parcial.parcial.src.Repository.ProductRepository;
import com.parcial.parcial.src.Service.ICustomeProductrService;
import com.parcial.parcial.src.Service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class CustomerProductServiceImpl implements ICustomeProductrService {

    @Autowired
    private CustomerProductRespository repository;


    @Override
    public List<CustomerProduct> all() {
        return repository.findAll();
    }

    @Override
    public Optional<CustomerProduct> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public CustomerProduct save(CustomerProduct customerProduct) {
        return repository.save(customerProduct);
    }

    @Override
    public void update(CustomerProduct customerProduct, Long id) {
        //validar si existe.
        Optional<CustomerProduct> op = repository.findById(id);

        if(op.isEmpty()){
            System.out.println("Dato no encontrado");
        }else {
            //Crear nuevo objeto que va a contener los datos que se van actualizar
            CustomerProduct personaUpdate = op.get();
            personaUpdate.setCustomer(customerProduct.getCustomer());
            personaUpdate.setProduct(customerProduct.getProduct());
            personaUpdate.setBalance(customerProduct.getBalance());

            //Actualizar el objeto
            repository.save(personaUpdate);
        }


    }

    @Override
    public void deletePhysical(Long id) {
        //validar si existe.
        //validar si existe.
        Optional<CustomerProduct> op = repository.findById(id);

        if(op.isEmpty()){
            System.out.println("Dato no encontrado");
        }else {
            //Crear nuevo objeto que va a contener los datos que se van actualizar
            CustomerProduct customerProduct = op.get();
            //Actualizar el objeto
            repository.save(customerProduct);
        }
    }

    @Override
    public void deleteLogical(Long id) {

    }
}
