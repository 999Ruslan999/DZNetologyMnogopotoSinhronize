public class Main {
    public static void main(String[] args) {


String letters = "RLRFR";
int length = 100;
int numThread = 5;

        for (int i = 0; i < numThread; i++) {
            Thread thread = new Thread(new Way(letters, length));
            thread.start();

        }


    }
}