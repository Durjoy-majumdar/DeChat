package a14;

import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import f14.C58878f0;
import f14.C58907y;
import fy3.C32226l;
import fy3.C32227p;
import g14.C59347a;
import g14.C59348b;
import gy3.C87412m;
import java.util.concurrent.locks.LockSupport;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66210e;
import wx3.C66212f;
import wx3.C66217g;

/* renamed from: a14.h */
public final class C53895h {
    /* renamed from: a */
    public static final <T> C53953u0<T> m60463a(C0000n0 n0Var, C66212f fVar, C53934p0 p0Var, C32227p<? super C0000n0, ? super C15601d<? super T>, ? extends Object> pVar) {
        C66212f b = C53876e0.m60398b(n0Var, fVar);
        p0Var.getClass();
        C53957v0 i2Var = p0Var == C53934p0.LAZY ? new C53903i2(b, pVar) : new C53957v0(b, true);
        i2Var.mo74473y0(p0Var, i2Var, pVar);
        return i2Var;
    }

    /* renamed from: b */
    public static /* synthetic */ C53953u0 m60464b(C0000n0 n0Var, C66212f fVar, C53934p0 p0Var, C32227p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            fVar = C66217g.f190253d;
        }
        if ((i & 2) != 0) {
            p0Var = C53934p0.DEFAULT;
        }
        return m60463a(n0Var, fVar, p0Var, pVar);
    }

    /* renamed from: c */
    public static final C53973z1 m60465c(C0000n0 n0Var, C66212f fVar, C53934p0 p0Var, C32227p<? super C0000n0, ? super C15601d<? super C13598b0>, ? extends Object> pVar) {
        C66212f b = C53876e0.m60398b(n0Var, fVar);
        p0Var.getClass();
        C53851a j2Var = p0Var == C53934p0.LAZY ? new C53907j2(b, pVar) : new C53951t2(b, true);
        j2Var.mo74473y0(p0Var, j2Var, pVar);
        return j2Var;
    }

    /* renamed from: d */
    public static /* synthetic */ C53973z1 m60466d(C0000n0 n0Var, C66212f fVar, C53934p0 p0Var, C32227p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            fVar = C66217g.f190253d;
        }
        if ((i & 2) != 0) {
            p0Var = C53934p0.DEFAULT;
        }
        return m60465c(n0Var, fVar, p0Var, pVar);
    }

    /* renamed from: e */
    public static final <T> T m60467e(C66212f fVar, C32227p<? super C0000n0, ? super C15601d<? super T>, ? extends Object> pVar) {
        C66212f fVar2;
        C53906j1 j1Var;
        Thread currentThread = Thread.currentThread();
        C66210e.C66211a aVar = C66210e.C66211a.f190251d;
        C66210e eVar = (C66210e) fVar.get(aVar);
        if (eVar == null) {
            j1Var = C53968x2.f151211a.mo74642a();
            fVar2 = C53876e0.m60397a(C66217g.f190253d, fVar.plus(j1Var), true);
            C53896h0 h0Var = C53872d1.f151117a;
            if (fVar2 != h0Var && fVar2.get(aVar) == null) {
                fVar2 = fVar2.plus(h0Var);
            }
        } else {
            if (eVar instanceof C53906j1) {
                C53906j1 j1Var2 = (C53906j1) eVar;
            }
            j1Var = C53968x2.f151212b.get();
            fVar2 = C53876e0.m60397a(C66217g.f190253d, fVar, true);
            C53896h0 h0Var2 = C53872d1.f151117a;
            if (fVar2 != h0Var2 && fVar2.get(aVar) == null) {
                fVar2 = fVar2.plus(h0Var2);
            }
        }
        C53881f fVar3 = new C53881f(fVar2, currentThread, j1Var);
        fVar3.mo74473y0(C53934p0.DEFAULT, fVar3, pVar);
        C53906j1 j1Var3 = fVar3.f151127g;
        if (j1Var3 != null) {
            int i = C53906j1.f151156h;
            j1Var3.mo74571k0(false);
        }
        while (!Thread.interrupted()) {
            try {
                C53906j1 j1Var4 = fVar3.f151127g;
                long n0 = j1Var4 != null ? j1Var4.mo74573n0() : MAlarmHandler.NEXT_FIRE_INTERVAL;
                if (!fVar3.mo74530c()) {
                    LockSupport.parkNanos(fVar3, n0);
                } else {
                    T a = C53899h2.m60476a(fVar3.mo74531d0());
                    C53969y yVar = a instanceof C53969y ? (C53969y) a : null;
                    if (yVar == null) {
                        return a;
                    }
                    throw yVar.f151214a;
                }
            } finally {
                C53906j1 j1Var5 = fVar3.f151127g;
                if (j1Var5 != null) {
                    int i2 = C53906j1.f151156h;
                    j1Var5.mo74569i0(false);
                }
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        fVar3.mo74513C(interruptedException);
        throw interruptedException;
    }

    /* renamed from: f */
    public static /* synthetic */ Object m60468f(C66212f fVar, C32227p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            fVar = C66217g.f190253d;
        }
        return m60467e(fVar, pVar);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: g */
    public static final <T> Object m60469g(C66212f fVar, C32227p<? super C0000n0, ? super C15601d<? super T>, ? extends Object> pVar, C15601d<? super T> dVar) {
        C66212f context = dVar.getContext();
        C66212f plus = !((Boolean) fVar.fold(Boolean.FALSE, C53882f0.f151128d)).booleanValue() ? context.plus(fVar) : C53876e0.m60397a(context, fVar, false);
        C53873d2.m60392d(plus);
        if (plus == context) {
            C58907y yVar = new C58907y(plus, dVar);
            return C59348b.m69267a(yVar, yVar, pVar);
        }
        C66210e.C66211a aVar = C66210e.C66211a.f190251d;
        if (C87412m.m108589b(plus.get(aVar), context.get(aVar))) {
            C53874d3 d3Var = new C53874d3(plus, dVar);
            Object c = C58878f0.m68716c(plus, (Object) null);
            try {
                Object a = C59348b.m69267a(d3Var, d3Var, pVar);
                C58878f0.m68714a(plus, c);
                return a;
            } catch (Throwable th) {
                C58878f0.m68714a(plus, c);
                throw th;
            }
        } else {
            C53972z0 z0Var = new C53972z0(plus, dVar);
            C59347a.m69266a(pVar, z0Var, z0Var, (C32226l) null, 4, (Object) null);
            return z0Var.mo74648z0();
        }
    }
}
