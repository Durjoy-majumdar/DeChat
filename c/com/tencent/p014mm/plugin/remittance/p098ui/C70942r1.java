package com.tencent.p014mm.plugin.remittance.p098ui;

import v53.C78348k0;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.remittance.ui.r1 */
public class C70942r1 implements C78348k0.C78349a {

    /* renamed from: a */
    public final /* synthetic */ RemittanceUI f205388a;

    /* renamed from: com.tencent.mm.plugin.remittance.ui.r1$a */
    public class C70943a implements Runnable {
        public C70943a() {
        }

        public void run() {
            RemittanceUI remittanceUI = C70942r1.this.f205388a;
            int i = RemittanceUI.f205196M1;
            remittanceUI.mo97514n8();
            C70942r1.this.f205388a.mo97455m8();
        }
    }

    public C70942r1(RemittanceUI remittanceUI) {
        this.f205388a = remittanceUI;
    }

    /* renamed from: a */
    public void mo97595a() {
        ((C119157j) C119157j.f356862d).mo183895z(new C70943a());
    }
}
