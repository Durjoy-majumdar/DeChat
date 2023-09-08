package com.tencent.p014mm.plugin.voip.p475ui;

import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.voip.ui.l0 */
public class C106464l0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C106453j0 f318008d;

    /* renamed from: com.tencent.mm.plugin.voip.ui.l0$a */
    public class C106465a implements Runnable {
        public C106465a() {
        }

        public void run() {
            C106453j0 j0Var = C106464l0.this.f318008d;
            VoipViewFragment voipViewFragment = j0Var.f317987a;
            if (voipViewFragment != null && !j0Var.f317990d) {
                voipViewFragment.mo152989d();
            }
        }
    }

    public C106464l0(C106453j0 j0Var) {
        this.f318008d = j0Var;
    }

    public void run() {
        ((C119157j) C119157j.f356862d).mo183895z(new C106465a());
    }
}
