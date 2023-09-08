package p1104d1;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p1166z0.C112539e;
import p1166z0.C112541g;
import p1166z0.C112542h;
import p1166z0.C112545k;
import p1166z0.C112546l;
import p436a1.C103234g;
import p436a1.C103241i0;
import p436a1.C103262s;
import p436a1.C103274x;
import p560i2.C33183o;
import p835c1.C104231f;
import rx3.C13598b0;

/* renamed from: d1.c */
public abstract class C106969c {

    /* renamed from: d */
    public C103241i0 f320198d;

    /* renamed from: e */
    public boolean f320199e;

    /* renamed from: f */
    public C103274x f320200f;

    /* renamed from: g */
    public float f320201g = 1.0f;

    /* renamed from: h */
    public C33183o f320202h = C33183o.Ltr;

    /* renamed from: d1.c$a */
    public static final class C106970a extends C87413o implements C32226l<C104231f, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C106969c f320203d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106970a(C106969c cVar) {
            super(1);
            this.f320203d = cVar;
        }

        public Object invoke(Object obj) {
            C104231f fVar = (C104231f) obj;
            C87412m.m108594g(fVar, "$this$null");
            this.f320203d.mo84459i(fVar);
            return C13598b0.f38549a;
        }
    }

    public C106969c() {
        new C106970a(this);
    }

    /* renamed from: a */
    public boolean mo84456a(float f) {
        return false;
    }

    /* renamed from: e */
    public boolean mo84457e(C103274x xVar) {
        return false;
    }

    /* renamed from: f */
    public boolean mo157378f(C33183o oVar) {
        C87412m.m108594g(oVar, "layoutDirection");
        return false;
    }

    /* renamed from: g */
    public final void mo157379g(C104231f fVar, long j, float f, C103274x xVar) {
        C87412m.m108594g(fVar, "$this$draw");
        if (!(this.f320201g == f)) {
            if (!mo84456a(f)) {
                if (f == 1.0f) {
                    C103241i0 i0Var = this.f320198d;
                    if (i0Var != null) {
                        ((C103234g) i0Var).setAlpha(f);
                    }
                    this.f320199e = false;
                } else {
                    C103241i0 i0Var2 = this.f320198d;
                    if (i0Var2 == null) {
                        i0Var2 = new C103234g();
                        this.f320198d = i0Var2;
                    }
                    ((C103234g) i0Var2).setAlpha(f);
                    this.f320199e = true;
                }
            }
            this.f320201g = f;
        }
        if (!C87412m.m108589b(this.f320200f, xVar)) {
            if (!mo84457e(xVar)) {
                if (xVar == null) {
                    C103241i0 i0Var3 = this.f320198d;
                    if (i0Var3 != null) {
                        ((C103234g) i0Var3).mo142988b((C103274x) null);
                    }
                    this.f320199e = false;
                } else {
                    C103241i0 i0Var4 = this.f320198d;
                    if (i0Var4 == null) {
                        i0Var4 = new C103234g();
                        this.f320198d = i0Var4;
                    }
                    ((C103234g) i0Var4).mo142988b(xVar);
                    this.f320199e = true;
                }
            }
            this.f320200f = xVar;
        }
        C33183o layoutDirection = fVar.getLayoutDirection();
        if (this.f320202h != layoutDirection) {
            mo157378f(layoutDirection);
            this.f320202h = layoutDirection;
        }
        float d = C112545k.m153758d(fVar.mo145819e()) - C112545k.m153758d(j);
        float b = C112545k.m153756b(fVar.mo145819e()) - C112545k.m153756b(j);
        fVar.mo145815B().mo145836j().mo145840c(0.0f, 0.0f, d, b);
        if (f > 0.0f && C112545k.m153758d(j) > 0.0f && C112545k.m153756b(j) > 0.0f) {
            if (this.f320199e) {
                C112541g a = C112542h.m153752a(C112539e.f336955b, C112546l.m153761a(C112545k.m153758d(j), C112545k.m153756b(j)));
                C103262s i = fVar.mo145815B().mo145835i();
                C103241i0 i0Var5 = this.f320198d;
                if (i0Var5 == null) {
                    i0Var5 = new C103234g();
                    this.f320198d = i0Var5;
                }
                try {
                    i.mo142951j(a, i0Var5);
                    mo84459i(fVar);
                } finally {
                    i.mo142943b();
                }
            } else {
                mo84459i(fVar);
            }
        }
        fVar.mo145815B().mo145836j().mo145840c(-0.0f, -0.0f, -d, -b);
    }

    /* renamed from: h */
    public abstract long mo84458h();

    /* renamed from: i */
    public abstract void mo84459i(C104231f fVar);
}
