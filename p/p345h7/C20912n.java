package p345h7;

import java.util.Arrays;
import p333e8.C20528a;

/* renamed from: h7.n */
public final class C20912n {

    /* renamed from: a */
    public final int f59209a;

    /* renamed from: b */
    public boolean f59210b;

    /* renamed from: c */
    public boolean f59211c;

    /* renamed from: d */
    public byte[] f59212d;

    /* renamed from: e */
    public int f59213e;

    public C20912n(int i, int i2) {
        this.f59209a = i;
        byte[] bArr = new byte[(i2 + 3)];
        this.f59212d = bArr;
        bArr[2] = 1;
    }

    /* renamed from: a */
    public void mo32622a(byte[] bArr, int i, int i2) {
        if (this.f59210b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f59212d;
            int length = bArr2.length;
            int i4 = this.f59213e;
            if (length < i4 + i3) {
                this.f59212d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, this.f59212d, this.f59213e, i3);
            this.f59213e += i3;
        }
    }

    /* renamed from: b */
    public boolean mo32623b(int i) {
        if (!this.f59210b) {
            return false;
        }
        this.f59213e -= i;
        this.f59210b = false;
        this.f59211c = true;
        return true;
    }

    /* renamed from: c */
    public void mo32624c() {
        this.f59210b = false;
        this.f59211c = false;
    }

    /* renamed from: d */
    public void mo32625d(int i) {
        boolean z = true;
        C20528a.m22240d(!this.f59210b);
        if (i != this.f59209a) {
            z = false;
        }
        this.f59210b = z;
        if (z) {
            this.f59213e = 3;
            this.f59211c = false;
        }
    }
}
