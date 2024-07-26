package week04;

import week03.AbstractOperation;

public class MultiplyOperation extends AbstractOperation {
    @Override
    public double operate(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
//    public double operate (int firstNumber, int secondNumber){
//        return firstNumber * secondNumber;
//    }
}
