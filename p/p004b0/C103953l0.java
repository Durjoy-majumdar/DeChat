package p004b0;

import androidx.compose.foundation.lazy.layout.C103576a;
import androidx.compose.foundation.lazy.layout.C103591o;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedHashMap;
import java.util.List;
import p1165z.C112527l;
import p1165z.C112528m;
import p175j0.C108494d2;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C60690y0;
import p267x.C38426u1;
import p560i2.C108321c;
import p560i2.C108322d;
import p560i2.C108324e;
import p631o1.C109862p0;
import p631o1.C109865q0;
import p683s0.C36597a;
import p683s0.C36601l;
import p683s0.C36606n;
import p721v0.C65503j;
import p759y.C112278q0;
import p759y.C112302z0;
import p759y.C66468h;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C36903g0;
import sx3.C64197v;
import wx3.C15601d;
import xx3.C15911a;

/* renamed from: b0.l0 */
public final class C103953l0 implements C112302z0 {

    /* renamed from: r */
    public static final C36601l<C103953l0, ?> f307415r = C36597a.m41001a(C28185a.f77680d, C28186b.f77681d);

    /* renamed from: a */
    public final C103947i0 f307416a;

    /* renamed from: b */
    public final C60690y0<C54390x> f307417b;

    /* renamed from: c */
    public final C112527l f307418c;

    /* renamed from: d */
    public float f307419d;

    /* renamed from: e */
    public C108322d f307420e;

    /* renamed from: f */
    public final C112302z0 f307421f;

    /* renamed from: g */
    public boolean f307422g;

    /* renamed from: h */
    public int f307423h;

    /* renamed from: i */
    public C103591o.C103592a f307424i;

    /* renamed from: j */
    public boolean f307425j;

    /* renamed from: k */
    public C109862p0 f307426k;

    /* renamed from: l */
    public final C109865q0 f307427l;

    /* renamed from: m */
    public final C60690y0 f307428m;

    /* renamed from: n */
    public long f307429n;

    /* renamed from: o */
    public boolean f307430o;

    /* renamed from: p */
    public boolean f307431p;

    /* renamed from: q */
    public final C103591o f307432q;

    /* renamed from: b0.l0$a */
    public static final class C28185a extends C87413o implements C32227p<C36606n, C103953l0, List<? extends Integer>> {

        /* renamed from: d */
        public static final C28185a f77680d = new C28185a();

