package college;

import lombok.*;

import java.io.Serializable;

@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Subject implements Serializable {
    private String abbreviation;
    private String name;
    private String description;
}
