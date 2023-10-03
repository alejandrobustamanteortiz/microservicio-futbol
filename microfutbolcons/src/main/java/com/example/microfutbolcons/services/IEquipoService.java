package com.example.microfutbolcons.services;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.microfutbolcons.util.Equipo;
import com.example.microfutbolcons.util.Jugador;

@FeignClient("microfutbolprod/api/futbol")
public interface IEquipoService {

	@GetMapping
	public List<Equipo> getEquipos();
	
	@GetMapping("/{idEquipo}")
	public List<Jugador> getJugadoresByEquipoId(@PathVariable("idEquipo") int equipoId);
	
	@PostMapping("/jugador")
	public void addJugadorById(@RequestBody Jugador jugador);
}
