package p558i0;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import a14.C53956v;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Iterator;
import java.util.Map;
import kotlin.ResultKt;
import p1125j2.C108530a;
import p1165z.C112530o;
import p1166z0.C112539e;
import p1166z0.C112540f;
import p1166z0.C112545k;
import p175j0.C108494d2;
import p175j0.C24725u1;
import p175j0.C60667k2;
import p241t0.C110867q;
import p241t0.C110876x;
import p436a1.C103272w;
import p436a1.C103274x;
import p835c1.C104230e;
import p835c1.C104231f;
import p835c1.C104233g;
import p835c1.C54601d;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: i0.c */
public final class C108293c extends C108307o implements C24725u1 {

    /* renamed from: e */
    public final boolean f324256e;

    /* renamed from: f */
    public final float f324257f;

    /* renamed from: g */
    public final C60667k2<C103272w> f324258g;

    /* renamed from: h */
    public final C60667k2<C108300g> f324259h;

    /* renamed from: i */
    public final C110876x<C112530o, C108301h> f324260i = new C110876x<>();

    @C91590f(mo125468c = "androidx.compose.material.ripple.CommonRippleIndicationInstance$addRipple$2", mo125469f = "CommonRipple.kt", mo125470l = {87}, mo125471m = "invokeSuspend")
    /* renamed from: i0.c$a */
    public static final class C108294a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f324261d;

        /* renamed from: e */
        public final /* synthetic */ C108301h f324262e;

        /* renamed from: f */
        public final /* synthetic */ C108293c f324263f;

