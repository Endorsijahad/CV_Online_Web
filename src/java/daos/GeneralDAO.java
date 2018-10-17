/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Ignatius
 */
public class GeneralDAO implements InterfaceDAO {

    private final FunctionDAO gdao;
    private final Class type;
    EntityManager entityManager;
    EntityManagerFactory emf;
    Session session;
    SessionFactory sf;

    public GeneralDAO(SessionFactory sessionFactory, Class type) {
        this.gdao = new FunctionDAO(sessionFactory);
        this.type = type;
        sf = sessionFactory;
    }

    @Override
    public boolean saveOrUpdate(Object object) {
        return (boolean) gdao.execute(0, object, type, null, null);
    }

    @Override
    public boolean delete(Object object) {
        return (boolean) gdao.execute(1, object, type, null, null);
    }

    @Override
    public List<Object> getAll() {
        return (List<Object>) gdao.execute(6, null, type, null, null);
    }

    @Override
    public List<Object> search(String category, Object key) {
        return (List<Object>) gdao.execute(3, null, type, category, key);
    }

    @Override
    public Object getById(Object id) {
        return gdao.execute(2, null, type,"id" + type.getSimpleName(), id);
    }

    @Override
    public Object getLastId() {
        return gdao.execute(4, null, type, null, null);
    }

    @Override
    public Object getByName(Object name) {
        return gdao.execute(5, null, type, "name" + type.getSimpleName(), name);
    }
}
