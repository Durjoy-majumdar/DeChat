package p558i0;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import d14.C45252f;
import d14.C45253g;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import kotlin.ResultKt;
import p1165z.C112514a;
import p1165z.C112515b;
import p1165z.C112516c;
import p1165z.C112517d;
import p1165z.C112518e;
import p1165z.C112521g;
import p1165z.C112522h;
import p1165z.C112525j;
import p1165z.C112526k;
import p1165z.C112529n;
import p1165z.C112530o;
import p1165z.C112531p;
import p175j0.C108500f2;
import p175j0.C108504h;
import p175j0.C60655g0;
import p175j0.C60667k2;
import p257w.C37890a0;
import p257w.C37905j1;
import p257w.C37950z;
import p267x.C111907e1;
import p267x.C111909f1;
import p436a1.C103272w;
import p560i2.C108325f;
import rx3.C13598b0;
import sx3.C110818d0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: i0.f */
public abstract class C108297f implements C111907e1 {

    /* renamed from: a */
    public final boolean f324266a;

    /* renamed from: b */
    public final float f324267b;

    /* renamed from: c */
    public final C60667k2<C103272w> f324268c;

    @C91590f(mo125468c = "androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1", mo125469f = "Ripple.kt", mo125470l = {356}, mo125471m = "invokeSuspend")
    /* renamed from: i0.f$a */
    public static final class C108298a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f324269d;

        /* renamed from: e */
        public /* synthetic */ Object f324270e;

        /* renamed from: f */
        public final /* synthetic */ C112526k f324271f;

        /* renamed from: g */
        public final /* synthetic */ C108307o f324272g;

        /* renamed from: i0.f$a$a */
        public static final class C108299a implements C45253g<C112525j> {

            /* renamed from: d */
            public final /* synthetic */ C108307o f324273d;

            /* renamed from: e */
            public final /* synthetic */ C0000n0 f324274e;

            public C108299a(C108307o oVar, C0000n0 n0Var) {
                this.f324273d = oVar;
                this.f324274e = n0Var;
            }

