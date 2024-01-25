package com.sisdis.seguridad.IService;

import com.sisdis.seguridad.Entity.Modulo;
import com.sisdis.seguridad.Entity.ModuloVista;

import java.util.List;
import java.util.Optional;

public interface IModuloVistaService {
    //Obtener todo
    public List<ModuloVista> allVistas();

    //Obtener por ID
    public Optional<ModuloVista> findById(Long id);

    //Crear
    public ModuloVista save(ModuloVista modulo);

    //Modificar
    public void update(ModuloVista modulo, Long id);

    //Eliminar Físico
    public void deletePhysical(Long id);

    // Eliminar lógico
    public void deleteLogical(Long id);
}
