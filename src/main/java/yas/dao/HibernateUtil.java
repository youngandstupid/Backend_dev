package main.java.yas.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * Created by Salman on 11/10/2015.
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory;

                static {
                try {
                        // Create the SessionFactory from standard (hibernate.cfg.xml)
                        // config file.
                        sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
                    } catch (Throwable ex) {
                        // Log the exception.
                        System.err.println("Initial SessionFactory creation failed." + ex);
                        throw new ExceptionInInitializerError(ex);
                    }
            }

                public static SessionFactory getSessionFactory() {
                return sessionFactory;
            }

}
