public class Main {
    public static void main(String[] args) {

        int account = 100;
        int addition = 2_000;
        int finalBonus;

        if (addition >= 1_000) {
            finalBonus = addition / 100;
        } else {
            finalBonus = 0;
        }
        int finalAccount = account + addition + finalBonus;
        System.out.println("Бонус: " + finalBonus + " руб.");
        System.out.println("Итоговый счёт: " + finalAccount + " руб.");
    }
}