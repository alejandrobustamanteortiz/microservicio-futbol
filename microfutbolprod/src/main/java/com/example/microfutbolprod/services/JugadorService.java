package com.example.microfutbolprod.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.microfutbolprod.dto.EquipoDTO;
import com.example.microfutbolprod.dto.JugadorDTO;
import com.example.microfutbolprod.interfaces.IJugadorService;
import com.example.microfutbolprod.model.Equipo;
import com.example.microfutbolprod.model.Jugador;
import com.example.microfutbolprod.repository.EquipoRepository;
import com.example.microfutbolprod.repository.JugadorRepository;

@Service
public class JugadorService implements IJugadorService {
	
	@Autowired
	JugadorRepository jugadorRepository;
	@Autowired
	EquipoRepository equipoRepository;

	@Override
	public JugadorDTO getJugadorById(int idJugador) {
		Jugador jugador = jugadorRepository.findById(idJugador).orElse(null);
		JugadorDTO jugadorDto = null;
		if(jugador != null) {
			EquipoDTO equipoDto = new EquipoDTO(jugador.getEquipo().getId_equipo(), jugador.getEquipo().getNombre());
			jugadorDto = new JugadorDTO(jugador.getId_jugador(),jugador.getNombre(),equipoDto,jugador.getPosicion(), jugador.getId_equipo());
		}
		return jugadorDto;
	}

	@Override
	public void addJugador(JugadorDTO jugadorDto) {
	  //  Jugador jugador = jugadorRepository.findById(jugadorDto.getId_jugador()).orElse(null);

	   
	       
		System.out.println(jugadorDto);
	     
        System.out.println("DENTRO DEL METODO");
        Jugador jugador = new Jugador(jugadorDto.getId_jugador(), jugadorDto.getNombre(), jugadorDto.getPosicion(), jugadorDto.getId_equipo());
        System.out.println(jugador);
        jugadorRepository.save(jugador);
	        
	    
	}


}
