package p301cd;

import gy3.C87412m;

/* renamed from: cd.d */
public final class C113285d implements C92416i {

    /* renamed from: a */
    public final float f338953a;

    /* renamed from: b */
    public final C113282a f338954b;

    /* renamed from: c */
    public final String f338955c;

    /* renamed from: d */
    public final String f338956d;

    /* renamed from: e */
    public final String f338957e;

    /* renamed from: f */
    public final String f338958f;

    public C113285d(float f, C113282a aVar, String str, String str2, String str3, String str4) {
        C87412m.m108594g(aVar, "blendMode");
        C87412m.m108594g(str, "path");
        this.f338953a = f;
        this.f338954b = aVar;
        this.f338955c = str;
        this.f338956d = str2;
        this.f338957e = str3;
        this.f338958f = str4;
    }

    /* renamed from: a */
    public String mo21064a() {
        return "EyeShadowInfoV1(path='" + this.f338955c + "', pathMd5='" + this.f338956d + "', shimmerPosPath=" + this.f338957e + ", shimmerPosPathMd5='" + this.f338958f + "')";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C113285d)) {
            return false;
        }
        C113285d dVar = (C113285d) obj;
        return C87412m.m108589b(Float.valueOf(this.f338953a), Float.valueOf(dVar.f338953a)) && this.f338954b == dVar.f338954b && C87412m.m108589b(this.f338955c, dVar.f338955c) && C87412m.m108589b(this.f338956d, dVar.f338956d) && C87412m.m108589b(this.f338957e, dVar.f338957e) && C87412m.m108589b(this.f338958f, dVar.f338958f);
    }

    public int hashCode() {
        int floatToIntBits = ((((Float.floatToIntBits(this.f338953a) * 31) + this.f338954b.hashCode()) * 31) + this.f338955c.hashCode()) * 31;
        String str = this.f338956d;
        int i = 0;
        int hashCode = (floatToIntBits + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f338957e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f338958f;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "EyeShadowInfoV2(alpha=" + this.f338953a + ", blendMode=" + this.f338954b + ", path=" + this.f338955c + ", pathMd5=" + this.f338956d + ", shimmerPosPath=" + this.f338957e + ", shimmerPosPathMd5=" + this.f338958f + ')';
    }
}
