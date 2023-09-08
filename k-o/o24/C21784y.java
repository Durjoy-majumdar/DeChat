package o24;

import gy3.C87412m;
import sx3.C110821n;

/* renamed from: o24.y */
public final class C21784y {

    /* renamed from: a */
    public final byte[] f61731a;

    /* renamed from: b */
    public int f61732b;

    /* renamed from: c */
    public int f61733c;

    /* renamed from: d */
    public boolean f61734d;

    /* renamed from: e */
    public boolean f61735e;

    /* renamed from: f */
    public C21784y f61736f;

    /* renamed from: g */
    public C21784y f61737g;

    public C21784y() {
        this.f61731a = new byte[8192];
        this.f61735e = true;
        this.f61734d = false;
    }

    /* renamed from: a */
    public final C21784y mo34186a() {
        C21784y yVar = this.f61736f;
        if (yVar == this) {
            yVar = null;
        }
        C21784y yVar2 = this.f61737g;
        C87412m.m108591d(yVar2);
        yVar2.f61736f = this.f61736f;
        C21784y yVar3 = this.f61736f;
        C87412m.m108591d(yVar3);
        yVar3.f61737g = this.f61737g;
        this.f61736f = null;
        this.f61737g = null;
        return yVar;
    }

    /* renamed from: b */
    public final C21784y mo34187b(C21784y yVar) {
        C87412m.m108594g(yVar, "segment");
        yVar.f61737g = this;
        yVar.f61736f = this.f61736f;
        C21784y yVar2 = this.f61736f;
        C87412m.m108591d(yVar2);
        yVar2.f61737g = yVar;
        this.f61736f = yVar;
        return yVar;
    }

    /* renamed from: c */
    public final C21784y mo34188c() {
        this.f61734d = true;
        return new C21784y(this.f61731a, this.f61732b, this.f61733c, true, false);
    }

    /* renamed from: d */
    public final void mo34189d(C21784y yVar, int i) {
        C87412m.m108594g(yVar, "sink");
        if (yVar.f61735e) {
            int i2 = yVar.f61733c;
            int i3 = i2 + i;
            if (i3 > 8192) {
                if (!yVar.f61734d) {
                    int i4 = yVar.f61732b;
                    if (i3 - i4 <= 8192) {
                        byte[] bArr = yVar.f61731a;
                        C110821n.m150960g(bArr, bArr, 0, i4, i2);
                        yVar.f61733c -= yVar.f61732b;
                        yVar.f61732b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.f61731a;
            byte[] bArr3 = yVar.f61731a;
            int i5 = yVar.f61733c;
            int i6 = this.f61732b;
            C110821n.m150960g(bArr2, bArr3, i5, i6, i6 + i);
            yVar.f61733c += i;
            this.f61732b += i;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public C21784y(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        C87412m.m108594g(bArr, "data");
        this.f61731a = bArr;
        this.f61732b = i;
        this.f61733c = i2;
        this.f61734d = z;
        this.f61735e = z2;
    }
}
