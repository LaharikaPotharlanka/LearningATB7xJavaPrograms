package July.ex_14072024;

public class Lab078 {
    public static void main(String[] args) {
        String password  = "Laharika@123";
        String pass_u = password.toLowerCase();
        System.out.println(pass_u);
        // pass_u == password
        System.out.println(pass_u == password);
        System.out.println(pass_u.equals(password));
        System.out.println(pass_u.equalsIgnoreCase(password));
        //Laharika@123 =  laharika@123  = LAharika@123 = LahArika@123

        System.out.println(password.substring(0,3));
        System.out.println(password.indexOf('r'));
        System.out.println(password.length());
    }
}
//laharika@123
//false
//false
//true
//Lah
//4
//12