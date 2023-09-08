package com.tencent.p014mm.plugin.appbrand.jsapi;

import mp0.C88799f;
import org.json.JSONObject;
import p284zb.C91635f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.b6 */
public class C82213b6 extends C82268c<C91635f> {
    public static final int CTRL_INDEX = 249;
    public static final String NAME = "setEnableDebug";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C91635f fVar2 = (C91635f) fVar;
        boolean optBoolean = jSONObject.optBoolean("enableDebug", false);
        if (fVar2.getRuntime().mo113051d0().f234889w == optBoolean) {
            fVar2.mo109647a(i, mo115109j("ok"));
            return;
        }
        C88799f.m110866d(fVar2, fVar2.getAppId(), optBoolean);
        fVar2.mo109647a(i, mo115109j("ok"));
    }
}
