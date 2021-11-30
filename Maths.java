import java.util.Scanner;
public class Maths
{
    Scanner object = new Scanner(System.in); //global variables
    int score, choice = 0; double percent = 0.0; String analysis = "", answer, youranswers = "";//Instance variables for class 'Maths'
    public void RectilinearFigures()
    {
       System.out.println("Chapter 13: Rectilinear Figures"); 
       System.out.println("Question 1: Which of the following terms is incorrectly matched with its definition?");//Question 1
       System.out.println("(A) Simple curve - A curve which does not cross itself at any point\n(B) Rectilinear figure - A plane curve made up entirely of line segments\n(C) Closed curve - A curve which has seperate beginning and end points\n(D) Parallelogram - A quadrilateral whose diagonals bisect each other");//Options for 1
       answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)"; //better accessibility
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "1 " + answer + "\n";
       if (answer.equals("(C)")) score+= 1;       
       
       System.out.println("Question 2: ABCD is a rectangle whose diagonals intersect at O. If Angle OAB = 35 degrees; find:\n(i) Angle OBC\n(ii) Angle COD");//Question 2
       System.out.println("(A) (i) 35 degrees; (ii) 70 degrees\n(B) (i) 35 degrees; (ii) 110 degrees\n(C) (i) 55 degrees; (ii) 70 degrees\n(D) (i) 55 degrees; (ii) 110 degrees");//Options for 2
       answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "2 " + answer + "\n";
       if (answer.equals("(D)")) score+= 1;
       
       System.out.println("Question 3: The bisectors of angles of a parallelogram forms a");//Question 3
       System.out.println("(A) Trapezium\n(B) Rectangle\n(C) Rhombus\n(D) Kite");//Options for 3
       answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "3 " + answer + "\n";
       if (answer.equals("(B)")) score+= 1;
       
       System.out.println("Question 4: The diagonals AC and BD of a parallelogram ABCD intersect each other at the point O. If Angle DAC = 32 degrees and Angle AOB = 70 degrees, then Angle DBC is equal to");//Question 4
       System.out.println("(A) 38 degrees\n(B) 86 degrees\n(C) 24 degrees\n(D) 32 degrees");//Options for 4
       answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "4 " + answer + "\n";
       if (answer.equals("(A)")) score+= 1;
       
       System.out.println("Question 5: The sides BA and DC of quadrilateral ABCD are produced to points E and F respectively. If Angle BCF = a, Angle DAE = b, Angle ABC = x and Angle ADC = y; then");//Question 5
       System.out.println("(A) x + y = a + b\n(B) x - y = a - b\n(C) (x - y)/2 = a - b\n(D) 2(x + y) = a + b");//Options for 5
       answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "5 " + answer + "\n";
       if (answer.equals("(A)")) score+= 1;
       
       System.out.println("Question 6: In a quadrilateral ABCD, the line segments bisecting Angle C and Angle D meet at point E. Then Angle A + Angle B is equal to");//Question 6
       System.out.println("(A) Angle CED\n(B) 1/2 of Angle CED\n(C) 2 times of Angle CED\n(D) None of the above");//Options for 6
       answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "6 " + answer + "\n";
       if (answer.equals("(C)")) score+= 1;
       
       System.out.println("Question 7: If APB and CQD are two parallel lines, then the bisectors of the angles APQ, BPQ, CQP and PQD form");//Question 7
       System.out.println("(A) Kite\n(B) Rhombus\n(C) Trapezium\n(D) Rectangle");//Options for 7
       answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "7 " + answer + "\n";
       if (answer.equals("(D)")) score+= 1;
       
       System.out.println("Question 8: ABCD is a parallelogram. If AB is produced to E such that ED bisects BC at O. Then which of the following is correct?");//Question 8
       System.out.println("(A)  AB = OE\n(B) AB = BE\n(C) OE = OC\n(D) None of these");//Options for 8
       answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "8 " + answer + "\n";
       if (answer.equals("(B)")) score+= 1;
       
       System.out.println("Question 9: If the angles of a quadrilateral are in the ratio 1 : 2 : 3 : 4. Then, the measure of angles in descending order are");//Question 9
       System.out.println("(A) 36 degrees, 108 degrees, 72 degrees, 144 degrees\n(B) 144 degrees, 108 degrees, 72 degrees, 36 degrees\n(C) 36 degrees, 72 degrees, 108 degrees, 144 degrees\n(D) None of these");//Options for 9
       answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "9 " + answer + "\n";
       if (answer.equals("(B)")) score+= 1;
       
