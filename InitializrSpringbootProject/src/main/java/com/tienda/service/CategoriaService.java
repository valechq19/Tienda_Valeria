
package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    public List<Categoria>getCategoriaa(boolean activos);
    
    public void save(Categoria cliente);
    
    public void delete(Categoria cliente);
    
    public Categoria getCliente(Categoria cliente);

    public Categoria getCategoria(Categoria categoria);
}
