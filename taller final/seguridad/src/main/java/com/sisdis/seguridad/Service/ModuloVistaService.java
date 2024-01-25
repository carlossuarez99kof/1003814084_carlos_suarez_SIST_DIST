package com.sisdis.seguridad.Service;


import com.sisdis.seguridad.Entity.Modulo;
import com.sisdis.seguridad.Entity.ModuloVista;

import com.sisdis.seguridad.Entity.Vista;
import com.sisdis.seguridad.IRepository.IModuloVistaRepository;

import com.sisdis.seguridad.IService.IModuloVistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ModuloVistaService implements IModuloVistaService {

    @Autowired
    private IModuloVistaRepository repository;

    @Override
    public List<ModuloVista> allVistas() {
        return repository.findAll();
    }

    @Override
    public Optional<ModuloVista> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public ModuloVista save(ModuloVista modulo) {
        return repository.save(modulo);
    }

    @Override
    public void update(ModuloVista modulo, Long id) {
        //validar si existe.
        Optional<ModuloVista> op = repository.findById(id);

        if (op.isEmpty()) {
            System.out.println("Dato no encontrado");
        } else {
            //Crear nuevo objeto que va a contener los datos que se van actualizar
            ModuloVista moduloUpdate = op.get();
            moduloUpdate.setModuloId(modulo.getModuloId());
            moduloUpdate.setVistaId(modulo.getVistaId());

            //Actualizar el objeto
            repository.save(moduloUpdate);
        }
    }

    @Override
    public void deletePhysical(Long id) {
      repository.deleteById(id);
    }

    @Override
    public void deleteLogical(Long id) {
    }
}
