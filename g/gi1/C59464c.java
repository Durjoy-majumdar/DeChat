package gi1;

import android.graphics.Rect;
import gy3.C87412m;
import java.util.LinkedList;

/* renamed from: gi1.c */
public final class C59464c {

    /* renamed from: a */
    public final LinkedList<C59463a> f169896a;

    /* renamed from: b */
    public final Rect f169897b;

    /* renamed from: c */
    public final int f169898c;

    /* renamed from: d */
    public final float f169899d;

    /* renamed from: e */
    public final LinkedList<C32459e> f169900e;

    public C59464c(LinkedList<C59463a> linkedList, Rect rect, int i, float f, LinkedList<C32459e> linkedList2) {
        C87412m.m108594g(linkedList, "dataList");
        C87412m.m108594g(rect, "viewRect");
        C87412m.m108594g(linkedList2, "holeDataList");
        this.f169896a = linkedList;
        this.f169897b = rect;
        this.f169898c = i;
        this.f169899d = f;
        this.f169900e = linkedList2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59464c)) {
            return false;
        }
        C59464c cVar = (C59464c) obj;
        return C87412m.m108589b(this.f169896a, cVar.f169896a) && C87412m.m108589b(this.f169897b, cVar.f169897b) && this.f169898c == cVar.f169898c && C87412m.m108589b(Float.valueOf(this.f169899d), Float.valueOf(cVar.f169899d)) && C87412m.m108589b(this.f169900e, cVar.f169900e);
    }

    public int hashCode() {
        return (((((((this.f169896a.hashCode() * 31) + this.f169897b.hashCode()) * 31) + this.f169898c) * 31) + Float.floatToIntBits(this.f169899d)) * 31) + this.f169900e.hashCode();
    }

    public String toString() {
        return "FinderLiveMicNotifyEvent(dataList=" + this.f169896a + ", viewRect=" + this.f169897b + ", mode=" + this.f169898c + ", anchorVideoRate=" + this.f169899d + ", holeDataList=" + this.f169900e + ')';
    }
}
