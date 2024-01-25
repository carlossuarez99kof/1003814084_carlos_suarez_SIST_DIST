package com.sisdis.seguridad.IService;

import com.sisdis.seguridad.Entity.Modulo;
import com.sisdis.seguridad.Entity.Vista;

import java.util.List;
import java.util.Optional;

public interface IModuloService {
    //Obtener todo
    public List<Modulo> allVistas();

    //Obtener por ID
    public Optional<Modulo> findById(Long id);

    //Crear
    public Modulo save(Modulo modulo);

    //Modificar
    public void update(Modulo modulo, Long id);

    //Eliminar Físico
    public void deletePhysical(Long id);

    // Eliminar lógico
    public void deleteLogical(Long id);
}
