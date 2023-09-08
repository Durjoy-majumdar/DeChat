package ay0;

import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.os.Looper;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.p471ui.MpWebViewController;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMSlotKt;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.WebView;
import com.tencent.xweb.XWebSdk;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.concurrent.ConcurrentHashMap;
import o40.C61926c;
import org.xwalk.core.XWalkEnvironment;
import rx3.C13598b0;
import te3.ah4;
import z04.C112551y;

/* renamed from: ay0.k */
public final class C39656k {

    /* renamed from: a */
    public static final C39656k f106417a = new C39656k();

    /* renamed from: b */
    public static final ConcurrentHashMap<Integer, MpWebViewController> f106418b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public static final ConcurrentHashMap<Integer, MpWebViewController> f106419c = new ConcurrentHashMap<>();

    /* renamed from: ay0.k$a */
    public static final class C39657a extends MMWebView {

        /* renamed from: t */
        public C32224a<String> f106420t;

        /* renamed from: u */
        public C32226l<? super String, Boolean> f106421u;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39657a(Context context) {
            super(context);
            C87412m.m108594g(context, "context");
        }

        public final C32224a<String> getCurrentUrlProxy() {
            return this.f106420t;
        }

        public String getUrl() {
            C32226l<? super String, Boolean> lVar;
            String url = super.getUrl();
            if (this.f106420t == null || (lVar = this.f106421u) == null) {
                return url;
            }
            C87412m.m108591d(lVar);
            if (lVar.invoke(url).booleanValue()) {
                return url;
            }
            C32224a<String> aVar = this.f106420t;
            C87412m.m108591d(aVar);
            return aVar.invoke();
        }

        public final C32226l<String, Boolean> getValidUrlProxy() {
            return this.f106421u;
        }

        public final void setCurrentUrlProxy(C32224a<String> aVar) {
            this.f106420t = aVar;
        }

        public final void setValidUrlProxy(C32226l<? super String, Boolean> lVar) {
            this.f106421u = lVar;
        }
    }

    /* renamed from: ay0.k$b */
    public static final class C39658b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ int f106422d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39658b(int i) {
            super(0);
            this.f106422d = i;
        }

