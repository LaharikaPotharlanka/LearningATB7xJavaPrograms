package August.ex_10082024.superthiskeyword;

public class Lab186 {
// super.variable
    // super.method()
    // super() -> DC
    // super("laharika') -> PC

    // this()
    // this.variableName



}

class Person1 {
    Person1() {
        System.out.println("Person1 - DC");
    }

    Person1(String a) {
        System.out.println("Person1 - PC A1");
    }

    Person1(String a, int a1) {
        System.out.println("Person1  - PC A2");
    }
}
class Student1 extends Person1{
    int a = 10;
    Student1(String s){
        System.out.println("PC -Student");
    }

    Student1(){
        super();
        System.out.println(this.a);
        //super("laharika");
        //super("laharika",12);
    }


}
