package com.wzhang.basic.strategy.demo;

public class OperationAdd implements Strategy{
    @Override
    public int doOperation(int firstNum, int secNumber) {
        return firstNum + secNumber;
    }
}
