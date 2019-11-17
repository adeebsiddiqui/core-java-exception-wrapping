package com.ad.app;

import com.ad.app.classes.ClassA;

public class Main {

    public static void main(String[] args) {
        try {
            new ClassA().methodA();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error message: " + e.getMessage());
        }

        System.out.println("This line always executes");
    }
}
