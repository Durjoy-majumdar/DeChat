package com.tencent.p014mm.plugin.appbrand.jsapi.lbs;

import android.os.Bundle;
import com.tencent.luggage.sdk.config.AppBrandSysConfigLU;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.lbs.C82581d0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import js0.C88024r;
import li0.C88508b;
import li0.C88509c;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lbs.p */
public class C82601p extends C82594l<C81925i2> {
    private static final int CTRL_INDEX = 340;
    private static final String NAME = "enableLocationUpdate";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lbs.p$a */
    public class C82602a implements C82581d0.C82586e {

        /* renamed from: a */
        public final /* synthetic */ C82587e0 f241723a;

        /* renamed from: b */
        public final /* synthetic */ C81925i2 f241724b;

        public C82602a(C82601p pVar, C82587e0 e0Var, C81925i2 i2Var) {
            this.f241723a = e0Var;
            this.f241724b = i2Var;
        }

        /* renamed from: a */
        public void mo114899a(String str) {
            C82572a0 a0Var = this.f241723a.f241711s;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1562453447) {
                if (hashCode != -1514425717) {
                    if (hashCode == 1073716042 && str.equals("StateListening")) {
                        c = 0;
                    }
                } else if (str.equals("StateSuspend")) {
                    c = 2;
                }
            } else if (str.equals("StateNotListening")) {
                c = 1;
            }
            if (c == 0) {
                Log.m105924i("MicroMsg.AppBrand.JsApiEnableLocationUpdateWxa", "STATE_LISTENING, start blink");
                if (a0Var != null) {
                    a0Var.mo114890a(this.f241724b.getRuntime());
                }
            } else if (c == 1) {
                Log.m105924i("MicroMsg.AppBrand.JsApiEnableLocationUpdateWxa", "STATE_NOT_LISTENING, stop blink");
                if (a0Var != null) {
                    a0Var.mo114891b(this.f241724b.getRuntime());
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lbs.p$b */
    public class C82603b implements C88509c.C88512b {

        /* renamed from: d */
        public final /* synthetic */ C82587e0 f241725d;

        public C82603b(C82601p pVar, C82587e0 e0Var) {
            this.f241725d = e0Var;
        }

        /* renamed from: b */
        public void mo113102b(String str, C88508b bVar) {
            if (bVar == C88508b.DESTROYED) {
                Log.m105924i("MicroMsg.AppBrand.JsApiEnableLocationUpdateWxa", "AppRunningState.DESTROYED, uninit");
                this.f241725d.quit();
            } else if (bVar == C88508b.SUSPEND) {
                Log.m105924i("MicroMsg.AppBrand.JsApiEnableLocationUpdateWxa", "AppRunningState.SUSPEND, suspendListening");
                C82587e0 e0Var = this.f241725d;
                e0Var.f241700i = false;
                e0Var.sendMessage(3);
            } else if (bVar == C88508b.FOREGROUND) {
                Log.m105924i("MicroMsg.AppBrand.JsApiEnableLocationUpdateWxa", "AppRunningState.FOREGROUND, resumeListening");
                C82587e0 e0Var2 = this.f241725d;
                if (!e0Var2.f241700i) {
                    e0Var2.sendMessage(4);
                } else {
                    e0Var2.f241700i = false;
                }
            } else if (bVar != C88508b.BACKGROUND) {
            } else {
                if (!this.f241725d.f241702n) {
                    Log.m105924i("MicroMsg.AppBrand.JsApiEnableLocationUpdateWxa", "AppRunningState.BACKGROUND, stopListening");
                    C82587e0 e0Var3 = this.f241725d;
                    e0Var3.f241700i = false;
                    e0Var3.sendMessage(2);
                    return;
                }
                Log.m105924i("MicroMsg.AppBrand.JsApiEnableLocationUpdateWxa", "AppRunningState.BACKGROUND, do nothing");
            }
        }
    }

    /* renamed from: A */
    public void mo114904A(C81925i2 i2Var, JSONObject jSONObject, int i) {
        super.mo114896x(i2Var, jSONObject, i);
        C82581d0 d0Var = this.f241719h;
        if (!(d0Var instanceof C82587e0)) {
            Log.m105928w("MicroMsg.AppBrand.JsApiEnableLocationUpdateWxa", "state manager not RuntimeLocationUpdateStateManagerWxa");
            i2Var.mo109647a(i, mo115109j("fail:system error"));
            return;
        }
        C82587e0 e0Var = (C82587e0) d0Var;
        C82572a0 a0Var = e0Var.f241711s;
        if (a0Var != null) {
            Log.m105924i("MicroMsg.LbsBlinkHelper", "stopBlinkSubTitleImmediately");
            C88024r.m109572b(new C82577b0(a0Var));
        }
        if (a0Var == null || e0Var.f241702n) {
            a0Var = new C82572a0();
        }
        e0Var.f241711s = a0Var;
        a0Var.mo114890a(i2Var.getRuntime());
        e0Var.f241703o = new C82602a(this, e0Var, i2Var);
        C88509c.C88512b bVar = e0Var.f241712t;
        if (bVar != null) {
            i2Var.getRuntime().f238113K.mo122982e(bVar);
        }
        if (bVar == null || e0Var.f241702n) {
            bVar = new C82603b(this, e0Var);
        }
        i2Var.getRuntime().f238113K.mo122978a(bVar);
        e0Var.f241712t = bVar;
        e0Var.f241702n = false;
    }

    /* renamed from: y */
    public Bundle mo114901y(C82381f fVar, JSONObject jSONObject) {
        C81925i2 i2Var = (C81925i2) fVar;
        Bundle bundle = new Bundle();
        String optString = jSONObject.optString("subKey", "");
        String appId = i2Var.getAppId();
        if (!Util.isNullOrNil(optString)) {
            bundle.putString("smallAppKey", optString + "#" + appId + ";");
        }
        bundle.putBoolean("enableIndoor", jSONObject.optBoolean("enableIndoor", false));
        if (!(i2Var.getRuntime() == null || i2Var.getRuntime().mo113051d0() == null)) {
            bundle.putString("openId", ((AppBrandSysConfigLU) i2Var.getRuntime().mo113051d0()).f234882V0);
        }
        Log.m105927v("MicroMsg.AppBrand.JsApiEnableLocationUpdateWxa", "enableLocationUpdate %s", jSONObject);
        return bundle;
    }

    /* renamed from: z */
    public C82581d0 mo114902z(C82381f fVar) {
        return new C82587e0((C81925i2) fVar);
    }
}
