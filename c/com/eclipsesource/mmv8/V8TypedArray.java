package com.eclipsesource.mmv8;

import java.nio.ByteBuffer;

public class V8TypedArray extends V8Array {

    public static class V8ArrayData {
        /* access modifiers changed from: private */
        public V8ArrayBuffer buffer;
        /* access modifiers changed from: private */
        public int offset;
        /* access modifiers changed from: private */
        public int size;
        /* access modifiers changed from: private */
        public int type;

        public V8ArrayData(V8ArrayBuffer v8ArrayBuffer, int i, int i2, int i3) {
            this.buffer = v8ArrayBuffer;
            this.offset = i;
            this.size = i2;
            this.type = i3;
        }
    }

    public V8TypedArray(C80135V8 v8, V8ArrayBuffer v8ArrayBuffer, int i, int i2, int i3) {
        super(v8, new V8ArrayData(v8ArrayBuffer, i2, i3, i));
    }

    private void checkArrayProperties(V8ArrayData v8ArrayData) {
        checkOffset(v8ArrayData);
        checkSize(v8ArrayData);
    }

    private void checkOffset(V8ArrayData v8ArrayData) {
        if (v8ArrayData.offset % getStructureSize(v8ArrayData.type) != 0) {
            throw new IllegalStateException("RangeError: Start offset of Int32Array must be a multiple of " + getStructureSize(v8ArrayData.type));
        }
    }

    private void checkSize(V8ArrayData v8ArrayData) {
        if (v8ArrayData.size < 0) {
            throw new IllegalStateException("RangeError: Invalid typed array length");
        } else if ((v8ArrayData.size * getStructureSize(v8ArrayData.type)) + v8ArrayData.offset > v8ArrayData.buffer.getBackingStore().limit()) {
            throw new IllegalStateException("RangeError: Invalid typed array length");
        }
    }

    private long createTypedArray(long j, V8ArrayData v8ArrayData) {
        int access$000 = v8ArrayData.type;
        if (access$000 == 1) {
            return this.f234641v8.initNewV8Int32Array(j, v8ArrayData.buffer.objectHandle, v8ArrayData.offset, v8ArrayData.size);
        } else if (access$000 == 2) {
            return this.f234641v8.initNewV8Float64Array(j, v8ArrayData.buffer.objectHandle, v8ArrayData.offset, v8ArrayData.size);
        } else if (access$000 != 9) {
            switch (access$000) {
                case 11:
                    return this.f234641v8.initNewV8UInt8Array(j, v8ArrayData.buffer.objectHandle, v8ArrayData.offset, v8ArrayData.size);
                case 12:
                    return this.f234641v8.initNewV8UInt8ClampedArray(j, v8ArrayData.buffer.objectHandle, v8ArrayData.offset, v8ArrayData.size);
                case 13:
                    return this.f234641v8.initNewV8Int16Array(j, v8ArrayData.buffer.objectHandle, v8ArrayData.offset, v8ArrayData.size);
                case 14:
                    return this.f234641v8.initNewV8UInt16Array(j, v8ArrayData.buffer.objectHandle, v8ArrayData.offset, v8ArrayData.size);
                case 15:
                    return this.f234641v8.initNewV8UInt32Array(j, v8ArrayData.buffer.objectHandle, v8ArrayData.offset, v8ArrayData.size);
                case 16:
                    return this.f234641v8.initNewV8Float32Array(j, v8ArrayData.buffer.objectHandle, v8ArrayData.offset, v8ArrayData.size);
                default:
                    throw new IllegalArgumentException("Cannot create a typed array of type " + V8Value.getStringRepresentation(v8ArrayData.type));
            }
        } else {
            return this.f234641v8.initNewV8Int8Array(j, v8ArrayData.buffer.objectHandle, v8ArrayData.offset, v8ArrayData.size);
        }
    }

    public static int getStructureSize(int i) {
        if (i == 1) {
            return 4;
        }
        if (i == 2) {
            return 8;
        }
        if (i != 9) {
            switch (i) {
                case 11:
                case 12:
                    break;
                case 13:
                case 14:
                    return 2;
                case 15:
                case 16:
                    return 4;
                default:
                    throw new IllegalArgumentException("Cannot create a typed array of type " + V8Value.getStringRepresentation(i));
            }
        }
        return 1;
    }

    public V8Value createTwin() {
        return new V8TypedArray(this.f234641v8);
    }

    public V8ArrayBuffer getBuffer() {
        return (V8ArrayBuffer) get("buffer");
    }

    public ByteBuffer getByteBuffer() {
        V8ArrayBuffer buffer = getBuffer();
        try {
            return buffer.getBackingStore();
        } finally {
            buffer.release();
        }
    }

    public void initialize(long j, Object obj) {
        this.f234641v8.checkThread();
        if (obj == null) {
            super.initialize(j, obj);
            return;
        }
        V8ArrayData v8ArrayData = (V8ArrayData) obj;
        checkArrayProperties(v8ArrayData);
        long createTypedArray = createTypedArray(j, v8ArrayData);
        this.released = false;
        addObjectReference(createTypedArray);
    }

    private V8TypedArray(C80135V8 v8) {
        super(v8);
    }
}
