package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.app.Activity;
import android.content.Intent;
import ke3.C88144b;
import org.json.JSONObject;
import yl0.C91499o;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.k3 */
public class C1707k3 extends C82268c<C82554k> {
    public static final int CTRL_INDEX = 989;
    public static final String NAME = "jumpRedPacketEnvelopeList";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82554k kVar = (C82554k) fVar;
        Activity R = kVar.getRuntime().mo113026R();
        if (R == null) {
            kVar.mo109647a(i, mo115109j("fail:internal error invalid android context"));
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("packetId", jSONObject.optString("packetId"));
        C88144b.m109795m(R, "luckymoney", ".ui.LuckyMoneyPickEnvelopeUI", intent, C91499o.CTRL_INDEX);
        kVar.mo109647a(i, mo115109j("ok"));
    }
}
