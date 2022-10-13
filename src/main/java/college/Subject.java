package college;

public class Subject {
    private String abbreviation;
    private String name;
    private String description;

    /* *
     * If we want more modularity in the creation of Subject objects,
     * we can use Builder design instated of 3 constructors
     * */
    public Subject() {
        /* EMPTY */
    }

    public Subject (String abbreviation){
        this.abbreviation = abbreviation;
    }
    public Subject(String abbreviation, String name) {
        this.abbreviation = abbreviation;
        this.name = name;
    }

    public Subject(String abbreviation, String name, String description) {
        this.abbreviation = abbreviation;
        this.name = name;
        this.description = description;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "abbreviation='" + abbreviation + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
