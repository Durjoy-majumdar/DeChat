package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.os.Build;
import android.webkit.ValueCallback;
import com.eclipsesource.mmv8.Platform;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82547i7;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import gy3.C87412m;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import p156gj.C87203t;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.l */
public abstract class C82559l extends C82510g implements C82554k {

    /* renamed from: v */
    public final String f241665v = "AppBrandComponentWxaSharedKT";

    /* renamed from: W */
    public void mo114331W(JSONObject jSONObject) {
        C87412m.m108594g(jSONObject, "config");
        mo114332X(jSONObject);
        mo114881c0(jSONObject, "system", "Android " + Build.VERSION.RELEASE);
        mo114881c0(jSONObject, "pixelRatio", Float.valueOf(((C81879g) this).getContext().getResources().getDisplayMetrics().density));
    }

    /* renamed from: X */
    public void mo114332X(JSONObject jSONObject) {
        C87412m.m108594g(jSONObject, "provideConfig");
        C82547i7.C82548a aVar = C82547i7.f241644a;
        aVar.mo114875a(jSONObject, "platform", Platform.ANDROID);
        aVar.mo114875a(jSONObject, "brand", Build.BRAND);
        aVar.mo114875a(jSONObject, "model", C87203t.m108275k());
    }

    /* renamed from: Y */
    public JSONObject mo114333Y() {
        JSONObject jSONObject = new JSONObject();
        mo114331W(jSONObject);
        mo114881c0(jSONObject, "preload", Boolean.TRUE);
        return jSONObject;
    }

    /* renamed from: Z */
    public final void mo114880Z(JSONObject jSONObject) {
        C87412m.m108594g(jSONObject, "__wxConfig");
        C83165i jsRuntime = getJsRuntime();
        jsRuntime.evaluateJavascript("var __wxConfig = " + jSONObject, (ValueCallback<String>) null);
    }

    /* renamed from: a0 */
    public abstract boolean mo114334a0();

    /* renamed from: b0 */
    public abstract boolean mo114335b0();

    /* renamed from: c0 */
    public final void mo114881c0(JSONObject jSONObject, String str, Object obj) {
        C87412m.m108594g(jSONObject, "obj");
        C87412m.m108594g(str, "key");
        try {
            jSONObject.put(str, obj);
        } catch (Exception e) {
            String str2 = this.f241665v;
            Log.printErrStackTrace(str2, e, "put with key(" + str + ')', new Object[0]);
        }
    }

    /* renamed from: o */
    public final void mo109670o(Runnable runnable, long j) {
        C13598b0 b0Var;
        if (runnable != null) {
            AppBrandRuntime runtime = getRuntime();
            if (runtime != null) {
                runtime.mo113025Q0(runnable, j);
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var != null) {
                return;
            }
            if (mo114334a0() || mo114335b0()) {
                MMHandlerThread.postToMainThreadDelayed(runnable, j);
            }
        }
    }

    /* renamed from: t */
    public final void mo109673t(Runnable runnable) {
        C13598b0 b0Var;
        if (runnable != null) {
            AppBrandRuntime runtime = getRuntime();
            if (runtime != null) {
                runtime.mo113024P0(runnable);
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var != null) {
                return;
            }
            if (mo114334a0() || mo114335b0()) {
                MMHandlerThread.postToMainThread(runnable);
            }
        }
    }

    /* renamed from: v */
    public C82870p mo109675v(String str) {
        C87412m.m108594g(str, "apiName");
        return (C82870p) ((ConcurrentHashMap) this.f241586h).get(str);
    }
}
