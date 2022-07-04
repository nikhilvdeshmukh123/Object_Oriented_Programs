package com.bridgelabz;

import java.util.HashSet;
import java.util.Set;
/*
 * @author: Nikhil Deshmukh
 * Write a Program DeckOfCards.java, initialize deck of cards having suit ("Clubs", "Diamonds", "Hearts", "Spades")
 * & Rank ("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"). Shuffle the cards using
 * Random method & then distribute 9 Cards to 4 Players & Print the Cards received by the 4 Players using 2D Array.
 */
public class DeckOfCards {
    public static void main(String[] args) {
        System.out.println("Welcome to Deck of Cards Program");
        // Declaration and initialization of 2D array
        String[][] cardsCombo = new String[4][13];
        String[][] players = new String[4][9];
        // Set method to store cards and avoid duplicate value
        Set<String> card = new HashSet();
        // Variables
        int start = 0, end = 12, i = 0, j = 0, k = 0, l = 0, m = 0, n = 0, number = 1, option;
        //creating array for Ranks and Suits
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        //generate cards with combo of ranks and suits
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 13; j++) {
                cardsCombo[i][j] = suits[i] + ranks[j];
            }
        }
        // add 9 cards to each player
        while (number <= 36) {
            int randomSuits = (int) Math.floor((Math.random() * 10) % 4);
            int randomRanks = (int) Math.floor((Math.random() * 10) % 13);
            if (card.add(cardsCombo[randomSuits][randomRanks])) {
                option = number % 4;
                // Adding cards to 4 players
                switch (option) {
                    case 0:
                        players[option][k++] = cardsCombo[randomSuits][randomRanks];
                        break;
                    case 1:
                        players[option][l++] = cardsCombo[randomSuits][randomRanks];
                        break;
                    case 2:
                        players[option][m++] = cardsCombo[randomSuits][randomRanks];
                        break;
                    case 3:
                        players[option][n++] = cardsCombo[randomSuits][randomRanks];
                        break;
                }
                number++;
            }
        }
        // printing 9 card to each 4 player
        for (i = 0; i < 4; i++) {
            System.out.println("Player" + (i + 1) + " : ");
            for (j = 0; j < 9; j++) {
                System.out.print(players[i][j] + " ");
            }
            System.out.println();
        }
    }
}