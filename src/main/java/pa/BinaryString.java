package pa;

public class BinaryString {

    public String toBinaryString(int value) {
        if (value < 0) {
            value *= -1;
        }
        if (value == 0) {
            return "0";
        }
        byte[] binary = new byte[32];
        for (int i = 0; i < 31; i++) {
            binary[i] = (byte)(value % 2);
            value /= 2;
            if (value == 0) {
                break;
            }
        }
        StringBuilder builderBinary = new StringBuilder();
        boolean firstOccurrenceOfOne = false;
        for (int k = 31; k >= 0; k--) {
            if (!firstOccurrenceOfOne && binary[k] == 0) {
                continue;
            }
            if (!firstOccurrenceOfOne && binary[k] != 0) {
                firstOccurrenceOfOne = true;
            }
            if (firstOccurrenceOfOne) {
                builderBinary.append(binary[k]);
            }
        }
        System.out.println(Integer.toBinaryString(-10));
        return builderBinary.toString();
    }
}
