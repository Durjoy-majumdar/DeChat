package t83;

import a70.C112760b;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.core.C43520v;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44307k0;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.WebView;
import com.tencent.xweb.XWebScript;
import di3.C86312j;
import g93.C32355a;
import h81.C32735h;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import rx3.C36570n;
import s24.C90125c;
import t83.C13851h1;

/* renamed from: t83.f1 */
public class C48583f1 {

    /* renamed from: f */
    public static int f129965f = -1;

    /* renamed from: g */
    public static String f129966g;

    /* renamed from: h */
    public static final String f129967h = (C112760b.m154225d() + "/jscache/");

    /* renamed from: a */
    public WebView f129968a;

    /* renamed from: b */
    public C48590l f129969b;

    /* renamed from: c */
    public C48584a f129970c;

    /* renamed from: d */
    public boolean f129971d;

    /* renamed from: e */
    public boolean f129972e = false;

    /* renamed from: t83.f1$a */
    public interface C48584a {
    }

    public C48583f1(WebView webView, C48590l lVar, C48584a aVar, boolean z) {
        this.f129968a = webView;
        this.f129969b = lVar;
        this.f129970c = aVar;
        this.f129971d = z;
        Log.m105919d("MicroMsg.JsLoader", "JsLoader <init>, isWebViewPreload %b", Boolean.valueOf(z));
        Log.m105925i("MicroMsg.JsLoader", "JsLoader <init>, jsapi: %d, this: %d", Integer.valueOf(lVar.hashCode()), Integer.valueOf(hashCode()));
    }

    /* renamed from: b */
    public static void m53972b(String str, String str2) {
        InputStream open = MMApplicationContext.getContext().getAssets().open(str);
        OutputStream K = C86013q1.m106429K(str2, false);
        byte[] bArr = new byte[1024];
        while (true) {
            int read = open.read(bArr);
            if (read > 0) {
                K.write(bArr, 0, read);
            } else {
                open.close();
                K.close();
                Log.m105924i("MicroMsg.JsLoader", "copy asset to:" + str2);
                return;
            }
        }
    }

