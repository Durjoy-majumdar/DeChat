package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.content.Intent;
import org.json.JSONObject;
import p170ic.C87687a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.d4 */
public class C82369d4 extends C82268c<C82554k> {
    public static final int CTRL_INDEX = 62;
    public static final String NAME = "openAddress";

    /* renamed from: g */
    public final int f241419g = C87687a.m109085a(this);

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0022, code lost:
        r1 = (com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC) r0;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1505u(com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r7, org.json.JSONObject r8, int r9) {
        /*
            r6 = this;
            com.tencent.mm.plugin.appbrand.jsapi.k r7 = (com.tencent.p014mm.plugin.appbrand.jsapi.C82554k) r7
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            r6.mo114775w(r3, r7, r8)
            java.lang.String r8 = r7.getAppId()
            java.lang.String r0 = "req_app_id"
            r3.putExtra(r0, r8)
            r8 = 1
            java.lang.String r0 = "launch_from_appbrand"
            r3.putExtra(r0, r8)
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r0 = r7.getRuntime()
            boolean r1 = r0 instanceof com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC
            if (r1 == 0) goto L_0x0058
            r1 = r0
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r1 = (com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC) r1
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r2 = r1.mo113210l1()
            if (r2 == 0) goto L_0x0058
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r4 = r2.f234815R0
            boolean r4 = r4.mo76931c()
            if (r4 == 0) goto L_0x0058
            com.tencent.mm.plugin.appbrand.widget.halfscreen.HalfScreenManger r1 = r1.f238298z1
            boolean r1 = r1.mo117784g()
            if (r1 != 0) goto L_0x004d
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r1 = r2.f234815R0
            int r1 = r1.f157944d
            java.lang.String r4 = "content_view_height"
            r3.putExtra(r4, r1)
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r1 = r2.f234815R0
            boolean r1 = r1.f157946f
            java.lang.String r4 = "click_empty_close"
            r3.putExtra(r4, r1)
        L_0x004d:
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r1 = r2.f234815R0
            boolean r1 = r1.f157948h
            if (r1 == 0) goto L_0x0058
            java.lang.String r1 = "force_light_mode"
            r3.putExtra(r1, r8)
        L_0x0058:
            android.app.Activity r0 = r0.mo113026R()
            if (r0 != 0) goto L_0x007f
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.String r2 = r7.getAppId()
            r0[r1] = r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r0[r8] = r1
            java.lang.String r8 = "MicroMsg.JsApiOpenAddress"
            java.lang.String r1 = "invoke appId:%s, callbackId:%d, context == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r1, r0)
            java.lang.String r8 = "fail:internal error invalid android context"
            java.lang.String r8 = r6.mo115109j(r8)
            r7.mo109647a(r9, r8)
            goto L_0x0095
        L_0x007f:
            rc.g r8 = p225rc.C89916g.m112446a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.c4 r1 = new com.tencent.mm.plugin.appbrand.jsapi.c4
            r1.<init>(r6, r7, r9)
            r8.mo124232f(r1)
            int r4 = r6.f241419g
            r5 = 0
            java.lang.String r1 = "address"
            java.lang.String r2 = ".ui.WalletSelectAddrUI"
            ke3.C88144b.m109796n(r0, r1, r2, r3, r4, r5)
        L_0x0095:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.C82369d4.mo1505u(com.tencent.mm.plugin.appbrand.jsapi.f, org.json.JSONObject, int):void");
    }

    /* renamed from: w */
    public void mo114775w(Intent intent, C82554k kVar, JSONObject jSONObject) {
    }
}
