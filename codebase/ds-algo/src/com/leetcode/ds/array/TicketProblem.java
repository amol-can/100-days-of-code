package com.leetcode.ds.array;

import javafx.util.Pair;

import java.util.*;

public class TicketProblem {

    public static void main(String[] args) {
        //long response = doSomeStuff(Arrays.asList(2, 6, 3, 4, 5), 2);
        int[] ar = {2, 6, 3, 4, 5};
        //long response = doSomeAnotherStuff(ar, 2);
        //System.out.println("Result: " + response);
    }

    public static long doSomeStuff(List<Integer> tickets, int p) {
        long waitingTime = tickets.get(p);
        for (int i = 0; i < tickets.size(); i++) {
            if (i == p) continue;
            waitingTime += (Math.min(tickets.get(p), tickets.get(i)));
            if (i > p) {
                waitingTime--;
            }
        }
        return waitingTime;
    }

    public static long doSomeAnotherStuff(List<Integer> tickets, int p) {

        int[] ticks = tickets.stream().mapToInt(i -> i).toArray();

        long waitingTime = 0;
        int[] temp = Arrays.copyOf(ticks, ticks.length);
        for (int i = 0; i < ticks.length; i++) {
            temp[i] = ticks[i] - ticks[p];
        }
        for (int i = 0; i < ticks.length; i++) {
            if (temp[i] < 0) waitingTime += ticks[i];
            else {
                if (i <= p) waitingTime += ticks[p];
                else waitingTime += ticks[p] - 1;
            }
        }
        return waitingTime;
    }

    public static int stockPairs1(List<Integer> stocksProfit, long target) {
        // Write your code here
        int counter = 0;
        for (int i = 0; i < stocksProfit.size(); i++) {
            for (int j = i + 1; j < stocksProfit.size(); j++) {
                if (i == j) {
                    continue;
                } else if (stocksProfit.get(i) + stocksProfit.get(j) == target) {
                    counter++;
                }
            }
        }
        return (counter / 2);
    }

    // [1, 3, 46, 1, 3, 9]
    public static int stockPairs(List<Integer> stocksProfit, long target) {
        // Write your code here
        List<Integer> pairs = new ArrayList<>();
        for (int i = 0; i < stocksProfit.size(); i++) {
            for (int j = 0; j < stocksProfit.size(); j++) {
                if (i == j) {
                    continue;
                }
                long sum = stocksProfit.get(i) + stocksProfit.get(j);
                if (sum == target) {
                    if (pairs.contains(stocksProfit.get(i)) && pairs.contains(stocksProfit.get(j))) {
                        continue;
                    } else {
                        pairs.add(stocksProfit.get(i));
                        pairs.add(stocksProfit.get(j));
                    }
                }
            }
        }

        return pairs.size() / 2;
    }
}