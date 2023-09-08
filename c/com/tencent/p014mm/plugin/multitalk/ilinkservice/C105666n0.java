package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C47350c;
import pe3.C47465a;
import te3.os4;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.n0 */
public class C105666n0 implements C40324j.C40326a {

    /* renamed from: a */
    public final /* synthetic */ C105598b f314181a;

    public C105666n0(C105724z zVar, C105598b bVar) {
        this.f314181a = bVar;
    }

    /* renamed from: a */
    public void mo288a(int i, int i2, String str, C47350c cVar) {
        C47465a aVar;
        Log.m105925i("MicroMsg.Multitalk.ILinkService", "on invite result: %d, %d, %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (i == 0 && i2 == 0 && (aVar = cVar.f127056b.f127083a) != null) {
            int i3 = ((os4) aVar).f139355d;
            this.f314181a.mo150477a(i, i2, str, Integer.valueOf(i3));
            Log.m105925i("MicroMsg.Multitalk.ILinkService", "checkMultiTalkSDKMode svr sdkmode: %d", Integer.valueOf(i3));
            return;
        }
        Log.m105920e("MicroMsg.Multitalk.ILinkService", "hy: getsdkmode fail, errType:" + i + ",errCode:" + i2);
    }
}
