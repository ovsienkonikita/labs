package lab1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ListAnalyzerTest {

    @Test
    public void testSum() {
        List<List<Double>> matrix = __generateMatrix();
        ListAnalyzer analyzer = new ListAnalyzer(matrix);
        double sum = analyzer.getSum();
        assertEquals(36100.0, sum);
    }

    @Test
    public void testMin() {
        List<List<Double>> matrix = __generateMatrix();
        ListAnalyzer analyzer = new ListAnalyzer(matrix);
        double min = analyzer.getMin();
        assertEquals(0.0, min);
    }

    @Test
    public void testMax() {
        List<List<Double>> matrix = __generateMatrix();
        ListAnalyzer analyzer = new ListAnalyzer(matrix);
        double max = analyzer.getMax();
        assertEquals(361.0, max);
    }

    private List<List<Double>> __generateMatrix() {
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