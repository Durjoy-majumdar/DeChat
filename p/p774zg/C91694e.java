package p774zg;

import java.nio.ByteBuffer;

/* renamed from: zg.e */
public interface C91694e {
    void bufferStoreBindTo(long j, long j2);

    int generateId();

    ByteBuffer getBuffer(int i, boolean z);

    void releaseDirectByteBuffer(ByteBuffer byteBuffer);

    void setBuffer(int i, ByteBuffer byteBuffer);

    boolean supportBufferStoreBindTo();
}
