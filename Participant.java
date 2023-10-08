import java.util.List;

public class Participant {
    private String name;
    private String surname;
    private int age;
    private String typeOfSport;
    private List<String> awards;

    // Constructor
    public Participant(String name, String surname, int age, String typeOfSport, List<String> awards) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.typeOfSport = typeOfSport;
        this.awards = awards;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getTypeOfSport() {
        return typeOfSport;
    }

    public List<String> getAwards() {
        return awards;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTypeOfSport(String typeOfSport) {
        this.typeOfSport = typeOfSport;
    }

    public void setAwards(List<String> awards) {
        this.awards = awards;
    }
}
