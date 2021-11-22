import java.util.*;

public class Biology {
    Scanner sc = new Scanner(System.in);
    int score, choice = 0; double percent = 0.0; String analysis = "", answer, youranswers = "";//Instance variables for class 'Biology'
    public static void Nutrition() {

    }
    public static void Digestion() {

    }
    public static void Skeleton() {

    }
    public static void Skin() {
        
    }
    public void main(String[] args) {
        Biology test = new Biology();
        System.out.println("Concise Biology I.C.S.E Class 9: Semester II\nEnter chapter number based on index given below to attempt a test on the chapter");
        System.out.println("10-Nutrition\n11-Digestive System\n12-Skeleton - Movement and Locomotion\n13-Skin-\"The Jack of All Trades\"");
        System.out.print("Enter chapter number: ");
        choice = sc.nextInt();
        switch (choice) {
            case 10: test.Nutrition(); break;
            case 11: test.Digestion(); break;
            case 12: test.Skeleton(); break;
            case 13: test.Skin(); break;
        }
    }
    
}