            public Object emit(C112525j jVar, C15601d<? super C13598b0> dVar) {
                C37905j1<Float> j1Var;
                C37905j1<Float> j1Var2;
                C112525j jVar2 = jVar;
                if (jVar2 instanceof C112530o) {
                    this.f324273d.mo158752e((C112530o) jVar2, this.f324274e);
                } else if (jVar2 instanceof C112531p) {
                    this.f324273d.mo158753g(((C112531p) jVar2).f336943a);
                } else if (jVar2 instanceof C112529n) {
                    this.f324273d.mo158753g(((C112529n) jVar2).f336941a);
                } else {
                    C108307o oVar = this.f324273d;
                    C0000n0 n0Var = this.f324274e;
                    oVar.getClass();
                    C87412m.m108594g(jVar2, "interaction");
                    C87412m.m108594g(n0Var, "scope");
                    C108312u uVar = oVar.f324311d;
                    uVar.getClass();
                    boolean z = jVar2 instanceof C112521g;
                    if (z) {
                        ((ArrayList) uVar.f324321d).add(jVar2);
                    } else if (jVar2 instanceof C112522h) {
                        ((ArrayList) uVar.f324321d).remove(((C112522h) jVar2).f336934a);
                    } else if (jVar2 instanceof C112517d) {
                        ((ArrayList) uVar.f324321d).add(jVar2);
                    } else if (jVar2 instanceof C112518e) {
                        ((ArrayList) uVar.f324321d).remove(((C112518e) jVar2).f336928a);
                    } else if (jVar2 instanceof C112515b) {
                        ((ArrayList) uVar.f324321d).add(jVar2);
                    } else if (jVar2 instanceof C112516c) {
                        ((ArrayList) uVar.f324321d).remove(((C112516c) jVar2).f336927a);
                    } else if (jVar2 instanceof C112514a) {
                        ((ArrayList) uVar.f324321d).remove(((C112514a) jVar2).f336926a);
                    }
                    C112525j jVar3 = (C112525j) C110818d0.m150925W(uVar.f324321d);
                    if (!C87412m.m108589b(uVar.f324322e, jVar3)) {
                        if (jVar3 != null) {
                            float f = z ? uVar.f324319b.getValue().f324277c : jVar2 instanceof C112517d ? uVar.f324319b.getValue().f324276b : jVar2 instanceof C112515b ? uVar.f324319b.getValue().f324275a : 0.0f;
                            C37905j1<Float> j1Var3 = C108308p.f324312a;
                            if (jVar3 instanceof C112521g) {
                                j1Var2 = C108308p.f324312a;
                            } else if (jVar3 instanceof C112517d) {
                                C37950z zVar = C37890a0.f100293a;
                                j1Var2 = new C37905j1<>(45, 0, C37890a0.C37891a.f100294a, 2, (C8480h) null);
                            } else if (jVar3 instanceof C112515b) {
                                C37950z zVar2 = C37890a0.f100293a;
                                j1Var2 = new C37905j1<>(45, 0, C37890a0.C37891a.f100294a, 2, (C8480h) null);
                            } else {
                                j1Var2 = C108308p.f324312a;
                            }
                            C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, new C33171s(uVar, f, j1Var2, (C15601d<? super C33171s>) null), 3, (Object) null);
                        } else {
                            C112525j jVar4 = uVar.f324322e;
                            C37905j1<Float> j1Var4 = C108308p.f324312a;
                            if (jVar4 instanceof C112521g) {
                                j1Var = C108308p.f324312a;
                            } else if (jVar4 instanceof C112517d) {
                                j1Var = C108308p.f324312a;
                            } else if (jVar4 instanceof C112515b) {
                                C37950z zVar3 = C37890a0.f100293a;
                                j1Var = new C37905j1<>(150, 0, C37890a0.C37891a.f100294a, 2, (C8480h) null);
                            } else {
                                j1Var = C108308p.f324312a;
                            }
                            C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, new C33172t(uVar, j1Var, (C15601d<? super C33172t>) null), 3, (Object) null);
                        }
                        uVar.f324322e = jVar3;
                    }
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108298a(C112526k kVar, C108307o oVar, C15601d<? super C108298a> dVar) {
            super(2, dVar);
            this.f324271f = kVar;
            this.f324272g = oVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C108298a aVar = new C108298a(this.f324271f, this.f324272g, dVar);
            aVar.f324270e = obj;
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C108298a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f324269d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C45252f<C112525j> c = this.f324271f.mo164251c();
                C108299a aVar2 = new C108299a(this.f324272g, (C0000n0) this.f324270e);
                this.f324269d = 1;
                if (c.mo31880a(aVar2, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    public C108297f(boolean z, float f, C60667k2 k2Var, C8480h hVar) {
        this.f324266a = z;
        this.f324267b = f;
        this.f324268c = k2Var;
    }

    /* renamed from: a */
    public final C111909f1 mo149520a(C112526k kVar, C108504h hVar, int i) {
        C87412m.m108594g(kVar, "interactionSource");
        hVar.mo51557H(988743187);
        C108309q qVar = (C108309q) hVar.mo51598m(C108310r.f324313a);
        hVar.mo51557H(-1524341038);
        long j = this.f324268c.getValue().f304517a;
        int i2 = C103272w.f304516h;
        long b = (j > C103272w.f304515g ? 1 : (j == C103272w.f304515g ? 0 : -1)) != 0 ? this.f324268c.getValue().f304517a : qVar.mo158370b(hVar, 0);
        hVar.mo51565P();
        C108307o b2 = mo158755b(kVar, this.f324266a, this.f324267b, C108500f2.m146998e(new C103272w(b), hVar, 0), C108500f2.m146998e(qVar.mo158369a(hVar, 0), hVar, 0), hVar, (i & 14) | (458752 & (i << 12)));
        C60655g0.m70933d(b2, kVar, new C108298a(kVar, b2, (C15601d<? super C108298a>) null), hVar, ((i << 3) & 112) | 8);
        hVar.mo51565P();
        return b2;
    }

    /* renamed from: b */
    public abstract C108307o mo158755b(C112526k kVar, boolean z, float f, C60667k2<C103272w> k2Var, C60667k2<C108300g> k2Var2, C108504h hVar, int i);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C108297f)) {
            return false;
        }
        C108297f fVar = (C108297f) obj;
        return this.f324266a == fVar.f324266a && C108325f.m146734a(this.f324267b, fVar.f324267b) && C87412m.m108589b(this.f324268c, fVar.f324268c);
    }

    public int hashCode() {
        return ((((this.f324266a ? 1231 : 1237) * 31) + Float.floatToIntBits(this.f324267b)) * 31) + this.f324268c.hashCode();
    }
}
