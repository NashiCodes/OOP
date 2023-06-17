package org.example.persistence;

import java.util.List;

public interface Persistence<T> {

    String DIRECTORY = "data";
    void save(List<T> itens);
    List<T> findAll();

}
