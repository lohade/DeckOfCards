package Workshop;

public class Main {

    public static void main(String[] args) {
        CardsFunction cardsFunction=new CardsFunction();
        System.out.println("Welcome to Deck of cards");
        cardsFunction.createCards();
        cardsFunction.addPlayer();
    }
}
