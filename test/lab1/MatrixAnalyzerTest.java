package lab1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MatrixAnalyzerTest {

    @Test
    public void testSum() {
        List<List<Double>> matrix = generateMatrix();
        MatrixAnalyzer analyzer = new MatrixAnalyzer(matrix);
        double sum = analyzer.getSum();
        assertEquals(36100.0, sum);
    }

    @Test
    public void testMin() {
        List<List<Double>> matrix = generateMatrix();
        MatrixAnalyzer analyzer = new MatrixAnalyzer(matrix);
        double min = analyzer.getMin();
        assertEquals(0.0, min);
    }

    @Test
    public void testMax() {
        List<List<Double>> matrix = generateMatrix();
        MatrixAnalyzer analyzer = new MatrixAnalyzer(matrix);
        double max = analyzer.getMax();
        assertEquals(361.0, max);
    }

    private List<List<Double>> generateMatrix() {
        List<List<Double>> main_list = new ArrayList<>(20);
        for (int i = 0; i < 20; i++) {
            List<Double> child_list = new ArrayList<>(20);
            for (int y = 0; y < 20; y++) {
                child_list.add((double) (y * i));
            }
            main_list.add(child_list);
        }
        return main_list;
    }
}