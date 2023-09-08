package p190l1;

import gy3.C8480h;
import java.util.List;
import p1166z0.C112539e;
import sx3.C64186f0;

/* renamed from: l1.s */
public final class C109111s {

    /* renamed from: a */
    public final long f326717a;

    /* renamed from: b */
    public final long f326718b;

    /* renamed from: c */
    public final long f326719c;

    /* renamed from: d */
    public final boolean f326720d;

    /* renamed from: e */
    public final long f326721e;

    /* renamed from: f */
    public final long f326722f;

    /* renamed from: g */
    public final boolean f326723g;

    /* renamed from: h */
    public final int f326724h;

    /* renamed from: i */
    public final long f326725i;

    /* renamed from: j */
    public List<C109090e> f326726j;

    /* renamed from: k */
    public C109088d f326727k;

    public C109111s(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, int i, long j6, C8480h hVar) {
        this.f326717a = j;
        this.f326718b = j2;
        this.f326719c = j3;
        this.f326720d = z;
        this.f326721e = j4;
        this.f326722f = j5;
        this.f326723g = z2;
        this.f326724h = i;
        this.f326725i = j6;
        boolean z4 = z3;
        this.f326727k = new C109088d(z4, z4);
    }

    /* renamed from: a */
    public final void mo160354a() {
        C109088d dVar = this.f326727k;
        dVar.f326655b = true;
        dVar.f326654a = true;
    }

    /* renamed from: b */
    public final boolean mo160355b() {
        C109088d dVar = this.f326727k;
        return dVar.f326655b || dVar.f326654a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PointerInputChange(id=");
        sb.append(C109110r.m148154b(this.f326717a));
        sb.append(", uptimeMillis=");
        sb.append(this.f326718b);
        sb.append(", position=");
        sb.append(C112539e.m153744i(this.f326719c));
        sb.append(", pressed=");
        sb.append(this.f326720d);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f326721e);
        sb.append(", previousPosition=");
        sb.append(C112539e.m153744i(this.f326722f));
        sb.append(", previousPressed=");
        sb.append(this.f326723g);
        sb.append(", isConsumed=");
        sb.append(mo160355b());
        sb.append(", type=");
        int i = this.f326724h;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch");
        sb.append(", historical=");
        Object obj = this.f326726j;
        if (obj == null) {
            obj = C64186f0.f181907d;
        }
        sb.append(obj);
        sb.append(",scrollDelta=");
        sb.append(C112539e.m153744i(this.f326725i));
        sb.append(')');
        return sb.toString();
    }

    public C109111s(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, int i, List list, long j6, C8480h hVar) {
        this(j, j2, j3, z, j4, j5, z2, z3, i, j6, (C8480h) null);
        this.f326726j = list;
    }
}
