package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import ke3.C88144b;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.k4 */
public class C1708k4 extends C82268c<C82554k> {
    public static final int CTRL_INDEX = 642;
    public static final String NAME = "openWCCardHomePage";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82554k kVar = (C82554k) fVar;
        Activity R = kVar.getRuntime().mo113026R();
        if (R == null) {
            kVar.mo109647a(i, mo115109j("fail:internal error invalid android context"));
            return;
        }
        C88144b.m109791i(R, "card", ".ui.v2.CardHomePageNewUI", new Intent(), (Bundle) null);
        kVar.mo109647a(i, mo115109j("ok"));
    }
}
