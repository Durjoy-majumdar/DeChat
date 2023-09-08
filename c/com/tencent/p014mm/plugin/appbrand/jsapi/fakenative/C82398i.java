package com.tencent.p014mm.plugin.appbrand.jsapi.fakenative;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.NavigateBackMiniProgramEvent;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.C82792a;
import com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.C82793b;
import com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.C82794c;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import java.util.HashMap;
import org.json.JSONObject;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.fakenative.i */
public class C82398i extends C82792a {
    public static final int CTRL_INDEX = 592;
    public static final String NAME = "openBusinessView";

    /* renamed from: g */
    public boolean f241462g = false;

    /* renamed from: h */
    public C89779i0 f241463h;

    /* renamed from: i */
    public IListener<NavigateBackMiniProgramEvent> f241464i;

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81879g gVar = (C81879g) fVar;
        String optString = jSONObject.optString("businessType");
        if (Util.isNullOrNil(optString)) {
            mo114795x(gVar, i, -4, "fail invalid businessType");
            return;
        }
        if (jSONObject.optJSONObject("extraData") == null) {
            new JSONObject();
        }
        if (jSONObject.optJSONObject("privateExtraData") == null) {
            new JSONObject();
        }
        String optString2 = jSONObject.optString("queryString");
        int i2 = gVar.getRuntime().mo113051d0().f261072r.f238585d;
        int i3 = (i2 == 1 || i2 == 2) ? C82793b.m101536a(jSONObject.optString("envVersion"), C82793b.RELEASE).f242156d : 0;
        int optInt = jSONObject.optInt("sourcetype", 5);
        String optString3 = jSONObject.optString("agentId");
        C82794c.C82795a aVar = new C82794c.C82795a();
        aVar.f242157a = jSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        aVar.f242158b = jSONObject.optString("sceneNote");
        aVar.f242159c = jSONObject.optInt("preScene", 0);
        aVar.f242160d = jSONObject.optString("preSceneNote");
        aVar.f242162f = optInt;
        aVar.f242161e = optString3;
        aVar.f242164h = optString;
        String appId = gVar.getAppId();
        this.f241462g = false;
        MMHandlerThread.postToMainThread(new C82396g(this, gVar.getContext(), new C82393e(this, gVar, i)));
        IListener<NavigateBackMiniProgramEvent> iListener = this.f241464i;
        if (iListener != null) {
            iListener.dead();
        }
        JsApiOpenBusinessView$3 jsApiOpenBusinessView$3 = new JsApiOpenBusinessView$3(this, C40008f.f107254d, gVar, i);
        this.f241464i = jsApiOpenBusinessView$3;
        jsApiOpenBusinessView$3.alive();
        OpenBusinessViewUtil.m101152f(3, optString, optString2, appId, (String) null, new C82394f(this, gVar, i, i3, aVar, jSONObject));
    }

    /* renamed from: w */
    public C82794c mo114794w() {
        return C82403p.f241473c;
    }

    /* renamed from: x */
    public final void mo114795x(C81879g gVar, int i, int i2, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("errCode", Integer.valueOf(i2));
        gVar.mo109647a(i, mo115112m(str, hashMap));
    }
}
