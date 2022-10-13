package enums;

/* A less advanced example in GenderEnum */
public enum CountryEnum {
    ROMANIA("RO"),
    UNITED_KINGDOM("UK"),
    UNITED_STATES_OF_AMERICA("USA"),
    ITALY("IT"),
    FRANCE("FR"),
    /* DEMACIA and NOXUS constant override the isFictionalPlace method */
    DEMACIA("DEMACIA") {
        @Override
        public Boolean isFictionalPlace() {
            return true;
        }
    },
    NOXUS("NOXUS"),
    OTHER("O") {
        @Override
        public Boolean isFictionalPlace() {
            return true;
        }
    };

    /* In Java enums accept attributes, constructor and methods */
    private String value;

    CountryEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public Boolean isFictionalPlace() {
        return false; /* default */
    }
}
