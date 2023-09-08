package p835c1;

import android.graphics.Shader;
import gy3.C8480h;
import gy3.C87412m;
import p1166z0.C112535a;
import p1166z0.C112539e;
import p1166z0.C112545k;
import p1166z0.C112546l;
import p436a1.C103229d0;
import p436a1.C103234g;
import p436a1.C103241i0;
import p436a1.C103244k0;
import p436a1.C103257q;
import p436a1.C103262s;
import p436a1.C103272w;
import p436a1.C103274x;
import p436a1.C27726j0;
import p560i2.C108322d;
import p560i2.C33183o;
import rx3.C13603j;

/* renamed from: c1.a */
public final class C104225a implements C104231f {

    /* renamed from: d */
    public final C104226a f308517d = new C104226a((C108322d) null, (C33183o) null, (C103262s) null, 0, 15, (C8480h) null);

    /* renamed from: e */
    public final C104230e f308518e = new C104227b(this);

    /* renamed from: f */
    public C103241i0 f308519f;

    /* renamed from: g */
    public C103241i0 f308520g;

    /* renamed from: c1.a$a */
    public static final class C104226a {

        /* renamed from: a */
        public C108322d f308521a;

        /* renamed from: b */
        public C33183o f308522b;

        /* renamed from: c */
        public C103262s f308523c;

        /* renamed from: d */
        public long f308524d;

