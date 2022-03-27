package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("inside main");
        new Candy();
        System.out.println("after creating candy");
        try {
            Class.forName("Gum");

        } catch (ClassNotFoundException e) {
            System.out.println("Could not find Gum");
        }
        System.out.println("after Class.forName Gum");
        new Cookie();
        System.out.println("after creating cookie");
    }
}
