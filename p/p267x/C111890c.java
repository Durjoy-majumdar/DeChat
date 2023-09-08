package p267x;

import gy3.C8480h;
import gy3.C87412m;
import p436a1.C103229d0;
import p436a1.C103262s;
import p436a1.C27726j0;
import p835c1.C104225a;

/* renamed from: x.c */
public final class C111890c {

    /* renamed from: a */
    public C103229d0 f334984a;

    /* renamed from: b */
    public C103262s f334985b;

    /* renamed from: c */
    public C104225a f334986c;

    /* renamed from: d */
    public C27726j0 f334987d;

    public C111890c() {
        this((C103229d0) null, (C103262s) null, (C104225a) null, (C27726j0) null, 15, (C8480h) null);
    }

    public C111890c(C103229d0 d0Var, C103262s sVar, C104225a aVar, C27726j0 j0Var, int i, C8480h hVar) {
        d0Var = (i & 1) != 0 ? null : d0Var;
        sVar = (i & 2) != 0 ? null : sVar;
        aVar = (i & 4) != 0 ? null : aVar;
        j0Var = (i & 8) != 0 ? null : j0Var;
        this.f334984a = d0Var;
        this.f334985b = sVar;
        this.f334986c = aVar;
        this.f334987d = j0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C111890c)) {
            return false;
        }
        C111890c cVar = (C111890c) obj;
        return C87412m.m108589b(this.f334984a, cVar.f334984a) && C87412m.m108589b(this.f334985b, cVar.f334985b) && C87412m.m108589b(this.f334986c, cVar.f334986c) && C87412m.m108589b(this.f334987d, cVar.f334987d);
    }

    public int hashCode() {
        C103229d0 d0Var = this.f334984a;
        int i = 0;
        int hashCode = (d0Var == null ? 0 : d0Var.hashCode()) * 31;
        C103262s sVar = this.f334985b;
        int hashCode2 = (hashCode + (sVar == null ? 0 : sVar.hashCode())) * 31;
        C104225a aVar = this.f334986c;
        int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        C27726j0 j0Var = this.f334987d;
        if (j0Var != null) {
            i = j0Var.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "BorderCache(imageBitmap=" + this.f334984a + ", canvas=" + this.f334985b + ", canvasDrawScope=" + this.f334986c + ", borderPath=" + this.f334987d + ')';
    }
}
