public class Main {

   String rank, suit;

   public Main(String rank, String suit) {
      this.rank = rank;
      this.suit = suit;
   }

   public int getSuit() {
      String[] suits = new String[] {"Diamonds", "Hearts", "Spades", "Clubs"};
      for(int i = 0; i < suits.length; i++) {
         if(this.suit.equals(suits[i])) { return (i); }
      }
      return 5;
   }
   
   public int getRank() {
      String[] ranks = new String[] {"9","10","Jack","Queen","King","Ace"};
      for(int i = 0; i < ranks.length; i++) {
         if(this.rank.equals(ranks[i])) { return (i); }
      }
      return 14;
   }

   public String toString() {
      return this.rank + " o' " + this.suit;
   }

}