        public C104226a(C108322d dVar, C33183o oVar, C103262s sVar, long j, int i, C8480h hVar) {
            dVar = (i & 1) != 0 ? C104229c.f308528a : dVar;
            oVar = (i & 2) != 0 ? C33183o.Ltr : oVar;
            sVar = (i & 4) != 0 ? new C104235i() : sVar;
            if ((i & 8) != 0) {
                int i2 = C112545k.f336975d;
                j = C112545k.f336973b;
            }
            this.f308521a = dVar;
            this.f308522b = oVar;
            this.f308523c = sVar;
            this.f308524d = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C104226a)) {
                return false;
            }
            C104226a aVar = (C104226a) obj;
            return C87412m.m108589b(this.f308521a, aVar.f308521a) && this.f308522b == aVar.f308522b && C87412m.m108589b(this.f308523c, aVar.f308523c) && C112545k.m153755a(this.f308524d, aVar.f308524d);
        }

        public int hashCode() {
            long j = this.f308524d;
            int i = C112545k.f336975d;
            return (((((this.f308521a.hashCode() * 31) + this.f308522b.hashCode()) * 31) + this.f308523c.hashCode()) * 31) + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            return "DrawParams(density=" + this.f308521a + ", layoutDirection=" + this.f308522b + ", canvas=" + this.f308523c + ", size=" + C112545k.m153760f(this.f308524d) + ')';
        }
    }

    /* renamed from: c1.a$b */
    public static final class C104227b implements C104230e {

        /* renamed from: a */
        public final C104234h f308525a = new C104228b(this);

        /* renamed from: b */
        public final /* synthetic */ C104225a f308526b;

        public C104227b(C104225a aVar) {
            this.f308526b = aVar;
        }

        /* renamed from: e */
        public long mo145834e() {
            return this.f308526b.f308517d.f308524d;
        }

        /* renamed from: i */
        public C103262s mo145835i() {
            return this.f308526b.f308517d.f308523c;
        }

        /* renamed from: j */
        public C104234h mo145836j() {
            return this.f308525a;
        }

        /* renamed from: k */
        public void mo145837k(long j) {
            this.f308526b.f308517d.f308524d = j;
        }
    }

    /* renamed from: a */
    public static C103241i0 m139029a(C104225a aVar, long j, C104233g gVar, float f, C103274x xVar, int i, int i2, int i3, Object obj) {
        C103274x xVar2 = xVar;
        int i4 = i;
        boolean z = true;
        int i5 = (i3 & 32) != 0 ? 1 : i2;
        C104225a aVar2 = aVar;
        C103241i0 i6 = aVar.mo145822i(gVar);
        long b = !((f > 1.0f ? 1 : (f == 1.0f ? 0 : -1)) == 0) ? C103272w.m136780b(j, C103272w.m136782d(j) * f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j;
        if (!C103272w.m136781c(i6.mo142987a(), b)) {
            i6.mo142989c(b);
        }
        if (i6.mo142993g() != null) {
            i6.mo142997j((Shader) null);
        }
        if (!C87412m.m108589b(i6.mo142995h(), xVar2)) {
            i6.mo142988b(xVar2);
        }
        if (!(i6.mo142996i() == i4)) {
            i6.mo142990d(i4);
        }
        if (i6.mo142998k() != i5) {
            z = false;
        }
        if (!z) {
            i6.mo142991e(i5);
        }
        return i6;
    }

    /* renamed from: g */
    public static /* synthetic */ C103241i0 m139030g(C104225a aVar, C103257q qVar, C104233g gVar, float f, C103274x xVar, int i, int i2, int i3, Object obj) {
        return aVar.mo145818c(qVar, gVar, f, xVar, i, (i3 & 32) != 0 ? 1 : i2);
    }

    /* renamed from: B */
    public C104230e mo145815B() {
        return this.f308518e;
    }

    /* renamed from: F */
    public long mo143031F(float f) {
        return C108322d.C108323a.m146725g(this, f);
    }

    /* renamed from: M */
    public int mo143032M(float f) {
        return C108322d.C108323a.m146719a(this, f);
    }

    /* renamed from: O */
    public float mo143033O(long j) {
        return C108322d.C108323a.m146722d(this, j);
    }

    /* renamed from: T */
    public float mo143034T(float f) {
        return C108322d.C108323a.m146723e(this, f);
    }

    /* renamed from: W */
    public void mo145816W(long j, long j2, long j3, float f, C104233g gVar, C103274x xVar, int i) {
        C87412m.m108594g(gVar, "style");
        this.f308517d.f308523c.mo142955n(C112539e.m153738c(j2), C112539e.m153739d(j2), C112539e.m153738c(j2) + C112545k.m153758d(j3), C112539e.m153739d(j2) + C112545k.m153756b(j3), m139029a(this, j, gVar, f, xVar, i, 0, 32, (Object) null));
    }

    /* renamed from: b0 */
    public void mo145817b0(long j, float f, long j2, float f2, C104233g gVar, C103274x xVar, int i) {
        C87412m.m108594g(gVar, "style");
        float f3 = f;
        this.f308517d.f308523c.mo142957p(j2, f, m139029a(this, j, gVar, f2, xVar, i, 0, 32, (Object) null));
    }

    /* renamed from: c */
    public final C103241i0 mo145818c(C103257q qVar, C104233g gVar, float f, C103274x xVar, int i, int i2) {
        C103241i0 i3 = mo145822i(gVar);
        boolean z = true;
        if (qVar != null) {
            qVar.mo143030a(mo145819e(), i3, f);
        } else {
            if (!(i3.getAlpha() == f)) {
                i3.setAlpha(f);
            }
        }
        if (!C87412m.m108589b(i3.mo142995h(), xVar)) {
            i3.mo142988b(xVar);
        }
        if (!(i3.mo142996i() == i)) {
            i3.mo142990d(i);
        }
        if (i3.mo142998k() != i2) {
            z = false;
        }
        if (!z) {
            i3.mo142991e(i2);
        }
        return i3;
    }

    /* renamed from: d0 */
    public float mo143035d0(float f) {
        return f / getDensity();
    }

    /* renamed from: e */
    public long mo145819e() {
        return ((C104227b) mo145815B()).mo145834e();
    }

    /* renamed from: f0 */
    public long mo145820f0() {
        return C112546l.m153762b(((C104227b) mo145815B()).mo145834e());
    }

    /* renamed from: g0 */
    public long mo143036g0(long j) {
        return C108322d.C108323a.m146724f(this, j);
    }

    public float getDensity() {
        return this.f308517d.f308521a.getDensity();
    }

    public float getFontScale() {
        return this.f308517d.f308521a.getFontScale();
    }

    public C33183o getLayoutDirection() {
        return this.f308517d.f308522b;
    }

    /* renamed from: i */
    public final C103241i0 mo145822i(C104233g gVar) {
        boolean z = false;
        if (C87412m.m108589b(gVar, C104236j.f308530a)) {
            C103241i0 i0Var = this.f308519f;
            if (i0Var != null) {
                return i0Var;
            }
            C103234g gVar2 = new C103234g();
            gVar2.mo143009u(0);
            this.f308519f = gVar2;
            return gVar2;
        } else if (gVar instanceof C104237k) {
            C103241i0 i0Var2 = this.f308520g;
            C103234g gVar3 = i0Var2;
            if (i0Var2 == null) {
                C103234g gVar4 = new C103234g();
                gVar4.mo143009u(1);
                this.f308520g = gVar4;
                gVar3 = gVar4;
            }
            C103234g gVar5 = (C103234g) gVar3;
            float o = gVar5.mo143002o();
            C104237k kVar = (C104237k) gVar;
            float f = kVar.f308531a;
            if (!(o == f)) {
                gVar5.mo143008t(f);
            }
            int l = gVar5.mo142999l();
            int i = kVar.f308533c;
            if (!(l == i)) {
                gVar5.mo143004q(i);
            }
            float n = gVar5.mo143001n();
            float f2 = kVar.f308532b;
            if (!(n == f2)) {
                gVar5.mo143006s(f2);
            }
            int m = gVar5.mo143000m();
            int i2 = kVar.f308534d;
            if (m == i2) {
                z = true;
            }
            if (!z) {
                gVar5.mo143005r(i2);
            }
            if (!C87412m.m108589b(gVar5.f304443e, kVar.f308535e)) {
                gVar5.mo143003p(kVar.f308535e);
            }
            return gVar3;
        } else {
            throw new C13603j();
        }
    }

    /* renamed from: l0 */
    public void mo145823l0(C103257q qVar, long j, long j2, long j3, float f, C104233g gVar, C103274x xVar, int i) {
        C87412m.m108594g(qVar, "brush");
        C87412m.m108594g(gVar, "style");
        this.f308517d.f308523c.mo142961t(C112539e.m153738c(j), C112539e.m153739d(j), C112539e.m153738c(j) + C112545k.m153758d(j2), C112539e.m153739d(j) + C112545k.m153756b(j2), C112535a.m153728b(j3), C112535a.m153729c(j3), m139030g(this, qVar, gVar, f, xVar, i, 0, 32, (Object) null));
    }

    /* renamed from: m */
    public float mo143039m(int i) {
        return C108322d.C108323a.m146720b(this, i);
    }

    /* renamed from: m0 */
    public void mo145824m0(C27726j0 j0Var, long j, float f, C104233g gVar, C103274x xVar, int i) {
        C27726j0 j0Var2 = j0Var;
        C87412m.m108594g(j0Var, "path");
        C87412m.m108594g(gVar, "style");
        this.f308517d.f308523c.mo142949h(j0Var, m139029a(this, j, gVar, f, xVar, i, 0, 32, (Object) null));
    }

    /* renamed from: o0 */
    public void mo145825o0(C103229d0 d0Var, long j, float f, C104233g gVar, C103274x xVar, int i) {
        C103229d0 d0Var2 = d0Var;
        C87412m.m108594g(d0Var, "image");
        C87412m.m108594g(gVar, "style");
        long j2 = j;
        this.f308517d.f308523c.mo142956o(d0Var, j, m139030g(this, (C103257q) null, gVar, f, xVar, i, 0, 32, (Object) null));
    }

    /* renamed from: p */
    public void mo145826p(C103257q qVar, long j, long j2, float f, C104233g gVar, C103274x xVar, int i) {
        C87412m.m108594g(qVar, "brush");
        C87412m.m108594g(gVar, "style");
        this.f308517d.f308523c.mo142955n(C112539e.m153738c(j), C112539e.m153739d(j), C112539e.m153738c(j) + C112545k.m153758d(j2), C112539e.m153739d(j) + C112545k.m153756b(j2), m139030g(this, qVar, gVar, f, xVar, i, 0, 32, (Object) null));
    }

    /* renamed from: q */
    public long mo143040q(long j) {
        return C108322d.C108323a.m146721c(this, j);
    }

    /* renamed from: r0 */
    public void mo145827r0(C27726j0 j0Var, C103257q qVar, float f, C104233g gVar, C103274x xVar, int i) {
        C27726j0 j0Var2 = j0Var;
        C87412m.m108594g(j0Var, "path");
        C103257q qVar2 = qVar;
        C87412m.m108594g(qVar, "brush");
        C87412m.m108594g(gVar, "style");
        this.f308517d.f308523c.mo142949h(j0Var, m139030g(this, qVar, gVar, f, xVar, i, 0, 32, (Object) null));
    }

    /* renamed from: u0 */
    public void mo145828u0(long j, long j2, long j3, long j4, C104233g gVar, float f, C103274x xVar, int i) {
        C87412m.m108594g(gVar, "style");
        this.f308517d.f308523c.mo142961t(C112539e.m153738c(j2), C112539e.m153739d(j2), C112539e.m153738c(j2) + C112545k.m153758d(j3), C112539e.m153739d(j2) + C112545k.m153756b(j3), C112535a.m153728b(j4), C112535a.m153729c(j4), m139029a(this, j, gVar, f, xVar, i, 0, 32, (Object) null));
    }

    /* renamed from: x */
    public void mo145829x(C103257q qVar, long j, long j2, float f, int i, C103244k0 k0Var, float f2, C103274x xVar, int i2) {
        C103257q qVar2 = qVar;
        float f3 = f;
        int i3 = i;
        C103244k0 k0Var2 = k0Var;
        C103274x xVar2 = xVar;
        int i4 = i2;
        C87412m.m108594g(qVar, "brush");
        C103262s sVar = this.f308517d.f308523c;
        C103241i0 i0Var = this.f308520g;
        C103234g gVar = i0Var;
        if (i0Var == null) {
            C103234g gVar2 = new C103234g();
            gVar2.mo143009u(1);
            this.f308520g = gVar2;
            gVar = gVar2;
        }
        qVar.mo143030a(mo145819e(), gVar, f2);
        C103234g gVar3 = (C103234g) gVar;
        if (!C87412m.m108589b(gVar3.f304442d, xVar2)) {
            gVar3.mo142988b(xVar2);
        }
        boolean z = false;
        if (!(gVar3.f304440b == i4)) {
            gVar3.mo142990d(i4);
        }
        if (!(gVar3.mo143002o() == f3)) {
            gVar3.mo143008t(f3);
        }
        if (!(gVar3.mo143001n() == 4.0f)) {
            gVar3.mo143006s(4.0f);
        }
        if (!(gVar3.mo142999l() == i3)) {
            gVar3.mo143004q(i3);
        }
        if (!(gVar3.mo143000m() == 0)) {
            gVar3.mo143005r(0);
        }
        if (!C87412m.m108589b(gVar3.f304443e, k0Var2)) {
            gVar3.mo143003p(k0Var2);
        }
        if (gVar3.mo142998k() == 1) {
            z = true;
        }
        if (!z) {
            gVar3.mo142991e(1);
        }
        sVar.mo142953l(j, j2, gVar);
    }

    /* renamed from: z */
    public void mo145830z(C103229d0 d0Var, long j, long j2, long j3, long j4, float f, C104233g gVar, C103274x xVar, int i, int i2) {
        C103229d0 d0Var2 = d0Var;
        C87412m.m108594g(d0Var, "image");
        C87412m.m108594g(gVar, "style");
        this.f308517d.f308523c.mo142958q(d0Var, j, j2, j3, j4, mo145818c((C103257q) null, gVar, f, xVar, i, i2));
    }
}
