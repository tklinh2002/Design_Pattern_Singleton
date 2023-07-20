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
        int num = 10;
        Thread[] threads = new Thread[num];
        for (int i = 0; i < num; i++) {
            threads[i] = new Thread(runnable);
        }
        for (Thread thread: threads) {
            thread.start();
        }

//        Thread thread1 = new Thread(runnable);
//        Thread thread2 = new Thread(runnable);
//        Thread thread3 = new Thread(runnable2,"t3");
//        Thread thread4 = new Thread(runnable2, "t4");
//        Thread thread5 = new Thread(runnable3,"t5");
//        Thread thread6 = new Thread(runnable3,"t6");
//        thread3.start();
//        thread1.start();
//        thread2.start();
//        thread4.start();
//        thread5.start();
//        thread6.start();
    }
}
