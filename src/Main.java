public class Main {
    public static void main(String[] args) {
        int clientBalance = 100;
        int replenishment = 1100;
        int bonus;
        int totalBalance;

        if (replenishment <= 1000) {
            bonus = 0;
        } else {
            bonus = replenishment / 100;
        }

        totalBalance = clientBalance + replenishment + bonus;
        System.out.println("Бонус за пополнение счета: " + bonus);
        System.out.println("Сумма баланса: " + totalBalance);
    }
}
