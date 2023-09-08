package r82;

import gy3.C87412m;
import h82.C108172a;
import p82.C110201e;
import q82.C110374a;
import q82.C110376b;

/* renamed from: r82.b */
public final class C110552b extends C108172a {

    /* renamed from: a */
    public final C110374a.C110375a f330642a;

    /* renamed from: b */
    public final C110201e f330643b;

    /* renamed from: c */
    public final C110376b.C110379c f330644c;

    public C110552b(C110374a.C110375a aVar, C110201e eVar, C110376b.C110379c cVar) {
        C87412m.m108594g(aVar, "data");
        C87412m.m108594g(eVar, "renderInfo");
        C87412m.m108594g(cVar, "yuvTextureGroupWrapper");
        this.f330642a = aVar;
        this.f330643b = eVar;
        this.f330644c = cVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C110552b)) {
            return false;
        }
        C110552b bVar = (C110552b) obj;
        return C87412m.m108589b(this.f330642a, bVar.f330642a) && C87412m.m108589b(this.f330643b, bVar.f330643b) && C87412m.m108589b(this.f330644c, bVar.f330644c);
    }

    public int hashCode() {
        return (((this.f330642a.hashCode() * 31) + this.f330643b.hashCode()) * 31) + this.f330644c.hashCode();
    }

    public String toString() {
        return "GLUploadMTRTaskInput(data=" + this.f330642a + ", renderInfo=" + this.f330643b + ", yuvTextureGroupWrapper=" + this.f330644c + ')';
    }
}
