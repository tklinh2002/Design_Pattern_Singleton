package org.example;

public class Main {
    public static void main(String[] args) {
        // Basic
        BasicClass basicClass = new BasicClass();
        System.out.println("basic 1: "+basicClass.hashCode());

        BasicClass basicClass2 = new BasicClass();
        System.out.println("basic 2: "+basicClass2.hashCode());

        // Eager Initialization
        EagerInitialization eagerInitialization = EagerInitialization.getInstance();
        System.out.println("eagerInitialization 1 :"+eagerInitialization.hashCode());

        EagerInitialization eagerInitialization2 = EagerInitialization.getInstance();
        System.out.println("eagerInitialization 2 :"+eagerInitialization2.hashCode());

        // Static Block Singleton
        StaticBlockSingleton staticBlockSingleton = StaticBlockSingleton.getInstance();
        System.out.println("staticBlockSingleton 1 :"+staticBlockSingleton.hashCode());

        StaticBlockSingleton staticBlockSingleton2 = StaticBlockSingleton.getInstance();
        System.out.println("staticBlockSingleton 2 :"+staticBlockSingleton2.hashCode());


    }
}