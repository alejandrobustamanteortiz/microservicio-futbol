package com.example.microfutbolprod.interfaces;

import java.util.List;

import com.example.microfutbolprod.dto.EquipoDTO;
import com.example.microfutbolprod.dto.JugadorDTO;

public interface IEquipoService {

	public List<EquipoDTO> getEquipos();
	
	public List<JugadorDTO> getJugadoresByIdEquipo(int id_equipo);
	
	public EquipoDTO getEquipoById(int idEquipo);
}
