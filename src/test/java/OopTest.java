import model.common.Citizen;
import model.common.Human;
import model.*; /* You can import the whole package, not commanded because, usually, you do not use the whole package */
import org.junit.jupiter.api.Test;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static util.AccessModifierEnum.PRIVATE;

public class OopTest {

    /* This test pass by default */
    @Test
    public void testInheritanceStudent() {
        Human citizen = new Student();
        assertInstanceOf(Citizen.class, citizen);
        assertInstanceOf(Human.class, citizen);
    }

    @Test
    public void testInheritanceTeacher() {
        Teacher teacher = new Teacher();
        assertInstanceOf(Citizen.class, teacher);
        assertInstanceOf(Human.class, teacher);
    }

    /* *
    * My article about OOP might help you
    * https://medium.com/@lucian.ritan/programare-orientat%C4%83-pe-obiect-java-83dbfd222c63
    * */
    @Test
    public void testEncapsulation() throws Exception {
        /* Setup */
        Teacher teacher = new Teacher();
        Student student = new Student();
        Secretary secretary = new Secretary();

        HashMap<Student, List<String>> studentDocuments = new HashMap<>();
        studentDocuments.put(student, List.of("BAC", "CI", "CN"));
        secretary.setDocuments(studentDocuments);

        Field documentField = Secretary.class.getDeclaredField("documents");
        int documentAccessModifier = documentField.getModifiers();

        /* Tests */
        assertEquals(documentAccessModifier, PRIVATE.getValue());
        assertThrows(Exception.class, () -> secretary.requestDocuments((Human) teacher));
        /* Check the difference between == and equals in Java */
        assertEquals(studentDocuments, secretary.requestDocuments(student));  /* equivalent with a .equals verification */
        assertNotSame(studentDocuments, secretary.requestDocuments(student)); /* equivalent with a != verification      */
    }


}
