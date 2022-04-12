public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println(printThreeWords());
        System.out.println(checkSumSign());
        System.out.println(printColor());
        System.out.println(compareNumbers());
    }

    public static String printThreeWords() {
        return "Orange\n" + "Banana\n" + "Apple";
    }

    public static String checkSumSign() {
        int a = 5;
        int b = 10;
        String aa = "Сумма положительная";
        String bb = "Сумма отрицательная";

        if (a + b >= 0) {
            return aa;
        } else {
            return bb;
        }
    }

    public static String printColor() {
        int value = 0;

        if (value <= 0) {
            return "Красный";
        }
        if (value > 0 && value <= 100) {
            return "Желтый";
        } else {
            return "Зеленый";
        }
    }

    public static String compareNumbers() {
        int a = 50;
        int b = 50;
        if (a >= b) {
            return "a >= b";
        } else {
            return "a < b";
        }
    }
}
