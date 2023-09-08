package com.tencent.p014mm.plugin.appbrand.jsapi.webrtc;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.webrtc.JsApiRequestSRFile;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webrtc.h */
public final class C1901h<T> implements C1256g {

    /* renamed from: d */
    public final /* synthetic */ C82381f f11746d;

    /* renamed from: e */
    public final /* synthetic */ int f11747e;

    /* renamed from: f */
    public final /* synthetic */ JsApiRequestSRFile f11748f;

    public C1901h(C82381f fVar, int i, JsApiRequestSRFile jsApiRequestSRFile) {
        this.f11746d = fVar;
        this.f11747e = i;
        this.f11748f = jsApiRequestSRFile;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        int i = ((JsApiRequestSRFile.GetDownloadStatus) obj).f11744d;
        if (i == 0) {
            C82381f fVar = this.f11746d;
            int i2 = this.f11747e;
            JsApiRequestSRFile jsApiRequestSRFile = this.f11748f;
            HashMap hashMap = new HashMap();
            hashMap.put("isDownload", Boolean.TRUE);
            hashMap.put("errCode", 1008);
            C13598b0 b0Var = C13598b0.f38549a;
            jsApiRequestSRFile.getClass();
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
            }
            hashMap.put("errno", 0);
            fVar.mo109647a(i2, jsApiRequestSRFile.mo115114o("ok", hashMap));
        } else if (i == 1) {
            C82381f fVar2 = this.f11746d;
            int i3 = this.f11747e;
            JsApiRequestSRFile jsApiRequestSRFile2 = this.f11748f;
            HashMap hashMap2 = new HashMap();
            hashMap2.put("isDownload", Boolean.FALSE);
            hashMap2.put("errCode", 1009);
            C13598b0 b0Var2 = C13598b0.f38549a;
            jsApiRequestSRFile2.getClass();
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
            }
            hashMap2.put("errno", 0);
            fVar2.mo109647a(i3, jsApiRequestSRFile2.mo115114o("ok", hashMap2));
        } else if (i == 2) {
            C82381f fVar3 = this.f11746d;
            int i4 = this.f11747e;
            JsApiRequestSRFile jsApiRequestSRFile3 = this.f11748f;
            HashMap hashMap3 = new HashMap();
            hashMap3.put("isDownload", Boolean.FALSE);
            hashMap3.put("errCode", 1010);
            C13598b0 b0Var3 = C13598b0.f38549a;
            jsApiRequestSRFile3.getClass();
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
            }
            hashMap3.put("errno", 0);
            fVar3.mo109647a(i4, jsApiRequestSRFile3.mo115114o("ok", hashMap3));
        } else if (i == 3) {
            C82381f fVar4 = this.f11746d;
            int i5 = this.f11747e;
            JsApiRequestSRFile jsApiRequestSRFile4 = this.f11748f;
            HashMap hashMap4 = new HashMap();
            hashMap4.put("isDownload", Boolean.FALSE);
            hashMap4.put("errCode", 1011);
            C13598b0 b0Var4 = C13598b0.f38549a;
            jsApiRequestSRFile4.getClass();
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
            }
            hashMap4.put("errno", 0);
            fVar4.mo109647a(i5, jsApiRequestSRFile4.mo115114o("ok", hashMap4));
        } else if (i == 4) {
            C82381f fVar5 = this.f11746d;
            int i6 = this.f11747e;
            JsApiRequestSRFile jsApiRequestSRFile5 = this.f11748f;
            HashMap hashMap5 = new HashMap();
            hashMap5.put("isDownload", Boolean.FALSE);
            hashMap5.put("errCode", 1012);
            C13598b0 b0Var5 = C13598b0.f38549a;
            jsApiRequestSRFile5.getClass();
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
            }
            hashMap5.put("errno", 0);
            fVar5.mo109647a(i6, jsApiRequestSRFile5.mo115114o("ok", hashMap5));
        } else if (i == 5) {
            C82381f fVar6 = this.f11746d;
            int i7 = this.f11747e;
            JsApiRequestSRFile jsApiRequestSRFile6 = this.f11748f;
            HashMap hashMap6 = new HashMap();
            hashMap6.put("isDownload", Boolean.FALSE);
            hashMap6.put("errCode", 1013);
            C13598b0 b0Var6 = C13598b0.f38549a;
            jsApiRequestSRFile6.getClass();
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
            }
            hashMap6.put("errno", 0);
            fVar6.mo109647a(i7, jsApiRequestSRFile6.mo115114o("ok", hashMap6));
        }
    }
}
