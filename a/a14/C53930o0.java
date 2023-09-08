package a14;

import a14.C53973z1;
import f14.C58901s;
import f14.C58907y;
import f14.C7972g;
import fy3.C32227p;
import g14.C59348b;
import java.util.concurrent.CancellationException;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: a14.o0 */
public final class C53930o0 {
    /* renamed from: a */
    public static final C0000n0 m60554a(C66212f fVar) {
        int i = C53973z1.f151221b0;
        if (fVar.get(C53973z1.C0004b.f3d) == null) {
            fVar = fVar.plus(C53873d2.m60389a((C53973z1) null, 1, (Object) null));
        }
        return new C7972g(fVar);
    }

    /* renamed from: b */
    public static final C0000n0 m60555b() {
        C0002w a = C53959v2.m60598a((C53973z1) null, 1, (Object) null);
        C53896h0 h0Var = C53872d1.f151117a;
        return new C7972g(((C53884f2) a).plus(C58901s.f168555a));
    }

    /* renamed from: c */
    public static final void m60556c(C0000n0 n0Var, CancellationException cancellationException) {
        C66212f coroutineContext = n0Var.getCoroutineContext();
        int i = C53973z1.f151221b0;
        C53973z1 z1Var = (C53973z1) coroutineContext.get(C53973z1.C0004b.f3d);
        if (z1Var != null) {
            z1Var.mo74528b(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + n0Var).toString());
    }

    /* renamed from: d */
    public static void m60557d(C0000n0 n0Var, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        m60556c(n0Var, C53927n1.m60552a(str, th));
    }

    /* renamed from: e */
    public static /* synthetic */ void m60558e(C0000n0 n0Var, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        m60556c(n0Var, cancellationException);
    }

    /* renamed from: f */
    public static final <R> Object m60559f(C32227p<? super C0000n0, ? super C15601d<? super R>, ? extends Object> pVar, C15601d<? super R> dVar) {
        C58907y yVar = new C58907y(dVar.getContext(), dVar);
        return C59348b.m69267a(yVar, yVar, pVar);
    }

    /* renamed from: g */
    public static final boolean m60560g(C0000n0 n0Var) {
        C66212f coroutineContext = n0Var.getCoroutineContext();
        int i = C53973z1.f151221b0;
        C53973z1 z1Var = (C53973z1) coroutineContext.get(C53973z1.C0004b.f3d);
        if (z1Var != null) {
            return z1Var.mo74466a();
        }
        return true;
    }

    /* renamed from: h */
    public static final C0000n0 m60561h(C0000n0 n0Var, C66212f fVar) {
        return new C7972g(n0Var.getCoroutineContext().plus(fVar));
    }
}
