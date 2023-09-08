package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.ipc.MMToClientEvent;
import com.tencent.p014mm.plugin.appbrand.jsapi.EventLocationBackgroundStateChanged;
import com.tencent.p014mm.plugin.appbrand.jsapi.msgchannel.C82828f;
import com.tencent.p014mm.plugin.appbrand.jsapi.openvoice.AppBrandVoIP1v1FloatBallEvent;
import com.tencent.p014mm.plugin.appbrand.message.WxaAppMsgChannel;
import com.tencent.p014mm.sdk.platformtools.Log;
import em0.C86574t;
import java.util.HashMap;
import kr0.C88267e;
import li0.C88514d;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC$$j */
public class AppBrandRuntimeWC$$j implements MMToClientEvent.C81947d {

    /* renamed from: a */
    public final /* synthetic */ AppBrandRuntimeWC f238325a;

    public AppBrandRuntimeWC$$j(AppBrandRuntimeWC appBrandRuntimeWC) {
        this.f238325a = appBrandRuntimeWC;
    }

    /* renamed from: a */
    public void mo22085a(Object obj) {
        if (obj instanceof EventLocationBackgroundStateChanged) {
            if (!((EventLocationBackgroundStateChanged) obj).f240381d) {
                Log.m105925i("MicroMsg.AppBrandRuntimeWC", "locationBackgroundStateChanged, not listening, appId[%s]", this.f238325a.f238147j);
                this.f238325a.f238113K.f255667a.mo122987s(C88514d.C88522g.ON_STOP_BACKGROUND_LOCATION_LISTENING, (Object) null);
            }
        } else if (obj instanceof WxaAppMsgChannel) {
            Log.m105925i("MicroMsg.AppBrandRuntimeWC", "onCustomDataNotify, appId[%s], WxaAppMsgChannel msg", this.f238325a.f238147j);
            C82828f fVar = new C82828f();
            WxaAppMsgChannel wxaAppMsgChannel = (WxaAppMsgChannel) obj;
            Log.m105925i("MicroMsg.onReceiveMsgChannelJsApiEvent", "dispatch msg channel to web ， msgContent:%s", wxaAppMsgChannel.f108804i);
            HashMap hashMap = new HashMap();
            hashMap.put("msgId", wxaAppMsgChannel.f108799d);
            hashMap.put("sendTime", Long.valueOf(wxaAppMsgChannel.f108805j));
            hashMap.put("msgType", Integer.valueOf(wxaAppMsgChannel.f108803h));
            hashMap.put("msgContent", wxaAppMsgChannel.f108804i);
            fVar.mo115194p((C88267e) this.f238325a.f238150p);
            Log.m105924i("MicroMsg.onReceiveMsgChannelJsApiEvent", "dispatch wxa msg channel");
            fVar.mo115165o(hashMap);
            fVar.mo115158h();
        } else if (obj instanceof AppBrandVoIP1v1FloatBallEvent) {
            Log.m105925i("MicroMsg.AppBrandRuntimeWC", "onCustomDataNotify, appId[%s], AppBrandVoIP1v1FloatBallEvent msg", this.f238325a.f238147j);
            if (((AppBrandVoIP1v1FloatBallEvent) obj).f242313d == 1) {
                C86574t.m107378b();
            }
        }
    }
}
