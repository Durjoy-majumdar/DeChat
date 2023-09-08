package hs1;

import gy3.C8479f0;
import kotlin.Result;
import qo3.w$$d;
import wx3.C15601d;

/* renamed from: hs1.s */
public final class C8754s implements w$$d {

    /* renamed from: a */
    public final /* synthetic */ C8479f0<C15601d<Boolean>> f28037a;

    public C8754s(C8479f0<C15601d<Boolean>> f0Var) {
        this.f28037a = f0Var;
    }

    public final void onDismiss() {
        C15601d dVar = (C15601d) this.f28037a.f27484d;
        if (dVar != null) {
            Result.Companion companion = Result.Companion;
            dVar.resumeWith(Result.m168114constructorimpl(Boolean.FALSE));
        }
        this.f28037a.f27484d = null;
    }
}
