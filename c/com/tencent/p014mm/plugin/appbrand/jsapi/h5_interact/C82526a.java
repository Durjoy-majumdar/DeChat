package com.tencent.p014mm.plugin.appbrand.jsapi.h5_interact;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C81682d;
import com.tencent.p014mm.plugin.appbrand.ipc.MMToClientEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import kr0.C88267e;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.h5_interact.a */
public class C82526a implements MMToClientEvent.C81947d {
    /* renamed from: a */
    public void mo22085a(Object obj) {
        AppBrandRuntimeWC b;
        if (obj instanceof SendDataToMiniProgramFromH5Event) {
            SendDataToMiniProgramFromH5Event sendDataToMiniProgramFromH5Event = (SendDataToMiniProgramFromH5Event) obj;
            String str = sendDataToMiniProgramFromH5Event.f241627d;
            String str2 = sendDataToMiniProgramFromH5Event.f241628e;
            int i = sendDataToMiniProgramFromH5Event.f241629f;
            if (!Util.isNullOrNil(str) && (b = C81682d.m100222b(str)) != null && b.f238116N) {
                try {
                    JSONObject put = new JSONObject().put("data", str2).put("webviewId", String.valueOf(i));
                    C82528c cVar = new C82528c();
                    cVar.mo115194p((C88267e) b.f238150p);
                    cVar.f242407f = put.toString();
                    cVar.mo115158h();
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AppBrand.EventOnH5Data", "dispatch ex = %s", e);
                }
            }
        }
    }
}
