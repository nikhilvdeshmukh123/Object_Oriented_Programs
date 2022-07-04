package com.bridgelabz;
/*
 * @author: Nikhil Deshnukh
 * Stock Account Management
 */

import java.util.ArrayList;
import java.util.Scanner;

class StockLedger {
    int stocksNumber;
    int numOfShares;
    float sharePrice;
    ArrayList<String> stockNames;

    // constructor
    public StockLedger() {
        stockNames = new ArrayList<>();
    }

    // Adding stock names
    public void addStockName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the stock name: ");
        String stockName = sc.nextLine();
        stockNames.add(stockName);
    }
}

//adding stock name, share price, number of shares then calculating the total values of stocks
class StockPortfolio extends StockLedger {
    float totalStockValue;

    // Taking values of shares and price from user
    public void stockPriceReader() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Shares:");
        numOfShares = sc.nextInt();
        System.out.println("Enter share price:");
        sharePrice = sc.nextFloat();
    }

    // This method is used to calculate total value of stock using share price and
    // number of shares
    public double stockCalculation() {
        this.totalStockValue = sharePrice * numOfShares;
        return totalStockValue;
    }

    // calculates the total value of the total stocks
    public void stockPortFolio() {

        Scanner sc = new Scanner(System.in);
        System.out.println("purchasing stocks? y/n");
        String flag = sc.next();
        float stockValue = 0;
        int stockcheck = stockNames.size();
        // Iterating the adding and calculation method till stock number reached
        if (flag.equalsIgnoreCase("y")) {
            addStockName();
            stockPriceReader();
            stockCalculation();
            System.out.println("stock value is: " + stockCalculation());
            stockValue += totalStockValue;
        }
        System.out.println("Total Stock Portfolio Value is : " + stockValue + "\n");
    }

    // display of info
    public void display() {
        System.out.println(
                "stock available:\n " + numOfShares + "of" + stockNames + "\nstock value: " + totalStockValue + "\n");
    }
}

// main method
public class StockAccountManager {

    public static void main(String[] args) {
        System.out.println("Welcome to Stock Manager program..!");
        StockPortfolio stockPortfolio = new StockPortfolio();
        stockPortfolio.stockPortFolio();
    }
}