package cx0;

import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import bx0.C39846d;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import kj2.C117407d;
import org.json.JSONObject;
import zt3.C119157j;

/* renamed from: cx0.d */
public class C45215d {

    /* renamed from: a */
    public C39846d f122534a;

    /* renamed from: cx0.d$a */
    public class C45216a implements Runnable {
        public C45216a() {
        }

        public void run() {
            C45215d.this.f122534a.mo62491n0();
        }
    }

    /* renamed from: cx0.d$b */
    public class C45217b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ JSONObject f122536d;

        public C45217b(JSONObject jSONObject) {
            this.f122536d = jSONObject;
        }

        public void run() {
            String jSONObject = this.f122536d.toString();
            C39846d dVar = C45215d.this.f122534a;
            try {
                if (!Util.isNullOrNil("requestCompleted")) {
                    String nullAsNil = Util.nullAsNil(jSONObject);
                    Object[] objArr = new Object[2];
                    objArr[0] = "requestCompleted";
                    objArr[1] = (Util.isNullOrNil(nullAsNil) || nullAsNil.length() <= 50) ? nullAsNil : nullAsNil.substring(0, 50);
                    Log.m105925i("MicroMsg.Box.BoxJsEventNotifier", "notifyJsEvent %s %s", objArr);
                    dVar.mo62489l0().evaluateJavascript(String.format("javascript:boxJSApi['%s'] && boxJSApi.%s(%s)", new Object[]{"requestCompleted", "requestCompleted", nullAsNil}), (ValueCallback<String>) null);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Box.BoxJsEventNotifier", e, "notifyJsEvent", new Object[0]);
            }
        }
    }

    public C45215d(C39846d dVar) {
        this.f122534a = dVar;
    }

    /* renamed from: a */
    public void mo70692a(String str, int i, String str2, String str3) {
        Log.m105925i("MicroMsg.Box.BoxWebViewJSApi", "onDataReady %s %s %s", str, Integer.valueOf(i), str2);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("requestId", str);
            jSONObject.put("ret", i);
            jSONObject.put("data", str3);
            MMHandlerThread.postToMainThread(new C45217b(jSONObject));
        } catch (Exception unused) {
        }
    }

    @JavascriptInterface
    public void closePage() {
        Log.m105924i("MicroMsg.Box.BoxWebViewJSApi", "closePage");
        this.f122534a.dismiss();
    }

    @JavascriptInterface
    public void log(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Log.m105925i("MicroMsg.Box.BoxWebViewJSApi", "[%s][%s]", jSONObject.optString(FirebaseAnalytics.C113379b.LEVEL, ""), jSONObject.optString("msg", ""));
        } catch (Exception unused) {
        }
    }

    @JavascriptInterface
    public void openWeAppPage(String str) {
        Log.m105925i("MicroMsg.Box.BoxWebViewJSApi", "openWeAppPage %s", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("userName", "");
            String optString2 = jSONObject.optString("relativeURL", "");
            String optString3 = jSONObject.optString("sceneNote", "");
            StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
            StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
            aVar.f9526a = optString;
            aVar.f9527b = optString2;
            aVar.f9529d = jSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1000);
            startAppBrandUIFromOuterEvent.f9522d.f9530e = optString3;
            startAppBrandUIFromOuterEvent.publish();
        } catch (Exception unused) {
        }
    }

    @JavascriptInterface
    public void reportKV(String str) {
        Log.m105925i("MicroMsg.Box.BoxWebViewJSApi", "reportKV %s", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            C117407d.INSTANCE.kvStat(jSONObject.optInt("logid", 0), jSONObject.optString("msg", ""));
        } catch (Exception unused) {
        }
    }

    @JavascriptInterface
    public void request(String str) {
        Log.m105925i("MicroMsg.Box.BoxWebViewJSApi", "request %s", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f122534a.mo62490m0().mo70691a(jSONObject.optString("requestId", ""), jSONObject.optString("data", ""));
        } catch (Exception unused) {
        }
    }

    @JavascriptInterface
    public void webviewUIReady() {
        Log.m105924i("MicroMsg.Box.BoxWebViewJSApi", "webviewUIReady");
        ((C119157j) C119157j.f356862d).mo183895z(new C45216a());
    }
}
