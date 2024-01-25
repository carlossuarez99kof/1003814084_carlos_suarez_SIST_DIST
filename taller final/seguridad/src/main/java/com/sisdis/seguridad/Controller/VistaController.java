package com.sisdis.seguridad.Controller;
import com.sisdis.seguridad.Entity.Vista;
import com.sisdis.seguridad.IService.IVistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/seguridad/Vista")
public class VistaController
{
    @Autowired
    private IVistaService service;

    @GetMapping()
    public List<Vista> all() {
        return service.allVistas();
    }

    @GetMapping("{id}")
    public Optional<Vista> findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Vista save(@RequestBody Vista vista) {
        return service.save(vista);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public void update(@RequestBody Vista vista, @PathVariable Long id) {
        service.update(vista, id);
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
