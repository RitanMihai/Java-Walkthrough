package model.common;

import enums.CountryEnum;
import enums.GenderEnum;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@RequiredArgsConstructor
public abstract class Citizen implements Human {
    protected String forename;
    protected String surname;
    protected String tin;
    protected Integer age;
    protected GenderEnum gender;
    protected CountryEnum country;

    @Override
    public abstract void speak();
}
