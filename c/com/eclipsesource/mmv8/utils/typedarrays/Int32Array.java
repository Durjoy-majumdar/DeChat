package com.eclipsesource.mmv8.utils.typedarrays;

import java.nio.ByteBuffer;

public class Int32Array extends TypedArray {
    public Int32Array(ByteBuffer byteBuffer) {
        super(byteBuffer);
    }

    public int get(int i) {
        return this.buffer.asIntBuffer().get(i);
    }

    public int getType() {
        return 1;
    }

    public int length() {
        return this.buffer.asIntBuffer().limit();
    }

    public void put(int i, int i2) {
        this.buffer.asIntBuffer().put(i, i2);
    }

    public Int32Array(ArrayBuffer arrayBuffer) {
        this(arrayBuffer.getByteBuffer());
    }
}
