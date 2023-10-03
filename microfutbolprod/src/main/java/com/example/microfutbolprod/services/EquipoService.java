package com.example.microfutbolprod.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.microfutbolprod.dto.EquipoDTO;
import com.example.microfutbolprod.dto.JugadorDTO;
import com.example.microfutbolprod.interfaces.IEquipoService;
import com.example.microfutbolprod.model.Equipo;
import com.example.microfutbolprod.model.Jugador;
import com.example.microfutbolprod.repository.EquipoRepository;

@Service
public class EquipoService implements IEquipoService {

	@Autowired
	EquipoRepository equipoRepository;
	
	@Override
	public List<EquipoDTO> getEquipos() {
		List<Equipo> equipos = equipoRepository.findAll();
		List<EquipoDTO> equiposDto = new ArrayList<>();
		for (Equipo equipo : equipos) {
			EquipoDTO equipoDto = new EquipoDTO(equipo.getId_equipo(),equipo.getNombre());
			equiposDto.add(equipoDto);
		}
		return equiposDto;
	}

	@Override
	public List<JugadorDTO> getJugadoresByIdEquipo(int id_equipo) {
		Equipo equipo = equipoRepository.findById(id_equipo).orElse(null);
		if(equipo != null) {
			EquipoDTO equipoDto = new EquipoDTO(equipo.getId_equipo(), equipo.getNombre());
			List<JugadorDTO> jugadoresDto = new ArrayList<>();
			List<Jugador> jugadores = equipo.getJugadores();
			for (Jugador jugador : jugadores) {
				JugadorDTO jugadorDto = new JugadorDTO(jugador.getId_jugador(),jugador.getNombre(),equipoDto,jugador.getPosicion(), jugador.getId_equipo());
				jugadoresDto.add(jugadorDto);
			}
			return jugadoresDto;
			
		}
		return null;
	}

	@Override
	public EquipoDTO getEquipoById(int idEquipo) {
		Equipo equipo = equipoRepository.findById(idEquipo).orElse(null);
		EquipoDTO equipoDto = null;
		if(equipo != null) {
			equipoDto = new EquipoDTO(equipo.getId_equipo(), equipo.getNombre());
		}
		return equipoDto;
	}

}
