package Uzduoitis4;

import java.util.ArrayList;
import java.util.List;

public class ListOfNumbers {
    private List<Double> doubleList = new ArrayList<>();

    public void addNumber(Double skaicius){
        doubleList.add(skaicius);
    }

    public double getAverage(){
        Double sum = 0d;
        for (Double num : doubleList){
            sum+=num;
        }
        return sum / doubleList.size();
    }

    public String toString() {
        return "ListOfNumbers{" +
                "doubleList=" + doubleList +
                '}';
    }
}
