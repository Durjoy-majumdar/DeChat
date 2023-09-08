package p558i0;

import a14.C0000n0;
import android.content.Context;
import android.graphics.Canvas;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import iy3.C60641c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p1165z.C112530o;
import p1166z0.C112545k;
import p175j0.C108494d2;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C24725u1;
import p175j0.C60667k2;
import p175j0.C60690y0;
import p436a1.C103223b;
import p436a1.C103226c;
import p436a1.C103262s;
import p436a1.C103272w;
import p835c1.C54601d;
import rx3.C13598b0;
import sx3.C64175a0;
import sx3.C64197v;

/* renamed from: i0.b */
public final class C108292b extends C108307o implements C24725u1 {

    /* renamed from: e */
    public final boolean f324246e;

    /* renamed from: f */
    public final float f324247f;

    /* renamed from: g */
    public final C60667k2<C103272w> f324248g;

    /* renamed from: h */
    public final C60667k2<C108300g> f324249h;

    /* renamed from: i */
    public final C108304l f324250i;

    /* renamed from: j */
    public final C60690y0 f324251j = C108500f2.m146996c((Object) null, (C108497e2) null, 2, (Object) null);

    /* renamed from: n */
    public final C60690y0 f324252n = C108500f2.m146996c(Boolean.TRUE, (C108497e2) null, 2, (Object) null);

    /* renamed from: o */
    public long f324253o = C112545k.f336973b;

    /* renamed from: p */
    public int f324254p = -1;

    /* renamed from: q */
    public final C32224a<C13598b0> f324255q = new C60237a(this);

    public C108292b(boolean z, float f, C60667k2 k2Var, C60667k2 k2Var2, C108304l lVar, C8480h hVar) {
        super(z, k2Var2);
        this.f324246e = z;
        this.f324247f = f;
        this.f324248g = k2Var;
        this.f324249h = k2Var2;
        this.f324250i = lVar;
    }

    /* renamed from: a */
    public void mo149521a(C54601d dVar) {
        C87412m.m108594g(dVar, "<this>");
        this.f324253o = dVar.mo145819e();
        this.f324254p = Float.isNaN(this.f324247f) ? C60641c.m70921b(C108303k.m146668a(dVar, this.f324246e, dVar.mo145819e())) : dVar.mo143032M(this.f324247f);
        long j = this.f324248g.getValue().f304517a;
        float f = this.f324249h.getValue().f324278d;
        dVar.mo75508h0();
        mo158774f(dVar, this.f324247f, j);
        C103262s i = dVar.mo145815B().mo145835i();
        ((Boolean) ((C108494d2) this.f324252n).getValue()).booleanValue();
        C108306n nVar = (C108306n) ((C108494d2) this.f324251j).getValue();
        if (nVar != null) {
            nVar.mo158768e(dVar.mo145819e(), this.f324254p, j, f);
            Canvas canvas = C103226c.f304431a;
            C87412m.m108594g(i, "<this>");
            nVar.draw(((C103223b) i).f304427a);
        }
    }

    /* renamed from: b */
    public void mo51625b() {
        mo158754h();
    }

    /* renamed from: c */
    public void mo51626c() {
    }

    /* renamed from: d */
    public void mo51627d() {
        mo158754h();
    }

    /* renamed from: e */
    public void mo158752e(C112530o oVar, C0000n0 n0Var) {
        C87412m.m108594g(oVar, "interaction");
        C87412m.m108594g(n0Var, "scope");
        C108304l lVar = this.f324250i;
        lVar.getClass();
        C108305m mVar = lVar.f324299g;
        mVar.getClass();
        C108306n nVar = (C108306n) ((LinkedHashMap) mVar.f324301a).get(this);
        if (nVar == null) {
            nVar = (C108306n) C64175a0.m75514v(lVar.f324298f);
            if (nVar == null) {
                if (lVar.f324300h > C64197v.m75536e(lVar.f324297e)) {
                    Context context = lVar.getContext();
                    C87412m.m108593f(context, "context");
                    nVar = new C108306n(context);
                    lVar.addView(nVar);
                    ((ArrayList) lVar.f324297e).add(nVar);
                } else {
                    nVar = (C108306n) ((ArrayList) lVar.f324297e).get(lVar.f324300h);
                    C108305m mVar2 = lVar.f324299g;
                    mVar2.getClass();
                    C87412m.m108594g(nVar, "rippleHostView");
                    C108292b bVar = (C108292b) ((LinkedHashMap) mVar2.f324302b).get(nVar);
                    if (bVar != null) {
                        ((C108494d2) bVar.f324251j).setValue(null);
                        lVar.f324299g.mo158764a(bVar);
                        nVar.mo158766c();
                    }
                }
                int i = lVar.f324300h;
                if (i < lVar.f324296d - 1) {
                    lVar.f324300h = i + 1;
                } else {
                    lVar.f324300h = 0;
                }
            }
            C108305m mVar3 = lVar.f324299g;
            mVar3.getClass();
            mVar3.f324301a.put(this, nVar);
            mVar3.f324302b.put(nVar, this);
        }
        nVar.mo158765b(oVar, this.f324246e, this.f324253o, this.f324254p, this.f324248g.getValue().f304517a, this.f324249h.getValue().f324278d, this.f324255q);
        ((C108494d2) this.f324251j).setValue(nVar);
    }

    /* renamed from: g */
    public void mo158753g(C112530o oVar) {
        C87412m.m108594g(oVar, "interaction");
        C108306n nVar = (C108306n) ((C108494d2) this.f324251j).getValue();
        if (nVar != null) {
            nVar.mo158767d();
        }
    }

    /* renamed from: h */
    public final void mo158754h() {
        C108304l lVar = this.f324250i;
        lVar.getClass();
        ((C108494d2) this.f324251j).setValue(null);
        C108305m mVar = lVar.f324299g;
        mVar.getClass();
        C108306n nVar = (C108306n) ((LinkedHashMap) mVar.f324301a).get(this);
        if (nVar != null) {
            nVar.mo158766c();
            lVar.f324299g.mo158764a(this);
            ((ArrayList) lVar.f324298f).add(nVar);
        }
    }
}
