package a14;

import a14.C53973z1;
import java.util.concurrent.CancellationException;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;

/* renamed from: a14.d2 */
public final class C53873d2 {
    /* renamed from: a */
    public static C0002w m60389a(C53973z1 z1Var, int i, Object obj) {
        if ((i & 1) != 0) {
            z1Var = null;
        }
        return new C53867c2(z1Var);
    }

    /* renamed from: b */
    public static final void m60390b(C66212f fVar, CancellationException cancellationException) {
        int i = C53973z1.f151221b0;
        C53973z1 z1Var = (C53973z1) fVar.get(C53973z1.C0004b.f3d);
        if (z1Var != null) {
            z1Var.mo74528b(cancellationException);
        }
    }

    /* renamed from: c */
    public static final Object m60391c(C53973z1 z1Var, C15601d<? super C13598b0> dVar) {
        C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        Object O = z1Var.mo74521O(dVar);
        return O == C15911a.COROUTINE_SUSPENDED ? O : C13598b0.f38549a;
    }

    /* renamed from: d */
    public static final void m60392d(C66212f fVar) {
        C53973z1 z1Var = (C53973z1) fVar.get(C53973z1.C0004b.f3d);
        if (z1Var != null && !z1Var.mo74466a()) {
            throw z1Var.mo74526Z();
        }
    }

    /* renamed from: e */
    public static final C53973z1 m60393e(C66212f fVar) {
        int i = C53973z1.f151221b0;
        C53973z1 z1Var = (C53973z1) fVar.get(C53973z1.C0004b.f3d);
        if (z1Var != null) {
            return z1Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + fVar).toString());
    }

    /* renamed from: f */
    public static final boolean m60394f(C66212f fVar) {
        int i = C53973z1.f151221b0;
        C53973z1 z1Var = (C53973z1) fVar.get(C53973z1.C0004b.f3d);
        return z1Var != null && z1Var.mo74466a();
    }
}
