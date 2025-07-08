package com.mtm.mscatalogo.Service;

import com.mtm.mscatalogo.Entity.Categoria;

import java.util.List;
import java.util.Optional;

public interface CategoriaService {
    List<Categoria> listar();

    Optional<Categoria> buscar(Integer id);

    Categoria guardar(Categoria categoria);

    Categoria actualizar(Integer id,Categoria categoria);

    void eliminar(Integer Id);
}
