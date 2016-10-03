package com.anup.model;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.validation.constraints.Min;

/**
 * Created by Anup on 30-07-2016.
 */

@Entity
@Table(name="Appt")
public class Appt {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int appt_nbr;

    private int po_nbr;
    private String appt_status;
    private String door_id;
    private String appt_type;

    public int getAppt_nbr() {
        return appt_nbr;
    }

    public void setAppt_nbr(int appt_nbr) {
        this.appt_nbr = appt_nbr;
    }

    public int getPo_nbr() {
        return po_nbr;
    }

    public void setPo_nbr(int po_nbr) {
        this.po_nbr = po_nbr;
    }

    public String getAppt_status() {
        return appt_status;
    }

    public void setAppt_status(String appt_status) {
        this.appt_status = appt_status;
    }

    public String getDoor_id() {
        return door_id;
    }

    public void setDoor_id(String door_id) {
        this.door_id = door_id;
    }

    public String getAppt_type() {
        return appt_type;
    }

    public void setAppt_type(String appt_type) {
        this.appt_type = appt_type;
    }
}
