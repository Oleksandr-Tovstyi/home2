package pa;

public class Football {
    public int matchResult(int result1, int result2, int bet1, int bet2) {
        //Write code below this line
        int realResult = 1; // draw
        realResult = (result1 > result2) ? 2 : realResult; // win
        realResult = (result1 < result2) ? 0 : realResult; // lost
        int betResult = 1;
        betResult = (bet1 > bet2) ? 2 : betResult;
        betResult = (bet1 < bet2) ? 0 : betResult;
        int answer = (result1 == bet1 && result2 == bet2) ? 2 : 1;
        answer = (realResult != betResult) ? 0 : answer;
        return answer;
        //Write code above this line
    }
}
