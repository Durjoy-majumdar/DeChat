package com.p013qq.taf.jce.dynamic;

/* renamed from: com.qq.taf.jce.dynamic.ShortField */
public final class ShortField extends NumberField {
    private short data;

    public ShortField(short s, int i) {
        super(i);
        this.data = s;
    }

    public short get() {
        return this.data;
    }

    public Number getNumber() {
        return Short.valueOf(this.data);
    }

    public void set(short s) {
        this.data = s;
    }
}
