package com.eclipsesource.mmv8.utils.typedarrays;

import java.nio.ByteBuffer;

public class Float32Array extends TypedArray {
    public Float32Array(ByteBuffer byteBuffer) {
        super(byteBuffer);
    }

    public float get(int i) {
        return this.buffer.asFloatBuffer().get(i);
    }

    public int getType() {
        return 16;
    }

    public int length() {
        return this.buffer.asFloatBuffer().limit();
    }

    public void put(int i, float f) {
        this.buffer.asFloatBuffer().put(i, f);
    }

    public Float32Array(ArrayBuffer arrayBuffer) {
        this(arrayBuffer.getByteBuffer());
    }
}
