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

        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                ThreadSafeLazyInitialize singleton = ThreadSafeLazyInitialize.getInstance();
                System.out.println("Instance "+ Thread.currentThread().getName()+" " + singleton);
            }
        };

        Runnable runnable3 = new Runnable() {
            @Override
            public void run() {
                DoubleCheckLockingSingleton singleton = DoubleCheckLockingSingleton.getInstance();
                System.out.println("Instance "+ Thread.currentThread().getName()+" " + singleton);
            }
        };

        int num = 20;
        double start = System.currentTimeMillis();
        Thread[] threads = new Thread[num];
        for (int i = 0; i < num; i++) {
            threads[i] = new Thread(runnable);
        }
        for (Thread thread: threads) {
            thread.start();
        }
        double end = System.currentTimeMillis();
        System.out.println("time: "+(end-start));
    }
}
