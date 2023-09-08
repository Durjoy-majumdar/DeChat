package com.tencent.p014mm.sdk.platformtools;

import java.nio.ByteBuffer;

/* renamed from: com.tencent.mm.sdk.platformtools.MBuf */
class MBuf {
    private ByteBuffer buffer = null;

    public ByteBuffer getBuffer() {
        return this.buffer;
    }

    public int getLen() {
        return this.buffer.capacity();
    }

    public int getOffset() {
        return this.buffer.position();
    }

    public void setBuffer(byte[] bArr) {
        int length = bArr.length;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(length);
        this.buffer = allocateDirect;
        allocateDirect.position(0);
        this.buffer.put(bArr, 0, length);
        this.buffer.position(0);
    }
}
