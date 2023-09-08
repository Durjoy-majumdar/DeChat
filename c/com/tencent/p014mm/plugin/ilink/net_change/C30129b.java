package com.tencent.p014mm.plugin.ilink.net_change;

import com.tencent.ilink.Context;
import com.tencent.p014mm.network.C29060q;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.ilink.net_change.b */
public final class C30129b implements C30128a {

    /* renamed from: a */
    public final C30130a f81464a = new C30130a();

    /* renamed from: com.tencent.mm.plugin.ilink.net_change.b$a */
    public static final class C30130a extends C29060q.C29061a {
        public void onNetworkChange(int i) {
            Log.m105924i("MicroMsg.NetworkChangeMainProcessImpl", "iLink onNetworkChange:" + i);
            Context.getInstance().networkChanged();
        }
    }

    /* renamed from: a */
    public void mo57166a() {
        Log.m105924i("MicroMsg.NetworkChangeMainProcessImpl", "startListen: ");
        C86709a0.m107529k().mo121126a(this.f81464a);
    }
}
