package lab1;

import java.util.List;

public class MatrixAnalyzer {

    private List<List<Double>> __list;

    public MatrixAnalyzer(List<List<Double>> list) {
        __list = list;
    }

    public double getSum() {
        double sum = 0;
        for (List<Double> row : __list) {
            for (double val : row) {
                sum += val;
            }
        }
        return sum;
    }

    public double getMin() {
        double min = __list.get(0).get(0);
        for (List<Double> row : __list) {
            for (double val : row) {
                if (val < min) {
                    min = val;
                }
            }
        }
        return min;
    }

    public double getMax() {
        double max = __list.get(0).get(0);
        for (List<Double> row : __list) {
            for (double val : row) {
                if (val > max) {
                    max = val;
                }
            }
        }
        return max;
    }
}
