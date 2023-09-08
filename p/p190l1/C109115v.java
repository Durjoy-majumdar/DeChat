package p190l1;

import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import p1166z0.C112539e;

/* renamed from: l1.v */
public final class C109115v {

    /* renamed from: a */
    public final long f326734a;

    /* renamed from: b */
    public final long f326735b;

    /* renamed from: c */
    public final long f326736c;

    /* renamed from: d */
    public final long f326737d;

    /* renamed from: e */
    public final boolean f326738e;

    /* renamed from: f */
    public final int f326739f;

    /* renamed from: g */
    public final boolean f326740g;

    /* renamed from: h */
    public final List<C109090e> f326741h;

    /* renamed from: i */
    public final long f326742i;

    public C109115v(long j, long j2, long j3, long j4, boolean z, int i, boolean z2, List list, long j5, C8480h hVar) {
        this.f326734a = j;
        this.f326735b = j2;
        this.f326736c = j3;
        this.f326737d = j4;
        this.f326738e = z;
        this.f326739f = i;
        this.f326740g = z2;
        this.f326741h = list;
        this.f326742i = j5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C109115v)) {
            return false;
        }
        C109115v vVar = (C109115v) obj;
        if (!C109110r.m148153a(this.f326734a, vVar.f326734a) || this.f326735b != vVar.f326735b || !C112539e.m153736a(this.f326736c, vVar.f326736c) || !C112539e.m153736a(this.f326737d, vVar.f326737d) || this.f326738e != vVar.f326738e) {
            return false;
        }
        return (this.f326739f == vVar.f326739f) && this.f326740g == vVar.f326740g && C87412m.m108589b(this.f326741h, vVar.f326741h) && C112539e.m153736a(this.f326742i, vVar.f326742i);
    }

    public int hashCode() {
        long j = this.f326734a;
        long j2 = this.f326735b;
        int e = ((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + C112539e.m153740e(this.f326736c)) * 31) + C112539e.m153740e(this.f326737d)) * 31;
        boolean z = this.f326738e;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (((e + (z ? 1 : 0)) * 31) + this.f326739f) * 31;
        boolean z3 = this.f326740g;
        if (!z3) {
            z2 = z3;
        }
        return ((((i + (z2 ? 1 : 0)) * 31) + this.f326741h.hashCode()) * 31) + C112539e.m153740e(this.f326742i);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PointerInputEventData(id=");
        sb.append(C109110r.m148154b(this.f326734a));
        sb.append(", uptime=");
        sb.append(this.f326735b);
        sb.append(", positionOnScreen=");
        sb.append(C112539e.m153744i(this.f326736c));
        sb.append(", position=");
        sb.append(C112539e.m153744i(this.f326737d));
        sb.append(", down=");
        sb.append(this.f326738e);
        sb.append(", type=");
        int i = this.f326739f;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch");
        sb.append(", issuesEnterExit=");
        sb.append(this.f326740g);
        sb.append(", historical=");
        sb.append(this.f326741h);
        sb.append(", scrollDelta=");
        sb.append(C112539e.m153744i(this.f326742i));
        sb.append(')');
        return sb.toString();
    }
}
