package com.wzhang.basic.strategy.demo1;

public class StrategyDemo {
    public static void execute(Strategy strategy){
        strategy.solve();
    }
    public static void main(String[] args) {
        Strategy[] algorithms = {new FOO(), new BAR()};
        for (Strategy algorithm : algorithms) {
            execute(algorithm);
        }
    }
}
