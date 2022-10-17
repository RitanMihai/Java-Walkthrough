package college;

import common.Human;
import java.util.HashMap;
import java.util.List;

/* final keyword means that this class can not have anymore children */
public final class Secretary {
    private HashMap<Student, List<String>> documents = new HashMap<>();

    public HashMap<Student, List<String>> requestDocuments(Human human) throws Exception {
        if(human instanceof Student)
            return new HashMap<>(this.documents);
        throw new Exception("Access denied");
    }

    public void setDocuments(HashMap<Student, List<String>> documents) {
        this.documents = documents;
    }
}
