package com.tencent.p014mm.plugin.webview.p128ui.tools.fts;

import android.net.http.SslError;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import com.tencent.p014mm.autogen.mmdata.rpt.FTSRelatedSugH5ReportStruct;
import com.tencent.p014mm.plugin.webview.core.C43505b0;
import com.tencent.p014mm.plugin.webview.core.C43519u;
import com.tencent.p014mm.plugin.webview.core.C43522y;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.SslErrorHandler;
import com.tencent.xweb.WebResourceRequest;
import com.tencent.xweb.WebResourceResponse;
import com.tencent.xweb.WebView;
import eb0.C31543z5;
import java.lang.ref.WeakReference;
import p823sg.C48377f;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.SosWebViewUI */
public class SosWebViewUI extends WebViewUI {

    /* renamed from: S2 */
    public static final /* synthetic */ int f119070S2 = 0;

    /* renamed from: I2 */
    public boolean f119071I2 = false;

    /* renamed from: J2 */
    public int f119072J2 = 0;

    /* renamed from: K2 */
    public int f119073K2 = 0;

    /* renamed from: L2 */
    public int f119074L2 = 0;

    /* renamed from: M2 */
    public String f119075M2 = "";

    /* renamed from: N2 */
    public FTSRelatedSugH5ReportStruct f119076N2 = new FTSRelatedSugH5ReportStruct();

    /* renamed from: O2 */
    public boolean f119077O2 = false;

    /* renamed from: P2 */
    public int f119078P2 = 0;

    /* renamed from: Q2 */
    public MMHandler f119079Q2 = new C43955a(Looper.getMainLooper());

