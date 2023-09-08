package com.tencent.p014mm.plugin.remittance.p098ui;

import v53.C78348k0;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.remittance.ui.s1 */
public class C70946s1 implements C78348k0.C78349a {

    /* renamed from: a */
    public final /* synthetic */ RemittanceUI f205392a;

    /* renamed from: com.tencent.mm.plugin.remittance.ui.s1$a */
    public class C70947a implements Runnable {
        public C70947a() {
        }

        public void run() {
            RemittanceUI remittanceUI = C70946s1.this.f205392a;
            int i = RemittanceUI.f205196M1;
            remittanceUI.mo97514n8();
            C70946s1.this.f205392a.mo97455m8();
        }
    }

    public C70946s1(RemittanceUI remittanceUI) {
        this.f205392a = remittanceUI;
    }

    /* renamed from: a */
    public void mo97595a() {
        ((C119157j) C119157j.f356862d).mo183895z(new C70947a());
    }
}
