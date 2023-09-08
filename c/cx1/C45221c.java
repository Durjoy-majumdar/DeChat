package cx1;

import gy3.C8480h;
import gy3.C87412m;
import rx3.C13604l;

/* renamed from: cx1.c */
public final class C45221c {

    /* renamed from: a */
    public final C13604l<Boolean, String> f122548a;

    /* renamed from: b */
    public final C45223e f122549b;

    /* renamed from: c */
    public final boolean f122550c;

    /* renamed from: d */
    public final int f122551d;

    public C45221c(C13604l<Boolean, String> lVar, C45223e eVar, boolean z, int i) {
        C87412m.m108594g(lVar, "topTip");
        C87412m.m108594g(eVar, "user");
        this.f122548a = lVar;
        this.f122549b = eVar;
        this.f122550c = z;
        this.f122551d = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45221c)) {
            return false;
        }
        C45221c cVar = (C45221c) obj;
        return C87412m.m108589b(this.f122548a, cVar.f122548a) && C87412m.m108589b(this.f122549b, cVar.f122549b) && this.f122550c == cVar.f122550c && this.f122551d == cVar.f122551d;
    }

    public int hashCode() {
        int hashCode = ((this.f122548a.hashCode() * 31) + this.f122549b.hashCode()) * 31;
        boolean z = this.f122550c;
        if (z) {
            z = true;
        }
        return ((hashCode + (z ? 1 : 0)) * 31) + this.f122551d;
    }

    public String toString() {
        return "MentionUserWrapper(topTip=" + this.f122548a + ", user=" + this.f122549b + ", showFooter=" + this.f122550c + ", reportPosition=" + this.f122551d + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C45221c(C13604l lVar, C45223e eVar, boolean z, int i, int i2, C8480h hVar) {
        this((i2 & 1) != 0 ? new C13604l(Boolean.FALSE, null) : lVar, eVar, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? -1 : i);
    }
}
