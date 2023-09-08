package f42;

import gy3.C87412m;

/* renamed from: f42.e */
public final class C86757e {

    /* renamed from: a */
    public final String f251839a;

    /* renamed from: b */
    public final String f251840b;

    /* renamed from: c */
    public final int f251841c;

    /* renamed from: d */
    public final String f251842d;

    public C86757e(String str, String str2, int i, String str3) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, "pkgPath");
        C87412m.m108594g(str3, "versionMD5");
        this.f251839a = str;
        this.f251840b = str2;
        this.f251841c = i;
        this.f251842d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C86757e)) {
            return false;
        }
        C86757e eVar = (C86757e) obj;
        return C87412m.m108589b(this.f251839a, eVar.f251839a) && C87412m.m108589b(this.f251840b, eVar.f251840b) && this.f251841c == eVar.f251841c && C87412m.m108589b(this.f251842d, eVar.f251842d);
    }

    public int hashCode() {
        return (((((this.f251839a.hashCode() * 31) + this.f251840b.hashCode()) * 31) + this.f251841c) * 31) + this.f251842d.hashCode();
    }

    public String toString() {
        return "WxaPkgRecordForMB(appId=" + this.f251839a + ", pkgPath=" + this.f251840b + ", version=" + this.f251841c + ", versionMD5=" + this.f251842d + ')';
    }
}
