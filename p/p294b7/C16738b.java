package p294b7;

import java.io.EOFException;
import java.util.Arrays;
import p300c8.C79946g;
import p333e8.C20551y;

/* renamed from: b7.b */
public final class C16738b implements C16742f {

    /* renamed from: g */
    public static final byte[] f45239g = new byte[4096];

    /* renamed from: a */
    public final C79946g f45240a;

    /* renamed from: b */
    public final long f45241b;

    /* renamed from: c */
    public long f45242c;

    /* renamed from: d */
    public byte[] f45243d = new byte[65536];

    /* renamed from: e */
    public int f45244e;

    /* renamed from: f */
    public int f45245f;

    public C16738b(C79946g gVar, long j, long j2) {
        this.f45240a = gVar;
        this.f45242c = j;
        this.f45241b = j2;
    }

    /* renamed from: a */
    public boolean mo17733a(int i, boolean z) {
        int i2 = this.f45244e + i;
        byte[] bArr = this.f45243d;
        if (i2 > bArr.length) {
            int i3 = C20551y.f57835a;
            this.f45243d = Arrays.copyOf(this.f45243d, Math.max(65536 + i2, Math.min(bArr.length * 2, i2 + 524288)));
        }
        int min = Math.min(this.f45245f - this.f45244e, i);
        while (min < i) {
            min = mo17736d(this.f45243d, this.f45244e, i, min, z);
            if (min == -1) {
                return false;
            }
        }
        int i4 = this.f45244e + i;
        this.f45244e = i4;
        this.f45245f = Math.max(this.f45245f, i4);
        return true;
    }

    /* renamed from: b */
    public boolean mo17734b(byte[] bArr, int i, int i2, boolean z) {
        if (!mo17733a(i2, z)) {
            return false;
        }
        System.arraycopy(this.f45243d, this.f45244e - i2, bArr, i, i2);
        return true;
    }

    /* renamed from: c */
    public int mo17735c(byte[] bArr, int i, int i2) {
        int i3 = this.f45245f;
        int i4 = 0;
        if (i3 != 0) {
            int min = Math.min(i3, i2);
            System.arraycopy(this.f45243d, 0, bArr, i, min);
            mo17739g(min);
            i4 = min;
        }
        if (i4 == 0) {
            i4 = mo17736d(bArr, i, i2, 0, true);
        }
        if (i4 != -1) {
            this.f45242c += (long) i4;
        }
        return i4;
    }

    /* renamed from: d */
    public final int mo17736d(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (!Thread.interrupted()) {
            int c = this.f45240a.mo110127c(bArr, i + i3, i2 - i3);
            if (c != -1) {
                return i3 + c;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedException();
    }

    /* renamed from: e */
    public boolean mo17737e(byte[] bArr, int i, int i2, boolean z) {
        int i3;
        int i4 = this.f45245f;
        if (i4 == 0) {
            i3 = 0;
        } else {
            i3 = Math.min(i4, i2);
            System.arraycopy(this.f45243d, 0, bArr, i, i3);
            mo17739g(i3);
        }
        int i5 = i3;
        while (i5 < i2 && i5 != -1) {
            i5 = mo17736d(bArr, i, i2, i5, z);
        }
        if (i5 != -1) {
            this.f45242c += (long) i5;
        }
        return i5 != -1;
    }

    /* renamed from: f */
    public void mo17738f(int i) {
        int min = Math.min(this.f45245f, i);
        mo17739g(min);
        int i2 = min;
        while (i2 < i && i2 != -1) {
            i2 = mo17736d(f45239g, -i2, Math.min(i, i2 + 4096), i2, false);
        }
        if (i2 != -1) {
            this.f45242c += (long) i2;
        }
    }

    /* renamed from: g */
    public final void mo17739g(int i) {
        int i2 = this.f45245f - i;
        this.f45245f = i2;
        this.f45244e = 0;
        byte[] bArr = this.f45243d;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[(65536 + i2)] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f45243d = bArr2;
    }
}
