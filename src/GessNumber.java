import java.util.Random;
import java.util.Scanner;

public class GessNumber {

    public class GuessNumber {
        private int minRange;
        private int maxRange;
        private int attemptQuantity;

        private Scanner scanner;
        private Random random;

        public GuessNumber(int minRange, int maxRange, int attemptQuantity) {
            this.minRange = minRange;
            this.maxRange = maxRange;
            this.attemptQuantity = attemptQuantity;
            scanner = new Scanner(System.in);
            random = new Random();
        }

        public void startGame() {
            int randomValue = random.nextInt((maxRange - minRange) + 1);
            int difference = 0;
            boolean isFirstTry = true;
            boolean isGameOver = false;
            greetings();
            System.out.println(randomValue);

            while (!isGameOver) { // 5
                attemptQuantity--;
                int userValue = scanner.nextInt();
                if (userValue == randomValue) {
                    System.out.println(String.format("Поздравляю! Ты сохранил %s попыток", attemptQuantity));
                    isGameOver = true;
                } else {
                    if (attemptQuantity == 0) {
                        System.out.println("Ты проиграл!!! У тебя нет больше попыток!!");
                        isGameOver = true;
                    } else if(isFirstTry) {
                        isFirstTry = false;
                        difference = Math.abs(randomValue - userValue);
                        System.out.println(String.format("Не угадал! Осталось %s попыток! Попробуй ещё раз!", attemptQuantity));
                    } else {
                        int temp = Math.abs(randomValue - userValue);
                        String hint = difference == temp ? "ОПА А РАЗНИЦА ТА РАВНА МЕЖДУ СОБОЙ" : (difference > temp ? "Теплее" : "Холоднее");
                        difference = temp;
                        System.out.println(String.format("%s! Снова не угадал! Осталось %s попыток! Попробуй ещё раз!", hint, attemptQuantity));
                    }
                }
            }
        }

        private void greetings() {
            System.out.println(String.format("Привет! Я загадал число от %s до %s", minRange, maxRange));
            System.out.println(String.format("У тебя есть %s попыток", attemptQuantity));
        }
    }

}
