package Homework6;

import java.util.Objects;

public class Client {

private Integer id;
private String name;
private Integer age;

    public Client(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(id, client.id) && Objects.equals(name, client.name) && Objects.equals(age, client.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }

    @Override
    public String toString() {
        return "Данные клиента (" +
                "id: " + id +
                ", имя: " + name +
                ", возраст: " + age +
                ')';
    }
}
