package jq3;

import gy3.C8480h;
import gy3.C87412m;
import p573jk.C33586b;

/* renamed from: jq3.s */
public final class C33631s {

    /* renamed from: a */
    public final C9493c f91020a;

    /* renamed from: b */
    public final long f91021b;

    /* renamed from: c */
    public int f91022c;

    public C33631s(C9493c cVar, long j, int i, C8480h hVar) {
        j = (i & 2) != 0 ? C33586b.m40132a() : j;
        C87412m.m108594g(cVar, "convertData");
        this.f91020a = cVar;
        this.f91021b = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33631s)) {
            return false;
        }
        C33631s sVar = (C33631s) obj;
        return C87412m.m108589b(this.f91020a, sVar.f91020a) && this.f91021b == sVar.f91021b;
    }

    public int hashCode() {
        long j = this.f91021b;
        return (this.f91020a.hashCode() * 31) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "WxRVDataItem(convertData=" + this.f91020a + ", exposeTimestamp=" + this.f91021b + ')';
    }
}
