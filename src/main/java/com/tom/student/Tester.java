package com.tom.student;

public class Tester {
    public static void main(String[] args) {
        System.out.println("id" + "\t" + "name" + "\t" + "english" + "\t" + "math" + "\t" + "theis");
        Student stud = new Student("1234", "poop",
                80, 89);
        stud.print();
        GraduatedStudent gstu = new GraduatedStudent("5678", "peep",
                50, 60, 70);

        gstu.print();


    }
}
