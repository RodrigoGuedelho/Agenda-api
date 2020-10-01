package br.com.guedelho.Agenda.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import br.com.guedelho.Agenda.models.Agenda;
import br.com.guedelho.Agenda.repository.AgendaRepository;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin(origins = "*")
public class AgendaController {
	
	@Autowired
	private AgendaRepository repository;
	
	@GetMapping("/agendas")
	public List<Agenda> findAll() {
		return repository.findAll();
	}
	
	@GetMapping("/agendas/{id}")
	public Optional<Agenda> find(@PathVariable(value = "id") Long id) {
		return repository.findById(id);
	}
	
	@PostMapping("agenda")
	public Agenda salvar(@RequestBody Agenda agenda) {
		return repository.save(agenda);
	}
	
	@PutMapping("agenda")
	public Agenda editar(@RequestBody Agenda agenda) {
		return repository.save(agenda);
	}
	
	@DeleteMapping("agenda")
	public void delete(@RequestBody Agenda agenda) {
		repository.delete(agenda);
	}

}
