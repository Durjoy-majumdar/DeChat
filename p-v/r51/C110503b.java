package r51;

import gy3.C8480h;
import gy3.C87412m;

/* renamed from: r51.b */
public final class C110503b {

    /* renamed from: a */
    public final String f330428a;

    /* renamed from: b */
    public final String f330429b;

    /* renamed from: c */
    public String f330430c;

    /* renamed from: d */
    public final boolean f330431d;

    /* renamed from: e */
    public final int f330432e;

    /* renamed from: f */
    public String f330433f;

    public C110503b() {
        this((String) null, (String) null, (String) null, false, 0, (String) null, 63, (C8480h) null);
    }

    public C110503b(String str, String str2, String str3, boolean z, int i, String str4, int i2, C8480h hVar) {
        str = (i2 & 1) != 0 ? "" : str;
        str2 = (i2 & 2) != 0 ? null : str2;
        str3 = (i2 & 4) != 0 ? null : str3;
        z = (i2 & 8) != 0 ? false : z;
        i = (i2 & 16) != 0 ? 10 : i;
        str4 = (i2 & 32) != 0 ? null : str4;
        C87412m.m108594g(str, "keyword");
        this.f330428a = str;
        this.f330429b = str2;
        this.f330430c = str3;
        this.f330431d = z;
        this.f330432e = i;
        this.f330433f = str4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C110503b)) {
            return false;
        }
        C110503b bVar = (C110503b) obj;
        return C87412m.m108589b(this.f330428a, bVar.f330428a) && C87412m.m108589b(this.f330429b, bVar.f330429b) && C87412m.m108589b(this.f330430c, bVar.f330430c) && this.f330431d == bVar.f330431d && this.f330432e == bVar.f330432e && C87412m.m108589b(this.f330433f, bVar.f330433f);
    }

    public int hashCode() {
        int hashCode = this.f330428a.hashCode() * 31;
        String str = this.f330429b;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f330430c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z = this.f330431d;
        if (z) {
            z = true;
        }
        int i2 = (((hashCode3 + (z ? 1 : 0)) * 31) + this.f330432e) * 31;
        String str3 = this.f330433f;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return "LuckyBagInfo(keyword=" + this.f330428a + ", traceId=" + this.f330429b + ", appId=" + this.f330430c + ", hasLuckyBag=" + this.f330431d + ", interval=" + this.f330432e + ", url=" + this.f330433f + ')';
    }
}
