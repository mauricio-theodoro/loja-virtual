package com.ecommerce.backend.repository;

import com.ecommerce.backend.entity.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeReposity extends JpaRepository<Cidade, Long> {
}
