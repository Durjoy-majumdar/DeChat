package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.os.Bundle;
import com.tencent.p014mm.autogen.events.JsApiOfflineUserBindQueryResultCallBackEvent;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1575a4;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.z3 */
public class C68622z3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ JsApiOfflineUserBindQueryResultCallBackEvent f197102d;

    /* renamed from: e */
    public final /* synthetic */ Bundle f197103e;

    /* renamed from: f */
    public final /* synthetic */ C1256g f197104f;

    public C68622z3(C1575a4.C1576a aVar, JsApiOfflineUserBindQueryResultCallBackEvent jsApiOfflineUserBindQueryResultCallBackEvent, Bundle bundle, C1256g gVar) {
        this.f197102d = jsApiOfflineUserBindQueryResultCallBackEvent;
        this.f197103e = bundle;
        this.f197104f = gVar;
    }

    public void run() {
        Log.m105925i("MicroMsg.IPCLoadPayOfflineUserBindQuery", "event.data.callback，result ：%s", this.f197102d.f193680e.f193693a);
        this.f197103e.putString("errMsg", this.f197102d.f193680e.f193693a);
        this.f197104f.mo894a(this.f197103e);
    }
}
