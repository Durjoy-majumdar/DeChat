package com.tencent.p014mm.p136ui.widget;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.JsPromptResult;
import com.tencent.xweb.JsResult;
import com.tencent.xweb.WebChromeClient;
import com.tencent.xweb.WebView;
import com.tencent.xweb.XWebSdk;
import go3.C45939e0;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import lg3.C88494d;
import org.xwalk.core.XWalkEnvironment;
import p206nj.C11171e;
import wc3.C53143h0;

/* renamed from: com.tencent.mm.ui.widget.MMWebView */
public class MMWebView extends WebView {

    /* renamed from: r */
    public static final WebView.WebViewKind f122352r = WebView.sDefaultWebViewKind;

    /* renamed from: s */
    public static CopyOnWriteArrayList<WeakReference<MMWebView>> f122353s = new CopyOnWriteArrayList<>();

    /* renamed from: d */
    public String f122354d;

    /* renamed from: e */
    public boolean f122355e;

    /* renamed from: f */
    public C53143h0 f122356f;

    /* renamed from: g */
    public int f122357g;

    /* renamed from: h */
    public boolean f122358h;

    /* renamed from: i */
    public View.OnTouchListener f122359i;

    /* renamed from: j */
    public Set<View.OnTouchListener> f122360j;

    /* renamed from: n */
    public C45106e f122361n;

    /* renamed from: o */
    public LinkedList<C45106e> f122362o;

    /* renamed from: p */
    public boolean f122363p;

    /* renamed from: q */
    public List<C45939e0> f122364q;

    /* renamed from: com.tencent.mm.ui.widget.MMWebView$a */
    public class C45102a implements View.OnTouchListener {
        public C45102a() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/MMWebView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            Iterator it = ((HashSet) MMWebView.this.f122360j).iterator();
            while (it.hasNext()) {
                ((View.OnTouchListener) it.next()).onTouch(view, motionEvent);
            }
            View.OnTouchListener onTouchListener = MMWebView.this.f122359i;
            if (onTouchListener != null) {
                boolean onTouch = onTouchListener.onTouch(view, motionEvent);
                C117292a.m165362h(onTouch, this, "com/tencent/mm/ui/widget/MMWebView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return onTouch;
            }
            C117292a.m165362h(false, this, "com/tencent/mm/ui/widget/MMWebView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.MMWebView$b */
    public static class C45103b {
        /* renamed from: a */
        public static MMWebView m49948a(Context context) {
            Log.m105924i("MMWebView", "TRACE_ORDER:MMWebView.java");
            XWebSdk.initWebviewCore(context, MMWebView.f122352r, XWalkEnvironment.MODULE_TOOLS, (WebView.PreInitCallback) null);
            return new MMWebView(context);
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.MMWebView$c */
    public interface C45104c {
        /* renamed from: a */
        boolean mo70479a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z);
    }

    /* renamed from: com.tencent.mm.ui.widget.MMWebView$d */
    public static class C45105d extends WebChromeClient {

        /* renamed from: a */
        public List<C45939e0> f122366a = new ArrayList();

        /* renamed from: b */
        public WebChromeClient f122367b;

        public C45105d(WebChromeClient webChromeClient) {
            this.f122367b = webChromeClient;
        }

        public View getVideoLoadingProgressView() {
            for (C45939e0 e0Var : this.f122366a) {
                e0Var.getClass();
            }
            return this.f122367b.getVideoLoadingProgressView();
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            for (C45939e0 e0Var : this.f122366a) {
                e0Var.getClass();
            }
            return this.f122367b.onConsoleMessage(consoleMessage);
        }

        public void onDidChangeThemeColor(WebView webView, int i) {
            for (C45939e0 e0Var : this.f122366a) {
                e0Var.getClass();
            }
            this.f122367b.onDidChangeThemeColor(webView, i);
        }

        public boolean onEnterFullscreen(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            for (C45939e0 e0Var : this.f122366a) {
                e0Var.getClass();
            }
            return this.f122367b.onEnterFullscreen(view, customViewCallback);
        }

        public boolean onExitFullscreen() {
            for (C45939e0 e0Var : this.f122366a) {
                e0Var.getClass();
            }
            return this.f122367b.onExitFullscreen();
        }

        public void onExitFullscreenVideo(Bitmap bitmap) {
            for (C45939e0 e0Var : this.f122366a) {
                e0Var.getClass();
            }
            this.f122367b.onExitFullscreenVideo(bitmap);
        }

        public void onGeolocationPermissionsHidePrompt() {
            for (C45939e0 e0Var : this.f122366a) {
                e0Var.getClass();
            }
            this.f122367b.onGeolocationPermissionsHidePrompt();
        }

        public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            for (C45939e0 e0Var : this.f122366a) {
                e0Var.getClass();
            }
            this.f122367b.onGeolocationPermissionsShowPrompt(str, callback);
        }

        public void onHideCustomView() {
            for (C45939e0 e0Var : this.f122366a) {
                e0Var.getClass();
            }
            this.f122367b.onHideCustomView();
        }

        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            for (C45939e0 e0Var : this.f122366a) {
                e0Var.getClass();
            }
            return this.f122367b.onJsAlert(webView, str, str2, jsResult);
        }

        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            for (C45939e0 e0Var : this.f122366a) {
                e0Var.getClass();
            }
            return this.f122367b.onJsConfirm(webView, str, str2, jsResult);
        }

        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            for (C45939e0 e0Var : this.f122366a) {
                e0Var.getClass();
            }
            return this.f122367b.onJsPrompt(webView, str, str2, str3, jsPromptResult);
        }

