package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner addNameScanner = new Scanner(System.in);

        ArrayList<String> A = new ArrayList<>();
        ArrayList<String> B = new ArrayList<>();
        ArrayList<String> C = new ArrayList<>();
        System.out.println("Введите 5 имен что бы заполнить список А");

        for (int i = 0; i < 5; i++) A.add(addNameScanner.next());
        System.out.println("Список А: " + A);
        System.out.println("Введите еще 5 имен что бы заполнить список Б");
        for (int i = 0; i < 5; i++) B.add(addNameScanner.next());
        System.out.println("Список Б: " + B);

        C.addAll(A);
        C.addAll(B);
        ArrayList<String> namesThatEnteredEx = new ArrayList<>(C);
        C.set(0, namesThatEnteredEx.get(0));
        C.set(1, namesThatEnteredEx.get(9));
        C.set(2, namesThatEnteredEx.get(1));
        C.set(3, namesThatEnteredEx.get(8));
        C.set(4, namesThatEnteredEx.get(2));
        C.set(5, namesThatEnteredEx.get(7));
        C.set(6, namesThatEnteredEx.get(3));
        C.set(7, namesThatEnteredEx.get(6));
        C.set(8, namesThatEnteredEx.get(4));
        C.set(9, namesThatEnteredEx.get(5));
        System.out.println(" список С: " + C);

        String[] arrayOfStrings  = C.toArray(new String[0]);
        Arrays.sort(arrayOfStrings, Comparator.comparing(String::length));
        System.out.println("Сортированный список: " + Arrays.toString(arrayOfStrings));
    }
}



