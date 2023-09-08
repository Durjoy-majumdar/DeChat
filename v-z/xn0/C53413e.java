package xn0;

import a14.C0000n0;
import a14.C53895h;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import com.google.android.gms.common.internal.Constants;
import com.google.android.gms.wearable.WearableStatusCodes;
import com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate;
import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.autogen.events.ApduEngineFuncEvent;
import com.tencent.p014mm.p136ui.tools.C45082x0;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.appbrand.jsapi.webview.C40478h;
import com.tencent.p014mm.plugin.appbrand.jsapi.webview.C83107f;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.scanner.ScanCodeSheetItemLogic;
import com.tencent.p014mm.plugin.webview.core.C43505b0;
import com.tencent.p014mm.plugin.webview.core.C43522y;
import com.tencent.p014mm.plugin.webview.core.C43558z;
import com.tencent.p014mm.plugin.webview.modeltools.C6085v;
import com.tencent.p014mm.plugin.webview.modeltools.NFCIPCHelper;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44307k0;
import com.tencent.p014mm.plugin.webview.stub.C43791l;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import com.tencent.xweb.CookieManager;
import com.tencent.xweb.WebResourceRequest;
import com.tencent.xweb.WebResourceResponse;
import com.tencent.xweb.WebView;
import d93.C45298c;
import d93.C45310h;
import di3.C7335d;
import di3.C86312j;
import ea3.C45591h;
import ex0.C45696d;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.io.ByteArrayInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import ke3.C88144b;
import kotlin.ResultKt;
import nj3.C11184p0;
import o40.C61926c;
import org.json.JSONObject;
import p170ic.C87687a;
import p200lx.C46897s;
import p200lx.C46900z;
import p200lx.C61416x;
import p225rc.C12969d;
import p225rc.C89916g;
import p225rc.C89921j;
import p225rc.g$$f;
import p235sm.C36701o0;
import p235sm.C48419l0;
import p749xh.C66261f3;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import t83.C13841a;
import t83.C48590l;
import te3.C52018xt1;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112550d0;
import z04.C112551y;
import zt3.C119157j;

/* renamed from: xn0.e */
public final class C53413e<V> extends C43522y implements C83107f, C53441u<V> {

    /* renamed from: F1 */
    public final C13601g f150278F1 = C36568h.m40985a(new C38772d(this));

    /* renamed from: G1 */
    public C40478h f150279G1;

    /* renamed from: H1 */
    public C53391b f150280H1;

    /* renamed from: I1 */
    public C53405d f150281I1;

    /* renamed from: J1 */
    public final C13601g f150282J1 = C36568h.m40985a(C38773e.f104588d);

    /* renamed from: K1 */
    public String f150283K1;

    /* renamed from: L1 */
    public String f150284L1;

    /* renamed from: M1 */
    public final C53414a f150285M1;

    /* renamed from: N1 */
    public final C53425k f150286N1;

    /* renamed from: xn0.e$d */
    public static final class C38772d extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C53413e<V> f104587d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38772d(C53413e<V> eVar) {
            super(0);
            this.f104587d = eVar;
        }

