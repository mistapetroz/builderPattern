/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpartern;

/**
 *
 * @author PWAGACIRA
 */
public class BuilderPartern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello guys");
        System.out.println(new Person.PersonBuilder("Peterson A").build().toString());
        System.out.println(new Person.PersonBuilder("Peterson B").age(27).build().toString());
        System.out.println(new Person.PersonBuilder("Peterson C").age(30).status(true).build().toString());
    }
    
}
