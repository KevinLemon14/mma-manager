package kevinlemon.mmaproject.fighter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Fighter {

    @Id
    private String id;
    private String name;
    private int age;
    private String country;

    public Fighter() {

    }

    public Fighter(String id, String name, int age, String country) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
