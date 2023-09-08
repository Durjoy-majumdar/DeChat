package hc3;

import cc3.C26835d;
import gy3.C87412m;

/* renamed from: hc3.d */
public class C98343d extends C26835d {

    /* renamed from: p */
    public String f288263p = "";

    public C98343d() {
        this.f297564a = C27211e.class;
    }

    /* renamed from: U */
    public String mo54768U() {
        return this.f288263p;
    }

    /* renamed from: V */
    public void mo54769V(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f288263p = str;
    }

    /* renamed from: l */
    public boolean mo137663l(Object obj, String str, String str2, boolean z) {
        C87412m.m108594g(obj, "value");
        C87412m.m108594g(str, "tagName");
        C87412m.m108594g(str2, "itemTagName");
        if (C87412m.m108589b(str, "recorditem")) {
            return true;
        }
        super.mo137663l(obj, str, str2, z);
        return false;
    }
}
