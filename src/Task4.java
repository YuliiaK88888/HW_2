public class Task4 {
    public static void main(String[] args) {
        pruntNums();
    }

    public static void pruntNums() {
        int temp = 10;
        for (int i = 0; i < temp; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print((temp - i) + " ");
            }
        }

    }
}
