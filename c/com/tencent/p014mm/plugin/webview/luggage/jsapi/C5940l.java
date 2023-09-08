package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiCancelDownloadTask;
import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.util.C6013c;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import org.json.JSONObject;
import p237sp.C13754y;
import p828wa.C53096b;
import p828wa.C53138x;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.l */
public class C5940l extends C43620m2<C53138x> {
    /* renamed from: b */
    public String mo5382b() {
        return JsApiCancelDownloadTask.NAME;
    }

    /* renamed from: c */
    public int mo5383c() {
        return 1;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        Log.m105924i("MicroMsg.JsApiCancelDownloadTask", "invokeInMM");
        JSONObject e = C6013c.m5893e(str);
        if (e == null) {
            bVar.mo6945a("fail", (JSONObject) null);
            return;
        }
        long optLong = e.optLong("download_id");
        if (optLong <= 0) {
            Log.m105920e("MicroMsg.JsApiCancelDownloadTask", "fail, invalid downloadId = " + optLong);
            bVar.mo6945a("invalid_downloadid", (JSONObject) null);
        } else if (((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63970r(optLong) > 0) {
            bVar.mo6945a((String) null, (JSONObject) null);
        } else {
            bVar.mo6945a("fail", (JSONObject) null);
        }
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C53138x>.a aVar) {
    }
}
