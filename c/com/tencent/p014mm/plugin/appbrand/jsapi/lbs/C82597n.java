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

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lbs.n */
public class C82597n extends C82594l<C81925i2> {
    private static final int CTRL_INDEX = 586;
    private static final String NAME = "enableLocationUpdateBackground";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lbs.n$a */
    public class C82598a implements C82581d0.C82586e {

        /* renamed from: a */
        public final /* synthetic */ C82587e0 f241720a;

        /* renamed from: b */
        public final /* synthetic */ C81925i2 f241721b;

        public C82598a(C82597n nVar, C82587e0 e0Var, C81925i2 i2Var) {
            this.f241720a = e0Var;
            this.f241721b = i2Var;
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0038  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0050  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo114899a(java.lang.String r4) {
            /*
                r3 = this;
                int r0 = r4.hashCode()
                r1 = -1562453447(0xffffffffa2deda39, float:-6.0404273E-18)
                r2 = 1
                if (r0 == r1) goto L_0x0029
                r1 = -1514425717(0xffffffffa5bbb28b, float:-3.2560314E-16)
                if (r0 == r1) goto L_0x001f
                r1 = 1073716042(0x3fff9b4a, float:1.9969265)
                if (r0 == r1) goto L_0x0015
                goto L_0x0033
            L_0x0015:
                java.lang.String r0 = "StateListening"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0033
                r4 = 0
                goto L_0x0034
            L_0x001f:
                java.lang.String r0 = "StateSuspend"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0033
                r4 = 2
                goto L_0x0034
            L_0x0029:
                java.lang.String r0 = "StateNotListening"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0033
                r4 = 1
                goto L_0x0034
            L_0x0033:
                r4 = -1
            L_0x0034:
                java.lang.String r0 = "MicroMsg.AppBrand.JsApiEnableLocationUpdateBackgroundWxa"
                if (r4 == 0) goto L_0x0050
                if (r4 == r2) goto L_0x003b
                goto L_0x0064
            L_0x003b:
                java.lang.String r4 = "STATE_NOT_LISTENING, stop blink"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
                com.tencent.mm.plugin.appbrand.jsapi.lbs.e0 r4 = r3.f241720a
                com.tencent.mm.plugin.appbrand.jsapi.lbs.a0 r4 = r4.f241711s
                if (r4 == 0) goto L_0x0064
                com.tencent.mm.plugin.appbrand.i2 r0 = r3.f241721b
                com.tencent.mm.plugin.appbrand.AppBrandRuntime r0 = r0.getRuntime()
                r4.mo114891b(r0)
                goto L_0x0064
            L_0x0050:
                java.lang.String r4 = "STATE_LISTENING, start blink"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
                com.tencent.mm.plugin.appbrand.jsapi.lbs.e0 r4 = r3.f241720a
                com.tencent.mm.plugin.appbrand.jsapi.lbs.a0 r4 = r4.f241711s
                if (r4 == 0) goto L_0x0064
                com.tencent.mm.plugin.appbrand.i2 r0 = r3.f241721b
                com.tencent.mm.plugin.appbrand.AppBrandRuntime r0 = r0.getRuntime()
                r4.mo114890a(r0)
            L_0x0064:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.lbs.C82597n.C82598a.mo114899a(java.lang.String):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lbs.n$b */
    public class C82599b implements C88509c.C88512b {

        /* renamed from: d */
        public final /* synthetic */ C82587e0 f241722d;

        public C82599b(C82597n nVar, C82587e0 e0Var) {
            this.f241722d = e0Var;
        }

        /* renamed from: b */
        public void mo113102b(String str, C88508b bVar) {
            if (bVar == C88508b.DESTROYED) {
                Log.m105924i("MicroMsg.AppBrand.JsApiEnableLocationUpdateBackgroundWxa", "AppRunningState.DESTROYED, uninit");
                this.f241722d.quit();
            } else if (bVar == C88508b.SUSPEND) {
                Log.m105924i("MicroMsg.AppBrand.JsApiEnableLocationUpdateBackgroundWxa", "AppRunningState.SUSPEND, suspendListening");
                C82587e0 e0Var = this.f241722d;
                e0Var.f241700i = false;
                e0Var.sendMessage(3);
            } else if (bVar == C88508b.FOREGROUND) {
                Log.m105924i("MicroMsg.AppBrand.JsApiEnableLocationUpdateBackgroundWxa", "AppRunningState.FOREGROUND, resumeListening");
                C82587e0 e0Var2 = this.f241722d;
                if (!e0Var2.f241700i) {
                    e0Var2.sendMessage(4);
                } else {
                    e0Var2.f241700i = false;
                }
            } else if (bVar != C88508b.BACKGROUND) {
            } else {
                if (!this.f241722d.f241702n) {
                    Log.m105924i("MicroMsg.AppBrand.JsApiEnableLocationUpdateBackgroundWxa", "AppRunningState.BACKGROUND, stopListening");
                    C82587e0 e0Var3 = this.f241722d;
                    e0Var3.f241700i = false;
                    e0Var3.sendMessage(2);
                    return;
                }
                Log.m105924i("MicroMsg.AppBrand.JsApiEnableLocationUpdateBackgroundWxa", "AppRunningState.BACKGROUND, do nothing");
            }
        }
    }

    /* renamed from: A */
    public void mo114903A(C81925i2 i2Var, JSONObject jSONObject, int i) {
        super.mo114896x(i2Var, jSONObject, i);
        C82581d0 d0Var = this.f241719h;
        if (!(d0Var instanceof C82587e0)) {
            Log.m105928w("MicroMsg.AppBrand.JsApiEnableLocationUpdateBackgroundWxa", "state manager not RuntimeLocationUpdateStateManagerWxa");
            i2Var.mo109647a(i, mo115109j("fail:system error"));
            return;
        }
        C82587e0 e0Var = (C82587e0) d0Var;
        C82572a0 a0Var = e0Var.f241711s;
        if (a0Var != null) {
            Log.m105924i("MicroMsg.LbsBlinkHelper", "stopBlinkSubTitleImmediately");
            C88024r.m109572b(new C82577b0(a0Var));
        }
        if (a0Var == null || !e0Var.f241702n) {
            a0Var = new C82572a0();
        }
        e0Var.f241711s = a0Var;
        a0Var.mo114890a(i2Var.getRuntime());
        e0Var.f241703o = new C82598a(this, e0Var, i2Var);
        C88509c.C88512b bVar = e0Var.f241712t;
        if (bVar != null) {
            i2Var.getRuntime().f238113K.mo122982e(bVar);
        }
        if (bVar == null || !e0Var.f241702n) {
            bVar = new C82599b(this, e0Var);
        }
        i2Var.getRuntime().f238113K.mo122978a(bVar);
        e0Var.f241712t = bVar;
        e0Var.f241702n = true;
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
        Log.m105927v("MicroMsg.AppBrand.JsApiEnableLocationUpdateBackgroundWxa", "enableLocationUpdate %s", jSONObject);
        return bundle;
    }

    /* renamed from: z */
    public C82581d0 mo114902z(C82381f fVar) {
        return new C82587e0((C81925i2) fVar);
    }
}
