import college.Subject;
import common.Citizen;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException {
        /* The code before the Lombok library */
        //Subject sd = new Subject("SD");
        //Subject mip = new Subject("MIP", "Medii si Instrumente de Programare");
        //Subject tw = new Subject("TW", "Tehnologii Web", "The study of web technologies");

        /* New code with @Builder annotation from Lombok */
        Subject sd = Subject.builder().abbreviation("SD").build();
        Subject mip = Subject.builder().abbreviation("MIP").name("Medii si Instrumente de Programare").build();
        Subject tw = Subject.builder()
                .abbreviation("TW")
                .name("Tehnologii Web")
                .description("The study of web technologies")
                .build();

        List<Subject> subjects = new ArrayList<>();
        subjects.add(sd);
        subjects.add(mip);
        subjects.add(tw);

        //String directory = System.getProperty("user.home");
        String fileName = "subjects.txt";
        File subjectsFile = new File("src/main/resources/"+fileName);

        try(ObjectOutputStream bufferedOutputStream = new ObjectOutputStream(new FileOutputStream(subjectsFile.getAbsoluteFile()))){
            bufferedOutputStream.writeObject(subjects);
        } catch (IOException e){
            /**/
        }
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(subjectsFile.getAbsoluteFile()))){
            List<Subject> o = (List<Subject>) objectInputStream.readObject();
            System.out.println("RECEIVED OBJECT \n" + o);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
