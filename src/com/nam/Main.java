package com.nam;

//import com.nam.Box42;

public class Main {

    public static void main(String[] args) throws java.io.IOException{
	// write your code here
        System.out.println("Hello World Motherfucka");

        Box42 mybox = new Box42();

        System.out.println("Box = " + mybox.toString());

        System.out.println("Box w= " + mybox.weight);

        mybox.weight = 100500.42;

        System.out.println("Box w= " + mybox.weight);

        mybox = null;

        mybox = new Box42();


    }
}
