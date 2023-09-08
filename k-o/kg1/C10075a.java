package kg1;

import android.view.View;
import gy3.C87412m;
import ng1.C11161a;

/* renamed from: kg1.a */
public final class C10075a implements C11161a {

    /* renamed from: d */
    public final String f30842d;

    /* renamed from: e */
    public final String f30843e;

    /* renamed from: f */
    public final long f30844f;

    /* renamed from: g */
    public final C11161a f30845g;

    public C10075a(String str, String str2, long j, C11161a aVar) {
        C87412m.m108594g(str, "groupId");
        C87412m.m108594g(str2, "groupName");
        C87412m.m108594g(aVar, "commentView");
        this.f30842d = str;
        this.f30843e = str2;
        this.f30844f = j;
        this.f30845g = aVar;
    }

    /* renamed from: I */
    public void mo10507I(int i) {
        this.f30845g.mo10507I(i);
    }

    /* renamed from: R */
    public View mo10508R() {
        return this.f30845g.mo10508R();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10075a)) {
            return false;
        }
        C10075a aVar = (C10075a) obj;
        return C87412m.m108589b(this.f30842d, aVar.f30842d) && C87412m.m108589b(this.f30843e, aVar.f30843e) && this.f30844f == aVar.f30844f && C87412m.m108589b(this.f30845g, aVar.f30845g);
    }

    public int hashCode() {
        long j = this.f30844f;
        return (((((this.f30842d.hashCode() * 31) + this.f30843e.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f30845g.hashCode();
    }

    public String toString() {
        return "ViewPagerItemSelect(groupId=" + this.f30842d + ", groupName=" + this.f30843e + ", lastEnterTimeStamp=" + this.f30844f + ", commentView=" + this.f30845g + ')';
    }
}
