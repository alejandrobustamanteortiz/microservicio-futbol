package com.example.microfutbolprod.interfaces;

import com.example.microfutbolprod.dto.JugadorDTO;

public interface IJugadorService {

	public JugadorDTO getJugadorById(int idJugador);
	
	public void addJugador(JugadorDTO jugadorDto);
	
}
