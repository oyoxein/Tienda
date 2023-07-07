
package com.tienda.service;

import com.tienda.domain.Producto;
import java.util.List;

 
public interface ProductoService {
  
    //se delcar aun metodo para obtener un arraylist de objetos de categori
    //los objetos vienen  e la tabla de producto...
    //son todos los registros o solo los activos.
    public List<Producto> getproducto(boolean activo);
    
    
    //abajo se colocaran los metodos para un CRUD de productos... pero en semana 6
    // Se obtiene un Producto, a partir del id de un producto
    public Producto getProducto(Producto producto);
    
    // Se inserta un nuevo producto si el id del producto esta vacío
    // Se actualiza un producto si el id del producto NO esta vacío
    public void save(Producto producto);
    
    // Se elimina el producto que tiene el id pasado por parámetro
    public void delete(Producto producto);
}
