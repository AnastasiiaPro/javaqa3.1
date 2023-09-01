public class Main {
    public static void main(String[] args) {

        int account = 100;
        int addition = 2000;
        int finalbonus;

        if (addition >= 1000) {
            finalbonus = addition / 100;
        } else {
            finalbonus = 0;
        }
        int finalAccount = account + addition + finalbonus;
        System.out.println("Итоговый счёт: " + finalAccount + " руб.");
    }
}