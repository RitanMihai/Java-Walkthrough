import college.Student;
import college.Subject;
import enums.CountryEnum;
import enums.GenderEnum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Subject sd = new Subject("SD");
        Subject mip = new Subject("MIP", "Medii si Instrumente de Programare");
        Subject tw = new Subject("TW", "Tehnologii Web", "The study of web technologies");

        List<Subject> subjects = new ArrayList<>();
        subjects.add(sd);
        subjects.add(mip);
        subjects.add(tw);

        System.out.println("======================= PRINT/ITERATE ALL SUBJECTS =======================");

        System.out.println("Naive approach");
        System.out.println(subjects); // Naive approach, will print the actual object, take care to have toString() imp.

        System.out.println(); /* Spacing for better visibility in console */

        System.out.println("Access by index approach");
        for (int i = 0; i < subjects.size(); i++) {
            System.out.println(subjects.get(i));
            /* Without override alternative */
            //Subject subject = subjects.get(i);
            //System.out.println(subject.getAbbreviation() + " - " + subject.getName() + " - " + subject.getDescription());;
        }

        System.out.println(); /* Spacing for better visibility in console */

        System.out.println("Iterate on references");
        for (Subject subject : subjects) {
            System.out.println(subject);
            /* Without override alternative */
            //System.out.println(subject.getAbbreviation() + " - " + subject.getName() + " - " + subject.getDescription());;
        }

        System.out.println(); /* Spacing for better visibility in console */

        System.out.println("Functional variant 1");
        subjects.forEach(subject -> System.out.println(subject));

        System.out.println(); /* Spacing for better visibility in console */

        System.out.println("Functional variant 2 - Simplified ");
        subjects.forEach(System.out::println); /* In this case we can give directly the method to use */
        /* :: reference the method */
        /* .  call the method      */

        System.out.println(); /* Spacing for better visibility in console */

        System.out.println("======================= PRINT/ITERATE ALL GENDERS  =======================");
        GenderEnum[] genderPrimitiveEnums = GenderEnum.values(); /* values() return primitive array */
        /* If we do not want to use the primitive array we can parse it */
        List<GenderEnum> genderEnums = List.of(genderPrimitiveEnums);
        genderEnums.forEach(System.out::println);

        System.out.println();

        System.out.println("======================= PRINT/ITERATE ALL COUNTRIES  =======================");
        CountryEnum[] countryPrimitiveEnums = CountryEnum.values(); /* values() return primitive array */
        /* If we do not want to use the primitive array we can parse it */
        List<CountryEnum> countryEnums = List.of(countryPrimitiveEnums);

        /* *
        * In Java, we can call a method on an enum constant
        * Let's replace countryEnum.isFictionalPlace() with a concrete examples
        * CountryEnum.ROMANIA.isFictionalPlace() returns FALSE
        * CountryEnum.DEMACIA.isFictionalPlace() returns TRUE
        * Run the project to see them all
        * */
        countryEnums.forEach(countryEnum ->
                System.out.println(
                        countryEnum.getValue() + " is Fictional?: " +
                        countryEnum.isFictionalPlace()));

        System.out.println();


        System.out.println("======================= STUDENT  =======================");

        Student student = new Student("Ritan", "Lucian");
        student.setSubjects(subjects);
        student.setGender(GenderEnum.MALE);
        student.setCountry(CountryEnum.ROMANIA);
        System.out.println(student);

        System.out.println();

        System.out.println("======================= STUDENT GRADES  =======================");
        /* *
        * Subject is overriding toString(),
        * otherwise the Subject objects will be printed similar to Subject@4e50df2e
        * please check Subject class
        * */
        System.out.println("Student " + student.getSurname() + " subjects: " + student.getSubjects());

        HashMap<Subject, Integer> grades = new HashMap<>();
        grades.put(sd, 9);
        grades.put(mip, 10);
        grades.put(tw, 7);

        student.setFinalGrades(grades);
        System.out.println("Student " + student.getSurname() + " grades: " + student.getFinalGrades());

        System.out.println();
        /* TAKE CARE - IN JAVA OBJECTS ARE PASSED BY REFERENCES */
        System.out.println("ORIGINAL GRADE");
        Integer twGrade = student.getFinalGrades().get(tw);
        System.out.println("TW grade is: " + twGrade);

        System.out.println();
        System.out.println("grades - Main class.");
        grades.put(tw, 8);
        Integer twGrade2 = student.getFinalGrades().get(tw);
        System.out.println("TW grade is: " + twGrade2);

        System.out.println();
        System.out.println("FinalGrades modified - User class.");
        student.getFinalGrades().put(tw,9);
        Integer twGrade3 = student.getFinalGrades().get(tw);
        System.out.println("TW grade is: " + twGrade3);

        System.out.println();

        System.out.println("So take care how do you handle data outside of your class " +
                "because you can modified, by mistake, in unwanted manners");
    }
}
