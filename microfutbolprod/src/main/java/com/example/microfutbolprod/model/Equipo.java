package com.example.microfutbolprod.model;

import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="equipos")
public class Equipo {

	@Id
	private int id_equipo;
	private String nombre;
	@OneToMany(cascade=CascadeType.ALL)
	//Lazyload
	@JoinColumn(name="id_equipo",referencedColumnName ="id_equipo" )
	private List<Jugador> jugadores;
	
	public Equipo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Equipo(int id_equipo, String nombre) {
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
	
	public List<Jugador> getJugadores() {
		return jugadores;
	}
	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	@Override
	public String toString() {
		return "Equipo [id_equipo=" + id_equipo + ", nombre=" + nombre + "]";
	}
	
	
}
