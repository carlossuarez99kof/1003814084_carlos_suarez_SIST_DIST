package com.sisdis.seguridad.Service;

import com.sisdis.seguridad.Entity.Modulo;
import com.sisdis.seguridad.Entity.Vista;
import com.sisdis.seguridad.IRepository.IModuloRepository;
import com.sisdis.seguridad.IRepository.IVistaRepository;
import com.sisdis.seguridad.IService.IModuloService;
import com.sisdis.seguridad.IService.IVistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ModuloService implements IModuloService {

    @Autowired
    private IModuloRepository repository;
    @Override
    public List<Modulo> allVistas() {
        return repository.findAll();
    }

    @Override
    public Optional<Modulo> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Modulo save(Modulo modulo) {
        return repository.save(modulo);
    }

    @Override
    public void update(Modulo modulo, Long id) {
        //validar si existe.
        Optional<Modulo> op = repository.findById(id);

        if (op.isEmpty()) {
            System.out.println("Dato no encontrado");
        } else {
            //Crear nuevo objeto que va a contener los datos que se van actualizar
            Modulo moduloUpdate = op.get();
            moduloUpdate.setCodigo(modulo.getCodigo());
            moduloUpdate.setNombre(modulo.getNombre());
            moduloUpdate.setDescripcion(modulo.getDescripcion());
            moduloUpdate.setRuta(modulo.getRuta());
            moduloUpdate.setEstado(modulo.getEstado());
            moduloUpdate.setFechaModificacion(modulo.getFechaModificacion());

            //Actualizar el objeto
            repository.save(moduloUpdate);
        }
    }

    @Override
    public void deletePhysical(Long id){
     repository.deleteById(id);
    }

    @Override
    public void deleteLogical(Long id) {
        //validar si existe.
        Optional<Modulo> op = repository.findById(id);

        if(op.isEmpty()){
            System.out.println("Dato no encontrado");
        }else {
            //Crear nuevo objeto que va a contener los datos que se van actualizar
            Modulo vistaUpdate = op.get();
            vistaUpdate.setFechaEliminacion(LocalDateTime.now());

            //Actualizar el objeto
            repository.save(vistaUpdate);
        }
    }
}
