package com.example.microfutbolprod.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microfutbolprod.dto.EquipoDTO;
import com.example.microfutbolprod.dto.JugadorDTO;
import com.example.microfutbolprod.interfaces.IEquipoService;
import com.example.microfutbolprod.interfaces.IJugadorService;


@RestController
@RequestMapping("api/futbol")
public class MiControladorRest {

	@Autowired
	IEquipoService equipoService;
	@Autowired
	IJugadorService jugadorService;
	
	@GetMapping
	public ResponseEntity<List<EquipoDTO>> getEquipos() {
		if (equipoService.getEquipos() == null || equipoService.getEquipos().size() == 0) {
			return ResponseEntity.noContent().build();
		}

		return ResponseEntity.ok(equipoService.getEquipos());

		
	}
	
	@GetMapping("/{idEquipo}")
	public ResponseEntity<List<JugadorDTO>> getJugadoresByEquipoId(@PathVariable("idEquipo") int equipoId) {
		if (equipoService.getJugadoresByIdEquipo(equipoId) == null || equipoService.getJugadoresByIdEquipo(equipoId).size() == 0) {
			return ResponseEntity.noContent().build();
		}

		return ResponseEntity.ok(equipoService.getJugadoresByIdEquipo(equipoId));
		
	}
	
	@PostMapping("/jugador")
	public ResponseEntity<Integer> addJugadorById(@RequestBody JugadorDTO jugadorDTO) {
		
		if (jugadorService.getJugadorById(jugadorDTO.getId_jugador()) != null) {
			return ResponseEntity.ok(1);
		}
		System.out.println("ANTES DE INSERTAR");
		jugadorService.addJugador(jugadorDTO);
		return ResponseEntity.ok(0);
		
	}
}
