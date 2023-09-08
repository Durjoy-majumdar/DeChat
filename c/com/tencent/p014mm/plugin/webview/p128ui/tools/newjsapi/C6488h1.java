package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ht1.C60216z4;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.h1 */
public final class C6488h1<T> implements C60216z4.C8821a {

    /* renamed from: a */
    public final /* synthetic */ C1256g<IPCInteger> f23574a;

    public C6488h1(C1256g<IPCInteger> gVar) {
        this.f23574a = gVar;
    }

    /* renamed from: a */
    public void mo6382a(Object obj) {
        Integer num = (Integer) obj;
        Log.m105924i("MicroMsg.JsApiOpenFinderLiveGetTicket", "onCallback#failCallback, errCode: " + num);
        C1256g<IPCInteger> gVar = this.f23574a;
        if (gVar != null) {
            C87412m.m108593f(num, "errCode");
            gVar.mo894a(new IPCInteger(num.intValue()));
        }
    }
}
