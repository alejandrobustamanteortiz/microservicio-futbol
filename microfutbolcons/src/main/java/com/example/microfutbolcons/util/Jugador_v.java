package com.example.microfutbolcons.util;

import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;

public class Jugador_v {
	
	private String id_jugador;
	private String nombre;
	private String equipo;
	private String posicion;
	
	public Jugador_v(String id_jugador, String nombre, String equipo, String posicion) {
		super();
		this.id_jugador = id_jugador;
		this.nombre = nombre;
		this.equipo = equipo;
		this.posicion = posicion;
	}
	public Jugador_v() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId_jugador() {
		return id_jugador;
	}
	public void setId_jugador(String id_jugador) {
		this.id_jugador = id_jugador;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEquipo() {
		return equipo;
	}
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	@Override
	public String toString() {
		return "Jugador_v [id_jugador=" + id_jugador + ", nombre=" + nombre + ", equipo=" + equipo + ", posicion="
				+ posicion + "]";
	}
	
public boolean validate(Errors errors) {
		
		if (!StringUtils.hasText(id_jugador)) {
			errors.rejectValue("id_jugador", "badformat", "rellene el id_jugador");
		}
		if (!StringUtils.hasText(nombre)) {
			errors.rejectValue("nombre", "badformat", "rellene el nombre");
		}
		if (!StringUtils.hasText(equipo)) {
			errors.rejectValue("equipo", "badformat", "rellene el equipo");
		}
		if (!StringUtils.hasText(posicion)) {
			errors.rejectValue("posicion", "badformat", "rellene la posicion");
		}

		return errors.hasErrors();
	}
	
	
}
