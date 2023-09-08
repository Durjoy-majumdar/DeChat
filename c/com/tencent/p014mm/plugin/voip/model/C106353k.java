package com.tencent.p014mm.plugin.voip.model;

import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.tencent.mm.plugin.voip.model.k */
public class C106353k {

    /* renamed from: a */
    public int f317375a;

    /* renamed from: b */
    public InputStream f317376b;

    /* renamed from: c */
    public int f317377c;

    /* renamed from: d */
    public int f317378d;

    /* renamed from: e */
    public final OutputStream f317379e;

    /* renamed from: f */
    public int[] f317380f = new int[8];

    /* renamed from: g */
    public int f317381g;

    public C106353k(InputStream inputStream) {
        this.f317376b = inputStream;
        this.f317379e = null;
        this.f317377c = inputStream.read();
        this.f317378d = inputStream.read();
    }

    /* renamed from: a */
    public int mo152632a(boolean z) {
        if (this.f317375a == 8) {
            this.f317377c = this.f317378d;
            this.f317378d = this.f317376b.read();
            this.f317375a = 0;
            if (this.f317377c == -1) {
                return -1;
            }
        }
        int i = this.f317377c;
        int i2 = this.f317375a;
        int i3 = (i >> (7 - i2)) & 1;
        this.f317375a = i2 + 1;
        if (z && this.f317379e != null) {
            mo152640i(i3);
        }
        return i3;
    }

    /* renamed from: b */
    public boolean mo152633b(boolean z) {
        return mo152632a(z) == 1;
    }

    /* renamed from: c */
    public long mo152634c(int i) {
        if (i <= 64) {
            long j = 0;
            for (int i2 = 0; i2 < i; i2++) {
                j = (j << 1) | ((long) mo152632a(true));
            }
            return j;
        }
        throw new IllegalArgumentException("Can not readByte more then 64 bit");
    }

    /* renamed from: d */
    public long mo152635d(int i, String str) {
        long c = mo152634c(i);
        String.valueOf(c);
        return c;
    }

    /* renamed from: e */
    public int mo152636e(String str) {
        int i = 0;
        int i2 = 0;
        while (mo152632a(true) == 0) {
            i2++;
        }
        if (i2 > 0) {
            i = (int) (((long) ((1 << i2) - 1)) + mo152634c(i2));
        }
        String.valueOf(i);
        return i;
    }

    /* renamed from: f */
    public void mo152637f(int i) {
        if (i <= 64) {
            for (int i2 = 0; i2 < i; i2++) {
                mo152632a(true);
            }
            return;
        }
        throw new IllegalArgumentException("Can not skip more then 64 bit");
    }

    /* renamed from: g */
    public void mo152638g(int i) {
        int i2;
        int[] iArr = new int[i];
        int i3 = 8;
        int i4 = 8;
        for (int i5 = 0; i5 < i; i5++) {
            if (i3 != 0) {
                int i6 = 0;
                while (mo152632a(true) == 0) {
                    i6++;
                }
                if (i6 > 0) {
                    i2 = (int) (((long) ((1 << i6) - 1)) + mo152634c(i6));
                } else {
                    i2 = 0;
                }
                int i7 = i2 & 1;
                int i8 = ((i2 >> 1) + i7) * ((i7 << 1) - 1);
                String.valueOf(i8);
                i3 = ((i8 + i4) + 256) % 256;
            }
            if (i3 != 0) {
                i4 = i3;
            }
            iArr[i5] = i4;
        }
    }

    /* renamed from: h */
    public void mo152639h(String str) {
        int i = 0;
        while (mo152632a(true) == 0) {
            i++;
        }
        if (i > 0) {
            mo152637f(i);
        }
    }

    /* renamed from: i */
    public void mo152640i(int i) {
        if (this.f317381g == 8) {
            this.f317381g = 0;
            mo152641j();
        }
        int[] iArr = this.f317380f;
        int i2 = this.f317381g;
        this.f317381g = i2 + 1;
        iArr[i2] = i;
    }

    /* renamed from: j */
    public final void mo152641j() {
        int[] iArr = this.f317380f;
        this.f317379e.write(iArr[7] | (iArr[0] << 7) | (iArr[1] << 6) | (iArr[2] << 5) | (iArr[3] << 4) | (iArr[4] << 3) | (iArr[5] << 2) | (iArr[6] << 1));
    }

    /* renamed from: k */
    public void mo152642k(long j, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            mo152640i(((int) (j >> ((i - i2) - 1))) & 1);
        }
    }

    /* renamed from: l */
    public void mo152643l(int i, String str) {
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
        mo152642k(0, i2);
        mo152640i(1);
        mo152642k((long) (i - i4), i2);
    }

    public C106353k(InputStream inputStream, OutputStream outputStream) {
        this.f317376b = inputStream;
        this.f317379e = outputStream;
        this.f317377c = inputStream.read();
        this.f317378d = inputStream.read();
    }
}
