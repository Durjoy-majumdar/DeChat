package com.tencent.mapsdk.internal;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.mapsdk.internal.n */
public final class C113979n {

    /* renamed from: a */
    public ByteBuffer f340970a;

    /* renamed from: b */
    public String f340971b;

    /* renamed from: c */
    private C104568r f340972c;

    private C113979n(ByteBuffer byteBuffer) {
        this.f340971b = "GBK";
        this.f340970a = byteBuffer;
    }

    /* renamed from: b */
    private ByteBuffer m158285b() {
        return this.f340970a;
    }

    /* renamed from: c */
    private void m158290c(String str, int i) {
        m158269a(str.length() + 10);
        byte[] a = C80342i.m97831a(str);
        if (a.length > 255) {
            m158286b((byte) 7, i);
            this.f340970a.putInt(a.length);
            this.f340970a.put(a);
            return;
        }
        m158286b((byte) 6, i);
        this.f340970a.put((byte) a.length);
        this.f340970a.put(a);
    }

    /* renamed from: a */
    public final byte[] mo172523a() {
        byte[] bArr = new byte[this.f340970a.position()];
        System.arraycopy(this.f340970a.array(), 0, bArr, 0, this.f340970a.position());
        return bArr;
    }

    /* renamed from: b */
    private void m158286b(byte b, int i) {
        if (i < 15) {
            this.f340970a.put((byte) (b | (i << 4)));
        } else if (i < 256) {
            this.f340970a.put((byte) (b | 240));
            this.f340970a.put((byte) i);
        } else {
            throw new C113924l("tag is too large: ".concat(String.valueOf(i)));
        }
    }

