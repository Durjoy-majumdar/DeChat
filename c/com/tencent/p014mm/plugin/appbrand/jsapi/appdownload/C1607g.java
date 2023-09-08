package com.tencent.p014mm.plugin.appbrand.jsapi.appdownload;

import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTaskForNative;
import org.json.JSONObject;
import p237sp.C13747c0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.g */
public class C1607g implements C13747c0.C13748a {

    /* renamed from: a */
    public final /* synthetic */ JsApiAddDownloadTaskForNative.AddDownloadTask f11212a;

    public C1607g(JsApiAddDownloadTaskForNative.AddDownloadTask addDownloadTask) {
        this.f11212a = addDownloadTask;
    }

    /* renamed from: a */
    public void mo287a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            this.f11212a.f11112z = true;
            return;
        }
        this.f11212a.f11094B = (long) jSONObject.optInt("download_id", -1);
        JsApiAddDownloadTaskForNative.AddDownloadTask addDownloadTask = this.f11212a;
        if (addDownloadTask.f11094B <= 0) {
            addDownloadTask.f11112z = true;
        } else {
            addDownloadTask.f11112z = false;
        }
    }
}
