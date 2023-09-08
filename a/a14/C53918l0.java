package a14;

import a14.C53901i0;
import rx3.C90107a;
import wx3.C66212f;

/* renamed from: a14.l0 */
public final class C53918l0 {
    /* renamed from: a */
    public static final void m60515a(C66212f fVar, Throwable th) {
        try {
            C53901i0 i0Var = (C53901i0) fVar.get(C53901i0.C39480a.f106019d);
            if (i0Var != null) {
                i0Var.handleException(fVar, th);
            } else {
                C53909k0.m60490a(fVar, th);
            }
        } catch (Throwable th4) {
            if (th != th4) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th4);
                C90107a.m112735a(runtimeException, th);
                th = runtimeException;
            }
            C53909k0.m60490a(fVar, th);
        }
    }
}
