package com.eclipsesource.mmv8.utils;

public abstract class SingleTypeAdapter implements TypeAdapter {
    private int typeToAdapt;

    public SingleTypeAdapter(int i) {
        this.typeToAdapt = i;
    }

    public Object adapt(int i, Object obj) {
        return i == this.typeToAdapt ? adapt(obj) : TypeAdapter.DEFAULT;
    }

    public abstract Object adapt(Object obj);
}
