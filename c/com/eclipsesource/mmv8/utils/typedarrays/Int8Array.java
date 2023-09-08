package com.eclipsesource.mmv8.utils.typedarrays;

import java.nio.ByteBuffer;

public class Int8Array extends TypedArray {
    public Int8Array(ByteBuffer byteBuffer) {
        super(byteBuffer);
    }

    public byte get(int i) {
        return this.buffer.get(i);
    }

    public int getType() {
        return 9;
    }

    public int length() {
        return this.buffer.limit();
    }

    public void put(int i, byte b) {
        this.buffer.put(i, b);
    }

    public Int8Array(ArrayBuffer arrayBuffer) {
        this(arrayBuffer.getByteBuffer());
    }
}
