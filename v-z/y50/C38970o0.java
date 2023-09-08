package y50;

import gy3.C87412m;

/* renamed from: y50.o0 */
public final class C38970o0 {

    /* renamed from: a */
    public final String f104990a;

    /* renamed from: b */
    public final String f104991b;

    /* renamed from: c */
    public final String f104992c;

    public C38970o0(String str, String str2, String str3) {
        this.f104990a = str;
        this.f104991b = str2;
        this.f104992c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38970o0)) {
            return false;
        }
        C38970o0 o0Var = (C38970o0) obj;
        return C87412m.m108589b(this.f104990a, o0Var.f104990a) && C87412m.m108589b(this.f104991b, o0Var.f104991b) && C87412m.m108589b(this.f104992c, o0Var.f104992c);
    }

    public int hashCode() {
        String str = this.f104990a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f104991b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f104992c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "OnlineLiveListInfo(liveInfoList=" + this.f104990a + ", content=" + this.f104991b + ", toUsername=" + this.f104992c + ')';
    }
}
