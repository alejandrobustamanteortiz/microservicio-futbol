package com.example.circuitBreaker.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

	private String nif;

	private String nombre;

	private String direccion;

	private int telefono;

	private double facturacion;
}
