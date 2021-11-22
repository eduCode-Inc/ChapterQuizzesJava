import java.util.Scanner;
public class Chemistry
{        
    Scanner object = new Scanner(System.in);
    int score, choice = 0; double percent = 0.0; String analysis = "", answer, youranswers = "";//Instance variables for class 'Chemistry'
    public void PeriodicTable()
    {       
       System.out.println("Chapter 5: The Periodic Table");
       System.out.println("Question 1: Which of these do not form Dobereiner's Triads?");//Question 1
       System.out.println("(A) Li, Na, K\n(B) Cl, Br, I\n(C) Ca, Sr, Ba\n(D) H, He, Li");//Options for 1
       answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "1 " + answer + "\n";
       if (answer.equals("(D)")) score+= 1;
       
       System.out.println("Question 2: Which of the following groups of elements was not included in Newland's series of eight?");//Question 2
       System.out.println("(A) Alkali metals\n(B) Noble gases\n(C) Halogens\n(D) None of the above");//Options for 2
       answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "2 " + answer + "\n";
       if (answer.equals("(B)")) score+= 1;
       
       System.out.println("Question 3: Which of the following groups of elements show maximum electron affinity?");//Question 3
       System.out.println("(A) Alkali metals\n(B) Noble gases\n(C) Halogens\n(D) Alkaline Earth Metals");//Options for 3
       answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "3 " + answer + "\n";
       if (answer.equals("(C)")) score+= 1;
       
       System.out.println("Question 4: The distance between the centre of the nucleus and the outermost shell is maximum in which of the following elements?");//Question 4
       System.out.println("(A) Beryllium\n(B) Carbon\n(C) Boron\n(D) Silicon");//Options for 4
       answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "4 " + answer + "\n";
       if (answer.equals("(D)")) score+= 1;
       
       System.out.println("Question 5: Which of the following groups or series is incorrectly matched with its properties?");//Question 5
       System.out.println("(A) Group I A - Form bases on reaction with water\n(B) Group VII A - React with bases to form salts\n(C) Lanthanide series: Radioactive\n(D) Both (A) and (B)");//Options for 5
       answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "5 " + answer + "\n";
       if (answer.equals("(C)")) score+= 1;
       
       System.out.println("Question 6: Which of the following statements is false?");//Question 6
       System.out.println("(A) Each isotope has different arrangement of atoms in its molecule\n(B) There is a decrease in electronegativity as we move down a sub-group\n(C) Copper (Cu) is a transition metal\n(D) Aluminium is a weak metal");//Options for 6
       answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "6 " + answer + "\n";
       if (answer.equals("(A)")) score+= 1;
       
       System.out.println("Question 7: Name the noble gas with an electronic configuration of 2,8,18,8");//Question 7
       System.out.println("(A) Helium\n(B) Argon\n(C) Neon\n(D) Krypton");//Options for 7
       answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "7 " + answer + "\n";
       if (answer.equals("(D)")) score+= 1;
       
       System.out.println("Question 8: According to Dmitri, Scandium had properties similar to which element?");//Question 8
       System.out.println("(A) Boron\n(B) Aluminium\n(C) Silicon\n(D) Calcium");//Options for 8
       answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "8 " + answer + "\n";
       if (answer.equals("(A)")) score+= 1;
       
       System.out.println("Question 9: Which of the following statements about Halogens is incorrect?");//Question 9
       System.out.println("(A) Chlorine is the most 'abundant' halogen and is added to the water supply to prevent tooth decay\n(B) Flourine is the most reactive halogen\n(C) Bromine is the only non-metal which is liquid at room temperature\n(D) All of these");//Options for 9
       answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "9 " + answer + "\n";
       if (answer.equals("(A)")) score+= 1;
       
       System.out.println("Question 10: The atomicity of elements of which of the following groups is two?");//Question 10
       System.out.println("(A) Alkalis\n(B) Halogens\n(C) Alkaline Earth Metals\n(D) None of the above");//Options for 10
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
       System.out.println("Answer key:\n1 (D)\n2 (B)\n3 (C)\n4 (D)\n5 (C)\n6 (A)\n7 (D)\n8 (A)\n9 (A)\n10 (B)");
    }
    public void Hydrogen()
    {
       System.out.println("Chapter 6: Study of the First Element - Hydrogen");       
    }
    public void GasLaws()
    {
       System.out.println("Chapter 7: Study of Gas Laws"); 
    }
    public void main(String args[])
    {                     
       Chemistry chapter = new Chemistry(); //Creates object for class 'Chemistry'
       System.out.println("ICSE Chemistry Class 9: Semester II\nEnter chapter number based on index given below to attempt a test on the chapter");
       System.out.println("5 - The Periodic Table\n6 - Study of the First Element - Hydrogen\n7 - Study of Gas Laws"); //Index based on Simplified ICSE Chemistry by Viraf J Dalal
       System.out.println("Enter chapter number");       
       choice = object.nextInt(); //Accepts input as int through Scanner object 
       switch (choice)
       {
           case 5: chapter.PeriodicTable(); break;
           case 6: chapter.Hydrogen(); break;
           case 7: chapter.GasLaws(); break;
       }             
    }    
}
