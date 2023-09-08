package p301cd;

import gy3.C87412m;

/* renamed from: cd.e */
public final class C113286e implements C92416i {

    /* renamed from: a */
    public final int f338959a;

    /* renamed from: b */
    public final float f338960b;

    /* renamed from: c */
    public final String f338961c;

    /* renamed from: d */
    public final String f338962d;

    public C113286e(int i, float f, String str, String str2) {
        C87412m.m108594g(str, "path");
        this.f338959a = i;
        this.f338960b = f;
        this.f338961c = str;
        this.f338962d = str2;
    }

    /* renamed from: a */
    public String mo21064a() {
        return "FaceContourInfo(path='" + this.f338961c + "', pathMd5='" + this.f338962d + "')";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C113286e)) {
            return false;
        }
        C113286e eVar = (C113286e) obj;
        return this.f338959a == eVar.f338959a && C87412m.m108589b(Float.valueOf(this.f338960b), Float.valueOf(eVar.f338960b)) && C87412m.m108589b(this.f338961c, eVar.f338961c) && C87412m.m108589b(this.f338962d, eVar.f338962d);
    }

    public int hashCode() {
        int floatToIntBits = ((((this.f338959a * 31) + Float.floatToIntBits(this.f338960b)) * 31) + this.f338961c.hashCode()) * 31;
        String str = this.f338962d;
        return floatToIntBits + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FaceContourInfo(faceModel=" + this.f338959a + ", alpha=" + this.f338960b + ", path=" + this.f338961c + ", pathMd5=" + this.f338962d + ')';
    }
}
