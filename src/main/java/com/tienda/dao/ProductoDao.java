
package com.tienda.dao;

//Dao objeto de acceso a los datos
import com.tienda.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoDao extends JpaRepository<Producto, Long>{
    
}
