package com.nam;

public class Box42 {
    double weight;
    double height;
    double depth;

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Fuck you");
    }

}
