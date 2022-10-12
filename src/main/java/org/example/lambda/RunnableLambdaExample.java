package org.example.lambda;

import com.sun.org.apache.xerces.internal.impl.xs.models.XSCMBinOp;

public class RunnableLambdaExample {

    //psvm
    public static void main(String[] args) {

        /**
         *
         * Prior java 8
         */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable ");
                //sout
            }
        };
        Thread th = new Thread(runnable);
        th.start();

        // Lambda Syntax
        //

        Runnable runnableLambda = () -> {
            System.out.println(" BYe");
        };
        th = new Thread(runnableLambda);
        th.start();
        new Thread(() -> {
            System.out.println("second Way ");
        }).start();
    }
}
