package com.artbrain.entity;

import javax.persistence.Entity;
import java.math.BigInteger;

/**
 * Created by Administrator on 2016/12/2 0002.
 */

public class Level {

    private String username;
    private BigInteger num;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public BigInteger getNum() {
        return num;
    }

    public void setNum(BigInteger num) {
        this.num = num;
    }
}
