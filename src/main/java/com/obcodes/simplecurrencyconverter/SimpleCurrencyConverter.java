/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.obcodes.simplecurrencyconverter;

import java.util.Scanner;

/**
 *
 * @author Obakeng Phale
 */
public class SimpleCurrencyConverter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Display welcome message
        System.out.println("=== SIMPLE CURRENCY CONVERTER ===");
        
        // Display available currencies
        System.out.println("\n=== AVAILABLE CURRENCIES ===");
        System.out.println("USD - US Dollar");
        System.out.println("EUR - Euro");
        System.out.println("GBP - British Pound");
        System.out.println("JPY - Japanese Yen");
        System.out.println("CNY - Chinese Yuan");
        System.out.println("RUB - Russian Ruble");
        System.out.println("INR - Indian Rupee");
        System.out.println("ZAR - South African Rand");
        System.out.println("NGN - Nigerian Naira");
        System.out.println("EGP - Egyptian Pound");
        System.out.println("KES - Kenyan Shilling");
        System.out.println("GHS - Ghanaian Cedi");
        System.out.println("============================\n");
        
        // Get user input
        System.out.print("Enter amount to convert: ");
        double amount = scanner.nextDouble();
        
        System.out.print("Enter source currency code (e.g., USD): ");
        String sourceCurrency = scanner.next().toUpperCase();
        
        System.out.print("Enter target currency code (e.g., EUR): ");
        String targetCurrency = scanner.next().toUpperCase();
        
        // Convert currency
        double convertedAmount = convertCurrency(amount, sourceCurrency, targetCurrency);
        
        // Display result
        if (convertedAmount != -1) {
            System.out.printf("\n%.2f %s = %.2f %s%n", amount, sourceCurrency, convertedAmount, targetCurrency);
        } else {
            System.out.println("Conversion not supported between these currencies.");
        }
        
        scanner.close();
    }
    
    public static double convertCurrency(double amount, String fromCurrency, String toCurrency) {
        // All exchange rates relative to USD
        double usdToEur = 0.85;
        double usdToGbp = 0.73;
        double usdToJpy = 110.50;
        double usdToCny = 6.45;
        double usdToRub = 74.30;
        double usdToInr = 75.20;
        double usdToZar = 14.80;
        double usdToNgn = 410.50;
        double usdToEgp = 15.70;
        double usdToKes = 110.25;
        double usdToGhs = 5.85;
        
        // Convert source currency to USD first
        double amountInUsd;
        
        switch (fromCurrency) {
            case "USD":
                amountInUsd = amount;
                break;
            case "EUR":
                amountInUsd = amount / usdToEur;
                break;
            case "GBP":
                amountInUsd = amount / usdToGbp;
                break;
            case "JPY":
                amountInUsd = amount / usdToJpy;
                break;
            case "CNY":
                amountInUsd = amount / usdToCny;
                break;
            case "RUB":
                amountInUsd = amount / usdToRub;
                break;
            case "INR":
                amountInUsd = amount / usdToInr;
                break;
            case "ZAR":
                amountInUsd = amount / usdToZar;
                break;
            case "NGN":
                amountInUsd = amount / usdToNgn;
                break;
            case "EGP":
                amountInUsd = amount / usdToEgp;
                break;
            case "KES":
                amountInUsd = amount / usdToKes;
                break;
            case "GHS":
                amountInUsd = amount / usdToGhs;
                break;
            default:
                return -1; // Invalid currency
        }
        
        // Convert from USD to target currency
        switch (toCurrency) {
            case "USD":
                return amountInUsd;
            case "EUR":
                return amountInUsd * usdToEur;
            case "GBP":
                return amountInUsd * usdToGbp;
            case "JPY":
                return amountInUsd * usdToJpy;
            case "CNY":
                return amountInUsd * usdToCny;
            case "RUB":
                return amountInUsd * usdToRub;
            case "INR":
                return amountInUsd * usdToInr;
            case "ZAR":
                return amountInUsd * usdToZar;
            case "NGN":
                return amountInUsd * usdToNgn;
            case "EGP":
                return amountInUsd * usdToEgp;
            case "KES":
                return amountInUsd * usdToKes;
            case "GHS":
                return amountInUsd * usdToGhs;
            default:
                return -1; // Invalid currency
        }
    }
}