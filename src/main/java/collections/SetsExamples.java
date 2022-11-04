package collections;

import model.Student;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsExamples {
    public static void examplesHashSetPrimitives() {
        System.out.println("========================= HashSets with PRIMITIVES =========================");
        Set<String> set1 = new HashSet<>();
        set1.add("Apple");
        set1.add("Orange");
        set1.add("Mango");
        set1.add("Pineapple");
        set1.add("Pear");
        set1.add("Mango");
        set1.add("Orange");

        System.out.println("An initial list of elements: " + set1);

        // Remove on specific element
        set1.remove("Pear");
        System.out.println("The new list of elements: " + set1);

        Set<String> set2 = new HashSet<>();
        set2.add("Plum");
        set2.add("Dragon Fruit");
        set2.add("Pear");
        set1.add("Orange");

        set1.addAll(set2);

        //Removing elements on the basis of specified condition
        set1.removeIf(str -> str.contains("Mango"));
        System.out.println("After invoking removeIf() method: " + set1);
    }

    public static void examplesTreeSetPrimitives() {
        /* Auto sorted but slower */
        System.out.println("========================= TreeSets with PRIMITIVES =========================");
        Set<Integer> set1 = new TreeSet<>();
        set1.add(5);
        set1.add(3);
        set1.add(9);
        set1.add(2);
        set1.add(6);
        set1.add(4);
        set1.add(3);

        System.out.println("Sorted elements with TreeSet " + set1);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(20);
        set2.add(8);
        set2.add(1);
        set2.add(3);

        System.out.println("Unordered elements with HashSet " + set2);
    }

    public static void examplesObjects() {
        Student andrei = new Student();
        andrei.setForename("Andrei");

        Student marian = new Student();
        marian.setForename("Marian");

        Student ana = new Student();
        ana.setForename("Ana");

        Set<Student> set = new HashSet<>();
        set.add(andrei);
        set.add(marian);
        set.add(ana);

        System.out.println("Print unique students list: " + set);
    }
}
