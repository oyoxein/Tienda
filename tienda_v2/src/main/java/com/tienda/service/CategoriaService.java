
package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;

 
public interface CategoriaService {
  
    //se delcar aun metodo para obtener un arraylist de objetos de categori
    //los objetos vienen  e la tabla de categoria...
    //son todos los registros o solo los activos.
    public List<Categoria> getcategoria(boolean activo);
    
    
    //abajo se colocaran los metodos para un CRUD de categorias... pero en semana 6
    // Se obtiene un Categoria, a partir del id de un categoria
    public Categoria getCategoria(Categoria categoria);
    
    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void save(Categoria categoria);
    
    // Se elimina el categoria que tiene el id pasado por parámetro
    public void delete(Categoria categoria);
}
