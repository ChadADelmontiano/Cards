package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Shuffle then Organize");
        System.out.println();
        System.out.println();

        Game game = new Game();;


        System.out.println("There are " + game.deck.howManyCardsLeft() + " cards in the deck");
        System.out.println();
        System.out.println();

        System.out.println("Shuffled Deck:");

        game.deck.shuffle();
        List<Card> deckOfCards = game.deck.getListOfCards();


        for (Card card:deckOfCards) {

            System.out.println(card.cardString(false));
        }

        System.out.println();
        System.out.println();
        System.out.println("Sorted by Rank:");
        System.out.println();
        List<Card> byRank = new ArrayList<>();

        for (int rank = 0; rank < 13; rank++) {
            for (int suit = 1; suit <= 4; suit++) {
                Card newCard = new Card(suit, rank);
                byRank.add(newCard);
                System.out.println(newCard.cardString(false));
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("Sorted by Suit and Rank:");
        System.out.println();
        List<Card> bySuitAndRank = new ArrayList<>();
        for (int suit = 1; suit <= 4; suit++) {
            for (int rank = 0; rank < 13; rank++) {
                Card newCard = new Card(suit, rank);
                bySuitAndRank.add(newCard);
                System.out.println(newCard.cardString(false));
            }
        }

        scanner.close();

    }
}
