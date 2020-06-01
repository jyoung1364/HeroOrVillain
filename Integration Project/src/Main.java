import java.util.Scanner;
import java.util.Random;

// Jimmy Young
/*
 * /Users will answers questions that relate to their personality, which will determine if they are
 * a hero, villain.
 */
// A variable is a container that holds values that are used in a Java program
// When managing a variable's visibility or accessibility, the term scope is used.
// Byte- 8-bit signed two's complement integer. Can be used for saving money in large arrays
// Short- 16-bit signed two's complement integer
// Int- 32-bit signed two's complement integer. Integer class. Whole numbers only
// Long- used when you need a range of values wider than int
// Float-Use if you need to save money in large arrays of floaring point numbers
// Double-Numbers and default choice is for decimal values
// Boolean- Only values are true and false
/*
 * I don't need the Math class for my quiz. It includes Math.PI, which brings the value of PI,
 * Math.abs, which gives the absolute value, and Math.sqrt which gives the square root of a number
 */
// Precedence order- When two operators share an operand, the operator with the high operand goes
// first. EX- 1+2*3 is 1 +(2*3) because multiplication has a higher precedence than addition.
public class Main {
  public static void main(String[] args) {
    //
    System.out.println("Welcome to the Hero/Villain Personality Test!");
    System.out.println("This personality test will determine if you are a hero or villain");
    final int TOTALQUESTIONS = 11; // The number of questions won't change
    int heroPoints = 0;
    // These points determine how much of a hero you are
    int villainPoints = 0;
    // These points determine how much of a villain you are
    // double ratio = (double) heroPoints / villainPoints;
    // This number will determine if you are a hero or villain
    boolean isHero;
    // This is for a true or false question
    // System.out.println(ratio);
    // There are 11 questions in total
    Scanner scan = new Scanner(System.in);
    // These will be the 11 questions to decide whether the user is a hero, villain, or anti-hero
    String question;
    question = "Would you rather take control of the world or defend the world?";
    System.out.println(question);
    String answer = scan.nextLine(); // scan.nextLine is a method that asks for input from the user
                                     // and using the set of parenthesis is how you call the method
    if (answer.equals("take control")) {
      villainPoints = 1;
    } else {
      heroPoints = 1;
    }
    System.out.println(villainPoints);
    System.out.println(heroPoints);
    question = "If you find a million dollars, will you keep it or turn it in?";
    System.out.println(question);
    answer = scan.nextLine();
    if (answer.equals("keep it")) {
      villainPoints++;
    } else {
      heroPoints++;
    }
    System.out.println(villainPoints);
    System.out.println(heroPoints);
    question = "If you have to stop a villain, would you apprehend them or kill them?";
    System.out.println(question);
    answer = scan.nextLine();
    if (answer.equals("kill them")) {
      villainPoints++;
    } else {
      heroPoints++;
    }
    System.out.println(villainPoints);
    System.out.println(heroPoints);
    question = "Would you use your super powers as an enhancer in sports?";
    System.out.println(question);
    answer = scan.nextLine();
    if (answer.equals("yes")) {
      villainPoints++;
    } else {
      heroPoints++;
    }
    System.out.println(villainPoints);
    System.out.println(heroPoints);
    question = "Your weapon in a fight would be... a gun, shield, fists, or sword?";
    System.out.println(question);
    answer = scan.nextLine();
    if (answer.equals("gun") || answer.equals("sword")) {
      villainPoints++;
    } else {
      heroPoints++;
    }
    System.out.println(villainPoints);
    System.out.println(heroPoints);
    question = "Who would like to team up with in a fight?";
    System.out.println(question);
    System.out.println("Batman, Joker, Flash, or Gorilla Grodd?");
    // options would be A. Dr.Doom, B. Batman, C. Deadpool
    answer = scan.nextLine();
    switch (answer) {
      case "Batman":
        heroPoints++;
        break;// A break statement immediately terminates the loop and the program control resumes
      case "Joker":
        villainPoints++;
        break;
      case "Flash":
        heroPoints++;
        break;
      case "Gorilla Grodd":
        villainPoints++;
        break;
    }
    System.out.println(villainPoints);
    System.out.println(heroPoints);
    question =
        "If some normal people disliked you, would you use your powers to protect normal people or would you make them suffer ";
    System.out.println(question);
    answer = scan.nextLine();
    if (answer.equals("make them suffer")) {
      villainPoints++;
    } else {
      heroPoints++;
    }
    System.out.println(villainPoints);
    System.out.println(heroPoints);
    question = "Have you lived a good life or has it been miserable?";
    System.out.println(question);
    answer = scan.nextLine();
    if (answer.equals("miserable")) {
      villainPoints++;
    } else {
      heroPoints++;
    }
    System.out.println(villainPoints);
    System.out.println(heroPoints);
    question = "Would you take your anger out on people or go get help?";
    System.out.println(question);
    answer = scan.nextLine();
    if (answer.equals("get help")) {
      heroPoints++;
    } else {
      villainPoints++;
    }
    System.out.println(villainPoints);
    System.out.println(heroPoints);
    question = "Are you a rule follower or rule breaker?";
    System.out.println(question);
    answer = scan.nextLine();
    if (answer.equals("rule breaker")) {
      villainPoints++;
    } else {
      heroPoints++;
    }
    System.out.println(villainPoints);
    System.out.println(heroPoints);
    question =
        "You see someone getting robbed, but then you notice it's your old bully getting robbed. Do you help them or let them suffer?";
    System.out.println(question);
    answer = scan.nextLine();
    if (answer.equals("let them suffer")) {
      villainPoints++;
    } else {
      heroPoints++;
    }
    System.out.println(villainPoints);
    System.out.println(heroPoints);
    System.out.println(
        "You will be given a random number between 1 and 10 that will contribute to either your hero points or villain points");
    System.out.println(
        "If the number is greater than 5 you will receive villain points and if not, you'll receive villain points");
    Random randomGen = new Random();
    int token;
    for (int counter = 1; counter == 1; counter++) {
      token = randomGen.nextInt(10);
      System.out.println("Your number is:" + " " + token);
      if (token > 5) {
        villainPoints++;
      } else {
        heroPoints++;
      }
      System.out.println("You have" + " " + villainPoints + " " + "Villain Points");
      System.out.println("You have" + " " + heroPoints + " " + "Hero Points");
    }
    while (heroPoints > villainPoints) {
      System.out.println("You have more heroic traits than villainous traits");
    }
    while (villainPoints > heroPoints) {
      System.out.println("You have more villainous traits than hero traits");
    }
    String result;
    result = (heroPoints > villainPoints) ? "Hero" : "Villain";
    System.out.println("Welcome to the " + " " + result + " " + "Club");
  }

  public static int calculateMissions(int mission) { // int mission is the parameter and the header
                                                     // is "public static int" since it defines the
                                                     // code at the beginning
    System.out.println("Before we start, here is a demonstration on how to use the Math class");
    int slice = 9;
    System.out.println(Math.sqrt(slice)); // This prints the square root of slice. Math.sqrt finds
                                          // the square root of numbers.
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter a number between 1 and 10");
    int level = scan.nextInt();
    // this will determine how many missions they will have
    for (int i = 1; i <= level; i++) {
      System.out.print("The list of missions you'll have are \n " + " " + i);
      mission = i;
    }
    scan.close();
    return mission;
  }
}


