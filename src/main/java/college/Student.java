package college;

import common.Citizen;
import common.Human;
import enums.CountryEnum;
import enums.GenderEnum;

import java.util.HashMap;
import java.util.List;

/* A class has the format: access_modifier class_keyword/abstract_keyword class_keyword class_name */
/* In java we have four access modifiers:
*  - default (as the absence of any keyword, not the default keyword). Access only on the package level.
*  - public. Access from anywhere.
*  - protected. Access only on the hierarchy of the class.
*  - private. Access only in the working class.
*  Protected and Private works only on inner classes.
* */
public class Student extends Citizen { /* the keyword extends is used only on classes, because classes CAN BE EXTENDED
on hierarchy by adding new attributes/methods or override the existing ones */

    public Student() {
        /* EMPTY */
    }

    public Student(String surname, String forename) {
        this.surname = surname;
        this.forename = forename;
    }

    /* *
    * Java has primitive types and are noted with small letters.         int     <=>  primitive type
    * If a data type starts with a capital it means is a class.          Integer <=>  class type
    * */
    private List<Subject> subjects;
    /* A method represents a piece of logic, a behavior. A method does things that represent our class. */
    /* A method has the format: access_modifier return_type method_name (parameters_if_any) { body return_type_if_any }; */

         /* HashMap<Key    , Value> */
    private HashMap<Subject, Integer> finalGrades;

    /* Inherited from Human interface */
    @Override
    public void speak() {
        System.out.println("I am student");
    }

    /* *
     * This principal of accessing a certain member only via dedicated functions is called encapsulation.
     * Because we encapsulate the members in our class.
     * */
    public String getForename() {
        return this.forename;
    }

    /* *
     *One of the main advantage of both setters and getters is that we can write custom code, that must run along.
     * This is a great way to impose rules.
     * */
    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public HashMap<Subject, Integer> getFinalGrades() {
        return finalGrades;
    }

    public void setFinalGrades(HashMap<Subject, Integer> finalGrades) {
        this.finalGrades = finalGrades;
    }

    public GenderEnum getGender() {
        return gender;
    }

    /* Example of overloading, a method has GenderEnum type and the other one String type */
    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

    public void setGender(String gender) {
        this.gender = GenderEnum.valueOf(gender);
    }

    public CountryEnum getCountry() {
        return country;
    }

    public void setCountry(CountryEnum country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Student{" +
                "forename='" + forename + '\'' +
                ", surname='" + surname + '\'' +
                ", tin='" + tin + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", country=" + country +
                ", subjects=" + subjects +
                ", finalGrades=" + finalGrades +
                '}';
    }
}
