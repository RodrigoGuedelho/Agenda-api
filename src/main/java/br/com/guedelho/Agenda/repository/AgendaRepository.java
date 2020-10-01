package br.com.guedelho.Agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.guedelho.Agenda.models.Agenda;

public interface AgendaRepository extends JpaRepository<Agenda, Long> {
	
	
}
