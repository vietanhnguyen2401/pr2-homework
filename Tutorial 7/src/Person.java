
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
            this.id = id;
            this.name = name;
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
