package org.example.setDemo;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("Sudhanshu");
        set.add("ABC");
        set.add("XYZ");
        set.add("XYZ");
        set.add("abc");
        set.add("ne");
        set.add("Rango");
        System.out.println(set);
    }
}
