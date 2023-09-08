package z11;

import gy3.C87412m;
import p11.C110101a;
import x11.C112018e;
import y11.C112358a;
import y11.C112360b;

/* renamed from: z11.b */
public final class C112567b extends C110101a {

    /* renamed from: a */
    public final C112358a.C112359a f337027a;

    /* renamed from: b */
    public final C112018e f337028b;

    /* renamed from: c */
    public final C112360b.C112363c f337029c;

    public C112567b(C112358a.C112359a aVar, C112018e eVar, C112360b.C112363c cVar) {
        C87412m.m108594g(aVar, "data");
        C87412m.m108594g(eVar, "renderInfo");
        C87412m.m108594g(cVar, "yuvTextureGroupWrapper");
        this.f337027a = aVar;
        this.f337028b = eVar;
        this.f337029c = cVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C112567b)) {
            return false;
        }
        C112567b bVar = (C112567b) obj;
        return C87412m.m108589b(this.f337027a, bVar.f337027a) && C87412m.m108589b(this.f337028b, bVar.f337028b) && C87412m.m108589b(this.f337029c, bVar.f337029c);
    }

    public int hashCode() {
        return (((this.f337027a.hashCode() * 31) + this.f337028b.hashCode()) * 31) + this.f337029c.hashCode();
    }

    public String toString() {
        return "GLUploadMTRTaskInput(data=" + this.f337027a + ", renderInfo=" + this.f337028b + ", yuvTextureGroupWrapper=" + this.f337029c + ')';
    }
}
