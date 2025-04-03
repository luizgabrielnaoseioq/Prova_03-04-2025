package com.nazax.prova.repository;

import com.nazax.prova.models.Movimento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimentoRepository extends JpaRepository<Movimento, Long> {
}
