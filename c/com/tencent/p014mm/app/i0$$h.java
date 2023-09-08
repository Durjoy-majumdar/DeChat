package com.tencent.p014mm.app;

import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import h81.C32735h;

/* renamed from: com.tencent.mm.app.i0$$h */
public class i0$$h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C80600i0 f235812d;

    public i0$$h(C80600i0 i0Var) {
        this.f235812d = i0Var;
    }

    public void run() {
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_crash_push_double_upload, false)) {
            this.f235812d.mo112318c(MMApplicationContext.getContext());
            C80600i0 i0Var = this.f235812d;
            i0Var.f235808f.postDelayed(i0Var.f235809g, 3600000);
        }
    }
}
