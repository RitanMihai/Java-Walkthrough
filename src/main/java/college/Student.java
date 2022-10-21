package college;

import common.Citizen;
import enums.GenderEnum;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashMap;
import java.util.List;

/* @Data documentation: https://projectlombok.org/features/GetterSetter  */
@Data /* A combination of @Getter and @Setter */
@ToString /* Generated default toString function */
@SuperBuilder
@RequiredArgsConstructor
//@AllArgsConstructor
//@NoArgsConstructor
/* More about it here: https://refactoring.guru/design-patterns/builder */
public class Student extends Citizen {

    private List<Subject> subjects;
    private HashMap<Subject, Integer> finalGrades;

    @Override
    public void speak() {
        System.out.println("I am student");
    }
}
