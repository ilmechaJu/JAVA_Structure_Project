package week03;

public class Calculator {
    private final AddOperation addOperation;      // 'Calculator.java'에서의 전역변수로 설정.
    private final MultiplyOperation multiplyOperation;
    private final DivideOperation divideOperation;
    private final SubstractOperation substractOperation;
    public Calculator (AddOperation addOperation,
                       DivideOperation divideOperation,
                       MultiplyOperation multiplyOperation,
                       SubstractOperation substractOperation){
        this.addOperation = addOperation;
        this.multiplyOperation = multiplyOperation;
        this.divideOperation = divideOperation;
        this.substractOperation = substractOperation;
    } //생성자

    public double calculate(String operator, int firstNumber, int secondNumber){
        double answer = 0;

        if(operator.equals("+")){
            answer =  addOperation.operate(firstNumber, secondNumber);
        }
        else if(operator.equals("-")){
            answer =  substractOperation.operate(firstNumber, secondNumber);
        }
        else if(operator.equals("*")){
            answer =  multiplyOperation.operate(firstNumber, secondNumber);
        }
        else if(operator.equals("/")){
            answer =  divideOperation.operate(firstNumber, secondNumber);
        }
        return answer;
    }
}
