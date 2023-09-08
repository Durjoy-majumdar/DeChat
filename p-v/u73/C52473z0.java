package u73;

import a70.C112760b;
import android.net.Uri;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.CookieManager;
import com.tencent.xweb.WebSettings;
import di3.C86312j;
import e00.C45519s0;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import t83.C48574a1;
import zt3.C119157j;

/* renamed from: u73.z0 */
public class C52473z0 {

    /* renamed from: a */
    public String f146616a = "MicroMsg.WebSearch.WebSearchPreloadMgr";

    /* renamed from: b */
    public int f146617b;

    /* renamed from: c */
    public AtomicBoolean f146618c = new AtomicBoolean(false);

    /* renamed from: d */
    public List<C52462f1> f146619d = new LinkedList();

    /* renamed from: e */
    public long f146620e;

    /* renamed from: u73.z0$b */
    public static class C14138b {
        /* renamed from: a */
        public static JSONObject m13478a(Map<String, Object> map) {
            if (map == null || map.size() == 0) {
                return new JSONObject();
            }
            try {
                JSONObject jSONObject = new JSONObject();
                for (String next : map.keySet()) {
                    if (next != null) {
                        jSONObject.put(next, map.get(next));
                    }
                }
                return jSONObject;
            } catch (Exception e) {
                Log.m105920e("MicroMsg.WebViewPreLoadMgr.Builder", "convertMapToJSON fail, exception = " + e.getMessage());
                return null;
            }
        }

        /* renamed from: b */
        public static String m13479b(String str, Map<String, Object> map, boolean z, String str2) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("__msg_type", "event");
                jSONObject.put("__event_id", str);
                jSONObject.put("__params", m13478a(map));
                return jSONObject.toString();
            } catch (Exception e) {
                Log.m105920e("MicroMsg.WebViewPreLoadMgr.Builder", "build fail, exception = " + e.getMessage());
                return null;
            }
        }
    }

    /* renamed from: u73.z0$a */
    public class C52474a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f146621d;

        public C52474a(String str) {
            this.f146621d = str;
        }

        public void run() {
            int i;
            C52473z0 z0Var = C52473z0.this;
            String str = this.f146621d;
            Log.m105925i(z0Var.f146616a, "real start preloadWebView cached webview preloadBiz %d", Integer.valueOf(z0Var.f146617b));
            z0Var.f146620e = System.currentTimeMillis();
            MMWebView a = MMWebView.C45103b.m49948a(MMApplicationContext.getContext());
            Log.m105925i(z0Var.f146616a, "Create MMWebView %s", a.getCurrentInstanceWebCoreType());
            a.setPreload(true);
            a.setRandomStr(Util.getRandomString(16));
            a.getSettings().setJavaScriptEnabled(true);
            a.getSettings().setDomStorageEnabled(true);
            a.getSettings().setBuiltInZoomControls(false);
            a.getSettings().setUseWideViewPort(true);
            a.getSettings().setLoadWithOverviewMode(true);
            a.getSettings().setSavePassword(false);
            a.getSettings().setSaveFormData(false);
            a.getSettings().setGeolocationEnabled(true);
            a.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
            a.getSettings().setMixedContentMode(0);
            a.getSettings().setAppCacheMaxSize(10485760);
            a.getSettings().setAppCachePath(a.getContext().getDir("webviewcache", 0).getAbsolutePath());
            a.getSettings().setAppCacheEnabled(true);
            a.getSettings().setDatabaseEnabled(true);
            WebSettings settings = a.getSettings();
            settings.setDatabasePath(C112760b.m154216X() + "databases/");
            CookieManager.getInstance().setAcceptCookie(true);
            CookieManager.getInstance().setAcceptThirdPartyCookies(a, true);
            a.getSettings().setUserAgentString(((C45519s0) C86312j.m106911c(C45519s0.class)).mo70763Bi(a.getContext(), a.getSettings().getUserAgentString()));
            C48574a1 a1Var = new C48574a1();
            a.addJavascriptInterface(a1Var, "__wx");
            a.loadUrl(str);
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter("sessionId");
            String queryParameter2 = parse.getQueryParameter("subSessionId");
            try {
                i = Integer.valueOf(parse.getQueryParameter(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)).intValue();
            } catch (Exception unused) {
                i = 0;
            }
            a.setWebViewClient(new C52455a1(z0Var, a, new C52462f1(a, queryParameter, queryParameter2, a1Var, i)));
            C115669n.INSTANCE.mo160131h(15005, Integer.valueOf(z0Var.f146617b), 1, 0);
        }
    }

    public C52473z0(int i) {
        this.f146617b = i;
        this.f146616a += "_" + i;
    }

    /* renamed from: a */
    public void mo73417a(String str) {
        if (!MMApplicationContext.isToolsProcess()) {
            Log.m105924i(this.f146616a, "preload please call from tools proc");
        } else if (this.f146618c.get()) {
            Log.m105925i(this.f146616a, "preloading webview %s", Integer.valueOf(this.f146617b));
        } else if (((LinkedList) this.f146619d).size() > 0) {
            Log.m105925i(this.f146616a, "already preload webview %s", Integer.valueOf(this.f146617b));
        } else {
            this.f146618c.set(true);
            Log.m105925i(this.f146616a, "start to preload webview %d", Integer.valueOf(this.f146617b));
            ((C119157j) C119157j.f356862d).mo183895z(new C52474a(str));
        }
    }
}
