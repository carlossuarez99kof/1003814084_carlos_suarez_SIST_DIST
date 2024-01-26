package com.parcial.parcial.src.ServiceImpl;

import com.parcial.parcial.src.Entity.Customer;
import com.parcial.parcial.src.Entity.CustomerProduct;
import com.parcial.parcial.src.Entity.Product;
import com.parcial.parcial.src.Repository.CustomerRepository;
import com.parcial.parcial.src.Repository.ProductRepository;
import com.parcial.parcial.src.Service.ICustomerService;
import com.parcial.parcial.src.Service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private CustomerRepository repository;


    @Override
    public List<Customer> all() {
        return repository.findAll();
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Customer save(Customer customer) {
        return repository.save(customer);
    }

    @Override
    public void update(Customer customer, Long id) {
        //validar si existe.
        Optional<Customer> op = repository.findById(id);

        if(op.isEmpty()){
            System.out.println("Dato no encontrado");
        }else {
            //Crear nuevo objeto que va a contener los datos que se van actualizar
            Customer customer1 = op.get();
            customer1.setName(customer.getName());
            customer1.setAddress(customer.getAddress());
            customer1.setEmail(customer.getEmail());
            customer1.setPhone(customer.getPhone());
            //Actualizar el objeto
            repository.save(customer1);
        }
    }

    @Override
    public void deletePhysical(Long id) {
        //validar si existe.
        //validar si existe.
        Optional<Customer> op = repository.findById(id);

        if(op.isEmpty()){
            System.out.println("Dato no encontrado");
        }else {
            //Crear nuevo objeto que va a contener los datos que se van actualizar
            Customer customer = op.get();
            //Actualizar el objeto
            repository.save(customer);
        }

    }

    @Override
    public void deleteLogical(Long id) {

    }
}
