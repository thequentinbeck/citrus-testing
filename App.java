public class App {
    private final int BIRTH_YEAR = 2005;
    
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println("birth year: %d", BIRTH_YEAR);
    }

    private void helper() {
        System.out.println("not helpful");
    }
}
