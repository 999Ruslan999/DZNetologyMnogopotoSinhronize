import java.util.Random;

public class Way implements Runnable {

    private String letters;
    private int length;

    public Way(String letters, int length) {
        this.letters = letters;
        this.length = length;
    }


    @Override
    public void run() {
        String text = generateRoute(letters, length);
        int count = countRightTurns(text);
        System.out.println("Thread " + Thread.currentThread().getId() + "  --> " + count);

    }


    public static String generateRoute(String letters, int length) {
        Random random = new Random();
        StringBuilder route = new StringBuilder();
        for (int i = 0; i < length; i++) {
            route.append(letters.charAt(random.nextInt(letters.length())));
        }
        return route.toString();
    }

    public int countRightTurns(String text) {
     int count = 0;
        for (int i = 0; i < length; i++) {
            if(text.charAt(i) == 'R') {
                count++;
            }
        }
        return count;
    }

}