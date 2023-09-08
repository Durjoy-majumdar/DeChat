package com.p013qq.taf.jce.dynamic;

/* renamed from: com.qq.taf.jce.dynamic.ByteField */
public final class ByteField extends NumberField {
    private byte data;

    public ByteField(byte b, int i) {
        super(i);
        this.data = b;
    }

    public byte get() {
        return this.data;
    }

    public Number getNumber() {
        return Byte.valueOf(this.data);
    }

    public void set(byte b) {
        this.data = b;
    }
}
