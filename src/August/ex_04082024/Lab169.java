package August.ex_04082024;

public class Lab169 {
    public static void main(String[] args) {
        ATBPerson p0 = new ATBPerson();
        ATBPerson p1 = new ATBPerson("Laharika");
        ATBPerson p2 = new ATBPerson("Harika");
        ATBPerson p3 = new ATBPerson("Praveena",976543210);
        System.out.println(p0.name);
        System.out.println(p1.name);
        System.out.println(p2.phone);



        System.out.println(p3.name);
        System.out.println(p3.phone);

    }
}
//Lab169+ATBPerson
//Object is created!
//null
//Laharika
//0
//Praveena
//976543210