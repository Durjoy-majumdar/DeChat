package com.eclipsesource.mmv8.utils.typedarrays;

import java.nio.ByteBuffer;

public class Float64Array extends TypedArray {
    public Float64Array(ByteBuffer byteBuffer) {
        super(byteBuffer);
    }

    public double get(int i) {
        return this.buffer.asDoubleBuffer().get(i);
    }

    public int getType() {
        return 2;
    }

    public int length() {
        return this.buffer.asDoubleBuffer().limit();
    }

    public void put(int i, double d) {
        this.buffer.asDoubleBuffer().put(i, d);
    }

    public Float64Array(ArrayBuffer arrayBuffer) {
        this(arrayBuffer.getByteBuffer());
    }
}
