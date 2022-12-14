/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fortune;

import java.util.Random;
import java.text.*;
import java.util.*;

        
public class Fortune {
    

    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
        
       
        System.out.print("Hello, Welcome! I am the great Java Fortune Teller- \nTell me, what is your name?");
        String name = keyboard.nextLine();
        System.out.print("Welcome");
        System.out.print(name);
        System.out.println("!");
        
       
        System.out.println("In order for me gift you your fortune, I'll need more information!");
        System.out.print("So tell me, how old are you?");
        int age =  keyboard.nextInt();
        
       
        while (age > 123)
        {
            System.out.print("Liar, as if, you oldie- now how old are you, really?");
            age =  keyboard.nextInt();
        }   
        while (age < 0)
        {
            System.out.print("Liar, were you born in the future- now how old are you, really?");
            age =  keyboard.nextInt();
        }
        System.out.println("Thank you for your response!");
        
        
        System.out.println("Ill still need just a bit more information to get your accurate fortune!");
        System.out.print("What is your current GPA?");
        double gpa =  keyboard.nextDouble();
        
        
        while (gpa <= 0)
        {
            System.out.println("Now, I knew you were a bit slow from the looks of you, but thats just astonishing!");
            System.out.print("Now seriously, put in your actual GPA this time.");
            gpa = keyboard.nextDouble();
        }
        while (gpa > 4)
        {
            System.out.println("Now, I know you think you're so smart, trying to trick me.");
            System.out.print("But seriously, put in your actual GPA this time.");
            gpa = keyboard.nextDouble();
        }
        System.out.println("Thanks for letting me know!");
        
        
        System.out.print("Now onto something more interesting- what are two of your favorite foods to eat?");
        keyboard.nextLine();
        String favFoods = keyboard.nextLine();
        System.out.print("Thats nice! I love");
        System.out.print(favFoods);
        System.out.println(" as well!");
        
        
        System.out.print("Just out of curiosity, how old is your oldest living relative?");
        byte relAge = keyboard.nextByte();
        System.out.print("Wow, thats amazing that your relative is ");
        System.out.print(relAge);
        System.out.println(" years old!");
        
        
        System.out.print("How many video games do you play? (if you don't play any, just type in 0)");
        int gamer = keyboard.nextInt();
        
        
        while (gamer < 0)
        {
            System.out.println("Mm, I too like to play negative games.");
            System.out.println("It's fantastically fun to laugh at you, for example");
            System.out.print("Now be a good human and put in an actual number of games you like to play.");
            gamer = keyboard.nextInt();
        }
        while (gamer >= 100)
        {
            System.out.println("Now, I like to play games just as much as the other guys,");
            System.out.print("but there's no way in hell that you're playing ");
            System.out.print(gamer);
            System.out.println(" games actively. \nYou'd go crazy from staring at a screen for so long.");
            System.out.println("Similar to my programmer right now.");
            System.out.print("Now tell me truthfully this time, how many games do you play?");
            gamer = keyboard.nextInt();
        }
        
        
        if (gamer >= 1)
        {
            System.out.println("Nice to know that you play video games as well!");
        }
        else if (gamer == 0)
        {
            System.out.println("Good to know that you're not wasting your time on those things!");
        }

        
        System.out.print("Now, I mean no harm with this question, \nbut how much money do you make in a year?");
        float monies = keyboard.nextFloat();
        
        
        while (monies < 0)
        {
            System.out.println("Wow, I didn't realize debt collectors were so aggresive these days,");
            System.out.println("to the point that they took money from those without it.");
            System.out.print("But seriously, I want to scam you, so how much do you make?");
            monies = keyboard.nextFloat();
        }
        System.out.print("Wow, $");
        System.out.print(monies);
        System.out.println(" is a lot of money! (for me to take)");

        
        System.out.print("As a theoretical question, if you could go choose any career (and be successful), \nwhat would it be?");
        keyboard.nextLine();
        String career = keyboard.nextLine();
        System.out.print("Now that's a nice career to get into, ");
        System.out.print(career);
        System.out.println("!");
        
        
        System.out.println("Finally, i've gathered enough information to now calculate your lucky number!");
        int luckynum;
            luckynum = (int)(monies/(relAge+(age-gamer))*gpa+0.5); 
        int finalnum = Math.abs(luckynum);
        System.out.println("and your lucky number is...");
        System.out.println("...");
        System.out.println("...");
        System.out.print(finalnum);
        System.out.println("!");
        
        
        System.out.print("I've got enough information to show your fortune as well, ");
        System.out.print(name);
        System.out.println("!");
        
        
        System.out.print("I’m not a fortune-teller but, your fortune: as an ");
        System.out.print(age);
        System.out.println(" year old,");
        System.out.println("you will go through your years in the future wandering, learning and growing.");
        System.out.println("You will always strive to better yourself and those around you,");
        System.out.print("while taking the time occasionally for yourself to eat ");
        System.out.print(favFoods);
        System.out.println(",");
        System.out.println("which you'll always have a special place in your heart for.");
        
        
        int finAge = relAge + 20;
        System.out.print("With a successful career in ");
        System.out.print(career);
        System.out.println(",");
        System.out.println("you will be famous for your contributions to society,");
        System.out.print("and will live to at least ");
        System.out.print(finAge);
        System.out.println("!");
        
       
        System.out.print("Thank you so much for playing the Fortune Teller Game ");
        System.out.print(name);
        System.out.println("!");
        System.out.println("Hope you have a good day!");
        
    }
}