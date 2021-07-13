public class Task1_Figures {
    public static void main(String[] args) {
        //triangle1();
        //System.out.println("");
        //triangle2();
        //System.out.println("");
        //triangle6();
        //System.out.println("");
        //slash2();
        //System.out.println("");
        //slash1();
        //System.out.println("");
        //cross();
        //System.out.println("");
        //square();
        //System.out.println("");
        rhombus();
        //System.out.println("");


    }


    public static void triangle1() {
        int x = 10;
        for (int i = 0; i < x; i++) { // rows quantity
            for (int j = 0; j < i; j++) { // columns quantity
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void triangle2() {
        int x = 10;
        for (int i = 0; i < x; i++) { // rows quantity
            for (int j = 0; j < x; j++) {
                if (j > i) {
                    System.out.println("*");
                }
            }
            System.out.println("");
        }

    }

    public static void slash1() {
        int x = 10;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    public static void slash2() {
        int x = 10;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (i == x - j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    public static void cross() {
        int x = 10;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (i == j || i == x - j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    public static void rhombus() {
        int x = 10;
        int center = x / 2;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (i < center) {
                    if (j >= center - i && j <= center + i) {
                        System.out.print("* ");
                    } else
                        System.out.print(" ");
                } else {
                    if (j >= center + i - x + 1 && j <= center - i + x - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print(" ");
                    }

                }
            }
            System.out.println("");
        }
    }


    public static void triangle6() {
        int x = 10;
        for (int i = 1; i <= x + 1; i++) { // rows quantity
            for (int j = i; j <= x - 1; j++) {  // columns quantity{
                System.out.print("* ");
            }
            System.out.println("");
        }

    }

    public static void square() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

