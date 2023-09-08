package sl0;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.FileReaderHelper;
import di3.C86312j;
import java.util.HashMap;
import ob0.C47350c;
import org.json.JSONException;
import org.json.JSONObject;
import te3.C49491fz3;
import te3.C90409ez3;

/* renamed from: sl0.p */
public class C90227p extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 507;
    public static final String NAME = "secureTunnel";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        Intent intent;
        Bundle extras;
        JSONObject jSONObject2 = jSONObject;
        int i2 = i;
        C81925i2 i2Var = (C81925i2) fVar;
        Log.m105924i("MicroMsg.JsApiSecureTunnel", "start secureTunnel");
        C13711n nVar = new C13711n(this, i2Var, i2);
        C83780d1 l0 = i2Var.mo114341l0();
        String Q0 = l0 != null ? l0.mo116162Q0() : null;
        String appId = i2Var.getAppId();
        int i3 = 1000;
        int i4 = 0;
        Activity o0 = i2Var.mo114344o0();
        String str = "";
        if (!(o0 == null || (intent = o0.getIntent()) == null || (extras = intent.getExtras()) == null)) {
            Object obj = extras.get("key_appbrand_stat_object");
            if (obj instanceof AppBrandStatObject) {
                i3 = ((AppBrandStatObject) obj).f245533f;
            }
            Object obj2 = extras.get("key_appbrand_init_config");
            if (obj2 instanceof AppBrandInitConfigWC) {
                AppBrandInitConfigWC appBrandInitConfigWC = (AppBrandInitConfigWC) obj2;
                str = appBrandInitConfigWC.f234839s;
                i4 = appBrandInitConfigWC.f234802F;
            }
        }
        try {
            String string = jSONObject2.getString("type");
            if (Util.isNullOrNil(string)) {
                Log.m105920e("MicroMsg.JsApiSecureTunnel", "securetunnel type nil");
                i2Var.mo109647a(i2, mo115109j("fail"));
                return;
            }
            String string2 = jSONObject2.getString("reqbuf");
            if (Util.isNullOrNil(string2)) {
                Log.m105920e("MicroMsg.JsApiSecureTunnel", "securetunnel reqbuf nil");
                i2Var.mo109647a(i2, mo115109j("fail"));
                return;
            }
            String string3 = jSONObject2.getString(FileReaderHelper.OPEN_FILE_FROM_CMD);
            if (Util.isNullOrNil(string3)) {
                Log.m105920e("MicroMsg.JsApiSecureTunnel", "securetunnel cmd nil");
                i2Var.mo109647a(i2, mo115109j("fail"));
                return;
            }
            try {
                if (string.equals("wxpay")) {
                    Log.m105924i("MicroMsg.JsApiSecureTunnel", "secureTunnel doscene");
                    C47350c.C47352b bVar = new C47350c.C47352b();
                    try {
                        bVar.f127066a = new C90409ez3();
                        bVar.f127067b = new C49491fz3();
                        bVar.f127068c = "/cgi-bin/mmpay-bin/securetunnel";
                        bVar.f127069d = 2632;
                        if (jSONObject2.has("timeout")) {
                            bVar.f127074i = jSONObject2.getInt("timeout");
                        }
                        C47350c a = bVar.mo72403a();
                        C90409ez3 ez32 = (C90409ez3) a.f127055a.f127080a;
                        ez32.f259504g = string2;
                        ez32.f259501d = string3;
                        ez32.f259503f = Q0;
                        ez32.f259502e = appId;
                        ez32.f259505h = i3;
                        ez32.f259506i = 1;
                        ez32.f259507j = str;
                        ez32.f259508n = i4;
                        ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(a, new C90226o(this, nVar));
                    } catch (JSONException unused) {
                        i2Var = i2Var;
                        i2 = i;
                        Log.m105920e("MicroMsg.JsApiSecureTunnel", "mini app securetunnel parameter error");
                        i2Var.mo109647a(i2, mo115109j("fail"));
                    }
                } else {
                    C81925i2 i2Var2 = i2Var;
                    Log.m105924i("MicroMsg.JsApiSecureTunnel", "secureTunnel callback fail: invalid type");
                    HashMap hashMap = new HashMap();
                    hashMap.put("err_desc", "invalid type");
                    i2Var = i2Var2;
                    i2 = i;
                    i2Var.mo109647a(i2, mo115112m("fail", hashMap));
                }
            } catch (JSONException unused2) {
                i2 = i;
                Log.m105920e("MicroMsg.JsApiSecureTunnel", "mini app securetunnel parameter error");
                i2Var.mo109647a(i2, mo115109j("fail"));
            }
        } catch (JSONException unused3) {
        }
    }
}
