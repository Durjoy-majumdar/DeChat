package p300c8;

import java.util.Arrays;
import p333e8.C20528a;
import p333e8.C20551y;

/* renamed from: c8.k */
public final class C16873k implements C16870b {

    /* renamed from: a */
    public final boolean f45599a;

    /* renamed from: b */
    public final int f45600b;

    /* renamed from: c */
    public final C16869a[] f45601c;

    /* renamed from: d */
    public int f45602d;

    /* renamed from: e */
    public int f45603e;

    /* renamed from: f */
    public int f45604f;

    /* renamed from: g */
    public C16869a[] f45605g;

    public C16873k(boolean z, int i) {
        C20528a.m22237a(i > 0);
        this.f45599a = z;
        this.f45600b = i;
        this.f45604f = 0;
        this.f45605g = new C16869a[100];
        this.f45601c = new C16869a[1];
    }

    /* renamed from: a */
    public synchronized void mo17928a(C16869a[] aVarArr) {
        boolean z;
        int i = this.f45604f;
        int length = aVarArr.length + i;
        C16869a[] aVarArr2 = this.f45605g;
        if (length >= aVarArr2.length) {
            this.f45605g = (C16869a[]) Arrays.copyOf(aVarArr2, Math.max(aVarArr2.length * 2, i + aVarArr.length));
        }
        for (C16869a aVar : aVarArr) {
            byte[] bArr = aVar.f45597a;
            if (bArr != null) {
                if (bArr.length != this.f45600b) {
                    z = false;
                    C20528a.m22237a(z);
                    C16869a[] aVarArr3 = this.f45605g;
                    int i2 = this.f45604f;
                    this.f45604f = i2 + 1;
                    aVarArr3[i2] = aVar;
                }
            }
            z = true;
            C20528a.m22237a(z);
            C16869a[] aVarArr32 = this.f45605g;
            int i25 = this.f45604f;
            this.f45604f = i25 + 1;
            aVarArr32[i25] = aVar;
        }
        this.f45603e -= aVarArr.length;
        notifyAll();
    }

    /* renamed from: b */
    public synchronized void mo17929b() {
        int i = this.f45602d;
        int i2 = this.f45600b;
        int i3 = C20551y.f57835a;
        int max = Math.max(0, (((i + i2) - 1) / i2) - this.f45603e);
        int i4 = this.f45604f;
        if (max < i4) {
            Arrays.fill(this.f45605g, max, i4, (Object) null);
            this.f45604f = max;
        }
    }
}
