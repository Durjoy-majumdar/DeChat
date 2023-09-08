package v11;

import android.util.Size;
import gy3.C87412m;
import p11.C110101a;
import x11.C112018e;

/* renamed from: v11.b */
public final class C111311b extends C110101a {

    /* renamed from: a */
    public final C112018e f333253a;

    /* renamed from: b */
    public final Size f333254b;

    /* renamed from: c */
    public final int f333255c;

    /* renamed from: d */
    public final boolean f333256d;

    public C111311b(C112018e eVar, Size size, int i, boolean z) {
        C87412m.m108594g(eVar, "renderInfo");
        C87412m.m108594g(size, "drawSize");
        this.f333253a = eVar;
        this.f333254b = size;
        this.f333255c = i;
        this.f333256d = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C111311b)) {
            return false;
        }
        C111311b bVar = (C111311b) obj;
        return C87412m.m108589b(this.f333253a, bVar.f333253a) && C87412m.m108589b(this.f333254b, bVar.f333254b) && this.f333255c == bVar.f333255c && this.f333256d == bVar.f333256d;
    }

    public int hashCode() {
        int hashCode = ((((this.f333253a.hashCode() * 31) + this.f333254b.hashCode()) * 31) + this.f333255c) * 31;
        boolean z = this.f333256d;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        return "GLTextureRenderMTRTaskInput(renderInfo=" + this.f333253a + ", drawSize=" + this.f333254b + ", texId=" + this.f333255c + ", isOes=" + this.f333256d + ')';
    }
}
