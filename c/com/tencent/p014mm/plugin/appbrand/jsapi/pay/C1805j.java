package com.tencent.p014mm.plugin.appbrand.jsapi.pay;

import com.tencent.p014mm.autogen.events.WCPayWalletBufferEvent;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.j */
public class C1805j extends C82268c {
    public static final int CTRL_INDEX = 681;
    public static final String NAME = "handleWCPayOverseaWalletBuffer";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.j$a */
    public class C1806a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WCPayWalletBufferEvent f11603d;

        /* renamed from: e */
        public final /* synthetic */ C82381f f11604e;

        /* renamed from: f */
        public final /* synthetic */ int f11605f;

        public C1806a(WCPayWalletBufferEvent wCPayWalletBufferEvent, C82381f fVar, int i) {
            this.f11603d = wCPayWalletBufferEvent;
            this.f11604e = fVar;
            this.f11605f = i;
        }

        public void run() {
            int i = this.f11603d.f9579e.f9590a;
            if (i == 0) {
                new HashMap().put("buffer", this.f11603d.f9579e.f9591b);
                this.f11604e.mo109647a(this.f11605f, C1805j.this.mo115109j("ok"));
            } else if (i == -2) {
                this.f11604e.mo109647a(this.f11605f, C1805j.this.mo115109j("null"));
            } else {
                this.f11604e.mo109647a(this.f11605f, C1805j.this.mo115109j("fail"));
            }
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        Log.m105924i("MicroMsg.JsApiHandleWCPayOverseaWalletBuffer", "invoke JsApiHandleWCPayOverseaWalletBuffer!");
        if (fVar == null) {
            Log.m105920e("MicroMsg.JsApiHandleWCPayOverseaWalletBuffer", "fail:component is null");
        } else if (fVar.getContext() == null) {
            Log.m105920e("MicroMsg.JsApiHandleWCPayOverseaWalletBuffer", "fail:context is null");
            fVar.mo109647a(i, mo115109j("fail"));
        } else {
            WCPayWalletBufferEvent wCPayWalletBufferEvent = new WCPayWalletBufferEvent();
            wCPayWalletBufferEvent.f9578d.f9587h = jSONObject.optString("action");
            wCPayWalletBufferEvent.f9578d.f9589j = jSONObject.optString("buffer");
            wCPayWalletBufferEvent.f9578d.f9580a = jSONObject.optString("appId");
            wCPayWalletBufferEvent.f9578d.f9588i = Util.getInt(jSONObject.optString("walletRegion"), 0);
            wCPayWalletBufferEvent.f9578d.f9581b = jSONObject.optString("timeStamp");
            wCPayWalletBufferEvent.f9578d.f9585f = jSONObject.optString("nonceStr");
            wCPayWalletBufferEvent.f9578d.f9583d = jSONObject.optString("paySign");
            wCPayWalletBufferEvent.f9578d.f9584e = jSONObject.optString("signType");
            wCPayWalletBufferEvent.f9578d.f9582c = jSONObject.optString("package");
            wCPayWalletBufferEvent.f9578d.f9586g = jSONObject.optString("url");
            wCPayWalletBufferEvent.f9579e.f9592c = new C1806a(wCPayWalletBufferEvent, fVar, i);
            wCPayWalletBufferEvent.publish();
        }
    }
}
