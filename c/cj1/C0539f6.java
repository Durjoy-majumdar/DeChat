package cj1;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: cj1.f6 */
public final class C0539f6 {

    /* renamed from: a */
    public FinderObject f1307a;

    /* renamed from: b */
    public long f1308b;

    /* renamed from: c */
    public boolean f1309c;

    public C0539f6(FinderObject finderObject, long j, int i, C8480h hVar) {
        j = (i & 2) != 0 ? System.currentTimeMillis() : j;
        C87412m.m108594g(finderObject, "info");
        this.f1307a = finderObject;
        this.f1308b = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0539f6)) {
            return false;
        }
        C0539f6 f6Var = (C0539f6) obj;
        return C87412m.m108589b(this.f1307a, f6Var.f1307a) && this.f1308b == f6Var.f1308b;
    }

    public int hashCode() {
        long j = this.f1308b;
        return (this.f1307a.hashCode() * 31) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "LivingStatusInfoCacheItem(info=" + this.f1307a + ", timeStamp=" + this.f1308b + ')';
    }
}
