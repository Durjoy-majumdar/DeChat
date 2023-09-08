package e42;

import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import gy3.C87412m;
import z04.C91602g0;

/* renamed from: e42.p */
public final class C86436p extends C86434m {

    /* renamed from: a */
    public final String f251231a;

    public C86436p(String str) {
        C87412m.m108594g(str, MimeTypes.BASE_TYPE_TEXT);
        this.f251231a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C86436p) && C87412m.m108589b(this.f251231a, ((C86436p) obj).f251231a);
    }

    public int hashCode() {
        return this.f251231a.hashCode();
    }

    public String toString() {
        return "MBTextScriptDescriptor(text=" + C91602g0.m114947o0(this.f251231a, 100) + "...)";
    }
}
