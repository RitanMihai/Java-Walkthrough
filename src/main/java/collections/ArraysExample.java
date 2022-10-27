package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArraysExample {
    /* Used for testes */
    private List<Integer> integerArrayList;

    public ArraysExample() {
        integerArrayList = new ArrayList<>(Arrays.asList(1,8,3,9,4,10,5));
    }

    public static void examplePrimitives() {
        System.out.println("\n========================= Arrays Primitives =========================");
        //Init the array via constructor
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(2, 3, 1, 4, 10, 0));

        //CRUD operations
        //Create
        arrayList.add(25);
        arrayList.add(30);
        arrayList.add(20);

        //Read all elements
        System.out.println("Initial array :" + arrayList);
        //Initial array :[2, 3, 1, 4, 10, 0, 25, 30, 20]
        //As you can see the insert order is maintained

        //Read an element
        System.out.println("Element from index 1: " + arrayList.get(1));
        //Element from index 1: 3
        //First index is always 0, so index 1 is the second element

        //Update
        arrayList.set(0, 0); // update the element from first position to value zero

        //Delete
        arrayList.remove(8);

        System.out.println("Array Updated :" + arrayList);
        //Array Updated :[0, 3, 1, 4, 10, 0, 25, 30]

        //Arrays class functions
        arrayList.sort(Integer::compareTo);

        System.out.println("Array sorted asc:" + arrayList);
        //Array sorted asc:[0, 0, 1, 3, 4, 10, 25, 30]

        //Reverse the array using Collections and lambda expression
        arrayList.sort((first, second) -> {
            if (first > second)
                return -1;
            else return 0;
        }); // More examples in functional package

        System.out.println("Array sorted desc:" + arrayList);
        //Array sorted desc:[30, 25, 10, 4, 3, 1, 0, 0]
    }

    public Integer getFirst(){
        // your code here
        return null;
    }

    public Integer getLast(){
        // your code here
        return null;
    }

    public Integer getTheHighestNumber(){
        // your code here
        return null;
    }

    public Integer getTheLowestNumber(){
        // your code here
        return null;
    }

    /* There are many solutions for last ones, please watch for: Streams, Comparable, Comparator, Collections - with and without lambdas*/
    public List<Integer> sortAsc(){
        // your code here
        return null;
    }

    public List<Integer> sortDesc(){
        // your code here
        return null;
    }
}
