package com.santiagocontreras.webapp.biblioteca1.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.santiagocontreras.webapp.biblioteca1.model.Categoria;
import com.santiagocontreras.webapp.biblioteca1.repository.CategoriaRepositorio;

@Service
public class CategoriaService implements ICategoriaService{

    @Autowired
    private CategoriaRepositorio categoriaRepositorio;

    @Override
    public List<Categoria> listarCategoria() {
        return categoriaRepositorio.findAll();
    }

    @Override
    public Categoria buscarCategoriaPorId(Long id) {
        return categoriaRepositorio.findById(id).orElse(null);
    }

    @Override
    public Categoria guardarCategoria(Categoria categoria) {
        return categoriaRepositorio.save(categoria);
    }

    @Override
    public void eliminarCategoria(Categoria categoria) {
        categoriaRepositorio.delete(categoria);
    }
    
}