    /* renamed from: R2 */
    public C43956b f119080R2 = new C43956b();

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.SosWebViewUI$a */
    public class C43955a extends MMHandler {
        public C43955a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            if (message.what == 0) {
                try {
                    SosWebViewUI sosWebViewUI = SosWebViewUI.this;
                    int i = SosWebViewUI.f119070S2;
                    sosWebViewUI.f118523f.evaluateJavascript("javascript:window.SosJSApi.onHtmlContentReport('<body>'+document.getElementsByTagName('body')[0].innerHTML+'</body>');", (ValueCallback<String>) null);
                } catch (Throwable th) {
                    Log.printErrStackTrace("MicroMsg.WebSearch.SosWebViewUI", th, "pageHandler", new Object[0]);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.SosWebViewUI$b */
    public class C43956b extends C43505b0 {

        /* renamed from: c */
        public C43957a f119082c = new C43957a();

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.SosWebViewUI$b$a */
        public class C43957a extends C43519u {
            public C43957a() {
            }

            /* renamed from: c */
            public void mo64753c(WebView webView, String str) {
                SosWebViewUI.this.f119079Q2.removeMessages(0);
                SosWebViewUI sosWebViewUI = SosWebViewUI.this;
                if (!sosWebViewUI.f119071I2) {
                    sosWebViewUI.f119079Q2.sendEmptyMessageDelayed(0, 1000);
                }
            }

            /* renamed from: d */
            public void mo62156d(WebView webView, String str) {
                SosWebViewUI sosWebViewUI = SosWebViewUI.this;
                sosWebViewUI.f119075M2 = str;
                sosWebViewUI.f119079Q2.removeMessages(0);
            }

            /* renamed from: e */
            public void mo64754e(WebView webView, int i, String str, String str2) {
                String str3 = SosWebViewUI.this.f119075M2;
                if (str3 != null && str3.equals(str2)) {
                    Log.m105925i("MicroMsg.WebSearch.SosWebViewUI", "onReceivedError %d %s", Integer.valueOf(i), str);
                    SosWebViewUI sosWebViewUI = SosWebViewUI.this;
                    sosWebViewUI.f119074L2 = i;
                    SosWebViewUI.m48200I9(sosWebViewUI, "", 0);
                }
            }

            /* renamed from: g */
            public void mo64756g(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                String str;
                String str2 = SosWebViewUI.this.f119075M2;
                if (str2 != null && str2.equals(webResourceRequest.getUrl().toString())) {
                    SosWebViewUI.this.f119074L2 = webResourceResponse.getStatusCode();
                    int i = SosWebViewUI.this.f119074L2;
                    if (i < 400 || i >= 600) {
                        Log.m105925i("MicroMsg.WebSearch.SosWebViewUI", "onReceivedHttpError not report %s %d", webResourceRequest.getUrl().toString(), Integer.valueOf(SosWebViewUI.this.f119074L2));
                        return;
                    }
                    try {
                        str = new String(C48377f.m53723b(webResourceResponse.getData()));
                    } catch (Throwable unused) {
                        str = "";
                    }
                    Log.m105925i("MicroMsg.WebSearch.SosWebViewUI", "onReceivedHttpError %s %d %s", webResourceRequest.getUrl().toString(), Integer.valueOf(SosWebViewUI.this.f119074L2), str);
                    SosWebViewUI.m48200I9(SosWebViewUI.this, str, 0);
                }
            }

            /* renamed from: h */
            public void mo64757h(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                String str = SosWebViewUI.this.f119075M2;
                if (str != null && str.equals(sslError.getUrl())) {
                    Log.m105924i("MicroMsg.WebSearch.SosWebViewUI", "onReceivedSslError");
                    SosWebViewUI sosWebViewUI = SosWebViewUI.this;
                    sosWebViewUI.f119074L2 = -1;
                    SosWebViewUI.m48200I9(sosWebViewUI, "", 0);
                }
            }
        }

        public C43956b() {
        }

        /* renamed from: b */
        public C43519u mo67776b() {
            return this.f119082c;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.SosWebViewUI$c */
    public static class C43958c {

        /* renamed from: a */
        public WeakReference<SosWebViewUI> f119085a = null;

        public C43958c(SosWebViewUI sosWebViewUI) {
            this.f119085a = new WeakReference<>(sosWebViewUI);
        }

        @JavascriptInterface
        public void onHtmlContentReport(String str) {
            WeakReference<SosWebViewUI> weakReference = this.f119085a;
            if (weakReference == null) {
                Log.m105924i("MicroMsg.WebSearch.SosWebViewUI", "onHtmlContentReport webViewUIWeakReference is null.");
                return;
            }
            SosWebViewUI sosWebViewUI = weakReference.get();
            if (sosWebViewUI != null) {
                SosWebViewUI.m48200I9(sosWebViewUI, str, 0);
            } else {
                Log.m105924i("MicroMsg.WebSearch.SosWebViewUI", "onHtmlContentReport tmpSosWebViewUI is null.");
            }
        }
    }

    /* renamed from: I9 */
    public static void m48200I9(SosWebViewUI sosWebViewUI, String str, int i) {
        String[] split;
        if (!sosWebViewUI.f119071I2 && sosWebViewUI.f119072J2 != 0) {
            sosWebViewUI.f119071I2 = true;
            if (!Util.isNullOrNil(sosWebViewUI.f118476N) && sosWebViewUI.f118476N.startsWith("wes") && (split = sosWebViewUI.f118476N.split("#")) != null && split.length >= 5) {
                if (sosWebViewUI.f119074L2 == 0) {
                    sosWebViewUI.f119074L2 = 200;
                }
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("deadlinks=1&scene=");
                stringBuffer.append(sosWebViewUI.f119072J2);
                stringBuffer.append("&searchid=");
                stringBuffer.append(split[1]);
                stringBuffer.append("&businesstype=");
                stringBuffer.append(split[2]);
                stringBuffer.append("&docid=");
                stringBuffer.append(split[3]);
                stringBuffer.append("&subtype=");
                stringBuffer.append(sosWebViewUI.f119073K2);
                stringBuffer.append("&contentlength=");
                stringBuffer.append(str.length());
                stringBuffer.append("&status=");
                stringBuffer.append(sosWebViewUI.f119074L2);
                stringBuffer.append("&httpstatus=");
                stringBuffer.append(i);
                Log.m105925i("MicroMsg.WebSearch.SosWebViewUI", "reportHtmlStatus %s", stringBuffer.toString());
                Bundle bundle = new Bundle();
                bundle.putString("reportString", stringBuffer.toString());
                try {
                    sosWebViewUI.f118511a1.mo68149vj(8, bundle);
                } catch (RemoteException e) {
                    Log.printErrStackTrace("MicroMsg.WebSearch.SosWebViewUI", e, "reportHtmlStatus", new Object[0]);
                }
            }
        }
    }

    /* renamed from: M7 */
    public C43522y mo63701M7() {
        C43522y M7 = super.mo63701M7();
        M7.mo67679J(this.f119080R2);
        return M7;
    }

    /* renamed from: S7 */
    public boolean mo63702S7() {
        return !getIntent().getBooleanExtra("disable_minimize", false);
    }

    /* renamed from: X8 */
    public void mo68266X8(WebView webView, String str) {
        super.mo68266X8(webView, str);
        if (this.f119077O2) {
            this.f119078P2++;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f118523f.addJavascriptInterface(new C43958c(this), "SosJSApi");
        boolean z = false;
        this.f119072J2 = getIntent().getIntExtra("from_scence", 0);
        this.f119073K2 = getIntent().getIntExtra("subtype", 0);
        this.f119075M2 = getIntent().getStringExtra("rawUrl");
        String stringExtra = getIntent().getStringExtra("key_init_url");
        if (stringExtra != null) {
            z = true;
        }
        this.f119077O2 = z;
        if (z) {
            this.f119076N2.f107878e = C31543z5.m39453c();
            FTSRelatedSugH5ReportStruct fTSRelatedSugH5ReportStruct = this.f119076N2;
            fTSRelatedSugH5ReportStruct.f107880g = fTSRelatedSugH5ReportStruct.mo86045b("InitUrl", stringExtra.replace(",", "!"), true);
            String stringExtra2 = getIntent().getStringExtra("key_search_query");
            String replace = stringExtra2 == null ? "" : stringExtra2.replace(",", "!");
            FTSRelatedSugH5ReportStruct fTSRelatedSugH5ReportStruct2 = this.f119076N2;
            fTSRelatedSugH5ReportStruct2.f107877d = fTSRelatedSugH5ReportStruct2.mo86045b("Query", replace, true);
        }
    }

    public void onDestroy() {
        this.f118523f.removeJavascriptInterface("SosJSApi");
        this.f118513b1.mo67693R0(this.f119080R2);
        this.f118513b1.mo67723h(this.f119080R2.f119082c);
        if (this.f119077O2) {
            this.f119076N2.f107879f = getActivityBrowseTimeMs();
            FTSRelatedSugH5ReportStruct fTSRelatedSugH5ReportStruct = this.f119076N2;
            fTSRelatedSugH5ReportStruct.f107881h = (long) this.f119078P2;
            fTSRelatedSugH5ReportStruct.mo86054n();
            FTSRelatedSugH5ReportStruct fTSRelatedSugH5ReportStruct2 = this.f119076N2;
            Log.m105925i("MicroMsg.WebSearch.SosWebViewUI", "FTSRelatedSugH5ReportStruct.report url : %s, enterTime : %d, stayTime : %d, getQuery : %s ,id : %d, pageChangeCount : %d.", fTSRelatedSugH5ReportStruct2.f107880g, Long.valueOf(fTSRelatedSugH5ReportStruct2.f107878e), Long.valueOf(this.f119076N2.f107879f), this.f119076N2.f107877d, 22251, Integer.valueOf(this.f119078P2));
        }
        super.onDestroy();
    }
}
