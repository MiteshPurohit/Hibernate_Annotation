/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.java;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.hibernate.annotations.Index;
import org.hibernate.annotations.Type;

/**
 *
 * @author Hardik
 */
@Entity
@Table(name = "tbl_user")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "u_id")
    private int uid;
    @Column(name = "u_name", length = 50)
    private String unm;
    @Column(name = "addr", length = 50)
    private String address;
    @Column(name = "mno")
    private long phno;
    @Column(name = "birthdate")
    @Type(type = "date")
    private Date dob;
    @Transient
    private int a;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUnm() {
        return unm;
    }

    public void setUnm(String unm) {
        this.unm = unm;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhno() {
        return phno;
    }

    public void setPhno(long phno) {
        this.phno = phno;
    }

 
    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

}
