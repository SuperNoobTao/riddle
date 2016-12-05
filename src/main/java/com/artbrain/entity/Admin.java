package com.artbrain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Administrator on 2016/12/4 0004.
 */
@Entity
@Table(name = "admin")
public class Admin {


    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "admin")
    private String admin;
    @Column(name = "pwd")
    private String pwd;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }




}