        public C28185a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            C103953l0 l0Var = (C103953l0) obj2;
            C87412m.m108594g((C36606n) obj, "$this$listSaver");
            C87412m.m108594g(l0Var, LocaleUtil.ITALIAN);
            return C64197v.m75537f(Integer.valueOf(l0Var.mo145571e()), Integer.valueOf(l0Var.mo145572f()));
        }
    }

    /* renamed from: b0.l0$b */
    public static final class C28186b extends C87413o implements C32226l<List<? extends Integer>, C103953l0> {

        /* renamed from: d */
        public static final C28186b f77681d = new C28186b();

        public C28186b() {
            super(1);
        }

        public Object invoke(Object obj) {
            List list = (List) obj;
            C87412m.m108594g(list, LocaleUtil.ITALIAN);
            return new C103953l0(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
        }
    }

    /* renamed from: b0.l0$c */
    public static final class C103954c implements C109865q0 {

        /* renamed from: d */
        public final /* synthetic */ C103953l0 f307433d;

        public C103954c(C103953l0 l0Var) {
            this.f307433d = l0Var;
        }

        /* renamed from: S */
        public <R> R mo74969S(R r, C32227p<? super C65503j.C65506c, ? super R, ? extends R> pVar) {
            C87412m.m108594g(pVar, "operation");
            return pVar.invoke(this, r);
        }

        /* renamed from: a */
        public boolean mo74970a(C32226l<? super C65503j.C65506c, Boolean> lVar) {
            C87412m.m108594g(lVar, "predicate");
            return C65503j.C65506c.C65507a.m77190a(this, lVar);
        }

        /* renamed from: c */
        public <R> R mo74971c(R r, C32227p<? super R, ? super C65503j.C65506c, ? extends R> pVar) {
            C87412m.m108594g(pVar, "operation");
            return pVar.invoke(r, this);
        }

        /* renamed from: c0 */
        public void mo145576c0(C109862p0 p0Var) {
            C87412m.m108594g(p0Var, "remeasurement");
            this.f307433d.f307426k = p0Var;
        }

        /* renamed from: i0 */
        public C65503j mo74972i0(C65503j jVar) {
            C87412m.m108594g(jVar, "other");
            return C65503j.C65505b.m77189a(this, jVar);
        }
    }

    /* renamed from: b0.l0$d */
    public static final class C103955d extends C87413o implements C32226l<Float, Float> {

        /* renamed from: d */
        public final /* synthetic */ C103953l0 f307434d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C103955d(C103953l0 l0Var) {
            super(1);
            this.f307434d = l0Var;
        }

        public Object invoke(Object obj) {
            C103591o.C103592a aVar;
            C103591o.C103592a aVar2;
            float floatValue = ((Number) obj).floatValue();
            C103953l0 l0Var = this.f307434d;
            float f = -floatValue;
            if ((f >= 0.0f || l0Var.f307431p) && (f <= 0.0f || l0Var.f307430o)) {
                boolean z = false;
                if (Math.abs(l0Var.f307419d) <= 0.5f) {
                    float f2 = l0Var.f307419d + f;
                    l0Var.f307419d = f2;
                    if (Math.abs(f2) > 0.5f) {
                        float f3 = l0Var.f307419d;
                        C109862p0 p0Var = l0Var.f307426k;
                        if (p0Var != null) {
                            p0Var.mo161184f();
                        }
                        boolean z2 = l0Var.f307422g;
                        if (z2) {
                            float f4 = f3 - l0Var.f307419d;
                            if (z2) {
                                C54390x g = l0Var.mo145573g();
                                if (!g.mo55835f().isEmpty()) {
                                    boolean z3 = f4 < 0.0f;
                                    int index = z3 ? ((C54380k) C110818d0.m150923U(g.mo55835f())).getIndex() + 1 : ((C54380k) C110818d0.m150914L(g.mo55835f())).getIndex() - 1;
                                    if (index != l0Var.f307423h) {
                                        if (index >= 0 && index < g.mo55834e()) {
                                            z = true;
                                        }
                                        if (z) {
                                            if (!(l0Var.f307425j == z3 || (aVar2 = l0Var.f307424i) == null)) {
                                                aVar2.cancel();
                                            }
                                            l0Var.f307425j = z3;
                                            l0Var.f307423h = index;
                                            C103591o oVar = l0Var.f307432q;
                                            long j = l0Var.f307429n;
                                            C103591o.C103593b bVar = (C103591o.C103593b) ((C108494d2) oVar.f305925a).getValue();
                                            if (bVar == null || (aVar = bVar.mo144574a(index, j)) == null) {
                                                aVar = C103576a.f305894a;
                                            }
                                            l0Var.f307424i = aVar;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (Math.abs(l0Var.f307419d) > 0.5f) {
                        f -= l0Var.f307419d;
                        l0Var.f307419d = 0.0f;
                    }
                } else {
                    throw new IllegalStateException(("entered drag with non-zero pending scroll: " + l0Var.f307419d).toString());
                }
            } else {
                f = 0.0f;
            }
            return Float.valueOf(-f);
        }
    }

    public C103953l0() {
        this(0, 0, 3, (C8480h) null);
    }

    public C103953l0(int i, int i2) {
        this.f307416a = new C103947i0(i, i2);
        this.f307417b = C108500f2.m146996c(C28184a.f77679a, (C108497e2) null, 2, (Object) null);
        this.f307418c = new C112528m();
        this.f307420e = new C108324e(1.0f, 1.0f);
        this.f307421f = new C66468h(new C103955d(this));
        this.f307422g = true;
        this.f307423h = -1;
        this.f307427l = new C103954c(this);
        this.f307428m = C108500f2.m146996c((Object) null, (C108497e2) null, 2, (Object) null);
        this.f307429n = C108321c.m146705b(0, 0, 0, 0, 15, (Object) null);
        this.f307432q = new C103591o();
    }

    /* renamed from: h */
    public static Object m138679h(C103953l0 l0Var, int i, int i2, C15601d dVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        Object a = C112302z0.C112303a.m153183a(l0Var.f307421f, (C38426u1) null, new C103958m0(l0Var, i, i2, (C15601d<? super C103958m0>) null), dVar, 1, (Object) null);
        return a == C15911a.COROUTINE_SUSPENDED ? a : C13598b0.f38549a;
    }

    /* renamed from: a */
    public boolean mo90552a() {
        return ((C66468h) this.f307421f).mo90552a();
    }

    /* renamed from: b */
    public float mo90553b(float f) {
        return ((C66468h) this.f307421f).mo90553b(f);
    }

    /* renamed from: c */
    public Object mo90554c(C38426u1 u1Var, C32227p<? super C112278q0, ? super C15601d<? super C13598b0>, ? extends Object> pVar, C15601d<? super C13598b0> dVar) {
        Object c = ((C66468h) this.f307421f).mo90554c(u1Var, pVar, dVar);
        return c == C15911a.COROUTINE_SUSPENDED ? c : C13598b0.f38549a;
    }

    /* renamed from: d */
    public final Object mo145570d(int i, int i2, C15601d<? super C13598b0> dVar) {
        float f = C103951k0.f307411a;
        if (((float) i) >= 0.0f) {
            Object a = C112302z0.C112303a.m153183a(this, (C38426u1) null, new C103948j0(this, i, i2, (C15601d<? super C103948j0>) null), dVar, 1, (Object) null);
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            if (a != aVar) {
                a = C13598b0.f38549a;
            }
            return a == aVar ? a : C13598b0.f38549a;
        }
        throw new IllegalArgumentException(("Index should be non-negative (" + i + ')').toString());
    }

    /* renamed from: e */
    public final int mo145571e() {
        return ((Number) ((C108494d2) this.f307416a.f307382c).getValue()).intValue();
    }

    /* renamed from: f */
    public final int mo145572f() {
        return ((Number) ((C108494d2) this.f307416a.f307383d).getValue()).intValue();
    }

    /* renamed from: g */
    public final C54390x mo145573g() {
        return (C54390x) ((C108494d2) this.f307417b).getValue();
    }

    /* renamed from: i */
    public final void mo145574i(int i, int i2) {
        C103947i0 i0Var = this.f307416a;
        i0Var.mo145569a(i, i2);
        i0Var.f307385f = null;
        C103956m mVar = (C103956m) ((C108494d2) this.f307428m).getValue();
        if (mVar != null) {
            ((LinkedHashMap) mVar.f307437c).clear();
            mVar.f307438d = C36903g0.f97931d;
            mVar.f307439e = -1;
            mVar.f307440f = 0;
            mVar.f307441g = -1;
            mVar.f307442h = 0;
        }
        C109862p0 p0Var = this.f307426k;
        if (p0Var != null) {
            p0Var.mo161184f();
        }
    }

    /* renamed from: j */
    public final void mo145575j(C103962o oVar) {
        Integer num;
        C87412m.m108594g(oVar, "itemProvider");
        C103947i0 i0Var = this.f307416a;
        i0Var.getClass();
        Object obj = i0Var.f307385f;
        int i = i0Var.f307380a;
        if (obj != null && ((i >= oVar.getItemCount() || !C87412m.m108589b(obj, oVar.mo75150f(i))) && (num = oVar.mo75149e().get(obj)) != null)) {
            i = num.intValue();
        }
        i0Var.mo145569a(i, i0Var.f307381b);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C103953l0(int i, int i2, int i3, C8480h hVar) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
