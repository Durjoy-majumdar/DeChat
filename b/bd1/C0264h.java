package bd1;

import gy3.C8480h;
import gy3.C87412m;

/* renamed from: bd1.h */
public final class C0264h {

    /* renamed from: a */
    public int f818a;

    /* renamed from: b */
    public String f819b;

    /* renamed from: c */
    public boolean f820c;

    public C0264h() {
        this(0, (String) null, false, 7, (C8480h) null);
    }

    public C0264h(int i, String str, boolean z, int i2, C8480h hVar) {
        i = (i2 & 1) != 0 ? 0 : i;
        str = (i2 & 2) != 0 ? null : str;
        z = (i2 & 4) != 0 ? false : z;
        this.f818a = i;
        this.f819b = str;
        this.f820c = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0264h)) {
            return false;
        }
        C0264h hVar = (C0264h) obj;
        return this.f818a == hVar.f818a && C87412m.m108589b(this.f819b, hVar.f819b) && this.f820c == hVar.f820c;
    }

    public int hashCode() {
        int i = this.f818a * 31;
        String str = this.f819b;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.f820c;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        return "FinderUserLogOutInfo(logOutFlag=" + this.f818a + ", logOutUrl=" + this.f819b + ", hasLogOut=" + this.f820c + ')';
    }
}
