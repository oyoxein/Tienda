
package com.tienda.dao;

//Dao objeto de acceso a los datos
import com.tienda.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao extends JpaRepository<Categoria, Long>{
    
}
