package com.tencent.p014mm.plugin.vlog.model;

import com.tencent.p014mm.plugin.sight.base.ABAPrams;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.vlog.model.a */
public final class C96529a {

    /* renamed from: a */
    public final int f282482a;

    /* renamed from: b */
    public final int f282483b;

    /* renamed from: c */
    public final int f282484c;

    /* renamed from: d */
    public final int f282485d;

    /* renamed from: e */
    public final ABAPrams f282486e;

    public C96529a(int i, int i2, int i3, int i4, ABAPrams aBAPrams) {
        this.f282482a = i;
        this.f282483b = i2;
        this.f282484c = i3;
        this.f282485d = i4;
        this.f282486e = aBAPrams;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C96529a)) {
            return false;
        }
        C96529a aVar = (C96529a) obj;
        return this.f282482a == aVar.f282482a && this.f282483b == aVar.f282483b && this.f282484c == aVar.f282484c && this.f282485d == aVar.f282485d && C87412m.m108589b(this.f282486e, aVar.f282486e);
    }

    public int hashCode() {
        int i = ((((((this.f282482a * 31) + this.f282483b) * 31) + this.f282484c) * 31) + this.f282485d) * 31;
        ABAPrams aBAPrams = this.f282486e;
        return i + (aBAPrams == null ? 0 : aBAPrams.hashCode());
    }

    public String toString() {
        return "ABAResult(errCode=" + this.f282482a + ", width=" + this.f282483b + ", height=" + this.f282484c + ", bitrate=" + this.f282485d + ", abaParams=" + this.f282486e + ')';
    }
}
