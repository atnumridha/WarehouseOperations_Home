package com.anup.dao.impl;

import com.anup.dao.ApptDao;
import com.anup.model.Appt;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
@EnableTransactionManagement
public class ApptDaoImpl implements ApptDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void addAppt(Appt appt) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(appt);
        session.flush();
    }

    public void editAppt(Appt appt) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(appt);
        session.flush();
    }


    public Appt getApptById (int id) {
        Session session = sessionFactory.getCurrentSession();
        Appt appt = (Appt) session.get(Appt.class,id);
        return appt;
    }

    public List<Appt> getAllAppt() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Appt");
        List<Appt> appt = query.list();
        session.flush();
        return appt;
    }

    public void deleteAppt(int id) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(getApptById(id));
        session.flush();
    }
}