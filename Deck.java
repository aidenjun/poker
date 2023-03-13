import java.lang.Math;

public class Deck {
   
   Card[] deck;
   String[] suits;
   String[] ranks;
   
   public Deck() {
     
      suits = new String[] {"Clubs", "Diamonds", "Hearts", "Spades"};
      ranks = new String[] {"9","10","Jack","Queen","King","Ace"};

     
      int total = suits.length * ranks.length * 2;
      deck = new Card[total];
      for(int i = 0; i < suits.length; i++) {
         for(int j = 0; j < ranks.length*2; j+=2) {
            deck[ranks.length*i * 2 + j] = new Card(ranks[j/2], suits[i]);
            deck[ranks.length*i * 2 + j + 1] = new Card(ranks[j/2], suits[i]);
         }
      }
     
      for(int i = 0; i < deck.length; i++) {
         System.out.println(deck[i]);
      }
     
   }
   
   public Card[] Draw() {
      for (int i = 0; i < suits.length * ranks.length * 2; i++) {
            int r = i + (int) (Math.random() * (suits.length * ranks.length * 2-i));
            Card temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }
      Card[] cards = new Card[12];
      for(int i = 0; i < cards.length; i++) {
         cards[i] = deck[i];
      }
      return cards;
   }

}
