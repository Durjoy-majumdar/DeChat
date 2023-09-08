package com.p013qq.taf.jce.dynamic;

/* renamed from: com.qq.taf.jce.dynamic.ZeroField */
public final class ZeroField extends NumberField {
    public ZeroField(int i) {
        super(i);
    }

    public byte byteValue() {
        return 0;
    }

    public double doubleValue() {
        return 0.0d;
    }

    public float floatValue() {
        return 0.0f;
    }

    public Number getNumber() {
        return 0;
    }

    public int intValue() {
        return 0;
    }

    public long longValue() {
        return 0;
    }

    public short shortValue() {
        return 0;
    }
}
