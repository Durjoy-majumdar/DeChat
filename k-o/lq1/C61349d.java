package lq1;

import gy3.C87412m;
import qq1.C63317a;
import sq1.C64147b;

/* renamed from: lq1.d */
public final class C61349d {

    /* renamed from: a */
    public final C63317a f174501a;

    /* renamed from: b */
    public final boolean f174502b;

    /* renamed from: c */
    public final long f174503c;

    /* renamed from: d */
    public final boolean f174504d;

    /* renamed from: e */
    public final boolean f174505e;

    /* renamed from: f */
    public final C64147b f174506f;

    public C61349d(C63317a aVar, boolean z, long j, boolean z2, boolean z3, C64147b bVar) {
        C87412m.m108594g(aVar, "feedObj");
        this.f174501a = aVar;
        this.f174502b = z;
        this.f174503c = j;
        this.f174504d = z2;
        this.f174505e = z3;
        this.f174506f = bVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61349d)) {
            return false;
        }
        C61349d dVar = (C61349d) obj;
        return C87412m.m108589b(this.f174501a, dVar.f174501a) && this.f174502b == dVar.f174502b && this.f174503c == dVar.f174503c && this.f174504d == dVar.f174504d && this.f174505e == dVar.f174505e && C87412m.m108589b(this.f174506f, dVar.f174506f);
    }

    public int hashCode() {
        int hashCode = this.f174501a.hashCode() * 31;
        boolean z = this.f174502b;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        long j = this.f174503c;
        int i = (((hashCode + (z ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        boolean z3 = this.f174504d;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f174505e;
        if (!z4) {
            z2 = z4;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        C64147b bVar = this.f174506f;
        return i3 + (bVar == null ? 0 : bVar.hashCode());
    }

    public String toString() {
        return "DrawerOpenData(feedObj=" + this.f174501a + ", isSingleMode=" + this.f174502b + ", refCommentId=" + this.f174503c + ", blinkRefComment=" + this.f174504d + ", showFooter=" + this.f174505e + ", replyCommentObj=" + this.f174506f + ')';
    }
}
