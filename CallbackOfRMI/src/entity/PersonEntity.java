package entity;

import java.io.Serializable;
/*
  该Bean用于在客户端与服务端之间传输数据。需要实现Serializable接口*/

public class PersonEntity implements Serializable{

    private static final long serialVersionUID = -6086743965334139076L;
    private String name;
    private int age;

    public PersonEntity(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}