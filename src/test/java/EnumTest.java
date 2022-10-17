import enums.CountryEnum;
import enums.GenderEnum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EnumTest {
    @Test
    public void testEnum() {
        assertEquals(GenderEnum.values().length, 3);
        assertEquals(GenderEnum.values()[0], GenderEnum.OTHER);
        assertEquals(GenderEnum.values()[1], GenderEnum.MALE);
        assertEquals(GenderEnum.values()[2], GenderEnum.FEMALE);

        /* TODO: Uncomment the lines below and make the test pass */
        assertEquals(GenderEnum.MALE.getValue(), "M");
        assertEquals(GenderEnum.FEMALE.getValue(), "F");
        assertEquals(GenderEnum.OTHER.getValue(), "O");

        assertSame(CountryEnum.NOXUS.isFictionalPlace(), Boolean.TRUE);
    }
}
