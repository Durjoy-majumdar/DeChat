package al1;

import gy3.C87412m;

/* renamed from: al1.s */
public final class C39611s {

    /* renamed from: a */
    public final String f106357a;

    /* renamed from: b */
    public final String f106358b;

    /* renamed from: c */
    public final String f106359c;

    /* renamed from: d */
    public final String f106360d;

    /* renamed from: e */
    public final String f106361e;

    /* renamed from: f */
    public boolean f106362f;

    public C39611s(String str, String str2, String str3, String str4, String str5, boolean z) {
        C87412m.m108594g(str, "sdkUserId");
        this.f106357a = str;
        this.f106358b = str2;
        this.f106359c = str3;
        this.f106360d = str4;
        this.f106361e = str5;
        this.f106362f = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39611s)) {
            return false;
        }
        C39611s sVar = (C39611s) obj;
        return C87412m.m108589b(this.f106357a, sVar.f106357a) && C87412m.m108589b(this.f106358b, sVar.f106358b) && C87412m.m108589b(this.f106359c, sVar.f106359c) && C87412m.m108589b(this.f106360d, sVar.f106360d) && C87412m.m108589b(this.f106361e, sVar.f106361e) && this.f106362f == sVar.f106362f;
    }

    public int hashCode() {
        int hashCode = this.f106357a.hashCode() * 31;
        String str = this.f106358b;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f106359c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f106360d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f106361e;
        if (str4 != null) {
            i = str4.hashCode();
        }
        int i2 = (hashCode4 + i) * 31;
        boolean z = this.f106362f;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public String toString() {
        return "MicIntercomData(sdkUserId=" + this.f106357a + ", headUrl=" + this.f106358b + ", userName=" + this.f106359c + ", nickName=" + this.f106360d + ", sessionId=" + this.f106361e + ", isTalking=" + this.f106362f + ')';
    }
}
