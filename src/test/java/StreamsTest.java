import collections.ArraysExample;
import enums.GenderEnum;
import model.Student;
import model.Subject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import streams.StreamsExamples;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class StreamsTest {
    private List<Student> students;
    private Student mockStudent;

    @BeforeEach
    public void setup(){
        students = Arrays.asList(
                Student.builder().forename("Andrei").gender(GenderEnum.MALE).age(19).build(),
                Student.builder().forename("Mihai").gender(GenderEnum.MALE).age(20).build(),
                Student.builder().forename("Ritan").gender(GenderEnum.MALE).age(23).build(),
                Student.builder().forename("Ana").gender(GenderEnum.FEMALE).age(45).build(),
                Student.builder().forename("Ina").gender(GenderEnum.FEMALE).age(21).build()
        );

        mockStudent = Student.builder().forename("Mock").finalGrades(
                Map.of(Subject.builder().abbreviation("SD").build(), 9,
                        Subject.builder().abbreviation("MIP").build(), 10,
                        Subject.builder().abbreviation("SO").build(), 10,
                        Subject.builder().abbreviation("ALGRAF").build(), 10)).build();
    }

    @Test
    public void testOddStreamLimitTen() {
        assertInstanceOf(IntStream.class, StreamsExamples.oddStreamOfTen());

        List<Integer> expected = Arrays.asList(0,2,4,6,8,10,12,14,16,18);
        List<Integer> integerList = StreamsExamples.oddStreamOfTen().boxed().toList();
        assertEquals(expected, integerList);
    }

    @Test
    public void testAnySetOfNumbersWithoutNrFive() {
        assertInstanceOf(Stream.class, StreamsExamples.anySetOfNumbersWithoutNrFive(0));

        assertEquals(Arrays.asList(0,1,2,3,4), StreamsExamples.anySetOfNumbersWithoutNrFive(5).toList());
        assertEquals(Arrays.asList(0,1,2,3,4,6,7), StreamsExamples.anySetOfNumbersWithoutNrFive(7).toList());
        assertEquals(Arrays.asList(0,1,2), StreamsExamples.anySetOfNumbersWithoutNrFive(2).toList());
    }

    @Test
    public void testAnySetOfNumbersWithoutNrFour() {
        assertInstanceOf(IntStream.class, StreamsExamples.anySetOfNumbersWithoutNrFour(0));

        assertEquals(Arrays.asList(0,1,2,3,5), StreamsExamples.anySetOfNumbersWithoutNrFour(5).boxed().toList());
        assertEquals(Arrays.asList(0,1,2,3,5,6,7), StreamsExamples.anySetOfNumbersWithoutNrFour(7).boxed().toList());
        assertEquals(Arrays.asList(0,1,2), StreamsExamples.anySetOfNumbersWithoutNrFour(2).boxed().toList());
    }

    @Test
    public void testMinMaxNumber() {
        /* Min nr. */
        assertEquals(1, StreamsExamples.minNumber(Arrays.asList(5,6,1,2,4,10,2)));
        assertEquals(3, StreamsExamples.minNumber(Arrays.asList(10,8,9,7,6,5,4,3)));

        /* Max nr. */
        assertEquals(10, StreamsExamples.maxNumber(Arrays.asList(5,6,1,2,4,10,2)));
        assertEquals(10, StreamsExamples.maxNumber(Arrays.asList(10,8,9,7,6,5,4,3)));
    }

    @Test
    public void testSecondMaxNumber() {
        assertEquals(6, StreamsExamples.secondMaxNr(Arrays.asList(5,6,1,2,4,10,2)));
        assertEquals(9, StreamsExamples.secondMaxNr(Arrays.asList(10,8,9,7,6,5,4,3)));
    }

    @Test
    public void testSortIntegers() {
        assertEquals(Arrays.asList(1,2,2,4,5,6,10), StreamsExamples.sortIntegerAsc(Arrays.asList(5,6,1,2,4,10,2)));
        assertEquals(Arrays.asList(10,6,5,4,2,2,1), StreamsExamples.sortIntegerDesc(Arrays.asList(5,6,1,2,4,10,2)));
    }

    @Test
    public void testStudentsAge() {
        assertEquals(45, StreamsExamples.oldestStudentAge(students));
        assertEquals(19, StreamsExamples.youngestStudentAge(students));
    }

    @Test
    public void testStudentAverageSubjects() {
        assertEquals(9.75, StreamsExamples.studentAverageSubjects(mockStudent));
    }

    @Test
    public void testStudentSort() {
        List<Student> studentsDesc = StreamsExamples.sortStudentsByAgeDesc(new ArrayList<>(this.students));
        List<Student> studentsAsc  = StreamsExamples.sortStudentsByAgeAsc(new ArrayList<>(this.students));

        assert studentsAsc != null;
        assertEquals(19, studentsAsc.get(0).getAge());
        assertEquals(45, studentsAsc.get(studentsAsc.size()-1).getAge());

        assert studentsDesc != null;
        assertEquals(45, studentsDesc.get(0).getAge());
        assertEquals(19, studentsDesc.get(studentsDesc.size()-1).getAge());
    }
}
