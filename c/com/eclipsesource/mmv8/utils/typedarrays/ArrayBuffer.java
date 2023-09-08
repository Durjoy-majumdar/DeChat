package com.eclipsesource.mmv8.utils.typedarrays;

import androidx.exifinterface.media.ExifInterface;
import java.nio.ByteBuffer;

public class ArrayBuffer {
    private ByteBuffer byteBuffer;

    public ArrayBuffer(int i) {
        this.byteBuffer = ByteBuffer.allocateDirect(i);
    }

    private ByteBuffer validateByteBuffer(ByteBuffer byteBuffer2) {
        if (byteBuffer2.isDirect()) {
            return byteBuffer2;
        }
        throw new IllegalArgumentException("ByteBuffer must be a allocated as a direct ByteBuffer");
    }

    public byte getByte(int i) {
        return this.byteBuffer.get(i);
    }

    public ByteBuffer getByteBuffer() {
        return this.byteBuffer;
    }

    public short getUnsignedByte(int i) {
        return (short) (this.byteBuffer.get(i) & ExifInterface.MARKER);
    }

    public int limit() {
        return this.byteBuffer.limit();
    }

    public void put(int i, byte b) {
        this.byteBuffer.put(i, b);
    }

    public String toString() {
        return "[object ArrayBuffer]";
    }

    public ArrayBuffer(byte[] bArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        this.byteBuffer = allocateDirect;
        allocateDirect.put(bArr, 0, bArr.length);
    }

    public ArrayBuffer(ByteBuffer byteBuffer2) {
        this.byteBuffer = validateByteBuffer(byteBuffer2);
    }
}