        public Object invoke() {
            return "MicroMsg.AppBrand.HTMLWebViewController:" + this.f104587d.mo67719g();
        }
    }

    /* renamed from: xn0.e$e */
    public static final class C38773e extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C38773e f104588d = new C38773e();

        public C38773e() {
            super(0);
        }

        public Object invoke() {
            boolean z = false;
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_appbrand_disable_html_webview_deeplink_jump, 0) == 1) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.appbrand.jsapi.webview.bwc.HTMLWebViewController$interceptResourceForWxGifBytes$gifBytes$1", mo125469f = "HTMLWebViewController.kt", mo125470l = {287}, mo125471m = "invokeSuspend")
    /* renamed from: xn0.e$h */
    public static final class C38774h extends C91594j implements C32227p<C0000n0, C15601d<? super byte[]>, Object> {

        /* renamed from: d */
        public int f104589d;

        /* renamed from: e */
        public final /* synthetic */ String f104590e;

        /* renamed from: f */
        public final /* synthetic */ String f104591f;

        /* renamed from: g */
        public final /* synthetic */ String f104592g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38774h(String str, String str2, String str3, C15601d<? super C38774h> dVar) {
            super(2, dVar);
            this.f104590e = str;
            this.f104591f = str2;
            this.f104592g = str3;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C38774h(this.f104590e, this.f104591f, this.f104592g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C38774h) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f104589d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C7335d c = C86312j.m106911c(C36701o0.class);
                C87412m.m108593f(c, "getService(IEmojiFetcherService::class.java)");
                String str = this.f104590e;
                String str2 = this.f104591f;
                String str3 = this.f104592g;
                this.f104589d = 1;
                obj = ((C36701o0) c).Ce0(str, str2, str3, (String) null, (String) null, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    /* renamed from: xn0.e$a */
    public interface C53414a {
        /* renamed from: a */
        boolean mo74064a(int i, boolean z, String str, String str2);

        /* renamed from: b */
        boolean mo74065b(String str, boolean z, int i);

        /* renamed from: u */
        void mo74066u(String str);
    }

    /* renamed from: xn0.e$b */
    public final class C53415b implements C53414a {

        /* renamed from: a */
        public boolean f150287a;

        /* renamed from: b */
        public final LinkedList<C32224a<C13598b0>> f150288b = new LinkedList<>();

        /* renamed from: xn0.e$b$a */
        public static final class C53416a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C53413e<V>.b f150290d;

            public C53416a(C53413e<V>.b bVar) {
                this.f150290d = bVar;
            }

            public final void run() {
                while (!this.f150290d.f150288b.isEmpty()) {
                    C32224a<C13598b0> pollFirst = this.f150290d.f150288b.pollFirst();
                    C87412m.m108591d(pollFirst);
                    pollFirst.invoke();
                }
                this.f150290d.f150287a = true;
            }
        }

        /* renamed from: xn0.e$b$b */
        public static final class C53417b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C53413e<V> f150291d;

            /* renamed from: e */
            public final /* synthetic */ String f150292e;

            /* renamed from: f */
            public final /* synthetic */ C53413e<V>.b f150293f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C53417b(C53413e<V> eVar, String str, C53413e<V>.b bVar) {
                super(0);
                this.f150291d = eVar;
                this.f150292e = str;
                this.f150293f = bVar;
            }

            /* JADX INFO: finally extract failed */
            public Object invoke() {
                try {
                    String currentUrl = this.f150291d.getCurrentUrl();
                    C53413e<V> eVar = this.f150291d;
                    String str = eVar.f117522C;
                    String A1 = eVar.mo74052A1();
                    StringBuilder sb = new StringBuilder();
                    sb.append("requestLoadUrl(url:");
                    sb.append(this.f150292e);
                    sb.append("), viewHash:");
                    C40478h hVar = this.f150291d.f150279G1;
                    if (hVar != null) {
                        sb.append(hVar.hashCode());
                        sb.append(", currentUrl:");
                        sb.append(currentUrl);
                        sb.append(", commitUrl:");
                        sb.append(str);
                        sb.append(", hasStartCalled:");
                        sb.append(this.f150291d.f117528F);
                        sb.append(", isFirstGetA8KeyResponded:");
                        sb.append(this.f150293f.f150287a);
                        Log.m105924i(A1, sb.toString());
                        C53413e<V> eVar2 = this.f150291d;
                        if (!eVar2.f117528F) {
                            Intent intent = new Intent();
                            String str2 = this.f150292e;
                            C53413e<V> eVar3 = this.f150291d;
                            intent.putExtra("rawUrl", str2);
                            intent.putExtra("useJs", true);
                            C40478h hVar2 = eVar3.f150279G1;
                            if (hVar2 != null) {
                                intent.putExtra("geta8key_open_webview_appid", hVar2.getAppId());
                                eVar2.mo67677I(intent);
                                C53413e<V> eVar4 = this.f150291d;
                                if (eVar4.f117519A0 != null) {
                                    eVar4.mo67751u0(this.f150292e);
                                }
                            } else {
                                C87412m.m108603p("mView");
                                throw null;
                            }
                        } else {
                            C53413e<V>.b bVar = this.f150293f;
                            C53431f fVar = new C53431f(this.f150292e, currentUrl, eVar2);
                            if (bVar.f150287a) {
                                fVar.invoke();
                            } else {
                                bVar.f150288b.addLast(fVar);
                            }
                        }
                        this.f150291d.f150284L1 = this.f150292e;
                        return C13598b0.f38549a;
                    }
                    C87412m.m108603p("mView");
                    throw null;
                } catch (Throwable th) {
                    this.f150291d.f150284L1 = this.f150292e;
                    throw th;
                }
            }
        }

        public C53415b() {
        }

        /* renamed from: a */
        public boolean mo74064a(int i, boolean z, String str, String str2) {
            C87412m.m108594g(str, "reqUrl");
            C87412m.m108594g(str2, "fullUrl");
            if (this.f150287a || i != 0) {
                return false;
            }
            ((C119157j) C119157j.f356862d).mo183895z(new C53416a(this));
            return false;
        }

        /* renamed from: b */
        public boolean mo74065b(String str, boolean z, int i) {
            C87412m.m108594g(str, "url");
            return false;
        }

        /* renamed from: u */
        public void mo74066u(String str) {
            C87412m.m108594g(str, "url");
            C61926c.m72668M(new C53417b(C53413e.this, str, this));
        }
    }

    /* renamed from: xn0.e$c */
    public final class C53418c implements C53414a {

        /* renamed from: a */
        public final Set<String> f150294a = Collections.newSetFromMap(new ConcurrentHashMap());

        /* renamed from: xn0.e$c$a */
        public static final class C53419a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C53413e<V> f150296d;

            /* renamed from: e */
            public final /* synthetic */ String f150297e;

            /* renamed from: f */
            public final /* synthetic */ C53413e<V>.c f150298f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C53419a(C53413e<V> eVar, String str, C53413e<V>.c cVar) {
                super(0);
                this.f150296d = eVar;
                this.f150297e = str;
                this.f150298f = cVar;
            }

            /* JADX INFO: finally extract failed */
            /* JADX WARNING: Removed duplicated region for block: B:28:0x00b1 A[Catch:{ all -> 0x015d }] */
            /* JADX WARNING: Removed duplicated region for block: B:29:0x00d4 A[Catch:{ all -> 0x015d }] */
            /* JADX WARNING: Removed duplicated region for block: B:38:0x00e6 A[Catch:{ all -> 0x015d }] */
            /* JADX WARNING: Removed duplicated region for block: B:51:0x0145 A[Catch:{ all -> 0x015d }] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object invoke() {
                /*
                    r14 = this;
                    java.lang.String r0 = "requestLoadUrl(url:"
                    xn0.e<V> r1 = r14.f150296d     // Catch:{ all -> 0x015d }
                    java.lang.String r1 = r1.getCurrentUrl()     // Catch:{ all -> 0x015d }
                    xn0.e<V> r2 = r14.f150296d     // Catch:{ all -> 0x015d }
                    java.lang.String r3 = r2.f117522C     // Catch:{ all -> 0x015d }
                    java.lang.String r2 = r2.mo74052A1()     // Catch:{ all -> 0x015d }
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x015d }
                    r4.<init>()     // Catch:{ all -> 0x015d }
                    r4.append(r0)     // Catch:{ all -> 0x015d }
                    java.lang.String r5 = r14.f150297e     // Catch:{ all -> 0x015d }
                    r4.append(r5)     // Catch:{ all -> 0x015d }
                    java.lang.String r5 = "), viewHash:"
                    r4.append(r5)     // Catch:{ all -> 0x015d }
                    xn0.e<V> r5 = r14.f150296d     // Catch:{ all -> 0x015d }
                    com.tencent.mm.plugin.appbrand.jsapi.webview.h r5 = r5.f150279G1     // Catch:{ all -> 0x015d }
                    java.lang.String r6 = "mView"
                    r7 = 0
                    if (r5 == 0) goto L_0x0159
                    int r5 = r5.hashCode()     // Catch:{ all -> 0x015d }
                    r4.append(r5)     // Catch:{ all -> 0x015d }
                    java.lang.String r5 = ", currentUrl:"
                    r4.append(r5)     // Catch:{ all -> 0x015d }
                    r4.append(r1)     // Catch:{ all -> 0x015d }
                    java.lang.String r5 = ", commitUrl:"
                    r4.append(r5)     // Catch:{ all -> 0x015d }
                    r4.append(r3)     // Catch:{ all -> 0x015d }
                    java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x015d }
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)     // Catch:{ all -> 0x015d }
                    xn0.e<V> r2 = r14.f150296d     // Catch:{ all -> 0x015d }
                    boolean r4 = r2.f117528F     // Catch:{ all -> 0x015d }
                    r5 = 1
                    if (r4 != 0) goto L_0x0085
                    android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x015d }
                    r0.<init>()     // Catch:{ all -> 0x015d }
                    java.lang.String r1 = r14.f150297e     // Catch:{ all -> 0x015d }
                    xn0.e<V> r3 = r14.f150296d     // Catch:{ all -> 0x015d }
                    java.lang.String r4 = "rawUrl"
                    r0.putExtra(r4, r1)     // Catch:{ all -> 0x015d }
                    java.lang.String r1 = "useJs"
                    r0.putExtra(r1, r5)     // Catch:{ all -> 0x015d }
                    java.lang.String r1 = "geta8key_open_webview_appid"
                    com.tencent.mm.plugin.appbrand.jsapi.webview.h r3 = r3.f150279G1     // Catch:{ all -> 0x015d }
                    if (r3 == 0) goto L_0x0081
                    java.lang.String r3 = r3.getAppId()     // Catch:{ all -> 0x015d }
                    r0.putExtra(r1, r3)     // Catch:{ all -> 0x015d }
                    r2.mo67677I(r0)     // Catch:{ all -> 0x015d }
                    xn0.e<V> r0 = r14.f150296d     // Catch:{ all -> 0x015d }
                    com.tencent.mm.plugin.webview.core.i r1 = r0.f117519A0     // Catch:{ all -> 0x015d }
                    if (r1 == 0) goto L_0x0150
                    java.lang.String r1 = r14.f150297e     // Catch:{ all -> 0x015d }
                    r0.mo67751u0(r1)     // Catch:{ all -> 0x015d }
                    goto L_0x0150
                L_0x0081:
                    gy3.C87412m.m108603p(r6)     // Catch:{ all -> 0x015d }
                    throw r7     // Catch:{ all -> 0x015d }
                L_0x0085:
                    java.lang.String r8 = r14.f150297e     // Catch:{ all -> 0x015d }
                    java.lang.String r9 = "#"
                    r10 = 0
                    r11 = 0
                    r12 = 6
                    r13 = 0
                    int r2 = z04.C112550d0.m153769E(r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x015d }
                    r4 = 0
                    if (r2 < 0) goto L_0x00d8
                    if (r1 == 0) goto L_0x009f
                    int r2 = r1.length()     // Catch:{ all -> 0x015d }
                    if (r2 != 0) goto L_0x009d
                    goto L_0x009f
                L_0x009d:
                    r2 = 0
                    goto L_0x00a0
                L_0x009f:
                    r2 = 1
                L_0x00a0:
                    if (r2 != 0) goto L_0x00d8
                    java.lang.String r2 = "#wechat_redirect"
                    r8 = 2
                    boolean r1 = z04.C112551y.m153808h(r1, r2, r4, r8, r7)     // Catch:{ all -> 0x015d }
                    if (r1 != 0) goto L_0x00d8
                    xn0.e<V> r0 = r14.f150296d     // Catch:{ all -> 0x015d }
                    com.tencent.mm.plugin.appbrand.jsapi.webview.h r0 = r0.f150279G1     // Catch:{ all -> 0x015d }
                    if (r0 == 0) goto L_0x00d4
                    com.tencent.mm.ui.widget.MMWebView r0 = r0.getWebView()     // Catch:{ all -> 0x015d }
                    java.lang.String r1 = "window.location=\"%s\""
                    java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x015d }
                    java.lang.String r3 = r14.f150297e     // Catch:{ all -> 0x015d }
                    java.lang.String r3 = com.tencent.p014mm.plugin.appbrand.utils.C84751i1.m104412a(r3)     // Catch:{ all -> 0x015d }
                    r2[r4] = r3     // Catch:{ all -> 0x015d }
                    java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r5)     // Catch:{ all -> 0x015d }
                    java.lang.String r1 = java.lang.String.format(r1, r2)     // Catch:{ all -> 0x015d }
                    java.lang.String r2 = "format(format, *args)"
                    gy3.C87412m.m108593f(r1, r2)     // Catch:{ all -> 0x015d }
                    r0.evaluateJavascript(r1, r7)     // Catch:{ all -> 0x015d }
                    goto L_0x0150
                L_0x00d4:
                    gy3.C87412m.m108603p(r6)     // Catch:{ all -> 0x015d }
                    throw r7     // Catch:{ all -> 0x015d }
                L_0x00d8:
                    if (r3 == 0) goto L_0x00e3
                    int r1 = r3.length()     // Catch:{ all -> 0x015d }
                    if (r1 != 0) goto L_0x00e1
                    goto L_0x00e3
                L_0x00e1:
                    r1 = 0
                    goto L_0x00e4
                L_0x00e3:
                    r1 = 1
                L_0x00e4:
                    if (r1 == 0) goto L_0x0145
                    xn0.e<V> r1 = r14.f150296d     // Catch:{ all -> 0x015d }
                    com.tencent.mm.plugin.appbrand.jsapi.webview.h r1 = r1.f150279G1     // Catch:{ all -> 0x015d }
                    if (r1 == 0) goto L_0x0141
                    com.tencent.mm.ui.widget.MMWebView r1 = r1.getWebView()     // Catch:{ all -> 0x015d }
                    r1.stopLoading()     // Catch:{ all -> 0x015d }
                    xn0.e<V> r1 = r14.f150296d     // Catch:{ all -> 0x015d }
                    java.lang.String r1 = r1.f150284L1     // Catch:{ all -> 0x015d }
                    if (r1 == 0) goto L_0x0101
                    int r1 = r1.length()     // Catch:{ all -> 0x015d }
                    if (r1 != 0) goto L_0x0100
                    goto L_0x0101
                L_0x0100:
                    r5 = 0
                L_0x0101:
                    if (r5 != 0) goto L_0x0139
                    xn0.e<V> r1 = r14.f150296d     // Catch:{ all -> 0x015d }
                    java.lang.String r1 = r1.mo74052A1()     // Catch:{ all -> 0x015d }
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x015d }
                    r2.<init>()     // Catch:{ all -> 0x015d }
                    r2.append(r0)     // Catch:{ all -> 0x015d }
                    java.lang.String r0 = r14.f150297e     // Catch:{ all -> 0x015d }
                    r2.append(r0)     // Catch:{ all -> 0x015d }
                    java.lang.String r0 = "), ignoredRedirectUrls.add("
                    r2.append(r0)     // Catch:{ all -> 0x015d }
                    xn0.e<V> r0 = r14.f150296d     // Catch:{ all -> 0x015d }
                    java.lang.String r0 = r0.f150284L1     // Catch:{ all -> 0x015d }
                    r2.append(r0)     // Catch:{ all -> 0x015d }
                    r0 = 41
                    r2.append(r0)     // Catch:{ all -> 0x015d }
                    java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x015d }
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)     // Catch:{ all -> 0x015d }
                    xn0.e<V>$c r0 = r14.f150298f     // Catch:{ all -> 0x015d }
                    java.util.Set<java.lang.String> r0 = r0.f150294a     // Catch:{ all -> 0x015d }
                    xn0.e<V> r1 = r14.f150296d     // Catch:{ all -> 0x015d }
                    java.lang.String r1 = r1.f150284L1     // Catch:{ all -> 0x015d }
                    r0.add(r1)     // Catch:{ all -> 0x015d }
                L_0x0139:
                    xn0.e<V> r0 = r14.f150296d     // Catch:{ all -> 0x015d }
                    java.lang.String r1 = r14.f150297e     // Catch:{ all -> 0x015d }
                    r0.mo67691Q0(r1)     // Catch:{ all -> 0x015d }
                    goto L_0x0150
                L_0x0141:
                    gy3.C87412m.m108603p(r6)     // Catch:{ all -> 0x015d }
                    throw r7     // Catch:{ all -> 0x015d }
                L_0x0145:
                    xn0.e<V> r1 = r14.f150296d     // Catch:{ all -> 0x015d }
                    java.lang.String r2 = r14.f150297e     // Catch:{ all -> 0x015d }
                    r3 = 0
                    r4 = 0
                    r5 = 6
                    r6 = 0
                    e00.C45520t.C45521a.m50512a(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x015d }
                L_0x0150:
                    xn0.e<V> r0 = r14.f150296d
                    java.lang.String r1 = r14.f150297e
                    r0.f150284L1 = r1
                    rx3.b0 r0 = rx3.C13598b0.f38549a
                    return r0
                L_0x0159:
                    gy3.C87412m.m108603p(r6)     // Catch:{ all -> 0x015d }
                    throw r7     // Catch:{ all -> 0x015d }
                L_0x015d:
                    r0 = move-exception
                    xn0.e<V> r1 = r14.f150296d
                    java.lang.String r2 = r14.f150297e
                    r1.f150284L1 = r2
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: xn0.C53413e.C53418c.C53419a.invoke():java.lang.Object");
            }
        }

        public C53418c() {
        }

        /* renamed from: a */
        public boolean mo74064a(int i, boolean z, String str, String str2) {
            C87412m.m108594g(str, "reqUrl");
            C87412m.m108594g(str2, "fullUrl");
            if (!this.f150294a.remove(str)) {
                return false;
            }
            String A1 = C53413e.this.mo74052A1();
            Log.m105924i(A1, "overrideUrlRedirect(reason:" + i + ", forceRedirect:" + z + ", reqUrl:" + str + ", fullUrl:" + str2 + ") INGORED");
            return true;
        }

        /* renamed from: b */
        public boolean mo74065b(String str, boolean z, int i) {
            C87412m.m108594g(str, "url");
            if (i != 0 || !this.f150294a.remove(str)) {
                return false;
            }
            String A1 = C53413e.this.mo74052A1();
            Log.m105924i(A1, "overrideGetA8Key(url:" + str + ", force:" + z + ", reason:" + i + ") IGNORED");
            return true;
        }

        /* renamed from: u */
        public void mo74066u(String str) {
            C87412m.m108594g(str, "url");
            C61926c.m72668M(new C53419a(C53413e.this, str, this));
        }
    }

    /* renamed from: xn0.e$f */
    public static final class C53420f<T> implements ValueCallback {

        /* renamed from: a */
        public final /* synthetic */ C53413e<V> f150299a;

        public C53420f(C53413e<V> eVar) {
            this.f150299a = eVar;
        }

        public void onReceiveValue(Object obj) {
            String A1 = this.f150299a.mo74052A1();
            Log.m105924i(A1, "evaluateJavascript " + ((String) obj));
        }
    }

    /* renamed from: xn0.e$g */
    public static final class C53421g extends C43505b0 {

        /* renamed from: c */
        public final C43558z f150300c;

        /* renamed from: d */
        public final /* synthetic */ C53413e<V> f150301d;

        /* renamed from: xn0.e$g$a */
        public static final class C53422a extends C43558z {

            /* renamed from: b */
            public final /* synthetic */ C53413e<V> f150302b;

            public C53422a(C53413e<V> eVar) {
                this.f150302b = eVar;
            }

            /* renamed from: m */
            public void mo67857m() {
                C40478h hVar = this.f150302b.f150279G1;
                C53442v vVar = null;
                if (hVar != null) {
                    if (hVar instanceof C53442v) {
                        vVar = (C53442v) hVar;
                    }
                    if (vVar != null) {
                        vVar.mo74079i();
                        return;
                    }
                    return;
                }
                C87412m.m108603p("mView");
                throw null;
            }

            /* renamed from: n */
            public void mo67858n() {
                C40478h hVar = this.f150302b.f150279G1;
                C53442v vVar = null;
                if (hVar != null) {
                    if (hVar instanceof C53442v) {
                        vVar = (C53442v) hVar;
                    }
                    if (vVar != null) {
                        vVar.mo74080l();
                        return;
                    }
                    return;
                }
                C87412m.m108603p("mView");
                throw null;
            }
        }

        public C53421g(C53413e<V> eVar) {
            this.f150301d = eVar;
            this.f150300c = new C53422a(eVar);
        }

        /* renamed from: d */
        public C43558z mo63687d() {
            return this.f150300c;
        }

        /* renamed from: f */
        public WebResourceResponse mo62378f(WebView webView, WebResourceRequest webResourceRequest) {
            C87412m.m108594g(webView, "webview");
            C87412m.m108594g(webResourceRequest, "request");
            C40478h hVar = this.f150301d.f150279G1;
            if (hVar != null) {
                if (hVar.mo63246k()) {
                    C53413e<V> eVar = this.f150301d;
                    C40478h hVar2 = eVar.f150279G1;
                    if (hVar2 != null) {
                        hVar2.mo63255y(eVar.getCurrentUrl(), webResourceRequest);
                    } else {
                        C87412m.m108603p("mView");
                        throw null;
                    }
                }
                C53413e<V> eVar2 = this.f150301d;
                Uri url = webResourceRequest.getUrl();
                C87412m.m108593f(url, "request.url");
                WebResourceResponse B1 = eVar2.mo74053B1(url);
                if (B1 != null) {
                    return B1;
                }
                return null;
            }
            C87412m.m108603p("mView");
            throw null;
        }

        /* renamed from: j */
        public boolean mo67780j(String str, boolean z, int i) {
            C87412m.m108594g(str, "url");
            return this.f150301d.f150285M1.mo74065b(str, z, i);
        }

        /* renamed from: s */
        public boolean mo63689s(int i, boolean z, String str, String str2) {
            C87412m.m108594g(str, "reqUrl");
            C87412m.m108594g(str2, "fullUrl");
            if (this.f150301d.f150285M1.mo74064a(i, z, str, str2)) {
                return true;
            }
            super.mo63689s(i, z, str, str2);
            return false;
        }
    }

    /* renamed from: xn0.e$i */
    public static final class C53423i extends C43558z {

        /* renamed from: b */
        public final /* synthetic */ C53413e<V> f150303b;

        public C53423i(C53413e<V> eVar) {
            this.f150303b = eVar;
        }

        /* renamed from: e */
        public void mo64862e() {
            try {
                C43791l m = this.f150303b.mo67731m();
                C53413e<V> eVar = this.f150303b;
                eVar.getClass();
                m.Np0(new C44307k0.C44336j(new WeakReference(eVar.f150286N1)), this.f150303b.mo67719g());
                C43791l m2 = this.f150303b.mo67731m();
                boolean z = true;
                Bundle bundle = new Bundle(1);
                Bundle bundle2 = new Bundle(1);
                bundle2.putString("key_webview_container_env", "miniProgram");
                bundle.putBundle("jsapiargs", bundle2);
                C13598b0 b0Var = C13598b0.f38549a;
                m2.mo68145pG(20, bundle, this.f150303b.mo67719g());
                C48590l g0 = this.f150303b.mo67720g0();
                C53413e<V> eVar2 = this.f150303b;
                eVar2.getClass();
                g0.f130008m = new C44307k0.C44336j(new WeakReference(eVar2.f150286N1));
                String str = this.f150303b.f150284L1;
                if (str != null) {
                    if (!C112551y.m153811k(str)) {
                        z = false;
                    }
                }
                if (!z) {
                    C53413e<V> eVar3 = this.f150303b;
                    String str2 = eVar3.f150284L1;
                    C87412m.m108591d(str2);
                    eVar3.mo67751u0(str2);
                }
            } catch (Exception e) {
                String A1 = this.f150303b.mo74052A1();
                Log.m105920e(A1, "onBinded exception:" + e);
            }
            C53413e<V> eVar4 = this.f150303b;
            C53391b bVar = eVar4.f150280H1;
            if (bVar != null) {
                bVar.f150230f = eVar4.mo67731m();
            } else {
                C87412m.m108603p("viewScanHelper");
                throw null;
            }
        }

        /* renamed from: k */
        public void mo67855k(int i, String str, C52018xt1 xt12) {
            C87412m.m108594g(str, "reqUrl");
            C87412m.m108594g(xt12, "response");
            C53413e<V> eVar = this.f150303b;
            eVar.f150283K1 = xt12.f144941d;
            C53391b bVar = eVar.f150280H1;
            if (bVar != null) {
                bVar.f150231g = eVar.f117539M;
            } else {
                C87412m.m108603p("viewScanHelper");
                throw null;
            }
        }
    }

    /* renamed from: xn0.e$j */
    public static final class C53424j extends C87413o implements C32224a<C45310h> {

        /* renamed from: d */
        public final /* synthetic */ C53413e<V> f150304d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53424j(C53413e<V> eVar) {
            super(0);
            this.f150304d = eVar;
        }

        public Object invoke() {
            return this.f150304d.f117539M;
        }
    }

    /* renamed from: xn0.e$k */
    public static final class C53425k extends C53437j0 {

        /* renamed from: h */
        public final /* synthetic */ C53413e<V> f150305h;

        /* renamed from: i */
        public final /* synthetic */ MMWebView f150306i;

        /* renamed from: xn0.e$k$a */
        public static final class C53426a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bundle f150307d;

            /* renamed from: e */
            public final /* synthetic */ C45310h f150308e;

            /* renamed from: f */
            public final /* synthetic */ C53413e<V> f150309f;

            /* renamed from: g */
            public final /* synthetic */ C48590l f150310g;

            public C53426a(Bundle bundle, C45310h hVar, C53413e<V> eVar, C48590l lVar) {
                this.f150307d = bundle;
                this.f150308e = hVar;
                this.f150309f = eVar;
                this.f150310g = lVar;
            }

            public final void run() {
                try {
                    Bundle bundle = this.f150307d;
                    boolean z = true;
                    if (bundle != null && bundle.containsKey("jsapi_preverify_fun_list")) {
                        C45310h hVar = this.f150308e;
                        if (hVar != null) {
                            hVar.mo70866i(this.f150307d);
                            this.f150310g.mo8700d();
                        }
                    }
                    String A1 = this.f150309f.mo74052A1();
                    Object[] objArr = new Object[1];
                    if (this.f150308e == null) {
                        z = false;
                    }
                    objArr[0] = Boolean.valueOf(z);
                    Log.m105921e(A1, "has JSAPI_CONTROL_BYTES wvPerm %b", objArr);
                    this.f150310g.mo8700d();
                } catch (Exception e) {
                    String A12 = this.f150309f.mo74052A1();
                    Log.m105920e(A12, "stubCallback.callback(AC_ON_UPDATE_JSAPI_CONTROL_BYTES), exception:" + e);
                }
            }
        }

        /* renamed from: xn0.e$k$b */
        public static final class C53427b implements g$$f {

            /* renamed from: a */
            public static final C53427b f150311a = new C53427b();

            /* renamed from: b */
            public final boolean mo1596b(int i, int i2, Intent intent) {
                return true;
            }
        }

        /* renamed from: xn0.e$k$c */
        public static final class C53428c implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C53413e<V> f150312d;

            /* renamed from: e */
            public final /* synthetic */ String f150313e;

            /* renamed from: f */
            public final /* synthetic */ String f150314f;

            /* renamed from: g */
            public final /* synthetic */ Bundle f150315g;

            /* renamed from: h */
            public final /* synthetic */ boolean f150316h;

            public C53428c(C53413e<V> eVar, String str, String str2, Bundle bundle, boolean z) {
                this.f150312d = eVar;
                this.f150313e = str;
                this.f150314f = str2;
                this.f150315g = bundle;
                this.f150316h = z;
            }

            public final void run() {
                try {
                    this.f150312d.mo67720g0().mo8702g(this.f150313e, this.f150314f, C13841a.m13131a(this.f150315g), this.f150316h);
                } catch (Exception e) {
                    String A1 = this.f150312d.mo74052A1();
                    Log.m105920e(A1, "stubCallback.onHandleEnd(), callbackId:" + this.f150313e + ", exception:" + e);
                }
            }
        }

        /* renamed from: xn0.e$k$d */
        public static final class C53429d implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C53413e<V> f150317d;

            /* renamed from: e */
            public final /* synthetic */ int f150318e;

            /* renamed from: f */
            public final /* synthetic */ String f150319f;

            public C53429d(C53413e<V> eVar, int i, String str) {
                this.f150317d = eVar;
                this.f150318e = i;
                this.f150319f = str;
            }

            public final void run() {
                try {
                    this.f150317d.mo67668C0(this.f150318e);
                } catch (Exception e) {
                    String A1 = this.f150317d.mo74052A1();
                    Log.m105920e(A1, "stubCallback.setFontSizeCb(" + this.f150319f + '(' + this.f150318e + ")), exception:" + e);
                }
            }
        }

        public C53425k(C53413e<V> eVar, MMWebView mMWebView) {
            this.f150305h = eVar;
            this.f150306i = mMWebView;
        }

        /* renamed from: B7 */
        public void mo7025B7(String str) {
            int i = Util.getInt(str, 0);
            ((C119157j) C119157j.f356862d).mo183895z(new C53429d(this.f150305h, i, str));
        }

        /* renamed from: US */
        public void mo7030US(String str, String str2, int i, int i2) {
            C53391b bVar = this.f150305h.f150280H1;
            if (bVar != null) {
                Class cls = C61416x.class;
                Log.m105918d("MicroMsg.AppBrand.HTMLViewScanHelper", "result: " + str2);
                C45591h hVar = bVar.f150239p;
                if (hVar != null && str != null && str.equals(hVar.f123310c)) {
                    if (!((C61416x) C86312j.m106911c(cls)).mo72001rH(i, str2, ((C45696d) C86709a0.m107533q(C45696d.class)).mo70989eQ(bVar.mo74035b()), bVar.f150228d.mo63246k())) {
                        ((C48419l0) C86312j.m106911c(C48419l0.class)).mo73107Ma(bVar.f150228d.getPageView(), false, i, str2, true, false, bVar.mo74035b());
                        bVar.f150235i = null;
                        return;
                    }
                    C45591h hVar2 = bVar.f150239p;
                    if (hVar2 != null) {
                        hVar2.mo71114b();
                    }
                    bVar.f150237n = i;
                    bVar.f150238o = i2;
                    if (str2 != null && bVar.f150234h != null) {
                        if (Util.isNullOrNil(str2)) {
                            Log.m105928w("MicroMsg.AppBrand.HTMLViewScanHelper", "processGetWXACodeNickName mResultOfImageUrl nil");
                        } else if (((C61416x) C86312j.m106911c(cls)).mo72002rO(bVar.f150237n, str2)) {
                            Log.m105924i("MicroMsg.AppBrand.HTMLViewScanHelper", "processGetWXACodeNickName");
                            C46900z zVar = bVar.f150240q;
                            int i3 = bVar.f150237n;
                            String b = bVar.mo74035b();
                            C46897s.C46898a aVar = new C46897s.C46898a(str2);
                            aVar.f126106b = 4;
                            aVar.f126107c = b;
                            ((ScanCodeSheetItemLogic) zVar).mo67078i(i3, aVar);
                        }
                        bVar.f150235i = str2;
                        C45082x0 x0Var = bVar.f150234h;
                        if (x0Var != null && x0Var.f122286e.mo107563h()) {
                            bVar.f150228d.runOnUiThread(new C53401c(bVar));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            C87412m.m108603p("viewScanHelper");
            throw null;
        }

        /* renamed from: V5 */
        public Bundle mo7031V5(int i, Bundle bundle) {
            String string;
            String string2;
            Bundle bundle2 = new Bundle();
            bundle2.putString("key_webview_container_env", "miniProgram");
            if (i == 18) {
                C40478h hVar = this.f150305h.f150279G1;
                if (hVar != null) {
                    Activity castActivityOrNull = AndroidContextUtil.castActivityOrNull(hVar.getAndroidContext());
                    if (castActivityOrNull == null) {
                        C53413e<V> eVar = this.f150305h;
                        String A1 = eVar.mo74052A1();
                        Object[] objArr = new Object[3];
                        objArr[0] = eVar.mo67707a0();
                        C40478h hVar2 = eVar.f150279G1;
                        if (hVar2 != null) {
                            objArr[1] = Integer.valueOf(hVar2.hashCode());
                            C40478h hVar3 = eVar.f150279G1;
                            if (hVar3 != null) {
                                objArr[2] = hVar3.getWebView().getUrl();
                                Log.m105921e(A1, "AC_GET_PUBLISHER_ID invalid context(%s) hash(%d) url(%s)", objArr);
                                return bundle2;
                            }
                            C87412m.m108603p("mView");
                            throw null;
                        }
                        C87412m.m108603p("mView");
                        throw null;
                    }
                    Intent intent = castActivityOrNull.getIntent();
                    bundle2.putString("KPublisherId", intent != null ? intent.getStringExtra("KPublisherId") : null);
                    String valueOf = String.valueOf(this.f150305h.mo67698U().f122692i);
                    if (valueOf == null) {
                        valueOf = "";
                    }
                    bundle2.putString("KPublisherReqId", valueOf);
                    bundle2.putString("serverMsgID", this.f150305h.mo67698U().f122704u.toString());
                    bundle2.putString("geta8key_username", this.f150305h.mo67698U().f122688e);
                    Intent intent2 = castActivityOrNull.getIntent();
                    bundle2.putString("sns_local_id", intent2 != null ? intent2.getStringExtra("sns_local_id") : null);
                    bundle2.putInt("getA8KeyScene", this.f150305h.f117555b.f123184f);
                    bundle2.putString("url", this.f150305h.getCurrentUrl());
                    C48419l0 l0Var = (C48419l0) C86312j.m106911c(C48419l0.class);
                    C40478h hVar4 = this.f150305h.f150279G1;
                    if (hVar4 != null) {
                        l0Var.Ai0(bundle2, hVar4.getPageView());
                    } else {
                        C87412m.m108603p("mView");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("mView");
                    throw null;
                }
            } else if (i == 87) {
                C53413e<V> eVar2 = this.f150305h;
                boolean z = eVar2.f117604z0;
                String str = eVar2.f150283K1;
                Map<String, String> map = eVar2.f117540N;
                if (z) {
                    bundle2.putString("result", "not_return");
                } else {
                    bundle2.putString("full_url", Util.nullAsNil(str));
                    if (map != null) {
                        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) map;
                        if (!concurrentHashMap.isEmpty()) {
                            bundle2.putInt("set_cookie", 1);
                            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                                CookieManager instance = CookieManager.getInstance();
                                String nullAsNil = Util.nullAsNil(str);
                                instance.setCookie(nullAsNil, ((String) entry.getKey()) + '=' + ((String) entry.getValue()));
                            }
                            CookieManager.getInstance().flush();
                            Log.m105925i(this.f150305h.mo74052A1(), "cookies:%s", CookieManager.getInstance().getCookie(Util.nullAsNil(str)));
                        }
                    }
                    bundle2.putInt("set_cookie", 0);
                }
            } else if (i != 101) {
                if (i == 145) {
                    C40478h hVar5 = this.f150305h.f150279G1;
                    if (hVar5 != null) {
                        bundle2.putStringArray("key_webview_apbrand_jsapi_report_args", hVar5.getJsApiReportArgs());
                    } else {
                        C87412m.m108603p("mView");
                        throw null;
                    }
                } else if (i == 302) {
                    C40478h hVar6 = this.f150305h.f150279G1;
                    if (hVar6 != null) {
                        Activity castActivityOrNull2 = AndroidContextUtil.castActivityOrNull(hVar6.getAndroidContext());
                        if (castActivityOrNull2 == null) {
                            C53413e<V> eVar3 = this.f150305h;
                            String A12 = eVar3.mo74052A1();
                            Object[] objArr2 = new Object[3];
                            objArr2[0] = eVar3.mo67707a0();
                            C40478h hVar7 = eVar3.f150279G1;
                            if (hVar7 != null) {
                                objArr2[1] = Integer.valueOf(hVar7.hashCode());
                                C40478h hVar8 = eVar3.f150279G1;
                                if (hVar8 != null) {
                                    objArr2[2] = hVar8.getWebView().getUrl();
                                    Log.m105921e(A12, "AC_GET_OPEN_WEAPP_ACTIVITY_IPC_DELEGATE invalid context(%s) hash(%d) url(%s)", objArr2);
                                    return bundle2;
                                }
                                C87412m.m108603p("mView");
                                throw null;
                            }
                            C87412m.m108603p("mView");
                            throw null;
                        }
                        bundle2.putParcelable("delegate", ActivityStarterIpcDelegate.m893a(castActivityOrNull2));
                        return bundle2;
                    }
                    C87412m.m108603p("mView");
                    throw null;
                } else if (i != 1020) {
                    if (i != 4008) {
                        if (i == 90001) {
                            String cookie = CookieManager.getInstance().getCookie(getCurrentUrl());
                            String A13 = this.f150305h.mo74052A1();
                            Log.m105924i(A13, "AC_GET_CURRENT_COOKIE, url:" + getCurrentUrl() + ", cookie:" + cookie);
                            bundle2.putString("cookie", cookie);
                            bundle2.putFloat(Constants.PARAM_DENSITY, this.f150306i.getMMDensity());
                            bundle2.putInt("topOffset", C61926c.m72689n(this.f150306i)[1]);
                            if (!(bundle == null || (string = bundle.getString("currentPicUrl")) == null)) {
                                bundle2.putString("currentUrlPath", C6085v.m5954e(string));
                            }
                            return bundle2;
                        } else if (i != 139) {
                            if (i != 140) {
                                switch (i) {
                                    case 4001:
                                    case 4002:
                                    case WearableStatusCodes.DATA_ITEM_TOO_LARGE /*4003*/:
                                    case WearableStatusCodes.INVALID_TARGET_NODE /*4004*/:
                                    case WearableStatusCodes.ASSET_UNAVAILABLE /*4005*/:
                                        break;
                                }
                            } else {
                                bundle2.putInt("key_webview_preverify_info_scene", 1);
                                C40478h hVar9 = this.f150305h.f150279G1;
                                if (hVar9 != null) {
                                    bundle2.putString("key_webview_preverify_info_source_appid", hVar9.getAppId());
                                    return bundle2;
                                }
                                C87412m.m108603p("mView");
                                throw null;
                            }
                        } else if (bundle == null || (string2 = bundle.getString("info")) == null) {
                            return bundle2;
                        } else {
                            try {
                                JSONObject jSONObject = new JSONObject(string2);
                                C40478h hVar10 = this.f150305h.f150279G1;
                                if (hVar10 != null) {
                                    hVar10.mo63248m0(jSONObject);
                                } else {
                                    C87412m.m108603p("mView");
                                    throw null;
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                    ApduEngineFuncEvent apduEngineFuncEvent = new ApduEngineFuncEvent();
                    apduEngineFuncEvent.f107356d.f107359b = this.f150305h.mo67707a0();
                    apduEngineFuncEvent.f107356d.f107358a = i;
                    if (4003 == i) {
                        C87412m.m108591d(bundle);
                        apduEngineFuncEvent.f107356d.f107360c = bundle.getString("apdu");
                    } else if (4004 == i) {
                        C87412m.m108591d(bundle);
                        String string3 = bundle.getString("apdus");
                        boolean z2 = bundle.getBoolean("breakIfFail", true);
                        boolean z3 = bundle.getBoolean("breakIfTrue", false);
                        ApduEngineFuncEvent.C40036a aVar = apduEngineFuncEvent.f107356d;
                        aVar.f107360c = string3;
                        aVar.f107361d = z2;
                        aVar.f107362e = z3;
                    }
                    NFCIPCHelper.m47582a(apduEngineFuncEvent);
                    Bundle bundle3 = apduEngineFuncEvent.f107357e.f107363a;
                    if (bundle3 != null) {
                        bundle2.putAll(bundle3);
                    }
                } else {
                    C45298c U = this.f150305h.mo67698U();
                    bundle2.putInt("key_get_a8key_req_params_req_id", U.f122692i);
                    bundle2.putString("key_get_a8key_req_params_msg_id", U.f122704u);
                    bundle2.putString("key_get_a8key_req_params_username", U.f122688e);
                    bundle2.putString("key_get_a8key_req_params_msg_username", U.f122703t);
                    return bundle2;
                }
            } else if (bundle == null) {
                return bundle2;
            } else {
                bundle.setClassLoader(C53413e.class.getClassLoader());
                C40478h hVar11 = this.f150305h.f150279G1;
                if (hVar11 != null) {
                    Context castActivityOrNull3 = AndroidContextUtil.castActivityOrNull(hVar11.getAndroidContext());
                    Intent intent3 = new Intent();
                    Bundle bundle4 = bundle.getBundle("open_ui_with_webview_ui_extras");
                    if (bundle4 == null) {
                        bundle4 = Bundle.EMPTY;
                    }
                    Intent putExtras = intent3.putExtras(bundle4);
                    C87412m.m108593f(putExtras, "Intent().putExtras(data.…         ?: Bundle.EMPTY)");
                    if (castActivityOrNull3 == null) {
                        castActivityOrNull3 = MMApplicationContext.getContext();
                        putExtras.addFlags(268435456);
                    }
                    String string4 = bundle.getString("open_ui_with_webview_ui_plugin_name");
                    C87412m.m108591d(string4);
                    String string5 = bundle.getString("open_ui_with_webview_ui_plugin_entry");
                    C87412m.m108591d(string5);
                    if (!C112551y.m153808h(string5, ".BaseScanUI", false, 2, (Object) null) || !(castActivityOrNull3 instanceof Activity)) {
                        C88144b.m109791i(castActivityOrNull3, string4, string5, putExtras, (Bundle) null);
                    } else {
                        C53427b bVar = C53427b.f150311a;
                        C89916g.m112446a(castActivityOrNull3).mo124232f(bVar);
                        C88144b.m109795m(castActivityOrNull3, string4, string5, putExtras, C87687a.m109085a(bVar));
                    }
                } else {
                    C87412m.m108603p("mView");
                    throw null;
                }
            }
            return bundle2;
        }

        public boolean Zu0(String str, String str2, Bundle bundle, boolean z) {
            ((C119157j) C119157j.f356862d).mo183895z(new C53428c(this.f150305h, str, str2, bundle, z));
            return false;
        }

        public boolean callback(int i, Bundle bundle) {
            boolean z;
            this.f150339e = this.f150305h.mo67720g0();
            this.f150340f = this.f150305h.f117539M;
            Log.m105924i("MicroMsg.MMDefaultWebViewStubCallback", "callback, actionCode = " + i);
            if (i != 90) {
                if (i == 2008) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(C66261f3.COL_LOCALID, bundle.getString(C66261f3.COL_LOCALID));
                    hashMap.put("err_msg", bundle.getString("recordResult"));
                    this.f150341g.post(new C53444x(this, hashMap));
                } else if (i == 2010) {
                    this.f150341g.post(new C53436i0(this, bundle.getString("webview_jssdk_file_item_local_id"), bundle.getInt("webview_jssdk_file_item_progreess")));
                } else if (i == 1002) {
                    this.f150341g.post(new C53390a0(this, bundle));
                } else if (i != 1003) {
                    switch (i) {
                        case 1006:
                            if (this.f150339e != null) {
                                this.f150341g.post(new C53445y(this, bundle));
                                break;
                            }
                            break;
                        case 1007:
                            long j = bundle.getLong("download_manager_downloadid");
                            int i2 = bundle.getInt("download_manager_progress");
                            float f = bundle.getFloat("download_manager_progress_float");
                            this.f150341g.post(new C53412d0(this, bundle.getString("download_manager_appid", ""), j, i2, f));
                            break;
                        case 1008:
                            this.f150341g.post(new C53404c0(this, bundle));
                            break;
                        default:
                            switch (i) {
                                case 2002:
                                    HashMap hashMap2 = new HashMap();
                                    hashMap2.put("err_msg", bundle.getString("playResult"));
                                    hashMap2.put(C66261f3.COL_LOCALID, bundle.getString(C66261f3.COL_LOCALID));
                                    this.f150341g.post(new C53443w(this, hashMap2));
                                    break;
                                case 2003:
                                    this.f150341g.post(new C53430e0(this, bundle.getString("webview_jssdk_file_item_local_id"), bundle.getInt("webview_jssdk_file_item_progreess")));
                                    break;
                                case 2004:
                                    this.f150341g.post(new C53432f0(this, bundle.getString("webview_jssdk_file_item_local_id"), bundle.getInt("webview_jssdk_file_item_progreess")));
                                    break;
                                case 2005:
                                    this.f150341g.post(new C53433g0(this, bundle.getString("webview_jssdk_file_item_local_id"), bundle.getInt("webview_jssdk_file_item_progreess")));
                                    break;
                                case 2006:
                                    this.f150341g.post(new C53434h0(this, bundle.getString("webview_jssdk_file_item_local_id"), bundle.getInt("webview_jssdk_file_item_progreess")));
                                    break;
                                default:
                                    z = false;
                                    break;
                            }
                    }
                } else {
                    this.f150341g.post(new C53400b0(this, bundle));
                }
            } else if (this.f150339e != null) {
                this.f150341g.post(new C53446z(this, bundle));
            }
            z = true;
            if (z) {
                return true;
            }
            try {
                C48590l lVar = this.f150339e;
                C87412m.m108593f(lVar, "this.mJsApi");
                C45310h hVar = this.f150340f;
                if (i == 1006) {
                    ((C119157j) C119157j.f356862d).mo183895z(new C53426a(bundle, hVar, this.f150305h, lVar));
                }
            } catch (Exception e) {
                String A1 = this.f150305h.mo74052A1();
                Log.m105920e(A1, "stubCallback.callback(), actionCode:" + i + ", exception:" + e);
            }
            return true;
        }

        /* renamed from: e3 */
        public String mo7037e3() {
            return this.f150305h.f117522C;
        }

        public String getCurrentUrl() {
            return this.f150305h.getCurrentUrl();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C53413e(com.tencent.p014mm.p136ui.widget.MMWebView r12, int r13) {
        /*
            r11 = this;
            java.lang.String r0 = "viewWV"
            gy3.C87412m.m108594g(r12, r0)
            e00.t$b r0 = new e00.t$b
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 127(0x7f, float:1.78E-43)
            r10 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0.f123184f = r13
            rx3.b0 r13 = rx3.C13598b0.f38549a
            r5 = 0
            xn0.g r6 = xn0.C15866g.f42715b
            r7 = 2
            r8 = 0
            r3 = 0
            r1 = r11
            r2 = r12
            r4 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            xn0.e$d r13 = new xn0.e$d
            r13.<init>(r11)
            rx3.g r13 = rx3.C36568h.m40985a(r13)
            r11.f150278F1 = r13
            xn0.e$e r13 = xn0.C53413e.C38773e.f104588d
            rx3.g r13 = rx3.C36568h.m40985a(r13)
            r11.f150282J1 = r13
            java.lang.Class<h81.h> r13 = h81.C32735h.class
            di3.d r13 = di3.C86312j.m106911c(r13)
            h81.h r13 = (h81.C32735h) r13
            h81.h$c r0 = h81.C32735h.C32737c.clicfg_android_appbrand_cover_webview_remove_clear_history_logic
            r1 = 1
            int r13 = r13.mo58779Qe(r0, r1)
            if (r13 != r1) goto L_0x0050
            xn0.e$b r13 = new xn0.e$b
            r13.<init>()
            goto L_0x0055
        L_0x0050:
            xn0.e$c r13 = new xn0.e$c
            r13.<init>()
        L_0x0055:
            r11.f150285M1 = r13
            xn0.e$k r13 = new xn0.e$k
            r13.<init>(r11, r12)
            r11.f150286N1 = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xn0.C53413e.<init>(com.tencent.mm.ui.widget.MMWebView, int):void");
    }

    /* renamed from: A1 */
    public final String mo74052A1() {
        return (String) this.f150278F1.getValue();
    }

    /* renamed from: B1 */
    public final WebResourceResponse mo74053B1(Uri uri) {
        byte[] bArr;
        C40478h hVar = this.f150279G1;
        if (hVar == null) {
            C87412m.m108603p("mView");
            throw null;
        } else if ((!hVar.mo63246k() && !BuildInfo.DEBUG) || !C87412m.m108589b(uri.getScheme(), "wagame")) {
            return null;
        } else {
            if (!C87412m.m108589b(uri.getPath(), "/getemoticon") && !C87412m.m108589b(uri.getPath(), "getemoticon")) {
                return null;
            }
            String queryParameter = uri.getQueryParameter("md5");
            String queryParameter2 = uri.getQueryParameter("encrypturl");
            String queryParameter3 = uri.getQueryParameter("aeskey");
            if (!(queryParameter == null || queryParameter.length() == 0) && this.f117539M.mo70860c().mo69447f(414) && (bArr = (byte[]) C53895h.m60468f((C66212f) null, new C38774h(queryParameter, queryParameter2, queryParameter3, (C15601d<? super C38774h>) null), 1, (Object) null)) != null) {
                return new WebResourceResponse("image/gif", "utf-8", new ByteArrayInputStream(bArr));
            }
            return null;
        }
    }

    /* renamed from: C */
    public void mo74054C(C40478h hVar) {
        C87412m.m108594g(hVar, "view");
        this.f150279G1 = hVar;
        this.f150280H1 = new C53391b(hVar);
        this.f117553a.f122357g = this.f117555b.f123184f;
        mo67741p(new C53423i(this));
        MMWebView mMWebView = this.f117553a;
        C53405d dVar = new C53405d(mMWebView, hVar, new C53424j(this));
        this.f150281I1 = dVar;
        mMWebView.setWebChromeClient(new MMWebView.C45105d(dVar));
        init();
    }

    /* renamed from: H0 */
    public void mo67676H0() {
        super.mo67676H0();
        C48590l g0 = mo67720g0();
        C40478h hVar = this.f150279G1;
        String str = null;
        if (hVar != null) {
            g0.f129981A = hVar.getAppId();
            C48590l g05 = mo67720g0();
            C40478h hVar2 = this.f150279G1;
            if (hVar2 != null) {
                C83780d1 pageView = hVar2.getPageView();
                if (pageView != null) {
                    str = pageView.mo116162Q0();
                }
                g05.f129982B = str;
                return;
            }
            C87412m.m108603p("mView");
            throw null;
        }
        C87412m.m108603p("mView");
        throw null;
    }

    /* renamed from: L */
    public boolean mo67682L(String str) {
        C87412m.m108594g(str, "url");
        if (str.length() == 0) {
            return true;
        }
        if (URLUtil.isAboutUrl(str)) {
            return false;
        }
        if (URLUtil.isFileUrl(str)) {
            return C87412m.m108589b("file:///android_asset/jsapi/wxjs.js", str);
        }
        Uri parse = Uri.parse(str);
        String host = parse.getHost();
        if (host == null || host.length() == 0) {
            return true;
        }
        String host2 = parse.getHost();
        if (host2 == null) {
            host2 = "";
        }
        String a = C89921j.m112462a();
        C87412m.m108593f(a, "getSelfIp()");
        return !C112550d0.m153801u(host2, a, false);
    }

    /* renamed from: P0 */
    public boolean mo67689P0(WebView webView, String str) {
        C87412m.m108594g(webView, "webView");
        C87412m.m108594g(str, "url");
        if (!C112551y.m153819s(str, "file:///android_asset", false)) {
            return super.mo67689P0(webView, str);
        }
        String A1 = mo74052A1();
        Log.m105928w(A1, "overrideUrl found " + str);
        return true;
    }

    /* renamed from: a */
    public void mo74055a(String str) {
        if (!(str == null || str.length() == 0)) {
            C40478h hVar = this.f150279G1;
            if (hVar != null) {
                MMWebView webView = hVar.getWebView();
                if (webView != null) {
                    webView.evaluateJavascript(str, new C53420f(this));
                    return;
                }
                return;
            }
            C87412m.m108603p("mView");
            throw null;
        }
    }

    /* renamed from: b */
    public void mo74056b() {
        mo67720g0().mo73227X(false);
    }

    /* renamed from: c */
    public void mo74057c() {
        mo67720g0().mo73227X(true);
    }

    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        C87412m.m108594g(webView, "view");
        C87412m.m108594g(str, "url");
        LinkedList linkedList = new LinkedList();
        boolean z2 = false;
        if (URLUtil.isAboutUrl(str)) {
            linkedList.add(new IDKey(1097, 2, 1));
            linkedList.add(new IDKey(1097, 6, 1));
        } else if (C112551y.m153819s(str, "file:///android_asset/", false)) {
            linkedList.add(new IDKey(1097, 4, 1));
            linkedList.add(new IDKey(1097, 6, 1));
        } else if (!URLUtil.isNetworkUrl(str)) {
            linkedList.add(new IDKey(1097, 6, 1));
        }
        if (URLUtil.isAboutUrl(webView.getUrl())) {
            linkedList.add(new IDKey(1097, 1, 1));
            linkedList.add(new IDKey(1097, 5, 1));
        } else {
            String url = webView.getUrl();
            if (url != null && C112551y.m153819s(url, "file:///android_asset/", false)) {
                linkedList.add(new IDKey(1097, 3, 1));
                linkedList.add(new IDKey(1097, 5, 1));
            } else if (!URLUtil.isNetworkUrl(webView.getUrl())) {
                linkedList.add(new IDKey(1097, 5, 1));
            }
        }
        if (!linkedList.isEmpty()) {
            C115669n.INSTANCE.mo160124a(new ArrayList(linkedList), false);
        }
        if (!URLUtil.isAboutUrl(webView.getUrl())) {
            String url2 = webView.getUrl();
            if (url2 != null && C112551y.m153819s(url2, "file:///android_asset/", false)) {
                z2 = true;
            }
            if (!z2) {
                super.doUpdateVisitedHistory(webView, str, z);
                return;
            }
        }
        String A1 = mo74052A1();
        Log.m105920e(A1, "WebView-Trace doUpdateVisitedHistory, url = " + str + ", wvUrl = " + webView.getUrl() + ", isReload = " + z + ". invalid view.url");
    }

    /* renamed from: f */
    public void mo74058f(Context context) {
        C87412m.m108594g(context, "context");
        C53391b bVar = this.f150280H1;
        if (bVar != null) {
            ((ScanCodeSheetItemLogic) bVar.f150240q).f116146d = context;
            C45082x0 x0Var = bVar.f150234h;
            if (x0Var != null) {
                try {
                    x0Var.mo70435a();
                } catch (Exception unused) {
                } catch (Throwable th) {
                    bVar.f150234h = null;
                    throw th;
                }
                bVar.f150234h = null;
            }
            if (context instanceof Activity) {
                C45082x0 x0Var2 = new C45082x0(bVar.mo74033a());
                bVar.f150234h = x0Var2;
                x0Var2.mo70438d(bVar.f150228d.getWebView(), bVar, (C11184p0) null);
                return;
            }
            return;
        }
        C87412m.m108603p("viewScanHelper");
        throw null;
    }

    public int getBinderID() {
        return mo67719g();
    }

    /* renamed from: m1 */
    public boolean mo67815m1(String str) {
        boolean z = false;
        if (str != null && C12969d.m12408b(str, "weixin://dl/", true)) {
            z = true;
        }
        if (!z || !((Boolean) ((C36570n) this.f150282J1).getValue()).booleanValue()) {
            return super.mo67815m1(str);
        }
        return true;
    }

    public void onPageCommitVisible(WebView webView, String str) {
        super.onPageCommitVisible(webView, str);
        C40478h hVar = this.f150279G1;
        if (hVar != null) {
            hVar.mo63245i1(str);
        } else {
            C87412m.m108603p("mView");
            throw null;
        }
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        C40478h hVar = this.f150279G1;
        if (hVar != null) {
            hVar.mo63249o1(str);
        } else {
            C87412m.m108603p("mView");
            throw null;
        }
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        C87412m.m108594g(webView, "view");
        C87412m.m108594g(str, "url");
        super.onPageStarted(webView, str, bitmap);
        C40478h hVar = this.f150279G1;
        if (hVar != null) {
            hVar.mo63228E(str);
        } else {
            C87412m.m108603p("mView");
            throw null;
        }
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        C40478h hVar = this.f150279G1;
        if (hVar != null) {
            hVar.mo63230a1(str2, i, str);
        } else {
            C87412m.m108603p("mView");
            throw null;
        }
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            Uri parse = Uri.parse(str);
            C87412m.m108593f(parse, "parse(url)");
            return mo74053B1(parse);
        } catch (Exception e) {
            String A1 = mo74052A1();
            Log.m105920e(A1, "shouldInterceptRequest called as legacy method, try intercept gif but get exception:" + e);
            return null;
        }
    }

    /* renamed from: t */
    public void mo74060t() {
        onDestroy();
        C53405d dVar = this.f150281I1;
        if (dVar == null) {
            return;
        }
        if (dVar != null) {
            while (!dVar.f119947d.isEmpty()) {
                dVar.f119947d.pollFirst().cancel();
            }
            dVar.mo74047c();
            return;
        }
        C87412m.m108603p("webChromeClient");
        throw null;
    }

    /* renamed from: t0 */
    public void mo63684t0() {
        mo67679J(new C53421g(this));
        super.mo63684t0();
    }

    /* renamed from: u */
    public void mo74061u(String str) {
        if (!(str == null || str.length() == 0)) {
            this.f150285M1.mo74066u(str);
        }
    }

    /* renamed from: v */
    public void mo74062v(String str) {
    }

    /* renamed from: w */
    public void mo74063w(boolean z, int i) {
        C48590l g0 = mo67720g0();
        if (!z) {
            i = 0;
        }
        g0.mo73215L(i, 0);
    }
}