       System.out.println("Question 10: D and E are the mid-points of the sides AB and AC, respectively of triangle ABC. DE is produced to F. To prove that CF is equal and parallel to DA, we need an additional information which is");//Question 10
       System.out.println("(A) Angle DAE = Angle EFC\n(B) AE = EF\n(C) DE = EF\n(D) Angle ADE = Angle ECF");//Options for 10
       answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "10 " + answer + "\n";
       if (answer.equals("(C)")) score+= 1;
       
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
    public void TheoremsonArea()
    {
       System.out.println("Chapter 14: Theorems on Area"); 
    }
    public void TrigonometricalRatios()
    {
       System.out.println("Chapter 17: Trigonometrical Ratios"); 
       System.out.println("Question 1: Simplify: (1 - sin x * sin x)/(1 - cos x * cos x)");//Question 1
       System.out.println("(A) 1\n(B) cosec x * cosec x\n(C) cot x\n(D) None of the above");//Options for 1
       answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "1 " + answer + "\n";
       if (answer.equals("(D)")) score+= 1;
       
       System.out.println("Question 2: If tan A = x/y, then cos A is equal to");//Question 2
       System.out.println("(A) x/(_/(x*x + y*y))\n(B) y/(_/(x*x + y*y))\n(C) (x*x - y*y)/(_/(x*x + y*y))\n(D) (x*x - y*y)/(x*x + y*y)\nNOTE: Here '_/' stands for root of");//Options for 2
       answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "2 " + answer + "\n";
       if (answer.equals("(B)")) score+= 1;
       
       System.out.println("Question 3: If cosec x = 13/12, then the value of tan x is");//Question 3
       System.out.println("(A) 12/5\n(B) 5/12\n(C) 5/13\n(D) 13/5");//Options for 3
       answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "3 " + answer + "\n";
       if (answer.equals("(A)")) score+= 1;
       
       System.out.println("Question 4: If sin x = a/b, then cos x is equal to");//Question 4
       System.out.println("(A) b/(_/(b*b - a*a))\n(B) b/a\n(C) (_/(b*b - a*a))/b\n(D) a/(_/(b*b - a*a))");//Options for 4
       answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "4 " + answer + "\n";
       if (answer.equals("(C)")) score+= 1;
       
       System.out.println("Question 5: If sin A = 1/2, then the value of cot A is");//Question 5
       System.out.println("(A) _/3\n(B) 1/(_/3)\n(C) (_/3)/2\n(D) 1");//Options for 5
       answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "5 " + answer + "\n";
       if (answer.equals("(A)")) score+= 1;
       
       System.out.println("Question 6: If cos A = 4/5, then the value of tan A is");//Question 6
       System.out.println("(A) 3/5\n(B) 3/4\n(C) 4/3\n(D) 5/3");//Options for 6
       answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "6 " + answer + "\n";
       if (answer.equals("(B)")) score+= 1;
       
       System.out.println("ABC is a right angled triangle right angled at B; AB = 24 cm and BC = 7 cm. Using this answer Question 7 to 9");
       
       System.out.println("The value of tan A + cot C is");//Question 7
       System.out.println("(A) 7/12\n(B) 12/7\n(C) 14/25n(D) 25/12");//Options for 7
       answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "7 " + answer + "\n";
       if (answer.equals("(A)")) score+= 1;
       
       System.out.println("Question 8: The value of 2 cos A - sin C is");//Question 8
       System.out.println("(A) 25/24\n(B) 24/25\n(C) 41/25\n(D) 49/25");//Options for 8
       answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "8 " + answer + "\n";
       if (answer.equals("(A)")) score+= 1;
       
       System.out.println("Question 9: The value of sin A is");//Question 9
       System.out.println("(A) 7/24\n(B) 7/25\n(C) 25/7\n(D) 24/25");//Options for 9
       answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "9 " + answer + "\n";
       if (answer.equals("(B)")) score+= 1;
       
       System.out.println("Question 10: ABC is right angled at A. If AB = 6 cm and BC = 10 cm, the value of sin B cos C + sin C cos B is");//Question 10
       System.out.println("(A) 0\n(B) 1\n(C) 5/3\n(D) 2");//Options for 10
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
       System.out.println("Answer key:\n1 (D)\n2 (B)\n3 (A)\n4 (C)\n5 (A)\n6 (B)\n7 (A)\n8 (A)\n9 (B)\n10 (B)");
    }
    public void TrigonometricalRatiosofStandardAngles()
    {
       System.out.println("Chapter 18: Trigonometrical Ratios of Standard Angles"); 
    }
    public void main(String args[])
    {                     
       Maths chapter = new Maths(); //Creates object for class 'Maths'
       System.out.println("ICSE Mathematics Class 9: Semester II\nEnter chapter number based on index given below to attempt a test on the chapter");
       System.out.println("13 - Rectilinear Figures\n14 - Theorems on Area\n17 - Trigonometrical Ratios\n18 - Trigonometrical Ratios of Standard Angles"); //Index based on Understanding ICSE Mathematics by ML Aggarwal
       System.out.println("Enter chapter number");       
       choice = object.nextInt(); //Accepts input as int through Scanner object 
       switch (choice)
       {
           case 13: chapter.RectilinearFigures(); break;
           case 14: chapter.TheoremsonArea(); break;
           case 17: chapter.TrigonometricalRatios(); break;
           case 18: chapter.TrigonometricalRatiosofStandardAngles(); break;
       }             
    }   
}
