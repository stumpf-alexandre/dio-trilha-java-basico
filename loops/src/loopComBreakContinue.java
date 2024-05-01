public class loopComBreakContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 2)
                continue;
            else if (i == 4) 
                break;

            System.out.println(i);
        }
    }
}
