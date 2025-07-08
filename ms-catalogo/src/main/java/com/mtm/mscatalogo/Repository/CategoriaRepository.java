package com.mtm.mscatalogo.Repository;

import com.mtm.mscatalogo.Entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
