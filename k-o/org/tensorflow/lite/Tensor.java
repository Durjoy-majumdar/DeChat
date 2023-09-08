package org.tensorflow.lite;

import java.lang.reflect.Array;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.util.Arrays;

public final class Tensor {

    /* renamed from: a */
    public long f257225a;

    /* renamed from: b */
    public final C89287a f257226b;

    /* renamed from: c */
    public int[] f257227c;

    public Tensor(long j) {
        this.f257225a = j;
        int dtype = dtype(j);
        for (C89287a aVar : C89287a.f257235n) {
            if (aVar.f257237d == dtype) {
                this.f257226b = aVar;
                this.f257227c = shape(j);
                shapeSignature(j);
                quantizationScale(j);
                quantizationZeroPoint(j);
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("DataType error: DataType ");
        sb.append(dtype);
        sb.append(" is not recognized in Java (version ");
        TensorFlowLite.m111603a();
        sb.append(TensorFlowLite.nativeRuntimeVersion());
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }

    private static native ByteBuffer buffer(long j);

    /* renamed from: c */
    public static int m111591c(Object obj) {
        if (obj == null || !obj.getClass().isArray()) {
            return 0;
        }
        if (Array.getLength(obj) != 0) {
            return m111591c(Array.get(obj, 0)) + 1;
        }
        throw new IllegalArgumentException("Array lengths cannot be 0.");
    }

    private static native long create(long j, int i);

    private static native void delete(long j);

    private static native int dtype(long j);

    /* renamed from: f */
    public static void m111592f(Object obj, int i, int[] iArr) {
        if (iArr != null && i != iArr.length) {
            int length = Array.getLength(obj);
            int i2 = iArr[i];
            if (i2 == 0) {
                iArr[i] = length;
            } else if (i2 != length) {
                throw new IllegalArgumentException(String.format("Mismatched lengths (%d and %d) in dimension %d", new Object[]{Integer.valueOf(iArr[i]), Integer.valueOf(length), Integer.valueOf(i)}));
            }
            for (int i3 = 0; i3 < length; i3++) {
                m111592f(Array.get(obj, i3), i + 1, iArr);
            }
        }
    }

    /* renamed from: g */
    public static Tensor m111593g(long j, int i) {
        return new Tensor(create(j, i));
    }

    private static native boolean hasDelegateBufferHandle(long j);

    private static native int index(long j);

    private static native String name(long j);

    private static native int numBytes(long j);

    private static native float quantizationScale(long j);

    private static native int quantizationZeroPoint(long j);

    private static native void readMultiDimensionalArray(long j, Object obj);

    private static native int[] shape(long j);

    private static native int[] shapeSignature(long j);

    private static native void writeDirectBuffer(long j, Buffer buffer);

    private static native void writeMultiDimensionalArray(long j, Object obj);

    private static native void writeScalar(long j, Object obj);

    /* renamed from: a */
    public final ByteBuffer mo123613a() {
        return buffer(this.f257225a).order(ByteOrder.nativeOrder());
    }

    /* renamed from: b */
    public void mo123614b() {
        delete(this.f257225a);
        this.f257225a = 0;
    }

    /* renamed from: d */
    public int[] mo123615d(Object obj) {
        int c = m111591c(obj);
        if (this.f257226b == C89287a.STRING) {
            Class<?> cls = obj.getClass();
            if (cls.isArray()) {
                while (cls.isArray()) {
                    cls = cls.getComponentType();
                }
                if (Byte.TYPE.equals(cls)) {
                    c--;
                }
            }
        }
        int[] iArr = new int[c];
        m111592f(obj, 0, iArr);
        return iArr;
    }

    /* renamed from: e */
    public Object mo123616e(Object obj) {
        if (obj != null) {
            mo123621l(obj);
            boolean z = obj instanceof Buffer;
            if (z) {
                Buffer buffer = (Buffer) obj;
                int numBytes = numBytes(this.f257225a);
                int capacity = obj instanceof ByteBuffer ? buffer.capacity() : buffer.capacity() * this.f257226b.mo123622a();
                if (numBytes > capacity) {
                    throw new IllegalArgumentException(String.format("Cannot copy from a TensorFlowLite tensor (%s) with %d bytes to a Java Buffer with %d bytes.", new Object[]{mo123617h(), Integer.valueOf(numBytes), Integer.valueOf(capacity)}));
                }
            } else {
                int[] d = mo123615d(obj);
                if (!Arrays.equals(d, this.f257227c)) {
                    throw new IllegalArgumentException(String.format("Cannot copy from a TensorFlowLite tensor (%s) with shape %s to a Java object with shape %s.", new Object[]{mo123617h(), Arrays.toString(this.f257227c), Arrays.toString(d)}));
                }
            }
            if (z) {
                Buffer buffer2 = (Buffer) obj;
                if (buffer2 instanceof ByteBuffer) {
                    ((ByteBuffer) buffer2).put(mo123613a());
                } else if (buffer2 instanceof FloatBuffer) {
                    ((FloatBuffer) buffer2).put(mo123613a().asFloatBuffer());
                } else if (buffer2 instanceof LongBuffer) {
                    ((LongBuffer) buffer2).put(mo123613a().asLongBuffer());
                } else if (buffer2 instanceof IntBuffer) {
                    ((IntBuffer) buffer2).put(mo123613a().asIntBuffer());
                } else {
                    throw new IllegalArgumentException("Unexpected output buffer type: " + buffer2);
                }
            } else {
                readMultiDimensionalArray(this.f257225a, obj);
            }
            return obj;
        } else if (hasDelegateBufferHandle(this.f257225a)) {
            return obj;
        } else {
            throw new IllegalArgumentException("Null outputs are allowed only if the Tensor is bound to a buffer handle.");
        }
    }

    /* renamed from: h */
    public String mo123617h() {
        return name(this.f257225a);
    }

    /* renamed from: i */
    public int mo123618i() {
        int i = 1;
        for (int i2 : this.f257227c) {
            i *= i2;
        }
        return i;
    }

    /* renamed from: j */
    public void mo123619j() {
        this.f257227c = shape(this.f257225a);
    }

    /* renamed from: k */
    public void mo123620k(Object obj) {
        if (obj != null) {
            mo123621l(obj);
            boolean z = obj instanceof Buffer;
            if (z) {
                Buffer buffer = (Buffer) obj;
                int numBytes = numBytes(this.f257225a);
                int capacity = obj instanceof ByteBuffer ? buffer.capacity() : buffer.capacity() * this.f257226b.mo123622a();
                if (numBytes != capacity) {
                    throw new IllegalArgumentException(String.format("Cannot copy to a TensorFlowLite tensor (%s) with %d bytes from a Java Buffer with %d bytes.", new Object[]{mo123617h(), Integer.valueOf(numBytes), Integer.valueOf(capacity)}));
                }
            } else {
                int[] d = mo123615d(obj);
                if (!Arrays.equals(d, this.f257227c)) {
                    throw new IllegalArgumentException(String.format("Cannot copy to a TensorFlowLite tensor (%s) with shape %s from a Java object with shape %s.", new Object[]{mo123617h(), Arrays.toString(this.f257227c), Arrays.toString(d)}));
                }
            }
            if (z) {
                Buffer buffer2 = (Buffer) obj;
                if (buffer2 instanceof ByteBuffer) {
                    ByteBuffer byteBuffer = (ByteBuffer) buffer2;
                    if (!byteBuffer.isDirect() || byteBuffer.order() != ByteOrder.nativeOrder()) {
                        mo123613a().put(byteBuffer);
                    } else {
                        writeDirectBuffer(this.f257225a, buffer2);
                    }
                } else if (buffer2 instanceof LongBuffer) {
                    LongBuffer longBuffer = (LongBuffer) buffer2;
                    if (!longBuffer.isDirect() || longBuffer.order() != ByteOrder.nativeOrder()) {
                        mo123613a().asLongBuffer().put(longBuffer);
                    } else {
                        writeDirectBuffer(this.f257225a, buffer2);
                    }
                } else if (buffer2 instanceof FloatBuffer) {
                    FloatBuffer floatBuffer = (FloatBuffer) buffer2;
                    if (!floatBuffer.isDirect() || floatBuffer.order() != ByteOrder.nativeOrder()) {
                        mo123613a().asFloatBuffer().put(floatBuffer);
                    } else {
                        writeDirectBuffer(this.f257225a, buffer2);
                    }
                } else if (buffer2 instanceof IntBuffer) {
                    IntBuffer intBuffer = (IntBuffer) buffer2;
                    if (!intBuffer.isDirect() || intBuffer.order() != ByteOrder.nativeOrder()) {
                        mo123613a().asIntBuffer().put(intBuffer);
                    } else {
                        writeDirectBuffer(this.f257225a, buffer2);
                    }
                } else {
                    throw new IllegalArgumentException("Unexpected input buffer type: " + buffer2);
                }
            } else if (obj.getClass().isArray()) {
                writeMultiDimensionalArray(this.f257225a, obj);
            } else {
                writeScalar(this.f257225a, obj);
            }
        } else if (!hasDelegateBufferHandle(this.f257225a)) {
            throw new IllegalArgumentException("Null inputs are allowed only if the Tensor is bound to a buffer handle.");
        }
    }

    /* renamed from: l */
    public final void mo123621l(Object obj) {
        C89287a aVar;
        if (!(obj instanceof ByteBuffer)) {
            Class<String> cls = String.class;
            if (obj != null) {
                Class<?> cls2 = obj.getClass();
                if (cls2.isArray()) {
                    while (cls2.isArray()) {
                        cls2 = cls2.getComponentType();
                    }
                    if (Float.TYPE.equals(cls2)) {
                        aVar = C89287a.FLOAT32;
                    } else if (Integer.TYPE.equals(cls2)) {
                        aVar = C89287a.INT32;
                    } else if (Byte.TYPE.equals(cls2)) {
                        C89287a aVar2 = this.f257226b;
                        C89287a aVar3 = C89287a.STRING;
                        aVar = aVar2 == aVar3 ? aVar3 : C89287a.UINT8;
                    } else if (Long.TYPE.equals(cls2)) {
                        aVar = C89287a.INT64;
                    } else if (Boolean.TYPE.equals(cls2)) {
                        aVar = C89287a.BOOL;
                    } else if (cls.equals(cls2)) {
                        aVar = C89287a.STRING;
                    }
                } else if (Float.class.equals(cls2) || (obj instanceof FloatBuffer)) {
                    aVar = C89287a.FLOAT32;
                } else if (Integer.class.equals(cls2) || (obj instanceof IntBuffer)) {
                    aVar = C89287a.INT32;
                } else if (Byte.class.equals(cls2)) {
                    aVar = C89287a.UINT8;
                } else if (Long.class.equals(cls2) || (obj instanceof LongBuffer)) {
                    aVar = C89287a.INT64;
                } else if (Boolean.class.equals(cls2)) {
                    aVar = C89287a.BOOL;
                } else if (cls.equals(cls2)) {
                    aVar = C89287a.STRING;
                }
                if (aVar != this.f257226b && !aVar.mo123623b().equals(this.f257226b.mo123623b())) {
                    throw new IllegalArgumentException(String.format("Cannot convert between a TensorFlowLite tensor with type %s and a Java object of type %s (which is compatible with the TensorFlowLite type %s).", new Object[]{this.f257226b, obj.getClass().getName(), aVar}));
                }
                return;
            }
            throw new IllegalArgumentException("DataType error: cannot resolve DataType of " + obj.getClass().getName());
        }
    }
}
