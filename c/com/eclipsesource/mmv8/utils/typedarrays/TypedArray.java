package com.eclipsesource.mmv8.utils.typedarrays;

import com.eclipsesource.mmv8.V8TypedArray;
import java.nio.ByteBuffer;

public abstract class TypedArray {
    public ByteBuffer buffer;

    public TypedArray(ByteBuffer byteBuffer) {
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("ByteBuffer must be a allocated as a direct ByteBuffer");
        } else if (byteBuffer.limit() % V8TypedArray.getStructureSize(getType()) == 0) {
            this.buffer = byteBuffer;
        } else {
            throw new IllegalArgumentException("ByteBuffer must be a allocated as a direct ByteBuffer");
        }
    }

    public ByteBuffer getByteBuffer() {
        return this.buffer;
    }

    public abstract int getType();

    public abstract int length();
}
