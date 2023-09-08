package com.p013qq.taf.jce.dynamic;

/* renamed from: com.qq.taf.jce.dynamic.ByteArrayField */
public class ByteArrayField extends JceField {
    private byte[] data;

    public ByteArrayField(byte[] bArr, int i) {
        super(i);
        this.data = bArr;
    }

    public byte[] get() {
        return this.data;
    }

    public void set(byte[] bArr) {
        this.data = bArr;
    }
}
