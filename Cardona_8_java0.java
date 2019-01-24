/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardona_8_java0;

/**
 *
 * @author christianc1078
 */
public class Cardona_8_java0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Animal tiger = new Animal ("tim");
      Animal lion;
        lion = new Animal ("kayla"+"reed");
        tiger.GoMeow();
        lion.GoPoop();
      
    }
   
}
class Animal {
    int age;
    String lastname;
    String firstname;
    boolean isAnimal;
    public Animal()  {        
    }

    public Animal(String fn){
        this.firstname=fn;
        
    }
    public Animal(String fn, String ln, int a){
        this.firstname=fn;
        this.lastname=ln;
        this.age = a;
    }
        public void GoMeow(){
            System.out.println("meow");
                
    }

        public void GoPoop(){
           System.out.println("lion takes dump");
    }
}

