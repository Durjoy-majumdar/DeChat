package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.FileReaderHelper;
import di0.C86299o;
import di3.C86312j;
import kr0.C76630x0;
import kr0.C88267e;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.u5 */
public final class C83042u5 extends C82268c<C81879g> {
    private static final int CTRL_INDEX = -2;
    private static final String NAME = "restart";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        AppBrandRuntimeWC appBrandRuntimeWC;
        C81879g gVar = (C81879g) fVar;
        String optString = jSONObject.optString("url");
        int i2 = 0;
        boolean optBoolean = jSONObject.optBoolean(FileReaderHelper.OPEN_FILE_FROM_FORCE, false);
        if (TextUtils.isEmpty(optString)) {
            gVar.mo109647a(i, mo115109j("fail: empty url"));
            return;
        }
        if (gVar instanceof C88267e) {
            appBrandRuntimeWC = ((C88267e) gVar).getRuntime();
        } else if (gVar instanceof C83928t1) {
            appBrandRuntimeWC = ((C83928t1) gVar).getRuntime();
        } else {
            gVar.mo109647a(i, mo115109j("fail:internal error"));
            return;
        }
        int optInt = jSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, appBrandRuntimeWC.mo113208k1());
        boolean equals = "halfPage".equals(jSONObject.optString("mode", "default"));
        Log.m105925i("MicroMsg.JsApiRestart", "jsapi restart: url[%s], newScene[%d] force[%b]", optString, Integer.valueOf(optInt), Boolean.valueOf(optBoolean));
        AppBrandInitConfigWC M1 = appBrandRuntimeWC.mo113210l1();
        C86299o oVar = new C86299o();
        oVar.f250929a = M1.f234839s;
        oVar.f250934f = optString;
        oVar.f250931c = M1.f239365g;
        oVar.f250932d = M1.f234802F;
        if (equals) {
            i2 = 2;
        }
        oVar.f250949u = i2;
        oVar.f250939k = optInt;
        oVar.f250940l = M1.f234837q;
        oVar.f250918G = optBoolean;
        String optString2 = jSONObject.optString("privateExtraData");
        if (!Util.isNullOrNil(optString2)) {
            AppBrandLaunchReferrer appBrandLaunchReferrer = new AppBrandLaunchReferrer();
            oVar.f250947s = appBrandLaunchReferrer;
            appBrandLaunchReferrer.f239396d = 10;
            appBrandLaunchReferrer.f239399g = optString2;
        }
        Context R = appBrandRuntimeWC.mo113026R();
        if (equals) {
            HalfScreenConfig.C55452b bVar = new HalfScreenConfig.C55452b();
            bVar.f157989a = true;
            bVar.f157990b = (C75044y4.m89990b(MMApplicationContext.getContext()).y * 3) / 4;
            bVar.f158000l = true;
            HalfScreenConfig.C55451a aVar = HalfScreenConfig.C55451a.POPUP;
            bVar.f157994f = aVar;
            bVar.f157997i = new HalfScreenConfig.BackgroundShapeConfig(MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3723cd), true, true, false, false);
            bVar.f157995g = true;
            bVar.f157999k = HalfScreenConfig.C55453c.SINGLE_CLOSE;
            bVar.f157998j = true;
            bVar.f158002n = true;
            bVar.f158000l = true;
            bVar.f158005q = true;
            bVar.f157996h = new HalfScreenConfig.CloseWhenClickEmptyAreaConfig(MMApplicationContext.getApplicationId() + ".ui.LauncherUI", aVar);
            bVar.f158004p = HalfScreenConfig.C55456f.NORMAL;
            oVar.f250912A = bVar.mo76967a();
            if (R instanceof AppBrandUI) {
                AppBrandUI appBrandUI = (AppBrandUI) R;
                if (appBrandUI.mo117074l8() && appBrandUI.isTaskRoot()) {
                    R = MMApplicationContext.getContext();
                }
            }
        }
        ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(R, oVar);
    }
}
