package com.example.viatikapp.servicios;

import java.util.List;

public interface servicioBase<E> {

    public List<E> buscarTodos() throws Exception;
    public E buscarPorId(Integer id) throws  Exception;
    public E registrar(E entidad) throws Exception;
    public E actualizar(Integer id, E entidad);

}
