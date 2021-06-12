import javax.print.attribute.standard.JobHoldUntil;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "human")
@XmlType(propOrder = { "id", "name", "surname","age","country"})
public class Human {

    private Long id;
    private String name;
    private String surname;
    private int age;
    private String country;


    public Human(){

    }

    public Human(String name, String surname, int age, String country,Long id) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.country = country;
        this.id=id;
    }


    public Long getId() {
        return id;
    }

    @XmlAttribute
    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    @XmlElement(name = "firstname")
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                '}';
    }
}
