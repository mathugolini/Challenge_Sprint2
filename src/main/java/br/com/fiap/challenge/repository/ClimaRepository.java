package br.com.fiap.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.challenge.model.Clima;

@Repository
public interface ClimaRepository extends JpaRepository<Clima, Integer> {

}
