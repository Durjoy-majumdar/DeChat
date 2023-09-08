package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105724z;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.k1 */
public class C105651k1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C105724z.C105728e f314145d;

    public C105651k1(C105724z.C105728e eVar, int i) {
        this.f314145d = eVar;
    }

    public void run() {
        C105724z zVar = C105724z.this;
        if (zVar.f314401n != 1) {
            Log.m105928w("MicroMsg.Multitalk.ILinkService", "hy: current not in room");
            C105724z.this.getClass();
            C105724z zVar2 = C105724z.this;
            zVar2.f314401n = 0;
            zVar2.f314371V = false;
            zVar2.mo150607q(2000);
            return;
        }
        zVar.getClass();
        C105724z.this.getClass();
        C105724z zVar3 = C105724z.this;
        zVar3.f314372V0 = false;
        zVar3.f314374W0 = false;
        zVar3.f314401n = 0;
        zVar3.f314371V = false;
        zVar3.mo150607q(2000);
    }
}
