package com.tencent.p014mm.plugin.voip.p475ui;

import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.voip.ui.k0 */
public class C106461k0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C106453j0 f318005d;

    /* renamed from: com.tencent.mm.plugin.voip.ui.k0$a */
    public class C106462a implements Runnable {
        public C106462a() {
        }

        public void run() {
            C106461k0.this.f318005d.mo153005a(true);
        }
    }

    public C106461k0(C106453j0 j0Var) {
        this.f318005d = j0Var;
    }

    public void run() {
        VoipViewFragment voipViewFragment = this.f318005d.f317987a;
        if (voipViewFragment != null && voipViewFragment.mo152988c()) {
            C119179t tVar = C119157j.f356862d;
            C106462a aVar = new C106462a();
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183892w(aVar, 2000, false);
        }
    }
}
