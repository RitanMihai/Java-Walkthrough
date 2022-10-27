package college;

import common.Citizen;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashMap;
import java.util.List;

@Data /* @ToString, @EqualsAndHashCode, @Getter / @Setter and @RequiredArgsConstructor except @NoArgsConstructor */
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class Student extends Citizen {
    private List<Subject> subjects;
    private HashMap<Subject, Integer> finalGrades;

    @Override
    public void speak() {
        System.out.println("I am student");
    }
}
