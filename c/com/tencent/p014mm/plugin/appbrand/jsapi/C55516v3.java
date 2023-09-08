package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig;
import com.tencent.p014mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener;
import com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.C82793b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di0.C86299o;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import java.util.HashMap;
import kr0.C76630x0;
import n70.C47167a;
import org.json.JSONObject;
import p565ir.C60605m;
import p823sg.C77710q;
import wi0.C66117m;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.v3 */
public final class C55516v3 extends C82016a0<C82381f> {
    public static final int CTRL_INDEX = 251;
    public static final String NAME = "navigateToMiniProgram";

    /* renamed from: t */
    public String mo1731t(C82381f fVar, JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject jSONObject2 = jSONObject;
        C87412m.m108594g(fVar, "component");
        C87412m.m108594g(jSONObject2, "data");
        C86299o oVar = new C86299o();
        oVar.f250930b = jSONObject2.optString("appId");
        oVar.f250929a = jSONObject2.optString("userName");
        oVar.f250934f = jSONObject2.optString("path");
        oVar.f250939k = jSONObject2.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        oVar.f250940l = jSONObject2.optString("sceneNote");
        oVar.f250931c = C82793b.m101536a(jSONObject2.optString("envVersion"), C82793b.RELEASE).f242156d;
        oVar.f250941m = jSONObject2.optInt("preScene", 0);
        oVar.f250942n = jSONObject2.optString("preSceneNote");
        if (jSONObject2.has("extraData")) {
            AppBrandLaunchReferrer appBrandLaunchReferrer = new AppBrandLaunchReferrer();
            appBrandLaunchReferrer.f239397e = fVar.getAppId();
            appBrandLaunchReferrer.f239398f = jSONObject2.optString("extraData");
            oVar.f250947s = appBrandLaunchReferrer;
        }
        if (jSONObject2.has("devuin")) {
            oVar.f250933e = C77710q.m93739b(jSONObject2.optString("devuin"));
        }
        if (C87412m.m108589b(jSONObject2.optString("mode"), "halfPage") && (optJSONObject = jSONObject2.optJSONObject("halfPage")) != null) {
            String optString = optJSONObject.optString("capsuleMenuType");
            int i = -2;
            int b = C47167a.m52445b(Integer.valueOf(optJSONObject.optInt("landscapeWidth", -2)));
            double optDouble = optJSONObject.optDouble("height");
            if (Double.isNaN(optDouble)) {
                i = -1;
            } else {
                if (!(optDouble == 0.0d)) {
                    i = C47167a.m52445b(Double.valueOf(optDouble));
                }
            }
            int intValue = Integer.valueOf(i).intValue();
            HalfScreenConfig.BackgroundShapeConfig backgroundShapeConfig = new HalfScreenConfig.BackgroundShapeConfig((float) optJSONObject.optDouble("cornerRadius", 35.0d), true, true, false, false, 24, (C8480h) null);
            HalfScreenConfig.C55453c cVar = optJSONObject.optBoolean("hideCapsuleMenu") ? HalfScreenConfig.C55453c.HIDE : C87412m.m108589b(optString, "singleClose") ? HalfScreenConfig.C55453c.SINGLE_CLOSE : HalfScreenConfig.C55453c.NORMAL;
            boolean optBoolean = optJSONObject.optBoolean("forceLightMode");
            boolean optBoolean2 = optJSONObject.optBoolean("needShowTemplateNav");
            boolean optBoolean3 = optJSONObject.optBoolean("enableFullScreenGesture");
            HalfScreenConfig.C55451a aVar = optJSONObject.optBoolean("usePushAnimation", false) ? HalfScreenConfig.C55451a.SLIDE : HalfScreenConfig.C55451a.POPUP;
            boolean optBoolean4 = optJSONObject.optBoolean("forbidFullScreenDragUpGesture", false);
            boolean z = !optJSONObject.optBoolean("hideSimulatedNativeLeftReturnButton", false);
            String optString2 = optJSONObject.optString("loadingDarkModeStyle", jSONObject2.optString("loadingDarkModeStyle"));
            oVar.f250912A = new HalfScreenConfig(true, intValue, aVar, true, backgroundShapeConfig, optBoolean, (HalfScreenConfig.CloseWhenClickEmptyAreaConfig) null, cVar, optBoolean3, optBoolean2, (WeAppHalfScreenStatusChangeListener) null, (HalfScreenConfig.C55456f) null, false, optBoolean4, C87412m.m108589b(optString2, "dark") ? C66117m.FORCE_DARK : C87412m.m108589b(optString2, "light") ? C66117m.FORCE_LIGHT : C66117m.NORMAL, true, (HalfScreenConfig.ShareActionConfig) null, 0, 0, b, false, z, false, (HalfScreenConfig.C55455e) null, false, (HalfScreenConfig.CustomSubjectInfo) null, 0, false, false, 0, false, false, false, -3728320, 1, (C8480h) null);
        }
        Log.m105924i("MicroMsg.SurfaceApp.JsApiNavigateToMiniProgram", "launch: " + oVar.f250930b + ", " + oVar.f250934f + ", " + oVar.f250939k + ", " + oVar.f250940l + ", " + oVar.f250932d + ", " + oVar.f250941m + ", " + oVar.f250942n + ", " + oVar.f250912A);
        Context context = fVar.getContext();
        if (context.getResources().getConfiguration().orientation != 1 && !C87412m.m108589b(jSONObject2.optString("mode"), "halfPage")) {
            ((C60605m) C86312j.m106911c(C60605m.class)).J50();
        }
        ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(context, oVar);
        Object[] objArr = new Object[0];
        String str = "ok";
        HashMap hashMap = new HashMap();
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        hashMap.putAll(new HashMap());
        String m = mo115112m(str, hashMap);
        C87412m.m108593f(m, "makeReturnJson(ret.errMsg, ret.values)");
        return m;
    }
}
