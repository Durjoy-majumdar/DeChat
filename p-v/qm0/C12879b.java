package qm0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import kr0.C88267e;
import org.json.JSONObject;
import p156gj.C87203t;

/* renamed from: qm0.b */
public final class C12879b extends C82268c<C88267e> {
    public static final int CTRL_INDEX = -2;
    public static final String NAME = "setSecuritySnapshotStrategy";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        char c;
        int i2;
        int i3;
        int i4;
        int i5;
        JSONObject jSONObject2 = jSONObject;
        int i6 = i;
        C88267e eVar = (C88267e) fVar;
        C87412m.m108594g(eVar, "service");
        C87412m.m108594g(jSONObject2, "data");
        boolean optBoolean = jSONObject2.optBoolean("enabledSnapshot", false);
        long optLong = jSONObject2.optLong("snapshotIntervalMillis", 2000);
        int optInt = jSONObject2.optInt("shortEdge", 300);
        Log.m105924i("MicroMsg.AppBrand.JsApiSetSecuritySnapshotStrategy", "invoke(" + eVar.getAppId() + ") data:" + jSONObject2);
        if (!optBoolean) {
            Log.m105924i("MicroMsg.AppBrand.JsApiSetSecuritySnapshotStrategy", "invoke(" + eVar.getAppId() + ") call stop()");
            C89717d Q1 = eVar.getRuntime().mo113186Q1();
            C87412m.m108593f(Q1, "service.runtime.securitySnapshotContext");
            c = 1;
            Q1.mo124025b(true);
        } else if (!C87203t.m108279o()) {
            Log.m105920e("MicroMsg.AppBrand.JsApiSetSecuritySnapshotStrategy", "not support in 32bit device");
            if (BuildInfo.DEBUG) {
                i5 = 0;
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "fail forbidden");
            } else {
                i5 = 0;
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("errno", i5);
            } catch (Exception e) {
                Exception exc = e;
                Object[] objArr = new Object[1];
                objArr[i5] = exc;
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", objArr);
            }
            eVar.mo109647a(i6, mo115115p("fail forbidden", jSONObject3));
            return;
        } else {
            int i7 = optInt;
            if (!((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_android_appbrand_security_detect_snapshot, BuildInfo.DEBUG)) {
                if (BuildInfo.DEBUG) {
                    i4 = 0;
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "fail forbidden");
                } else {
                    i4 = 0;
                }
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("errno", i4);
                } catch (Exception e2) {
                    Exception exc2 = e2;
                    Object[] objArr2 = new Object[1];
                    objArr2[i4] = exc2;
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", objArr2);
                }
                eVar.mo109647a(i6, mo115115p("fail forbidden", jSONObject4));
                return;
            } else if (optLong <= 0) {
                if (BuildInfo.DEBUG) {
                    i3 = 0;
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "fail invalid snapshotIntervalMillis");
                } else {
                    i3 = 0;
                }
                JSONObject jSONObject5 = new JSONObject();
                try {
                    jSONObject5.put("errno", i3);
                } catch (Exception e3) {
                    Exception exc3 = e3;
                    Object[] objArr3 = new Object[1];
                    objArr3[i3] = exc3;
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", objArr3);
                }
                eVar.mo109647a(i6, mo115115p("fail invalid snapshotIntervalMillis", jSONObject5));
                return;
            } else {
                Log.m105924i("MicroMsg.AppBrand.JsApiSetSecuritySnapshotStrategy", "invoke(" + eVar.getAppId() + ") call start()");
                eVar.getRuntime().mo113186Q1().mo124024a(optLong, i7);
                c = 1;
            }
        }
        if (BuildInfo.DEBUG) {
            Object[] objArr4 = new Object[2];
            i2 = 0;
            objArr4[0] = 0;
            objArr4[c] = "ok";
            Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", objArr4);
        } else {
            i2 = 0;
        }
        JSONObject jSONObject6 = new JSONObject();
        try {
            jSONObject6.put("errno", i2);
        } catch (Exception e4) {
            Exception exc4 = e4;
            Object[] objArr5 = new Object[1];
            objArr5[i2] = exc4;
            Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", objArr5);
        }
        eVar.mo109647a(i6, mo115115p("ok", jSONObject6));
    }
}
