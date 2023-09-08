package com.tencent.p014mm.plugin.vlog.model;

import gy3.C8480h;

/* renamed from: com.tencent.mm.plugin.vlog.model.q */
public final class C96553q {

    /* renamed from: a */
    public boolean f282582a;

    /* renamed from: b */
    public boolean f282583b;

    /* renamed from: c */
    public boolean f282584c;

    /* renamed from: d */
    public int f282585d;

    /* renamed from: e */
    public boolean f282586e;

    /* renamed from: f */
    public boolean f282587f;

    /* renamed from: g */
    public boolean f282588g;

    public C96553q() {
        this(false, false, false, 0, false, false, false, 127, (C8480h) null);
    }

    public C96553q(boolean z, boolean z2, boolean z3, int i, boolean z4, boolean z5, boolean z6, int i2, C8480h hVar) {
        z = (i2 & 1) != 0 ? true : z;
        z2 = (i2 & 2) != 0 ? true : z2;
        z3 = (i2 & 4) != 0 ? false : z3;
        i = (i2 & 8) != 0 ? 0 : i;
        z4 = (i2 & 16) != 0 ? false : z4;
        z5 = (i2 & 32) != 0 ? false : z5;
        z6 = (i2 & 64) != 0 ? false : z6;
        this.f282582a = z;
        this.f282583b = z2;
        this.f282584c = z3;
        this.f282585d = i;
        this.f282586e = z4;
        this.f282587f = z5;
        this.f282588g = z6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C96553q)) {
            return false;
        }
        C96553q qVar = (C96553q) obj;
        return this.f282582a == qVar.f282582a && this.f282583b == qVar.f282583b && this.f282584c == qVar.f282584c && this.f282585d == qVar.f282585d && this.f282586e == qVar.f282586e && this.f282587f == qVar.f282587f && this.f282588g == qVar.f282588g;
    }

    public int hashCode() {
        boolean z = this.f282582a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.f282583b;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f282584c;
        if (z4) {
            z4 = true;
        }
        int i3 = (((i2 + (z4 ? 1 : 0)) * 31) + this.f282585d) * 31;
        boolean z5 = this.f282586e;
        if (z5) {
            z5 = true;
        }
        int i4 = (i3 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.f282587f;
        if (z6) {
            z6 = true;
        }
        int i5 = (i4 + (z6 ? 1 : 0)) * 31;
        boolean z7 = this.f282588g;
        if (!z7) {
            z2 = z7;
        }
        return i5 + (z2 ? 1 : 0);
    }

    public String toString() {
        return "ExportResult(success=" + this.f282582a + ", canRetry=" + this.f282583b + ", isCancel=" + this.f282584c + ", result=" + this.f282585d + ", videoSoft=" + this.f282586e + ", audioSoft=" + this.f282587f + ", parallelExport=" + this.f282588g + ')';
    }
}
