package com.tencent.p014mm.plugin.appbrand.jsapi.msgchannel;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82926s;
import com.tencent.p014mm.plugin.appbrand.message.WxaAppMsgChannel;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONStringer;
import wq0.C91062d;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.msgchannel.e */
public class C40472e extends C82926s {
    public static final int CTRL_INDEX = -2;
    public static final String NAME = "onReceiveCacheMsgChannelBatch";

    public C40472e() {
        C91062d.m114234a(NAME);
    }

    /* renamed from: s */
    public void mo63227s(C82381f fVar, ArrayList<WxaAppMsgChannel> arrayList) {
        Log.m105925i("MicroMsg.OnReceiveCacheMsgChannelBatchJsApiEvent", "dispatch msg channel to web ， msgChannelList size:%d", Integer.valueOf(arrayList.size()));
        HashMap hashMap = new HashMap();
        JSONStringer jSONStringer = new JSONStringer();
        try {
            jSONStringer.array();
            Iterator<WxaAppMsgChannel> it = arrayList.iterator();
            while (it.hasNext()) {
                WxaAppMsgChannel next = it.next();
                jSONStringer.object();
                jSONStringer.key("sendTime");
                jSONStringer.value(next.f108805j);
                jSONStringer.key("msgId");
                jSONStringer.value(next.f108799d);
                jSONStringer.key("msgType");
                jSONStringer.value((long) next.f108803h);
                jSONStringer.key("msgContent");
                jSONStringer.value(next.f108804i);
                jSONStringer.endObject();
            }
            jSONStringer.endArray();
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.OnReceiveCacheMsgChannelBatchJsApiEvent", e, "dispatch", new Object[0]);
        }
        hashMap.put("cacheList", jSONStringer.toString());
        mo115194p(fVar);
        Log.m105924i("MicroMsg.OnReceiveCacheMsgChannelBatchJsApiEvent", "dispatch wxa msg channel");
        mo115165o(hashMap);
        mo115158h();
    }
}
