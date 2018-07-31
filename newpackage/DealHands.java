/*
 * Rosita Emakpo
 * Card game that draws 5 cards form a deck for each player and 
 * prints remainding cards left in the deck.
 */
package newpackage;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rosita
 */
public class DealHands {
    
    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println(deck);
        System.out.println("Shuffled deck");
        deck.shuffle();
        System.out.println(deck);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of players");
        int numPlayer = sc.nextInt();
        
        ArrayList<Hand> hands = new ArrayList<>();
        for(int i = 0; i < numPlayer ;  i++) {
            Hand hand = new Hand();
            hands.add(hand);
            for(int j = 0 ; j < 5 ; j++) {
                hand.addCard(deck.deal());
            }
        }
        
        for(int i = 0; i <numPlayer ; i++) {
            System.out.printf("Player number %d \n"  ,i + 1);
            System.out.println(hands.get(i));
            
        }
        
        System.out.println("\nThe remaining cards in deck");
        
        System.out.println(deck);
        
        // Testing 
//        try {
//            while(true) {
//                System.out.print("dealt another card");
//                System.out.println(deck.deal());
//            }
//        } catch (IllegalStateException iex) {
//            System.out.println("\nWe called deal on an empty deck and it threw an exception as we wanted");
//        }
//        
//        try {
//            Card c = new Card(150, 150);
//        } catch (IllegalArgumentException iex) {
//            System.out.println(iex);
//        }
    }
}
