package com.tencent.p014mm.plugin.base.stub;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.plugin.base.stub.WXCommProvider;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75576f4;

/* renamed from: com.tencent.mm.plugin.base.stub.m */
public class C85091m implements C75576f4.C75578b {

    /* renamed from: a */
    public final /* synthetic */ WXCommProvider.C85079f f247944a;

    public C85091m(WXCommProvider.C85079f fVar) {
        this.f247944a = fVar;
    }

    /* renamed from: a */
    public void mo57753a(C114770g gVar) {
        Log.m105925i("MicroMsg.WXCommProvider", "checkIsLogin onSceneEnd() hasLogin:%s", Boolean.valueOf(WXCommProvider.f247888o));
        this.f247944a.setResultFinish(Boolean.TRUE);
    }
}
