public class Task2 {
    public static void main(String[] args) {
        fibonachi();
        System.out.println(sumAandB(8, 7));

    }

    private static void fibonachi() {
        int tempo = 1;
        int tempo2 = 1;
        do {
            System.out.println(tempo2);
            int n = tempo;
            tempo = tempo2; //tempo=1
            tempo2 = tempo2 + n; //tempo2=2
        } while (tempo2 < 100);
    }

    private static int sumAandB(int a, int b) {
        return a + b;
    }

}
