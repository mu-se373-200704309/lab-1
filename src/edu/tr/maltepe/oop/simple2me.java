package edu.tr.maltepe.oop;

public class simple2me {
    public  static void main (String[] args) {
        Professor p1,p2;
        p1= new Professor("ensar gül");
        p1.teaches();
        p2 = new Professor("raif");

        Student s1,s2;
        s1 = new Student("tekdemir");
        s1.learning();
        s2 = new Student("özgen");
    }
}