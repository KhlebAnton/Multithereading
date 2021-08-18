package com.company.task2;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Callable<String> myCallable = new MyCallable();

        final ExecutorService threadPool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        final Future<String> task = threadPool.submit(myCallable);

        threadPool.shutdown();
        final String result = task.get();
        System.out.println(result);
    }
}
