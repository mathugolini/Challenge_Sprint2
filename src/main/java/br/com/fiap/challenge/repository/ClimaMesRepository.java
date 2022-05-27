package br.com.fiap.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.challenge.model.ClimaMes;

@Repository
public interface ClimaMesRepository extends JpaRepository<ClimaMes, Integer> {

}
