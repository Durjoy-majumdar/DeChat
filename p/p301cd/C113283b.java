package p301cd;

import gy3.C87412m;

/* renamed from: cd.b */
public final class C113283b implements C92416i {

    /* renamed from: a */
    public final float f338942a;

    /* renamed from: b */
    public final int f338943b;

    /* renamed from: c */
    public final C113282a f338944c;

    /* renamed from: d */
    public final String f338945d;

    /* renamed from: e */
    public final String f338946e;

    public C113283b(float f, int i, C113282a aVar, String str, String str2) {
        C87412m.m108594g(aVar, "blendMode");
        C87412m.m108594g(str, "path");
        this.f338942a = f;
        this.f338943b = i;
        this.f338944c = aVar;
        this.f338945d = str;
        this.f338946e = str2;
    }

    /* renamed from: a */
    public String mo21064a() {
        return "BlusherStickInfo(path='" + this.f338945d + "', pathMd5='" + this.f338946e + "')";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C113283b)) {
            return false;
        }
        C113283b bVar = (C113283b) obj;
        return C87412m.m108589b(Float.valueOf(this.f338942a), Float.valueOf(bVar.f338942a)) && this.f338943b == bVar.f338943b && this.f338944c == bVar.f338944c && C87412m.m108589b(this.f338945d, bVar.f338945d) && C87412m.m108589b(this.f338946e, bVar.f338946e);
    }

    public int hashCode() {
        int floatToIntBits = ((((((Float.floatToIntBits(this.f338942a) * 31) + this.f338943b) * 31) + this.f338944c.hashCode()) * 31) + this.f338945d.hashCode()) * 31;
        String str = this.f338946e;
        return floatToIntBits + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "BlusherStickInfo(alpha=" + this.f338942a + ", faceModel=" + this.f338943b + ", blendMode=" + this.f338944c + ", path=" + this.f338945d + ", pathMd5=" + this.f338946e + ')';
    }
}
