/*
 * Rosita Emakpo
 * Card Game 
 */
package newpackage;

import java.util.ArrayList;

/**
 * Hand consist of 5 cards of various suits.
 * @author rosita
 */
public class Hand {
    private ArrayList<Card> cards;
    
    
    public Hand() {
        cards = new ArrayList<>();
    }
    
    /**
     * 
     * @param card 
     */
    public void addCard(Card card) {
        cards.add(card);
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return cards.toString();
   }
    
}
