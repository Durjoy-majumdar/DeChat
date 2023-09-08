package com.tencent.p014mm.memory;

import java.util.Arrays;

/* renamed from: com.tencent.mm.memory.g */
public class C92708g extends C92702a<byte[]> {

    /* renamed from: d */
    public static final C92708g f266813d = new C92708g();

    /* renamed from: b */
    public Object mo126891b(Comparable comparable) {
        return new byte[((Integer) comparable).intValue()];
    }

    /* renamed from: e */
    public long mo126894e(Object obj) {
        return (long) ((byte[]) obj).length;
    }

    /* renamed from: f */
    public Comparable mo126895f(Object obj) {
        byte[] bArr = (byte[]) obj;
        if (bArr == null || bArr.length <= 0) {
            return 0;
        }
        return Integer.valueOf(bArr.length);
    }

    /* renamed from: g */
    public long mo126896g() {
        return 1048576;
    }

    /* renamed from: h */
    public long mo126897h() {
        return 5242880;
    }

    /* renamed from: i */
    public Comparable mo126898i(Comparable comparable) {
        return (Integer) comparable;
    }

    /* renamed from: j */
    public C92705d mo126899j(Comparable comparable) {
        return new C92707f(((Integer) comparable).intValue());
    }

    /* renamed from: n */
    public synchronized void mo126908n(byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        mo126900k(bArr);
    }
}
