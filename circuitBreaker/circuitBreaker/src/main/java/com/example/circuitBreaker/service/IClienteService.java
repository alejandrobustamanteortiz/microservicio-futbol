package com.example.circuitBreaker.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.circuitBreaker.util.Cliente;

@FeignClient("microproductor/api/clientes")
public interface IClienteService {

	@GetMapping
	public List<Cliente> get_clientes();
}
