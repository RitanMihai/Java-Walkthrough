package streams;

import model.Student;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsExamples {

    public static void streamCreation(){
        /* Empty stream trough empty() Stream method */
        Stream<String> emptyStream = Stream.empty();
        emptyStream.forEach(System.out::println);

        /* Create a stream from an existing instantiated Collection */
        System.out.println("Stream from collection");
        List<Integer> collection = Arrays.asList(1, 2, 3, 4);
        Stream<Integer> streamFromCollection = collection.stream();
        streamFromCollection.forEach(System.out::println);
        System.out.println();

        System.out.println("Stream using of()");
        /* of() function from Stream. This function accepts a var. nr. of args. of any given type */
        Stream<String> streamOf = Stream.of("a", "b", "c");
        streamOf.forEach(System.out::println);
        System.out.println();

        System.out.println("Stream using util classes");
        /* Through some util classes */
        String[] primitiveList = new String[]{"a", "b", "c"};
        Stream<String> streamOfArray = Arrays.stream(primitiveList);
        streamOfArray.forEach(System.out::println);
        System.out.println();

        System.out.println("Stream using builder");
        /* Builder */
        Stream<Student> streamBuilder = Stream.<Student>builder()
                .add(new Student())
                .add(new Student())
                .add(new Student()).build();
        streamBuilder.forEach(System.out::println);
        System.out.println();

        System.out.println("Stream creation using generator");
        /* Generate */
        System.out.println("Generate a random list of numbers");
        Stream<Integer> randomNumberList = Stream.generate(new Random()::nextInt /* We call it like this because nextInt is not static */)
                .limit(5);
        /* We must set a limit, because the streams accept infinity, and without a limit constraint the print below will print forever */
        randomNumberList.forEach(System.out::println);
        System.out.println();

        /* Another example, with a lambda function as a Supplier */
        Stream<String> stringsGenerated = Stream.generate(()-> ":)").limit(5);
        System.out.println("Generate a list of five ':)'");
        stringsGenerated.forEach(System.out::println);
        System.out.println();

        System.out.println("Stream creation using iterate. Prints numbers from 1 to 10");
        Stream<Integer> streamIterated = Stream.iterate(1,n->n+1).limit(10);
        streamIterated.forEach(System.out::println);
        System.out.println();

        /* Primitive Streams */
        IntStream rangeIntStream = IntStream.range(1 /* inclusive */,5 /* exclusive */); // => [1,2,3,4]
        IntStream closedRangeIntStream = IntStream.rangeClosed(1 /* inclusive */, 5/* inclusive */); // => [1,2,3,4,5]

        System.out.println("Primitives streams creations ");
        rangeIntStream.forEach(System.out::println); System.out.println();
        closedRangeIntStream.forEach(System.out::println); System.out.println();
    }

    public static void intStreams() {
        /* The difference between IntStream and Stream<Integer> is that
        * IntStream is a stream of primitives int values
        * Stream<Integer> is a stream of Integer objects */
        IntStream intPrimitiveStream = IntStream.iterate(1, n -> n + 1).limit(10);
        Stream<Integer> intObjectStream = Stream.iterate(1, n -> n + 1).limit(10);

        /* Furthermore, InStream has built-in functions as range(), sum(), average() and
           Stream<Integer> uses reduce() and collect()
         */

        System.out.println("Sum of 1+2+..+10");

        int sum   = IntStream.iterate(1, n -> n + 1).limit(10).sum();
        int sum2  = Stream.iterate(1, n -> n + 1).limit(10)   .reduce(0, Integer::sum);
        int sum3 = Stream.iterate(1, n -> n + 1).limit(10)    .collect(Collectors.summingInt(Integer::intValue));

        /* Reduce helps us to produce a single result from a sequence */
        System.out.println("Sum resulted from IntStream sum() function " + sum );
        System.out.println("Sum resulted from Stream<Integer> reduce() function " + sum2 );
        System.out.println("Sum resulted from Stream<Integer> collect() function " + sum3 );
        System.out.println();

        /* Collect help us to pack/fold stream elements in a new response */
        System.out.println("Average of 1+2+..+10");
        Double average = IntStream.iterate(1, n -> n + 1).limit(10).average().getAsDouble();
                                                                        /* In this case collect applies arithmetic operations */
        Double average2 = Stream.iterate(1, n -> n + 1).limit(10)  .collect(Collectors.averagingInt(Integer::intValue));

        /* It is possible to use reduce to do the average, but we should use a custom class in order to do this
         * Basically, collect is an enhanced version of reduce because allows Mutable objects in parallel.
         */
        System.out.println("Average resulted from IntStream average() function " + average);
        System.out.println("Average resulted from Stream<Integer> collect() function " + average2);
    }

    public static IntStream oddStreamOfTen () {
        /* Return a stream of ten even numbers starting from 0 */
        return null;
    }

    /* *
    * The goal is to return any set of numbers that starts from 0 and ends in n without the number 5 in it.
    *  Examples:
    *  anySetOfNumbersWithoutFive(2) => 0, 1, 2
    *  anySetOfNumbersWithoutFive(5) => 0, 1, 2, 3, 4
    *  anySetOfNumbersWithoutFive(10) => 0, 1, 2, 3, 4, 6, 7, 8, 9, 10
    * */
    public static Stream<Integer> anySetOfNumbersWithoutNrFive (Integer n) {
        /* Hint: There is a filter function */
        return null;
    }

    public static IntStream anySetOfNumbersWithoutNrFour (Integer n) {
        /* Hint: There is a filter function */
        return null;
    }

    public static Integer minNumber(List<Integer> list) {
        /* there are multiple solutions, you can try to reduce, collect and direct call on min */
        return null;
    }

    public static Integer maxNumber(List<Integer> list) {
        return null;
    }

    public static Integer secondMaxNr(List<Integer> list) {
        return null;
    }

    public static Integer sortIntegerAsc(List<Integer> list){
        return null;
    }

    public static Integer sortIntegerDesc(List<Integer> list){
        return null;
    }

    public static Integer oldestStudentAge(List<Student> students) {
        return null;
    }

    public static Integer youngestStudentAge(List<Student> students) {
        return null;
    }

    public static List<Student> sortStudentsByAgeAsc(List<Student> students){
        return null;
    }

    public static List<Student> sortStudentsByAgeDesc(List<Student> students){
        return null;
    }

    public static double studentAverageSubjects(Student mockStudent) {
        return 0;
    }
}
