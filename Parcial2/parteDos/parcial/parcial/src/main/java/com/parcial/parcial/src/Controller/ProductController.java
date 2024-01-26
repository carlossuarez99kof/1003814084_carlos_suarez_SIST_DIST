package com.parcial.parcial.src.Controller;

import com.parcial.parcial.src.Entity.Product;
import com.parcial.parcial.src.Service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/parcial/product")
public class ProductController {

    @Autowired
    private IProductService service;

    @GetMapping()
    public List<Product> all() {
        return service.all();
    }

    @GetMapping("{id}")
    public Optional<Product> findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Product save(@RequestBody Product product) {
        return service.save(product);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public void update(@RequestBody Product product, @PathVariable Long id) {
        service.update(product, id);
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
