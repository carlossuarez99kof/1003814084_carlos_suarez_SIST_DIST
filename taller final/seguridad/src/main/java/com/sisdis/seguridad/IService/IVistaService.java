package com.sisdis.seguridad.IService;

import com.sisdis.seguridad.Entity.Usuario;
import com.sisdis.seguridad.Entity.Vista;

import java.util.List;
import java.util.Optional;

public interface IVistaService {
    //Obtener todo
    public List<Vista> allVistas();

    //Obtener por ID
    public Optional<Vista> findById(Long id);

    //Crear
    public Vista save(Vista vista);

    //Modificar
    public void update(Vista vista, Long id);

    //Eliminar Físico
    public void deletePhysical(Long id);

    // Eliminar lógico
    public void deleteLogical(Long id);
}
