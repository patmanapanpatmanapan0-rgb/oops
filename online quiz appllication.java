import java.util.Scanner;

public class OnlineQuizApplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int score = 0;
        int answer;

        System.out.println("================================");
        System.out.println("       ONLINE QUIZ APPLICATION");
        System.out.println("================================");

        // Question 1
        System.out.println("\n1. Which language is used for Android development?");
        System.out.println("1. Python");
        System.out.println("2. Java");
        System.out.println("3. HTML");
        System.out.println("4. SQL");
        System.out.print("Enter your answer: ");
        answer = sc.nextInt();

        if (answer == 2)
            score++;

        // Question 2
        System.out.println("\n2. Which is the brain of a computer?");
        System.out.println("1. RAM");
        System.out.println("2. Hard Disk");
        System.out.println("3. CPU");
        System.out.println("4. Keyboard");
        System.out.print("Enter your answer: ");
        answer = sc.nextInt();

        if (answer == 3)
            score++;

        // Question 3
        System.out.println("\n3. What does HTML stand for?");
        System.out.println("1. Hyper Text Markup Language");
        System.out.println("2. High Text Machine Language");
        System.out.println("3. Hyper Tool Markup Language");
        System.out.println("4. Home Text Markup Language");
        System.out.print("Enter your answer: ");
        answer = sc.nextInt();

        if (answer == 1)
            score++;

        // Question 4
        System.out.println("\n4. Which data structure uses FIFO?");
        System.out.println("1. Stack");
        System.out.println("2. Queue");
        System.out.println("3. Tree");
        System.out.println("4. Graph");
        System.out.print("Enter your answer: ");
        answer = sc.nextInt();

        if (answer == 2)
            score++;

        // Question 5
        System.out.println("\n5. Which symbol is used for comments in Java?");
        System.out.println("1. //");
        System.out.println("2. ##");
        System.out.println("3. <!-- -->");
        System.out.println("4. **");
        System.out.print("Enter your answer: ");
        answer = sc.nextInt();

        if (answer == 1)
            score++;

        // Result
        System.out.println("\n================================");
        System.out.println("             RESULT");
        System.out.println("================================");
        System.out.println("Total Questions : 5");
        System.out.println("Correct Answers : " + score);
        System.out.println("Wrong Answers   : " + (5 - score));
        System.out.println("Score           : " + score + "/5");

        if (score >= 3)
            System.out.println("Status          : PASS");
        else
            System.out.println("Status          : FAIL");

        System.out.println("================================");

        sc.close();
    }
}



OUTPUT:
================================
       ONLINE QUIZ APPLICATION
================================

1. Which language is used for Android development?
1. Python
2. Java
3. HTML
4. SQL
Enter your answer: 2

2. Which is the brain of a computer?
1. RAM
2. Hard Disk
3. CPU
4. Keyboard
Enter your answer: 3

3. What does HTML stand for?
1. Hyper Text Markup Language
2. High Text Machine Language
3. Hyper Tool Markup Language
4. Home Text Markup Language
Enter your answer: 1

4. Which data structure uses FIFO?
1. Stack
2. Queue
3. Tree
4. Graph
Enter your answer: 2

5. Which symbol is used for comments in Java?
1. //
2. ##
3. <!-- -->
4. **
Enter your answer: 1

================================
             RESULT
================================
Total Questions : 5
Correct Answers : 5
Wrong Answers   : 0
Score           : 5/5
Status          : PASS
================================