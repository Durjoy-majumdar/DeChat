package p558i0;

import a14.C0000n0;
import gy3.C87412m;
import p1165z.C112530o;
import p1166z0.C112545k;
import p175j0.C60667k2;
import p267x.C111909f1;
import p436a1.C103272w;
import p436a1.C103274x;
import p835c1.C104230e;
import p835c1.C104231f;
import p835c1.C104233g;

/* renamed from: i0.o */
public abstract class C108307o implements C111909f1 {

    /* renamed from: d */
    public final C108312u f324311d;

    public C108307o(boolean z, C60667k2<C108300g> k2Var) {
        C87412m.m108594g(k2Var, "rippleAlpha");
        this.f324311d = new C108312u(z, k2Var);
    }

    /* renamed from: e */
    public abstract void mo158752e(C112530o oVar, C0000n0 n0Var);

    /* renamed from: f */
    public final void mo158774f(C104231f fVar, float f, long j) {
        C104231f fVar2 = fVar;
        C87412m.m108594g(fVar2, "$this$drawStateLayer");
        C108312u uVar = this.f324311d;
        uVar.getClass();
        float a = Float.isNaN(f) ? C108303k.m146668a(fVar2, uVar.f324318a, fVar.mo145819e()) : fVar.mo143034T(f);
        float floatValue = uVar.f324320c.mo163295c().floatValue();
        if (floatValue > 0.0f) {
            long b = C103272w.m136780b(j, floatValue, 0.0f, 0.0f, 0.0f, 14, (Object) null);
            if (uVar.f324318a) {
                float d = C112545k.m153758d(fVar.mo145819e());
                float b2 = C112545k.m153756b(fVar.mo145819e());
                C104230e B = fVar.mo145815B();
                long e = B.mo145834e();
                B.mo145835i().mo142944c();
                B.mo145836j().mo145838a(0.0f, 0.0f, d, b2, 1);
                C104230e eVar = B;
                C104231f.C104232a.m139082a(fVar, b, a, 0, 0.0f, (C104233g) null, (C103274x) null, 0, 124, (Object) null);
                eVar.mo145835i().mo142943b();
                eVar.mo145837k(e);
                return;
            }
            C104231f.C104232a.m139082a(fVar, b, a, 0, 0.0f, (C104233g) null, (C103274x) null, 0, 124, (Object) null);
        }
    }

    /* renamed from: g */
    public abstract void mo158753g(C112530o oVar);
}
