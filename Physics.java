import java.util.Scanner;
public class Physics
{
    Scanner object = new Scanner(System.in);
    int score, choice = 0; double percent = 0.0; String analysis = "", answer, youranswers = "";//Instance variables for class 'Physucks'
    public void Upthrust()
    {
       System.out.println("Chapter 5: Upthrust"); 
            
        
        System.out.println("Q1-If a body of 1235N floats on a liquid of density 690kg/m3.Find the apparent weight.");
        System.out.println("1 - 1235N");
        System.out.println("2 - 0 ");
        System.out.println("3 - 786.23N");
        System.out.println("4 - 1000N");
          answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)"; //better accessibility
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "1 " + answer + "\n";
       if (answer.equals("(B)")) score+= 1;       
        
        
       
        System.out.println("Q2-Relative Density of Copper:");
        System.out.println("1 - 8.9g/cm3 ");
        System.out.println("2 - 8.9");
        System.out.println("3 - 8900");
        System.out.println("4 - 890kg/m3");
       answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "2 " + answer + "\n";
       if (answer.equals("(B)")) score+= 1;
        
        
        
        System.out.println("Q3-SI unit of upthrust?");
        System.out.println("1 - Pa");
        System.out.println("1 - kg");
        System.out.println("3 - N ");
        System.out.println("4 - gf");
        answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "3 " + answer + "\n";
       if (answer.equals("(C)")) score+= 1;
        
       
        System.out.println("Q4-Body sinks if?");
        System.out.println("1 - p>pL");
        System.out.println("2 - p<pL ");
        System.out.println("3 - p=pL ");
        System.out.println("4 - FB'>W");
       answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "4 " + answer + "\n";
       if (answer.equals("(A)")) score+= 1;
 
       
          System.out.println("Q5-Density of Water is Maximum at ----?");
        System.out.println("1 - 9K ");
        System.out.println("2 - 4 degree celsius");
        System.out.println("3 - 0 celsius");
        System.out.println("4 - 0 degree celsius");
        answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "5 " + answer + "\n";
       if (answer.equals("(B)")) score+= 1;
        
       
          System.out.println("Q6-Density of Sea water is:?");
        System.out.println("1 - 1.07 ");
        System.out.println("2 -1.5");
        System.out.println("3 - 1.917");
        System.out.println("4 - 1.026 ");
       answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "6 " + answer + "\n";
       if (answer.equals("(D)")) score+= 1;
       
     
            System.out.println("Q7-Ballast like Organs in Fish ");
        System.out.println("1 - Fins ");
        System.out.println("2 - Fish Blads");
        System.out.println("3 - Swim Bladder");
        System.out.println("4 - Fish Swimmers");
       answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "7 " + answer + "\n";
       if (answer.equals("(C)")) score+= 1;
       
        
        
        System.out.println("Q8-Density of our body with empty lungs is :?");
        System.out.println("1 -1.07g/cm3");
        System.out.println("2 -1.00g/cm3 ");
        System.out.println("3 -1.1g/cm3");
        System.out.println("4 -0.9glcm3");
        answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "8 " + answer + "\n";
       if (answer.equals("(A)")) score+= 1;

         
        System.out.println("Q9-Unit of relative density is_____?");
        System.out.println("1 - x ");
        System.out.println("2 - 0 ");
        System.out.println("3 - No Unit");
        System.out.println("4 - g/cm3");
        answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "9 " + answer + "\n";
       if (answer.equals("(C)")) score+= 1;
       
       System.out.println("Q10-In Air weight is 120 gf and in water is 105gf.Tell its Relative Density ?");
        System.out.println("1 - 15 ");
        System.out.println("2 - 8");
        System.out.println("3 - 120/105");
        System.out.println("4 - 7.5 ");
       answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "10 " + answer + "\n";
       if (answer.equals("(B)")) score+= 1;
       
