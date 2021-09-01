package ua.univer.mvc;

import java.util.ArrayList;

public class Model {

    private int value;
    private ArrayList<Integer> historyEnteredNumbers = new ArrayList<>();
    private int minBarrier;
    private int maxBarrier;
    public static final int GUESSEDNUMBER  = (int) (Math.random() * 100);

    public Model() {
        minBarrier = 0;
        maxBarrier = 100;
    }

    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
        historyEnteredNumbers.add(value);
    }


    public int getMinBarrier() {
        return minBarrier;
    }

    public void setMinBarrier(int minBarrier) {
        this.minBarrier = minBarrier;
    }

    public int getMaxBarrier() {
        return maxBarrier;
    }

    public void setMaxBarrier(int maxBarrier) {
        this.maxBarrier = maxBarrier;
    }

    public String getHistory(){
        return historyEnteredNumbers.toString();
    }
}
