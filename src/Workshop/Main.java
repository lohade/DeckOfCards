package Workshop;

public class Main {
    int[] Array=new int[52];
    String[] ranks=new String[]{"2","3","4","5","6","7","8","9","10","Jacks","queen","King","Ace"};
    String[] suit=new String[]{"Clubs","Diamonds","Hearts","Spades"};

    public String[] getRanks() {
        return ranks;
    }

    public void setRanks(String[] ranks) {
        this.ranks = ranks;
    }

    public String[] getSuit() {
        return suit;
    }

    public void setSuit(String[] suit) {
        this.suit = suit;
    }

    public void distributed(){
        for(int i=0;i< ranks.length;i++) {
            for (int j = 0; j < suit.length; j++) {
                int a = (int) Math.floor((Math.random() * 10)) % 13;
                System.out.println(ranks[a]+"->"+suit[j]);
            }
        }
    }
    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome to Deck of cards:");
        Main main=new Main();
        main.distributed();



    }
}
