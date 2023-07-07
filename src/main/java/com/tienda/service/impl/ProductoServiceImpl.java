
package com.tienda.service.impl;

import com.tienda.dao.ProductoDao;
import com.tienda.domain.Producto;
import com.tienda.service.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service 
public class ProductoServiceImpl implements ProductoService{

    
    //La anotacion autowired crea un unico objeto mientras se ejecuta el app
    @Autowired
    private ProductoDao productoDao;
    
    
    @Override
    @Transactional(readOnly = true)
    public List<Producto> getproducto(boolean activos) {
      var lista=productoDao.findAll();
      if(activos){//se deben eliminar los que no estan activos
          lista.removeIf(e -> !e.isActivo());
      }
      return lista;
    }
    
    @Override
    @Transactional(readOnly = true)
    public Producto getProducto(Producto producto) {
        return productoDao.findById(producto.getIdProducto()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Producto producto) {
        productoDao.save(producto);
    }

    @Override
    @Transactional
    public void delete(Producto producto) {
        productoDao.delete(producto);
    }
    
}
