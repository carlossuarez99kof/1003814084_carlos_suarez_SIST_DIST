package com.parcial.parcial.src.Controller;

import com.parcial.parcial.src.Entity.Customer;
import com.parcial.parcial.src.Entity.Product;
import com.parcial.parcial.src.Service.ICustomerService;
import com.parcial.parcial.src.Service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/parcial/customer")
public class CustomerController {
    @Autowired
    private ICustomerService service;

    @GetMapping()
    public List<Customer> all() {
        return service.all();
    }

    @GetMapping("{id}")
    public Optional<Customer> findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Customer save(@RequestBody Customer customer) {
        return service.save(customer);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public void update(@RequestBody Customer customer, @PathVariable Long id) {
        service.update(customer, id);
    }

    @PutMapping("deleteLogical/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public void deleteLogical(@PathVariable Long id) {
        service.deleteLogical(id);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void deletePhysical(@PathVariable Long id) {
        service.deletePhysical(id);
    }
}
