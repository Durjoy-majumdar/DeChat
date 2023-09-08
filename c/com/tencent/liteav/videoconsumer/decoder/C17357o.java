package com.tencent.liteav.videoconsumer.decoder;

import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.tencent.liteav.videoconsumer.decoder.o */
public final class C17357o {

    /* renamed from: a */
    public C113475a f47042a = new C113475a();

    /* renamed from: b */
    public int f47043b;

    /* renamed from: c */
    private InputStream f47044c;

    /* renamed from: d */
    private int f47045d;

    /* renamed from: e */
    private int f47046e;

    /* renamed from: f */
    private final OutputStream f47047f;

    /* renamed from: g */
    private int[] f47048g = new int[8];

    /* renamed from: h */
    private int f47049h;

    public C17357o(InputStream inputStream, OutputStream outputStream) {
        this.f47044c = inputStream;
        this.f47047f = outputStream;
        this.f47045d = inputStream.read();
        this.f47046e = inputStream.read();
    }

    /* renamed from: c */
    private int m17291c(boolean z) {
        if (this.f47043b == 8) {
            m17293f();
            if (this.f47045d == -1) {
                return -1;
            }
        }
        int i = this.f47045d;
        int i2 = this.f47043b;
        int i3 = (i >> (7 - i2)) & 1;
        this.f47043b = i2 + 1;
        if (z && this.f47047f != null) {
            m17294f(i3);
        }
        return i3;
    }

    /* renamed from: e */
    private long m17292e(int i) {
        if (i <= 64) {
            long j = 0;
            for (int i2 = 0; i2 < i; i2++) {
                j = (j << 1) | ((long) m17291c(true));
            }
            return j;
        }
        throw new IllegalArgumentException("Can not readByte more then 64 bit");
    }

    /* renamed from: f */
    private void m17293f() {
        this.f47045d = this.f47046e;
        this.f47046e = this.f47044c.read();
        this.f47043b = 0;
    }

    /* renamed from: g */
    private int m17295g() {
        int i = 0;
        while (m17291c(true) == 0) {
            i++;
        }
        if (i <= 0) {
            return 0;
        }
        return (int) (((long) ((1 << i) - 1)) + m17292e(i));
    }

    /* renamed from: h */
    private void m17296h() {
        int[] iArr = this.f47048g;
        this.f47047f.write(iArr[7] | (iArr[0] << 7) | (iArr[1] << 6) | (iArr[2] << 5) | (iArr[3] << 4) | (iArr[4] << 3) | (iArr[5] << 2) | (iArr[6] << 1));
    }

    /* renamed from: a */
    public final boolean mo20426a(boolean z) {
        return m17291c(z) == 1;
    }

    /* renamed from: b */
    public final void mo20428b(int i) {
        mo20425a(i);
    }

    /* renamed from: d */
    public final void mo20432d() {
        int i = 0;
        while (m17291c(true) == 0) {
            i++;
        }
        if (i > 0) {
            mo20425a(i);
        }
    }

    /* renamed from: a */
    public final long mo20424a() {
        long e = m17292e(8);
        String.valueOf(e);
        return e;
    }

    /* renamed from: b */
    public final int mo20427b() {
        int i = 0;
        while (m17291c(false) == 0) {
            i++;
        }
        if (i <= 0) {
            return 0;
        }
        if (i <= 64) {
            long j = 0;
            for (int i2 = 0; i2 < i; i2++) {
                j = (j << 1) | ((long) m17291c(false));
            }
            return (int) (((long) ((1 << i) - 1)) + j);
        }
        throw new IllegalArgumentException("Can not readByte more then 64 bit");
    }

    /* renamed from: d */
    public final void mo20433d(int i) {
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= 15) {
                break;
            }
            int i5 = (1 << i3) + i4;
            if (i < i5) {
                i2 = i3;
                break;
            } else {
                i3++;
                i4 = i5;
            }
        }
        m17290a(0, i2);
        m17294f(1);
        m17290a((long) (i - i4), i2);
    }

    /* renamed from: e */
    public final void mo20434e() {
        m17294f(1);
        m17290a(0, 8 - this.f47049h);
        for (int i = this.f47049h; i < 8; i++) {
            this.f47048g[i] = 0;
        }
        this.f47049h = 0;
        m17296h();
    }

    /* renamed from: f */
    private void m17294f(int i) {
        if (this.f47049h == 8) {
            this.f47049h = 0;
            m17296h();
        }
        int[] iArr = this.f47048g;
        int i2 = this.f47049h;
        this.f47049h = i2 + 1;
        iArr[i2] = i;
    }

    /* renamed from: a */
    public final void mo20425a(int i) {
        if (i <= 64) {
            for (int i2 = 0; i2 < i; i2++) {
                m17291c(true);
            }
            return;
        }
        throw new IllegalArgumentException("Can not skip more then 64 bit");
    }

    /* renamed from: b */
    public final void mo20429b(boolean z) {
        m17294f(z ? 1 : 0);
    }

    /* renamed from: a */
    private void m17290a(long j, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            m17294f(((int) (j >> ((i - i2) - 1))) & 1);
        }
    }

    /* renamed from: c */
    public final int mo20430c() {
        int g = m17295g();
        String.valueOf(g);
        return g;
    }

    /* renamed from: c */
    public final void mo20431c(int i) {
        int[] iArr = new int[i];
        int i2 = 8;
        int i3 = 8;
        for (int i4 = 0; i4 < i; i4++) {
            if (i2 != 0) {
                int g = m17295g();
                int i5 = g & 1;
                int i6 = ((g >> 1) + i5) * ((i5 << 1) - 1);
                String.valueOf(i6);
                i2 = ((i6 + i3) + 256) % 256;
            }
            if (i2 != 0) {
                i3 = i2;
            }
            iArr[i4] = i3;
        }
    }
}
