package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck {

    // Properties

    private List<Card> listOfCards = new ArrayList<>();

    // Constructors
    public Deck() {
        for (int suit = 1; suit <= 4; suit++) {
            for (int rank = 0; rank < 13; rank++) {
                Card newCard = new Card(suit, rank);
                listOfCards.add(newCard);
            }
        }
    }

    // Methods
    public void shuffle() {
        Collections.shuffle(listOfCards);
    }

    public int howManyCardsLeft() {
        return listOfCards.size();
    }

    public List<Card> getListOfCards() {
        return listOfCards;
    }
}