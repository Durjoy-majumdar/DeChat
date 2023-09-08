package lz2;

import gy3.C87412m;
import jq3.C9493c;

/* renamed from: lz2.l */
public final class C34452l implements C9493c {

    /* renamed from: d */
    public final String f92747d;

    /* renamed from: e */
    public final String f92748e;

    public C34452l(String str, String str2) {
        C87412m.m108594g(str, "iconId");
        this.f92747d = str;
        this.f92748e = str2;
    }

    /* renamed from: c */
    public int mo75c() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34452l)) {
            return false;
        }
        C34452l lVar = (C34452l) obj;
        return C87412m.m108589b(this.f92747d, lVar.f92747d) && C87412m.m108589b(this.f92748e, lVar.f92748e);
    }

    public long getItemId() {
        return (long) hashCode();
    }

    public int hashCode() {
        int hashCode = this.f92747d.hashCode() * 31;
        String str = this.f92748e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "RecentStatusInfo(iconId=" + this.f92747d + ", statusDesc=" + this.f92748e + ')';
    }
}
