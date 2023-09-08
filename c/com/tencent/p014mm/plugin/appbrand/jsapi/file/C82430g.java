package com.tencent.p014mm.plugin.appbrand.jsapi.file;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82432h;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.g */
public abstract class C82430g {

    /* renamed from: a */
    public C82870p f241517a;

    static {
        Map<String, C82432h> map = C82432h.C82433a.f241519a;
    }

    /* renamed from: a */
    public final C82446i mo114811a(C82381f fVar, C40482o oVar, JSONObject jSONObject) {
        String c = mo114812c(jSONObject);
        return Util.isNullOrNil(c) ? new C82446i("fail invalid path", new Object[0]) : !fVar.mo109648b(this.f241517a.mo114779e(), oVar) ? new C82446i("fail:interrupted", new Object[0]) : mo114803b(fVar, c, jSONObject);
    }

    /* renamed from: b */
    public abstract C82446i mo114803b(C82381f fVar, String str, JSONObject jSONObject);

    /* renamed from: c */
    public String mo114812c(JSONObject jSONObject) {
        String optString = jSONObject.optString(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, (String) null);
        if (Util.isNullOrNil(optString)) {
            optString = jSONObject.optString("dirPath", (String) null);
        }
        return Util.isNullOrNil(optString) ? jSONObject.optString("path", (String) null) : optString;
    }
}