        /* renamed from: g */
        public final /* synthetic */ C112530o f324264g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108294a(C108301h hVar, C108293c cVar, C112530o oVar, C15601d<? super C108294a> dVar) {
            super(2, dVar);
            this.f324262e = hVar;
            this.f324263f = cVar;
            this.f324264g = oVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C108294a(this.f324262e, this.f324263f, this.f324264g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C108294a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f324261d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C108301h hVar = this.f324262e;
                this.f324261d = 1;
                if (hVar.mo158761a(this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Throwable th) {
                    this.f324263f.f324260i.remove(this.f324264g);
                    throw th;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f324263f.f324260i.remove(this.f324264g);
            return C13598b0.f38549a;
        }
    }

    public C108293c(boolean z, float f, C60667k2 k2Var, C60667k2 k2Var2, C8480h hVar) {
        super(z, k2Var2);
        this.f324256e = z;
        this.f324257f = f;
        this.f324258g = k2Var;
        this.f324259h = k2Var2;
    }

    /* renamed from: a */
    public void mo149521a(C54601d dVar) {
        long j;
        C54601d dVar2 = dVar;
        C87412m.m108594g(dVar2, "<this>");
        long j2 = this.f324258g.getValue().f304517a;
        dVar.mo75508h0();
        mo158774f(dVar2, this.f324257f, j2);
        Iterator it = ((C110867q) this.f324260i.entrySet()).iterator();
        while (it.hasNext()) {
            C108301h hVar = (C108301h) ((Map.Entry) it.next()).getValue();
            float f = this.f324259h.getValue().f324278d;
            if (!(f == 0.0f)) {
                long b = C103272w.m136780b(j2, f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
                hVar.getClass();
                if (hVar.f324282d == null) {
                    long e = dVar.mo145819e();
                    float f2 = C108303k.f324295a;
                    hVar.f324282d = Float.valueOf(Math.max(C112545k.m153758d(e), C112545k.m153756b(e)) * 0.3f);
                }
                if (hVar.f324283e == null) {
                    hVar.f324283e = Float.isNaN(hVar.f324280b) ? Float.valueOf(C108303k.m146668a(dVar2, hVar.f324281c, dVar.mo145819e())) : Float.valueOf(dVar2.mo143034T(hVar.f324280b));
                }
                if (hVar.f324279a == null) {
                    hVar.f324279a = new C112539e(dVar.mo145820f0());
                }
                if (hVar.f324284f == null) {
                    hVar.f324284f = new C112539e(C112540f.m153745a(C112545k.m153758d(dVar.mo145819e()) / 2.0f, C112545k.m153756b(dVar.mo145819e()) / 2.0f));
                }
                float floatValue = (!((Boolean) ((C108494d2) hVar.f324290l).getValue()).booleanValue() || ((Boolean) ((C108494d2) hVar.f324289k).getValue()).booleanValue()) ? hVar.f324285g.mo163295c().floatValue() : 1.0f;
                Float f3 = hVar.f324282d;
                C87412m.m108591d(f3);
                float floatValue2 = f3.floatValue();
                Float f4 = hVar.f324283e;
                C87412m.m108591d(f4);
                float a = C108530a.m147078a(floatValue2, f4.floatValue(), hVar.f324286h.mo163295c().floatValue());
                C112539e eVar = hVar.f324279a;
                C87412m.m108591d(eVar);
                float c = C112539e.m153738c(eVar.f336959a);
                C112539e eVar2 = hVar.f324284f;
                C87412m.m108591d(eVar2);
                float a2 = C108530a.m147078a(c, C112539e.m153738c(eVar2.f336959a), hVar.f324287i.mo163295c().floatValue());
                C112539e eVar3 = hVar.f324279a;
                C87412m.m108591d(eVar3);
                float d = C112539e.m153739d(eVar3.f336959a);
                C112539e eVar4 = hVar.f324284f;
                C87412m.m108591d(eVar4);
                long a3 = C112540f.m153745a(a2, C108530a.m147078a(d, C112539e.m153739d(eVar4.f336959a), hVar.f324287i.mo163295c().floatValue()));
                long b2 = C103272w.m136780b(b, C103272w.m136782d(b) * floatValue, 0.0f, 0.0f, 0.0f, 14, (Object) null);
                if (hVar.f324281c) {
                    float d2 = C112545k.m153758d(dVar.mo145819e());
                    float b3 = C112545k.m153756b(dVar.mo145819e());
                    C104230e B = dVar.mo145815B();
                    long e2 = B.mo145834e();
                    B.mo145835i().mo142944c();
                    j = j2;
                    B.mo145836j().mo145838a(0.0f, 0.0f, d2, b3, 1);
                    C104230e eVar5 = B;
                    C104231f.C104232a.m139082a(dVar, b2, a, a3, 0.0f, (C104233g) null, (C103274x) null, 0, 120, (Object) null);
                    eVar5.mo145835i().mo142943b();
                    eVar5.mo145837k(e2);
                } else {
                    j = j2;
                    C104231f.C104232a.m139082a(dVar, b2, a, a3, 0.0f, (C104233g) null, (C103274x) null, 0, 120, (Object) null);
                }
            } else {
                j = j2;
            }
            dVar2 = dVar;
            j2 = j;
        }
    }

    /* renamed from: b */
    public void mo51625b() {
        this.f324260i.clear();
    }

    /* renamed from: c */
    public void mo51626c() {
    }

    /* renamed from: d */
    public void mo51627d() {
        this.f324260i.clear();
    }

    /* renamed from: e */
    public void mo158752e(C112530o oVar, C0000n0 n0Var) {
        C87412m.m108594g(oVar, "interaction");
        C87412m.m108594g(n0Var, "scope");
        Iterator it = ((C110867q) this.f324260i.f331666e).iterator();
        while (it.hasNext()) {
            C108301h hVar = (C108301h) ((Map.Entry) it.next()).getValue();
            ((C108494d2) hVar.f324290l).setValue(Boolean.TRUE);
            ((C53956v) hVar.f324288j).mo74537j0(C13598b0.f38549a);
        }
        C108301h hVar2 = new C108301h(this.f324256e ? new C112539e(oVar.f336942a) : null, this.f324257f, this.f324256e, (C8480h) null);
        this.f324260i.put(oVar, hVar2);
        C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, new C108294a(hVar2, this, oVar, (C15601d<? super C108294a>) null), 3, (Object) null);
    }

    /* renamed from: g */
    public void mo158753g(C112530o oVar) {
        C87412m.m108594g(oVar, "interaction");
        C108301h hVar = this.f324260i.get(oVar);
        if (hVar != null) {
            ((C108494d2) hVar.f324290l).setValue(Boolean.TRUE);
            ((C53956v) hVar.f324288j).mo74537j0(C13598b0.f38549a);
        }
    }
}
