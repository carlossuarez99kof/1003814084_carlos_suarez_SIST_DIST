package com.sisdis.seguridad.Service;

import com.sisdis.seguridad.Entity.Vista;
import com.sisdis.seguridad.IRepository.IVistaRepository;
import com.sisdis.seguridad.IService.IVistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class VistaService  implements IVistaService {

    @Autowired
    private IVistaRepository repository;
    @Override
    public List<Vista> allVistas() {
        return repository.findAll();
    }

    @Override
    public Optional<Vista> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Vista save(Vista vista) {
        vista.setFechaCreacion(LocalDateTime.now());
        return repository.save(vista);
    }

    @Override
    public void update(Vista vista, Long id) {
        //validar si existe.
        Optional<Vista> op = repository.findById(id);

        if(op.isEmpty()){
            System.out.println("Dato no encontrado");
        }else {
            //Crear nuevo objeto que va a contener los datos que se van actualizar
            Vista vistaUpdate = op.get();
            vistaUpdate.setCodigo(vista.getCodigo());
            vistaUpdate.setNombre(vista.getNombre());
            vistaUpdate.setDescripcion(vista.getDescripcion());
            vistaUpdate.setRuta(vista.getRuta());
            vistaUpdate.setEstado(vista.getEstado());
            vistaUpdate.setFechaCreacion(vista.getFechaCreacion());

            //Actualizar el objeto
            repository.save(vistaUpdate);
        }

    }

    @Override
    public void deletePhysical(Long id) {
      repository.deleteById(id);
    }

    @Override
    public void deleteLogical(Long id) {
        //validar si existe.
        Optional<Vista> op = repository.findById(id);

        if(op.isEmpty()){
            System.out.println("Dato no encontrado");
        }else {
            //Crear nuevo objeto que va a contener los datos que se van actualizar
            Vista vistaUpdate = op.get();
            vistaUpdate.setFechaEliminacion(LocalDateTime.now());

            //Actualizar el objeto
            repository.save(vistaUpdate);
        }
    }
}
