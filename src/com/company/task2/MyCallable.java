package com.company.task2;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

    public MyCallable() {
    }

    @Override
    public String call() {
        double random = Math.random() * 5;
        for (int i = 0; i < random; i++) {
            System.out.println("Сообщение" + i);
        }
        return "Количество сообщений: " + (int) random;
    }
}