    /* renamed from: a */
    private void m158269a(int i) {
        if (this.f340970a.remaining() < i) {
            try {
                ByteBuffer allocate = ByteBuffer.allocate((this.f340970a.capacity() + i) * 2);
                allocate.put(this.f340970a.array(), 0, this.f340970a.position());
                this.f340970a = allocate;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    public C113979n(int i) {
        this.f340971b = "GBK";
        this.f340970a = ByteBuffer.allocate(i);
    }

    /* renamed from: b */
    private void m158287b(String str, int i) {
        byte[] a = C80342i.m97831a(str);
        m158269a(a.length + 10);
        if (a.length > 255) {
            m158286b((byte) 7, i);
            this.f340970a.putInt(a.length);
            this.f340970a.put(a);
            return;
        }
        m158286b((byte) 6, i);
        this.f340970a.put((byte) a.length);
        this.f340970a.put(a);
    }

    public C113979n() {
        this(128);
    }

    /* renamed from: a */
    public final void mo172521a(boolean z, int i) {
        mo172510a(z ? (byte) 1 : 0, i);
    }

    /* renamed from: c */
    private C104568r m158289c() {
        return this.f340972c;
    }

    /* renamed from: a */
    public final void mo172510a(byte b, int i) {
        m158269a(3);
        if (b == 0) {
            m158286b((byte) 12, i);
            return;
        }
        m158286b((byte) 0, i);
        this.f340970a.put(b);
    }

    /* renamed from: a */
    public final void mo172520a(short s, int i) {
        m158269a(4);
        if (s < -128 || s > 127) {
            m158286b((byte) 1, i);
            this.f340970a.putShort(s);
            return;
        }
        mo172510a((byte) s, i);
    }

    /* renamed from: b */
    private void m158288b(Object[] objArr, int i) {
        m158269a(8);
        m158286b((byte) 9, i);
        mo172513a(objArr.length, 0);
        for (Object a : objArr) {
            mo172516a(a, 0);
        }
    }

    /* renamed from: a */
    public final void mo172513a(int i, int i2) {
        m158269a(6);
        if (i < -32768 || i > 32767) {
            m158286b((byte) 2, i2);
            this.f340970a.putInt(i);
            return;
        }
        mo172520a((short) i, i2);
    }

    /* renamed from: a */
    public final void mo172514a(long j, int i) {
        m158269a(10);
        if (j < -2147483648L || j > 2147483647L) {
            m158286b((byte) 3, i);
            this.f340970a.putLong(j);
            return;
        }
        mo172513a((int) j, i);
    }

    /* renamed from: a */
    public final void mo172512a(float f, int i) {
        m158269a(6);
        m158286b((byte) 4, i);
        this.f340970a.putFloat(f);
    }

    /* renamed from: a */
    public final void mo172511a(double d, int i) {
        m158269a(10);
        m158286b((byte) 5, i);
        this.f340970a.putDouble(d);
    }

    /* renamed from: a */
    public final void mo172517a(String str, int i) {
        byte[] bArr;
        try {
            bArr = str.getBytes(this.f340971b);
        } catch (UnsupportedEncodingException unused) {
            bArr = str.getBytes();
        }
        m158269a(bArr.length + 10);
        if (bArr.length > 255) {
            m158286b((byte) 7, i);
            this.f340970a.putInt(bArr.length);
            this.f340970a.put(bArr);
            return;
        }
        m158286b((byte) 6, i);
        this.f340970a.put((byte) bArr.length);
        this.f340970a.put(bArr);
    }

    /* renamed from: a */
    public final <K, V> void mo172519a(Map<K, V> map, int i) {
        int i2;
        m158269a(8);
        m158286b((byte) 8, i);
        if (map == null) {
            i2 = 0;
        } else {
            i2 = map.size();
        }
        mo172513a(i2, 0);
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                mo172516a(next.getKey(), 0);
                mo172516a(next.getValue(), 1);
            }
        }
    }

    /* renamed from: a */
    private void m158284a(boolean[] zArr, int i) {
        m158269a(8);
        m158286b((byte) 9, i);
        mo172513a(zArr.length, 0);
        for (boolean a : zArr) {
            mo172521a(a, 0);
        }
    }

    /* renamed from: a */
    public final void mo172522a(byte[] bArr, int i) {
        m158269a(bArr.length + 8);
        m158286b((byte) 13, i);
        m158286b((byte) 0, 0);
        mo172513a(bArr.length, 0);
        this.f340970a.put(bArr);
    }

    /* renamed from: a */
    private void m158283a(short[] sArr, int i) {
        m158269a(8);
        m158286b((byte) 9, i);
        mo172513a(sArr.length, 0);
        for (short a : sArr) {
            mo172520a(a, 0);
        }
    }

    /* renamed from: a */
    private void m158280a(int[] iArr, int i) {
        m158269a(8);
        m158286b((byte) 9, i);
        mo172513a(iArr.length, 0);
        for (int a : iArr) {
            mo172513a(a, 0);
        }
    }

    /* renamed from: a */
    private void m158281a(long[] jArr, int i) {
        m158269a(8);
        m158286b((byte) 9, i);
        mo172513a(jArr.length, 0);
        for (long a : jArr) {
            mo172514a(a, 0);
        }
    }

    /* renamed from: a */
    private void m158279a(float[] fArr, int i) {
        m158269a(8);
        m158286b((byte) 9, i);
        mo172513a(fArr.length, 0);
        for (float a : fArr) {
            mo172512a(a, 0);
        }
    }

    /* renamed from: a */
    private void m158278a(double[] dArr, int i) {
        m158269a(8);
        m158286b((byte) 9, i);
        mo172513a(dArr.length, 0);
        for (double a : dArr) {
            mo172511a(a, 0);
        }
    }

    /* renamed from: a */
    private <T> void m158282a(T[] tArr, int i) {
        m158288b((Object[]) tArr, i);
    }

    /* renamed from: a */
    public final <T> void mo172518a(Collection<T> collection, int i) {
        int i2;
        m158269a(8);
        m158286b((byte) 9, i);
        if (collection == null) {
            i2 = 0;
        } else {
            i2 = collection.size();
        }
        mo172513a(i2, 0);
        if (collection != null) {
            for (T a : collection) {
                mo172516a((Object) a, 0);
            }
        }
    }

    /* renamed from: a */
    public final void mo172515a(C114029p pVar, int i) {
        m158269a(2);
        m158286b((byte) 10, i);
        pVar.writeTo(this);
        m158269a(2);
        m158286b((byte) 11, 0);
    }

    /* renamed from: a */
    private void m158272a(Byte b, int i) {
        mo172510a(b.byteValue(), i);
    }

    /* renamed from: a */
    private void m158271a(Boolean bool, int i) {
        mo172521a(bool.booleanValue(), i);
    }

    /* renamed from: a */
    private void m158277a(Short sh, int i) {
        mo172520a(sh.shortValue(), i);
    }

    /* renamed from: a */
    private void m158275a(Integer num, int i) {
        mo172513a(num.intValue(), i);
    }

    /* renamed from: a */
    private void m158276a(Long l, int i) {
        mo172514a(l.longValue(), i);
    }

    /* renamed from: a */
    private void m158274a(Float f, int i) {
        mo172512a(f.floatValue(), i);
    }

    /* renamed from: a */
    private void m158273a(Double d, int i) {
        mo172511a(d.doubleValue(), i);
    }

    /* renamed from: a */
    public final void mo172516a(Object obj, int i) {
        if (obj instanceof Byte) {
            mo172510a(((Byte) obj).byteValue(), i);
        } else if (obj instanceof Boolean) {
            mo172521a(((Boolean) obj).booleanValue(), i);
        } else if (obj instanceof Short) {
            mo172520a(((Short) obj).shortValue(), i);
        } else if (obj instanceof Integer) {
            mo172513a(((Integer) obj).intValue(), i);
        } else if (obj instanceof Long) {
            mo172514a(((Long) obj).longValue(), i);
        } else if (obj instanceof Float) {
            mo172512a(((Float) obj).floatValue(), i);
        } else if (obj instanceof Double) {
            mo172511a(((Double) obj).doubleValue(), i);
        } else if (obj instanceof String) {
            mo172517a((String) obj, i);
        } else if (obj instanceof Map) {
            mo172519a((Map) obj, i);
        } else if (obj instanceof List) {
            mo172518a((List) obj, i);
        } else if (obj instanceof C114029p) {
            mo172515a((C114029p) obj, i);
        } else if (obj instanceof byte[]) {
            mo172522a((byte[]) obj, i);
        } else if (obj instanceof boolean[]) {
            m158284a((boolean[]) obj, i);
        } else if (obj instanceof short[]) {
            m158283a((short[]) obj, i);
        } else if (obj instanceof int[]) {
            m158280a((int[]) obj, i);
        } else if (obj instanceof long[]) {
            m158281a((long[]) obj, i);
        } else if (obj instanceof float[]) {
            m158279a((float[]) obj, i);
        } else if (obj instanceof double[]) {
            m158278a((double[]) obj, i);
        } else if (obj.getClass().isArray()) {
            m158288b((Object[]) obj, i);
        } else if (obj instanceof Collection) {
            mo172518a((Collection) obj, i);
        } else {
            throw new C113924l("write object error: unsupport type. " + obj.getClass());
        }
    }

    /* renamed from: a */
    public final int mo172509a(String str) {
        this.f340971b = str;
        return 0;
    }

    /* renamed from: a */
    private void m158270a(C104568r rVar) {
        this.f340972c = rVar;
    }
}