       switch(score)
       {
           case 0: analysis = "Extremely poor! Start studying seriously"; break;
           case 1: analysis = "Poor performance. Please work harder"; break;
           case 2: analysis = "Not upto the mark. Revise more"; break;
           case 3: analysis = "You need to work on your study patterns and habits"; break;
           case 4: analysis = "You can surely do much better. Study smart and not just hard!"; break;
           case 5: analysis = "Decent performance. Practise more and you will surely score well"; break;
           case 6: analysis = "Good, but \'Ye dil maange more\'!"; break;
           case 7: analysis = "Great work! Keep revising"; break;
           case 8: analysis = "Very good! Just work a bit more and you can get full marks!"; break;
           case 9: analysis = "Almost perfect! Try to avoid silly mistakes and brush up a few concepts which you might have missed.."; break;
           case 10: analysis = "Perfect score! Hurray!! Keep revising the same way to maintain consistent scores!"; break;
       }
       System.out.println("Score: "+score+"/10\nPercentage: "+((double)score/10.0*100.0)+" %\nAnalysis: "+analysis); 
       System.out.println("\nYour answers:\n"+youranswers);
       System.out.println("Answer key:\n1 (B)\n2 (B)\n3 (C)\n4 (A)\n5 (B)\n6 (D)\n7 (C)\n8 (C)\n9 (C)\n10 (B)");       
    }  
 public void LIGHT()
    {
       System.out.println("Chapter 7: Light"); 
            
           System.out.println("Q1-If in normal conditions angle i is 30 degree then what's the value of  angle r?");
        System.out.println("1 - 90 degree");
        System.out.println("2 - 30 degree ");
        System.out.println("3 - 0 degree");
        System.out.println("4 - 60 degree");
         answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)"; //better accessibility
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "1 " + answer + "\n";
       if (answer.equals("(B)")) score+= 1;       
        
        
       System.out.println("Q2-Real images are formed by____ mirror?");
        System.out.println("1 - convex ");
        System.out.println("2 - concave");
        System.out.println("3 - plane");
        System.out.println("4 - surface");
       answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "2 " + answer + "\n";
       if (answer.equals("(B)")) score+= 1;
        
        
         System.out.println("Q3-Image formed by a plane mirror is ___");
        System.out.println("1-real");
        System.out.println("2-virtual");
        System.out.println("3-virtual with lateral inversion ");
        System.out.println("4-real with lateral inversion  "); 
        answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "3 " + answer + "\n";
       if (answer.equals("(C)")) score+= 1;
        
       
        System.out.println("Q4-If two mirrors are kept perdicular then --- images are formed ?");
        System.out.println("1 - 3");
        System.out.println("2 - 1 ");
        System.out.println("3 - 4 ");
        System.out.println("4 - 2");
       answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "4 " + answer + "\n";
       if (answer.equals("(A)")) score+= 1;
 
       
      System.out.println("Q5-Real and enlarged image can be obtained using ---- mirror?");
        System.out.println("1 - convex ");
        System.out.println("2 - concave ");
        System.out.println("3 - plane");
        System.out.println("4 - all of the above");
        answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "5 " + answer + "\n";
       if (answer.equals("(B)")) score+= 1;
        
           
        System.out.println("Q6-Image formed by convex mirror is____?");
        System.out.println("1 - erect and diminished ");
        System.out.println("2 -erect");
        System.out.println("3 -inverted");
        System.out.println("4 - dimished and inverted ");
        answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "6 " + answer + "\n";
       if (answer.equals("(D)")) score+= 1;
       
       
           
        System.out.println("Q7-Focal length of convex mirror is 10cm . Find Radius of Curvature.");
        System.out.println("1 - 10cm ");
        System.out.println("2 - 5cm ");
        System.out.println("3 - 20cm");
        System.out.println("4 - 30cm");
       answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "7 " + answer + "\n";
       if (answer.equals("(C)")) score+= 1;
       
        
    System.out.println("Q8-Radius of curvature is 40cm .Find Focal length:.");
        System.out.println("1 -20cm");
        System.out.println("2 -80cm ");
        System.out.println("3 -8cm");
        System.out.println("4 -4cm");
        answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "8 " + answer + "\n";
       if (answer.equals("(A)")) score+= 1;

     
     
               System.out.println("Q9-f=____?");
        System.out.println("1 -  2R ");
        System.out.println("2 - (1/4)R ");
        System.out.println("3 - (1/2)R");
        System.out.println("4 - 4R");
     answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "9 " + answer + "\n";
       if (answer.equals("(C)")) score+= 1;
       
   
     System.out.println("Q10-If 2 mirrors are placed making an angle 60 degree in between .The Number of images formed will be__");
        System.out.println("1 - 3 ");
        System.out.println("2 - 5");
        System.out.println("3 - 6");
        System.out.println("4 - 12 ");
       answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "10 " + answer + "\n";
       if (answer.equals("(B)")) score+= 1;
       
       switch(score)
       {
           case 0: analysis = "Extremely poor! Start studying seriously"; break;
           case 1: analysis = "Poor performance. Please work harder"; break;
           case 2: analysis = "Not upto the mark. Revise more"; break;
           case 3: analysis = "You need to work on your study patterns and habits"; break;
           case 4: analysis = "You can surely do much better. Study smart and not just hard!"; break;
           case 5: analysis = "Decent performance. Practise more and you will surely score well"; break;
           case 6: analysis = "Good, but \'Ye dil maange more\'!"; break;
           case 7: analysis = "Great work! Keep revising"; break;
           case 8: analysis = "Very good! Just work a bit more and you can get full marks!"; break;
           case 9: analysis = "Almost perfect! Try to avoid silly mistakes and brush up a few concepts which you might have missed.."; break;
           case 10: analysis = "Perfect score! Hurray!! Keep revising the same way to maintain consistent scores!"; break;
       }
       System.out.println("Score: "+score+"/10\nPercentage: "+((double)score/10.0*100.0)+" %\nAnalysis: "+analysis); 
       System.out.println("\nYour answers:\n"+youranswers);
       System.out.println("Answer key:\n1 (B)\n2 (B)\n3 (C)\n4 (A)\n5 (B)\n6 (D)\n7 (C)\n8 (A)\n9 (C)\n10 (B)");
       
    }
}