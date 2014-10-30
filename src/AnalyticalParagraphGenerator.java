public class AnalyticalParagraphGenerator {

    public static void main(String[] args) {
        int quotes = 2;
        System.out.println("A: Thesis statement.\n");
        for (int i = 1; i <= quotes; i++) {
            System.out.println("B: Setup of quote " + i + ".");
            System.out.println("C: Quote " + i + ".");
            System.out.println("D: Explanation of quote " + i + ".\n");
        }
        System.out.println("E: Concluding statement.");
    }
}
