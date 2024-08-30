import java.util.Scanner;

public class Ex1 {
    /**
     * Calculate the sum of an arithmetic progression.
     *
     * @param start The first term of the progression
     * @param step The common difference between consecutive terms
     * @param count The number of terms to sum
     * @return The sum of the arithmetic progression
     */
    public static long calculateGaussSum(long start, long step, int count) {
        long total = 0, num = start;
		for(int i = 0; i < count; i++, num += step) total += num;
        return total;

        //return start * count + (step * count * (count - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("start: ");
        long start = s.nextLong();
        System.out.print("step: ");
        long step = s.nextLong();
        System.out.print("count: ");
        int count = s.nextInt();

        s.close();

        System.out.println("calculateGaussSum(" + start + ", " + step + ", " + count + ") = " + calculateGaussSum(start, step, count));
    }
}