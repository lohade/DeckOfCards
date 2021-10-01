package Workshop;

public class DeckOfCards{
    int[] Array=new int[52];
   //Declare ranks array
    String[] ranks=new String[]{"2","3","4","5","6","7","8","9","10","Jacks","queen","King","Ace"};
    //declare suit
    String[] suit=new String[]{"Clubs","Diamonds","Hearts","Spades"};

    public String[] getRanks() {
        return ranks;
    }

    public void setRanks(String[] ranks) {
        this.ranks = ranks;
    }
    //defegit
    public String[] getSuit() {
        return suit;
    }

    public void setSuit(String[] suit) {
        this.suit = suit;
    }
    //distributed cards
    public void distributed(){
        for(int i=0;i< ranks.length;i++) {
            for (int j = 0; j < suit.length; j++) {
                System.out.println(ranks[i]+"->"+suit[j]);
            }
        }
    }
    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome to Deck of cards:");
        DeckOfCards deck=new DeckOfCards();
        deck.distributed();



    }
}
