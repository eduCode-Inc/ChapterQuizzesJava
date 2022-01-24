import java.util.*;

public class Geography {
        Scanner object = new Scanner(System.in); //global variables
        int score, choice = 0; double percent = 0.0; String analysis = "", answer, youranswers = "";

        public void Insolation() {
            System.out.println("Chapter 13: Insolation");
            System.out.println("Question 1: How many types of Insolation are there?");
            System.out.println("(A) 2\n(B) 3\n(C) 4\n(D) 5");
            answer = object.next();
            if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)"; //better accessibility
            if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
            if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
            if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
            youranswers+= "1 " + answer + "\n";
            if (answer.equals("(A)")) score+= 1;//checking for correct answer

            System.out.println("Question 2: How much of the sun's energy is absorbed by atmospheric layers?");
            System.out.println("(A) 35%\n(B) 14%\n(C) 51%\n(D) 52%");
            answer = object.next();
            if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)"; //better accessibility
            if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
            if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
            if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
            youranswers+= "1 " + answer + "\n";
            if (answer.equals("(B)")) score+= 1;//checking for correct answer

            System.out.println("Question 3: How many units of the earth's radiation does the atmosphere absorb? ");
            System.out.println("(A) 34\n(B) 35\n(C) 38\n(D) 41");
            answer = object.next();
            if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)"; //better accessibility
            if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
            if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
            if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
            youranswers+= "1 " + answer + "\n";
            if (answer.equals("(A)")) score+= 1;//checking for correct answer

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
            System.out.println("Answer key");
        }
        public void main(String[] args) {
            Geography test = new Geography();
            System.out.println("Total Geography ICSE Class 9: Semester II\nEnter chapter number based on index given below to attempt a test on the chapter");
            System.out.println("13-Insolation\n");
            System.out.print("Enter chapter number: ");
            choice = object.nextInt();
            switch (choice) {
                case 13: test.Insolation(); break;
            }
        }
}