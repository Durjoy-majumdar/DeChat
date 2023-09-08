package com.eclipsesource.mmv8.utils.typedarrays;

import java.nio.ByteBuffer;

public class UInt16Array extends TypedArray {
    public UInt16Array(ByteBuffer byteBuffer) {
        super(byteBuffer);
    }

    public int get(int i) {
        return this.buffer.asShortBuffer().get(i) & 65535;
    }

    public int getType() {
        return 14;
    }

    public int length() {
        return this.buffer.asShortBuffer().limit();
    }

    public void put(int i, int i2) {
        this.buffer.asShortBuffer().put(i, (short) (i2 & 65535));
    }

    public UInt16Array(ArrayBuffer arrayBuffer) {
        this(arrayBuffer.getByteBuffer());
    }
}
