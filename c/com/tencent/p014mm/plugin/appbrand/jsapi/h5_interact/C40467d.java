package com.tencent.p014mm.plugin.appbrand.jsapi.h5_interact;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40327m;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.pluginsdk.model.C44594n1;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import kr0.C88267e;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.h5_interact.d */
public class C40467d extends C82268c<C88267e> {
    private static final int CTRL_INDEX = 459;
    private static final String NAME = "sendDataToH5";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.h5_interact.d$a */
    public static final class C40468a implements C80883e<SendDataToH5FromMiniProgramEvent, IPCVoid> {
        private C40468a() {
        }

        public void invoke(Object obj, C1256g gVar) {
            SendDataToH5FromMiniProgramEvent sendDataToH5FromMiniProgramEvent = (SendDataToH5FromMiniProgramEvent) obj;
            if (sendDataToH5FromMiniProgramEvent != null) {
                sendDataToH5FromMiniProgramEvent.publish();
            }
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C88267e eVar = (C88267e) fVar;
        Class<C40468a> cls = C40468a.class;
        Class cls2 = C40327m.class;
        if (!jSONObject.has("webviewId")) {
            eVar.mo109647a(i, mo115109j("fail:invalid data"));
            Log.m105920e("MicroMsg.AppBrand.JsApiSendDataToH5", "invoke with nil webviewId");
            return;
        }
        String appId = eVar.getAppId();
        int optInt = jSONObject.optInt("webviewId");
        String optString = jSONObject.optString("data");
        SendDataToH5FromMiniProgramEvent sendDataToH5FromMiniProgramEvent = new SendDataToH5FromMiniProgramEvent();
        sendDataToH5FromMiniProgramEvent.f108754d = appId;
        sendDataToH5FromMiniProgramEvent.f108755e = optString;
        sendDataToH5FromMiniProgramEvent.f108756f = optInt;
        if (C44594n1.m49046b()) {
            ((C40327m) C86312j.m106911c(cls2)).mo63019mS(sendDataToH5FromMiniProgramEvent, cls, (C1256g) null);
        } else {
            ((C40327m) C86312j.m106911c(cls2)).X80(sendDataToH5FromMiniProgramEvent, cls, (C1256g) null);
        }
        eVar.mo109647a(i, mo115109j("ok"));
    }
}
