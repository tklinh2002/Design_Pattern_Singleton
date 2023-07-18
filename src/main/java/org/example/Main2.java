package org.example;

public class Main2 {
    public static void main(String[] args) {
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
