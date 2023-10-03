package com.example.microfutbolprod.dto;


public class JugadorDTO {

	private int id_jugador;
	private String nombre;
	private EquipoDTO equipo;
	private String posicion;
	private int id_equipo;
	
	public JugadorDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JugadorDTO(int id_jugador, String nombre, EquipoDTO equipo, String posicion) {
		super();
		this.id_jugador = id_jugador;
		this.nombre = nombre;
		this.equipo = equipo;
		this.posicion = posicion;
	}
	
	
	
	public JugadorDTO(int id_jugador, String nombre, String posicion, int id_equipo) {
		super();
		this.id_jugador = id_jugador;
		this.nombre = nombre;
		this.posicion = posicion;
		this.id_equipo = id_equipo;
	}
	public JugadorDTO(int id_jugador, String nombre, EquipoDTO equipo, String posicion, int id_equipo) {
		super();
		this.id_jugador = id_jugador;
		this.nombre = nombre;
		this.equipo = equipo;
		this.posicion = posicion;
		this.id_equipo = id_equipo;
	}
	public JugadorDTO(int id_jugador, String nombre, String posicion) {
		super();
		this.id_jugador = id_jugador;
		this.nombre = nombre;
		this.posicion = posicion;
	}
	
	
	
	public int getId_equipo() {
		return id_equipo;
	}
	public void setId_equipo(int id_equipo) {
		this.id_equipo = id_equipo;
	}
	public int getId_jugador() {
		return id_jugador;
	}
	public void setId_jugador(int id_jugador) {
		this.id_jugador = id_jugador;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public EquipoDTO getEquipo() {
		return equipo;
	}
	public void setEquipo(EquipoDTO equipo) {
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
		return "JugadorDTO [id_jugador=" + id_jugador + ", nombre=" + nombre + ", posicion=" + posicion + ", id_equipo="
				+ id_equipo + "]";
	}
	
	
	
}
