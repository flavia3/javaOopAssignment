public class swap1 {

    public static void main(String[] args) {

         int num1 = 1, num2 = 2;

        System.out.println("Before swap");
        System.out.println("First number = " + num1);
        System.out.println("Second number = " + num2);

        // Value of first is assigned to temporary
        int temporary = num1;

        // Value of second is assigned to first
        num1 = num2;

        // Value of temporary (which contains the initial value of first) is assigned to second
        num2 = temporary;

        System.out.println("After swap");
        System.out.println("First number = " + num1);
        System.out.println("Second number = " + num2);
    }
}