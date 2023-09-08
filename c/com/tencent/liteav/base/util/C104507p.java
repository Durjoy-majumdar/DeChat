package com.tencent.liteav.base.util;

/* renamed from: com.tencent.liteav.base.util.p */
public final class C104507p {

    /* renamed from: a */
    public int f309736a;

    /* renamed from: b */
    public int f309737b;

    public C104507p() {
        this(0, 0);
    }

    /* renamed from: a */
    public final void mo147175a() {
        int i = this.f309736a;
        this.f309736a = this.f309737b;
        this.f309737b = i;
    }

    /* renamed from: b */
    public final int mo147178b() {
        if (!mo147180d()) {
            return 0;
        }
        return this.f309736a * this.f309737b;
    }

    /* renamed from: c */
    public final double mo147179c() {
        return (((double) this.f309736a) * 1.0d) / ((double) this.f309737b);
    }

    /* renamed from: d */
    public final boolean mo147180d() {
        return this.f309736a > 0 && this.f309737b > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C104507p)) {
            return false;
        }
        C104507p pVar = (C104507p) obj;
        return pVar.f309736a == this.f309736a && pVar.f309737b == this.f309737b;
    }

    public final int hashCode() {
        return (this.f309736a * 32713) + this.f309737b;
    }

    public final String toString() {
        return "Size(" + this.f309736a + ", " + this.f309737b + ")";
    }

    public C104507p(int i, int i2) {
        this.f309736a = i;
        this.f309737b = i2;
    }

    /* renamed from: a */
    public final void mo147177a(C104507p pVar) {
        if (pVar != null) {
            this.f309736a = pVar.f309736a;
            this.f309737b = pVar.f309737b;
            return;
        }
        this.f309736a = 0;
        this.f309737b = 0;
    }

    public C104507p(C104507p pVar) {
        mo147177a(pVar);
    }

    /* renamed from: a */
    public final void mo147176a(int i, int i2) {
        this.f309736a = i;
        this.f309737b = i2;
    }
}
