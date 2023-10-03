package com.example.microfutbolprod.dto;

public class EquipoDTO {

	private int id_equipo;
	private String nombre;
	
	public EquipoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EquipoDTO(int id_equipo, String nombre) {
		super();
		this.id_equipo = id_equipo;
		this.nombre = nombre;
	}
	
	public int getId_equipo() {
		return id_equipo;
	}
	public void setId_equipo(int id_equipo) {
		this.id_equipo = id_equipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "EquipoDTO [id_equipo=" + id_equipo + ", nombre=" + nombre + "]";
	}
	
	
	
	
	
}
