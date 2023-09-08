package com.tencent.p014mm.plugin.appbrand.jsapi.appdownload;

import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiResumeDownloadTaskForNative;
import com.tencent.p014mm.sdk.platformtools.Util;
import org.json.JSONObject;
import p237sp.C13747c0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.q */
public class C1611q implements C13747c0.C13748a {

    /* renamed from: a */
    public final /* synthetic */ JsApiResumeDownloadTaskForNative.ResumeDownloadTask f11216a;

    public C1611q(JsApiResumeDownloadTaskForNative.ResumeDownloadTask resumeDownloadTask) {
        this.f11216a = resumeDownloadTask;
    }

    /* renamed from: a */
    public void mo287a(String str, JSONObject jSONObject) {
        if (Util.isNullOrNil(str)) {
            this.f11216a.f11210o = false;
        } else {
            this.f11216a.f11210o = true;
        }
    }
}
