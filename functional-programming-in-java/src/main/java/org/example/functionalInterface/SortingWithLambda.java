package org.example.functionalInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Customer{
    String name;
    int customerId;

    public Customer(String name, int customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", customerId=" + customerId +
                '}';
    }
}
class MyComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Customer c1=(Customer) o1;
        Customer c2=(Customer) o2;

        if(c1.customerId<c2.customerId)
            return -1;
        else if (c1.customerId>c2.customerId) {
            return +1;
        }else
        return 0;
    }
}
public class SortingWithLambda {
    public static void main(String[] args) {
        List<Customer> customers=new ArrayList<>();
        Customer c1=new Customer("Sudhanshu",1);
        Customer c2=new Customer("Ankur",3);
        Customer c3=new Customer("Amit",2);
        Customer c4=new Customer("Palak",4);
        Customer c5=new Customer("Pratik",6);
        Customer c6=new Customer("Arvind",5);
        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        customers.add(c4);
        customers.add(c5);
        customers.add(c6);

        System.out.println(customers);

        //Old method before java 8
//        Collections.sort(customers,new MyComparator());


        //in java 8
//        Collections.sort(customers,(o1,o2)->{
//            if(o1.customerId<o2.customerId)
//                return -1;
//            else if (o1.customerId>o2.customerId)
//                return +1;
//            else
//                return 0;
//        });

        //More concise code
        Collections.sort(customers,(o1,o2)->
             (o1.customerId<o2.customerId)?-1:(o2.customerId>o2.customerId)?1:0
        );
        System.out.println(customers);

    }

}
