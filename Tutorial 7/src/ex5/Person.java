package ex5;
import utils.AttrRef;
/**
 * @overview Represents person with a name attribute
 *
 */

public class Person {
    private int id;
    private String name;

    // constructor
    public Person(@AttrRef("id") int id, @AttrRef("name") String name) throws NotPossibleException {
        if (!validateId(id)) {
            throw new NotPossibleException("Not valid ID");
        }
        if (!validateId(name)) {
            throw new NotPossibleException("Not valid name");
        }
    }

    private boolean validateId(int id) {
        this.id = id;
        return false;
    }

    private boolean validateId(String name){
        this.name = name;
        return false;
    }

    // getters

        public int getId() {
            return id;
        }

        public String getName () {
            return name;
        }

        // setters

        public void setId ( int id){
            this.id = id;
        }

        public void setName (String name){
            this.name = name;
        }

        public void greet () {
            System.out.printf("Hello, my name is %s%n", name);
        }
    }

    class NotPossibleException extends Exception {
        public NotPossibleException(String not_valid_id) {
        }
    }

