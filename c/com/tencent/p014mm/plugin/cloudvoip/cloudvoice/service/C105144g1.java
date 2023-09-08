package com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service;

import java.util.TimerTask;

/* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.g1 */
public class C105144g1 extends TimerTask {

    /* renamed from: d */
    public final /* synthetic */ C105148h1 f312194d;

    /* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.g1$a */
    public class C105145a implements Runnable {
        public C105145a() {
        }

        public void run() {
            C105144g1.this.f312194d.getClass();
        }
    }

    public C105144g1(C105148h1 h1Var) {
        this.f312194d = h1Var;
    }

    public void run() {
        this.f312194d.f312207t.post(new C105145a());
    }
}
