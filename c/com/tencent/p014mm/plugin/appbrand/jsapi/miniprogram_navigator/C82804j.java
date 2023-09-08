package com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator;

import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig;
import com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.C82794c;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import js0.C88020k;
import org.json.JSONException;
import org.json.JSONObject;
import wi0.C66117m;
import wi0.C90988l;
import zp3.C79406f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.j */
public class C82804j extends C82792a {
    public static final int CTRL_INDEX = 251;
    public static final String NAME = "navigateToMiniProgram";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.j$a */
    public class C1750a implements C82794c.C82798c {

        /* renamed from: a */
        public final /* synthetic */ C81879g f11486a;

        /* renamed from: b */
        public final /* synthetic */ int f11487b;

        public C1750a(C81879g gVar, int i) {
            this.f11486a = gVar;
            this.f11487b = i;
        }

        /* renamed from: a */
        public void mo1732a(boolean z, String str) {
            String str2;
            if (z) {
                C81879g gVar = this.f11486a;
                int i = this.f11487b;
                C82804j jVar = C82804j.this;
                jVar.getClass();
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("errno", 0);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
                }
                gVar.mo109647a(i, jVar.mo115115p("ok", jSONObject));
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("fail");
            String str3 = "";
            if (TextUtils.isEmpty(str)) {
                str2 = str3;
            } else {
                str2 = " " + str;
            }
            sb.append(str2);
            String sb4 = sb.toString();
            C81879g gVar2 = this.f11486a;
            int i2 = this.f11487b;
            C82804j jVar2 = C82804j.this;
            jVar2.getClass();
            if (sb4 != null) {
                str3 = sb4;
            }
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, str3);
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("errno", 0);
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e2);
            }
            gVar2.mo109647a(i2, jVar2.mo115115p(str3, jSONObject2));
        }

        /* renamed from: b */
        public /* synthetic */ void mo1733b(AppBrandInitConfig appBrandInitConfig) {
        }
    }

    /* renamed from: A */
    public final double mo115044A(double d) {
        if (d == -2.0d) {
            return d;
        }
        if (d < 0.0d) {
            d = 0.0d;
        }
        return ((double) C88020k.m109556g()) * d;
    }

    /* renamed from: x */
    public void mo77028x(HalfScreenConfig.C55452b bVar, JSONObject jSONObject) {
    }

    /* renamed from: y */
    public C82794c.C82798c mo77029y(C81879g gVar, JSONObject jSONObject, int i) {
        return new C1750a(gVar, i);
    }

    /* renamed from: z */
    public void mo1505u(C81879g gVar, JSONObject jSONObject, int i) {
        int i2;
        String str;
        String str2;
        C82794c.C82795a aVar;
        HalfScreenConfig halfScreenConfig;
        HalfScreenConfig halfScreenConfig2;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        boolean z;
        boolean z2;
        double d;
        boolean z3;
        boolean z4;
        JSONObject jSONObject4;
        boolean z5;
        boolean z6;
        boolean z7;
        double d2;
        double d3;
        double d4;
        String str3;
        String str4;
        String str5;
        String str6;
        C81879g gVar2 = gVar;
        JSONObject jSONObject5 = jSONObject;
        int i3 = i;
        HalfScreenConfig.C55453c cVar = HalfScreenConfig.C55453c.SINGLE_CLOSE;
        String optString = jSONObject5.optString("appId", (String) null);
        if (Util.isNullOrNil(optString)) {
            gVar2.mo109647a(i3, mo115109j("fail:appID is empty"));
        } else if (optString.equals(gVar.getAppId())) {
            gVar2.mo109647a(i3, mo115109j("fail:target appId is the same as the caller appId"));
        } else {
            String optString2 = jSONObject5.optString("path", (String) null);
            C90988l d0 = gVar.getRuntime().mo113051d0();
            if (d0 == null) {
                Log.m105921e("Luggage.JsApiNavigateToMiniProgram", "invoke appId:%s, navigateToAppId:%s, NULL sysConfig", gVar.getAppId(), optString);
                gVar2.mo109647a(i3, mo115109j("fail:internal error"));
                return;
            }
            int i4 = d0.f261072r.f238585d;
            int i5 = C82793b.m101536a(jSONObject5.optString("envVersion"), C82793b.RELEASE).f242156d;
            if (!(i4 == 1 || i4 == 2)) {
                i5 = 0;
            }
            int optInt = jSONObject5.optInt("sourcetype", 0);
            String optString3 = jSONObject5.optString("agentId");
            C82794c.C82795a aVar2 = new C82794c.C82795a();
            aVar2.f242157a = jSONObject5.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
            aVar2.f242158b = jSONObject5.optString("sceneNote");
            aVar2.f242159c = jSONObject5.optInt("preScene", 0);
            aVar2.f242160d = jSONObject5.optString("preSceneNote");
            aVar2.f242162f = optInt;
            aVar2.f242161e = optString3;
            aVar2.f242163g = jSONObject5.optString("adInfo");
            aVar2.f242165i = jSONObject5.optBoolean("noRelaunchIfPathUnchanged", false);
            String str7 = "";
            if ("halfPage".equals(jSONObject5.optString("mode", str7))) {
                HalfScreenConfig.C55453c cVar2 = HalfScreenConfig.C55453c.NORMAL;
                try {
                    jSONObject2 = jSONObject5.getJSONObject("halfPage");
                } catch (JSONException unused) {
                    jSONObject2 = null;
                }
                try {
                    jSONObject3 = jSONObject5.getJSONObject("uiParam");
                } catch (JSONException unused2) {
                    jSONObject3 = null;
                }
                HalfScreenConfig.C55453c cVar3 = cVar2;
                aVar = aVar2;
                HalfScreenConfig.C55453c cVar4 = cVar;
                str2 = optString;
                str = optString2;
                if (jSONObject2 != null) {
                    double A = mo115044A(jSONObject2.optDouble("width", -2.0d));
                    d4 = mo115044A(jSONObject2.optDouble("height", 0.0d));
                    String str8 = "needShowTemplateNav";
                    i2 = i5;
                    double A2 = mo115044A(jSONObject2.optDouble("landscapeHeight", -2.0d));
                    jSONObject4 = jSONObject3;
                    String str9 = "forceLightMode";
                    String str10 = "usePushAnimation";
                    double A3 = mo115044A(jSONObject2.optDouble("landscapeWidth", -2.0d));
                    if (d4 == 0.0d) {
                        d4 = -2.0d;
                    }
                    if (A == 0.0d) {
                        A = -2.0d;
                    }
                    if (A2 == 0.0d) {
                        A2 = -2.0d;
                    }
                    if (A3 == 0.0d) {
                        A3 = -2.0d;
                    }
                    boolean optBoolean = jSONObject2.optBoolean("hideSimulatedNativeLeftReturnButton", false);
                    String optString4 = jSONObject2.optString("loadingDarkModeStyle", str7);
                    boolean optBoolean2 = jSONObject2.optBoolean("hideCapsuleMenu", false);
                    double d5 = A;
                    str7 = jSONObject2.optString("capsuleMenuType", str7);
                    str6 = str9;
                    z6 = jSONObject2.optBoolean(str6, false);
                    boolean optBoolean3 = jSONObject2.optBoolean("enableFullScreenGesture", false);
                    boolean optBoolean4 = jSONObject2.optBoolean("forbidFullScreenDragUpGesture", false);
                    str5 = str8;
                    boolean optBoolean5 = jSONObject2.optBoolean(str5, false);
                    double d6 = A2;
                    str4 = str10;
                    z4 = jSONObject2.optBoolean(str4, false);
                    d = A3;
                    str3 = optString4;
                    z2 = optBoolean3;
                    z = optBoolean4;
                    d3 = d6;
                    z5 = optBoolean5;
                    z3 = optBoolean;
                    z7 = optBoolean2;
                    d2 = d5;
                } else {
                    str6 = "forceLightMode";
                    str5 = "needShowTemplateNav";
                    i2 = i5;
                    jSONObject4 = jSONObject3;
                    d2 = -2.0d;
                    str4 = "usePushAnimation";
                    d3 = -2.0d;
                    d = -2.0d;
                    str3 = str7;
                    d4 = 0.0d;
                    z7 = false;
                    z6 = false;
                    z5 = false;
                    z4 = false;
                    z3 = false;
                    z2 = false;
                    z = false;
                }
                if (jSONObject4 != null) {
                    JSONObject jSONObject6 = jSONObject4;
                    if (jSONObject6.has("hideCapsuleMenu")) {
                        z7 = jSONObject2.optBoolean("hideCapsuleMenu", false);
                    }
                    if (jSONObject6.has(str6)) {
                        z6 = jSONObject2.optBoolean(str6, false);
                    }
                    if (jSONObject6.has(str5)) {
                        z5 = jSONObject2.optBoolean(str5, false);
                    }
                    if (jSONObject6.has(str4)) {
                        z4 = jSONObject2.optBoolean(str4, false);
                    }
                    if (jSONObject6.has("hideSimulatedNativeLeftReturnButton")) {
                        z3 = jSONObject2.optBoolean("hideSimulatedNativeLeftReturnButton", false);
                    }
                }
                boolean z8 = z6;
                boolean z9 = z5;
                HalfScreenConfig.C55453c cVar5 = z7 ? HalfScreenConfig.C55453c.HIDE : "singleClose".equals(str7) ? cVar4 : cVar3;
                HalfScreenConfig.C55451a aVar3 = z4 ? HalfScreenConfig.C55451a.SLIDE : HalfScreenConfig.C55451a.POPUP;
                HalfScreenConfig.BackgroundShapeConfig backgroundShapeConfig = new HalfScreenConfig.BackgroundShapeConfig(MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3723cd), true, true, false, false);
                HalfScreenConfig.C55452b bVar = new HalfScreenConfig.C55452b();
                bVar.f157989a = true;
                bVar.f157990b = (int) d4;
                bVar.f157991c = (int) d2;
                bVar.f157992d = (int) d3;
                bVar.f157993e = (int) d;
                bVar.f157999k = cVar5;
                bVar.f157997i = backgroundShapeConfig;
                bVar.f157998j = z8;
                bVar.f157995g = true;
                bVar.f158007s = true;
                bVar.f158000l = z2;
                bVar.f158001m = z;
                bVar.f158002n = z9;
                bVar.f157994f = aVar3;
                bVar.f158011w = false;
                bVar.f158010v = !z3;
                if ("dark".equals(str3)) {
                    bVar.f158006r = C66117m.FORCE_DARK;
                } else if ("light".equals(str3)) {
                    bVar.f158006r = C66117m.FORCE_LIGHT;
                }
                mo77028x(bVar, jSONObject);
                halfScreenConfig2 = bVar.mo76967a();
                C81879g gVar3 = gVar;
                int i6 = i;
            } else {
                HalfScreenConfig.C55453c cVar6 = cVar;
                str2 = optString;
                str = optString2;
                i2 = i5;
                aVar = aVar2;
                if ("embedded".equals(jSONObject5.optString("mode", str7))) {
                    int[] iArr = new int[2];
                    C83780d1 pageView = gVar.getRuntime().mo113042Z().getPageView();
                    if (pageView == null) {
                        gVar.mo109647a(i, mo115109j("fail:page don't exist"));
                        return;
                    }
                    C81879g gVar4 = gVar;
                    int i7 = i;
                    pageView.f244554F.getCapsuleView().getLocationInWindow(iArr);
                    int height = iArr[1] + pageView.f244554F.getCapsuleView().getHeight();
                    HalfScreenConfig.C55452b bVar2 = new HalfScreenConfig.C55452b();
                    bVar2.f157989a = true;
                    bVar2.f158012x = HalfScreenConfig.C55455e.EMBED;
                    bVar2.f157990b = (C75044y4.m89990b(MMApplicationContext.getContext()).y - height) - C79406f.m96347a(gVar.getContext(), 12.0f);
                    bVar2.f157999k = cVar6;
                    bVar2.f157997i = new HalfScreenConfig.BackgroundShapeConfig(MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3723cd), true, true, false, false);
                    bVar2.f158007s = true;
                    bVar2.f158009u = false;
                    bVar2.f157995g = true;
                    bVar2.f158000l = false;
                    bVar2.f158004p = HalfScreenConfig.C55456f.NORMAL;
                    bVar2.f158002n = true;
                    mo77028x(bVar2, jSONObject5);
                    halfScreenConfig2 = bVar2.mo76967a();
                } else {
                    C81879g gVar5 = gVar;
                    int i8 = i;
                    halfScreenConfig = null;
                    ((C82807l) mo114794w()).mo115046b(gVar, str2, i2, str, aVar, jSONObject, halfScreenConfig, mo77029y(gVar, jSONObject, i));
                }
            }
            halfScreenConfig = halfScreenConfig2;
            ((C82807l) mo114794w()).mo115046b(gVar, str2, i2, str, aVar, jSONObject, halfScreenConfig, mo77029y(gVar, jSONObject, i));
        }
    }
}
