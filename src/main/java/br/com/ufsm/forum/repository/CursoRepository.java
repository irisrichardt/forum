package br.com.ufsm.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ufsm.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByNome(String nome);
}
