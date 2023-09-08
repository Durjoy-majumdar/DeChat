package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import ex0.C45696d;
import f40.C86709a0;
import gy3.C87412m;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.n2 */
public final class C1758n2 extends C82268c<C82381f> {
    private static final int CTRL_INDEX = 763;
    private static final String NAME = "downloadPageDataForFastLoad";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82381f fVar2 = fVar;
        JSONObject jSONObject2 = jSONObject;
        int i2 = i;
        Class cls = C45696d.class;
        JSONArray optJSONArray = jSONObject2 != null ? jSONObject2.optJSONArray("itemList") : null;
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            boolean z = false;
            for (int i3 = 0; i3 < length; i3++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i3);
                if (optJSONObject == null) {
                    Log.m105920e("MicroMsg.JsApiDownloadPageDataForFastLoad", "downloadPageDataForFastLoad invalid item index: " + i3);
                } else {
                    String optString = optJSONObject.optString("url");
                    int optInt = optJSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, -1);
                    int optInt2 = optJSONObject.optInt("item_show_type", -1);
                    Log.m105925i("MicroMsg.JsApiDownloadPageDataForFastLoad", "downloadPageDataForFastLoad itemShowType: " + optInt2 + ", openScene: " + optInt + ", url: %s", optString);
                    if (!((C45696d) C86709a0.m107533q(cls)).mo70957E5(optInt)) {
                        Log.m105929w("MicroMsg.JsApiDownloadPageDataForFastLoad", "downloadPageDataForFastLoad can not preload openScene: %d", Integer.valueOf(optInt));
                    } else {
                        C87412m.m108593f(optString, "url");
                        if (optString.length() > 0) {
                            ((C45696d) C86709a0.m107533q(cls)).Tn0(optString, optInt2, optInt, new Object[0]);
                            z = true;
                        }
                    }
                }
            }
            if (z) {
                if (fVar2 != null) {
                    if (BuildInfo.DEBUG) {
                        Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    try {
                        jSONObject3.put("errno", 0);
                    } catch (Exception e) {
                        Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
                    }
                    fVar2.mo109647a(i2, mo115115p("ok", jSONObject3));
                }
            } else if (fVar2 != null) {
                fVar2.mo109647a(i2, mo115109j(NAME + ":fail not valid url"));
            }
        } else if (fVar2 != null) {
            fVar2.mo109647a(i2, mo115109j(NAME + ":fail itemList invalid"));
        }
    }
}
