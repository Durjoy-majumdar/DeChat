package hs1;

import gy3.C8479f0;
import kotlin.Result;
import qo3.w$$d;
import wx3.C15601d;

/* renamed from: hs1.l */
public final class C8747l implements w$$d {

    /* renamed from: a */
    public final /* synthetic */ C8479f0<C15601d<Boolean>> f28028a;

    public C8747l(C8479f0<C15601d<Boolean>> f0Var) {
        this.f28028a = f0Var;
    }

    public final void onDismiss() {
        C15601d dVar = (C15601d) this.f28028a.f27484d;
        if (dVar != null) {
            Result.Companion companion = Result.Companion;
            dVar.resumeWith(Result.m168114constructorimpl(Boolean.FALSE));
        }
        this.f28028a.f27484d = null;
    }
}
