package gi1;

import android.graphics.Rect;
import gy3.C87412m;
import java.util.LinkedHashMap;

/* renamed from: gi1.b */
public final class C8324b {

    /* renamed from: a */
    public final LinkedHashMap<String, Rect> f27278a;

    /* renamed from: b */
    public final LinkedHashMap<String, C59465f> f27279b;

    /* renamed from: c */
    public final Rect f27280c;

    /* renamed from: d */
    public final int f27281d;

    /* renamed from: e */
    public final float f27282e;

    public C8324b(LinkedHashMap<String, Rect> linkedHashMap, LinkedHashMap<String, C59465f> linkedHashMap2, Rect rect, int i, float f) {
        C87412m.m108594g(linkedHashMap, "micViewRect");
        C87412m.m108594g(linkedHashMap2, "micLayoutInfo");
        C87412m.m108594g(rect, "viewRootRect");
        this.f27278a = linkedHashMap;
        this.f27279b = linkedHashMap2;
        this.f27280c = rect;
        this.f27281d = i;
        this.f27282e = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8324b)) {
            return false;
        }
        C8324b bVar = (C8324b) obj;
        return C87412m.m108589b(this.f27278a, bVar.f27278a) && C87412m.m108589b(this.f27279b, bVar.f27279b) && C87412m.m108589b(this.f27280c, bVar.f27280c) && this.f27281d == bVar.f27281d && C87412m.m108589b(Float.valueOf(this.f27282e), Float.valueOf(bVar.f27282e));
    }

    public int hashCode() {
        return (((((((this.f27278a.hashCode() * 31) + this.f27279b.hashCode()) * 31) + this.f27280c.hashCode()) * 31) + this.f27281d) * 31) + Float.floatToIntBits(this.f27282e);
    }

    public String toString() {
        return "FinderLiveMicInfoData(micViewRect=" + this.f27278a + ", micLayoutInfo=" + this.f27279b + ", viewRootRect=" + this.f27280c + ", mode=" + this.f27281d + ", anchorVideoRate=" + this.f27282e + ')';
    }
}
