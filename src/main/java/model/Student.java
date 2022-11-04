package model;

import model.common.Citizen;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;
import java.util.Map;

@Data /* @ToString, @EqualsAndHashCode, @Getter / @Setter and @RequiredArgsConstructor except @NoArgsConstructor */
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class Student extends Citizen {
    private List<Subject> subjects;
    private Map<Subject, Integer> finalGrades;

    @Override
    public void speak() {
        System.out.println("I am student");
    }
}
