package com.ayvytr.test.proxy;

import com.ayvytr.logger.L;

public class Student implements Person{

    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void wakeup() {
        L.e("学生", name, "醒来");
    }

    @Override
    public void sleep() {
        L.e("学生", name, "睡了");
    }
}