package p543h0;

import com.google.firebase.analytics.FirebaseAnalytics;
import gy3.C8480h;
import gy3.C87412m;
import p502e0.C107071a;
import p502e0.C107074g;

/* renamed from: h0.y */
public final class C107984y {

    /* renamed from: a */
    public final C107071a f323367a;

    /* renamed from: b */
    public final C107071a f323368b;

    /* renamed from: c */
    public final C107071a f323369c;

    public C107984y() {
        this((C107071a) null, (C107071a) null, (C107071a) null, 7, (C8480h) null);
    }

    public C107984y(C107071a aVar, C107071a aVar2, C107071a aVar3, int i, C8480h hVar) {
        aVar = (i & 1) != 0 ? C107074g.m144958a((float) 4) : aVar;
        aVar2 = (i & 2) != 0 ? C107074g.m144958a((float) 4) : aVar2;
        aVar3 = (i & 4) != 0 ? C107074g.m144958a((float) 0) : aVar3;
        C87412m.m108594g(aVar, "small");
        C87412m.m108594g(aVar2, FirebaseAnalytics.C113379b.MEDIUM);
        C87412m.m108594g(aVar3, "large");
        this.f323367a = aVar;
        this.f323368b = aVar2;
        this.f323369c = aVar3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C107984y)) {
            return false;
        }
        C107984y yVar = (C107984y) obj;
        return C87412m.m108589b(this.f323367a, yVar.f323367a) && C87412m.m108589b(this.f323368b, yVar.f323368b) && C87412m.m108589b(this.f323369c, yVar.f323369c);
    }

    public int hashCode() {
        return (((this.f323367a.hashCode() * 31) + this.f323368b.hashCode()) * 31) + this.f323369c.hashCode();
    }

    public String toString() {
        return "Shapes(small=" + this.f323367a + ", medium=" + this.f323368b + ", large=" + this.f323369c + ')';
    }
}
