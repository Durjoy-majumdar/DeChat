package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.net.Uri;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.XWebFeature;
import com.tencent.xweb.file.XVFSFile;
import di0.C86299o;
import di3.C86312j;
import kr0.C76630x0;
import org.json.JSONException;
import org.json.JSONObject;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.d1 */
public class C5900d1 extends C5954n2<C43658n> {
    /* renamed from: b */
    public String mo5382b() {
        return "openWeAppPage";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 0;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C43658n>.a aVar) {
        Log.m105925i("MicroMsg.JsApiOpenWeAppPage", "invokeInOwn %s", aVar.f148190b.f129368c);
        String optString = aVar.f148190b.f129368c.optString("userName");
        String optString2 = aVar.f148190b.f129368c.optString("relativeURL");
        if (optString2.contains("render_data")) {
            try {
                JSONObject jSONObject = new JSONObject(Uri.parse(optString2).getQueryParameter("widgetData"));
                jSONObject.remove("render_data");
                optString2 = optString2.replaceAll("(widgetData=.*&)|(widgetData=.*$)", "&") + "&widgetData=" + jSONObject.toString();
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.JsApiOpenWeAppPage", e, "", new Object[0]);
            }
        }
        int optInt = aVar.f148190b.f129368c.optInt("appVersion", 0);
        String optString3 = aVar.f148190b.f129368c.optString("searchId");
        String optString4 = aVar.f148190b.f129368c.optString("docId");
        int optInt2 = aVar.f148190b.f129368c.optInt("position", 1);
        int optInt3 = aVar.f148190b.f129368c.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1000);
        String optString5 = aVar.f148190b.f129368c.optString("privateExtraData");
        C86299o oVar = new C86299o();
        if (optInt3 == 201 || optInt3 == 14 || optInt3 == 22) {
            oVar.f250939k = 1006;
        } else if (optInt3 == 3) {
            oVar.f250939k = 1005;
        } else if (optInt3 == 16) {
            oVar.f250939k = XWebFeature.INTERFACE_SET_WEB_CONTENTS_SIZE;
        } else if (optInt3 == 20) {
            oVar.f250939k = 1053;
        } else {
            oVar.f250939k = 1000;
        }
        oVar.f250940l = aVar.f148190b.f129368c.optString("statSessionId") + XVFSFile.PATH_SEPARATOR + aVar.f148190b.f129368c.optString("statKeywordId") + XVFSFile.PATH_SEPARATOR + optString3 + XVFSFile.PATH_SEPARATOR + optString4 + XVFSFile.PATH_SEPARATOR + optInt2 + XVFSFile.PATH_SEPARATOR + aVar.f148190b.f129368c.optString("subScene");
        AppBrandLaunchReferrer appBrandLaunchReferrer = new AppBrandLaunchReferrer();
        oVar.f250947s = appBrandLaunchReferrer;
        appBrandLaunchReferrer.f239399g = optString5;
        oVar.f250929a = optString;
        oVar.f250932d = optInt;
        oVar.f250934f = optString2;
        ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(((C43658n) aVar.f148189a).f148196d, oVar);
        aVar.mo73776a();
    }
}
