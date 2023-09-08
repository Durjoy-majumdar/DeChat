package com.tencent.p014mm.plugin.voip.p475ui;

import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.voip.ui.m0 */
public class C106466m0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f318010d;

    /* renamed from: e */
    public final /* synthetic */ C106453j0 f318011e;

    /* renamed from: com.tencent.mm.plugin.voip.ui.m0$a */
    public class C106467a implements Runnable {
        public C106467a() {
        }

        public void run() {
            C106466m0 m0Var = C106466m0.this;
            C106453j0 j0Var = m0Var.f318011e;
            VoipViewFragment voipViewFragment = j0Var.f317987a;
            if (voipViewFragment != null && !j0Var.f317990d) {
                voipViewFragment.setVoicePlayDevice(m0Var.f318010d);
            }
        }
    }

    public C106466m0(C106453j0 j0Var, int i) {
        this.f318011e = j0Var;
        this.f318010d = i;
    }

    public void run() {
        ((C119157j) C119157j.f356862d).mo183895z(new C106467a());
    }
}
