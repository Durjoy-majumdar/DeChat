package com.tencent.p014mm.plugin.appbrand.jsapi.auth;

import ai0.C79553f;
import ai0.C79570o;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C81682d;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o;
import com.tencent.p014mm.plugin.appbrand.p025ad.p945ui.AppBrandAdUI;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import h81.C32735h;
import java.util.HashMap;
import java.util.Map;
import ob0.C47350c;
import org.json.JSONObject;
import p166hy.C60229z;
import pe3.C47465a;
import pe3.C89349b;
import rp0.C90081h;
import sp0.C90272a;
import te3.C90423kk2;
import te3.C90426lk2;
import te3.w55;
import wi0.C90988l;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.r */
public final class C82198r extends C82268c<C81879g> {
    public static final int CTRL_INDEX = 874;
    public static final String NAME = "adOperateWXData";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.r$a */
    public class C82199a implements C40324j.C40326a {

        /* renamed from: a */
        public final /* synthetic */ C81879g f241067a;

        /* renamed from: b */
        public final /* synthetic */ C40482o f241068b;

        /* renamed from: c */
        public final /* synthetic */ int f241069c;

        public C82199a(C81879g gVar, C40482o oVar, int i) {
            this.f241067a = gVar;
            this.f241068b = oVar;
            this.f241069c = i;
        }

        /* renamed from: a */
        public void mo288a(int i, int i2, String str, C47350c cVar) {
            if (!this.f241067a.mo109648b(C82198r.this.mo114779e(), this.f241068b)) {
                Log.m105921e("MicroMsg.AppBrand.JsApiAdOperateWXData[AppBrandSplashAd]", "cgi callback, callbackId:%s, service not running or preloaded", Integer.valueOf(this.f241069c));
                return;
            }
            if (i == 0 && i2 == 0) {
                C47465a aVar = cVar.f127056b.f127083a;
                if (aVar instanceof C90426lk2) {
                    C90426lk2 lk22 = (C90426lk2) aVar;
                    if (lk22.f259669d.f134688d == 0) {
                        String h = lk22.f259670e.mo123705h();
                        if (Util.isNullOrNil(h)) {
                            Log.m105920e("MicroMsg.AppBrand.JsApiAdOperateWXData[AppBrandSplashAd]", "cgi success, data is null");
                            this.f241067a.mo114838E(this.f241069c, C82198r.this.mo115109j("fail invalid response"), this.f241068b);
                            return;
                        }
                        String appId = this.f241067a.getAppId();
                        long currentTimeMillis = System.currentTimeMillis();
                        Map<String, Class<? extends AppBrandAdUI>> map = C79553f.f233288a;
                        try {
                            if (C79570o.m96622b(appId).f233283q == 0) {
                                C79570o.m96622b(appId).f233283q = currentTimeMillis;
                            }
                            Log.m105925i("MicroMsg.AppBrand.JsApiAdOperateWXData[AppBrandSplashAd]", "cgi success, callbackId:%s, callback data:%s", Integer.valueOf(this.f241069c), lk22.f259670e.mo123705h());
                            HashMap hashMap = new HashMap();
                            hashMap.put("data", h);
                            this.f241067a.mo114838E(this.f241069c, C82198r.this.mo115112m("ok", hashMap), this.f241068b);
                            return;
                        } catch (NullPointerException e) {
                            Log.m105921e("MicroMsg.AppBrandAdUtils[AppBrandSplashAd]", "setAdOperateCallbackSendTime npe, appId:%s, runtime:%s", appId, C81682d.m100222b(appId));
                            throw e;
                        }
                    } else {
                        C81879g gVar = this.f241067a;
                        int i3 = this.f241069c;
                        C82198r rVar = C82198r.this;
                        gVar.mo114838E(i3, rVar.mo115109j("fail:errorCode:" + lk22.f259669d.f134688d + ",errorMsg:" + lk22.f259669d.f134689e), this.f241068b);
                        return;
                    }
                }
            }
            Log.m105921e("MicroMsg.AppBrand.JsApiAdOperateWXData[AppBrandSplashAd]", "cgi fail, errType:%s, errCode:%s, errMsg:%s, response:%s", Integer.valueOf(i), Integer.valueOf(i2), str, cVar.f127056b.f127083a);
            this.f241067a.mo114838E(this.f241069c, C82198r.this.mo115109j("fail invalid response"), this.f241068b);
        }
    }

