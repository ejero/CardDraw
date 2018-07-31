/*
 * Rosita Emakpo
 * 
 * 
 */
package newpackage;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author rosita
 */
public class Deck {
    //Instance variable 
    private ArrayList<Card> cards;
      
    /**
     * Constructor
     * Creates a deck of 52 cards with rank and suit
     */
 
    public Deck(){
       cards = new ArrayList<>();
        for(int suit = 0; suit < 4; suit++){
        for(int rank = 0; rank < 13; rank++){
            cards.add(new Card(rank + 1, suit));
            }
        
        }
            
    }
    
    public void shuffle(){
        Random rand = new Random();
        for (int i =0; i <cards.size(); ++i) {
           int card = rand.nextInt(cards.size());
           Card tmp = cards.get(i);
           cards.set(i, cards.get(card));
           cards.set(card, tmp);
        }
    
    }
        
    
    public Card deal() {
       if(cards.isEmpty()) {
           throw new IllegalStateException("Deck bound");
       }
       return cards.remove(cards.size()  -1);
    }
      
    /**
     * Build a string representation of the deck
     * @return 
     */
    public String toString() {
        /* we rely on the string builder so that we don't need to do 
        expensive string + operations
        * So we dont have to do s = "A" + "b";
        */
        StringBuilder builder = new StringBuilder();
        for(int i = 0 ; i < cards.size() ; i++) {
            builder.append(cards.get(i).toString());
            if(i != 0 && i % 13 == 0) {
               
                builder.append("\n");
                //builder.append(System.lineSeparator());
            }  
        }
        
        return builder.toString();
    }
            
    
}
