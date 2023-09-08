package com.tencent.p014mm.plugin.game.luggage.page;

import a93.C39517b;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.api.GameWebPerformanceInfo;
import com.tencent.p014mm.plugin.game.luggage.C41902f;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.luggage.C43592h0;
import com.tencent.p014mm.plugin.webview.luggage.C43632m;
import com.tencent.p014mm.plugin.webview.luggage.util.C6013c;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.xweb.SslErrorHandler;
import com.tencent.xweb.WebResourceRequest;
import com.tencent.xweb.WebResourceResponse;
import com.tencent.xweb.WebView;
import di3.C86312j;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.Map;
import kb3.C46677m;
import p237sp.C48455p;
import p824tc.C48619a;
import u10.C52415a;
import w93.C53091f;

/* renamed from: com.tencent.mm.plugin.game.luggage.page.j */
public class C41962j extends C39517b {

    /* renamed from: Q */
    public static final Object f113033Q = new Object();

    /* renamed from: B */
    public C46677m f113034B;

    /* renamed from: C */
    public boolean f113035C = false;

    /* renamed from: D */
    public String f113036D;

    /* renamed from: E */
    public String f113037E;

    /* renamed from: F */
    public Map<String, String> f113038F;

    /* renamed from: G */
    public String f113039G;

    /* renamed from: H */
    public boolean f113040H = false;

    /* renamed from: I */
    public boolean f113041I = false;

    /* renamed from: J */
    public boolean f113042J = false;

    /* renamed from: K */
    public boolean f113043K = false;

    /* renamed from: L */
    public boolean f113044L = false;

    /* renamed from: M */
    public GameWebPerformanceInfo f113045M;

    /* renamed from: N */
    public boolean f113046N = false;

    /* renamed from: P */
    public Runnable f113047P = new C41963a();

    /* renamed from: com.tencent.mm.plugin.game.luggage.page.j$a */
    public class C41963a implements Runnable {
        public C41963a() {
        }

