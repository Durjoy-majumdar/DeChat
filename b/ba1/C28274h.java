package ba1;

import gy3.C87412m;
import java.util.List;

/* renamed from: ba1.h */
public final class C28274h {

    /* renamed from: a */
    public String f77846a;

    /* renamed from: b */
    public String f77847b;

    /* renamed from: c */
    public List<String> f77848c;

    public C28274h(String str, String str2, List<String> list) {
        C87412m.m108594g(list, "entryPageNames");
        this.f77846a = str;
        this.f77847b = str2;
        this.f77848c = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28274h)) {
            return false;
        }
        C28274h hVar = (C28274h) obj;
        return C87412m.m108589b(this.f77846a, hVar.f77846a) && C87412m.m108589b(this.f77847b, hVar.f77847b) && C87412m.m108589b(this.f77848c, hVar.f77848c);
    }

    public int hashCode() {
        String str = this.f77846a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f77847b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode + i) * 31) + this.f77848c.hashCode();
    }

    public String toString() {
        return "SessionKEntry(sessionId=" + this.f77846a + ", fromPageName=" + this.f77847b + ", entryPageNames=" + this.f77848c + ')';
    }
}
