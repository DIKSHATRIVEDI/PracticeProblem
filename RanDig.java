import java.util.Random;
public class RanDig{
    public static void main(String[] args) {
        Random rand = new Random();
        int[] a = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = rand.nextInt(900)+100;
        }
        System.out.println("Random values:");
        for (int v : a) {
            System.out.println(v);
        }
        int minValue = a[0];
        int maxValue = a[0];
        for (int v : a) {
            if (v < minValue) {
                minValue = v;
            }
            if (v > maxValue) {
                maxValue = v;
            }
        }
        System.out.println("Minimum value: " + minValue);
        System.out.println("Maximum value: " + maxValue);
}
}
