package pa;

public class DailyPlan {
    public static String createDailyPlan(String[] plans) {
        //Write code below this line
        int counter = 1;
        StringBuilder builder = new StringBuilder().append("My plans:");
        for (String st : plans) {
            builder.append("\n").append(counter).append(".) ").append(st).append(";");
            counter++;
        }
        return builder.toString();
        //Write code above this line
    }
}
