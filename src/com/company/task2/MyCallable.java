package com.company.task2;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

    public MyCallable() {
    }

    @Override
    public String call() throws Exception {
        ThreadGroup mainGroup = new ThreadGroup("main group");

        MyThread threadOne = new MyThread(mainGroup, Thread.currentThread());
        threadOne.setName("Я поток 1.");
        MyThread threadTwo = new MyThread(mainGroup, Thread.currentThread());
        threadTwo.setName("Я поток 2.");
        MyThread threadThree = new MyThread(mainGroup, Thread.currentThread());
        threadThree.setName("Я поток 3.");
        MyThread threadFour = new MyThread(mainGroup, Thread.currentThread());
        threadFour.setName("Я поток 4.");

        threadOne.start();
        threadTwo.start();
        threadThree.start();
        threadFour.start();

        System.out.println();
        return "Result";
    }
}
