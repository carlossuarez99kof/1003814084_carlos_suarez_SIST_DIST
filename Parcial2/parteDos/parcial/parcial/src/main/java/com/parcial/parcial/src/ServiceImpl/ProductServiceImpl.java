package com.parcial.parcial.src.ServiceImpl;

import com.parcial.parcial.src.Entity.Customer;
import com.parcial.parcial.src.Entity.Product;
import com.parcial.parcial.src.Repository.ProductRepository;
import com.parcial.parcial.src.Service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private ProductRepository repository;


    @Override
    public List<Product> all() {
        return repository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Product save(Product product) {
        return repository.save(product);
    }

    @Override
    public void update(Product product, Long id) {
        //validar si existe.
        Optional<Product> op = repository.findById(id);

        if(op.isEmpty()){
            System.out.println("Dato no encontrado");
        }else {
            //Crear nuevo objeto que va a contener los datos que se van actualizar
            Product product1 = op.get();
            product1.setName(product.getName());
            product1.setDescription(product.getDescription());
            //Actualizar el objeto
            repository.save(product1);
        }
    }

    @Override
    public void deletePhysical(Long id) {
        //validar si existe.
        Optional<Product> op = repository.findById(id);

        if(op.isEmpty()){
            System.out.println("Dato no encontrado");
        }else {
            //Crear nuevo objeto que va a contener los datos que se van actualizar
            Product product = op.get();
            //Actualizar el objeto
            repository.save(product);
        }
    }

    @Override
    public void deleteLogical(Long id) {

    }
}
