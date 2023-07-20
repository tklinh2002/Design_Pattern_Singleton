package org.example;

public class LazyInitializationAntiReflection {
    private static LazyInitializationAntiReflection instance;

    public LazyInitializationAntiReflection() {
        if (instance != null) {
            throw new IllegalArgumentException("object can't be create using reflection");
        }
    }

    public static LazyInitializationAntiReflection getInstance() {
        if (instance == null) {
            instance = new LazyInitializationAntiReflection();
        }
        return instance;
    }
}
