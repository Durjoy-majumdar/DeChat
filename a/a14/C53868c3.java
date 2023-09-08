package a14;

import wx3.C66212f;

/* renamed from: a14.c3 */
public final class C53868c3 extends C53896h0 {

    /* renamed from: e */
    public static final C53868c3 f151111e = new C53868c3();

    /* renamed from: S */
    public void mo74497S(C66212f fVar, Runnable runnable) {
        C53888f3 f3Var = (C53888f3) fVar.get(C53888f3.f151136e);
        if (f3Var != null) {
            f3Var.f151137d = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
