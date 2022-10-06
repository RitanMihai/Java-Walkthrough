import oop.Student;

public class Main {
    public static void main(String[] args) {
        /* In order to use a class, we must instance the class.
        * There are classes that can be use without instancing them, static classes.
        * In our case Student is not static, so we make a new object */

        /* data_type object_name = new_keyword constructor */
        Student student = new Student();
        /* The constructor is a special method that defines how our object is build, more on this later */
        /* If there are no constructor provided a default one will be assigned automatically */

        student.nickname = "R"; /* nickname is public so we can access it directly */
        /* Now the student got the nickname R */
        System.out.println(student.nickname);

        //student.surname = "Ritan"; /* This line of code is not working, because the surname field is not public */
        student.setSurname("Ritan");
        student.setForename("Mihai");

        System.out.println(student.getSurname() + " " + student.getForename());
    }
}
