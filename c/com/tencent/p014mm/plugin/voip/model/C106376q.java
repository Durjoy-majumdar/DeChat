package com.tencent.p014mm.plugin.voip.model;

import com.tencent.p014mm.plugin.voip.model.C106377r;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: com.tencent.mm.plugin.voip.model.q */
public class C106376q implements C106377r.C106390k {

    /* renamed from: a */
    public final /* synthetic */ C106377r f317449a;

    public C106376q(C106377r rVar) {
        this.f317449a = rVar;
    }

    /* renamed from: a */
    public void mo152686a() {
        Log.m105924i("MicroMsg.Voip.VoipContext", "onStartConnectRelay ok");
        C106377r rVar = this.f317449a;
        rVar.getClass();
        MMHandlerThread.postToMainThread(new C106397v(rVar));
        C106377r rVar2 = this.f317449a;
        rVar2.getClass();
        MMHandlerThread.postToMainThread(new C106399w(rVar2));
    }
}
