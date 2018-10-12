package one;

public class PairTest {
    public static void main(String[] args) {
        Pair <Integer, Integer> pair1 = new Pair<>(5, 10);
        Pair <Double, Double> pair2 = new Pair<Double, Double>(0.8, 0.5);

        int first = (Integer)pair1.getFirst() + pair1.getSecond();
        double second = (Double)pair2.getFirst() + pair2.getSecond();

        System.out.println(first + second);
    }
}
