package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String numberAsString = Integer.toString(t);
        int sum = 0;

        for (int i = 0; i < numberAsString.length(); i++) {
            char currentChar = numberAsString.charAt(i);

            if (Character.isDigit(currentChar)) {
                sum += Character.getNumericValue(currentChar);
            }
        }
        System.out.println(sum);
    }
}
