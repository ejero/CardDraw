/*
 * Rosita Emakpo
 */
package newpackage;

/**
 * @author rosita
 */
public class Card {
    
    //Instance Veriables
    private final int rank; //Holds rank of card 1 - 14
    private final int suit; //Holds suit on card Clubs, Hearts, Diamonds, Spades
    
    //Constances variables
    String ranks[] = {" ", "2", "3", "4", "5","6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    String suits[] = {"\u2663", "\u2662", "\u2661", "\u2660"};
        
    /**
     * Constructor for card.
     * @param rank
     * @param suit
     */
    public Card(int rank, int suit){
        if(rank < 1 && rank > 14) {
            throw new IllegalArgumentException("Invalid rank");
        }
        if(suit < 0 || suit > 4 ) {
            throw new IllegalArgumentException("Inavlid suite");
        }
           this.rank = rank;
           this.suit = suit;     
    }
    
    /**
     * Gets the rank of the card.
     * @return 
     */
    public int getRank(){
        return rank;
    }
    
    /**
     * Gets the suit of the card.
     * @return 
     */
    public int getSuit(){
        return suit;
    }
    
    /**
     * Print the rank and suit formatted two spaces in rank.
     * @return 
     */
    @Override
    public String toString(){
        
    return String.format("%3s", (ranks[rank]) + suits[suit]);
    //return "   " + ranks[rank] + suits[suit];     
    }
        
    
    //testing the card
//    public static void main (String[] args){
//        Card card1 = new Card(9, 2);
//        card1.getRank();
//        card1.getSuit();
//        Card card2 = new Card(10, 2);
//        card2.getRank();
//        card2.getSuit();
//        Card card3 = new Card(9, 3);
//        card3.getRank();
//        card3.getSuit();
//        System.out.println(card1);
//        System.out.println(card2); 
//        System.out.println(card3);
//        System.out.println("[" + card2 + " "+ card1 + " " +card3 + "]");
//        
//    }
    
}

