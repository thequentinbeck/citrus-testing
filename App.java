public class App {
    private final int BIRTH_YEAR = 2005;
    
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println("birth year: %d", BIRTH_YEAR);
    }

    private int helper() {
        System.out.println("not helpful");
        return -1;
    }

    public void printNumbers() {
        for (int k = 0; k < 20; k++) {
            System.out.println(k);
        }
    }
}
