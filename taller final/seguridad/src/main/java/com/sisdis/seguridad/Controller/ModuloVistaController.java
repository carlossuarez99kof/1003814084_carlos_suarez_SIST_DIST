package com.sisdis.seguridad.Controller;
import com.sisdis.seguridad.Entity.Modulo;
import com.sisdis.seguridad.Entity.ModuloVista;
import com.sisdis.seguridad.IService.IModuloService;
import com.sisdis.seguridad.IService.IModuloVistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/seguridad/ModuloVista")
public class ModuloVistaController
{
    @Autowired
    private IModuloVistaService service;

    @GetMapping()
    public List<ModuloVista> all() {
        return service.allVistas();
    }

    @GetMapping("{id}")
    public Optional<ModuloVista> findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public ModuloVista save(@RequestBody ModuloVista vista) {
        return service.save(vista);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public void update(@RequestBody ModuloVista vista, @PathVariable Long id) {
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
