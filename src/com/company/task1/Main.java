package com.company.task1;

public class Main {
    public static void main(String[] args) throws Exception {

        ThreadGroup mainGroup = new ThreadGroup("main group");

        System.out.println("Создаю потоки...");

        for (int i = 1; i < 5; i++) {
            MyThread myThread = new MyThread(mainGroup, Thread.currentThread());
            myThread.setName("Я поток " + i);
            myThread.start();
        }


//        MyThread threadOne;
//        threadOne = new MyThread(mainGroup, Thread.currentThread());
//        threadOne.setName("Я поток 1.");
//        MyThread threadTwo = new MyThread(mainGroup, Thread.currentThread());
//        threadTwo.setName("Я поток 2.");
//        MyThread threadThree = new MyThread(mainGroup, Thread.currentThread());
//        threadThree.setName("Я поток 3.");
//        MyThread threadFour = new MyThread(mainGroup, Thread.currentThread());
//        threadFour.setName("Я поток 4.");



//        threadOne.start();
//        threadTwo.start();
//        threadThree.start();
//        threadFour.start();

        Thread.sleep(10000);
        System.out.println("Завершаю все потоки.");
        mainGroup.interrupt();
    }
}