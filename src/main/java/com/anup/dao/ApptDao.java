package com.anup.dao;

import com.anup.model.Appt;

import java.util.List;

/**
 * Created by Anup-PC on 02-08-2016.
 */
public interface ApptDao {

    void addAppt(Appt appt);

    void editAppt(Appt appt);

    Appt getApptById(int id);

    List<Appt> getAllAppt();

    void deleteAppt(int id);


}
