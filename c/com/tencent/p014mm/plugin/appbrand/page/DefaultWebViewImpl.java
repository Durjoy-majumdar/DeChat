package com.tencent.p014mm.plugin.appbrand.page;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.http.SslError;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import br0.C39836d;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40481j;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83164h;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.net.URL;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.appbrand.page.DefaultWebViewImpl */
public class DefaultWebViewImpl extends WebView implements C40501f3 {

    /* renamed from: d */
    public String f244441d;

    /* renamed from: e */
    public C83857n2 f244442e;

    /* renamed from: f */
    public C40524u2 f244443f;

    /* renamed from: g */
    public C40517r2 f244444g;

    /* renamed from: h */
    public C39836d f244445h;

    /* renamed from: i */
    public Animator f244446i;

    /* renamed from: j */
    public WebViewClient f244447j = new C40499c();

    /* renamed from: n */
    public WebChromeClient f244448n = new WebChromeClient(this) {
    };

    /* renamed from: com.tencent.mm.plugin.appbrand.page.DefaultWebViewImpl$a */
    public class C83743a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f244449d;

        /* renamed from: e */
        public final /* synthetic */ ValueCallback f244450e;

        public C83743a(String str, ValueCallback valueCallback) {
            this.f244449d = str;
            this.f244450e = valueCallback;
        }

        public void run() {
            DefaultWebViewImpl.super.evaluateJavascript(this.f244449d, this.f244450e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.DefaultWebViewImpl$b */
    public class C83744b implements ValueAnimator.AnimatorUpdateListener {
        public C83744b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            DefaultWebViewImpl.this.getContentView().setScrollY(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public DefaultWebViewImpl(Context context, C83857n2 n2Var) {
        super(context);
        this.f244442e = n2Var;
        getSettings().setDomStorageEnabled(true);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        getSettings().setMixedContentMode(0);
        WebSettings settings = getSettings();
        settings.setUserAgentString(getSettings().getUserAgentString() + "/ DEMO");
        this.f244441d = getSettings().getUserAgentString();
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setWebViewClient(this.f244447j);
        setWebChromeClient(this.f244448n);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    }

    /* renamed from: D */
    public boolean mo63301D(Canvas canvas) {
        draw(canvas);
        return true;
    }

    /* renamed from: N */
    public void mo63302N(int i, long j) {
        Animator animator = this.f244446i;
        if (animator != null) {
            animator.cancel();
            this.f244446i = null;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{getContentView().getScrollY(), i});
        ofInt.addUpdateListener(new C83744b());
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.setDuration(j);
        ofInt.start();
        this.f244446i = ofInt;
    }

    /* renamed from: P0 */
    public void mo63303P0(URL url, String str, String str2, int i, String str3, ValueCallback<String> valueCallback) {
        evaluateJavascript(str3, valueCallback);
    }

    /* renamed from: R0 */
    public void mo63304R0(URL url, String str, ValueCallback<String> valueCallback) {
        evaluateJavascript(str, valueCallback);
    }

    /* renamed from: b */
    public void mo63307b() {
        onPause();
    }

    /* renamed from: c */
    public void mo63308c() {
        onResume();
    }

    /* renamed from: c1 */
    public boolean mo63309c1() {
        return false;
    }

    public void destroy() {
        super.destroy();
    }

    /* renamed from: e0 */
    public void mo63310e0(int i, int i2) {
    }

    /* renamed from: e1 */
    public void mo63311e1(Runnable runnable) {
        if (runnable != null) {
            postOnAnimation(runnable);
        }
    }

    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        C83743a aVar = new C83743a(str, valueCallback);
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            aVar.run();
        } else {
            MMHandlerThread.postToMainThread(aVar);
        }
    }

    /* renamed from: f */
    public void mo63312f(Context context) {
        if (getContext() instanceof MutableContextWrapper) {
            ((MutableContextWrapper) getContext()).setBaseContext(context);
        }
    }

    /* renamed from: g1 */
    public void mo63314g1(String str, String str2) {
        loadDataWithBaseURL(str, str2, "text/html", "UTF-8", (String) null);
    }

    public View getContentView() {
        return this;
    }

    public C39836d getFullscreenImpl() {
        return this.f244445h;
    }

    public String getUserAgentString() {
        return this.f244441d;
    }

    public int getWebScrollX() {
        return getScrollX();
    }

    public int getWebScrollY() {
        return getScrollY();
    }

    public View getWrapperView() {
        return this;
    }

    /* renamed from: n0 */
    public <T extends C40481j> T mo63321n0(Class<T> cls) {
        return null;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C40517r2 r2Var = this.f244444g;
        if (r2Var != null) {
            r2Var.mo63351g(z, i, i2, i3, i4);
        }
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C40524u2 u2Var = this.f244443f;
        if (u2Var != null) {
            u2Var.onScrollChanged(i, i2, i3, i4, this);
        }
    }

    /* renamed from: p1 */
    public void mo63324p1() {
        scrollTo(getScrollX(), 0);
    }

    public void setAppBrandInfo(Map<String, String> map) {
    }

    public void setAppBrandWebViewClient(C83857n2 n2Var) {
        this.f244442e = n2Var;
    }

    public void setFullscreenImpl(C39836d dVar) {
        this.f244445h = dVar;
    }

    public void setJsExceptionHandler(C83164h hVar) {
    }

    public void setOnScrollChangedListener(C40524u2 u2Var) {
        this.f244443f = u2Var;
    }

    public void setOnTrimListener(C40520s2 s2Var) {
    }

    public void setWebViewLayoutListener(C40517r2 r2Var) {
        this.f244444g = r2Var;
    }

    public void setXWebKeyboardImpl(C40525w2 w2Var) {
    }

    /* renamed from: t0 */
    public boolean mo63333t0() {
        return getWebScrollY() == 0;
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.DefaultWebViewImpl$c */
    public class C40499c extends WebViewClient {
        public C40499c() {
        }

        public void onPageFinished(WebView webView, String str) {
            DefaultWebViewImpl.this.f244442e.mo116417c(str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            DefaultWebViewImpl.this.f244442e.getClass();
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            if (sslError.getPrimaryError() != 3) {
                sslErrorHandler.cancel();
            } else if (DefaultWebViewImpl.this.f244442e.mo116416b(sslError.getCertificate())) {
                sslErrorHandler.proceed();
            } else {
                sslErrorHandler.cancel();
            }
        }

        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            if (Util.isNullOrNil(str)) {
                return null;
            }
            return DefaultWebViewImpl.this.f244442e.mo116415a(str);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return true;
        }

        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            if (webResourceRequest == null || webResourceRequest.getUrl() == null || Util.isNullOrNil(webResourceRequest.getUrl().toString())) {
                return null;
            }
            return DefaultWebViewImpl.this.f244442e.mo116415a(webResourceRequest.getUrl().toString());
        }
    }
}
