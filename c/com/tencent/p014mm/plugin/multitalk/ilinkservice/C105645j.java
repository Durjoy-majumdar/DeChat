package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.j */
public class C105645j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f314138d;

    /* renamed from: e */
    public final /* synthetic */ C105608d f314139e;

    public C105645j(C105608d dVar, String str) {
        this.f314139e = dVar;
        this.f314138d = str;
    }

    public void run() {
        if (this.f314139e.f314075a != null) {
            Log.m105925i("MicroMsg.Multitalk.ILink2MtCallBack", "onOtherDeviceHandle errorcode:%d", -1400);
            this.f314139e.f314075a.mo150631H(-1400, this.f314138d);
        }
    }
}