        public void onPermissionRequest(PermissionRequest permissionRequest) {
            for (C45939e0 e0Var : this.f122366a) {
                e0Var.getClass();
            }
            this.f122367b.onPermissionRequest(permissionRequest);
        }

        public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
            for (C45939e0 e0Var : this.f122366a) {
                e0Var.getClass();
            }
            this.f122367b.onPermissionRequestCanceled(permissionRequest);
        }

        public void onProgressChanged(WebView webView, int i) {
            for (C45939e0 a : this.f122366a) {
                a.mo67768a(webView, i);
            }
            this.f122367b.onProgressChanged(webView, i);
        }

        public void onReceivedTitle(WebView webView, String str) {
            for (C45939e0 e0Var : this.f122366a) {
                e0Var.getClass();
            }
            this.f122367b.onReceivedTitle(webView, str);
        }

        public boolean onSearchWord(String str, String str2, String str3, String str4, String str5, String str6) {
            for (C45939e0 e0Var : this.f122366a) {
                e0Var.getClass();
            }
            return this.f122367b.onSearchWord(str, str2, str3, str4, str5, str6);
        }

        public boolean onSelectInfoChanged(long j, String str, String str2, String str3) {
            for (C45939e0 e0Var : this.f122366a) {
                e0Var.getClass();
            }
            return this.f122367b.onSelectInfoChanged(j, str, str2, str3);
        }

        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            for (C45939e0 e0Var : this.f122366a) {
                e0Var.getClass();
            }
            this.f122367b.onShowCustomView(view, customViewCallback);
        }

        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            for (C45939e0 e0Var : this.f122366a) {
                e0Var.getClass();
            }
            return this.f122367b.onShowFileChooser(webView, valueCallback, fileChooserParams);
        }

        public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
            for (C45939e0 e0Var : this.f122366a) {
                e0Var.getClass();
            }
            this.f122367b.openFileChooser(valueCallback, str, str2);
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.MMWebView$e */
    public interface C45106e {
        /* renamed from: y2 */
        void mo24942y2(int i, int i2, int i3, int i4);
    }

    public MMWebView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: Y */
    public static void m49943Y(boolean z) {
        Iterator<WeakReference<MMWebView>> it = f122353s.iterator();
        while (it.hasNext()) {
            MMWebView mMWebView = (MMWebView) it.next().get();
            if (mMWebView != null) {
                if (z) {
                    mMWebView.getSettings().setForceDarkMode(2);
                } else {
                    mMWebView.getSettings().setForceDarkMode(0);
                }
            }
        }
    }

    /* renamed from: Q */
    public void mo70467Q() {
        try {
            super.removeJavascriptInterface("searchBoxJavaBridge_");
        } catch (Exception e) {
            Log.m105921e("MicroMsg.MMWebView", "removeConfigJsInterface, ex = %s", e.getMessage());
        }
    }

    /* renamed from: T */
    public void mo70468T() {
        super.setOnTouchListener(new C45102a());
    }

    /* renamed from: W */
    public void mo70469W() {
        setScrollbarFadingEnabled(true);
        setScrollBarStyle(0);
    }

    public void destroy() {
        try {
            super.destroy();
            ((HashSet) this.f122360j).clear();
            Iterator<WeakReference<MMWebView>> it = f122353s.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference next = it.next();
                if (((MMWebView) next.get()) == this) {
                    f122353s.remove(next);
                    break;
                }
            }
        } catch (Throwable th) {
            this.f122358h = true;
            throw th;
        }
        this.f122358h = true;
    }

    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        boolean z;
        if (!Util.isNullOrNil(str)) {
            if (this.f122358h) {
                Log.m105929w("MicroMsg.MMWebView", "EvaluateJavascript can not after destroy. %s", Util.getStack());
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (C11171e.m11046c(19)) {
                    super.evaluateJavascript(str, valueCallback);
                    return;
                }
                try {
                    if (!str.startsWith("javascript:")) {
                        str = "javascript:" + str;
                    }
                    super.loadUrl(str);
                } catch (Exception e) {
                    Log.m105925i("MicroMsg.MMWebView", "evaluateJavascript failed : %s", e.getMessage());
                }
            }
        }
    }

    /* renamed from: f */
    public void mo70470f(Context context) {
        if (getContext() instanceof MutableContextWrapper) {
            MutableContextWrapper mutableContextWrapper = (MutableContextWrapper) getContext();
            if (mutableContextWrapper.getBaseContext() != context) {
                mutableContextWrapper.setBaseContext(context);
            }
        }
    }

    public Context getActivityContextIfHas() {
        return getContext() instanceof MutableContextWrapper ? ((MutableContextWrapper) getContext()).getBaseContext() : getContext();
    }

    public float getMMDensity() {
        float f = C88494d.m110349f();
        return ((getCurrentInstanceWebCoreType() == WebView.WebViewKind.WV_KIND_CW || getCurrentInstanceWebCoreType() == WebView.WebViewKind.WV_KIND_PINUS) && XWebSdk.getUsingCustomContext()) ? getResources().getDisplayMetrics().density : f;
    }

    public C53143h0 getPerformanceHelper() {
        return this.f122356f;
    }

    public String getRandomStr() {
        return this.f122354d;
    }

    public int getWebViewContextType() {
        Context context = getContext();
        if (context instanceof MutableContextWrapper) {
            context = ((MutableContextWrapper) context).getBaseContext();
        }
        if (context == null) {
            return 0;
        }
        return context instanceof Activity ? 1 : 2;
    }

    public void loadUrl(String str) {
        super.loadUrl(str);
    }

    public final void onHide() {
        if (!this.f122363p) {
            super.onHide();
            this.f122363p = true;
        }
    }

    public final void onShow() {
        super.onShow();
        this.f122363p = false;
    }

    public void onWebViewScrollChanged(int i, int i2, int i3, int i4) {
        super.onWebViewScrollChanged(i, i2, i3, i4);
        C45106e eVar = this.f122361n;
        if (eVar != null) {
            eVar.mo24942y2(i, i2, i3, i4);
        }
        Iterator<C45106e> it = this.f122362o.iterator();
        while (it.hasNext()) {
            it.next().mo24942y2(i, i2, i3, i4);
        }
    }

    public void setCleanOnDetached(boolean z) {
    }

    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f122359i = onTouchListener;
    }

    public void setPreload(boolean z) {
        this.f122355e = z;
    }

    public void setRandomStr(String str) {
        this.f122354d = str;
    }

    public void setWebChromeClient(com.tencent.xweb.WebChromeClient webChromeClient) {
        if (webChromeClient instanceof C45105d) {
            ((C45105d) webChromeClient).f122366a = this.f122364q;
        }
        if (webChromeClient == null) {
            ((ArrayList) this.f122364q).clear();
        }
        super.setWebChromeClient(webChromeClient);
    }

    public MMWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, WebView.WebViewKind.WV_KIND_NONE);
    }

    public MMWebView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, WebView.WebViewKind.WV_KIND_NONE);
    }

    public MMWebView(Context context, AttributeSet attributeSet, int i, WebView.WebViewKind webViewKind) {
        super(context, attributeSet, i, webViewKind);
        this.f122356f = new C53143h0();
        this.f122357g = 0;
        this.f122360j = new HashSet();
        this.f122361n = null;
        this.f122362o = new LinkedList<>();
        this.f122363p = false;
        this.f122364q = new ArrayList();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            Log.m105921e("MicroMsg.MMWebView", "alvinluo MMWebView create not in main thread, stack: %s", Util.getStack());
            if (BuildInfo.IS_FLAVOR_RED) {
                throw new IllegalStateException("Create MMWebView must be in main thread");
            }
        }
        setBackgroundColor(context.getResources().getColor(C0966R.color.al6));
        mo70467Q();
        f122353s.add(new WeakReference(this));
    }
}
