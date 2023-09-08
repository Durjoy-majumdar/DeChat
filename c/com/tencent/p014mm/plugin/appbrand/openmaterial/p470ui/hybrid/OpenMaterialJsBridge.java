package com.tencent.p014mm.plugin.appbrand.openmaterial.p470ui.hybrid;

import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;
import iq0.C98783b;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import lq0.C109419d;
import lq0.C109420e;
import org.json.JSONArray;
import org.json.JSONObject;
import rx3.C13598b0;
import z04.C112551y;
import z04.C119027c;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b$\u0010%J$\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eJ\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\nH\u0007R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006&"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/openmaterial/ui/hybrid/OpenMaterialJsBridge;", "", "", "htmlTemplateContent", "Liq0/b;", "scene", "", "Lcom/tencent/mm/plugin/appbrand/openmaterial/model/AppBrandOpenMaterialDetailModel;", "openMaterialDetailModels", "attachMyOpenMaterials2Template", "", "launchJsonStr", "Lrx3/b0;", "launchWeApp", "", "newHeight", "onWindowHeightChange", "weAppJsonStr", "onWeAppExposure", "Lcom/tencent/mm/ui/widget/MMWebView;", "webView", "Lcom/tencent/mm/ui/widget/MMWebView;", "Llq0/d;", "launchWeAppDelegate", "Llq0/d;", "getLaunchWeAppDelegate", "()Llq0/d;", "setLaunchWeAppDelegate", "(Llq0/d;)V", "Llq0/e;", "weAppExposureDelegate", "Llq0/e;", "getWeAppExposureDelegate", "()Llq0/e;", "setWeAppExposureDelegate", "(Llq0/e;)V", "<init>", "(Lcom/tencent/mm/ui/widget/MMWebView;)V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.OpenMaterialJsBridge */
public final class OpenMaterialJsBridge {
    private C109419d launchWeAppDelegate;
    private C109420e weAppExposureDelegate;
    /* access modifiers changed from: private */
    public final MMWebView webView;

    /* renamed from: com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.OpenMaterialJsBridge$a */
    public static final class C29609a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f80537d;

        /* renamed from: e */
        public final /* synthetic */ OpenMaterialJsBridge f80538e;

        /* renamed from: com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.OpenMaterialJsBridge$a$a */
        public static final class C29610a<T> implements ValueCallback {

            /* renamed from: a */
            public static final C29610a<T> f80539a = new C29610a<>();

            public void onReceiveValue(Object obj) {
                Log.m105924i("MicroMsg.AppBrand.OpenMaterialJsBridge", "onWindowHeightChange, result: " + ((String) obj));
            }
        }

        public C29609a(String str, OpenMaterialJsBridge openMaterialJsBridge) {
            this.f80537d = str;
            this.f80538e = openMaterialJsBridge;
        }

