package com.sisdis.seguridad.IRepository;

import com.sisdis.seguridad.Entity.ModuloVista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IModuloVistaRepository extends JpaRepository<ModuloVista, Long> {
}
