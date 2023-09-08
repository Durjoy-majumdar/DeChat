package p301cd;

import gy3.C87412m;

/* renamed from: cd.c */
public final class C113284c implements C92416i {

    /* renamed from: a */
    public final float f338947a;

    /* renamed from: b */
    public final int f338948b;

    /* renamed from: c */
    public final C113282a f338949c;

    /* renamed from: d */
    public final String f338950d;

    /* renamed from: e */
    public final String f338951e;

    /* renamed from: f */
    public final float f338952f;

    public C113284c(float f, int i, C113282a aVar, String str, String str2, float f2) {
        C87412m.m108594g(aVar, "blendMode");
        C87412m.m108594g(str, "path");
        this.f338947a = f;
        this.f338948b = i;
        this.f338949c = aVar;
        this.f338950d = str;
        this.f338951e = str2;
        this.f338952f = f2;
    }

    /* renamed from: a */
    public String mo21064a() {
        return "EyeBrowInfo(path='" + this.f338950d + "', pathMd5='" + this.f338951e + "')";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C113284c)) {
            return false;
        }
        C113284c cVar = (C113284c) obj;
        return C87412m.m108589b(Float.valueOf(this.f338947a), Float.valueOf(cVar.f338947a)) && this.f338948b == cVar.f338948b && this.f338949c == cVar.f338949c && C87412m.m108589b(this.f338950d, cVar.f338950d) && C87412m.m108589b(this.f338951e, cVar.f338951e) && C87412m.m108589b(Float.valueOf(this.f338952f), Float.valueOf(cVar.f338952f));
    }

    public int hashCode() {
        int floatToIntBits = ((((((Float.floatToIntBits(this.f338947a) * 31) + this.f338948b) * 31) + this.f338949c.hashCode()) * 31) + this.f338950d.hashCode()) * 31;
        String str = this.f338951e;
        return ((floatToIntBits + (str == null ? 0 : str.hashCode())) * 31) + Float.floatToIntBits(this.f338952f);
    }

    public String toString() {
        return "EyeBrowInfo(alpha=" + this.f338947a + ", faceModel=" + this.f338948b + ", blendMode=" + this.f338949c + ", path=" + this.f338950d + ", pathMd5=" + this.f338951e + ", shrinkRate=" + this.f338952f + ')';
    }
}
