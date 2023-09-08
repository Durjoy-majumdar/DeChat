package com.tencent.p014mm.plugin.finder.webview;

import android.content.Context;
import android.content.Intent;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.Window;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.box.webview.BoxWebView;
import com.tencent.p014mm.plugin.finder.webview.C41647w;
import com.tencent.p014mm.plugin.finder.webview.p800ad.ScrollFrameLayout;
import com.tencent.p014mm.plugin.scanner.MultiCodeMaskView;
import com.tencent.p014mm.plugin.webview.core.C43519u;
import com.tencent.p014mm.plugin.webview.p128ui.tools.C43856f;
import com.tencent.p014mm.plugin.webview.p128ui.tools.C43976g;
import com.tencent.p014mm.plugin.webview.stub.C43783b;
import com.tencent.p014mm.plugin.webview.stub.C43791l;
import com.tencent.p014mm.plugin.webview.stub.C6107m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant;
import com.tencent.xweb.SslErrorHandler;
import com.tencent.xweb.WebResourceError;
import com.tencent.xweb.WebResourceRequest;
import com.tencent.xweb.WebResourceResponse;
import com.tencent.xweb.WebView;
import com.tencent.xweb.internal.ProxyWebViewClientExtension;
import cx0.C45212a;
import cx0.C45214c;
import d93.C45310h;
import di3.C86312j;
import e00.C45513i0;
import e00.C45518r0;
import e00.C45520t;
import e00.C7580y;
import fy3.C32228q;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import rx3.C13598b0;
import t83.C13853i;
import te3.C52267zi;
import zs1.C53813j;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000Ë\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b*\u0001p\b\u0016\u0018\u0000 ~2\u00020\u00012\u00020\u0002:\u0001B1\b\u0016\u0012\u0006\u0010Y\u001a\u000201\u0012\b\u0010\\\u001a\u0004\u0018\u00010[\u0012\n\b\u0002\u0010{\u001a\u0004\u0018\u000109\u0012\b\b\u0002\u0010U\u001a\u00020\u000b¢\u0006\u0004\b|\u0010}J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0007H\u0002J\u001a\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J \u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010H\u0002J\b\u0010\u0015\u001a\u00020\u0007H\u0002J\b\u0010\u0016\u001a\u00020\u0007H\u0002J\b\u0010\u0017\u001a\u00020\u0007H\u0002J\b\u0010\u0018\u001a\u00020\u0007H\u0002J\b\u0010\u0019\u001a\u00020\u0007H\u0002J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\b\u0010\u001c\u001a\u00020\u0007H\u0016J\u0012\u0010\u001f\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016J\u0012\u0010 \u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010!\u001a\u00020\u0007H\u0016J\b\u0010\"\u001a\u00020\u0007H\u0016J\u0018\u0010&\u001a\u00020\u00072\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0010H\u0016J\u000e\u0010'\u001a\u00020\u00072\u0006\u0010$\u001a\u00020#J\n\u0010)\u001a\u0004\u0018\u00010(H\u0016J\n\u0010+\u001a\u0004\u0018\u00010*H\u0016J\u000f\u0010,\u001a\u00020\u0003H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0003H\u0016¢\u0006\u0004\b.\u0010-J\n\u0010/\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u00100\u001a\u00020\u0010H\u0016J\n\u00102\u001a\u0004\u0018\u000101H\u0016J\n\u00104\u001a\u0004\u0018\u000103H\u0016J\b\u00105\u001a\u00020#H\u0016J\b\u00106\u001a\u00020\u000bH\u0016J\n\u00108\u001a\u0004\u0018\u000107H\u0016J\n\u0010:\u001a\u0004\u0018\u000109H\u0016R$\u0010;\u001a\u0004\u0018\u0001098\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010A\u001a\u0004\u0018\u0001078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010H\u001a\u0004\u0018\u00010G8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0017\u0010O\u001a\u00020N8\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0016\u0010S\u001a\u00020\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010U\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010W\u001a\u00020#8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010Y\u001a\u0004\u0018\u0001018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0018\u0010\\\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0018\u0010_\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0018\u0010b\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u001a\u0010e\u001a\b\u0012\u0004\u0012\u00020\u001d0d8\u0002X\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010g\u001a\u0004\u0018\u0001038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0016\u0010i\u001a\u00020\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bi\u0010TR\u0018\u0010k\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0018\u0010n\u001a\u0004\u0018\u00010m8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0016\u0010q\u001a\u00020p8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0017\u0010t\u001a\u00020s8\u0006¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010wR\u0014\u0010y\u001a\u00020x8\u0002X\u0004¢\u0006\u0006\n\u0004\by\u0010z¨\u0006\u0001"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/webview/FinderWebViewHelper;", "Lcom/tencent/mm/plugin/finder/webview/w;", "Lcom/tencent/mm/plugin/finder/webview/x;", "", "webViewVisibleHeight", "peekHeight", "maxHeight", "Lrx3/b0;", "onDialogHeightChange", "onWebViewReady", "onCreateBoxWebViewStart", "", "actionCode", "Landroid/os/Bundle;", "data", "onExecuteActionCode", "", "enablePreloadWebView", "enablePreloadFromFindTab", "useCache", "onCreateBoxWebViewEnd", "onInitWebViewStart", "onInitWebViewEnd", "onError", "initWebViewController", "initWebView", "Lcom/tencent/mm/ui/widget/MMWebView;", "getWithInitWebView", "reload", "Lcom/tencent/mm/plugin/finder/webview/w$b;", "listener", "addWebViewStateListener", "removeWebViewStateListener", "clearWebViewStateListener", "release", "", "url", "isReload", "startLoadUrl", "reloadUrl", "Lcom/tencent/mm/plugin/webview/stub/l;", "getInvoke", "Ld93/h;", "getPerm", "getTouchX", "()Ljava/lang/Float;", "getTouchY", "getWebView", "isRelease", "Landroid/content/Context;", "getContext", "Le00/t;", "getController", "getCurrentURL", "getWVTopOffset", "Lcom/tencent/mm/plugin/scanner/MultiCodeMaskView;", "getMaskView", "Landroid/view/Window;", "getWindow", "dialogWindow", "Landroid/view/Window;", "getDialogWindow", "()Landroid/view/Window;", "setDialogWindow", "(Landroid/view/Window;)V", "codeMaskView", "Lcom/tencent/mm/plugin/scanner/MultiCodeMaskView;", "getCodeMaskView", "()Lcom/tencent/mm/plugin/scanner/MultiCodeMaskView;", "setCodeMaskView", "(Lcom/tencent/mm/plugin/scanner/MultiCodeMaskView;)V", "Lcom/tencent/mm/plugin/finder/webview/u;", "posProvider", "Lcom/tencent/mm/plugin/finder/webview/u;", "getPosProvider", "()Lcom/tencent/mm/plugin/finder/webview/u;", "setPosProvider", "(Lcom/tencent/mm/plugin/finder/webview/u;)V", "Lcom/tencent/mm/plugin/finder/webview/o;", "webViewEnv", "Lcom/tencent/mm/plugin/finder/webview/o;", "getWebViewEnv", "()Lcom/tencent/mm/plugin/finder/webview/o;", "hasInitWebView", "Z", "scene", "I", "mCurrentURL", "Ljava/lang/String;", "context", "Landroid/content/Context;", "Lte3/zi;", "homeContext", "Lte3/zi;", "Lcom/tencent/mm/plugin/box/webview/BoxWebView;", "boxWebView", "Lcom/tencent/mm/plugin/box/webview/BoxWebView;", "Lcom/tencent/mm/plugin/finder/webview/l;", "webViewControllerListener", "Lcom/tencent/mm/plugin/finder/webview/l;", "", "mWebViewStatusListeners", "Ljava/util/List;", "webViewController", "Le00/t;", "isReleased", "Lcom/tencent/mm/plugin/finder/webview/WebViewLongClickHelper;", "longClickHelper", "Lcom/tencent/mm/plugin/finder/webview/WebViewLongClickHelper;", "Lcom/tencent/mm/plugin/webview/ui/tools/f;", "sslErrorHandler", "Lcom/tencent/mm/plugin/webview/ui/tools/f;", "com/tencent/mm/plugin/finder/webview/FinderWebViewHelper$i", "webViewClientListener", "Lcom/tencent/mm/plugin/finder/webview/FinderWebViewHelper$i;", "Lzs1/j;", "scrollHeightListener", "Lzs1/j;", "getScrollHeightListener", "()Lzs1/j;", "Ljava/lang/Runnable;", "errorRunnable", "Ljava/lang/Runnable;", "window", "<init>", "(Landroid/content/Context;Lte3/zi;Landroid/view/Window;I)V", "Companion", "a", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.webview.FinderWebViewHelper */
public class FinderWebViewHelper implements C41647w, C41650x {
    public static final C41599a Companion = new C41599a((C8480h) null);
    private static final String TAG = "Finder.AdWebViewImpl";
    /* access modifiers changed from: private */
    public BoxWebView boxWebView;
    private MultiCodeMaskView codeMaskView;
    private Context context;
    private Window dialogWindow;
    private final Runnable errorRunnable;
    private boolean hasInitWebView;
    /* access modifiers changed from: private */
    public C52267zi homeContext;
    private boolean isReleased;
    private WebViewLongClickHelper longClickHelper;
    /* access modifiers changed from: private */
    public String mCurrentURL;
    private final List<C41647w.C41649b> mWebViewStatusListeners;
    private C41645u posProvider;
    private int scene;
    private final C53813j scrollHeightListener;
    /* access modifiers changed from: private */
    public C43856f sslErrorHandler;
    private C41607i webViewClientListener;
    /* access modifiers changed from: private */
    public C45520t webViewController;
    private C41636l webViewControllerListener;
    private final C41639o webViewEnv;

    /* renamed from: com.tencent.mm.plugin.finder.webview.FinderWebViewHelper$a */
    public static final class C41599a {
        public C41599a(C8480h hVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.webview.FinderWebViewHelper$b */
    public static final class C41600b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderWebViewHelper f111971d;

        public C41600b(FinderWebViewHelper finderWebViewHelper) {
            this.f111971d = finderWebViewHelper;
        }

        public final void run() {
            this.f111971d.onError();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.webview.FinderWebViewHelper$c */
    public static final class C41601c extends C87413o implements C32228q<Boolean, Boolean, Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderWebViewHelper f111972d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41601c(FinderWebViewHelper finderWebViewHelper) {
            super(3);
            this.f111972d = finderWebViewHelper;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            this.f111972d.onCreateBoxWebViewEnd(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue());
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.webview.FinderWebViewHelper$d */
    public static final class C41602d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderWebViewHelper f111973d;

        public C41602d(FinderWebViewHelper finderWebViewHelper) {
            this.f111973d = finderWebViewHelper;
        }

        public final void run() {
            BoxWebView access$getBoxWebView$p = this.f111973d.boxWebView;
            if (access$getBoxWebView$p != null) {
                access$getBoxWebView$p.mo63455c0((C45212a) null, (C45214c) null);
            }
            BoxWebView access$getBoxWebView$p2 = this.f111973d.boxWebView;
            if (access$getBoxWebView$p2 != null) {
                access$getBoxWebView$p2.addJavascriptInterface(this.f111973d.getWebViewEnv(), "_finderWebViewEnv");
            }
            BoxWebView access$getBoxWebView$p3 = this.f111973d.boxWebView;
            if (access$getBoxWebView$p3 != null) {
                access$getBoxWebView$p3.mo70468T();
            }
            this.f111973d.onInitWebViewEnd();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.webview.FinderWebViewHelper$e */
    public static final class C41603e extends ProxyWebViewClientExtension {

        /* renamed from: a */
        public final /* synthetic */ FinderWebViewHelper f111974a;

        public C41603e(FinderWebViewHelper finderWebViewHelper) {
            this.f111974a = finderWebViewHelper;
        }

        public Object onMiscCallBack(String str, Bundle bundle) {
            String str2;
            String string;
            Log.m105924i(FinderWebViewHelper.TAG, "method bundle :" + str + "  bundle:" + bundle);
            if (!C87412m.m108589b(str, "shouldInterceptLoadError")) {
                return null;
            }
            int i = bundle != null ? bundle.getInt(OpenSDKTool4Assistant.EXTRA_ERROR_CODE) : 0;
            String str3 = "";
            if (bundle == null || (str2 = bundle.getString("description")) == null) {
                str2 = str3;
            }
            if (!(bundle == null || (string = bundle.getString("failingUrl")) == null)) {
                str3 = string;
            }
            Log.m105924i(FinderWebViewHelper.TAG, "errCode :" + i + " description:" + str2 + " failingUrl:" + str3);
            this.f111974a.onError();
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.webview.FinderWebViewHelper$f */
    public static final class C41604f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderWebViewHelper f111975d;

        /* renamed from: e */
        public final /* synthetic */ String f111976e;

        public C41604f(FinderWebViewHelper finderWebViewHelper, String str) {
            this.f111975d = finderWebViewHelper;
            this.f111976e = str;
        }

        public final void run() {
            C52267zi access$getHomeContext$p = this.f111975d.homeContext;
            if (access$getHomeContext$p != null) {
                access$getHomeContext$p.f145968f = this.f111976e;
            }
            C45520t access$getWebViewController$p = this.f111975d.webViewController;
            if (access$getWebViewController$p != null) {
                access$getWebViewController$p.mo67754x(this.f111976e, (Map<String, String>) null, false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.webview.FinderWebViewHelper$g */
    public static final class C41605g implements C53813j {

        /* renamed from: a */
        public final /* synthetic */ FinderWebViewHelper f111977a;

        public C41605g(FinderWebViewHelper finderWebViewHelper) {
            this.f111977a = finderWebViewHelper;
        }

        /* renamed from: a */
        public void mo64750a(float f, float f2, float f3) {
            this.f111977a.onDialogHeightChange(f, f2, f3);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.webview.FinderWebViewHelper$h */
    public static final class C41606h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f111978d;

        /* renamed from: e */
        public final /* synthetic */ FinderWebViewHelper f111979e;

        /* renamed from: f */
        public final /* synthetic */ boolean f111980f;

        public C41606h(String str, FinderWebViewHelper finderWebViewHelper, boolean z) {
            this.f111978d = str;
            this.f111979e = finderWebViewHelper;
            this.f111980f = z;
        }

        public final void run() {
            String str;
            if (!Util.isNullOrNil(this.f111978d)) {
                str = this.f111978d;
            } else {
                C52267zi access$getHomeContext$p = this.f111979e.homeContext;
                if (access$getHomeContext$p == null || (str = access$getHomeContext$p.f145968f) == null) {
                    str = "";
                }
            }
            Log.m105924i(FinderWebViewHelper.TAG, "startLoadUrl " + str);
            this.f111979e.mCurrentURL = str;
            if (!this.f111980f) {
                C45520t access$getWebViewController$p = this.f111979e.webViewController;
                if (access$getWebViewController$p != null) {
                    Intent intent = new Intent();
                    intent.putExtra("rawUrl", str);
                    intent.putExtra("useJs", true);
                    intent.putExtra("startTime", System.currentTimeMillis());
                    access$getWebViewController$p.mo67677I(intent);
                    return;
                }
                return;
            }
            C45520t access$getWebViewController$p2 = this.f111979e.webViewController;
            if (access$getWebViewController$p2 != null) {
                access$getWebViewController$p2.reload();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.webview.FinderWebViewHelper$i */
    public static final class C41607i extends C43519u {

        /* renamed from: a */
        public final /* synthetic */ FinderWebViewHelper f111981a;

        public C41607i(FinderWebViewHelper finderWebViewHelper) {
            this.f111981a = finderWebViewHelper;
        }

        /* renamed from: b */
        public void mo64752b(WebView webView, String str) {
            Log.m105924i(FinderWebViewHelper.TAG, "onPageCommitVisible :" + str);
            Log.m105924i(FinderWebViewHelper.TAG, "webViewReady");
            this.f111981a.onWebViewReady();
        }

        /* renamed from: c */
        public void mo64753c(WebView webView, String str) {
            Log.m105924i(FinderWebViewHelper.TAG, "onPageFinished :" + str);
        }

        /* renamed from: d */
        public void mo62156d(WebView webView, String str) {
            Log.m105924i(FinderWebViewHelper.TAG, "onPageStarted :" + str);
            Log.m105924i(FinderWebViewHelper.TAG, "webViewReady");
            this.f111981a.onWebViewReady();
        }

        /* renamed from: e */
        public void mo64754e(WebView webView, int i, String str, String str2) {
            Log.m105924i(FinderWebViewHelper.TAG, "onReceivedError errorCode :" + i + " description:" + str + " failingUrl:" + str2);
        }

        /* renamed from: f */
        public void mo64755f(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            StringBuilder sb = new StringBuilder();
            sb.append("onReceivedError request :");
            sb.append(webResourceRequest);
            sb.append(" error:");
            sb.append(webResourceError);
            sb.append(" isForMain:");
            sb.append(webResourceRequest != null ? Boolean.valueOf(webResourceRequest.isForMainFrame()) : null);
            Log.m105924i(FinderWebViewHelper.TAG, sb.toString());
            boolean z = true;
            if (webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
                z = false;
            }
            if (z) {
                this.f111981a.onError();
            }
        }

        /* renamed from: g */
        public void mo64756g(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            StringBuilder sb = new StringBuilder();
            sb.append("onReceivedHttpError :");
            sb.append(webResourceRequest != null ? Boolean.valueOf(webResourceRequest.isForMainFrame()) : null);
            Log.m105924i(FinderWebViewHelper.TAG, sb.toString());
            boolean z = true;
            if (webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
                z = false;
            }
            if (z) {
                this.f111981a.onError();
            }
        }

        /* renamed from: h */
        public void mo64757h(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            Log.m105924i(FinderWebViewHelper.TAG, "onReceivedSslError");
            String access$getMCurrentURL$p = this.f111981a.mCurrentURL;
            if (Util.isNullOrNil(access$getMCurrentURL$p)) {
                Log.m105918d(FinderWebViewHelper.TAG, "urlStr == null, return");
                return;
            }
            if (this.f111981a.sslErrorHandler == null && webView != null) {
                this.f111981a.sslErrorHandler = ((C45518r0) C86312j.m106911c(C45518r0.class)).mo70757gO(webView.getContext(), webView);
            }
            C43856f access$getSslErrorHandler$p = this.f111981a.sslErrorHandler;
            if (access$getSslErrorHandler$p != null) {
                ((C43976g) access$getSslErrorHandler$p).mo68566b(access$getMCurrentURL$p, sslErrorHandler, sslError);
            }
            if (!WeChatEnvironment.isCoolassistEnv()) {
                this.f111981a.onError();
            }
        }
    }

    public FinderWebViewHelper(Context context2, C52267zi ziVar, Window window, int i) {
        C87412m.m108594g(context2, "context");
        this.webViewEnv = new C41639o();
        this.mCurrentURL = "";
        this.mWebViewStatusListeners = new ArrayList();
        this.webViewClientListener = new C41607i(this);
        this.scrollHeightListener = new C41605g(this);
        this.errorRunnable = new C41600b(this);
        this.context = context2;
        this.homeContext = ziVar;
        this.dialogWindow = window;
        this.scene = i;
    }

    private final void initWebView() {
        onInitWebViewStart();
        Log.m105924i(TAG, "initWebView");
        ((C119157j) C119157j.f356862d).mo183895z(new C41602d(this));
    }

    private final void initWebViewController() {
        Class cls = C45513i0.class;
        C45520t.C45522b bVar = new C45520t.C45522b((C45520t.C45523c) null, true, true, false, false, 0, false, 105, (C8480h) null);
        int i = this.scene;
        if (i != 0) {
            bVar.f123184f = i;
        }
        BoxWebView boxWebView2 = this.boxWebView;
        C87412m.m108591d(boxWebView2);
        Context context2 = null;
        C45520t Q3 = ((C45513i0) C86312j.m106911c(cls)).mo70780Q3(boxWebView2, bVar, (C13853i) null);
        this.webViewController = Q3;
        if (Q3 != null) {
            String str = this.webViewEnv.f112084d;
            if (str == null) {
                str = "";
            }
            Q3.mo67733n(str);
            C41636l lVar = this.webViewControllerListener;
            if (lVar != null) {
                C45520t tVar = this.webViewController;
                if (tVar != null) {
                    tVar.mo67741p(lVar);
                }
                lVar.f112078c = new WeakReference<>(Q3);
                C45513i0 i0Var = (C45513i0) C86312j.m106911c(cls);
                WeakReference<C45520t> weakReference = lVar.f112078c;
                C45520t tVar2 = weakReference != null ? weakReference.get() : null;
                WeakReference<Context> weakReference2 = lVar.f112077b;
                if (weakReference2 != null) {
                    context2 = weakReference2.get();
                }
                C43783b gR = i0Var.mo70784gR(tVar2, context2);
                C87412m.m108593f(gR, "getService(IWebViewFeatu…get(), contextRef?.get())");
                lVar.f112080e = gR;
                lVar.f112079d = new WeakReference<>(this.errorRunnable);
            }
            Q3.mo67671F(this.webViewClientListener);
            BoxWebView boxWebView3 = this.boxWebView;
            if (boxWebView3 != null) {
                boxWebView3.setWebViewClientExtension(new C41603e(this));
            }
            Q3.init();
        }
    }

    /* access modifiers changed from: private */
    public final void onCreateBoxWebViewEnd(boolean z, boolean z2, boolean z3) {
        for (C41647w.C41649b b : this.mWebViewStatusListeners) {
            b.mo64677b(z, z2, z3);
        }
    }

    private final void onCreateBoxWebViewStart() {
        for (C41647w.C41649b d : this.mWebViewStatusListeners) {
            d.mo64679d();
        }
    }

    /* access modifiers changed from: private */
    public final void onDialogHeightChange(float f, float f2, float f3) {
        C7580y q;
        HashMap hashMap = new HashMap();
        hashMap.put("onVisibleHeightChange", Float.valueOf(f));
        hashMap.put("peekHeight", Float.valueOf(f2));
        hashMap.put("maxHeight", Float.valueOf(f3));
        C45520t controller = getController();
        if (controller != null) {
            controller.mo67725i(f3);
        }
        C45520t controller2 = getController();
        if (controller2 != null) {
            controller2.mo67675H(f2);
        }
        C45520t controller3 = getController();
        if (controller3 != null) {
            controller3.mo67747s(f);
        }
        C41639o oVar = this.webViewEnv;
        oVar.f112082b = f3;
        oVar.f112081a = f2;
        oVar.f112083c = f;
        C45520t tVar = this.webViewController;
        if (!(tVar == null || (q = tVar.mo67743q()) == null)) {
            q.mo8701f("onVisibleHeightChange", hashMap);
        }
        Log.m105924i(TAG, "onDialogHeightChange:" + f + ", peekHeight=" + f2 + " maxHeight=" + f3);
    }

    /* access modifiers changed from: private */
    public final void onError() {
        for (C41647w.C41649b a : this.mWebViewStatusListeners) {
            a.mo64676a();
        }
    }

    private final void onExecuteActionCode(int i, Bundle bundle) {
        for (C41647w.C41649b f : this.mWebViewStatusListeners) {
            f.mo64681f(i, bundle);
        }
    }

    /* access modifiers changed from: private */
    public final void onInitWebViewEnd() {
        for (C41647w.C41649b c : this.mWebViewStatusListeners) {
            c.mo64678c();
        }
    }

    private final void onInitWebViewStart() {
        for (C41647w.C41649b e : this.mWebViewStatusListeners) {
            e.mo64680e();
        }
    }

    /* access modifiers changed from: private */
    public final void onWebViewReady() {
        for (C41647w.C41649b g : this.mWebViewStatusListeners) {
            g.mo64682g();
        }
    }

    public void addWebViewStateListener(C41647w.C41649b bVar) {
        if (bVar != null && !this.mWebViewStatusListeners.contains(bVar)) {
            this.mWebViewStatusListeners.add(bVar);
        }
    }

    public void clearWebViewStateListener() {
        this.mWebViewStatusListeners.clear();
    }

    public final MultiCodeMaskView getCodeMaskView() {
        return this.codeMaskView;
    }

    public Context getContext() {
        return this.context;
    }

    public C45520t getController() {
        return this.webViewController;
    }

    public String getCurrentURL() {
        C45520t tVar = this.webViewController;
        if (tVar == null || Util.isNullOrNil(tVar.getCurrentUrl())) {
            C52267zi ziVar = this.homeContext;
            String str = ziVar != null ? ziVar.f145968f : null;
            return str == null ? "" : str;
        }
        String currentUrl = tVar.getCurrentUrl();
        return currentUrl == null ? "" : currentUrl;
    }

    public final Window getDialogWindow() {
        return this.dialogWindow;
    }

    public C43791l getInvoke() {
        C45520t tVar = this.webViewController;
        if (tVar != null) {
            return tVar.mo67731m();
        }
        return null;
    }

    public MultiCodeMaskView getMaskView() {
        return this.codeMaskView;
    }

    public C45310h getPerm() {
        C45520t tVar = this.webViewController;
        if (tVar != null) {
            return tVar.mo67669E();
        }
        return null;
    }

    public final C41645u getPosProvider() {
        return this.posProvider;
    }

    public final C53813j getScrollHeightListener() {
        return this.scrollHeightListener;
    }

    public Float getTouchX() {
        float f;
        C41645u uVar = this.posProvider;
        if (uVar != null) {
            f = uVar.mo64867b();
        } else {
            float f2 = ScrollFrameLayout.f112048w;
            f = ScrollFrameLayout.f112048w;
        }
        return Float.valueOf(f);
    }

    public Float getTouchY() {
        float f;
        C41645u uVar = this.posProvider;
        if (uVar != null) {
            f = uVar.mo64866a();
        } else {
            float f2 = ScrollFrameLayout.f112048w;
            f = ScrollFrameLayout.f112049x;
        }
        return Float.valueOf(f);
    }

    public int getWVTopOffset() {
        int i;
        if (this.boxWebView == null || getWindow() == null) {
            i = 0;
        } else {
            Window window = getWindow();
            C87412m.m108591d(window);
            int measuredHeight = window.getDecorView().getMeasuredHeight();
            BoxWebView boxWebView2 = this.boxWebView;
            C87412m.m108591d(boxWebView2);
            i = (measuredHeight - boxWebView2.getMeasuredHeight()) - C75044y4.m89991c(this.context);
        }
        Log.m105918d(TAG, "getWVTopOffset :" + i);
        return i;
    }

    public MMWebView getWebView() {
        return this.boxWebView;
    }

    public final C41639o getWebViewEnv() {
        return this.webViewEnv;
    }

    public Window getWindow() {
        return this.dialogWindow;
    }

    public MMWebView getWithInitWebView() {
        BoxWebView boxWebView2;
        boolean z;
        if (!this.hasInitWebView) {
            onCreateBoxWebViewStart();
            Context context2 = this.context;
            C87412m.m108591d(context2);
            C41601c cVar = new C41601c(this);
            synchronized (C30036j.f81282f) {
                boxWebView2 = null;
                if (C30036j.f81278b != null) {
                    BoxWebView boxWebView3 = C30036j.f81278b;
                    C87412m.m108591d(boxWebView3);
                    if (!boxWebView3.f122358h) {
                        Log.m105926v("MicroMsg.BoxWebViewPreloadManager", "alvinluo fetchBoxWebView use preload webView");
                        BoxWebView boxWebView4 = C30036j.f81278b;
                        C30036j.f81278b = null;
                        boxWebView2 = boxWebView4;
                    }
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
            if (boxWebView2 == null) {
                boxWebView2 = new BoxWebView(context2);
                z = false;
            } else {
                boxWebView2.mo70470f(context2);
                z = true;
            }
            cVar.invoke(Boolean.valueOf(C30036j.f81279c), Boolean.valueOf(C30036j.f81281e), Boolean.valueOf(z));
            boolean z2 = C30036j.f81280d;
            if (z2 && C30036j.f81279c && z2) {
                Log.m105927v("MicroMsg.BoxWebViewPreloadManager", "alvinluo preloadBoxWebView delay: %d", 1500L);
                C30035h hVar = C30035h.f81276d;
                MMHandler mMHandler = C30036j.f81283g;
                if (mMHandler != null) {
                    mMHandler.postDelayed(new C41633i(hVar), 1500);
                }
            }
            this.boxWebView = boxWebView2;
            C41636l lVar = new C41636l();
            Context context3 = this.context;
            if (context3 != null) {
                lVar.f112077b = new WeakReference<>(context3);
            }
            this.webViewControllerListener = lVar;
            initWebViewController();
            initWebView();
            this.longClickHelper = new WebViewLongClickHelper(this);
            BoxWebView boxWebView5 = this.boxWebView;
            Class cls = C32735h.class;
            if (((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_webview_long_press_test_enable, 0) == 1) {
                Log.m105924i("MicroMsg.WebViewLongClickHelper", "WebViewLongPress AB Test Enabled");
                int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_webview_long_press_menu_duration, 500);
                if (Qe < 150 || Qe > 2500) {
                    Log.m105929w("MicroMsg.WebViewLongClickHelper", "WebViewLongPress  is invalid, time = %d", Integer.valueOf(Qe));
                } else {
                    Log.m105925i("MicroMsg.WebViewLongClickHelper", "WebViewLongPress Set Time: %d", Integer.valueOf(Qe));
                    boxWebView5.getSettings().enableCustomizedLongPressTimeout(Qe);
                }
            }
            WebViewLongClickHelper webViewLongClickHelper = this.longClickHelper;
            if (!(webViewLongClickHelper == null || webViewLongClickHelper.mo64769f().getWebView() == null)) {
                webViewLongClickHelper.mo64769f().getWebView().setOnLongClickListener(new C41630f0(webViewLongClickHelper));
            }
            this.hasInitWebView = true;
        }
        BoxWebView boxWebView6 = this.boxWebView;
        C87412m.m108591d(boxWebView6);
        return boxWebView6;
    }

    public boolean isRelease() {
        return this.isReleased;
    }

    public void release() {
        Log.m105924i(TAG, "release destroy");
        this.isReleased = true;
        clearWebViewStateListener();
        C45520t tVar = this.webViewController;
        if (tVar != null) {
            ((C45518r0) C86312j.m106911c(C45518r0.class)).L80(tVar.mo67719g(), (Context) null, (C6107m) null, (C6107m) null);
        }
        BoxWebView boxWebView2 = this.boxWebView;
        if (boxWebView2 != null) {
            boxWebView2.destroy();
        }
        this.boxWebView = null;
        C45520t tVar2 = this.webViewController;
        if (tVar2 != null) {
            tVar2.onDestroy();
        }
        C41636l lVar = this.webViewControllerListener;
        if (lVar != null) {
            C45520t tVar3 = this.webViewController;
            if (tVar3 != null) {
                tVar3.mo67756y(lVar);
            }
            lVar.f112077b = null;
        }
        C45520t tVar4 = this.webViewController;
        if (tVar4 != null) {
            tVar4.mo67723h(this.webViewClientListener);
        }
        this.webViewControllerListener = null;
        MultiCodeMaskView multiCodeMaskView = this.codeMaskView;
        if (multiCodeMaskView != null && multiCodeMaskView.getVisibility() == 0) {
            long j = 0;
            WebViewLongClickHelper webViewLongClickHelper = this.longClickHelper;
            if (webViewLongClickHelper != null) {
                C87412m.m108591d(webViewLongClickHelper);
                Long l = webViewLongClickHelper.f112009k;
                C87412m.m108593f(l, "longClickHelper!!.mCodeSessionId");
                j = l.longValue();
            }
            multiCodeMaskView.mo67041d(j, false);
        }
        this.longClickHelper = null;
        this.webViewController = null;
        this.context = null;
    }

    public void reload() {
        C41647w.C41648a.m44995a(this, (String) null, false, 3, (Object) null);
    }

    public final void reloadUrl(String str) {
        C87412m.m108594g(str, "url");
        ((C119157j) C119157j.f356862d).mo183895z(new C41604f(this, str));
    }

    public void removeWebViewStateListener(C41647w.C41649b bVar) {
        if (bVar != null && this.mWebViewStatusListeners.contains(bVar)) {
            this.mWebViewStatusListeners.remove(bVar);
        }
    }

    public final void setCodeMaskView(MultiCodeMaskView multiCodeMaskView) {
        this.codeMaskView = multiCodeMaskView;
    }

    public final void setDialogWindow(Window window) {
        this.dialogWindow = window;
    }

    public final void setPosProvider(C41645u uVar) {
        this.posProvider = uVar;
    }

    public void startLoadUrl(String str, boolean z) {
        C87412m.m108594g(str, "url");
        ((C119157j) C119157j.f356862d).mo183895z(new C41606h(str, this, z));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FinderWebViewHelper(Context context2, C52267zi ziVar, Window window, int i, int i2, C8480h hVar) {
        this(context2, ziVar, (i2 & 4) != 0 ? null : window, (i2 & 8) != 0 ? 0 : i);
    }
}
