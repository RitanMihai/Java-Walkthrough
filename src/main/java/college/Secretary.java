package college;

import common.Human;
import java.util.HashMap;
import java.util.List;

/* final keyword means that this class can not have anymore children */
public final class Secretary {
    public HashMap<Student, List<String>> documents = new HashMap<>();

    public HashMap<Student, List<String>> requestDocuments(Human human) throws Exception {
        /* TODO implement the method in order to pass the tests */
        return null;
    }

    public void setDocuments(HashMap<Student, List<String>> documents) {
        this.documents = documents;
    }
}
