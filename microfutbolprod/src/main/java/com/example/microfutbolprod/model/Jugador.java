package com.example.microfutbolprod.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="jugadores")
public class Jugador {

	@Id
	private int id_jugador;
	private String nombre;
	private String posicion;
	private int id_equipo;
	@ManyToOne()
	@JoinColumn(name = "id_equipo", referencedColumnName = "id_equipo", insertable=false, updatable=false)
	private Equipo equipo;
	
	
	public int getId_equipo() {
		return id_equipo;
	}

	public void setId_equipo(int id_equipo) {
		this.id_equipo = id_equipo;
	}

	public Jugador() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Jugador(int id_jugador, String nombre, String posicion) {
		super();
		this.id_jugador = id_jugador;
		this.nombre = nombre;
		this.posicion = posicion;
	}


	
	

	public Jugador(int id_jugador, String nombre, String posicion, int id_equipo) {
		super();
		this.id_jugador = id_jugador;
		this.nombre = nombre;
		this.posicion = posicion;
		this.id_equipo = id_equipo;
	}

	public Jugador(int id_jugador, String nombre, Equipo equipo, String posicion, int id_equipo) {
		super();
		this.id_jugador = id_jugador;
		this.nombre = nombre;
		this.equipo = equipo;
		this.posicion = posicion;
		this.id_equipo = id_equipo;
	}

	public Jugador(int id_jugador, String nombre, Equipo equipo, String posicion) {
		super();
		this.id_jugador = id_jugador;
		this.nombre = nombre;
		this.equipo = equipo;
		this.posicion = posicion;
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
	
	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
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
		return "Jugador [id_jugador=" + id_jugador + ", nombre=" + nombre + ", posicion=" + posicion + ", id_equipo="
				+ id_equipo + "]";
	}
	
	
	
	
}
