package week04;

import week03.AbstractOperation;

public class SubstractOperation extends AbstractOperation {
    @Override
    public double operate(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
//    public double operate (int firstNumber, int secondNumber)
//    {
//        return firstNumber - secondNumber;
//    }
}
