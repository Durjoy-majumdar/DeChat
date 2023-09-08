package z73;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.webkit.JavascriptInterface;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39623j;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.plugin.websearch.webview.BaseWebSearchWebView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;
import oa1.C117731d;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: z73.c */
public abstract class C53760c {

    /* renamed from: a */
    public C53759a f150904a;

    public C53760c() {
        this((C53759a) null);
    }

    /* renamed from: a */
    public boolean mo73422a(int i, String str, int i2) {
        C87412m.m108594g(str, "feature");
        return false;
    }

    /* renamed from: b */
    public abstract MultiProcessMMKV mo73423b();

    /* renamed from: c */
    public abstract boolean mo73424c();

    /* renamed from: d */
    public final JSONObject mo74340d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ret", -1);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: e */
    public final JSONObject mo74341e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ret", 0);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @JavascriptInterface
    public final String getExpConfig(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String jSONObject2 = mo74341e().put("configResult", C117731d.m166007c().mo182444f(jSONObject.optString("key", ""), jSONObject.optString("defValue", ""), true, true)).toString();
            C87412m.m108593f(jSONObject2, "returnSuccess().put(\"con…esult\", value).toString()");
            return jSONObject2;
        } catch (Exception unused) {
            String jSONObject3 = mo74340d().toString();
            C87412m.m108593f(jSONObject3, "returnFail().toString()");
            return jSONObject3;
        }
    }

    @JavascriptInterface
    public final String getPermanentData(String str) {
        BaseWebSearchWebView webView;
        BaseWebSearchWebView webView2;
        Log.m105924i("MicroMsg.WebSearch.MultiProcessWebSearchJSApi", "getPermanentData " + str);
        try {
            String optString = new JSONObject(str).optString("key", "");
            String decodeString = mo73423b().decodeString(optString, "");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ret", 0);
            jSONObject.put("key", optString);
            jSONObject.put("value", decodeString);
            C53759a aVar = this.f150904a;
            if (!(aVar == null || (webView2 = aVar.getWebView()) == null)) {
                C53761n nVar = C53761n.f150905a;
                String jSONObject2 = jSONObject.toString();
                C87412m.m108593f(jSONObject2, "returnObj.toString()");
                nVar.mo74349a(webView2, "onPermanentDataReady", jSONObject2);
            }
            String jSONObject3 = mo74341e().toString();
            C87412m.m108593f(jSONObject3, "returnSuccess().toString()");
            return jSONObject3;
        } catch (Exception unused) {
            C53759a aVar2 = this.f150904a;
            if (!(aVar2 == null || (webView = aVar2.getWebView()) == null)) {
                C53761n nVar2 = C53761n.f150905a;
                String jSONObject4 = mo74340d().toString();
                C87412m.m108593f(jSONObject4, "returnFail().toString()");
                nVar2.mo74349a(webView, "onPermanentDataReady", jSONObject4);
            }
            String jSONObject5 = mo74340d().toString();
            C87412m.m108593f(jSONObject5, "returnFail().toString()");
            return jSONObject5;
        }
    }

    @JavascriptInterface
    public final String isActivityResume(String str) {
        BaseWebSearchWebView webView;
        Context context;
        C53759a aVar = this.f150904a;
        if (!(aVar == null || (webView = aVar.getWebView()) == null || (context = webView.getContext()) == null || !(context instanceof MutableContextWrapper))) {
            Context baseContext = ((MutableContextWrapper) context).getBaseContext();
            if ((baseContext instanceof AppCompatActivity) && ((AppCompatActivity) baseContext).getLifecycle().getCurrentState() == C39623j.C39626c.RESUMED) {
                String jSONObject = mo74341e().toString();
                C87412m.m108593f(jSONObject, "returnSuccess().toString()");
                return jSONObject;
            }
        }
        String jSONObject2 = mo74340d().toString();
        C87412m.m108593f(jSONObject2, "returnFail().toString()");
        return jSONObject2;
    }

    @JavascriptInterface
    public final String isAppForeground(String str) {
        return mo74341e().put("isAppForeground", mo73424c() ? 1 : 0).toString();
    }

    @JavascriptInterface
    public final String isSupportFeature(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
            String optString = jSONObject.optString("feature", "");
            int optInt2 = jSONObject.optInt(ProviderConstants.API_COLNAME_FEATURE_VERSION, 0);
            C87412m.m108593f(optString, "feature");
            String jSONObject2 = mo73422a(optInt, optString, optInt2) ? mo74341e().toString() : mo74340d().toString();
            C87412m.m108593f(jSONObject2, "{\n            val reques…)\n            }\n        }");
            return jSONObject2;
        } catch (Exception unused) {
            String jSONObject3 = mo74340d().toString();
            C87412m.m108593f(jSONObject3, "{\n            returnFail().toString()\n        }");
            return jSONObject3;
        }
    }

    @JavascriptInterface
    public final String removePermanentData(String str) {
        Log.m105924i("MicroMsg.WebSearch.MultiProcessWebSearchJSApi", "removePermanentData " + str);
        try {
            mo73423b().remove(new JSONObject(str).optString("key", ""));
            return mo74341e().toString();
        } catch (Exception unused) {
            return mo74340d().toString();
        }
    }

    @JavascriptInterface
    public final String savePermanentData(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("key", "");
            String optString2 = jSONObject.optString("value", "");
            boolean encode = mo73423b().encode(optString, optString2);
            Log.m105924i("MicroMsg.WebSearch.MultiProcessWebSearchJSApi", "savePermanentData key:" + optString + " value:" + optString2 + " result:" + encode);
            return encode ? mo74341e().toString() : mo74340d().toString();
        } catch (Exception unused) {
            return mo74340d().toString();
        }
    }

    public C53760c(C53759a aVar) {
        this.f150904a = aVar;
    }
}
