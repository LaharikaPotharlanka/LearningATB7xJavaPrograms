package August.ex_10082024.poly.methodoverriding;

public class Lab183 {
    // Method overidding | Runtime Poly
    public static void main(String[] args) {
        Hound h1 = new Hound();
        h1.bark();
        h1.bike();

        Dog d1 = new Dog();
        d1.bark();

        Dog dog_Ref = new Hound();
        dog_Ref.bark(); // Overriden Functions
        //dog_Ref.bike();

        //Hound h2 = new Dog();

    }
}
//I am Hound, i will Bark!!
//Biked
//I am Dog, i will Bark!!
//I am Hound, i will Bark!!