package com.eclipsesource.mmv8;

import java.nio.ByteBuffer;

public class SharedV8ArrayBuffer extends V8ArrayBuffer {
    private SharedV8ArrayBuffer(C80135V8 v8, int i) {
        super(v8, i);
        throw new IllegalArgumentException("not support this way construct");
    }

    public void initialize(long j, Object obj) {
        this.f234641v8.checkThread();
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        int limit = byteBuffer.limit();
        C80135V8 v8 = this.f234641v8;
        long initNewSharedV8ArrayBuffer = v8.initNewSharedV8ArrayBuffer(v8.getV8RuntimePtr(), byteBuffer, limit);
        this.objectHandle = initNewSharedV8ArrayBuffer;
        this.released = false;
        addObjectReference(initNewSharedV8ArrayBuffer);
    }

    public void manualRelease() {
        super.release();
    }

    public void release() {
    }

    public SharedV8ArrayBuffer(C80135V8 v8, ByteBuffer byteBuffer) {
        super(v8, byteBuffer);
    }
}
