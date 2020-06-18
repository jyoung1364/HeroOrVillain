import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

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
/*
 * Classes can be derived from other classes, thereby inheriting fields and methods from those
 * classes A class derived from another class is a subclass. This is known as inheritance
 */
/*
 * Polymorphism is when subclasses of a class can define their own unique behaviors and still share
 * some of the same functionality of the parent class It's the ability of an object to take on many
 * forms
 */

/** test.
 * @author pwrji Hero or villain
 */
public class Main {

  private static Random scan;

  /**Main method.
   * @return 
   */
  public static void main(String[] args) {
    //
    System.out.println("Welcome to the Hero/Villain Personality Test!");
    System.out.println("This personality test will determine if you are a hero or villain");
    System.out
        .println("To get significant result type out the answer that corresponds to the letter");
    final int Total_Questions = 11; // The number of questions won't change
    int heroPoint = 0;
    double heroPoints = heroPoint; // this is an example of casting. I turned an int into a double
    // These points determine how much of a hero you are
    int villainPoint = 0;
    double villainPoints = villainPoint;
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
    question = "Would you rather? A. take control of the world or B. defend the world?";
    System.out.println(question);
    String answer = scan.nextLine(); // scan.nextLine is a method that asks for input from the user
    // and using the set of parenthesis is how you call the method
    if (answer.equals("A")) {
      villainPoints = 1;
    } else {
      heroPoints = 1;
    }
    System.out.println(villainPoints);
    System.out.println(heroPoints);
    question = "If you find a million dollars, will you A. keep it or B. turn it in?";
    System.out.println(question);
    answer = scan.nextLine();
    if (answer.equals("A")) {
      villainPoints++;
    } else {
      heroPoints++;
    }
    System.out.println(villainPoints);
    System.out.println(heroPoints);
    question = "If you have to stop a villain, would you A. apprehend them or B. kill them?";
    System.out.println(question);
    answer = scan.nextLine();
    if (answer.equals("B")) {
      villainPoints++;
    } else {
      heroPoints++;
    }
    System.out.println(villainPoints);
    System.out.println(heroPoints);
    question = "Would you use your super powers as an enhancer in sports? A. yes or B. no";
    System.out.println(question);
    answer = scan.nextLine();
    if (answer.equals("A")) {
      villainPoints++;
    } else {
      heroPoints++;
    }
    System.out.println(villainPoints);
    System.out.println(heroPoints);
    question = "Your weapon in a fight would be... a A.gun, B.shield, C.fists, or D.sword?";
    System.out.println(question);
    answer = scan.nextLine();
    if (answer.equals("A") || answer.equals("D")) {
      villainPoints++;
    } else {
      heroPoints++;
    }
    System.out.println(villainPoints);
    System.out.println(heroPoints);
    question = "Who would like to team up with in a fight?";
    System.out.println(question);
    System.out.println("A. Batman, B. Joker, C. Flash, or D. Gorilla Grodd?");
    // options would be A. Batman, B.Joker, C. Flash D. Gorilla Grodd
    answer = scan.nextLine();
    switch (answer) {
      case "A":
        heroPoints++;
        break;
      case "B":
        villainPoints++;
        break;
      case "C":
        heroPoints++;
        break;
      case "D":
        villainPoints++;
        break;
      default:
        heroPoints++;
    }
    System.out.println(villainPoints);
    System.out.println(heroPoints);
    question = "Would you use your powers to A. protect people or B. would you make them suffer ";
    System.out.println(question);
    answer = scan.nextLine();
    if (answer.equals("B")) {
      villainPoints++;
    } else {
      heroPoints++;
    }
    System.out.println(villainPoints);
    System.out.println(heroPoints);
    question = "Has your life been A. miserable or B. happy?";
    System.out.println(question);
    answer = scan.nextLine();
    if (answer.equals("A")) {
      villainPoints++;
    } else {
      heroPoints++;
    }
    System.out.println(villainPoints);
    System.out.println(heroPoints);
    question = "Would you A. take your anger out on people or B.get help?";
    System.out.println(question);
    answer = scan.nextLine();
    if (answer.equals("B")) {
      heroPoints++;
    } else {
      villainPoints++;
    }
    System.out.println(villainPoints);
    System.out.println(heroPoints);
    question = "Are you a A. rule follower or B. rule breaker?";
    System.out.println(question);
    answer = scan.nextLine();
    if (answer.equals("B")) {
      villainPoints++;
    } else {
      heroPoints++;
    }
    System.out.println(villainPoints);
    System.out.println(heroPoints);
    question =
        "You see someone getting robbed, but then you notice it's your old bully getting robbed.";
    System.out.println(question + "Do you A.help them or B.let them suffer?");
    answer = scan.nextLine();
    if (answer.equals("B")) {
      villainPoints++;
    } else {
      heroPoints++;
    }
    System.out.println(villainPoints);
    System.out.println(heroPoints);
    System.out.println(
        "You will be given a random number, 1-10 that will add hero points or villain points");
    System.out.println(
        "If number is greater than 5 you receive villain points and if not, you get hero points");
    Random randomGen = new Random();
    int token;
    for (int counter = 1; counter == 1; counter++) { /* == is used for statements instead of the =
     // sign. The = sign is usually used for
      assigning and initializing*/
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
    if (heroPoints > villainPoints) {
      System.out.println("You have more heroic traits than villainous traits");
    } else {
      System.out.println("You have more villainous traits than hero traits");
    }
    String result;
    result = (heroPoints > villainPoints) ? "Hero" : "Villain";
    System.out.println("Welcome to the " + " " + result + " " + "Club");
    System.out.println("These are some names you can start out with");
    String[] names =
        {"Starman", "Stargirl", "Shimmer", "Spike", "Hawks", "Speedy", "Buck", "Raven", "Mysterio"};

    for (String item : names) {
      System.out.println(item + " ");
    }

    ArrayList<String> powers = new ArrayList<String>(); // This is an ArrayList
    System.out.println("These are a list of powers you can have");
    powers.add("Electricity");
    powers.add("Flight");
    powers.add("Teleportation");
    powers.add("Super Strength");
    powers.add("Super Speed");
    System.out.println(powers);
    int[] array = {2, 5, 10, -5, -80, 60, 70, 50}; /* This is a demonstration on how to find the
                                                   smallest value and sum in an array*/
    System.out.println(minValue(array));
    System.out.println(sumElements(array));
    System.out.println(array[0]);
    int findVal = 60;
    int getVal = Arrays.binarySearch(array, findVal);
    // This is how to search an array and identify the index where a value is found
    System.out.println("The index of element 60 is: " + getVal);
    try { // this is how to utitlize exception handling for user input of an int
      System.out.println("Enter num 1");
      int num1 = scan.nextInt();
      System.out.println("Enter num 2");
      int num2 = scan.nextInt();
      int remainder = num1 % num2;
      System.out.println(remainder);
    } catch (RuntimeException e) {
      throw e;      
    } catch (Exception e) {
      System.out.println("You can't do this");
    }
    int[][] multi = {{64, 20, 15, 18, 30}, {40, 54, 50, 20, 35}};
    //this is a multi-dimensional array
    System.out.println(multi[0][5]);
    int fights = 1;
    do { // do while loop
      System.out.println(fights);
      fights++;
    } while (fights < 10);
    for (int j = 0; j < 10; j++) {
      if (j == 3) {
        continue;
        // the continue statement breaks one iteration in the loop if a specified condition occurs,
        // and continues with the next iteration in the loop
      }
      System.out.println(j);
    }
    for (int k = 0; k < 10; k++) {
      if (k == 6) {
        break; /*
                * the break statement in Java terminates the loop immediately and the control of the
                * program moves to the next statement following the loop
                */
      }
      System.out.println(k);
    }

  }

  public int multiply(int a, int b) {
    int product = a * b;
    return product;
  }

  /**
   * @param 
   * @param 
   * @return product
   * @return
   */
  public int multiply(int a, int b,
      int c) {
      
    /* this overloads the previous method due to the change in the number of parameters 
       in the number of paramters
      */
    int product = a * b * c;
    return product;
  }

  private static int minValue(int[] array) {
    int minValue = array[0];
    for (int i = 0; i < array.length; i++) {
      if (array[i] < minValue) {
        minValue = array[i];
      }
    }
    return minValue;
  }
  /**Finds elements.
   * @param
   *@exception
   */
  
  public static int sumElements(int[] array) {
    int sumElements = 0;
    for (int i = 0; i < array.length; i++) {
      sumElements += array[i];
    }
    return sumElements;
  }

  /** mission 
   * @param 
   * @exception
   */
  public static int calculateMissions(
      int mission) { /*
                      * int mission is the parameter and the header is "public static int" since it
                      * defines the code at the beginning
                      */
    System.out.println("Before we start, here is a demonstration on how to use the Math class");
    int slice = 9;
    System.out.println(Math.sqrt(
        slice)); /*
                  * This prints the square root of slice. Math.sqrt finds the square root of numbers
                  */
    System.out.println("Please enter a number between 1 and 10");
    int level = scan.nextInt();
    // this will determine how many missions they will have
    for (int i = 1; i <= level; i++) {
      System.out.print("The list of missions you'll have are \n " + " " + i);
      mission = i;
    }
    return mission;
  }
}

