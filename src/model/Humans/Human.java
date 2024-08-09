package model.Humans;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public abstract class Human {
    protected long id;
    protected String name;
    protected int age;
    protected Gender gender;
    protected LocalDate birthDate;
    protected LocalDate deathDate;

    public Human(String name, Gender gender, LocalDate birthDate, LocalDate deathDate) {
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.deathDate = deathDate;
        this.age = getAge();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        if(deathDate == null) {
            age = Period.between(birthDate, LocalDate.now()).getYears();
        } else {
            age = Period.between(birthDate, deathDate).getYears();
        }
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public LocalDate getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(LocalDate deathDate) {
        this.deathDate = deathDate;
    }

    public long getId() {
        return id;
    }
    public void setId(long id){
        this.id = id;
    }
    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", birthDate=" + birthDate +
                ", deathDate=" + deathDate +
                '}';
    }
}
