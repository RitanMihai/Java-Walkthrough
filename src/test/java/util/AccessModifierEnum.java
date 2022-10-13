package util;

/* *
 * Check java.lang.reflect.Modifier from Constant Values documentation for more details
 * https://docs.oracle.com/javase/7/docs/api/constant-values.html
 * */
public enum AccessModifierEnum {
    DEFAULT(0),
    PUBLIC(1),
    PRIVATE(2),
    PROTECTED(4);

    private int value;

    AccessModifierEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
