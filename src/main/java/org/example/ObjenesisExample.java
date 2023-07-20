package org.example;

import org.objenesis.Objenesis;
import org.objenesis.ObjenesisStd;

public class ObjenesisExample {

    private String message;

    private ObjenesisExample() {
        // Constructor is private
        this.message = "Hello from ObjenesisExample!";
    }
    public String getMessage() {
        return this.message;
    }

}
