package gi1;

import gy3.C87412m;
import java.util.LinkedList;

/* renamed from: gi1.d */
public final class C32458d {

    /* renamed from: a */
    public final LinkedList<C59463a> f86243a;

    /* renamed from: b */
    public final int f86244b;

    /* renamed from: c */
    public final float f86245c;

    public C32458d(LinkedList<C59463a> linkedList, int i, float f) {
        C87412m.m108594g(linkedList, "dataList");
        this.f86243a = linkedList;
        this.f86244b = i;
        this.f86245c = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32458d)) {
            return false;
        }
        C32458d dVar = (C32458d) obj;
        return C87412m.m108589b(this.f86243a, dVar.f86243a) && this.f86244b == dVar.f86244b && C87412m.m108589b(Float.valueOf(this.f86245c), Float.valueOf(dVar.f86245c));
    }

    public int hashCode() {
        return (((this.f86243a.hashCode() * 31) + this.f86244b) * 31) + Float.floatToIntBits(this.f86245c);
    }

    public String toString() {
        return "FinderLiveMicSeiData(dataList=" + this.f86243a + ", mode=" + this.f86244b + ", anchorVideoRate=" + this.f86245c + ')';
    }
}
