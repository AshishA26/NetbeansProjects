/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chooseyourownadventureashish;

/**
 *
 * @author Ashish
 */
import java.util.Scanner;

public class ChooseYourOwnAdventureAshish {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Sets up the scanner input
        Scanner keyedInput = new Scanner(System.in);

        //Prints out beginning of story
        System.out.println("Ray: GET UP! GET UP NOW!");
        System.out.println("You: Agg...Wh-What happened?");
        System.out.println("Ray: You were knocked out for crying out loud!");
        System.out.println("Ray: Now tell me, do you remember where he went?");
        System.out.println("You: Where WHO went?");
        System.out.println("Ray: The bank robber who robbed the bank literally 3 minutes ago!");
        System.out.println("You: Oh oh ya, I remember who you're talking about.");
        System.out.println("Ray: So where did he go?");
        System.out.println(" ");
        System.out.println("Please type the letter of one of the options:");
        System.out.println("A: He went into the alleyway");
        System.out.println("B: I don't know");
        System.out.println("C: He went back into the bank");

        //Next entered key by user is set to answer
        String answer = keyedInput.nextLine();
           
        //Based on the letter the user inputted, different results will be shown because of the if and else if statements
        //This goes for all the if and else if statements in this java file
        if (answer.equals("A") || answer.equals("a")) {
            System.out.println("Ray: Then come on, lets go!");
            System.out.println("Ray: Alright, I'm guessing that you have no idea where he went.");
            System.out.println("Ray: So what do you choose: A. Garbage can, or B. Window?");

            //Next entered key by user is set to answer
            answer = keyedInput.nextLine();

            if (answer.equals("A") || answer.equals("a")) {
                System.out.println("Ray: Alright jump in!");
                System.out.println("***5 seconds later***");
                System.out.println("You: So he's not in here! Aww, whats thi-.");
                System.out.println("***You fainted***");
                System.out.println("Ray: Seriously?");
                System.out.println(" ");
                System.out.println("GAME OVER");

            } else if (answer.equals("B") || answer.equals("b")) {
                System.out.println("***You and Ray climb in the window***");
                System.out.println("You: I see money, lots of it.");
                System.out.println("Ray: Hey man, I say we take it all. After all, I did a lot of hard work to get it here...");
                System.out.println("You: What!? You did WHAT?!");
                System.out.println("Ray: Quiet down, quiet down. Yeah, it was me.");
                System.out.println("Do you choose to A. Report him to the police, or B. Take it and run away with him");

                //Next entered key by user is set to answer
                answer = keyedInput.nextLine();

                if (answer.equals("A") || answer.equals("a")) {
                    System.out.println("***You escape from the window and signal the police to come over there. Ray gets captured and you are honored with an award.***");
                    System.out.println("YOU WIN!");
                } else if (answer.equals("B") || answer.equals("b")) {
                    System.out.println("***You run away with Ray but end up crashing into the police and get arrested. You are put away for life.***");
                    System.out.println("You: I shouldn't have listened to you Ray!");
                    System.out.println(" ");
                    System.out.println("GAME OVER");
                }
            }

        } else if (answer.equals("B") || answer.equals("b")) {
            System.out.println("Ray: What were you doing then?");
            System.out.println("Ray: Well that was useless.");
            System.out.println(" ");
            System.out.println("GAME OVER");
        } else if (answer.equals("C") || answer.equals("c")) {
            System.out.println("Ray: He WHAT! Lets go NOW!");
            System.out.println("You: He couldn't have gotten out of the bank, he's probably hiding somewhere here.");
            System.out.println("Ray: Do you wanna check A. The money vault, or B: The managers office");

            //Next entered key by user is set to answer
            answer = keyedInput.nextLine();

            if (answer.equals("A") || answer.equals("a")) {
                System.out.println("Ray: Alright, lets go!");
                System.out.println("***You and Ray open the bank vault***");
                System.out.println("Ray: There's someone here!");
                System.out.println("Ray: Put your hands up!");
                System.out.println("***Ray gets knocked out by robber***");
                System.out.println("Do you choose to A. Tie him up and report him to the police, or B. Quickly run away and get the police");

                answer = keyedInput.nextLine();

                if (answer.equals("A") || answer.equals("a")) {
                    System.out.println("***You manage to get a hold of the robber and tie him up***");
                    System.out.println("You: You're a lousy thief!");
                    System.out.println("***You bring in the police and they arrest the robber***");
                    System.out.println("");
                    System.out.println("YOU WIN!");
                } else if (answer.equals("B") || answer.equals("b")) {
                    System.out.println("***You start running away but the robber catches up and knocks you out cold***");
                    System.out.println("***The robber escapes and the police never find him***");
                    System.out.println(" ");
                    System.out.println("GAME OVER");
                }
            } else if (answer.equals("B") || answer.equals("b")) {
                System.out.println("***You and Ray check the managers office, but get locked in by the robber. By the time the police comes, the Robber has already escaped***");
                System.out.println("Ray: Seriously?");
                System.out.println(" ");
                System.out.println("GAME OVER");
            }
        }
    }
}
