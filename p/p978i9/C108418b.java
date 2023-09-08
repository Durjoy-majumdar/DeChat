package p978i9;

import com.tencent.tinker.loader.shareutil.ShareElfFile;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/* renamed from: i9.b */
public final class C108418b {

    /* renamed from: a */
    public final byte[] f324639a;

    /* renamed from: b */
    public final int f324640b;

    /* renamed from: c */
    public int f324641c;

    /* renamed from: i9.b$a */
    public static class C98614a extends IOException {
        public C98614a(int i, int i2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space (pos " + i + " limit " + i2 + ").");
        }
    }

    public C108418b(byte[] bArr, int i, int i2) {
        this.f324639a = bArr;
        this.f324641c = i;
        this.f324640b = i + i2;
    }

    /* renamed from: a */
    public static int m146881a(int i, byte[] bArr) {
        return m146889i(i) + m146885e(bArr.length) + bArr.length;
    }

    /* renamed from: b */
    public static int m146882b(int i, int i2) {
        return m146889i(i) + (i2 >= 0 ? m146885e(i2) : 10);
    }

    /* renamed from: c */
    public static int m146883c(int i, long j) {
        return m146889i(i) + m146886f(j);
    }

    /* renamed from: d */
    public static int m146884d(int i, C108421e eVar) {
        int i2 = m146889i(i);
        int a = eVar.mo145537a();
        eVar.f324643a = a;
        return i2 + m146885e(a) + a;
    }

    /* renamed from: e */
    public static int m146885e(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & ShareElfFile.SectionHeader.SHF_MASKPROC) == 0 ? 4 : 5;
    }

    /* renamed from: f */
    public static int m146886f(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if ((-16384 & j) == 0) {
            return 2;
        }
        if ((-2097152 & j) == 0) {
            return 3;
        }
        if ((-268435456 & j) == 0) {
            return 4;
        }
        if ((-34359738368L & j) == 0) {
            return 5;
        }
        if ((-4398046511104L & j) == 0) {
            return 6;
        }
        if ((-562949953421312L & j) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* renamed from: g */
    public static int m146887g(int i, String str) {
        return m146889i(i) + m146888h(str);
    }

    /* renamed from: h */
    public static int m146888h(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return m146885e(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("UTF-8 not supported.");
        }
    }

    /* renamed from: i */
    public static int m146889i(int i) {
        return m146885e((i << 3) | 0);
    }

    /* renamed from: j */
    public static int m146890j(int i, int i2) {
        return m146889i(i) + m146885e(i2);
    }

    /* renamed from: k */
    public static int m146891k(int i, long j) {
        return m146889i(i) + m146886f(j);
    }

    /* renamed from: l */
    public void mo158953l(int i, byte[] bArr) {
        mo158962u(i, 2);
        mo158959r(bArr.length);
        mo158958q(bArr);
    }

    /* renamed from: m */
    public void mo158954m(int i, int i2) {
        mo158962u(i, 0);
        if (i2 >= 0) {
            mo158959r(i2);
        } else {
            mo158960s((long) i2);
        }
    }

    /* renamed from: n */
    public void mo158955n(int i, long j) {
        mo158962u(i, 0);
        mo158960s(j);
    }

    /* renamed from: o */
    public void mo158956o(int i, C108421e eVar) {
        mo158962u(i, 2);
        if (eVar.f324643a < 0) {
            eVar.f324643a = eVar.mo145537a();
        }
        mo158959r(eVar.f324643a);
        eVar.mo145539e(this);
    }

    /* renamed from: p */
    public void mo158957p(int i) {
        byte b = (byte) i;
        int i2 = this.f324641c;
        if (i2 != this.f324640b) {
            byte[] bArr = this.f324639a;
            this.f324641c = i2 + 1;
            bArr[i2] = b;
            return;
        }
        throw new C98614a(this.f324641c, this.f324640b);
    }

    /* renamed from: q */
    public void mo158958q(byte[] bArr) {
        int length = bArr.length;
        int i = this.f324640b;
        int i2 = this.f324641c;
        if (i - i2 >= length) {
            System.arraycopy(bArr, 0, this.f324639a, i2, length);
            this.f324641c += length;
            return;
        }
        throw new C98614a(this.f324641c, this.f324640b);
    }

    /* renamed from: r */
    public void mo158959r(int i) {
        while ((i & -128) != 0) {
            mo158957p((i & 127) | 128);
            i >>>= 7;
        }
        mo158957p(i);
    }

    /* renamed from: s */
    public void mo158960s(long j) {
        while ((-128 & j) != 0) {
            mo158957p((((int) j) & 127) | 128);
            j >>>= 7;
        }
        mo158957p((int) j);
    }

    /* renamed from: t */
    public void mo158961t(int i, String str) {
        mo158962u(i, 2);
        byte[] bytes = str.getBytes("UTF-8");
        mo158959r(bytes.length);
        mo158958q(bytes);
    }

    /* renamed from: u */
    public void mo158962u(int i, int i2) {
        mo158959r((i << 3) | i2);
    }

    /* renamed from: v */
    public void mo158963v(int i, int i2) {
        mo158962u(i, 0);
        mo158959r(i2);
    }

    /* renamed from: w */
    public void mo158964w(int i, long j) {
        mo158962u(i, 0);
        mo158960s(j);
    }
}
