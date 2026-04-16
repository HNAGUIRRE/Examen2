package co.edu.poli.examen2_Aguirre.servicios;

import java.util.List;

public interface CRUD<T> {

    String create(T obj);

    T readOne(int id);

    List<T> readAll();
}
