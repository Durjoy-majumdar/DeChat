package com.tencent.p014mm.plugin.appbrand.jsapi.share;

import android.content.Intent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.plugin.appbrand.C83727p2;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.JsApiShareAppMessageBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import java.util.Map;
import kr0.C88267e;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.h */
public class C82965h extends JsApiShareAppMessageBase<C82966a> {
    public static final int CTRL_INDEX = 589;
    public static final String NAME = "shareAppMessageForFakeNative";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.h$a */
    public static class C82966a extends JsApiShareAppMessageBase.C82939f {

        /* renamed from: M */
        public int f242594M;

        /* renamed from: N */
        public String f242595N;

        /* renamed from: O */
        public String f242596O;

        /* renamed from: P */
        public String f242597P;
    }

    /* renamed from: A */
    public void mo115200A(SendAppMessageTask sendAppMessageTask, String str, String str2, boolean z, C88267e eVar, JsApiShareAppMessageBase.C82939f fVar) {
        C82966a aVar = (C82966a) fVar;
        super.mo115200A(sendAppMessageTask, str, str2, z, eVar, aVar);
        if (sendAppMessageTask.f242504B == 1) {
            sendAppMessageTask.f242504B = 2;
            sendAppMessageTask.f242505C = aVar.f242594M;
            sendAppMessageTask.f242503A = aVar.f242595N;
        }
        sendAppMessageTask.f242506D = aVar.f242596O;
        sendAppMessageTask.f242507E = aVar.f242597P;
    }

    /* renamed from: B */
    public Map mo115201B(JsApiShareAppMessageBase.C82939f fVar, SendAppMessageTask sendAppMessageTask, String str) {
        Map B = super.mo115201B((C82966a) fVar, sendAppMessageTask, str);
        if (B == null) {
            B = new HashMap(1);
        }
        B.put("shareUsrs", Util.stringsToList(str.split(",")));
        return B;
    }

    /* renamed from: H */
    public C82966a mo115210z(C88267e eVar, JSONObject jSONObject) {
        C82966a aVar = (C82966a) super.mo115210z(eVar, jSONObject);
        int optInt = jSONObject.optInt("bizType", 2);
        aVar.f242594M = optInt;
        if (C68070l.C68071a.m80416b(optInt)) {
            String optString = jSONObject.optString("defaultHintUrl");
            if (Util.isNullOrNil(optString)) {
                optString = C83727p2.m102773c(eVar.getAppId());
            }
            aVar.f242458A = optString;
            aVar.f242595N = jSONObject.optString("tailLang", "");
            aVar.f242596O = jSONObject.optString("bizSourceName", "");
            aVar.f242597P = jSONObject.optString("bizSourceIconUrl", "");
            aVar.f242466I.put("biz", Integer.valueOf(aVar.f242594M));
            aVar.f242466I.put("tail_lang", aVar.f242595N);
            aVar.f242466I.put("icon_url", aVar.f242472c.f261063f);
            aVar.f242466I.put("nickname", aVar.f242472c.f261061d);
            return aVar;
        }
        Log.m105920e("MicroMsg.JsApiShareAppMessageForFakeNative", "share app message fail, biz is invalid.");
        throw new JsApiShareAppMessageBase.C82938e("biz is invalid");
    }

    /* renamed from: w */
    public JsApiShareAppMessageBase.C82939f mo115207w() {
        return new C82966a();
    }

    /* renamed from: x */
    public void mo115208x(Intent intent, JsApiShareAppMessageBase.C82939f fVar, C88267e eVar) {
        C82966a aVar = (C82966a) fVar;
        Log.m105924i("MicroMsg.JsApiShareAppMessageForFakeNative", "fillIntentForForwardToWeWorkWhenSelectContactsIfNeed, forbid");
        intent.putExtra("selectionconversationui_forbid_send_to_wework", true);
    }

    /* renamed from: y */
    public void mo115209y(Intent intent, JsApiShareAppMessageBase.C82939f fVar) {
        super.mo115209y(intent, (C82966a) fVar);
        intent.putExtra("select_is_ret", false);
    }
}
