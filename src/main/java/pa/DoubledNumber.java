package pa;

public class DoubledNumber {
    public static int getDoubledNumber(int number) {
        boolean numberIsNegative = (number < 0) ? true : false;
        if (numberIsNegative) {
            number *= -1;
        }
        byte[] number1 = new byte[32];
        byte[] resultOfDoubled = new byte[32];
        byte[] buffer = new byte[32];
        int[] numbersToSumm = new int[32];
        int result = 0;
        for (int i = 0; i < 32; i++) {
            number1[i] = (byte)(number % 2);
            number /= 2;
            if (number == 0) {
                break;
            }
        }
        for (int j = 0; j < 31; j++) {
            buffer[j + 1] = (byte)(((short)number1[j] + number1[j] + buffer[j]) / 2);
            resultOfDoubled[j] = (byte)(((short)number1[j] + number1[j] + buffer[j]) % 2);
        }
        for (int k = 0; k < 32; k++) {
            numbersToSumm[k] = (int)(resultOfDoubled[k] * Math.pow(2, k));
        }
        for (int m : numbersToSumm) {
            result += m;
        }
        if (numberIsNegative) {
            result *= -1;
        }
        return result;
    }
}
