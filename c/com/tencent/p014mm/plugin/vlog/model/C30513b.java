package com.tencent.p014mm.plugin.vlog.model;

import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.vlog.model.b */
public final class C30513b {

    /* renamed from: a */
    public final String f82218a;

    /* renamed from: b */
    public final long f82219b;

    /* renamed from: c */
    public final long f82220c;

    public C30513b(String str, long j, long j2) {
        C87412m.m108594g(str, "path");
        this.f82218a = str;
        this.f82219b = j;
        this.f82220c = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30513b)) {
            return false;
        }
        C30513b bVar = (C30513b) obj;
        return C87412m.m108589b(this.f82218a, bVar.f82218a) && this.f82219b == bVar.f82219b && this.f82220c == bVar.f82220c;
    }

    public int hashCode() {
        long j = this.f82219b;
        long j2 = this.f82220c;
        return (((this.f82218a.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "ABAVideoInfo(path=" + this.f82218a + ", videoStart=" + this.f82219b + ", videoEnd=" + this.f82220c + ')';
    }
}
