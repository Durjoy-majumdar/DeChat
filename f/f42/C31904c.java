package f42;

import gy3.C87412m;

/* renamed from: f42.c */
public final class C31904c {

    /* renamed from: a */
    public final String f84990a;

    /* renamed from: b */
    public final boolean f84991b;

    public C31904c(String str, boolean z) {
        C87412m.m108594g(str, "bizName");
        this.f84990a = str;
        this.f84991b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31904c)) {
            return false;
        }
        C31904c cVar = (C31904c) obj;
        return C87412m.m108589b(this.f84990a, cVar.f84990a) && this.f84991b == cVar.f84991b;
    }

    public int hashCode() {
        int hashCode = this.f84990a.hashCode() * 31;
        boolean z = this.f84991b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        return "MBBizMetaInfo(bizName=" + this.f84990a + ", isPublicService=" + this.f84991b + ')';
    }
}