    /* renamed from: d */
    public static boolean m53973d(WebView webView) {
        C43520v.C43521b bVar = C43520v.f117665a;
        if (((Boolean) ((C36570n) C43520v.f117666b).getValue()).booleanValue()) {
            Log.m105924i("MicroMsg.JsLoader", "local disableWXJSCodeCache");
            return false;
        }
        if (f129965f == -1) {
            f129965f = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_xweb_code_cache, 0);
        }
        return ((f129965f & 1) != 0 || BuildInfo.IS_FLAVOR_RED || BuildInfo.DEBUG) && webView.supportFeature(2002);
    }

    /* renamed from: a */
    public void mo73197a(String str) {
        Log.m105925i("MicroMsg.JsLoader", "auth url: %s", str);
        if (this.f129968a == null || this.f129969b == null) {
            Log.m105920e("MicroMsg.JsLoader", "auth, viewWV or jsapi is null");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("state", "authorized");
        if (str != null) {
            hashMap.put("fullUrl", str);
        }
        this.f129969b.mo73262v0(true);
        this.f129969b.mo73236e0("sys:auth", hashMap, (JSONObject) null);
    }

    /* renamed from: c */
    public void mo73198c() {
        C48590l lVar;
        String str;
        Log.m105924i("MicroMsg.JsLoader", "inject");
        boolean z = false;
        if (this.f129971d) {
            Log.m105924i("MicroMsg.JsLoader", "loadJavaScript jsapi init done by preload");
            C48590l lVar2 = this.f129969b;
            if (lVar2 != null) {
                lVar2.mo73262v0(true);
            }
        } else if (this.f129968a == null || (lVar = this.f129969b) == null) {
            Log.m105920e("MicroMsg.JsLoader", "loadJavaScript build, viewWV is null");
            this.f129972e = z;
        } else {
            lVar.f130013r = true;
            long currentTimeMillis = System.currentTimeMillis();
            boolean isXWalkKernel = this.f129968a.isXWalkKernel();
            if (m53973d(this.f129968a)) {
                Log.m105925i("MicroMsg.JsLoader", "tryCopyAsset: %s", "jsapi/wxjs.js");
                String str2 = f129966g;
                if (str2 == null) {
                    String str3 = BuildInfo.REV;
                    str2 = str3.substring(0, Math.min(str3.length(), 8));
                    f129966g = str2;
                }
                StringBuilder sb = new StringBuilder();
                String str4 = f129967h;
                sb.append(str4);
                sb.append(str2);
                sb.append("/");
                sb.append("jsapi/wxjs.js");
                String sb4 = sb.toString();
                if (!C86013q1.m106450k(sb4)) {
                    C32355a.m39691c(86);
                    C86009m1[] w = new C86009m1(str4).mo119986w(new C36978e1(str2));
                    if (w != null && w.length > 0) {
                        for (C86009m1 n : w) {
                            C86013q1.m106445f(n.mo119976n());
                        }
                    }
                    C86013q1.m106461v(C86013q1.m106458s(sb4));
                    try {
                        m53972b("jsapi/wxjs.js", sb4);
                        C32355a.m39691c(87);
                    } catch (Exception e) {
                        Log.m105921e("MicroMsg.JsLoader", "tryCopyAsset, failed, ", e);
                        sb4 = null;
                    }
                }
                if (sb4 != null) {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (currentTimeMillis2 >= 0) {
                        C32355a.m39691c(84);
                        XWebScript xWebScript = new XWebScript(3, 256, this.f129968a);
                        xWebScript.setJsSrcAsPath(sb4);
                        this.f129968a.evaluateJavascript(xWebScript.toString(), new C48577c1(this, currentTimeMillis2, currentTimeMillis, isXWalkKernel));
                        this.f129969b.mo73266x0();
                    }
                }
            }
            C32355a.m39691c(82);
            WebView webView = this.f129968a;
            Log.m105925i("MicroMsg.JsLoader", "WXJS: %s", "jsapi/wxjs.js");
            try {
                str = new String(C90125c.m112776c(MMApplicationContext.getContext().getAssets().open("jsapi/wxjs.js")));
                if (!TextUtils.isEmpty(this.f129969b.f130012q)) {
                    C48590l lVar3 = this.f129969b;
                    Log.m105925i("MicroMsg.JsLoader", "getWXJS, ranDomStr = %s, jsapi: %d, jsLoader: %d", lVar3.f130012q, Integer.valueOf(lVar3.hashCode()), Integer.valueOf(hashCode()));
                    str = str.replaceFirst("\\$\\{dgtVerifyRandomStr\\}", this.f129969b.f130012q).replaceFirst("\\$\\{dgtVerifyEnabled\\}", "true");
                }
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.JsLoader", "tryInterceptBridgeScriptRequest, failed, ", e2);
                str = "";
            }
            webView.evaluateJavascript(str, new C48579d1(this, currentTimeMillis, isXWalkKernel));
            this.f129969b.mo73266x0();
        }
        z = true;
        this.f129972e = z;
    }

    /* renamed from: e */
    public void mo73199e() {
        C48590l lVar;
        C48584a aVar;
        MMWebView mMWebView;
        if (this.f129968a == null || (lVar = this.f129969b) == null) {
            Log.m105920e("MicroMsg.JsLoader", "ready, viewWV or jsapi is null");
            return;
        }
        lVar.getClass();
        Log.m105926v("MicroMsg.JsApiHandler", "jsapi init");
        if (lVar.f129996a == null) {
            Log.m105928w("MicroMsg.JsApiHandler", "jsapi init wv is null");
        } else {
            lVar.mo73266x0();
            MMWebView mMWebView2 = lVar.f129996a;
            mMWebView2.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + C13851h1.C13852a.m13143c("sys:init", (Map<String, Object>) null, lVar.f130011p, lVar.f130012q) + ")", new C13865z(lVar));
            MMWebView mMWebView3 = lVar.f129996a;
            mMWebView3.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + C13851h1.C13852a.m13143c("sys:bridged", (Map<String, Object>) null, lVar.f130011p, lVar.f130012q) + ")", new C13850h0(lVar));
            lVar.mo73262v0(true);
            lVar.mo8700d();
            if (!Util.isNullOrNil(lVar.f129992L) && (mMWebView = lVar.f129996a) != null) {
                mMWebView.evaluateJavascript(lVar.mo73263w(lVar.f129992L, lVar.f129993M), (ValueCallback<String>) null);
                lVar.f129992L = null;
                lVar.f129993M = 0;
            }
        }
        Log.m105924i("MicroMsg.JsLoader", "jsapi init done");
        if (C36979g1.m41111a()) {
            try {
                String str = new String(C90125c.m112776c(MMApplicationContext.getContext().getAssets().open("jsapi/vconsole.js")));
                WebView webView = this.f129968a;
                if (webView != null) {
                    webView.evaluateJavascript(str, (ValueCallback<String>) null);
                }
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.JsLoader", e, "openVConsole", new Object[0]);
            }
        }
        Log.m105925i("MicroMsg.JsLoader", "onTimerExpired, js loaded ret = %b", Boolean.valueOf(this.f129972e));
        if (this.f129972e && (aVar = this.f129970c) != null) {
            C44307k0 k0Var = C44307k0.this;
            k0Var.mo68631X(k0Var.f120077g);
        }
        C115669n nVar = C115669n.INSTANCE;
        nVar.idkeyStat(156, 1, 1, false);
        if (!this.f129972e) {
            nVar.idkeyStat(156, 0, 1, false);
        }
    }
}
