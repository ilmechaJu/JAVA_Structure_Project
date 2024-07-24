package week03;

public class Main {
    public static void main(String[] args){
        Calculator calculator = new Calculator(
                new AddOperation(),
                new DivideOperation(),
                new MultiplyOperation(),
                new SubstractOperation()
        );
        System.out.println(calculator.calculate("+", 10, 20));
        System.out.println(calculator.calculate("-", 10, 20));
        System.out.println(calculator.calculate("*", 10, 20));
    }
}
