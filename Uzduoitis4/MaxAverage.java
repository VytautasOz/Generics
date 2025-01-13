package Uzduoitis4;

public class MaxAverage {
    public static ListOfNumbers findWithMaxAverge(ListOfNumbers... list){
        ListOfNumbers maxAvgList = null;
        Double max = 0d;
        for (ListOfNumbers num : list){
            if (num.getAverage() > max) {
                max = num.getAverage();
                maxAvgList = num;
            }
        }
        return maxAvgList;
    }
}
