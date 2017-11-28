package com.chris.mybais.po;

import java.io.Serializable;

/**
 * Created by Chris on 2017/11/21.
 */

public class Items implements Serializable{
    private Long id;
    private String name;
    private String descrip;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

}
