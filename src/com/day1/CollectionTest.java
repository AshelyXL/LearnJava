package com.day1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionTest {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        ((ArrayList) c).add(0,"124String");
        ((ArrayList) c).add(6);
        System.out.println(c.contains(6));
        Collection book = new HashSet();
        book.add("nihao");

    }


}
