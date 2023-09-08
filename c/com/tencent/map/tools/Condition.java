package com.tencent.map.tools;

public abstract class Condition<T> implements ReturnCallback<Boolean, T> {
    public abstract boolean condition(T t);

    public final Boolean callback(T t) {
        return Boolean.valueOf(condition(t));
    }
}
