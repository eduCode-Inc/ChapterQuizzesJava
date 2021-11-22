import java.util.*;

public class exmp2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a;
        a = sc.nextLine();
        
        if (a == "Hi") {
            System.out.println("Hi back!");
        } else {
            System.out.println("No hi!? :-(");
        }
    }
    public static void switchCase() {
        Scanner sc = new Scanner(System.in);
        String a;
        a = sc.nextLine();
        
        switch (a) {
            case "Hi":
                {
                    System.out.println("Hi back!");
                    break;
                }
            case "No Hi":
                {
                    System.out.println("No hi!? :-(");
                    break;
                }
        }
    }
}