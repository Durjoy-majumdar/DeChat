package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import java.lang.ref.WeakReference;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.h1$$a */
public final /* synthetic */ class h1$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C1734h1 f11436d;

    /* renamed from: e */
    public final /* synthetic */ C82381f f11437e;

    /* renamed from: f */
    public final /* synthetic */ JSONObject f11438f;

    /* renamed from: g */
    public final /* synthetic */ int f11439g;

    public /* synthetic */ h1$$a(C1734h1 h1Var, C82381f fVar, JSONObject jSONObject, int i) {
        this.f11436d = h1Var;
        this.f11437e = fVar;
        this.f11438f = jSONObject;
        this.f11439g = i;
    }

    public final void run() {
        C1734h1 h1Var = this.f11436d;
        C82381f fVar = this.f11437e;
        JSONObject jSONObject = this.f11438f;
        int i = this.f11439g;
        h1Var.getClass();
        if (fVar == null) {
            Log.m105920e("MicroMsg.JsApiCompressImage.javayhu", "fail:component is null");
        } else if (jSONObject == null) {
            Log.m105928w("MicroMsg.JsApiCompressImage.javayhu", "fail:data is null");
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:invalid data");
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
            }
            fVar.mo109647a(i, h1Var.mo115115p("fail:invalid data", jSONObject2));
        } else {
            String optString = jSONObject.optString("src");
            if (Util.isNullOrNil(optString)) {
                Log.m105928w("MicroMsg.JsApiCompressImage.javayhu", "fail:data src is null");
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:data src is null");
                }
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("errno", 101);
                } catch (Exception e2) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e2);
                }
                fVar.mo109647a(i, h1Var.mo115115p("fail:data src is null", jSONObject3));
            } else if (fVar.getFileSystem() == null) {
                Log.m105928w("MicroMsg.JsApiCompressImage.javayhu", "fail:runtime fileSystem is null");
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:runtime fileSystem is null");
                }
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("errno", 4);
                } catch (Exception e3) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e3);
                }
                fVar.mo109647a(i, h1Var.mo115115p("fail:runtime fileSystem is null", jSONObject4));
            } else {
                int optInt = jSONObject.optInt("quality", 80);
                if (optInt < 1 || optInt > 100) {
                    Log.m105929w("MicroMsg.JsApiCompressImage.javayhu", "invalid quality %d", Integer.valueOf(optInt));
                    if (BuildInfo.DEBUG) {
                        Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1103006, "fail:param compress quality invalid");
                    }
                    JSONObject jSONObject5 = new JSONObject();
                    try {
                        jSONObject5.put("errno", 1103006);
                    } catch (Exception e4) {
                        Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e4);
                    }
                    fVar.mo109647a(i, h1Var.mo115115p("fail:param compress quality invalid", jSONObject5));
                    return;
                }
                int optInt2 = jSONObject.optInt("compressedWidth", -1);
                int optInt3 = jSONObject.optInt("compressedHeight", -1);
                Log.m105925i("MicroMsg.JsApiCompressImage.javayhu", "compressImage, quality:%d, src:%s", Integer.valueOf(optInt), optString);
                ThreadPool.post((Runnable) new C1736i1(h1Var, optString, fVar, optInt, optInt2, optInt3, new WeakReference(fVar), i), String.format(Locale.US, "AppBrandJsApiCompressImage[%s#%d]", new Object[]{optString, Integer.valueOf(optInt)}), 10);
            }
        }
    }
}
