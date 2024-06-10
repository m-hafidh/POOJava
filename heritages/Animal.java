// Creer la class 
/**
 * Animal
 */
// class Abstact
abstract class Animal {
//Methode Abstarct (n'a pas de corps)
    public abstract void animalSound();
    //Regular method
    public void sleep(){


        
        System.out.println("Zzzzzzzzzzzzz");
    }
}

//Creer les sousClass Cochon 
class cochon extends Animal{
    public void animalSound(){
        System.out.println("le Cochon dit : Wee Wee Wee");
    }
}

//Creer les sousClass Chien 
class chien extends Animal{
    public void animalSound(){
        System.out.println("le Chien dit : bow hwoo wow");
    }
}

class Main {
    public static void main(String[] args) {
        
       // Animal monAnimal = new Animal(); // creer un obkjet animal
        cochon monCochon = new cochon(); // creerl'objet cochon
        //Animal monChien = new chien(); // ceerl'objet Chien 
       // monAnimal.animalSound();
        monCochon.animalSound();
        //monChien.animalSound();
        monCochon.sleep();
    }
}

