package com.taione.pojos;

/**
 * Created by td on 2017/4/14.
 */
public class UserEntity {
    private String name;
    private String pawd;
    private Long id;

    @Override
    public String toString() {
        return "UserEntity{" +
                "name='" + name + '\'' +
                ", pawd='" + pawd + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPawd() {
        return pawd;
    }

    public void setPawd(String pawd) {
        this.pawd = pawd;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
