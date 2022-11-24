package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Mitarbeiter mitarbeiter = new Mitarbeiter("otto", "peter", "worker", 1990);

        output(mitarbeiter.getInfo("familyName") + " " + mitarbeiter.getInfo("firstName"));






    }






    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

