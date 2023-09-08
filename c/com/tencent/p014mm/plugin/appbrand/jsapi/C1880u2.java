package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.JsApiGamelifeManager;
import java.util.HashMap;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.u2 */
public final class C1880u2<T> implements C1256g {

    /* renamed from: d */
    public final /* synthetic */ C81925i2 f11717d;

    /* renamed from: e */
    public final /* synthetic */ int f11718e;

    /* renamed from: f */
    public final /* synthetic */ JsApiGamelifeManager f11719f;

    public C1880u2(C81925i2 i2Var, int i, JsApiGamelifeManager jsApiGamelifeManager) {
        this.f11717d = i2Var;
        this.f11718e = i;
        this.f11719f = jsApiGamelifeManager;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        JsApiGamelifeManager.GetGameLifeRedCountData getGameLifeRedCountData = (JsApiGamelifeManager.GetGameLifeRedCountData) obj;
        if (getGameLifeRedCountData.f10928f) {
            int i = getGameLifeRedCountData.f10926d;
            HashMap hashMap = new HashMap();
            hashMap.put("unreadRedCount", Integer.valueOf(i));
            this.f11717d.mo109647a(this.f11718e, this.f11719f.mo115112m("ok", hashMap));
            return;
        }
        this.f11717d.mo109647a(this.f11718e, (String) null);
    }
}
