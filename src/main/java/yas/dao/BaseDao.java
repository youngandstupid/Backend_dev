package main.java.yas.dao;


import main.java.yas.entity.Housing;
import main.java.yas.entity.Media;
import main.java.yas.entity.User;
import main.java.yas.to.UserTO;

import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.*;
import java.util.List;

/**
 * Created by Salman on 11/8/2015.
 */
@Stateless
public class BaseDao {
    @PersistenceContext(unitName="MySqlDS")
    private EntityManager entityManager;

    public void save(UserTO user) {
        User userEntity = new User(user);
        entityManager.persist(userEntity);
    }

    public void saveMedia(Media media) {
        /*String query = "insert into Media (media_location , media_location_url , date) values('sdsdfsdfs' , 0 ,  str_to_date('2015,10,12' , '%Y,%m,%d'))";
        Query dbquery = entityManager.createNativeQuery(query);
        dbquery.executeUpdate();*/
        entityManager.persist(media);
    }

    public void saveHousing(Housing housing){
        entityManager.persist(housing);
    }

    public List<User> readUsers() {
        List<User> users =  entityManager.createQuery("select u from User u").getResultList();
        return  users;
    }

    /*private static final String PERSISTENCE_UNIT_NAME = "MySqlDS";
    private EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

    public EntityManager getEntityManager() {
        return factory.createEntityManager();
    }*/

    /*@PersistenceUnit
    private EntityManagerFactory emf;

    @Produces
    @RequestScoped
    public EntityManager produceEntityManager() {
        return emf.createEntityManager();
    }

    public void destroyEntityManager(@Disposes EntityManager em) {
        if (em.isOpen()) {
            em.close();
        }
    }*/
}
