public class FizzBuzz {
    public static void main(String[] args) {
        int div3;
        int div5;
        for (int i = 1; i < 100; i++) {
            div3 = i % 3;
            div5 = i % 5;
            if (div3 == 0 && div5 == 0) System.out.println("FizzBuzz");
            else if (div3 == 0) System.out.println("Fizz");
            else if (div5 == 0) System.out.println("Buzz");
            else System.out.println(i);

        }
    }
}
