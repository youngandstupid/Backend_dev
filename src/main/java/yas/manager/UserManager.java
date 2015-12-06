package main.java.yas.manager;

import main.java.yas.dao.BaseDao;
import main.java.yas.entity.Media;
import main.java.yas.entity.User;
import main.java.yas.entity.UserRole;
import main.java.yas.to.UserTO;

import javax.ejb.*;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import java.util.Date;
import java.util.List;

/**
 * Created by Salman on 11/8/2015.
 */
@Stateless
//@TransactionManagement(TransactionManagementType.BEAN)
public class UserManager {

    /*@PersistenceContext(unitName = "MySqlDS", type = PersistenceContextType.TRANSACTION)
    private EntityManager em;*/

    /*@Inject
    private EntityManager em;*/

    @EJB
    private BaseDao baseDao;

    public String createNewUser_test(String name) {

        /*BaseDao dao = new BaseDao();
        EntityManager em = dao.getEntityManager();*/
        //EntityManager em = dao.produceEntityManager();
        /*try {

            User user = new User();
            user.setFirstName(name);
            user.setLastName(name);
            user.setRole(UserRole.RegistredUser);
            user.setEmail("email@email.com");

            em.persist(user);

        }
        finally {
            em.flush();
            em.close();
        }*/

        /*UserTO user = new UserTO();
        user.setId(2);
        user.setFirstName(name);
        user.setLastName(name);
        user.setRole(UserRole.RegistredUser);
        user.setEmail("email@email.com");

        baseDao.save(user);*/

        Media media = new Media();
        media.setFromUrl(false);
        media.setDescription("adsddfsd");
        media.setMediaLocation("adaisan");
        media.setUploadDate(new Date());

        baseDao.saveMedia(media);

        return "OK";

    }

    public UserTO readUser_test() {
        /*BaseDao dao = new BaseDao();
        EntityManager em = dao.getEntityManager();*/

        //EntityManager em = dao.produceEntityManager();

        //List<User> users =  em.createQuery("select u from User u").getResultList();
        List<User> users = baseDao.readUsers();
        User onlyUser = users.get(0);
        UserTO to = onlyUser.buildTO();
        return to;
    }
}
