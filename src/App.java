import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner tangentbord = new Scanner(System.in);
        System.out.println("Divisions Programm");
        System.out.print("ange tal1; ");
        int tal1 = tangentbord.nextInt();
        System.out.print("ange tal2; ");
        int tal2 = tangentbord.nextInt();
        int kvot1 = tal1/tal2;
        double kvot2 = (double)tal1/tal2;
        System.out.println("kvoten är = " +kvot1);
        System.out.println("kvoten är = " +kvot2);
        

        System.out.println("Ange ett substantiv");
        String substanstiv = tangentbord.next();
        System.out.println("Ange ditt substantivs pluraländelse");
        String pluraländelse = tangentbord.next();
        System.out.println("En "+substanstiv+", flera "+substanstiv+pluraländelse);


    }
}