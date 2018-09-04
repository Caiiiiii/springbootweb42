package com.cyq.springbootweb42.Object;

public class DemoObj {
    private Long id;
    private String Name;

    public DemoObj() {
    }

    public DemoObj(Long id, String name) {
        this.id = id;
        Name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
