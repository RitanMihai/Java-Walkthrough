package oop;

import java.util.List;

/* A class has the format: access_modifier class_keyword/abstract_keyword class_keyword class_name */
/* In java we have four access modifiers:
*  - default (as the absence of any keyword, not the default keyword). Access only on the package level.
*  - public. Access from anywhere.
*  - protected. Access only on the hierarchy of the class.
*  - private. Access only in the working class.
*  Protected and Private works only on inner classes.
* */
public class Student {
    /* *
    * A member variable is a piece of data that can describe aspects of our class.
    * An attribute has the format: access_modifier data_type member_name;
    * */

    /* The member modifiers are: default (package), public (all), private (none), protected (hierarchy) */
    private String forename;
    private String surname;
    public String nickname;

    /* *
    * Java has primitive types and are noted with small letters.         int <=> primitive type
    * If a data type starts with a capital it means is a class.          Integer <=> class type
    * */
    private List<Integer> grades;

    /* A method represents a piece of logic, a behavior. A method does things that represent our class. */
    /* A method has the format: access_modifier return_type method_name (parameters_if_any) { body return_type_if_any }; */


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
}
