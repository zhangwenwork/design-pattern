package com.wzhang.basic.strategy.demo;

public class OperationMultiply implements Strategy{
    @Override
    public int doOperation(int firstNum, int secNumber) {
        return firstNum * secNumber;
    }
}
