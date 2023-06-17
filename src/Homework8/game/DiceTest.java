package Homework8.game;

public class DiceTest {
    public static void main(String[] args) {
        testDiceRollInRange();
        testGamePlayWithSameResults();
        testGameWinnerPrinted();
        testGamePlayMultipleRounds();
    }
    public static void testDiceRollInRange() {
        Dice dice = new DiceImpl();

        try {
            int result = dice.roll();
            if (result > 0 && result <= 6) {
                System.out.println("Результат броска находится в рамках допустимых значений");
            } else {
                System.err.println("Результат броска находится вне рамках допустимых значений.");
            }
        } catch (Exception e) {
            System.err.println("Ошибка, возникшая при броске: " + e.getMessage());
        }
    }

    public static void testGamePlayWithSameResults() {
        Dice dice = new SameResultDice(); // Используем собственную реализацию Dice
        GameWinnerPrinterSpy winnerPrinterSpy = new GameWinnerPrinterSpy(); // Создаем шпиона
        Game game = new Game(dice, winnerPrinterSpy);
        Player player1 = new Player("Вася");
        Player player2 = new Player("Игорь");

        game.playGame(player1, player2);

        // Проверяем, что метод printWinner() был вызван у шпиона
        if (winnerPrinterSpy.isPrintWinnerMethodCalled()) {
            System.out.println("Игра прошла успешно.");
        } else {
            System.err.println("Во время игры возникла ошибка.");
        }

        // Проверяем, что переданный игрок является нулевым значением (ничья)
        Player winner = winnerPrinterSpy.getWinner();
        if (winner == null) {
            System.out.println("Победителей нет. Это ничья.");
        } else {
            System.err.println("Проверка на ничью не пройдена. Неожиданный победитель: " + winner.getName());
        }
    }

    private static class SameResultDice implements Dice {
        @Override
        public int roll() {
            return 5; // Устанавливаем одинаковый результат броска кубика
        }
    }

    private static class GameWinnerPrinterSpy implements GameWinnerPrinter {
        private boolean printWinnerMethodCalled;
        private Player winner;

        public boolean isPrintWinnerMethodCalled() {
            return printWinnerMethodCalled;
        }

        public Player getWinner() {
            return winner;
        }

        @Override
        public void printWinner(Player winner) {
            printWinnerMethodCalled = true;
            this.winner = winner;
        }
    }
    public static void testGameWinnerPrinted() {
        Dice dice = new DiceImpl();
        GameWinnerPrinterSpy winnerPrinterSpy = new GameWinnerPrinterSpy();
        Game game = new Game(dice, winnerPrinterSpy);
        Player player1 = new Player("Вася");
        Player player2 = new Player("Игорь");

        game.playGame(player1, player2);

        // Проверяем, что метод printWinner() был вызван у шпиона
        if (winnerPrinterSpy.isPrintWinnerMethodCalled()) {
            System.out.print("Метод printWinner() был вызван.");
        } else {
            System.err.println("Метод printWinner() НЕ был вызван.");
        }

        // Проверяем, что победитель не равен null
        Player winner = winnerPrinterSpy.getWinner();
        if (winner != null) {
            System.out.println(" Победитель: " + winner.getName()+". ");
        } else {
            System.err.println("Победитель не был установлен.");
        }
    }
    public static void testGamePlayMultipleRounds() {
        Dice dice = new DiceImpl();
        Player player1 = new Player("Вася");
        Player player2 = new Player("Игорь");

        // Играем 3 раунда
        for (int i = 1; i <= 3; i++) {
            System.out.println("Проверка на несколько бросков. Бросок " + i + ":");

            // Создаем новый экземпляр шпиона для каждого раунда
            GameWinnerPrinterSpy winnerPrinterSpy = new GameWinnerPrinterSpy();
            Game game = new Game(dice, winnerPrinterSpy);

            game.playGame(player1, player2);


            // Получаем победителя и выводим его имя
            Player winner = winnerPrinterSpy.getWinner();
            if (winner != null) {
                System.out.println("Победитель: " + winner.getName());
            } else {
                System.err.println("Победитель не был установлен.");
            }
        }
    }
}






