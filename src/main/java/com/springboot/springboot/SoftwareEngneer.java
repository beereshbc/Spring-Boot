package com.springboot.springboot;

import java.util.Objects;

public class SoftwareEngneer {

    private Integer id;
    private String name;
    private  String TechStack;

    public SoftwareEngneer(Integer id, String name, String techStack) {
        this.id = id;
        this.name = name;
        TechStack = techStack;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTechStack() {
        return TechStack;
    }

    public void setTechStack(String techStack) {
        TechStack = techStack;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SoftwareEngneer that = (SoftwareEngneer) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(TechStack, that.TechStack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, TechStack);
    }
}
