/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;

/**
 *
 * @author Nande
 * @param <T>
 */
public interface InterfaceController<T> {
    
    public List<T> getAll();
    public List<T> search(String category, String key);
    public T getById(Object id);
    public boolean saveOrUpdate(T t);
    public boolean delete(T t);
}