        public final void run() {
            String format = String.format("javascript:OpenMaterialJsApi['%s'] && OpenMaterialJsApi.%s(%s)", Arrays.copyOf(new Object[]{"onWindowHeightChange", "onWindowHeightChange", this.f80537d}, 3));
            C87412m.m108593f(format, "format(this, *args)");
            this.f80538e.webView.evaluateJavascript(format, C29610a.f80539a);
        }
    }

    public OpenMaterialJsBridge(MMWebView mMWebView) {
        C87412m.m108594g(mMWebView, "webView");
        this.webView = mMWebView;
    }

    public final byte[] attachMyOpenMaterials2Template(byte[] bArr, C98783b bVar, List<? extends AppBrandOpenMaterialDetailModel> list) {
        C87412m.m108594g(bArr, "htmlTemplateContent");
        C87412m.m108594g(bVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        C87412m.m108594g(list, "openMaterialDetailModels");
        Log.m105924i("MicroMsg.AppBrand.OpenMaterialJsBridge", "attachMyOpenMaterials2Template, scene: " + bVar.f289612d);
        JSONArray jSONArray = new JSONArray();
        for (AppBrandOpenMaterialDetailModel appBrandOpenMaterialDetailModel : list) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("appId", appBrandOpenMaterialDetailModel.f311218d.f311222d);
                jSONObject.put("versionType", appBrandOpenMaterialDetailModel.f311218d.f311223e);
                jSONObject.put("enterPath", appBrandOpenMaterialDetailModel.f311218d.f311224f);
                jSONObject.put("iconUrl", appBrandOpenMaterialDetailModel.f311218d.f311225g);
                jSONObject.put("functionName", appBrandOpenMaterialDetailModel.f311218d.f311226h);
                jSONObject.put("functionDesc", appBrandOpenMaterialDetailModel.f311221g);
                JSONArray jSONArray2 = new JSONArray();
                List<String> list2 = appBrandOpenMaterialDetailModel.f311219e;
                C87412m.m108593f(list2, "openMaterialDetailModel.categories");
                for (String put : list2) {
                    jSONArray2.put(put);
                }
                C13598b0 b0Var = C13598b0.f38549a;
                jSONObject.put("functionCategories", jSONArray2);
                jSONObject.put(FirebaseAnalytics.C113379b.SCORE, Float.valueOf(appBrandOpenMaterialDetailModel.f311220f));
                jSONArray.put(jSONObject);
            } catch (Exception e) {
                Log.m105928w("MicroMsg.AppBrand.OpenMaterialJsBridge", "attachMyOpenMaterials2Template, " + appBrandOpenMaterialDetailModel + " to json fail since " + e);
            }
        }
        String jSONArray3 = jSONArray.toString();
        C87412m.m108593f(jSONArray3, "openMaterialDetailsJson.toString()");
        Charset charset = C119027c.f356488a;
        String str = new String(bArr, charset);
        String str2 = bVar.f289612d;
        C87412m.m108593f(str2, "scene.myName");
        byte[] bytes = C112551y.m153814n(C112551y.m153814n(str, "###scene###", str2, false), "###preloadObjFeedsData###", jSONArray3, false).getBytes(charset);
        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public final C109419d getLaunchWeAppDelegate() {
        return this.launchWeAppDelegate;
    }

    public final C109420e getWeAppExposureDelegate() {
        return this.weAppExposureDelegate;
    }

    @JavascriptInterface
    public final void launchWeApp(String str) {
        C87412m.m108594g(str, "launchJsonStr");
        Log.m105924i("MicroMsg.AppBrand.OpenMaterialJsBridge", "launchWeApp, launchJsonStr: " + str);
        C109419d dVar = this.launchWeAppDelegate;
        if (dVar == null) {
            Log.m105928w("MicroMsg.AppBrand.OpenMaterialJsBridge", "launchWeApp, launchWeAppDelegateSnapshot is null");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("appId");
            int i = jSONObject.getInt("versionType");
            String string2 = jSONObject.getString("enterPath");
            C87412m.m108593f(string, "appId");
            C87412m.m108593f(string2, "enterPath");
            dVar.mo158299a(string, i, string2);
        } catch (Exception e) {
            Log.m105928w("MicroMsg.AppBrand.OpenMaterialJsBridge", "launchWeApp, fail since " + e);
        }
    }

    @JavascriptInterface
    public final void onWeAppExposure(String str) {
        C87412m.m108594g(str, "weAppJsonStr");
        Log.m105924i("MicroMsg.AppBrand.OpenMaterialJsBridge", "onWeAppExposure, weAppJsonStr: " + str);
        C109420e eVar = this.weAppExposureDelegate;
        if (eVar == null) {
            Log.m105928w("MicroMsg.AppBrand.OpenMaterialJsBridge", "onWeAppExposure, weAppExposureDelegateSnapshot is null");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("appId");
            int i = jSONObject.getInt("versionType");
            String string2 = jSONObject.getString("enterPath");
            C87412m.m108593f(string, "appId");
            C87412m.m108593f(string2, "enterPath");
            eVar.mo158301a(string, i, string2);
        } catch (Exception e) {
            Log.m105928w("MicroMsg.AppBrand.OpenMaterialJsBridge", "onWeAppExposure, fail since " + e);
        }
    }

    public final void onWindowHeightChange(int i) {
        Log.m105924i("MicroMsg.AppBrand.OpenMaterialJsBridge", "onWindowHeightChange, newHeight: " + i);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("height", i);
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "json.toString()");
            ((C119157j) C119157j.f356862d).mo183895z(new C29609a(jSONObject2, this));
        } catch (Exception e) {
            Log.m105928w("MicroMsg.AppBrand.OpenMaterialJsBridge", "onWindowHeightChange, fail since " + e);
        }
    }

    public final void setLaunchWeAppDelegate(C109419d dVar) {
        this.launchWeAppDelegate = dVar;
    }

    public final void setWeAppExposureDelegate(C109420e eVar) {
        this.weAppExposureDelegate = eVar;
    }
}
