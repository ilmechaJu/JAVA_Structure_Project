package week03;

public class Calculator {
    private AbstractOperation operation;

    public Calculator (AbstractOperation operation){
        this.operation = operation;
    } //생성자


    public void setOperation (AbstractOperation operation){
        this.operation = operation;
    }

    public double calculate(int firstNumber, int secondNumber){
        double answer = 0;
        answer = operation.operate(firstNumber, secondNumber);

        return answer;
    }
}
