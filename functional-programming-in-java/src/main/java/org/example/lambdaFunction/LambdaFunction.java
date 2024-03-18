package org.example.lambdaFunction;
import java.util.function.*;


public class LambdaFunction {
    public static void main(String[] args) {
        Runnable rn=()->{
           for(int i=0;i<10;i++){
               System.out.println("Child thread "+i);
           }
        };
        Thread thread=new Thread(rn);
        thread.start();
        for(int i=0;i<10;i++){
            System.out.println("Main thread "+i);
        }
    }
}
