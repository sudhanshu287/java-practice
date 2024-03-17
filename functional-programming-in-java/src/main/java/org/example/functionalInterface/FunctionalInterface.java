package org.example.functionalInterface;

@java.lang.FunctionalInterface
interface Demo{
    void add(int a,int b);//A functional interface contain only one abstract method
                            // but can contain any number of default and static method
}
interface Demo2{
    void add(int a,int b);
    void subtract(int a,int b);
}
public class FunctionalInterface {
    public static void main(String[] args) {
        Demo d=(a,b)->{
            System.out.println("sum is = "+(a+b));
        };
        d.add(2,3);

        Demo2 d2=new Demo2(){
            public void add(int a,int b){
                System.out.println(a+b);
            }
            public void subtract(int a,int b){
                System.out.println(a-b);
            }
        };
        d2.add(10,20);
        d2.subtract(10,20);
    }


}
