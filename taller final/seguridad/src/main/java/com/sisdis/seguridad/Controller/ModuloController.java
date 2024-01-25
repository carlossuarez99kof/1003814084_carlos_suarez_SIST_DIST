package com.sisdis.seguridad.Controller;
import com.sisdis.seguridad.Entity.Modulo;
import com.sisdis.seguridad.Entity.Vista;
import com.sisdis.seguridad.IService.IModuloService;
import com.sisdis.seguridad.IService.IVistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/seguridad/Modulo")
public class ModuloController
{
    @Autowired
    private IModuloService service;

    @GetMapping()
    public List<Modulo> all() {
        return service.allVistas();
    }

    @GetMapping("{id}")
    public Optional<Modulo> findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Modulo save(@RequestBody Modulo vista) {
        return service.save(vista);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public void update(@RequestBody Modulo vista, @PathVariable Long id) {
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
