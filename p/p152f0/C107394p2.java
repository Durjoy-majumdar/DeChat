package p152f0;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p009c2.C104249e;
import p009c2.C104254h0;
import p009c2.C104260k;
import p009c2.C28482z;
import p175j0.C108494d2;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C33486h1;
import p175j0.C60690y0;
import p436a1.C103234g;
import p436a1.C103241i0;
import p631o1.C109857o;
import p869y0.C66478i;
import rx3.C13598b0;

/* renamed from: f0.p2 */
public final class C107394p2 {

    /* renamed from: a */
    public C107347h1 f321313a;

    /* renamed from: b */
    public final C33486h1 f321314b;

    /* renamed from: c */
    public final C104249e f321315c = new C104249e();

    /* renamed from: d */
    public C104254h0 f321316d;

    /* renamed from: e */
    public final C60690y0 f321317e;

    /* renamed from: f */
    public C109857o f321318f;

    /* renamed from: g */
    public C107401q2 f321319g;

    /* renamed from: h */
    public final C60690y0 f321320h;

    /* renamed from: i */
    public boolean f321321i;

    /* renamed from: j */
    public final C60690y0 f321322j;

    /* renamed from: k */
    public final C60690y0 f321323k;

    /* renamed from: l */
    public final C60690y0 f321324l;

    /* renamed from: m */
    public final C107392p0 f321325m;

    /* renamed from: n */
    public C32226l<? super C28482z, C13598b0> f321326n;

    /* renamed from: o */
    public final C32226l<C28482z, C13598b0> f321327o;

    /* renamed from: p */
    public final C32226l<C104260k, C13598b0> f321328p;

    /* renamed from: q */
    public final C103241i0 f321329q;

    /* renamed from: f0.p2$a */
    public static final class C107395a extends C87413o implements C32226l<C104260k, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C107394p2 f321330d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107395a(C107394p2 p2Var) {
            super(1);
            this.f321330d = p2Var;
        }

        public Object invoke(Object obj) {
            C32226l<C58866q0, C13598b0> lVar;
            C13598b0 b0Var;
            int i = ((C104260k) obj).f308592a;
            C107392p0 p0Var = this.f321330d.f321325m;
            p0Var.getClass();
            boolean z = false;
            if (i == 7) {
                lVar = p0Var.mo157810a().f321348a;
            } else {
                if (i == 2) {
                    lVar = p0Var.mo157810a().f321349b;
                } else {
                    if (i == 6) {
                        lVar = p0Var.mo157810a().f321350c;
                    } else {
                        if (i == 5) {
                            lVar = p0Var.mo157810a().f321351d;
                        } else {
                            if (i == 3) {
                                lVar = p0Var.mo157810a().f321352e;
                            } else {
                                if (i == 4) {
                                    lVar = p0Var.mo157810a().f321353f;
                                } else {
                                    if ((i == 1) || i == 0) {
                                        lVar = null;
                                    } else {
                                        throw new IllegalStateException("invalid ImeAction".toString());
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (lVar != null) {
                lVar.invoke(p0Var);
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                if (i == 6) {
                    C66478i iVar = p0Var.f321311b;
                    if (iVar != null) {
                        iVar.mo90560a(1);
                    } else {
                        C87412m.m108603p("focusManager");
                        throw null;
                    }
                } else {
                    if (i == 5) {
                        z = true;
                    }
                    if (z) {
                        C66478i iVar2 = p0Var.f321311b;
                        if (iVar2 != null) {
                            iVar2.mo90560a(2);
                        } else {
                            C87412m.m108603p("focusManager");
                            throw null;
                        }
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: f0.p2$b */
    public static final class C107396b extends C87413o implements C32226l<C28482z, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C107394p2 f321331d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107396b(C107394p2 p2Var) {
            super(1);
            this.f321331d = p2Var;
        }

        public Object invoke(Object obj) {
            C28482z zVar = (C28482z) obj;
            C87412m.m108594g(zVar, LocaleUtil.ITALIAN);
            if (!C87412m.m108589b(zVar.f78285a.f100413d, this.f321331d.f321313a.f321168a.f100413d)) {
                C107394p2 p2Var = this.f321331d;
                C107346h0 h0Var = C107346h0.None;
                p2Var.getClass();
                ((C108494d2) p2Var.f321320h).setValue(h0Var);
            }
            this.f321331d.f321326n.invoke(zVar);
            this.f321331d.f321314b.invalidate();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: f0.p2$c */
    public static final class C107397c extends C87413o implements C32226l<C28482z, C13598b0> {

        /* renamed from: d */
        public static final C107397c f321332d = new C107397c();

        public C107397c() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C28482z) obj, LocaleUtil.ITALIAN);
            return C13598b0.f38549a;
        }
    }

    public C107394p2(C107347h1 h1Var, C33486h1 h1Var2) {
        C87412m.m108594g(h1Var, "textDelegate");
        C87412m.m108594g(h1Var2, "recomposeScope");
        this.f321313a = h1Var;
        this.f321314b = h1Var2;
        Boolean bool = Boolean.FALSE;
        this.f321317e = C108500f2.m146996c(bool, (C108497e2) null, 2, (Object) null);
        this.f321320h = C108500f2.m146996c(C107346h0.None, (C108497e2) null, 2, (Object) null);
        this.f321322j = C108500f2.m146996c(bool, (C108497e2) null, 2, (Object) null);
        this.f321323k = C108500f2.m146996c(bool, (C108497e2) null, 2, (Object) null);
        this.f321324l = C108500f2.m146996c(bool, (C108497e2) null, 2, (Object) null);
        this.f321325m = new C107392p0();
        this.f321326n = C107397c.f321332d;
        this.f321327o = new C107396b(this);
        this.f321328p = new C107395a(this);
        this.f321329q = new C103234g();
    }

    /* renamed from: a */
    public final C107346h0 mo157811a() {
        return (C107346h0) this.f321320h.getValue();
    }

    /* renamed from: b */
    public final boolean mo157812b() {
        return ((Boolean) this.f321317e.getValue()).booleanValue();
    }
}
