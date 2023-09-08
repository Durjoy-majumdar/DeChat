package lh3;

import gy3.C87412m;
import java.util.ArrayList;
import te3.C101829pp1;

/* renamed from: lh3.b */
public final class C34280b {

    /* renamed from: a */
    public final ArrayList<C101829pp1> f92398a;

    /* renamed from: b */
    public final int f92399b;

    public C34280b(ArrayList<C101829pp1> arrayList, int i) {
        C87412m.m108594g(arrayList, "flipItem");
        this.f92398a = arrayList;
        this.f92399b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34280b)) {
            return false;
        }
        C34280b bVar = (C34280b) obj;
        return C87412m.m108589b(this.f92398a, bVar.f92398a) && this.f92399b == bVar.f92399b;
    }

    public int hashCode() {
        return (this.f92398a.hashCode() * 31) + this.f92399b;
    }

    public String toString() {
        return "GalleryData(flipItem=" + this.f92398a + ", position=" + this.f92399b + ')';
    }
}
