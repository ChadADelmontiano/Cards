package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Game {

    // Properties

    private boolean areAcesHigh = true;
    Deck deck;

    // Constants
    public static final int NIL = 0;
    public static final int SPADES = 1;
    public static final int DIAMONDS = 2;
    public static final int CLUBS = 3;
    public static final int HEARTS = 4;


    public static final int TWO = 0;
    public static final int THREE = 1;
    public static final int FOUR = 2;
    public static final int FIVE = 3;
    public static final int SIX = 4;
    public static final int SEVEN = 5;
    public static final int EIGHT = 6;
    public static final int NINE = 7;
    public static final int TEN = 8;
    public static final int JACK = 9;
    public static final int QUEEN = 10;
    public static final int KING = 11;
    public static final int ACE = 12;

    private static String[] suitNames = new String[] { "Nil", "Clubs", "Diamonds", "Hearts", "Spades" };
    private static char[] suitSymbols = new char[] { '\u0000', '\u2660', '\u2666', '\u2663', '\u2665' };
    private static String[] rankNames = new String[] { "Two", "Three", "Four", "Five", "Six", "Seven",
            "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};

    // Declaring ANSI_RESET so that we can reset the Java console color
    public static final String ANSI_RESET = "\u001B[0m";

    // Declaring the Java console color for the text
    public static final String ANSI_RED = "\\u001B[31m";

    // Constructors
    public Game() {
        deck = new Deck();
       // deck.shuffle();

        //Card randomCard = new Card(DIAMONDS, ACE);
    }

    // Getters & Setters

    // Methods


    public static String getSuitName(int suit) {
        return suitNames[suit];
    }

    public static char getSuitSymbol(int suit) {
        return suitSymbols[suit];
    }

    public static String getRankName(int rank) {
        return rankNames[rank];
    }

}
