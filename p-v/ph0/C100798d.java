package ph0;

import com.tencent.p014mm.storage.C72963f4;
import gy3.C87412m;

/* renamed from: ph0.d */
public final class C100798d {

    /* renamed from: a */
    public final String f295269a;

    /* renamed from: b */
    public final String f295270b;

    /* renamed from: c */
    public final String f295271c;

    /* renamed from: d */
    public final C72963f4 f295272d;

    public C100798d(String str, String str2, String str3, C72963f4 f4Var) {
        C87412m.m108594g(str, "preBuildFastMd5");
        C87412m.m108594g(str2, "dataId");
        C87412m.m108594g(str3, "imgPath");
        this.f295269a = str;
        this.f295270b = str2;
        this.f295271c = str3;
        this.f295272d = f4Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C100798d)) {
            return false;
        }
        C100798d dVar = (C100798d) obj;
        return C87412m.m108589b(this.f295269a, dVar.f295269a) && C87412m.m108589b(this.f295270b, dVar.f295270b) && C87412m.m108589b(this.f295271c, dVar.f295271c) && C87412m.m108589b(this.f295272d, dVar.f295272d);
    }

    public int hashCode() {
        int hashCode = ((((this.f295269a.hashCode() * 31) + this.f295270b.hashCode()) * 31) + this.f295271c.hashCode()) * 31;
        C72963f4 f4Var = this.f295272d;
        return hashCode + (f4Var == null ? 0 : f4Var.hashCode());
    }

    public String toString() {
        return "SendPreBuildAlbumInfo(preBuildFastMd5=" + this.f295269a + ", dataId=" + this.f295270b + ", imgPath=" + this.f295271c + ", msgInfo=" + this.f295272d + ')';
    }
}
