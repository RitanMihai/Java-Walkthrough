package collections;

import college.Student;
import enums.RoleEnum;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapsExamples {
    public static void exampleObjects() {
        System.out.println("\n========================= Maps Objects =========================");

        Student andrei = new Student();
        andrei.setForename("Andrei");

        Student marian = new Student();
        marian.setForename("Marian");

        Student ana = new Student();
        ana.setForename("Ana");

        HashMap<Student, RoleEnum> roles = new HashMap</* Student, RoleEnum*/>();
        roles.put(andrei, RoleEnum.USER);
        roles.put(marian, RoleEnum.ADMIN);
        roles.put(ana, RoleEnum.MODERATOR);
        roles.put(andrei, RoleEnum.MODERATOR);

        Student nullescu = new Student();
        nullescu.setForename("Nullescu");

        System.out.println("This is my map " + roles);

        System.out.println("GET SOMETHING NULL " + roles.get(nullescu));

        System.out.println("AGAIN - This is my map " + roles);

        //Iterate with an Iterator
        System.out.println("\nIterate with Iterator:");
        Iterator it = roles.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry pair = (Map.Entry) it.next();
            System.out.println(pair);
        }

        //Iterate with a for
        System.out.println("\nIterate with for:");
        for (Map.Entry<Student, RoleEnum> studentRoleEnumEntry : roles.entrySet()) {
            System.out.println(studentRoleEnumEntry);
        }

        //Iterate the map - lambda
        System.out.println("\nIterate with lambda function:");
        roles.forEach((key, value) -> {
            System.out.println(key + "=" + value);
        });

    }
}
