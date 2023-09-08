package y14;

import com.tencent.tinker.loader.shareutil.ShareElfFile;

/* renamed from: y14.a */
public final class C53486a {

    /* renamed from: a */
    public final byte[] f150404a;

    /* renamed from: b */
    public final int f150405b;

    /* renamed from: c */
    public int f150406c;

    public C53486a(byte[] bArr, int i, int i2) {
        this.f150404a = bArr;
        this.f150406c = i;
        this.f150405b = i + i2;
    }

    /* renamed from: a */
    public static int m59998a(int i) {
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

    /* renamed from: b */
    public static int m59999b(long j) {
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

    /* renamed from: c */
    public static int m60000c(int i) {
        return m59998a((i << 3) | 0);
    }

    /* renamed from: d */
    public final void mo74154d(int i) {
        byte[] bArr = this.f150404a;
        int i2 = this.f150406c;
        this.f150406c = i2 + 1;
        bArr[i2] = (byte) i;
    }

    /* renamed from: e */
    public final void mo74155e(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            int i = this.f150405b;
            int i2 = this.f150406c;
            int i3 = i - i2;
            if (i3 >= length) {
                System.arraycopy(bArr, 0, this.f150404a, i2, length);
                this.f150406c += length;
                return;
            }
            System.arraycopy(bArr, 0, this.f150404a, i2, i3);
            int i4 = 0 + i3;
            int i5 = length - i3;
            int i6 = this.f150405b;
            this.f150406c = i6;
            if (i5 <= i6) {
                System.arraycopy(bArr, i4, this.f150404a, 0, i5);
                this.f150406c = i5;
            }
        }
    }

    /* renamed from: f */
    public void mo74156f(int i) {
        while ((i & -128) != 0) {
            mo74154d((i & 127) | 128);
            i >>>= 7;
        }
        mo74154d(i);
    }

    /* renamed from: g */
    public void mo74157g(long j) {
        while ((-128 & j) != 0) {
            mo74154d((((int) j) & 127) | 128);
            j >>>= 7;
        }
        mo74154d((int) j);
    }

    /* renamed from: h */
    public void mo74158h(int i, int i2) {
        mo74156f((i << 3) | i2);
    }
}
