package com.example.viatikapp.servicios;

import com.example.viatikapp.entidades.Empleado;
import com.example.viatikapp.repositorios.EmpleadoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ServicioEmpleado implements  servicioBase<Empleado>{

    @Autowired
    EmpleadoRepositorio empleadoRepositorio;

    @Override
    public List<Empleado> buscarTodos() throws Exception {
        try{
            List<Empleado> empleados=empleadoRepositorio.findAll();
            return empleados;

        }catch(Exception error){

            throw new Exception(error.getMessage());

        }
    }

    @Override
    public Empleado buscarPorId(Integer id) throws Exception {
        return null;
    }

    @Override
    public Empleado registrar(Empleado entidad) throws Exception {
        return null;
    }

    @Override
    public Empleado actualizar(Integer id, Empleado entidad) {
        return null;
    }
}
