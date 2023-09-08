package p434ig;

import cc3.C26835d;
import gy3.C87412m;

/* renamed from: ig.a */
public class C98671a extends C26835d {

    /* renamed from: p */
    public String f289309p = "";

    public C98671a() {
        this.f297564a = C27534b.class;
    }

    /* renamed from: U */
    public String mo55242U() {
        return this.f289309p;
    }

    /* renamed from: V */
    public void mo55243V(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f289309p = str;
    }

    /* renamed from: l */
    public boolean mo137663l(Object obj, String str, String str2, boolean z) {
        C87412m.m108594g(obj, "value");
        C87412m.m108594g(str, "tagName");
        C87412m.m108594g(str2, "itemTagName");
        if (C87412m.m108589b(str, "mediacontent")) {
            return true;
        }
        super.mo137663l(obj, str, str2, z);
        return false;
    }
}
