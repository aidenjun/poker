public class CardRunner {
   public static void main(String[] args) {
      Deck deck = new Deck();
      int n = 1000000;
      int t = 0;
      for(int i = 0; i < n; i++) {
         Card[] cards = deck.Draw();
         if(isPinochle(cards)) {
            t++;
         }
      }
      System.out.println((double)t/(double)n * 100);
   }
   
   public static boolean isPinochle(Card[] cards) {
      int a = 0;
      for(int i = 0; i < cards.length; i++) {
         if(    (cards[i].getSuit()==1 && cards[i].getRank()==2)   ||    (cards[i].getSuit()==3 && cards[i].getRank()==3)) {
            a++;
         }
      }
      if(a>=2) {
         return true;
      }
      return false;  
   }
   
   public static boolean isFourOfKind(Card[] cards) {
      int[] ranks = new int[13];
      for(int i = 0; i < cards.length; i++) {
         ranks[cards[i].getRank()]+=1;
      }
      for(int i = 0; i < ranks.length; i++) {
         if(ranks[i]>=4) {
            return true;
         }
      }
      return false;
   }
   
   public static boolean isAStraight() {
      return false;
   }
}

