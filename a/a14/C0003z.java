package a14;

import fy3.C32226l;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: a14.z */
public final class C0003z {

    /* renamed from: a */
    public final Object f1a;

    /* renamed from: b */
    public final C32226l<Throwable, C13598b0> f2b;

    public C0003z(Object obj, C32226l<? super Throwable, C13598b0> lVar) {
        this.f1a = obj;
        this.f2b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0003z)) {
            return false;
        }
        C0003z zVar = (C0003z) obj;
        return C87412m.m108589b(this.f1a, zVar.f1a) && C87412m.m108589b(this.f2b, zVar.f2b);
    }

    public int hashCode() {
        Object obj = this.f1a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f2b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f1a + ", onCancellation=" + this.f2b + ')';
    }
}