        public Object invoke() {
            Looper.myQueue().addIdleHandler(new C39659m(this.f106422d));
            return C13598b0.f38549a;
        }
    }

    static {
        new MultiProcessMMKV.NativeBuffer(0, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m42267a(ay0.C39656k r5, int r6) {
        /*
            monitor-enter(r5)
            r0 = 6
            if (r6 != r0) goto L_0x0007
            monitor-exit(r5)
            goto L_0x0091
        L_0x0007:
            java.lang.String r0 = "MicroMsg.Preload.TmplWebViewManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0092 }
            r1.<init>()     // Catch:{ all -> 0x0092 }
            java.lang.String r2 = "[preloadWebViewInner]tmplParams: "
            r1.append(r2)     // Catch:{ all -> 0x0092 }
            r1.append(r6)     // Catch:{ all -> 0x0092 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0092 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x0092 }
            te3.ah4 r0 = xx0.C53458b.m59912d(r6)     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x0090
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController> r1 = f106418b     // Catch:{ all -> 0x0092 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0092 }
            boolean r2 = r1.containsKey(r2)     // Catch:{ all -> 0x0092 }
            if (r2 != 0) goto L_0x0079
            ay0.k r2 = f106417a     // Catch:{ all -> 0x0092 }
            android.content.MutableContextWrapper r3 = new android.content.MutableContextWrapper     // Catch:{ all -> 0x0092 }
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0092 }
            r3.<init>(r4)     // Catch:{ all -> 0x0092 }
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController r0 = r2.mo62219b(r0, r3)     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x0090
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0092 }
            r1.put(r2, r0)     // Catch:{ all -> 0x0092 }
            r1 = -103(0xffffffffffffff99, float:NaN)
            ay0.l r2 = new ay0.l     // Catch:{ all -> 0x0092 }
            r2.<init>(r6, r0)     // Catch:{ all -> 0x0092 }
            java.util.concurrent.ConcurrentLinkedDeque r1 = r0.mo67735o0(r1)     // Catch:{ all -> 0x0092 }
            r1.add(r2)     // Catch:{ all -> 0x0092 }
            java.lang.String r1 = "MicroMsg.Preload.TmplWebViewManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0092 }
            r2.<init>()     // Catch:{ all -> 0x0092 }
            java.lang.String r3 = "preload:"
            r2.append(r3)     // Catch:{ all -> 0x0092 }
            r2.append(r6)     // Catch:{ all -> 0x0092 }
            java.lang.String r6 = ", "
            r2.append(r6)     // Catch:{ all -> 0x0092 }
            int r6 = r0.mo67719g()     // Catch:{ all -> 0x0092 }
            r2.append(r6)     // Catch:{ all -> 0x0092 }
            java.lang.String r6 = r2.toString()     // Catch:{ all -> 0x0092 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r6)     // Catch:{ all -> 0x0092 }
            goto L_0x0090
        L_0x0079:
            java.lang.String r0 = "MicroMsg.Preload.TmplWebViewManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0092 }
            r1.<init>()     // Catch:{ all -> 0x0092 }
            java.lang.String r2 = "preload skip when exist:"
            r1.append(r2)     // Catch:{ all -> 0x0092 }
            r1.append(r6)     // Catch:{ all -> 0x0092 }
            java.lang.String r6 = r1.toString()     // Catch:{ all -> 0x0092 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r6)     // Catch:{ all -> 0x0092 }
        L_0x0090:
            monitor-exit(r5)
        L_0x0091:
            return
        L_0x0092:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ay0.C39656k.m42267a(ay0.k, int):void");
    }

    /* renamed from: b */
    public final MpWebViewController mo62219b(ah4 ah4, MutableContextWrapper mutableContextWrapper) {
        int i = ah4.f130536d;
        if (i == -1) {
            Log.m105929w("MicroMsg.Preload.TmplWebViewManager", "[preloadWebViewInner] empty tmplType %d", Integer.valueOf(i));
            return null;
        } else if (Util.isNullOrNil(ah4.f130538f)) {
            Log.m105928w("MicroMsg.Preload.TmplWebViewManager", "[preloadWebViewInner] initUrl " + ah4.f130538f + " is empty");
            return null;
        } else if (!C86013q1.m106450k(ah4.f130539g)) {
            Log.m105929w("MicroMsg.Preload.TmplWebViewManager", "[preloadWebViewInner] filePath %s isn't exist", ah4.f130539g);
            return null;
        } else {
            try {
                XWebSdk.initWebviewCore(mutableContextWrapper, MMWebView.f122352r, MMApplicationContext.isMainProcess() ? XWalkEnvironment.MODULE_MM : XWalkEnvironment.MODULE_TOOLS, (WebView.PreInitCallback) null);
                MpWebViewController mpWebViewController = new MpWebViewController(ah4, new C39657a(mutableContextWrapper));
                mpWebViewController.init();
                return mpWebViewController;
            } catch (Exception e) {
                Log.m105928w("MicroMsg.Preload.TmplWebViewManager", "createWebView ex " + e.getMessage());
                return null;
            }
        }
    }

    /* renamed from: c */
    public final MpWebViewController mo62220c(Context context, int i, Intent intent, long j) {
        MpWebViewController mpWebViewController;
        synchronized (this) {
            ConcurrentHashMap<Integer, MpWebViewController> concurrentHashMap = f106419c;
            mpWebViewController = concurrentHashMap.get(Integer.valueOf(i));
            if (mpWebViewController != null) {
                C87412m.m108594g(intent, "intent");
                boolean z = false;
                if (mpWebViewController.f117528F) {
                    String stringExtra = intent.getStringExtra("rawUrl");
                    if (C87412m.m108589b(stringExtra != null ? C112551y.m153817q(stringExtra, HttpWrapperBase.PROTOCAL_HTTP, HttpWrapperBase.PROTOCAL_HTTPS, false) : null, mpWebViewController.mo63683n0())) {
                        z = true;
                    }
                }
                if (z) {
                    Log.m105924i("MicroMsg.Preload.TmplWebViewManager", "pick started:" + i + ", " + mpWebViewController.mo67719g());
                    concurrentHashMap.remove(Integer.valueOf(i));
                }
            }
            ConcurrentHashMap<Integer, MpWebViewController> concurrentHashMap2 = f106418b;
            mpWebViewController = concurrentHashMap2.get(Integer.valueOf(i));
            if (mpWebViewController != null) {
                if (mpWebViewController.mo67748s0(-102)) {
                    concurrentHashMap2.remove(Integer.valueOf(i));
                    Log.m105924i("MicroMsg.Preload.TmplWebViewManager", "pick cached:" + i + ", " + mpWebViewController.mo67719g());
                } else {
                    Log.m105928w("MicroMsg.Preload.TmplWebViewManager", "pick null when tmpl not ready:" + i + ", " + mpWebViewController.mo67719g());
                }
            }
            Log.m105928w("MicroMsg.Preload.TmplWebViewManager", "pick null:" + i);
            mpWebViewController = null;
        }
        if (mpWebViewController == null) {
            return null;
        }
        Log.m105926v("MicroMsg.Preload.TmplWebViewManager", "[obtainPreloadWebview] preloadWebviews");
        MMWebView mMWebView = mpWebViewController.f117553a;
        mMWebView.getPerformanceHelper().mo73829a("onCreateStart", j);
        mMWebView.mo70470f(context);
        mMWebView.getPerformanceHelper().mo73829a("onCreateEnd", MMSlotKt.now());
        return mpWebViewController;
    }

    /* renamed from: d */
    public final void mo62221d(int i) {
        if (!C29783w.m38875a().getBoolean("preload_tmpl_test_no_preload_next", false)) {
            Log.m105924i("MicroMsg.Preload.TmplWebViewManager", "tryPreloadTmplWebview:" + i);
            C61926c.m72668M(new C39658b(i));
        }
    }
}
