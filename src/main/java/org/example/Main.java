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

        //Lazy Initialization
//        LazyInitialization lazyInitialization = LazyInitialization.getInstance();
//        System.out.println("lazyInitialization 1 :"+lazyInitialization.hashCode());
//
//        LazyInitialization lazyInitialization2 = LazyInitialization.getInstance();
//        System.out.println("lazyInitialization 2 :"+lazyInitialization2.hashCode());

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                LazyInitialization singleton = LazyInitialization.getInstance();
                System.out.println("Instance: " + singleton);
            }
        };

        // Tạo nhiều luồng để truy cập vào Singleton
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
    }
}