    /* renamed from: h */
    public boolean mo114532h() {
        return true;
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81879g gVar = (C81879g) fVar;
        mo114531v(gVar, jSONObject, i, gVar.getJsRuntime());
    }

    /* renamed from: w */
    public final String mo114603w(C81879g gVar) {
        Class cls = C60229z.class;
        String r4 = ((C60229z) C86312j.m106911c(cls)).mo85224r4();
        String d002 = ((C60229z) C86312j.m106911c(cls)).d00();
        String Uc0 = ((C60229z) C86312j.m106911c(cls)).Uc0();
        String str = ((C90272a) gVar.mo109671p(C90272a.class)).f259120B;
        HashMap hashMap = new HashMap();
        hashMap.put("oaid", r4);
        hashMap.put("imei", d002);
        hashMap.put("devIdInfo", Uc0);
        hashMap.put("ua", str);
        return new JSONObject(hashMap).toString();
    }

    /* renamed from: x */
    public void mo114531v(C81879g gVar, JSONObject jSONObject, int i, C40482o oVar) {
        C90988l d0;
        C81879g gVar2 = gVar;
        JSONObject jSONObject2 = jSONObject;
        int i2 = i;
        C40482o oVar2 = oVar;
        boolean optBoolean = jSONObject2.optBoolean("keepAlive", false);
        String appId = gVar.getAppId();
        if (appId == null) {
            Log.m105920e("MicroMsg.AppBrand.JsApiAdOperateWXData[AppBrandSplashAd]", "appId is null");
            gVar2.mo114838E(i2, mo115109j("fail:internal error"), oVar2);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, Class<? extends AppBrandAdUI>> map = C79553f.f233288a;
        try {
            if (C79570o.m96622b(appId).f233282p == 0) {
                C79570o.m96622b(appId).f233282p = currentTimeMillis;
            }
            try {
                String string = jSONObject2.getString("data");
                if (jSONObject2.optBoolean("appendDeviceInfo") && ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_enable_adoperatewxdata_get_deviceinfo, false)) {
                    JSONObject jSONObject3 = new JSONObject(string);
                    ((JSONObject) jSONObject3.get("data")).put("deviceInfo", mo114603w(gVar));
                    string = jSONObject3.toString();
                }
                C47350c a = C90081h.m112683a(optBoolean).mo72403a();
                C90423kk2 kk22 = (C90423kk2) a.f127055a.f127080a;
                kk22.f259643d = gVar.getAppId();
                kk22.f259644e = new C89349b(string.getBytes() == null ? new byte[0] : string.getBytes());
                AppBrandRuntime runtime = gVar.getRuntime();
                if (!(runtime == null || (d0 = runtime.mo113051d0()) == null)) {
                    kk22.f259647h = d0.f261072r.f238585d;
                }
                if (gVar2 instanceof C81925i2) {
                    if (kk22.f259648i == null) {
                        kk22.f259648i = new w55();
                    }
                    kk22.f259648i.f143870f = 1;
                } else if (gVar2 instanceof C83780d1) {
                    if (kk22.f259648i == null) {
                        kk22.f259648i = new w55();
                    }
                    kk22.f259648i.f143870f = 2;
                }
                if (runtime instanceof AppBrandRuntimeWC) {
                    AppBrandRuntimeWC appBrandRuntimeWC = (AppBrandRuntimeWC) runtime;
                    if (appBrandRuntimeWC.mo121253n1() != null) {
                        if (kk22.f259648i == null) {
                            kk22.f259648i = new w55();
                        }
                        kk22.f259648i.f143869e = appBrandRuntimeWC.mo121253n1().f245533f;
                    }
                }
                ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(a, new C82199a(gVar2, oVar2, i2));
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrand.JsApiAdOperateWXData[AppBrandSplashAd]", "data exception %s", e.getMessage());
                gVar2.mo114838E(i2, mo115109j("fail:invalid data"), oVar2);
            }
        } catch (NullPointerException e2) {
            Log.m105921e("MicroMsg.AppBrandAdUtils[AppBrandSplashAd]", "setAdOperateCallReceivedTime npe, appId:%s, runtime:%s", appId, C81682d.m100222b(appId));
            throw e2;
        }
    }
}
