package com.tom.student;

public class GraduatedStudent extends Student {
    int thesis;
    public GraduatedStudent(String id, String name,
                           int english, int math,
                           int thesis) {
        super(id, name, english, math);
        this.thesis = thesis;
    }

    @Override
    public void mail() {

    }
}
