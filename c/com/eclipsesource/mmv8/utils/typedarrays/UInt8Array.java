package com.eclipsesource.mmv8.utils.typedarrays;

import androidx.exifinterface.media.ExifInterface;
import java.nio.ByteBuffer;

public class UInt8Array extends TypedArray {
    public UInt8Array(ByteBuffer byteBuffer) {
        super(byteBuffer);
    }

    public short get(int i) {
        return (short) (this.buffer.get(i) & ExifInterface.MARKER);
    }

    public int getType() {
        return 11;
    }

    public int length() {
        return this.buffer.limit();
    }

    public void put(int i, short s) {
        this.buffer.put(i, (byte) (s & 255));
    }

    public UInt8Array(ArrayBuffer arrayBuffer) {
        this(arrayBuffer.getByteBuffer());
    }
}
