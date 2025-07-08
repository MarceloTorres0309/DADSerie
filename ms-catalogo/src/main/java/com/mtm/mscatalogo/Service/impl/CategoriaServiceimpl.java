package com.mtm.mscatalogo.Service.impl;

import com.mtm.mscatalogo.Entity.Categoria;
import com.mtm.mscatalogo.Repository.CategoriaRepository;
import com.mtm.mscatalogo.Service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class CategoriaServiceimpl implements CategoriaService {
    @Autowired
    private CategoriaRepository CategoriaRepository;
    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public List<Categoria> listar() {
        return CategoriaRepository.findAll();
    }

    @Override
    public Optional<Categoria> buscar(Integer id) {
        return categoriaRepository.findById(id);
    }

    @Override
    public Categoria guardar(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public Categoria actualizar(Integer id,Categoria categoria) {
        categoria.setId(id);
        return categoriaRepository.save(categoria);
    }

    @Override
    public void eliminar(Integer id) {
            categoriaRepository.deleteById(id);
    }
}
