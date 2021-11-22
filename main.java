import java.util.*;
public class main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Welcome! Enter a number according to the index below, take a quiz and improve your knowledge!");
        System.out.println("1 - History");
        System.out.println("2 - Chemistry");
        System.out.println("3 - Physics");
        System.out.println("4 - Mathematics");
        System.out.println("5 - Geography");
        //remaining subjects left
        a = sc.nextInt();
    
        switch (a) {
            case 1:
                    {
                         System.out.println("Enter chapter number to get a quiz for the chapter");
                         System.out.println("6 - The Age of the Guptas");
                         System.out.println("9 - Medieval India - (C) The Mughal Empire");
                         b = sc.nextInt();
                         switch (b)
                         {
                             case 6:
                                 {
                                     History prog = new History();
                                     prog.Guptas();
                                     break;  
                                 }
                             case 9:
                                 {
                                     History prog = new History();
                                     prog.Mughals();
                                     break; 
                                 }
                         
                         }
                         break;
                        
                    }
            case 2:
                    {
                        Chemistry run = new Chemistry();
                        run.main(null);
                        break;
                    }
            case 3:
                    {
                        System.out.println("Enter a chapter number to get a quiz for the chapter");
                        System.out.println("5 - Upthrust");
                        b = sc.nextInt();
                        
                        switch (b) {
                            case 5:
                                   {
                                       Physics prog = new Physics();
                                       prog.Upthrust();
                                       break;
                                   }
                        }
                        break;
                    }
            case 4:
                {
                        Maths run = new Maths();
                        run.main(null);
                        break;
                }
            case 5:
                {
                        Geography test = new Geography();
                        test.main(null);
                        break;
                }
        }
    }
}
