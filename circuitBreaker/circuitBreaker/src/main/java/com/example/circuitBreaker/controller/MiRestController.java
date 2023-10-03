package com.example.circuitBreaker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.circuitBreaker.service.IClienteService;
import com.example.circuitBreaker.service.IEquipoService;
import com.example.circuitBreaker.util.Cliente;
import com.example.circuitBreaker.util.Equipo;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/api/circuitBreaker")
public class MiRestController {

	@Autowired
	IClienteService clienteService;

	@Autowired
	IEquipoService equipoService;

	@CircuitBreaker(name = "clientes", fallbackMethod = "fallbackMethodClientes")
	@GetMapping("/list_clientes")
	public ResponseEntity<List<Cliente>> getClientes() {

		return ResponseEntity.ok(clienteService.get_clientes());

	}

	private ResponseEntity<List<Cliente>> fallbackMethodClientes(RuntimeException e) {
		return new ResponseEntity("no hay clientes en este momento en micro productor", HttpStatus.OK);
	}

	@CircuitBreaker(name = "equipos", fallbackMethod = "fallbackMethodEquipos")
	@GetMapping("/list_equipos")
	public ResponseEntity<List<Equipo>> getEquipos() {

		return ResponseEntity.ok(equipoService.getEquipos());

	}

	private ResponseEntity<List<Equipo>> fallbackMethodEquipos(RuntimeException e) {
		return new ResponseEntity("no hay equipos en este momento en microfutbolprod", HttpStatus.OK);
	}

}
