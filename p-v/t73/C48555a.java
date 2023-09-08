package t73;

import gy3.C8480h;
import gy3.C87412m;
import te3.C51011qt1;
import te3.C51154rt1;

/* renamed from: t73.a */
public final class C48555a {

    /* renamed from: a */
    public final C51011qt1 f129887a;

    /* renamed from: b */
    public final C51154rt1 f129888b;

    /* renamed from: c */
    public String f129889c;

    /* renamed from: d */
    public int f129890d;

    /* renamed from: e */
    public int f129891e;

    /* renamed from: f */
    public final boolean f129892f;

    /* renamed from: g */
    public final String f129893g;

    public C48555a(C51011qt1 qt12, C51154rt1 rt12, String str, int i, int i2, boolean z, String str2, int i3, C8480h hVar) {
        str = (i3 & 4) != 0 ? null : str;
        i = (i3 & 8) != 0 ? 0 : i;
        i2 = (i3 & 16) != 0 ? 0 : i2;
        z = (i3 & 32) != 0 ? false : z;
        str2 = (i3 & 64) != 0 ? null : str2;
        C87412m.m108594g(qt12, "domain");
        C87412m.m108594g(rt12, "manifest");
        this.f129887a = qt12;
        this.f129888b = rt12;
        this.f129889c = str;
        this.f129890d = i;
        this.f129891e = i2;
        this.f129892f = z;
        this.f129893g = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48555a)) {
            return false;
        }
        C48555a aVar = (C48555a) obj;
        return C87412m.m108589b(this.f129887a, aVar.f129887a) && C87412m.m108589b(this.f129888b, aVar.f129888b) && C87412m.m108589b(this.f129889c, aVar.f129889c) && this.f129890d == aVar.f129890d && this.f129891e == aVar.f129891e && this.f129892f == aVar.f129892f && C87412m.m108589b(this.f129893g, aVar.f129893g);
    }

    public int hashCode() {
        int hashCode = ((this.f129887a.hashCode() * 31) + this.f129888b.hashCode()) * 31;
        String str = this.f129889c;
        int i = 0;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f129890d) * 31) + this.f129891e) * 31;
        boolean z = this.f129892f;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        String str2 = this.f129893g;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return "PrefetchManifest(domain=" + this.f129887a + ", manifest=" + this.f129888b + ", extInfo=" + this.f129889c + ", bizScene=" + this.f129890d + ", subBizScene=" + this.f129891e + ", debug=" + this.f129892f + ", manifestKey=" + this.f129893g + ')';
    }
}
