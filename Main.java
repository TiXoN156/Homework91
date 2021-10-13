package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>(); // ListIterator для проверки
        arrayList.add("ноль");
        arrayList.add("один");
        arrayList.add("два");
        arrayList.add("три");
        arrayList.add("четыре");

        ListIterator<String> iterator = arrayList.listIterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.previous());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.previousIndex());
        System.out.println(iterator.nextIndex());
        iterator.set("два-два");
        System.out.println(arrayList.toString());
        System.out.println(iterator.next());
        iterator.add("новая");
        System.out.println(arrayList.toString());
        System.out.println(iterator.next());
        iterator.remove();
        System.out.println(arrayList.toString());

        System.out.println("---------------------------------------");

        ArrayList<String> arrayList2 = new ArrayList<>(); // MyListIterator
        arrayList2.add("ноль");
        arrayList2.add("один");
        arrayList2.add("два");
        arrayList2.add("три");
        arrayList2.add("четыре");

        MyListIterator<String> myListIterator = new MyListIterator<>(arrayList2);
        System.out.println(myListIterator.next());
        System.out.println(myListIterator.next());
        System.out.println(myListIterator.previous());
        System.out.println(myListIterator.next());
        System.out.println(myListIterator.next());
        System.out.println(myListIterator.previousIndex());
        System.out.println(myListIterator.nextIndex());
        myListIterator.set("два-два");
        System.out.println(arrayList2.toString());
        System.out.println(myListIterator.next());
        myListIterator.add("новая");
        System.out.println(arrayList2.toString());
        System.out.println(myListIterator.next());
        myListIterator.remove();
        System.out.println(arrayList2.toString());


    }
}
