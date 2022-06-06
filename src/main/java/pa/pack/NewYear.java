package pa.pack;

public class NewYear {

    private int ne;

    public int nextHappyYear(int year) {
        // Your code is here ... See you Next Happy Year !!!
        System.out.println("year = " + year);
        boolean flag = true;
        while (flag) {
            year++;
            boolean isNewYear = false;
            char[] ch = String.valueOf(year).toCharArray();
            for (int i = 0; i < ch.length - 1; i++) {
                for (int j = i + 1; j < ch.length; j++) {
                    if (ch[i] == ch[j]) {
                        isNewYear = true;
                    }
                }
            }
            if (isNewYear) {
                isNewYear = false;
                continue;
            } else {
                return year;
            }
        }
        return 1;
    }
}
