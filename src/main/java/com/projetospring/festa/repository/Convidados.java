package com.projetospring.festa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring.festa.model.Convidado;

public interface Convidados extends JpaRepository<Convidado, Long> {

}
