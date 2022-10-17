package enums;

/* Basic enum in Java */
/* A more advanced example in CountryEnum */
public enum GenderEnum {
    /* As in other programming languages, enums have a default index starting from 0 for each constant */
    /* GenderEnum[ ] */
    OTHER("O"),     /* [0] */
    MALE("M"),   /* [1] */
    FEMALE("F")     /* [2] */;

    private String value;
    GenderEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
