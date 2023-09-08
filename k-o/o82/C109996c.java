package o82;

import gy3.C8480h;
import gy3.C87412m;
import h82.C108173b;
import p82.C110201e;

/* renamed from: o82.c */
public final class C109996c extends C108173b {

    /* renamed from: b */
    public final C110201e f329170b;

    /* renamed from: c */
    public final int f329171c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109996c(C110201e eVar, int i) {
        super(false, (String) null, 3, (C8480h) null);
        C87412m.m108594g(eVar, "renderInfo");
        this.f329170b = eVar;
        this.f329171c = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C109996c)) {
            return false;
        }
        C109996c cVar = (C109996c) obj;
        return C87412m.m108589b(this.f329170b, cVar.f329170b) && this.f329171c == cVar.f329171c;
    }

    public int hashCode() {
        return (this.f329170b.hashCode() * 31) + this.f329171c;
    }

    public String toString() {
        return "VBRenderMTRTaskOutput(renderInfo=" + this.f329170b + ", texId=" + this.f329171c + ')';
    }
}
