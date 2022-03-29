package com.gfg;


import java.util.Objects;

public class UserInfo {

    int age;
    String name;
    long height;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserInfo userInfo = (UserInfo) o;
        return age == userInfo.age && height == userInfo.height && name.equals(userInfo.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, height);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
