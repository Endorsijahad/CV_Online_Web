/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import daos.GeneralDAO;
import daos.InterfaceDAO;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.SessionFactory;

/**
 *
 * @author Nande
 */
public class GeneralController<T> implements InterfaceController<T>{
    private SessionFactory sessionFactory;
    InterfaceDAO iDAO;

    public GeneralController(SessionFactory sessionFactory, Class type) {
        this.sessionFactory = sessionFactory;
        iDAO = new GeneralDAO(sessionFactory, type);
    }
    
//    public List<Aneh> getAll(){
//        return getAnehs(iDAO.getAll());
//    }
//    
//    private List<Aneh> getAnehs(List<Object> anehs){
//        List<Aneh> datas = new ArrayList<>();
//        anehs.stream().map((data) -> (Aneh) data).forEachOrdered((aneh) -> {
//            datas.add(aneh);
//        });
//        return datas;
//    }
    @Override
    public List<T> getAll(){
        return this.castToT(iDAO.getAll());
    }
    @Override
    public boolean saveOrUpdate(T t){
        return iDAO.saveOrUpdate(t);
    }
    @Override
    public boolean delete(T t){
        return iDAO.delete(t);
    }
    @Override
    public List<T> search(String category, String key){
        return this.castToT(iDAO.search(category, key));
    }
    private List<T> castToT(List<Object> allDatas){
        List<T> datas =  new ArrayList<>();
        allDatas.stream().map((allData) -> (T) allData).forEachOrdered((t) -> {
            datas.add(t);
        });
        return datas;
    }

    @Override
    public T getById(Object id) {
        return (T) iDAO.getById(id);
    }
}
