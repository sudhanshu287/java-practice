package org.example.listDemo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        System.out.println(list.size());
        list.add("Sudhanshu");
        list.add("Sumit");
        list.add("Amit");
        System.out.println(list.size());
        List<String> list2=new ArrayList<>();
        System.out.println(list2.size());
        list2.add("Mohan");
        list2.add("Rohit");
        list2.add("Priya");
        System.out.println(list2.size());
        list.addAll(list2);
        System.out.println(list2);
        System.out.println(list);
    }
}
