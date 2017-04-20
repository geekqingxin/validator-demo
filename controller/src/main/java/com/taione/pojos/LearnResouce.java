package com.taione.pojos;

/**
 * Created by td on 2017/4/14.
 */
public class LearnResouce {
    private String name;
    private String souce;
    private String url;

    public LearnResouce(String name, String souce, String url) {
        this.name = name;
        this.souce = souce;
        this.url = url;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSouce() {
        return souce;
    }

    public void setSouce(String souce) {
        this.souce = souce;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
