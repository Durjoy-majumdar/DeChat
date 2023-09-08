package com.eclipsesource.mmv8;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class V8ArrayBuffer extends V8Value {
    private ByteBuffer byteBuffer;

    public V8ArrayBuffer(C80135V8 v8, int i) {
        super(v8);
        initialize(v8.getV8RuntimePtr(), Integer.valueOf(i));
        ByteBuffer createV8ArrayBufferBackingStore = v8.createV8ArrayBufferBackingStore(v8.getV8RuntimePtr(), this.objectHandle, i);
        this.byteBuffer = createV8ArrayBufferBackingStore;
        createV8ArrayBufferBackingStore.order(ByteOrder.nativeOrder());
    }

    public V8Value createTwin() {
        return new V8ArrayBuffer(this.f234641v8, this.byteBuffer);
    }

    public ByteBuffer getBackingStore() {
        this.f234641v8.checkReleased();
        this.f234641v8.checkThread();
        return this.byteBuffer;
    }

    public void initialize(long j, Object obj) {
        this.f234641v8.checkThread();
        if (obj instanceof ByteBuffer) {
            ByteBuffer byteBuffer2 = (ByteBuffer) obj;
            int limit = byteBuffer2.limit();
            C80135V8 v8 = this.f234641v8;
            this.objectHandle = v8.initNewV8ArrayBuffer(v8.getV8RuntimePtr(), byteBuffer2, limit);
        } else {
            int intValue = ((Integer) obj).intValue();
            C80135V8 v84 = this.f234641v8;
            this.objectHandle = v84.initNewV8ArrayBuffer(v84.getV8RuntimePtr(), intValue);
        }
        this.released = false;
        addObjectReference(this.objectHandle);
    }

    public V8ArrayBuffer twin() {
        return (V8ArrayBuffer) super.twin();
    }

    public V8ArrayBuffer(C80135V8 v8, ByteBuffer byteBuffer2) {
        super(v8);
        if (byteBuffer2.isDirect()) {
            initialize(v8.getV8RuntimePtr(), byteBuffer2);
            this.byteBuffer = byteBuffer2;
            byteBuffer2.order(ByteOrder.nativeOrder());
            return;
        }
        throw new IllegalArgumentException("ByteBuffer must be a allocated as a direct ByteBuffer");
    }
}
