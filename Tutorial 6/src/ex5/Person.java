package ex5;

/**
 * @overview Represents person with a name attribute
 *
 */

public class Person {
    private int id;
    private String name;

    // constructor

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // getters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // setters

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void greet() {
        System.out.printf("Hello, my name is %s%n", name);
    }
}
