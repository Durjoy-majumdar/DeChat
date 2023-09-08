package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.k */
public class C105649k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C105608d f314143d;

    public C105649k(C105608d dVar) {
        this.f314143d = dVar;
    }

    public void run() {
        if (this.f314143d.f314075a != null) {
            Log.m105925i("MicroMsg.Multitalk.ILink2MtCallBack", "onJoinErrOtherDevice errorcode:%d", -14256);
            this.f314143d.f314075a.mo150631H(-14256, (Object) null);
        }
    }
}
