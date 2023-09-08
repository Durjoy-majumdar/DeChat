package com.eclipsesource.mmv8.utils.typedarrays;

import androidx.exifinterface.media.ExifInterface;
import java.nio.ByteBuffer;

public class UInt8ClampedArray extends TypedArray {
    public UInt8ClampedArray(ByteBuffer byteBuffer) {
        super(byteBuffer);
    }

    public short get(int i) {
        return (short) (this.buffer.get(i) & ExifInterface.MARKER);
    }

    public int getType() {
        return 12;
    }

    public int length() {
        return this.buffer.limit();
    }

    public void put(int i, short s) {
        if (s > 255) {
            this.buffer.put(i, (byte) -1);
        } else if (s < 0) {
            this.buffer.put(i, (byte) 0);
        } else {
            this.buffer.put(i, (byte) s);
        }
    }

    public UInt8ClampedArray(ArrayBuffer arrayBuffer) {
        this(arrayBuffer.getByteBuffer());
    }
}
