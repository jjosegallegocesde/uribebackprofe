package com.example.viatikapp.repositorios;

import com.example.viatikapp.entidades.Viaje;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ViajeRepositorio extends JpaRepository<Viaje,Integer> {
}
