import java.util.Arrays;

public class Greedy {

    public static void main(String... args){
        double[] input = {
                2.00,
                6.00,
                3.50,
                3.00,
                7.50,
                4.00
        };
        System.out.println(Arrays.toString(greedy(input, 20)));
    }

    public static double[] greedy(double[] input, int max){
        double[] output = new double[input.length];
        double inputValue = 0;
        for(int i = 0; i < input.length; i++){
            int biggestIndex = getBiggestIndex(input);
            if (inputValue + input[biggestIndex] <= max) {
                output[i] = input[biggestIndex];
                inputValue += input[biggestIndex];
            }
            input[biggestIndex] = 0;
        }
        return output;
    }

    private static int getBiggestIndex(double[] input){
        int biggestIndex = 0;
        for(int i = 0; i < input.length; i++){
            if(input[biggestIndex] < input[i]){
                biggestIndex = i;
            }
        }
        return biggestIndex;
    }
}
