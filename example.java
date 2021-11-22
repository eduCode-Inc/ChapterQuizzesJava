import java.util.Scanner;
public class example {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        System.out.println("Who wrote the poem \'The Cold Within\'? \n A.Rudyard Kipling \n B.James Patrick Kinney \n C.Ernest Miller Hemingway \n D.None of the above");
        char choice=in.next().charAt(0);
        switch(choice) {
            case 'C':
            {
                System.out.println("That's right");
                break;
            }
            case 'c':
            {
                System.out.println("That's right");
                break;        
            }
            default:
            {
                System.out.println("Incorrect Answer");
                break;
            }
        }
    }
}
