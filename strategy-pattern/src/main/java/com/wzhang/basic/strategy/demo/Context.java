package com.wzhang.basic.strategy.demo;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int firstNum, int secNum) {
        return strategy.doOperation(firstNum, secNum);
    }

}
