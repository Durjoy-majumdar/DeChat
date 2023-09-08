package j04;

import gy3.C87412m;
import qz3.C26019c;
import sz3.C110828a;
import sz3.C26243c;
import wy3.C26521y0;

/* renamed from: j04.g */
public final class C24747g {

    /* renamed from: a */
    public final C26243c f70595a;

    /* renamed from: b */
    public final C26019c f70596b;

    /* renamed from: c */
    public final C110828a f70597c;

    /* renamed from: d */
    public final C26521y0 f70598d;

    public C24747g(C26243c cVar, C26019c cVar2, C110828a aVar, C26521y0 y0Var) {
        C87412m.m108594g(cVar, "nameResolver");
        C87412m.m108594g(cVar2, "classProto");
        C87412m.m108594g(aVar, "metadataVersion");
        C87412m.m108594g(y0Var, "sourceElement");
        this.f70595a = cVar;
        this.f70596b = cVar2;
        this.f70597c = aVar;
        this.f70598d = y0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24747g)) {
            return false;
        }
        C24747g gVar = (C24747g) obj;
        return C87412m.m108589b(this.f70595a, gVar.f70595a) && C87412m.m108589b(this.f70596b, gVar.f70596b) && C87412m.m108589b(this.f70597c, gVar.f70597c) && C87412m.m108589b(this.f70598d, gVar.f70598d);
    }

    public int hashCode() {
        return (((((this.f70595a.hashCode() * 31) + this.f70596b.hashCode()) * 31) + this.f70597c.hashCode()) * 31) + this.f70598d.hashCode();
    }

    public String toString() {
        return "ClassData(nameResolver=" + this.f70595a + ", classProto=" + this.f70596b + ", metadataVersion=" + this.f70597c + ", sourceElement=" + this.f70598d + ')';
    }
}
