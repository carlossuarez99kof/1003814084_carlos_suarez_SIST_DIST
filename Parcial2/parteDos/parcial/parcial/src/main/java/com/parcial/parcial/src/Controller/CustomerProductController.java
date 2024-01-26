package com.parcial.parcial.src.Controller;

import com.parcial.parcial.src.Entity.CustomerProduct;
import com.parcial.parcial.src.Entity.Product;
import com.parcial.parcial.src.Service.ICustomeProductrService;
import com.parcial.parcial.src.Service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/parcial/customerProduct")
public class CustomerProductController {

    @Autowired
    private ICustomeProductrService service;

    @GetMapping()
    public List<CustomerProduct> all() {
        return service.all();
    }

    @GetMapping("{id}")
    public Optional<CustomerProduct> findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public CustomerProduct save(@RequestBody CustomerProduct customerProduct) {
        return service.save(customerProduct);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public void update(@RequestBody CustomerProduct customerProduct, @PathVariable Long id) {
        service.update(customerProduct, id);
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
