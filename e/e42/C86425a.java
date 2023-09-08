package e42;

import gy3.C87412m;

/* renamed from: e42.a */
public final class C86425a {

    /* renamed from: a */
    public final String f251214a;

    /* renamed from: b */
    public final long f251215b;

    /* renamed from: c */
    public final String f251216c;

    public C86425a(String str, long j, String str2) {
        C87412m.m108594g(str, "pathInAssets");
        C87412m.m108594g(str2, "md5");
        this.f251214a = str;
        this.f251215b = j;
        this.f251216c = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C86425a)) {
            return false;
        }
        C86425a aVar = (C86425a) obj;
        return C87412m.m108589b(this.f251214a, aVar.f251214a) && this.f251215b == aVar.f251215b && C87412m.m108589b(this.f251216c, aVar.f251216c);
    }

    public int hashCode() {
        long j = this.f251215b;
        return (((this.f251214a.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f251216c.hashCode();
    }

    public String toString() {
        return "BaseEmbedConfig(pathInAssets='" + this.f251214a + "', versionForBoots=" + this.f251215b + ", md5='" + this.f251216c + "')";
    }
}
