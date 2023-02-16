package com.techelevator;

public class Card {

    private int suit;
    private int rank;

    public Card(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }



    public String cardString(boolean faceDown) {
        if (faceDown) {
            return "##";
        }
        else {
            return Game.getRankName(rank) + " of " + Game.getSuitName(suit) + " - " + Game.getSuitSymbol(suit);
        }
    }


}
