import java.util.*;

public class Literature {
    Scanner object = new Scanner(System.in); //global variables
    int score, choice = 0; double percent = 0.0; String analysis = "", answer, youranswers = "";
    public void AFITD() { // a face in the dark (ruskin  bond)
System.out.println("Chapter 5: A Face In The Dark"); 
       System.out.println("Question 1: How far  was the Simla Bazaar from the school Mr Oliver taught at?");//Question 1
       System.out.println("(A) Five Kilometres\n(B) 3 Miles \n(C) 4 Miles\n(D) 3 Kilometres");//Options for 1
       answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)"; //better accessibility
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "1 " + answer + "\n";
       if (answer.equals("(B)")) score+= 1;       
       
       System.out.println("Question 2: What kind of a man was Mr Oliver?");//Question 2
       System.out.println("(A) Underconfident\n(B) Confident and Grounded in Reality\n(C) Believed in Supernatural Occurances and Nervous\n(D) Imaginative and Got Easily Scared");//Options for 2
       answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "2 " + answer + "\n";
       if (answer.equals("(B)")) score+= 1;
       
       System.out.println("Question 3: Why did Mr Oliver move closer to the boy he saw sitting on a rock?");//Question 3
       System.out.println("(A) To investigate why the boy was there\n(B) To recognise the troublemaker\n(C) Both (A) and (B)\n(D) To console the boy");//Options for 3
       answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "3 " + answer + "\n";
       if (answer.equals("(C)")) score+= 1;
       
       System.out.println("Question 4: Why would most people mainly stick to the main road in these areas?");//Question 4
       System.out.println("(A) Scary eerie sounds made by pine trees would scare them\n(B) A dangerous creature had been spotted in the woods\n(C) There was a rumor about the trees attacking people\n(D) The uneven ground surface in the woods made it difficult to travel there");//Options for 4
       answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "4 " + answer + "\n";
       if (answer.equals("(A)")) score+= 1;
       
       System.out.println("Question 5: What made Mr Oliver uneasy?");//Question 5
       System.out.println("(A) The boy had no eyes, ears, nose or mouth\n(B) The boy started laughing uncontrollably\n(C) The boy's convulsive shaking while crying\n(D) The boy had the face of a wolf");//Options for 5
       answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "5 " + answer + "\n";
       if (answer.equals("(C)")) score+= 1;
       
       System.out.println("Question 6: Where was Mr Oliver going to at late night?");//Question 6
       System.out.println("(A) His house\n(B) The woods\n(C) The school\n(D) None of the above");//Options for 6
       answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "6 " + answer + "\n";
       if (answer.equals("(C)")) score+= 1;
       
       System.out.println("Question 7: Who said these lines 'No eyes, nose, mouth- Nothing!'?");//Question 7
       System.out.println("(A) The boy\n(B) The watchman\n(C) The school principal\n(D) Mr Oliver");//Options for 7
       answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "7 " + answer + "\n";
       if (answer.equals("(D)")) score+= 1;
       
       System.out.println("Question 8: What did Mr Oliver feel for the boy?");//Question 8
       System.out.println("(A) Anger\n(B) Both (A) and (C)\n(C) Concern\n(D) Sadness");//Options for 8
       answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "8 " + answer + "\n";
       if (answer.equals("(B)")) score+= 1;
       
       System.out.println("Question 9: According to the author when should the story have ended?");//Question 9
       System.out.println("(A) When Mr Oliver ran from the boy\n(B) When Mr Oliver saw the boy's face\n(C) When the torch fell from Mr Oliver's hands\n(D) None of these");//Options for 9
       answer = object.next();
       if (answer.equals("A")|| answer.equals("a") || answer.equals("(A)") || answer.equals("(a)") ||answer.equals("1")) answer = "(A)";
       if (answer.equals("B")|| answer.equals("b") || answer.equals("(B)") || answer.equals("(b)") ||answer.equals("2")) answer = "(B)";
       if (answer.equals("C")|| answer.equals("c") || answer.equals("(C)") || answer.equals("(c)") ||answer.equals("3")) answer = "(C)";
       if (answer.equals("D")|| answer.equals("d") || answer.equals("(D)") || answer.equals("(d)") ||answer.equals("4")) answer = "(D)";
       youranswers+= "9 " + answer + "\n";
       if (answer.equals("(B)")) score+= 1;
       
       System.out.println("Question 10:Life Magazine had once called the school");//Question 10
       System.out.println("(A) Eton of the West\n(B) Indian Harvard\n(C) Eton of the East(D) Indian Gordonstoun");//Options for 10
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
}
