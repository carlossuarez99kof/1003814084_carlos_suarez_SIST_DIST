package com.parcial.parcial.src.Repository;

import com.parcial.parcial.src.Entity.CustomerProduct;
import com.parcial.parcial.src.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerProductRespository  extends JpaRepository<CustomerProduct, Long> {
}
