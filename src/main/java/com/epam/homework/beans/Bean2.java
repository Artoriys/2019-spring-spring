package com.epam.homework.beans;

import org.springframework.stereotype.Component;

@Component
public class Bean2 {
    private int id;
    private String name;

    public Bean2(int id, String  name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
