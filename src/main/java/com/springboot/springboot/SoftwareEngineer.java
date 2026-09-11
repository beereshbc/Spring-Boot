package com.springboot.springboot;

import java.util.Objects;

public class SoftwareEngineer {

    private Integer id;
    private String name;
    private  String TechStack;

    public SoftwareEngineer(Integer id, String name, String techStack) {
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
        SoftwareEngineer that = (SoftwareEngineer) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(TechStack, that.TechStack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, TechStack);
    }
}
