package com.tencent.qqmusic.mediaplayer;

public class BufferInfo {
    public int bufferSize;
    public byte[] byteBuffer;
    public byte[] tempByteBuffer;

    public void appendByte(byte[] bArr, int i, int i2) {
        if (bArr != null && i >= 0 && i2 > 0 && i + i2 <= bArr.length) {
            setByteBufferCapacity(this.bufferSize + i2);
            System.arraycopy(bArr, i, this.byteBuffer, this.bufferSize, i2);
        }
    }

    public void fillByte(byte[] bArr, int i) {
        if (bArr != null && i > 0 && i <= bArr.length) {
            this.byteBuffer = bArr;
            this.bufferSize = i;
        }
    }

    public BufferInfo fillInto(BufferInfo bufferInfo) {
        bufferInfo.bufferSize = this.bufferSize;
        bufferInfo.byteBuffer = this.byteBuffer;
        bufferInfo.tempByteBuffer = this.tempByteBuffer;
        return bufferInfo;
    }

    public void setByteBufferCapacity(int i) {
        byte[] bArr = this.byteBuffer;
        if (bArr == null || bArr.length < i) {
            this.byteBuffer = new byte[i];
        }
    }

    public void setTempByteBufferCapacity(int i) {
        byte[] bArr = this.tempByteBuffer;
        if (bArr == null || bArr.length < i) {
            this.tempByteBuffer = new byte[i];
        }
    }
}
