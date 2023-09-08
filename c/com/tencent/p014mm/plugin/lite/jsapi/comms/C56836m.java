package com.tencent.p014mm.plugin.lite.jsapi.comms;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig;
import com.tencent.p014mm.plugin.lite.LiteAppCenter;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.file.XVFSFile;
import di0.C86295k;
import di0.C86299o;
import di0.C86300q;
import di3.C86312j;
import gy3.C87412m;
import kr0.C76630x0;
import org.json.JSONException;
import org.json.JSONObject;
import p206nj.C117627q;
import p235sm.C64053t0;
import p565ir.C60612q;

/* renamed from: com.tencent.mm.plugin.lite.jsapi.comms.m */
public class C56836m extends C4770c {

    /* renamed from: com.tencent.mm.plugin.lite.jsapi.comms.m$a */
    public class C4791a implements C64053t0.C13730a {
        public C4791a() {
        }

        /* renamed from: a */
        public void mo5696a(String str, String str2) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                LiteAppCenter.publishGlobalEventToTopPage((long) C56836m.this.f19814e.f31713a, "app.postmessage", "[" + jSONObject.toString() + "]");
            } catch (JSONException e) {
                Log.m105920e("LiteAppJsApiLaunchMiniProgram", e.toString());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.lite.jsapi.comms.m$b */
    public class C4792b implements C86295k {

        /* renamed from: d */
        public final /* synthetic */ JSONObject f19830d;

        public C4792b(C56836m mVar, JSONObject jSONObject) {
            this.f19830d = jSONObject;
        }

        /* renamed from: a */
        public String mo3693a() {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = this.f19830d;
            String optString = jSONObject2 != null ? jSONObject2.optString("finderUsername", "") : "";
            try {
                jSONObject.put("finderUsername", optString);
                jSONObject.put("finderLiveToken", "");
            } catch (JSONException unused) {
            }
            Log.m105925i("LiteAppJsApiLaunchMiniProgram", "finderUsername:%s, finderLiveToken:%s", optString, "");
            return jSONObject.toString();
        }
    }

    /* renamed from: com.tencent.mm.plugin.lite.jsapi.comms.m$c */
    public class C56837c implements C86300q {
        public C56837c(C56836m mVar) {
        }

        /* renamed from: a */
        public void mo63853a() {
        }

        /* renamed from: b */
        public void mo63854b(String str) {
        }

        /* renamed from: c */
        public void mo63855c() {
        }

        /* renamed from: d */
        public /* synthetic */ void mo63856d() {
        }

        /* renamed from: e */
        public void mo63857e() {
        }

        /* renamed from: f */
        public void mo63858f(boolean z) {
        }
    }

    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        HalfScreenConfig.C55453c cVar;
        HalfScreenConfig.C55453c cVar2;
        JSONObject jSONObject2;
        JSONObject jSONObject3 = jSONObject;
        HalfScreenConfig.C55453c cVar3 = HalfScreenConfig.C55453c.SINGLE_CLOSE;
        HalfScreenConfig.C55453c cVar4 = HalfScreenConfig.C55453c.HIDE;
        HalfScreenConfig.C55453c cVar5 = HalfScreenConfig.C55453c.NORMAL;
        String optString = jSONObject3.optString("targetAppId");
        String optString2 = jSONObject3.optString("currentUrl");
        String optString3 = jSONObject3.optString("referrerAppId");
        String optString4 = jSONObject3.optString("extraData");
        String optString5 = jSONObject3.optString("privateExtraData");
        String optString6 = jSONObject3.optString("mode");
        int optInt = jSONObject3.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1055);
        String optString7 = jSONObject3.optString("sceneNote");
        JSONObject optJSONObject = jSONObject3.has("halfPage") ? jSONObject3.optJSONObject("halfPage") : null;
        if (jSONObject3.has("singlePage")) {
            cVar = cVar3;
            jSONObject2 = jSONObject3.optJSONObject("singlePage");
            cVar2 = cVar4;
        } else {
            cVar = cVar3;
            cVar2 = cVar4;
            jSONObject2 = null;
        }
        JSONObject optJSONObject2 = jSONObject3.has("uiParam") ? jSONObject3.optJSONObject("uiParam") : null;
        if (Util.isNullOrNil(optString)) {
            this.f19815f.mo5689a("invalid_targetAppId");
        } else if (Util.isNullOrNil(optString3)) {
            this.f19815f.mo5689a("invalid_referrerAppId");
        } else {
            HalfScreenConfig.C55453c cVar6 = cVar5;
            C86299o oVar = new C86299o();
            JSONObject jSONObject4 = optJSONObject2;
            String nullAsNil = Util.nullAsNil(jSONObject3.optString("envVersion"));
            nullAsNil.getClass();
            JSONObject jSONObject5 = jSONObject2;
            Object obj = "singlePage";
            int i = !nullAsNil.equals("trial") ? !nullAsNil.equals("develop") ? 0 : 1 : 2;
            if (jSONObject3.optBoolean("openDataChannel")) {
                ((C64053t0) C86312j.m106911c(C64053t0.class)).mo88810Bz(optString, new C4791a());
            }
            String optString8 = jSONObject3.optString("path");
            oVar.f250930b = optString;
            oVar.f250931c = i;
            oVar.f250934f = optString8;
            oVar.f250939k = optInt;
            if (Util.isNullOrNil(optString7)) {
                optString7 = C117627q.m165908a(Util.nullAsNil(optString2)) + XVFSFile.PATH_SEPARATOR + optString3 + XVFSFile.PATH_SEPARATOR + 0;
            }
            oVar.f250940l = optString7;
            AppBrandLaunchReferrer appBrandLaunchReferrer = new AppBrandLaunchReferrer();
            oVar.f250947s = appBrandLaunchReferrer;
            appBrandLaunchReferrer.f239398f = optString4;
            appBrandLaunchReferrer.f239399g = optString5;
            appBrandLaunchReferrer.f239397e = optString3;
            appBrandLaunchReferrer.f239401i = optString2;
            appBrandLaunchReferrer.f239396d = 2;
            if (optString6.equals("halfPage")) {
                if (optJSONObject != null) {
                    oVar.f250949u = 2;
                    boolean optBoolean = optJSONObject.optBoolean("enableFullScreenGesture");
                    boolean optBoolean2 = optJSONObject.optBoolean("needShowTemplateNav");
                    boolean optBoolean3 = optJSONObject.optBoolean("hideCapsuleMenu");
                    String optString9 = optJSONObject.optString("capsuleMenuType");
                    boolean optBoolean4 = optJSONObject.optBoolean("showShareButton");
                    HalfScreenConfig.ShareActionConfig shareActionConfig = HalfScreenConfig.ShareActionConfig.f157976f;
                    if (optBoolean4) {
                        shareActionConfig = mo80260q(jSONObject3);
                    }
                    HalfScreenConfig.C55453c cVar7 = optBoolean3 ? cVar2 : "singleClose".equals(optString9) ? cVar : cVar6;
                    HalfScreenConfig.BackgroundShapeConfig backgroundShapeConfig = new HalfScreenConfig.BackgroundShapeConfig(MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3723cd), true, true, false, false);
                    HalfScreenConfig.C55452b bVar = new HalfScreenConfig.C55452b();
                    bVar.f157989a = true;
                    bVar.f157990b = -2;
                    bVar.f157991c = -2;
                    bVar.f157992d = -2;
                    bVar.f157993e = -2;
                    bVar.f157999k = cVar7;
                    bVar.f157995g = true;
                    bVar.f157997i = backgroundShapeConfig;
                    bVar.f158007s = true;
                    bVar.f158000l = optBoolean;
                    bVar.f158002n = optBoolean2;
                    C87412m.m108594g(shareActionConfig, "shareActionConfig");
                    bVar.f158008t = shareActionConfig;
                    oVar.f250912A = bVar.mo76967a();
                }
            } else if (optString6.equals(obj)) {
                if (jSONObject5 != null) {
                    JSONObject jSONObject6 = jSONObject5;
                    boolean optBoolean5 = jSONObject6.optBoolean("needShowTemplateNav");
                    boolean optBoolean6 = jSONObject6.optBoolean("hideCapsuleMenu");
                    String optString10 = jSONObject6.optString("capsuleMenuType");
                    boolean optBoolean7 = jSONObject6.optBoolean("showShareButton");
                    HalfScreenConfig.ShareActionConfig shareActionConfig2 = HalfScreenConfig.ShareActionConfig.f157976f;
                    if (optBoolean7) {
                        shareActionConfig2 = mo80260q(jSONObject3);
                    }
                    HalfScreenConfig.C55453c cVar8 = optBoolean6 ? cVar2 : "singleClose".equals(optString10) ? cVar : cVar6;
                    HalfScreenConfig.C55452b bVar2 = new HalfScreenConfig.C55452b();
                    bVar2.f157989a = true;
                    bVar2.f157999k = cVar8;
                    bVar2.f158002n = optBoolean5;
                    C87412m.m108594g(shareActionConfig2, "shareActionConfig");
                    bVar2.f158008t = shareActionConfig2;
                    oVar.f250912A = bVar2.mo76967a();
                }
            } else if (jSONObject4 != null) {
                JSONObject jSONObject7 = jSONObject4;
                boolean optBoolean8 = jSONObject7.optBoolean("needShowTemplateNav");
                boolean optBoolean9 = jSONObject7.optBoolean("hideCapsuleMenu");
                String optString11 = jSONObject7.optString("capsuleMenuType");
                boolean optBoolean10 = jSONObject7.optBoolean("showShareButton");
                HalfScreenConfig.ShareActionConfig shareActionConfig3 = HalfScreenConfig.ShareActionConfig.f157976f;
                if (optBoolean10) {
                    shareActionConfig3 = mo80260q(jSONObject3);
                }
                HalfScreenConfig.C55453c cVar9 = optBoolean9 ? cVar2 : "singleClose".equals(optString11) ? cVar : cVar6;
                HalfScreenConfig.C55452b bVar3 = new HalfScreenConfig.C55452b();
                bVar3.f157989a = true;
                bVar3.f157999k = cVar9;
                bVar3.f158002n = optBoolean8;
                C87412m.m108594g(shareActionConfig3, "shareActionConfig");
                bVar3.f158008t = shareActionConfig3;
                oVar.f250912A = bVar3.mo76967a();
            }
            oVar.f250916E = mo80261r();
            JSONObject optJSONObject3 = jSONObject3.optJSONObject("shareProductItem");
            oVar.f250937i = new C4792b(this, optJSONObject3);
            if (optJSONObject3 != null) {
                ((C60612q) C86312j.m106911c(C60612q.class)).mo84963pH(mo5676d(), oVar, optJSONObject3.optString("finderUsername", ""), optJSONObject3.optLong("productId", 0));
            } else {
                ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(mo5676d(), oVar);
            }
            this.f19815f.mo5690b();
        }
    }

    /* renamed from: q */
    public HalfScreenConfig.ShareActionConfig mo80260q(JSONObject jSONObject) {
        return HalfScreenConfig.ShareActionConfig.f157976f;
    }

    /* renamed from: r */
    public C86300q mo80261r() {
        return new C56837c(this);
    }
}