        public void run() {
            synchronized (C41962j.f113033Q) {
                if (C41962j.this.getSettings().getBlockNetworkImage()) {
                    Log.m105924i("MicroMsg.GameWebCoreImpl", "setBlockNetworkImage time out");
                    C41962j.this.getSettings().setBlockNetworkImage(false);
                    C115669n.INSTANCE.mo175913w(949, 0, 1);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.page.j$b */
    public class C41964b implements Runnable {
        public C41964b() {
        }

        public void run() {
            C41962j jVar = C41962j.this;
            jVar.getSettings().setBlockNetworkImage(true);
            jVar.setWebViewClientProxy(new C41967d());
            jVar.setWebChromeClientProxy(new C41965c());
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.page.j$c */
    public class C41965c extends C43632m {

        /* renamed from: com.tencent.mm.plugin.game.luggage.page.j$c$a */
        public class C41966a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f113051d;

            public C41966a(C41965c cVar, String str) {
                this.f113051d = str;
            }

            public void run() {
                Log.m105924i("MicroMsg.GameWebCoreImpl", this.f113051d);
            }
        }

        public C41965c() {
        }

        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onConsoleMessage(android.webkit.ConsoleMessage r9) {
            /*
                r8 = this;
                java.lang.String r0 = "responseEnd"
                com.tencent.mm.plugin.game.luggage.page.j r1 = com.tencent.p014mm.plugin.game.luggage.page.C41962j.this
                kb3.m r1 = r1.f113034B
                if (r1 == 0) goto L_0x000b
                r1.mo71928g(r9)
            L_0x000b:
                java.lang.String r1 = ""
                if (r9 == 0) goto L_0x0014
                java.lang.String r2 = r9.message()
                goto L_0x0015
            L_0x0014:
                r2 = r1
            L_0x0015:
                java.lang.String r3 = "luggage_err"
                boolean r3 = r2.contains(r3)
                if (r3 != 0) goto L_0x00e4
                java.lang.String r3 = "luggageBridge is not defined"
                boolean r3 = r2.contains(r3)
                if (r3 == 0) goto L_0x0027
                goto L_0x00e4
            L_0x0027:
                java.lang.String r3 = "WXGAMEPERF:"
                boolean r4 = r2.startsWith(r3)
                if (r4 == 0) goto L_0x00f1
                java.lang.String r4 = "first-contentful-paint"
                boolean r4 = r2.contains(r4)
                if (r4 == 0) goto L_0x0056
                java.lang.String r0 = r2.replaceFirst(r3, r1)
                java.lang.String r0 = r0.trim()
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00d7 }
                r1.<init>(r0)     // Catch:{ JSONException -> 0x00d7 }
                java.lang.String r0 = "startTime"
                r3 = 0
                double r0 = r1.optDouble(r0, r3)     // Catch:{ JSONException -> 0x00d7 }
                long r0 = (long) r0     // Catch:{ JSONException -> 0x00d7 }
                com.tencent.mm.plugin.game.luggage.page.j r3 = com.tencent.p014mm.plugin.game.luggage.page.C41962j.this     // Catch:{ JSONException -> 0x00d7 }
                java.lang.String r3 = r3.f113039G     // Catch:{ JSONException -> 0x00d7 }
                w93.C53091f.m59451f(r3, r0)     // Catch:{ JSONException -> 0x00d7 }
                goto L_0x00d7
            L_0x0056:
                java.lang.String r4 = "timing"
                boolean r5 = r2.contains(r4)
                if (r5 == 0) goto L_0x00d7
                java.lang.String r1 = r2.replaceFirst(r3, r1)
                java.lang.String r1 = r1.trim()
                org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{  }
                r3.<init>(r1)     // Catch:{  }
                org.json.JSONObject r1 = r3.optJSONObject(r4)     // Catch:{  }
                if (r1 == 0) goto L_0x00d7
                com.tencent.mm.plugin.game.luggage.page.j r3 = com.tencent.p014mm.plugin.game.luggage.page.C41962j.this     // Catch:{  }
                java.lang.String r3 = r3.f113039G     // Catch:{  }
                w93.f r3 = w93.C53091f.m59448c(r3)     // Catch:{  }
                if (r3 == 0) goto L_0x00d7
                java.lang.String r4 = "domainLookupEnd"
                long r4 = r1.optLong(r4)     // Catch:{  }
                java.lang.String r6 = "domainLookupStart"
                long r6 = r1.optLong(r6)     // Catch:{  }
                long r4 = r4 - r6
                r3.f148176l = r4     // Catch:{  }
                java.lang.String r4 = "connectEnd"
                long r4 = r1.optLong(r4)     // Catch:{  }
                java.lang.String r6 = "connectStart"
                long r6 = r1.optLong(r6)     // Catch:{  }
                long r4 = r4 - r6
                r3.f148177m = r4     // Catch:{  }
                long r4 = r1.optLong(r0)     // Catch:{  }
                java.lang.String r6 = "requestStart"
                long r6 = r1.optLong(r6)     // Catch:{  }
                long r4 = r4 - r6
                r3.f148178n = r4     // Catch:{  }
                java.lang.String r4 = "domInteractive"
                long r4 = r1.optLong(r4)     // Catch:{  }
                java.lang.String r6 = "domLoading"
                long r6 = r1.optLong(r6)     // Catch:{  }
                long r4 = r4 - r6
                r3.f148179o = r4     // Catch:{  }
                java.lang.String r4 = "domContentLoadedEventEnd"
                long r4 = r1.optLong(r4)     // Catch:{  }
                long r6 = r1.optLong(r0)     // Catch:{  }
                long r4 = r4 - r6
                r3.f148181q = r4     // Catch:{  }
                java.lang.String r4 = "domComplete"
                long r4 = r1.optLong(r4)     // Catch:{  }
                long r6 = r1.optLong(r0)     // Catch:{  }
                long r4 = r4 - r6
                r3.f148182r = r4     // Catch:{  }
                java.lang.String r0 = "navigationStart"
                long r0 = r1.optLong(r0)     // Catch:{  }
                r3.f148183s = r0     // Catch:{  }
            L_0x00d7:
                zt3.t r0 = zt3.C119157j.f356862d
                com.tencent.mm.plugin.game.luggage.page.j$c$a r1 = new com.tencent.mm.plugin.game.luggage.page.j$c$a
                r1.<init>(r8, r2)
                zt3.j r0 = (zt3.C119157j) r0
                r0.mo183875f(r1)
                goto L_0x00f1
            L_0x00e4:
                java.lang.String r0 = "MicroMsg.GameWebCoreImpl"
                java.lang.String r1 = "luggage bridge error"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                com.tencent.mm.plugin.game.luggage.page.j r0 = com.tencent.p014mm.plugin.game.luggage.page.C41962j.this
                com.tencent.mm.game.report.api.GameWebPerformanceInfo r0 = r0.f113045M
                r0.f108353P = r2
            L_0x00f1:
                boolean r9 = super.onConsoleMessage(r9)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.luggage.page.C41962j.C41965c.onConsoleMessage(android.webkit.ConsoleMessage):boolean");
        }

        public void onReceivedTitle(WebView webView, String str) {
            Log.m105925i("MicroMsg.GameWebCoreImpl", "onReceivedTitle, title = %s", str);
            if (!C6013c.m5892d(str)) {
                C41962j.this.f113036D = str;
            }
            super.onReceivedTitle(webView, str);
        }
    }

    public C41962j(Context context) {
        super(context);
        getSettings().setForceDarkBehavior(1);
        this.f113034B = new C46677m();
        Log.m105925i("MicroMsg.GameWebCoreImpl", "create, hashCode: %d", Integer.valueOf(hashCode()));
    }

    /* renamed from: A */
    public void mo21039A(C48619a.C48620a aVar) {
        super.mo21039A(aVar);
        runOnUiThread(new C41964b());
    }

    public void destroy() {
        this.f113034B.mo71929h(this.f113044L);
        super.destroy();
    }

    public String getTitle() {
        return this.f113036D;
    }

    public C46677m getWePkgPlugin() {
        return this.f113034B;
    }

    /* renamed from: l0 */
    public void mo62123l0() {
        super.mo62123l0();
        getWebCore().f148248o.mo73445a(new C41902f(this));
    }

    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (this.f113045M == null) {
            GameWebPerformanceInfo b = GameWebPerformanceInfo.m43446b(str);
            this.f113045M = b;
            b.f108342D = System.currentTimeMillis();
        }
        Log.m105919d("MicroMsg.GameWebCoreImpl", "loadDataWithBaseURL, hasLoadWePkg: %b", Boolean.valueOf(this.f113035C));
        if (!this.f113035C) {
            this.f113034B.mo71927f(str, true, true);
            this.f113035C = true;
        }
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    public void loadUrl(String str) {
        Log.m105925i("MicroMsg.GameWebCoreImpl", "loadUrl, __Time__, time : %d, hashCode: %d", Long.valueOf(System.currentTimeMillis()), Integer.valueOf(hashCode()));
        if (this.f113045M == null) {
            GameWebPerformanceInfo b = GameWebPerformanceInfo.m43446b(this.f113039G);
            this.f113045M = b;
            b.f108342D = System.currentTimeMillis();
        }
        Log.m105919d("MicroMsg.GameWebCoreImpl", "loadUrl, hasLoadWePkg: %b", Boolean.valueOf(this.f113035C));
        if (!this.f113035C) {
            this.f113034B.mo71927f(str, true, false);
            this.f113035C = true;
        }
        C46677m mVar = this.f113034B;
        if (!mVar.f125651d) {
            mVar.f125664q = null;
        }
        String str2 = mVar.f125664q;
        Log.m105925i("MicroMsg.GameWebCoreImpl", "loadUrl:%s", str);
        if (Util.isNullOrNil(str2)) {
            try {
                C52415a.m58668a().mo62980b(5, URLEncoder.encode(str), "0", 0);
            } catch (Exception unused) {
            }
            super.loadUrl(str);
            return;
        }
        Log.m105919d("MicroMsg.GameWebCoreImpl", "use PageCache:%s", str2);
        try {
            C52415a.m58668a().mo62980b(5, URLEncoder.encode(str), "1", 0);
        } catch (Exception unused2) {
        }
        super.loadDataWithBaseURL(str, str2, "text/html", "utf-8", (String) null);
    }

    /* renamed from: o0 */
    public void mo65859o0(WebView webView, String str) {
        Log.m105925i("MicroMsg.GameWebCoreImpl", "onPageFinished, blockImg: %b", Boolean.valueOf(this.f113041I));
        GameWebPerformanceInfo gameWebPerformanceInfo = this.f113045M;
        if (gameWebPerformanceInfo.f108344F == 0) {
            gameWebPerformanceInfo.f108344F = System.currentTimeMillis();
            Log.m105925i("MicroMsg.GameWebCoreImpl", "onPageFinished, url: %s, time: %d", str, Long.valueOf(this.f113045M.f108344F));
        }
        if (C53091f.m59447b(this.f113039G).f148169e == 0) {
            C53091f.m59447b(this.f113039G).f148169e = System.currentTimeMillis();
        }
        synchronized (f113033Q) {
            getSettings().setBlockNetworkImage(this.f113041I);
        }
        this.f113040H = true;
        GameWebPerformanceInfo gameWebPerformanceInfo2 = this.f113045M;
        if (gameWebPerformanceInfo2.f108341C == 0) {
            gameWebPerformanceInfo2.f108341C = System.currentTimeMillis();
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.m105925i("MicroMsg.GameWebCoreImpl", "onAttachedToWindow, hashCode: %d", Integer.valueOf(hashCode()));
        this.f113043K = true;
        if (this.f113042J) {
            postDelayed(this.f113047P, 3000);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.m105925i("MicroMsg.GameWebCoreImpl", "onDetachedFromWindow, hashCode: %d", Integer.valueOf(hashCode()));
        removeCallbacks(this.f113047P);
    }

    /* renamed from: p0 */
    public void mo65862p0(WebView webView, String str, Bitmap bitmap) {
        this.f113042J = true;
        if (this.f113043K) {
            postDelayed(this.f113047P, 3000);
        }
        GameWebPerformanceInfo gameWebPerformanceInfo = this.f113045M;
        if (gameWebPerformanceInfo.f108343E == 0) {
            gameWebPerformanceInfo.f108343E = System.currentTimeMillis();
            Log.m105925i("MicroMsg.GameWebCoreImpl", "onPageStarted, url: %s, time: %d", str, Long.valueOf(this.f113045M.f108343E));
        }
        if (C53091f.m59447b(this.f113039G).f148168d == 0) {
            C53091f.m59447b(this.f113039G).f148168d = System.currentTimeMillis();
        }
    }

    public void setBlockNetworkImage(boolean z) {
        Log.m105925i("MicroMsg.GameWebCoreImpl", "setBlockNetworkImage, blockImg: %b", Boolean.valueOf(z));
        this.f113041I = z;
        if (this.f113040H) {
            synchronized (f113033Q) {
                getSettings().setBlockNetworkImage(z);
            }
        }
    }

    public void setRawUrl(String str) {
        this.f113039G = str;
    }

    public void setShouldCleanPkgWhenDestroy(boolean z) {
        this.f113044L = z;
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.page.j$d */
    public class C41967d extends C43592h0 {
        public C41967d() {
        }

        public void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
            Log.m105925i("MicroMsg.GameWebCoreImpl", "onLoadResource, url: %s", str);
        }

        public void onPageFinished(WebView webView, String str) {
            Log.m105925i("MicroMsg.GameWebCoreImpl", "onPageFinished, __Time__, time: %d", Long.valueOf(System.currentTimeMillis()));
            C41962j.this.f113034B.mo71930i(webView, str);
            super.onPageFinished(webView, str);
            C41962j.this.mo65859o0(webView, str);
            C41962j.this.getClass();
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Log.m105925i("MicroMsg.GameWebCoreImpl", "onPageStarted, __Time__, time: %d", Long.valueOf(System.currentTimeMillis()));
            C41962j.this.f113034B.mo71931j(webView, str);
            super.onPageStarted(webView, str, bitmap);
            C41962j.this.mo65862p0(webView, str, bitmap);
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            Log.m105921e("MicroMsg.GameWebCoreImpl", "onReceivedError, desc: %s, url: %s", str, str2);
            C41962j.this.f113046N = true;
            C115669n.INSTANCE.mo175913w(949, 1, 1);
        }

        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            Log.m105921e("MicroMsg.GameWebCoreImpl", "onReceivedHttpError， errorCode: %d", Integer.valueOf(webResourceResponse.getStatusCode()));
            C41962j.this.f113046N = true;
            C115669n.INSTANCE.mo175913w(949, 3, 1);
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            Log.m105920e("MicroMsg.GameWebCoreImpl", "onReceivedSslError， error: " + sslError);
            C41962j.this.f113046N = true;
            C115669n.INSTANCE.mo175913w(949, 2, 1);
        }

        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            Log.m105925i("MicroMsg.GameWebCoreImpl", "shouldInterceptRequest, url: %s", str);
            if (str.equals(HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.flk) + "/favicon.ico")) {
                return new WebResourceResponse("img/png", (String) null, (InputStream) null);
            }
            WebResourceResponse k = C41962j.this.f113034B.mo71932k(webView, str, (WebResourceRequest) null);
            if (k == null) {
                return super.shouldInterceptRequest(webView, str);
            }
            Log.m105924i("MicroMsg.GameWebCoreImpl", "shouldInterceptRequest response != null");
            return k;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Log.m105925i("MicroMsg.GameWebCoreImpl", "shouldOverrideUrlLoading, url: %s", str);
            if (!((C48455p) C86312j.m106911c(C48455p.class)).mo60667qU(str, C41962j.this.f106101v, webView)) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            Log.m105924i("MicroMsg.GameWebCoreImpl", "use the downloader to download");
            return true;
        }

        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            Log.m105925i("MicroMsg.GameWebCoreImpl", "shouldInterceptRequest, url: %s", webResourceRequest.getUrl().toString());
            String uri = webResourceRequest.getUrl().toString();
            if (uri.equals(HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.flk) + "/favicon.ico")) {
                return new WebResourceResponse("img/png", (String) null, (InputStream) null);
            }
            WebResourceResponse k = C41962j.this.f113034B.mo71932k(webView, webResourceRequest.getUrl().toString(), webResourceRequest);
            if (k == null) {
                return super.shouldInterceptRequest(webView, webResourceRequest);
            }
            Log.m105924i("MicroMsg.GameWebCoreImpl", "shouldInterceptRequest response != null");
            return k;
        }

        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest, Bundle bundle) {
            Log.m105925i("MicroMsg.GameWebCoreImpl", "shouldInterceptRequest, url: %s", webResourceRequest.getUrl().toString());
            String uri = webResourceRequest.getUrl().toString();
            if (uri.equals(HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.flk) + "/favicon.ico")) {
                return new WebResourceResponse("img/png", (String) null, (InputStream) null);
            }
            WebResourceResponse k = C41962j.this.f113034B.mo71932k(webView, webResourceRequest.getUrl().toString(), webResourceRequest);
            if (k == null) {
                return super.shouldInterceptRequest(webView, webResourceRequest, bundle);
            }
            Log.m105924i("MicroMsg.GameWebCoreImpl", "shouldInterceptRequest response != null");
            return k;
        }
    }

    public void loadUrl(String str, Map<String, String> map) {
        Log.m105925i("MicroMsg.GameWebCoreImpl", "loadUrl, __Time__, time: %d， HEADER", Long.valueOf(System.currentTimeMillis()));
        if (this.f113045M == null) {
            GameWebPerformanceInfo b = GameWebPerformanceInfo.m43446b(this.f113039G);
            this.f113045M = b;
            b.f108342D = System.currentTimeMillis();
        }
        Log.m105919d("MicroMsg.GameWebCoreImpl", "loadUrl, hasLoadWePkg: %b", Boolean.valueOf(this.f113035C));
        if (!this.f113035C) {
            this.f113034B.mo71927f(str, true, false);
            this.f113035C = true;
        }
        C46677m mVar = this.f113034B;
        if (!mVar.f125651d) {
            mVar.f125664q = null;
        }
        String str2 = mVar.f125664q;
        Log.m105925i("MicroMsg.GameWebCoreImpl", "loadUrl:%s", str);
        if (Util.isNullOrNil(str2)) {
            C52415a.m58668a().mo62980b(5, URLEncoder.encode(str), "0", 0);
            super.loadUrl(str, map);
            return;
        }
        Log.m105919d("MicroMsg.GameWebCoreImpl", "use PageCache:%s", str2);
        C52415a.m58668a().mo62980b(5, URLEncoder.encode(str), "1", 0);
        super.loadDataWithBaseURL(str, str2, "text/html", "utf-8", (String) null);
    }
}
