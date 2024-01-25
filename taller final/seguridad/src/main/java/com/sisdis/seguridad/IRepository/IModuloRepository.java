package com.sisdis.seguridad.IRepository;

import com.sisdis.seguridad.Entity.Modulo;
import com.sisdis.seguridad.Entity.Vista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IModuloRepository extends JpaRepository<Modulo, Long> {
}
