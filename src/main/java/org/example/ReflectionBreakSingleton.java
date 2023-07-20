package org.example;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionBreakSingleton {
    public static void main(String[] args)
            throws InstantiationException, IllegalAccessException, InvocationTargetException {

        EagerInitialization instanceOne = EagerInitialization.getInstance();
        EagerInitialization instanceTwo = null;

        Constructor<?>[] constructors = EagerInitialization.class.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            constructor.setAccessible(true);
            instanceTwo = (EagerInitialization) constructor.newInstance();
        }

//        System.out.println(instanceOne);
//        System.out.println(instanceTwo);

        LazyInitializationAntiReflection lazyInitializationAntiReflection = LazyInitializationAntiReflection.getInstance();
        LazyInitializationAntiReflection lazyInitializationAntiReflection1 = null;

        Constructor<?>[] constructors1 = LazyInitializationAntiReflection.class.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors1) {
            constructor.setAccessible(true);
            lazyInitializationAntiReflection1 = (LazyInitializationAntiReflection) constructor.newInstance();
        }

        System.out.println(lazyInitializationAntiReflection);
        System.out.println(lazyInitializationAntiReflection1);
    }
}
