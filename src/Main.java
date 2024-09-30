public class Main {

    public static void main(String[] args) {
        double fahrenheit = 100;
        double celsius = 37.78;

        System.out.println(fahrenheit + " F = " + ((fahrenheit - 32) * 5 / 9) + " C");
        System.out.println(celsius + " C = " + ((celsius * 9 / 5) + 32) + " F");
    }
}