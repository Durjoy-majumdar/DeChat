package n82;

import android.util.Size;
import gy3.C87412m;
import h82.C108172a;
import p82.C110201e;

/* renamed from: n82.b */
public final class C109723b extends C108172a {

    /* renamed from: a */
    public final C110201e f328430a;

    /* renamed from: b */
    public final Size f328431b;

    /* renamed from: c */
    public final int f328432c;

    /* renamed from: d */
    public final boolean f328433d;

    public C109723b(C110201e eVar, Size size, int i, boolean z) {
        C87412m.m108594g(eVar, "renderInfo");
        C87412m.m108594g(size, "drawSize");
        this.f328430a = eVar;
        this.f328431b = size;
        this.f328432c = i;
        this.f328433d = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C109723b)) {
            return false;
        }
        C109723b bVar = (C109723b) obj;
        return C87412m.m108589b(this.f328430a, bVar.f328430a) && C87412m.m108589b(this.f328431b, bVar.f328431b) && this.f328432c == bVar.f328432c && this.f328433d == bVar.f328433d;
    }

    public int hashCode() {
        int hashCode = ((((this.f328430a.hashCode() * 31) + this.f328431b.hashCode()) * 31) + this.f328432c) * 31;
        boolean z = this.f328433d;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        return "GLTextureRenderMTRTaskInput(renderInfo=" + this.f328430a + ", drawSize=" + this.f328431b + ", texId=" + this.f328432c + ", isOes=" + this.f328433d + ')';
    }
}
