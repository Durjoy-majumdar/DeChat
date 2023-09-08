package p643p5;

import coil.size.Size;
import gy3.C87412m;
import wx3.C15601d;

/* renamed from: p5.c */
public final class C35367c implements C110169f {

    /* renamed from: c */
    public final Size f94700c;

    public C35367c(Size size) {
        C87412m.m108594g(size, "size");
        this.f94700c = size;
    }

    /* renamed from: a */
    public Object mo60229a(C15601d<? super Size> dVar) {
        return this.f94700c;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C35367c) && C87412m.m108589b(this.f94700c, ((C35367c) obj).f94700c));
    }

    public int hashCode() {
        return this.f94700c.hashCode();
    }

    public String toString() {
        return "RealSizeResolver(size=" + this.f94700c + ')';
    }
}
