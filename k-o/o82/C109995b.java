package o82;

import gy3.C87412m;
import h82.C108172a;
import p80.C110194c;
import p82.C110201e;

/* renamed from: o82.b */
public final class C109995b extends C108172a {

    /* renamed from: a */
    public final C110201e f329167a;

    /* renamed from: b */
    public final C110194c f329168b;

    /* renamed from: c */
    public final C110194c f329169c;

    public C109995b(C110201e eVar, C110194c cVar, C110194c cVar2) {
        C87412m.m108594g(eVar, "renderInfo");
        C87412m.m108594g(cVar, "inputTexture");
        C87412m.m108594g(cVar2, "outputTexture");
        this.f329167a = eVar;
        this.f329168b = cVar;
        this.f329169c = cVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C109995b)) {
            return false;
        }
        C109995b bVar = (C109995b) obj;
        return C87412m.m108589b(this.f329167a, bVar.f329167a) && C87412m.m108589b(this.f329168b, bVar.f329168b) && C87412m.m108589b(this.f329169c, bVar.f329169c);
    }

    public int hashCode() {
        return (((this.f329167a.hashCode() * 31) + this.f329168b.hashCode()) * 31) + this.f329169c.hashCode();
    }

    public String toString() {
        return "VBRenderMTRTaskInput(renderInfo=" + this.f329167a + ", inputTexture=" + this.f329168b + ", outputTexture=" + this.f329169c + ')';
    }
}
