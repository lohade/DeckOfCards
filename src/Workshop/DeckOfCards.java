package Workshop;

public class DeckOfCards{

    public static void main(String[] args) {
	// write your code here
        CardsFunction cardsFunction=new CardsFunction();
        System.out.println("Welcome to Deck of cards");
        cardsFunction.createCards();
        cardsFunction.addPlayer();
    }
}
