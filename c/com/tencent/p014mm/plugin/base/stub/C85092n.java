package com.tencent.p014mm.plugin.base.stub;

import cd3.C39945b;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75576f4;
import eb0.C97625j3;

/* renamed from: com.tencent.mm.plugin.base.stub.n */
public class C85092n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C39945b f247945d;

    /* renamed from: com.tencent.mm.plugin.base.stub.n$a */
    public class C85093a implements C75576f4.C75578b {
        public C85093a() {
        }

        /* renamed from: a */
        public void mo57753a(C114770g gVar) {
            Log.m105924i("MicroMsg.WXCommProvider", "checkIsLogin() onSceneEnd()");
            C85092n.this.f247945d.mo62559a();
        }
    }

    public C85092n(WXCommProvider wXCommProvider, C39945b bVar) {
        this.f247945d = bVar;
    }

    public void run() {
        try {
            if (C97625j3.m125811a()) {
                C97625j3.m125815e().mo123460f(new C75576f4(new C85093a(), (String) null));
            }
        } catch (Exception unused) {
            Log.m105920e("MicroMsg.WXCommProvider", "exception in NetSceneLocalProxy");
            this.f247945d.mo62559a();
        }
    }
}
