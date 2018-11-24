package com.kobuta.dubbo.api.pojo;

import java.io.Serializable;

public class User implements Serializable {

    int id = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
