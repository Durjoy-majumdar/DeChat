package com.tencent.p014mm.plugin.appbrand.jsapi.storage;

import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataParcel;
import com.tencent.p014mm.plugin.appbrand.backgroundfetch.C29444w;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.storage.i */
public class C29541i extends C82268c {
    public static final int CTRL_INDEX = 522;
    public static final String NAME = "getBackgroundFetchData";

    /* renamed from: t */
    public boolean mo1769t() {
        return true;
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        Class cls = C29444w.class;
        if (fVar == null) {
            Log.m105928w("MicroMsg.JsApiGetBackgroundFetchData", "fail:component is null");
        } else if (jSONObject == null) {
            Log.m105928w("MicroMsg.JsApiGetBackgroundFetchData", "fail:data is null");
            fVar.mo109647a(i, mo115109j("fail:invalid data"));
        } else {
            String optString = jSONObject.optString("fetchType");
            if (Util.isNullOrNil(optString)) {
                Log.m105928w("MicroMsg.JsApiGetBackgroundFetchData", "fail:fetchType is null");
                fVar.mo109647a(i, mo115109j("fail:invalid data"));
                return;
            }
            String appId = fVar.getAppId();
            if (Util.isNullOrNil(appId)) {
                Log.m105928w("MicroMsg.JsApiGetBackgroundFetchData", "fail:appid is null");
                fVar.mo109647a(i, mo115109j("fail:appID is empty"));
                return;
            }
            boolean equals = optString.equals("periodic");
            if (C86312j.m106911c(cls) == null) {
                Log.m105928w("MicroMsg.JsApiGetBackgroundFetchData", "worker fail:IAppBrandBackgroundFetchDataStorage is null");
                fVar.mo109647a(i, mo115109j("fail:internal error"));
                return;
            }
            AppBrandBackgroundFetchDataParcel ro02 = ((C29444w) C86312j.m106911c(cls)).ro0(appId, equals ? 1 : 0);
            if (ro02 == null) {
                Log.m105928w("MicroMsg.JsApiGetBackgroundFetchData", "worker fail:record is null");
                fVar.mo109647a(i, mo115109j("fail:record is null"));
            } else if (ro02.f80220h == null) {
                Log.m105928w("MicroMsg.JsApiGetBackgroundFetchData", "worker fail:fetched data is null");
                fVar.mo109647a(i, mo115109j("fail:fetched data is null"));
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("fetchedData", ro02.f80220h);
                hashMap.put("path", ro02.f80218f);
                hashMap.put(SearchIntents.EXTRA_QUERY, ro02.f80219g);
                hashMap.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, Integer.valueOf(ro02.f80221i));
                hashMap.put("timeStamp", Long.valueOf(ro02.f80222j));
                Log.m105925i("MicroMsg.JsApiGetBackgroundFetchData", "JsApiGetBackgroundFetchData, app(%s_%d)", appId, Integer.valueOf(equals));
                fVar.mo109647a(i, mo115112m("ok", hashMap));
            }
        }
    }
}
