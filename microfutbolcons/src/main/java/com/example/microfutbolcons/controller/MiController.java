package com.example.microfutbolcons.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.microfutbolcons.services.IEquipoService;
import com.example.microfutbolcons.util.Equipo;
import com.example.microfutbolcons.util.Jugador;
import com.example.microfutbolcons.util.Jugador_v;

@Controller
public class MiController {

	@Autowired
	IEquipoService equipoService;
	
	@GetMapping("/list_equipos")
	public String getEquipos(Model model) {
		List<Equipo> equipos = equipoService.getEquipos();
		model.addAttribute("equipos", equipos);
		return "list_equipos";
	}
	
	@GetMapping("/list_jugadores_by_equipo/{idEquipo}")
	public String getJugadoresByEquipoId(@PathVariable("idEquipo") int idEquipo, Model model) {
		List<Jugador> jugadores = equipoService.getJugadoresByEquipoId(idEquipo);
		model.addAttribute("jugadores", jugadores);
		return "list_jugadores";
	}
	
	@GetMapping("/alta_jugador")
	public String altaUser(Model model) {

		Jugador_v jugador_v = new Jugador_v();
		model.addAttribute("equipos", equipoService.getEquipos());
		model.addAttribute("jugador_v", jugador_v);
		return "alta_jugador";
	}

	@PostMapping("/add_jugador")
	public String addUser(Jugador_v jugador_v, Model model, BindingResult result) {
		jugador_v.validate(result);
		if (result.hasErrors()) {
			return "alta_jugador";
		}
		if (equipoService.getJugadoresByEquipoId(Integer.parseInt(jugador_v.getId_jugador())) != null) {
			model.addAttribute("mensaje", "Jugador existente");
			return "alta_jugador";
		}
		Jugador jugador = new Jugador(Integer.parseInt(jugador_v.getId_jugador()), jugador_v.getNombre(), jugador_v.getPosicion(),Integer.parseInt(jugador_v.getEquipo()));
		equipoService.addJugadorById(jugador);

		return "index";
	}
	
}
