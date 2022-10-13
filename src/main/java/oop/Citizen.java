package oop;

import oop.enums.CountryEnum;
import oop.enums.GenderEnum;

public abstract class Citizen implements Human { /* the keyword implements is used only on interfaces, because
interfaces impose methods, and down the line the child classes MUST IMPLEMENT the interface's methods */

    /* *
     * A member variable is a piece of data that can describe aspects of our class.
     * An attribute has the format: access_modifier data_type member_name;
     * */

    /* The member modifiers are: default (package), public (all), private (none), protected (hierarchy) */
    protected String forename;
    protected String surname;
    protected String tin;
    protected Integer age;
    protected GenderEnum gender;
    protected CountryEnum country;

    /* We don't need to declare the speak method here, because it is inherited by default,
    *  but what we can see is that in abstract classes we must use the keyword "abstract" on abstract methods */
    @Override
    public abstract void speak();
}
