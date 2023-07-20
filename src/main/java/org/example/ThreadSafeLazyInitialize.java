package org.example;

public class ThreadSafeLazyInitialize {
    private static volatile ThreadSafeLazyInitialize instance;

    private ThreadSafeLazyInitialize() {
    }

    public static synchronized ThreadSafeLazyInitialize getInstance() {
        if (instance == null) {
            instance = new ThreadSafeLazyInitialize();
        }
        return instance;
    }
}
