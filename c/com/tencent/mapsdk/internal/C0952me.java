package com.tencent.mapsdk.internal;

import androidx.exifinterface.media.ExifInterface;
import java.io.UnsupportedEncodingException;

/* renamed from: com.tencent.mapsdk.internal.me */
public final class C0952me implements C0953mg {

    /* renamed from: g */
    private int f2282g = 0;

    /* renamed from: h */
    private byte[] f2283h;

    private C0952me(byte[] bArr) {
        this.f2283h = bArr;
    }

    /* renamed from: a */
    private void m909a(byte[] bArr) {
        this.f2283h = bArr;
        this.f2282g = 0;
    }

    /* renamed from: b */
    private int m911b() {
        return this.f2282g;
    }

    /* renamed from: c */
    private byte m913c() {
        int i;
        byte[] bArr = this.f2283h;
        if (bArr == null || (i = this.f2282g) >= bArr.length) {
            return 0;
        }
        this.f2282g = i + 1;
        return bArr[i];
    }

    /* renamed from: d */
    private boolean m916d() {
        return m913c() != 0;
    }

    /* renamed from: e */
    private int m917e() {
        return (int) m918e(2);
    }

    /* renamed from: f */
    private char m919f() {
        long j = 0;
        for (int i = 0; i < 2; i++) {
            j |= (long) ((m913c() & ExifInterface.MARKER) << (i * 8));
        }
        return (char) ((int) j);
    }

    /* renamed from: g */
    private int m920g() {
        return (int) m918e(4);
    }

    /* renamed from: h */
    private long m921h() {
        return m918e(8);
    }

    /* renamed from: i */
    private String m922i() {
        int e = (int) m918e(2);
        if (e == 0) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < e; i++) {
            stringBuffer.append(m919f());
        }
        return stringBuffer.toString();
    }

    /* renamed from: j */
    private String m923j() {
        int e = (int) m918e(2);
        if (e == 0) {
            return "";
        }
        byte[] bArr = new byte[e];
        for (int i = 0; i < e; i++) {
            bArr[i] = m913c();
        }
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    /* renamed from: k */
    private boolean m924k() {
        return this.f2282g == this.f2283h.length - 1;
    }

    /* renamed from: b */
    private void m912b(int i) {
        this.f2282g -= i;
    }

    /* renamed from: d */
    private String m915d(int i) {
        int i2 = i >> 1;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = 0; i3 < i2; i3++) {
            stringBuffer.append(m919f());
        }
        return stringBuffer.toString();
    }

    /* renamed from: e */
    private long m918e(int i) {
        long j = 0;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            j |= ((long) (m913c() & ExifInterface.MARKER)) << (i2 * 8);
        }
        return j;
    }

    /* renamed from: a */
    private byte[] m910a() {
        byte[] bArr = this.f2283h;
        int length = bArr.length;
        int i = this.f2282g;
        int i2 = length - i;
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    /* renamed from: c */
    private byte[] m914c(int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = m913c();
        }
        return bArr;
    }

    /* renamed from: a */
    private void m908a(int i) {
        this.f2282g += i;
    }
}
