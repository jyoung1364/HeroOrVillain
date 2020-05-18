import java.util.Scanner;

// Jimmy Young
/*
 * /Users will answers questions that relate to their personality, which will determine if they are
 * a hero, villain. 
 */
 // A variable is a container that holds values that are used in a Java program
 // When managing a variable's visibility or accessibility, the term scope is used. 
public class Main {

  public static void main(String[] args) {
    //
    System.out.println("Welcome to the Hero/Villain Personality Test!");
    System.out.println("This personality test will determine if you are a hero or villain");
    final int totalQuestions = 11; //The number of questions won't change
    int heroPoints = 6;
    //These points determine how much of a hero you are
    int villainPoints = 5;
    //These points determine how much of a villain you are
    double ratio = (double) heroPoints / villainPoints;
    //This number will determine if you are a hero or villain
    boolean isHero;
    //This is for a true or false question
    

    System.out.println(ratio);
    // There are 11 questions in total
    Scanner scan = new Scanner(System.in);
    // These will be the 11 questions to decide whether the user is a hero, villain, or anti-hero
    String question = "Light or Dark?";
    System.out.println(question);
    question = "If you find a million dollars, will you keep it or turn it in?";
    System.out.println(question);
    question = "If you have to stop a villain, would you apprehend them or kill them?";
    System.out.println(question);
    question = "Would you use your super powers as an enhancer in sports?";
    System.out.println(question);
    question = "Your weapon in a fight would be...";
    System.out.println(question);
    // options would be A.gun B.bo staff c.shield d. fists
    question = "Who would like to team up with in a fight?";
    System.out.println(question);
    // options would be A. Dr.Doom, B. Batman, C. Deadpool
    question = "If some normal people disliked you, would you use your powers to protect normal people or would you let them suffer ";
    System.out.println(question);
    question = "Have you lived a good life or has it been miserable?";
    System.out.println(question);
    question = "How would you take out your anger?";
    System.out.println(question);
    question = "When you see rules, what are your ideal thoughs?";
    System.out.println(question);
    question = "You see someone getting robbed, but then you notice it's your old bully getting robbed. What do you do?";
    System.out.println(question);




  }

}
