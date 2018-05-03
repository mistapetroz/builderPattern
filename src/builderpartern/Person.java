package builderpartern;

/**
 * @author PWAGACIRA
 */
public class Person {
    private final String name; // required 
    private final int age; // optional
    private final boolean status; // optional
    
    private Person(PersonBuilder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.status = builder.status;
    }
    public String getName (){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }  
    public boolean getStatus(){
        return this.status;
    }
    
    @Override
    public String toString(){
        return "\n Person \n Name: "+this.name + "\n Age: "+this.age+ "\n Status: "+this.status;
    }
    
    public static class PersonBuilder {
        private final String name;
        private int age;
        private boolean status;
        
        public PersonBuilder(String name){
            this.name = name;
        }
        // this Two classes will intialize the optional parameters 
        public PersonBuilder age(int age){
            this.age = age;
            return this;
        }
        public PersonBuilder status(boolean status){
            this.status = status;
            return this;
        }
        //This will initialize an new person and pass the builder AS initialized
        public Person build(){
            return new Person(this);
        }
    }
}
