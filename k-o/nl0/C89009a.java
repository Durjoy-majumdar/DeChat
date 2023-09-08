package nl0;

import android.app.Activity;
import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82910q;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j32.C33506c;
import java.util.HashMap;
import org.json.JSONObject;
import p169ib.C87685a;
import p547hb.C87464c;

/* renamed from: nl0.a */
public class C89009a extends C82268c<C81925i2> {
    private static final int CTRL_INDEX = 424;
    private static final String NAME = "openRedPacket";

    /* renamed from: nl0.a$a */
    public static class C89010a extends C82910q {
        public C89010a(C82870p pVar, C81925i2 i2Var, C83780d1 d1Var, JSONObject jSONObject, int i) {
            super(pVar, i2Var, d1Var, jSONObject, i);
        }

        /* renamed from: a */
        public boolean mo115152a(Activity activity, JSONObject jSONObject, int i) {
            String appId = this.f242395a.getAppId();
            String optString = jSONObject.optString("redPacketId", (String) null);
            if (Util.isNullOrNil(appId) || Util.isNullOrNil(optString)) {
                Log.m105925i("MicroMsg.JsApiOpenRedPacket", "GetLuckMoneyRequest.launch appId = [%s] sendId = [%s]", appId, optString);
                return false;
            }
            ((C33506c) C86312j.m106911c(C33506c.class)).mo59176B8(activity, optString, appId, i);
            return true;
        }

        /* renamed from: b */
        public void mo115153b(int i, String str) {
            Log.m105925i("MicroMsg.JsApiOpenRedPacket", "onError errCode: %d,errMsg: %s", Integer.valueOf(i), str);
            HashMap hashMap = new HashMap();
            hashMap.put("errCode", Integer.valueOf(i));
            this.f242395a.mo109647a(this.f242398d, this.f242399e.mo115112m(str, hashMap));
        }

        /* renamed from: c */
        public void mo115154c(int i, Intent intent) {
            Log.m105924i("MicroMsg.JsApiOpenRedPacket", "GetLuckMoneyRequest.onResult");
            HashMap hashMap = new HashMap();
            hashMap.put("errCode", 0);
            this.f242395a.mo109647a(this.f242398d, this.f242399e.mo115112m("ok", hashMap));
        }
    }

    /* renamed from: t */
    public boolean mo1769t() {
        return true;
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        if (jSONObject == null) {
            Log.m105924i("MicroMsg.JsApiOpenRedPacket", "data is null");
            HashMap hashMap = new HashMap();
            hashMap.put("errCode", -1);
            i2Var.mo109647a(i, mo115112m("fail:system error {{data is null}}", hashMap));
        } else if (Util.isNullOrNil(jSONObject.optString("redPacketId", (String) null))) {
            Log.m105924i("MicroMsg.JsApiOpenRedPacket", "redPacketId is nil");
            HashMap hashMap2 = new HashMap();
            hashMap2.put("errCode", -1);
            i2Var.mo109647a(i, mo115112m("fail:system error {{redPacketId is nil}}", hashMap2));
        } else {
            C83780d1 l0 = i2Var.mo114341l0();
            if (l0 != null) {
                C87464c cVar = (C87464c) l0.mo116150E0(C87464c.class);
                if (cVar != null) {
                    cVar.mo111266l(true, true, (C87685a) null);
                }
                new C89010a(this, i2Var, l0, jSONObject, i).mo115155d();
                return;
            }
            Log.m105924i("MicroMsg.JsApiOpenRedPacket", "associated page view is null!!");
            HashMap hashMap3 = new HashMap();
            hashMap3.put("errCode", -1);
            i2Var.mo109647a(i, mo115112m("fail:system error {{associated page view is null}}", hashMap3));
        }
    }
}
