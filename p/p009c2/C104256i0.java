package p009c2;

import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import gy3.C87412m;
import p735w1.C37958a;

/* renamed from: c2.i0 */
public final class C104256i0 {

    /* renamed from: a */
    public final C37958a f308588a;

    /* renamed from: b */
    public final C104269s f308589b;

    public C104256i0(C37958a aVar, C104269s sVar) {
        C87412m.m108594g(aVar, MimeTypes.BASE_TYPE_TEXT);
        C87412m.m108594g(sVar, "offsetMapping");
        this.f308588a = aVar;
        this.f308589b = sVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C104256i0)) {
            return false;
        }
        C104256i0 i0Var = (C104256i0) obj;
        return C87412m.m108589b(this.f308588a, i0Var.f308588a) && C87412m.m108589b(this.f308589b, i0Var.f308589b);
    }

    public int hashCode() {
        return (this.f308588a.hashCode() * 31) + this.f308589b.hashCode();
    }

    public String toString() {
        return "TransformedText(text=" + this.f308588a + ", offsetMapping=" + this.f308589b + ')';
    }
}
