package com.chris.mybais.po;

/**
 * Created by Chris on 2017/11/21.
 */

public class Items {
    private String id;
    private String name;
    private String descrip;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    @Override
    public String toString() {
        return "Items{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", descrip='" + descrip + '\'' +
                '}';
    }
}
