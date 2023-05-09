package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        if (lastFibonacci < 1) {
            //"The number of terms should be at least 1."
            return;
        }

        long first = 0;
        long second = 1;
        for (int i = 1; i <= lastFibonacci; i++) {
            System.out.println(first);
            long next = first + second;
            first = second;
            second = next;
        }
    }
}
