package com.example.circuitBreaker.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.circuitBreaker.util.Equipo;

@FeignClient("microfutbolprod/api/equipos")
public interface IEquipoService {

	@GetMapping
	public List<Equipo> getEquipos();
}
