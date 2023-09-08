package com.tencent.p014mm.plugin.webview.core;

import a70.C112760b;
import android.app.Dialog;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Looper;
import android.util.SparseBooleanArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.appbrand.luggage.customize.C40490e;
import com.tencent.p014mm.plugin.appbrand.page.C40525w2;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.core.C43505b0;
import com.tencent.p014mm.plugin.webview.p128ui.tools.C44035i2;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI$$e0;
import com.tencent.p014mm.plugin.webview.stub.C43791l;
import com.tencent.p014mm.plugin.webview.webcompt.C44404a;
import com.tencent.p014mm.plugin.webview.webcompt.C44454s;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C44625c2;
import com.tencent.p014mm.protocal.GeneralControlWrapper;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.CookieManager;
import com.tencent.xweb.HttpAuthHandler;
import com.tencent.xweb.RenderProcessGoneDetail;
import com.tencent.xweb.SslErrorHandler;
import com.tencent.xweb.WebResourceError;
import com.tencent.xweb.WebResourceRequest;
import com.tencent.xweb.WebResourceResponse;
import com.tencent.xweb.WebSettings;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebViewClient;
import d93.C45297a;
import d93.C45298c;
import d93.C45303g;
import d93.C45310h;
import d93.c$$d;
import di3.C86312j;
import e00.C31365g0;
import e00.C45520t;
import e00.C7580y;
import e93.C45562a;
import ea3.C45596j;
import ea3.C45604u;
import ea3.C45605v;
import f40.C86709a0;
import f93.C45764a;
import f93.C45766c;
import f93.C45767f;
import fy3.C32224a;
import fy3.C32226l;
import g93.C32355a;
import go3.C45939e0;
import gy3.C24560g0;
import gy3.C24565l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import i93.C33250d;
import i93.C46206e;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentSkipListSet;
import js0.C46574u;
import ke3.C88144b;
import kotlin.Metadata;
import ny3.C25235d;
import o00.C47315c;
import o40.C61926c;
import org.json.JSONObject;
import org.xwalk.core.XWalkEnvironment;
import p206nj.C11171e;
import p224ra.C89909e;
import p225rc.C12969d;
import p248ug.C52572q0;
import p564iq.C87790d;
import p817kd.C46689b;
import p817kd.C88140c;
import p830xc.C91167d;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import s93.C48302a;
import sf0.C90188n0;
import sx3.C110818d0;
import sx3.C110826x0;
import sx3.C64175a0;
import sx3.C64197v;
import sx3.C90364q0;
import t83.C13851h1;
import t83.C13853i;
import t83.C13860l1;
import t83.C48583f1;
import t83.C48590l;
import t83.C48601q;
import te3.C48763au1;
import te3.C48857bh2;
import te3.C52018xt1;
import te3.C52304zt1;
import u83.C52477a;
import v83.C52805a;
import v83.C52806b;
import z04.C112550d0;
import z04.C112551y;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController */
public abstract class BaseWebViewController extends WebViewClient implements C45297a<C52018xt1>, C45520t {

    /* renamed from: J0 */
    public static final C5839c f117516J0 = new C5839c((C8480h) null);

    /* renamed from: K0 */
    public static final String[] f117517K0 = {"https://statres.quickapp.cn/quickapp/js/routerinline.min.js", "http://fastappjump-drcn.hispace.hicloud.com/", "http://thefatherofsalmon.com/", "http://v2.thefatherofsalmon.com/"};

    /* renamed from: A */
    public String f117518A = "";

    /* renamed from: A0 */
    public C5854i f117519A0;

    /* renamed from: B */
    public String f117520B = "";

    /* renamed from: B0 */
    public final C13601g f117521B0;

    /* renamed from: C */
    public String f117522C = "";

    /* renamed from: C0 */
    public final C13601g f117523C0;

    /* renamed from: D */
    public String f117524D = "";

    /* renamed from: D0 */
    public boolean f117525D0;

    /* renamed from: E */
    public String f117526E = "";

    /* renamed from: E0 */
    public C88140c f117527E0;

    /* renamed from: F */
    public boolean f117528F;

    /* renamed from: F0 */
    public C43516l f117529F0;

    /* renamed from: G */
    public boolean f117530G;

    /* renamed from: G0 */
    public boolean f117531G0;

    /* renamed from: H */
    public boolean f117532H;

    /* renamed from: H0 */
    public final C13601g f117533H0;

    /* renamed from: I */
    public final C13601g f117534I = C36568h.m40985a(new C43501x(this));

    /* renamed from: I0 */
    public final C13601g f117535I0;

    /* renamed from: J */
    public final C13601g f117536J = C36568h.m40985a(new C43502y(this));

    /* renamed from: K */
    public final C13601g f117537K = C36568h.m40985a(new C30574r(this));

    /* renamed from: L */
    public final C13601g f117538L = C36568h.m40985a(C30576w.f82352d);

    /* renamed from: M */
    public final C45310h f117539M = new C45310h(new C43490j0(this));

    /* renamed from: N */
    public final Map<String, String> f117540N = new ConcurrentHashMap();

    /* renamed from: O */
    public final C13601g f117541O = C36568h.m40985a(new C30571f0(this));

    /* renamed from: P */
    public final C43508c0 f117542P = new C43485g0(this);

    /* renamed from: Q */
    public final C45604u f117543Q = new C45604u();

    /* renamed from: R */
    public final C13601g f117544R = C36568h.m40985a(new C43481d0(this));

    /* renamed from: S */
    public final ConcurrentLinkedDeque<C43505b0> f117545S = new ConcurrentLinkedDeque<>();

    /* renamed from: T */
    public final ConcurrentLinkedDeque<C43519u> f117546T = new ConcurrentLinkedDeque<>();

    /* renamed from: U */
    public final ConcurrentLinkedDeque<C43558z> f117547U = new ConcurrentLinkedDeque<>();

    /* renamed from: V */
    public final ConcurrentHashMap<Integer, ConcurrentLinkedDeque<C32224a<C13598b0>>> f117548V = new ConcurrentHashMap<>();

    /* renamed from: W */
    public boolean f117549W;

    /* renamed from: X */
    public C43515k f117550X = new C43515k();

    /* renamed from: Y */
    public final View.OnTouchListener f117551Y = new C43488i0(this);

    /* renamed from: Z */
    public final C13601g f117552Z = C36568h.m40985a(new C43499u(this));

    /* renamed from: a */
    public final MMWebView f117553a;

    /* renamed from: a0 */
    public final int f117554a0 = -1;

    /* renamed from: b */
    public final C45520t.C45522b f117555b;

    /* renamed from: b0 */
    public final int f117556b0 = -2;

    /* renamed from: c */
    public Set<String> f117557c;

    /* renamed from: c0 */
    public final int f117558c0 = -3;

    /* renamed from: d */
    public C13853i f117559d;

    /* renamed from: d0 */
    public final int f117560d0 = -10;

    /* renamed from: e */
    public final C13601g f117561e = C36568h.m40985a(new C30567a(this));

    /* renamed from: e0 */
    public final int f117562e0 = -5;

    /* renamed from: f */
    public C45766c f117563f = new C45766c();

    /* renamed from: f0 */
    public final int f117564f0;

    /* renamed from: g */
    public final C46206e.C46209c f117565g = new C46206e.C46209c();

    /* renamed from: g0 */
    public final int f117566g0;

    /* renamed from: h */
    public HashMap<String, SparseBooleanArray> f117567h;

    /* renamed from: h0 */
    public final int f117568h0;

    /* renamed from: i */
    public C45605v f117569i;

    /* renamed from: i0 */
    public final int f117570i0;

    /* renamed from: j */
    public final C13601g f117571j = C36568h.m40985a(new C30573q(this));

    /* renamed from: j0 */
    public final int f117572j0;

    /* renamed from: k */
    public final C52806b f117573k = new C52806b();

    /* renamed from: k0 */
    public final int f117574k0;

    /* renamed from: l */
    public boolean f117575l;

    /* renamed from: l0 */
    public final int f117576l0;

    /* renamed from: m */
    public String f117577m;

    /* renamed from: m0 */
    public final int f117578m0;

    /* renamed from: n */
    public Dialog f117579n;

    /* renamed from: n0 */
    public final int f117580n0;

    /* renamed from: o */
    public String f117581o;

    /* renamed from: o0 */
    public final int f117582o0;

    /* renamed from: p */
    public int f117583p;

    /* renamed from: p0 */
    public final Set<Integer> f117584p0;

    /* renamed from: q */
    public long f117585q;

    /* renamed from: q0 */
    public final Set<Integer> f117586q0;

    /* renamed from: r */
    public boolean f117587r;

    /* renamed from: r0 */
    public final boolean f117588r0;

    /* renamed from: s */
    public boolean f117589s;

    /* renamed from: s0 */
    public final List<C30570e> f117590s0;

    /* renamed from: t */
    public boolean f117591t;

    /* renamed from: t0 */
    public final ConcurrentLinkedDeque<C13604l<ControllerAction, C32224a<C13598b0>>> f117592t0;

    /* renamed from: u */
    public final C13601g f117593u = C36568h.m40985a(new C43482e0(this));

    /* renamed from: u0 */
    public final ConcurrentLinkedDeque<C13604l<PageAction, C32224a<C13598b0>>> f117594u0;

    /* renamed from: v */
    public C46206e.C46207a f117595v = C46206e.C46207a.None;

    /* renamed from: v0 */
    public final ConcurrentSkipListSet<Integer> f117596v0;

    /* renamed from: w */
    public String f117597w;

    /* renamed from: w0 */
    public final ConcurrentSkipListSet<Integer> f117598w0;

    /* renamed from: x */
    public final C13601g f117599x = C36568h.m40985a(C43483f.f117612d);

    /* renamed from: x0 */
    public final ConcurrentSkipListSet<String> f117600x0;

    /* renamed from: y */
    public C43791l f117601y;

    /* renamed from: y0 */
    public final ConcurrentSkipListSet<String> f117602y0;

    /* renamed from: z */
    public Intent f117603z;

    /* renamed from: z0 */
    public final boolean f117604z0;

    /* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController$c */
    public static final class C5839c {
        public C5839c(C8480h hVar) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
            r8 = r8.toString();
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String mo6892a(android.content.Intent r8) {
            /*
                r7 = this;
                java.lang.String r0 = ""
                java.lang.String r1 = "intent"
                gy3.C87412m.m108594g(r8, r1)
                r1 = 0
                r2 = 1
                java.lang.String r3 = "rawUrl"
                java.lang.String r3 = r8.getStringExtra(r3)     // Catch:{ Exception -> 0x0013 }
                if (r3 != 0) goto L_0x0028
                r3 = r0
                goto L_0x0028
            L_0x0013:
                r3 = move-exception
                java.lang.Object[] r4 = new java.lang.Object[r2]
                java.lang.String r5 = r3.getMessage()
                r4[r1] = r5
                java.lang.String r5 = "MicroMsg.WebViewController"
                java.lang.String r6 = "getRawUrl exception:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r6, r4)
                boolean r4 = r3 instanceof java.lang.ClassNotFoundException
                if (r4 != 0) goto L_0x0044
                r3 = 0
            L_0x0028:
                if (r3 == 0) goto L_0x0030
                boolean r4 = z04.C112551y.m153811k(r3)
                if (r4 == 0) goto L_0x0031
            L_0x0030:
                r1 = 1
            L_0x0031:
                if (r1 != 0) goto L_0x0035
                r0 = r3
                goto L_0x0043
            L_0x0035:
                android.net.Uri r8 = r8.getData()
                if (r8 == 0) goto L_0x0043
                java.lang.String r8 = r8.toString()
                if (r8 != 0) goto L_0x0042
                goto L_0x0043
            L_0x0042:
                r0 = r8
            L_0x0043:
                return r0
            L_0x0044:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.core.BaseWebViewController.C5839c.mo6892a(android.content.Intent):java.lang.String");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController$a */
    public static final class C30567a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ BaseWebViewController f82342d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30567a(BaseWebViewController baseWebViewController) {
            super(0);
            this.f82342d = baseWebViewController;
        }

        public Object invoke() {
            return "MicroMsg.BaseWebViewController:" + this.f82342d.mo67719g();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController$b0 */
    public static final class C30568b0 extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C30568b0 f82343d = new C30568b0();

        public C30568b0() {
            super(0);
        }

        public Object invoke() {
            boolean z = false;
            if ((((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_open_webview_quickapp_interceptor, 0) & 2) != 0) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController$c0 */
    public static final class C30569c0 extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C30569c0 f82344d = new C30569c0();

        public C30569c0() {
            super(0);
        }

        public Object invoke() {
            boolean z = false;
            if ((((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_open_webview_quickapp_interceptor, 0) & 1) != 0) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController$e */
    public static final class C30570e {

        /* renamed from: a */
        public final WebAction f82345a;

        /* renamed from: b */
        public final C32224a<C13598b0> f82346b;

        public C30570e(WebAction webAction, C32224a<C13598b0> aVar) {
            C87412m.m108594g(webAction, "action");
            C87412m.m108594g(aVar, "block");
            this.f82345a = webAction;
            this.f82346b = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C30570e)) {
                return false;
            }
            C30570e eVar = (C30570e) obj;
            return C87412m.m108589b(this.f82345a, eVar.f82345a) && C87412m.m108589b(this.f82346b, eVar.f82346b);
        }

        public int hashCode() {
            return (this.f82345a.hashCode() * 31) + this.f82346b.hashCode();
        }

        public String toString() {
            return "WebEvent(action=" + this.f82345a + ", block=" + this.f82346b + ')';
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController$f0 */
    public static final class C30571f0 extends C87413o implements C32224a<Runnable> {

        /* renamed from: d */
        public final /* synthetic */ BaseWebViewController f82347d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30571f0(BaseWebViewController baseWebViewController) {
            super(0);
            this.f82347d = baseWebViewController;
        }

        public Object invoke() {
            return new C30578d(this.f82347d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController$h0 */
    public static final class C30572h0 extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C30572h0 f82348d = new C30572h0();

        public C30572h0() {
            super(0);
        }

        public Object invoke() {
            return Boolean.valueOf(C44625c2.m49078k());
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController$q */
    public static final class C30573q extends C87413o implements C32224a<C45303g<C52018xt1>> {

        /* renamed from: d */
        public final /* synthetic */ BaseWebViewController f82349d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30573q(BaseWebViewController baseWebViewController) {
            super(0);
            this.f82349d = baseWebViewController;
        }

        public Object invoke() {
            BaseWebViewController baseWebViewController = this.f82349d;
            C87412m.m108592e(baseWebViewController, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.permission.AuthCallback<com.tencent.mm.protocal.protobuf.GetA8KeyResp>");
            return new C45303g(new WeakReference(baseWebViewController));
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController$r */
    public static final class C30574r extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ BaseWebViewController f82350d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30574r(BaseWebViewController baseWebViewController) {
            super(0);
            this.f82350d = baseWebViewController;
        }

        public Object invoke() {
            return Integer.valueOf(this.f82350d.hashCode());
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController$w */
    public static final class C30576w extends C87413o implements C32224a<MMHandler> {

        /* renamed from: d */
        public static final C30576w f82352d = new C30576w();

        public C30576w() {
            super(0);
        }

        public Object invoke() {
            return new MMHandler(Looper.getMainLooper());
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController$z */
    public static final class C30577z extends C87413o implements C32224a<C33250d> {

        /* renamed from: d */
        public static final C30577z f82353d = new C30577z();

        public C30577z() {
            super(0);
        }

        public Object invoke() {
            return new C33250d();
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/core/BaseWebViewController$Auth;", "Lcom/tencent/mm/plugin/webview/core/BaseWebViewController$PageAction;", "()V", "verify", "", "url", "", "webview-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController$Auth */
    public static final class Auth extends PageAction {
        public boolean verify(String str) {
            C87412m.m108594g(str, "url");
            BaseWebViewController controller = getController();
            return waitFor(C24560g0.m30725a(Inject.class), str) && waitFor(controller.f117556b0) && (controller.f117555b.f123183e || controller.f117539M.mo70862e(str) || waitFor(controller.f117564f0, str));
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/core/BaseWebViewController$Bind;", "Lcom/tencent/mm/plugin/webview/core/BaseWebViewController$ControllerAction;", "()V", "verify", "", "webview-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController$Bind */
    public static final class Bind extends ControllerAction {
        public boolean verify() {
            BaseWebViewController controller = getController();
            return waitFor(controller.f117558c0) && waitFor(controller.f117556b0);
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b%\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/core/BaseWebViewController$ControllerAction;", "Lcom/tencent/mm/plugin/webview/core/BaseWebViewController$WebAction;", "()V", "verify", "", "webview-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController$ControllerAction */
    public static abstract class ControllerAction extends WebAction {
        public abstract boolean verify();
    }

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/core/BaseWebViewController$Init;", "Lcom/tencent/mm/plugin/webview/core/BaseWebViewController$ControllerAction;", "()V", "verify", "", "webview-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController$Init */
    public static final class Init extends ControllerAction {
        public boolean verify() {
            return waitFor(getController().f117554a0);
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/core/BaseWebViewController$Inject;", "Lcom/tencent/mm/plugin/webview/core/BaseWebViewController$PageAction;", "()V", "verify", "", "url", "", "webview-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController$Inject */
    public static final class Inject extends PageAction {
        public boolean verify(String str) {
            C87412m.m108594g(str, "url");
            BaseWebViewController controller = getController();
            return ((controller.f117553a.f122355e || waitFor(controller.f117576l0, str) || waitFor(C24560g0.m30725a(PageLoadEndForCommitNotSupport.class), str)) && waitFor(controller.f117556b0) && (controller.f117555b.f123183e || controller.f117539M.mo70862e(str) || waitFor(controller.f117564f0, str))) || controller.mo63680g1();
        }
    }

    @Metadata(mo182093d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b%\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\n"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/core/BaseWebViewController$PageAction;", "Lcom/tencent/mm/plugin/webview/core/BaseWebViewController$WebAction;", "()V", "verify", "", "url", "", "waitFor", "status", "", "webview-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController$PageAction */
    public static abstract class PageAction extends WebAction {
        public abstract boolean verify(String str);

        public final boolean waitFor(int i, String str) {
            C87412m.m108594g(str, "url");
            return (C87412m.m108589b(str, getController().f117520B) || getController().f117586q0.contains(Integer.valueOf(i))) && getController().f117596v0.contains(Integer.valueOf(i));
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/core/BaseWebViewController$PageLoadEndForCommitNotSupport;", "Lcom/tencent/mm/plugin/webview/core/BaseWebViewController$PageAction;", "()V", "verify", "", "url", "", "webview-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController$PageLoadEndForCommitNotSupport */
    public static final class PageLoadEndForCommitNotSupport extends PageAction {
        public boolean verify(String str) {
            C87412m.m108594g(str, "url");
            BaseWebViewController controller = getController();
            return waitFor((C25235d<? extends ControllerAction>) C24560g0.m30725a(Start.class)) && waitFor(controller.f117578m0, str) && waitFor(controller.f117582o0, str);
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/core/BaseWebViewController$ProgressBarEnd;", "Lcom/tencent/mm/plugin/webview/core/BaseWebViewController$PageAction;", "()V", "verify", "", "url", "", "webview-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController$ProgressBarEnd */
    public static final class ProgressBarEnd extends PageAction {
        public boolean verify(String str) {
            C87412m.m108594g(str, "url");
            BaseWebViewController controller = getController();
            return controller.mo63677Z() && (controller.mo63681h1() || waitFor(C24560g0.m30725a(Ready.class), str) || waitFor(controller.f117578m0, str) || waitFor(controller.f117576l0, str) || waitFor(controller.f117566g0, str));
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/core/BaseWebViewController$ProgressBarStart;", "Lcom/tencent/mm/plugin/webview/core/BaseWebViewController$PageAction;", "()V", "verify", "", "url", "", "webview-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController$ProgressBarStart */
    public static final class ProgressBarStart extends PageAction {
        public boolean verify(String str) {
            C87412m.m108594g(str, "url");
            BaseWebViewController controller = getController();
            return waitFor((C25235d<? extends ControllerAction>) C24560g0.m30725a(Start.class)) && ((!controller.mo67748s0(controller.f117562e0) && (waitFor(controller.f117570i0, str) || waitFor(controller.f117568h0, str))) || (!waitFor(C24560g0.m30725a(ProgressBarEnd.class), str) && controller.mo67748s0(controller.f117562e0) && waitFor(controller.f117572j0, str)));
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/core/BaseWebViewController$Ready;", "Lcom/tencent/mm/plugin/webview/core/BaseWebViewController$PageAction;", "()V", "verify", "", "url", "", "webview-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController$Ready */
    public static final class Ready extends PageAction {
        public boolean verify(String str) {
            C87412m.m108594g(str, "url");
            BaseWebViewController controller = getController();
            return (waitFor((C25235d<? extends ControllerAction>) C24560g0.m30725a(Start.class)) && waitFor(C24560g0.m30725a(Auth.class), str) && (waitFor(controller.f117578m0, str) || controller.f117553a.f122355e)) || controller.mo63681h1();
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/core/BaseWebViewController$SPAUpdated;", "Lcom/tencent/mm/plugin/webview/core/BaseWebViewController$PageAction;", "()V", "keep", "", "getKeep", "()Z", "verify", "url", "", "webview-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController$SPAUpdated */
    public static final class SPAUpdated extends PageAction {
        private final boolean keep = true;

        public boolean getKeep() {
            return this.keep;
        }

        public boolean verify(String str) {
            C87412m.m108594g(str, "url");
            return waitFor(C24560g0.m30725a(Ready.class), str) && waitFor(getController().f117580n0, str);
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/core/BaseWebViewController$Start;", "Lcom/tencent/mm/plugin/webview/core/BaseWebViewController$ControllerAction;", "()V", "verify", "", "webview-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController$Start */
    public static final class Start extends ControllerAction {
        public boolean verify() {
            BaseWebViewController controller = getController();
            if (!waitFor(controller.f117558c0)) {
                return false;
            }
            if (controller.mo63665D0() && !waitFor(controller.f117556b0)) {
                return false;
            }
            if (!(controller.mo63683n0().length() > 0)) {
                String str = (String) ((C36570n) controller.f117552Z).getValue();
                return !(str == null || C112551y.m153811k(str));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController$a0 */
    public static final class C43478a0 implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ BaseWebViewController f117605d;

        /* renamed from: e */
        public final /* synthetic */ int f117606e;

        /* renamed from: f */
        public final /* synthetic */ String f117607f;

        public C43478a0(BaseWebViewController baseWebViewController, int i, String str) {
            this.f117605d = baseWebViewController;
            this.f117606e = i;
            this.f117607f = str;
        }

        public final void run() {
            ConcurrentLinkedDeque<C43558z> concurrentLinkedDeque = this.f117605d.f117547U;
            int i = this.f117606e;
            String str = this.f117607f;
            for (C43558z c : concurrentLinkedDeque) {
                c.mo67849c(i, str);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController$b */
    public static final class C43479b implements C43514j {

        /* renamed from: a */
        public final WeakReference<BaseWebViewController> f117608a;

        public C43479b(WeakReference<BaseWebViewController> weakReference) {
            C87412m.m108594g(weakReference, "weakController");
            this.f117608a = weakReference;
        }

        /* renamed from: c */
        public boolean mo10771c() {
            BaseWebViewController baseWebViewController = this.f117608a.get();
            return baseWebViewController != null && baseWebViewController.mo67684M0();
        }

        /* renamed from: d */
        public void mo10772d(C5854i iVar) {
            C87412m.m108594g(iVar, "conn");
            BaseWebViewController baseWebViewController = this.f117608a.get();
            if (baseWebViewController != null) {
                if (baseWebViewController.mo67757y0()) {
                    Log.m105924i(baseWebViewController.mo67703X(), "WebView-Trace onConnected when destroyCalled");
                    return;
                }
                C45767f.f123649a.mo71242b(C45764a.OnConnect, baseWebViewController.f117563f);
                baseWebViewController.f117519A0 = iVar;
                C43791l m = iVar.mo6903m();
                C87412m.m108594g(m, "<set-?>");
                baseWebViewController.f117601y = m;
                baseWebViewController.mo67720g0().f130007l = baseWebViewController.mo67731m();
                baseWebViewController.mo67683L0(baseWebViewController.mo67731m());
                String X = baseWebViewController.mo67703X();
                Log.m105924i(X, "WebView-Trace tryBindService#" + baseWebViewController.mo67719g() + " checkStatus CONTROLLER_INVOKER_READY");
                C45605v vVar = baseWebViewController.f117569i;
                if (vVar != null) {
                    vVar.f123366i = System.currentTimeMillis();
                }
                if (baseWebViewController.f117602y0.contains(C24560g0.m30725a(Bind.class).mo51264h())) {
                    baseWebViewController.mo67672F0();
                } else {
                    baseWebViewController.mo67685N(baseWebViewController.f117556b0);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController$d */
    public final class C43480d extends C45939e0 {
        public C43480d() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:0x00b4  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00b9 A[SYNTHETIC, Splitter:B:32:0x00b9] */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x017b  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x019b  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x01a0  */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x01a3  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo67768a(com.tencent.xweb.WebView r17, int r18) {
            /*
                r16 = this;
                r1 = r16
                r0 = 100
                r2 = r18
                if (r2 < r0) goto L_0x01ac
                com.tencent.mm.plugin.webview.core.BaseWebViewController r0 = com.tencent.p014mm.plugin.webview.core.BaseWebViewController.this
                boolean r0 = r0.mo67757y0()
                if (r0 != 0) goto L_0x01ac
                com.tencent.mm.plugin.webview.core.BaseWebViewController r0 = com.tencent.p014mm.plugin.webview.core.BaseWebViewController.this
                r0.getClass()
                com.tencent.mm.plugin.webview.core.BaseWebViewController r0 = com.tencent.p014mm.plugin.webview.core.BaseWebViewController.this
                java.lang.String r0 = r0.mo67703X()
                java.lang.String r2 = "Abe-Debug Progress 100"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
                com.tencent.mm.plugin.webview.core.BaseWebViewController r0 = com.tencent.p014mm.plugin.webview.core.BaseWebViewController.this
                com.tencent.mm.ui.widget.MMWebView r2 = r0.f117553a
                java.lang.Class<h81.h> r3 = h81.C32735h.class
                java.lang.String r0 = "webView"
                gy3.C87412m.m108594g(r2, r0)
                r0 = 2006(0x7d6, float:2.811E-42)
                boolean r0 = r2.supportFeature(r0)
                r4 = 1
                r5 = 0
                if (r0 != 0) goto L_0x0038
                goto L_0x0178
            L_0x0038:
                di3.d r0 = di3.C86312j.m106911c(r3)
                h81.h r0 = (h81.C32735h) r0
                h81.h$c r6 = h81.C32735h.C32737c.clicfg_webview_page_commit_only_kernel_86
                int r0 = r0.mo58779Qe(r6, r5)
                if (r0 != r4) goto L_0x0048
                r0 = 1
                goto L_0x0049
            L_0x0048:
                r0 = 0
            L_0x0049:
                java.lang.String r6 = "MicroMsg.WebViewKernelUtil"
                if (r0 == 0) goto L_0x0141
                boolean r0 = r2.isSysKernel()
                if (r0 == 0) goto L_0x0141
                int r0 = ea3.C45599o.f123319a
                if (r0 <= 0) goto L_0x0059
                goto L_0x0137
            L_0x0059:
                android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.pm.PackageManager r0 = r0.getPackageManager()
                java.lang.String r7 = "com.google.android.webview"
                android.content.pm.PackageInfo r0 = r0.getPackageInfo(r7, r5)
                java.lang.String r7 = "."
                java.lang.String r8 = "this as java.lang.String).toLowerCase()"
                if (r0 == 0) goto L_0x00b1
                java.lang.String r0 = r0.versionName     // Catch:{ all -> 0x0098 }
                if (r0 == 0) goto L_0x00b1
                java.lang.String r9 = r0.toLowerCase()     // Catch:{ all -> 0x0098 }
                gy3.C87412m.m108593f(r9, r8)     // Catch:{ all -> 0x0098 }
                java.lang.String[] r10 = new java.lang.String[]{r7}     // Catch:{ all -> 0x0098 }
                r11 = 0
                r12 = 0
                r13 = 6
                r14 = 0
                java.util.List r0 = z04.C112550d0.m153785U(r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0098 }
                java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x0098 }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0098 }
                if (r0 == 0) goto L_0x00b1
                java.lang.Integer r0 = z04.C66731x.m78731e(r0)     // Catch:{ all -> 0x0098 }
                if (r0 == 0) goto L_0x00b1
                int r0 = r0.intValue()     // Catch:{ all -> 0x0098 }
                r9 = r0
                goto L_0x00b2
            L_0x0098:
                r0 = move-exception
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "Get KernelVersion From PKG Error:"
                r9.append(r10)
                java.lang.String r0 = r0.getMessage()
                r9.append(r0)
                java.lang.String r0 = r9.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            L_0x00b1:
                r9 = 0
            L_0x00b2:
                if (r9 <= 0) goto L_0x00b9
                ea3.C45599o.f123319a = r9
                r0 = r9
                goto L_0x0137
            L_0x00b9:
                com.tencent.xweb.WebSettings r0 = r2.getSettings()     // Catch:{ all -> 0x011b }
                if (r0 == 0) goto L_0x0119
                java.lang.String r0 = r0.getUserAgentString()     // Catch:{ all -> 0x011b }
                if (r0 == 0) goto L_0x0119
                java.lang.String r10 = r0.toLowerCase()     // Catch:{ all -> 0x011b }
                gy3.C87412m.m108593f(r10, r8)     // Catch:{ all -> 0x011b }
                java.lang.String r0 = "chrome/"
                java.lang.String[] r11 = new java.lang.String[]{r0}     // Catch:{ all -> 0x011b }
                r12 = 0
                r13 = 0
                r14 = 6
                r15 = 0
                java.util.List r0 = z04.C112550d0.m153785U(r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x011b }
                java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x011b }
                r10 = r0
                java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x011b }
                if (r10 == 0) goto L_0x0119
                java.lang.String r0 = " "
                java.lang.String[] r11 = new java.lang.String[]{r0}     // Catch:{ all -> 0x011b }
                r12 = 0
                r13 = 0
                r14 = 6
                r15 = 0
                java.util.List r0 = z04.C112550d0.m153785U(r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x011b }
                java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x011b }
                r10 = r0
                java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x011b }
                if (r10 == 0) goto L_0x0119
                java.lang.String[] r11 = new java.lang.String[]{r7}     // Catch:{ all -> 0x011b }
                r12 = 0
                r13 = 0
                r14 = 6
                r15 = 0
                java.util.List r0 = z04.C112550d0.m153785U(r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x011b }
                java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x011b }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x011b }
                if (r0 == 0) goto L_0x0119
                java.lang.Integer r0 = z04.C66731x.m78731e(r0)     // Catch:{ all -> 0x011b }
                if (r0 == 0) goto L_0x0119
                int r0 = r0.intValue()     // Catch:{ all -> 0x011b }
                goto L_0x0135
            L_0x0119:
                r0 = 0
                goto L_0x0135
            L_0x011b:
                r0 = move-exception
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "Get KernelVersion From UA Error:"
                r7.append(r8)
                java.lang.String r0 = r0.getMessage()
                r7.append(r0)
                java.lang.String r0 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
                r0 = r9
            L_0x0135:
                ea3.C45599o.f123319a = r0
            L_0x0137:
                r7 = 86
                if (r0 > r7) goto L_0x0141
                java.lang.String r0 = "WebView-Trace, inject time enable SysKernel86"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
                goto L_0x0178
            L_0x0141:
                di3.d r0 = di3.C86312j.m106911c(r3)
                h81.h r0 = (h81.C32735h) r0
                h81.h$c r7 = h81.C32735h.C32737c.clicfg_webview_page_commit_only_kernel_system
                int r0 = r0.mo58779Qe(r7, r4)
                if (r0 != r4) goto L_0x0151
                r0 = 1
                goto L_0x0152
            L_0x0151:
                r0 = 0
            L_0x0152:
                boolean r2 = r2.isSysKernel()
                if (r2 == 0) goto L_0x0160
                if (r0 == 0) goto L_0x0160
                java.lang.String r0 = "WebView-Trace, inject time enable SysKernel"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
                goto L_0x0178
            L_0x0160:
                di3.d r0 = di3.C86312j.m106911c(r3)
                h81.h r0 = (h81.C32735h) r0
                h81.h$c r2 = h81.C32735h.C32737c.clicfg_webview_page_commit_only_kernel_all
                int r0 = r0.mo58779Qe(r2, r5)
                if (r0 != r4) goto L_0x0170
                r0 = 1
                goto L_0x0171
            L_0x0170:
                r0 = 0
            L_0x0171:
                if (r0 == 0) goto L_0x0179
                java.lang.String r0 = "WebView-Trace, inject time enable AllKernel"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            L_0x0178:
                r4 = 0
            L_0x0179:
                if (r4 == 0) goto L_0x018a
                com.tencent.mm.plugin.webview.core.v$b r0 = com.tencent.p014mm.plugin.webview.core.C43520v.f117665a
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.plugin.webview.core.C5857x.m5577a()
                java.lang.String r2 = "webview_page_commit_mock"
                boolean r0 = r0.getBoolean(r2, r5)
                if (r0 == 0) goto L_0x01ac
            L_0x018a:
                com.tencent.mm.plugin.webview.core.BaseWebViewController r0 = com.tencent.p014mm.plugin.webview.core.BaseWebViewController.this
                java.lang.String r0 = r0.mo67703X()
                java.lang.String r2 = "WebView-Trace not support onPageCommitVisible"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
                com.tencent.mm.plugin.webview.core.BaseWebViewController r0 = com.tencent.p014mm.plugin.webview.core.BaseWebViewController.this
                int r2 = r0.f117582o0
                if (r17 == 0) goto L_0x01a0
                java.lang.String r3 = r17.getUrl()
                goto L_0x01a1
            L_0x01a0:
                r3 = 0
            L_0x01a1:
                if (r3 != 0) goto L_0x01a5
                java.lang.String r3 = ""
            L_0x01a5:
                java.lang.String r3 = r0.mo67705Y(r3)
                r0.mo67686O(r2, r3)
            L_0x01ac:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.core.BaseWebViewController.C43480d.mo67768a(com.tencent.xweb.WebView, int):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController$d0 */
    public static final class C43481d0 extends C87413o implements C32224a<C30579m> {

        /* renamed from: d */
        public final /* synthetic */ BaseWebViewController f117610d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43481d0(BaseWebViewController baseWebViewController) {
            super(0);
            this.f117610d = baseWebViewController;
        }

        public Object invoke() {
            long j;
            try {
                j = this.f117610d.mo67731m().mo68094Fu() ? (long) this.f117610d.mo67731m().mo68107RT() : 0;
            } catch (Throwable th) {
                String X = this.f117610d.mo67703X();
                Log.m105920e(X, "Get Uin Error:" + th.getLocalizedMessage());
                j = -1;
            }
            return new C30579m(j);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController$e0 */
    public static final class C43482e0 extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ BaseWebViewController f117611d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43482e0(BaseWebViewController baseWebViewController) {
            super(0);
            this.f117611d = baseWebViewController;
        }

        public Object invoke() {
            String stringExtra = this.f117611d.mo67715e0().getStringExtra("KWebPrefetcherId");
            return stringExtra == null ? "" : stringExtra;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController$f */
    public static final class C43483f extends C87413o implements C32224a<C45298c> {

        /* renamed from: d */
        public static final C43483f f117612d = new C43483f();

        public C43483f() {
            super(0);
        }

        public Object invoke() {
            return new C45298c();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController$g */
    public static final class C43484g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ BaseWebViewController f117613d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43484g(BaseWebViewController baseWebViewController) {
            super(0);
            this.f117613d = baseWebViewController;
        }

        public Object invoke() {
            Iterator<C43558z> it = this.f117613d.f117547U.iterator();
            while (it.hasNext()) {
                it.next().mo67857m();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController$g0 */
    public static final class C43485g0 extends C43508c0 {

        /* renamed from: a */
        public final /* synthetic */ BaseWebViewController f117614a;

        public C43485g0(BaseWebViewController baseWebViewController) {
            this.f117614a = baseWebViewController;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController$h */
    public /* synthetic */ class C43486h extends C24565l implements C32224a<C13598b0> {
        public C43486h(Object obj) {
            super(0, obj, BaseWebViewController.class, "initEnviroment", "initEnviroment()V", 0);
        }

        public Object invoke() {
            ((BaseWebViewController) this.receiver).mo63684t0();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController$i */
    public static final class C43487i extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ BaseWebViewController f117615d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43487i(BaseWebViewController baseWebViewController) {
            super(0);
            this.f117615d = baseWebViewController;
        }

        public Object invoke() {
            String str;
            LinkedList<C13851h1> linkedList;
            BaseWebViewController baseWebViewController = this.f117615d;
            if (baseWebViewController.f117596v0.contains(Integer.valueOf(baseWebViewController.f117576l0))) {
                Log.m105924i(this.f117615d.mo67703X(), "WebView-Trace PageLoadFull has commit status return");
            } else {
                String str2 = this.f117615d.f117520B;
                if (!(str2 == null || C112551y.m153811k(str2))) {
                    str = this.f117615d.f117520B;
                } else {
                    str = this.f117615d.f117553a.getUrl();
                    if (str == null) {
                        str = "";
                    }
                }
                this.f117615d.mo67697T0(str);
                C48590l g0 = this.f117615d.mo67720g0();
                if (!(g0 == null || (linkedList = g0.f130000e) == null)) {
                    linkedList.clear();
                }
                this.f117615d.mo67709b1(str);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController$i0 */
    public static final class C43488i0 implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ BaseWebViewController f117616d;

        public C43488i0(BaseWebViewController baseWebViewController) {
            this.f117616d = baseWebViewController;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/core/BaseWebViewController$webPageOnTouchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if (motionEvent != null && motionEvent.getAction() == 0) {
                this.f117616d.f117550X.f117653b = System.currentTimeMillis();
                Point point = this.f117616d.f117550X.f117652a;
                point.x = (int) motionEvent.getX();
                point.y = (int) motionEvent.getY();
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/webview/core/BaseWebViewController$webPageOnTouchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController$j */
    public static final class C43489j extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ BaseWebViewController f117617d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43489j(BaseWebViewController baseWebViewController) {
            super(0);
            this.f117617d = baseWebViewController;
        }

        public Object invoke() {
            String X = this.f117617d.mo67703X();
            Log.m105924i(X, "WebView-Trace inject#" + this.f117617d.mo67719g());
            this.f117617d.mo67717f0().mo73198c();
            this.f117617d.mo67720g0().mo73245m();
            if (BuildInfo.DEBUG) {
                BaseWebViewController baseWebViewController = this.f117617d;
                baseWebViewController.mo67690Q("console.log('inject:'+" + this.f117617d.mo67719g() + ')', (C32226l<? super String, C13598b0>) null);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController$j0 */
    public static final class C43490j0 implements C45310h.C45313c {

        /* renamed from: a */
        public final /* synthetic */ BaseWebViewController f117618a;

        public C43490j0(BaseWebViewController baseWebViewController) {
            this.f117618a = baseWebViewController;
        }

        /* renamed from: a */
        public String mo67770a() {
            return this.f117618a.f117522C;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
            if ((r0.length() > 0) == true) goto L_0x0017;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String mo67771b() {
            /*
                r3 = this;
                com.tencent.mm.plugin.webview.core.BaseWebViewController r0 = r3.f117618a
                java.lang.String r0 = r0.getCurrentUrl()
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x0016
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x0012
                r0 = 1
                goto L_0x0013
            L_0x0012:
                r0 = 0
            L_0x0013:
                if (r0 != r1) goto L_0x0016
                goto L_0x0017
            L_0x0016:
                r1 = 0
            L_0x0017:
                com.tencent.mm.plugin.webview.core.BaseWebViewController r0 = r3.f117618a
                if (r1 == 0) goto L_0x0020
                java.lang.String r0 = r0.getCurrentUrl()
                goto L_0x0034
            L_0x0020:
                com.tencent.mm.ui.widget.MMWebView r0 = r0.f117553a
                java.lang.String r0 = r0.getUrl()
                if (r0 != 0) goto L_0x0034
                com.tencent.mm.plugin.webview.core.BaseWebViewController$c r0 = com.tencent.p014mm.plugin.webview.core.BaseWebViewController.f117516J0
                com.tencent.mm.plugin.webview.core.BaseWebViewController r1 = r3.f117618a
                android.content.Intent r1 = r1.mo67715e0()
                java.lang.String r0 = r0.mo6892a(r1)
            L_0x0034:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.core.BaseWebViewController.C43490j0.mo67771b():java.lang.String");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController$k */
    public /* synthetic */ class C43491k extends C24565l implements C32224a<C13598b0> {
        public C43491k(Object obj) {
            super(0, obj, BaseWebViewController.class, "onBinded", "onBinded()V", 0);
        }

        public Object invoke() {
            ((BaseWebViewController) this.receiver).mo67672F0();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController$l */
    public static final class C43492l extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ BaseWebViewController f117619d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43492l(BaseWebViewController baseWebViewController) {
            super(0);
            this.f117619d = baseWebViewController;
        }

        public Object invoke() {
            this.f117619d.mo67717f0().mo73197a(this.f117619d.f117526E);
            Iterator<C43558z> it = this.f117619d.f117547U.iterator();
            while (it.hasNext()) {
                it.next().mo67850d();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController$m */
    public static final class C43493m extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ BaseWebViewController f117620d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43493m(BaseWebViewController baseWebViewController) {
            super(0);
            this.f117620d = baseWebViewController;
        }

        public Object invoke() {
            BaseWebViewController baseWebViewController = this.f117620d;
            if (!baseWebViewController.f117553a.f122355e) {
                baseWebViewController.mo67717f0().mo73199e();
            }
            this.f117620d.mo67676H0();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController$n */
    public static final class C43494n extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ BaseWebViewController f117621d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43494n(BaseWebViewController baseWebViewController) {
            super(0);
            this.f117621d = baseWebViewController;
        }

        public Object invoke() {
            BaseWebViewController baseWebViewController = this.f117621d;
            MMWebView mMWebView = baseWebViewController.f117553a;
            if (mMWebView.f122355e) {
                String url = mMWebView.getUrl();
                if (url == null) {
                    url = "";
                }
                baseWebViewController.mo67702W0(url);
            }
            if (!this.f117621d.mo67757y0()) {
                this.f117621d.mo67699U0();
                this.f117621d.mo63674N0();
                this.f117621d.mo67704X0();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController$o */
    public static final class C43495o extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ BaseWebViewController f117622d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43495o(BaseWebViewController baseWebViewController) {
            super(0);
            this.f117622d = baseWebViewController;
        }

        public Object invoke() {
            this.f117622d.mo67717f0().mo73199e();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController$p */
    public static final class C43496p extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ BaseWebViewController f117623d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43496p(BaseWebViewController baseWebViewController) {
            super(0);
            this.f117623d = baseWebViewController;
        }

        public Object invoke() {
            Iterator<C43558z> it = this.f117623d.f117547U.iterator();
            while (it.hasNext()) {
                it.next().mo67858n();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController$s */
    public static final class C43497s implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f117624d;

        /* renamed from: e */
        public final /* synthetic */ BaseWebViewController f117625e;

        /* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController$s$a */
        public static final class C30575a extends C87413o implements C32226l<C32224a<? extends C13598b0>, Boolean> {

            /* renamed from: d */
            public static final C30575a f82351d = new C30575a();

            public C30575a() {
                super(1);
            }

            public Object invoke(Object obj) {
                ((C32224a) obj).invoke();
                return Boolean.TRUE;
            }
        }

        public C43497s(int i, BaseWebViewController baseWebViewController) {
            this.f117624d = i;
            this.f117625e = baseWebViewController;
        }

        public final void run() {
            String X = this.f117625e.mo67703X();
            Log.m105924i(X, "checkStatus:" + this.f117624d + " to [" + C110818d0.m150921S(this.f117625e.f117598w0, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null) + "] [" + C110818d0.m150921S(this.f117625e.f117596v0, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null) + "] [" + C110818d0.m150921S(this.f117625e.f117600x0, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null) + ']');
            this.f117625e.f117598w0.add(Integer.valueOf(this.f117624d));
            BaseWebViewController baseWebViewController = this.f117625e;
            baseWebViewController.mo67718f1(baseWebViewController.f117592t0, baseWebViewController.f117602y0, (String) null);
            String str = this.f117625e.f117520B;
            if (!(str == null || C112551y.m153811k(str))) {
                BaseWebViewController baseWebViewController2 = this.f117625e;
                baseWebViewController2.mo67718f1(baseWebViewController2.f117594u0, baseWebViewController2.f117600x0, baseWebViewController2.f117520B);
            }
            C64175a0.m75511s(this.f117625e.mo67735o0(this.f117624d), C30575a.f82351d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController$t */
    public static final class C43498t implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f117626d;

        /* renamed from: e */
        public final /* synthetic */ BaseWebViewController f117627e;

        /* renamed from: f */
        public final /* synthetic */ String f117628f;

        public C43498t(int i, BaseWebViewController baseWebViewController, String str) {
            this.f117626d = i;
            this.f117627e = baseWebViewController;
            this.f117628f = str;
        }

        public final void run() {
            String str;
            if (this.f117627e.mo67680K(this.f117626d, this.f117628f)) {
                Log.m105924i(this.f117627e.mo67703X(), "checkStatus:" + this.f117626d + ' ' + this.f117628f + " to [" + C110818d0.m150921S(this.f117627e.f117598w0, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null) + "] [" + C110818d0.m150921S(this.f117627e.f117596v0, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null) + "] [" + C110818d0.m150921S(this.f117627e.f117600x0, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null) + ']');
                this.f117627e.f117596v0.add(Integer.valueOf(this.f117626d));
                BaseWebViewController baseWebViewController = this.f117627e;
                baseWebViewController.mo67718f1(baseWebViewController.f117594u0, baseWebViewController.f117600x0, baseWebViewController.f117520B);
                return;
            }
            String X = this.f117627e.mo67703X();
            StringBuilder sb = new StringBuilder();
            sb.append("checkStatus skip: ");
            sb.append(this.f117626d);
            sb.append(", url=");
            sb.append(this.f117628f);
            sb.append(", startUrl=");
            sb.append(this.f117627e.f117520B);
            sb.append(' ');
            if (this.f117627e.f117584p0.contains(Integer.valueOf(this.f117626d))) {
                str = ", spaUrl=" + this.f117627e.f117524D;
            } else {
                str = "";
            }
            sb.append(str);
            Log.m105928w(X, sb.toString());
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController$u */
    public static final class C43499u extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ BaseWebViewController f117629d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43499u(BaseWebViewController baseWebViewController) {
            super(0);
            this.f117629d = baseWebViewController;
        }

        public Object invoke() {
            return this.f117629d.mo67715e0().getStringExtra("data");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController$v */
    public static final class C43500v extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ BaseWebViewController f117630d;

        /* renamed from: e */
        public final /* synthetic */ String f117631e;

        /* renamed from: f */
        public final /* synthetic */ C32226l<String, C13598b0> f117632f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43500v(BaseWebViewController baseWebViewController, String str, C32226l<? super String, C13598b0> lVar) {
            super(0);
            this.f117630d = baseWebViewController;
            this.f117631e = str;
            this.f117632f = lVar;
        }

        public Object invoke() {
            MMWebView mMWebView = this.f117630d.f117553a;
            String str = this.f117631e;
            C32226l<String, C13598b0> lVar = this.f117632f;
            mMWebView.evaluateJavascript(str, lVar != null ? new C5840b(lVar) : null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController$x */
    public static final class C43501x extends C87413o implements C32224a<C48583f1> {

        /* renamed from: d */
        public final /* synthetic */ BaseWebViewController f117633d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43501x(BaseWebViewController baseWebViewController) {
            super(0);
            this.f117633d = baseWebViewController;
        }

        public Object invoke() {
            BaseWebViewController baseWebViewController = this.f117633d;
            return new C48583f1(baseWebViewController.f117553a, baseWebViewController.mo67720g0(), (C48583f1.C48584a) null, this.f117633d.f117553a.f122355e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController$y */
    public static final class C43502y extends C87413o implements C32224a<C48590l> {

        /* renamed from: d */
        public final /* synthetic */ BaseWebViewController f117634d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43502y(BaseWebViewController baseWebViewController) {
            super(0);
            this.f117634d = baseWebViewController;
        }

        public Object invoke() {
            C48590l lVar;
            BaseWebViewController baseWebViewController = this.f117634d;
            if (baseWebViewController.f117557c == null) {
                lVar = new C48590l(baseWebViewController.f117553a, baseWebViewController.f117539M, baseWebViewController.mo67719g(), this.f117634d.f117559d);
            } else {
                MMWebView mMWebView = baseWebViewController.f117553a;
                C45310h hVar = baseWebViewController.f117539M;
                int g = baseWebViewController.mo67719g();
                Set<String> set = this.f117634d.f117557c;
                lVar = new C48590l();
                lVar.f129996a = mMWebView;
                lVar.f130010o = hVar;
                lVar.f130014s = g;
                if (set == null) {
                    set = new HashSet<>();
                }
                lVar.f130016u = set;
                lVar.f130017v = true;
                lVar.f130001f = new C48601q(lVar, Looper.getMainLooper());
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(mMWebView == null ? 0 : mMWebView.hashCode());
                objArr[1] = Integer.valueOf(lVar.hashCode());
                Log.m105925i("MicroMsg.JsApiHandler", "Abe-Debug JsApiHandler<init>, webview: %d, this: %d, limitedJsApiListModeEnable = true", objArr);
            }
            BaseWebViewController baseWebViewController2 = this.f117634d;
            C47315c cVar = (C47315c) C86312j.m106911c(C47315c.class);
            C52477a U20 = cVar != null ? cVar.U20() : null;
            if (U20 != null && !((ArrayList) lVar.f130019x).contains(U20)) {
                ((ArrayList) lVar.f130019x).add(U20);
            }
            baseWebViewController2.f117553a.addJavascriptInterface(lVar, "__wx");
            if (lVar.mo73268z() != null) {
                baseWebViewController2.f117553a.addJavascriptInterface(lVar.mo73268z(), "__wxtag");
            }
            MMWebView mMWebView2 = baseWebViewController2.f117553a;
            if (lVar.f129985E == null) {
                lVar.f129985E = new C13860l1();
            }
            C13860l1 l1Var = lVar.f129985E;
            l1Var.getClass();
            l1Var.f39015a = lVar;
            mMWebView2.addJavascriptInterface(lVar.f129985E, "WXTransInterface");
            MMWebView mMWebView3 = baseWebViewController2.f117553a;
            if (lVar.f129984D == null) {
                lVar.f129984D = new C52805a();
            }
            C52805a aVar = lVar.f129984D;
            aVar.f147521a = lVar.f129996a;
            mMWebView3.addJavascriptInterface(aVar, "CustomFullscreenApi");
            baseWebViewController2.f117553a.addJavascriptInterface(baseWebViewController2.f117573k, "__wxWebEnv");
            baseWebViewController2.f117553a.setRandomStr(lVar.f130012q);
            return lVar;
        }
    }

    public BaseWebViewController(MMWebView mMWebView, C45520t.C45522b bVar, Set<String> set, C13853i iVar) {
        C87412m.m108594g(mMWebView, "viewWV");
        C87412m.m108594g(bVar, "options");
        this.f117553a = mMWebView;
        this.f117555b = bVar;
        this.f117557c = set;
        this.f117559d = iVar;
        boolean z = true;
        this.f117564f0 = 1;
        this.f117566g0 = 2;
        this.f117568h0 = 3;
        this.f117570i0 = 4;
        this.f117572j0 = 6;
        this.f117574k0 = 7;
        this.f117576l0 = 10;
        this.f117578m0 = 11;
        this.f117580n0 = 12;
        this.f117582o0 = 13;
        this.f117584p0 = C110826x0.m151017e(11, 12, 10, 13);
        this.f117586q0 = C110826x0.m151017e(3, 4, 6);
        this.f117588r0 = true;
        this.f117590s0 = C64197v.m75539h(new C30570e(new Init(), new C43486h(this)), new C30570e(new PageLoadEndForCommitNotSupport(), new C43487i(this)), new C30570e(new Inject(), new C43489j(this)), new C30570e(new Bind(), new C43491k(this)), new C30570e(new Auth(), new C43492l(this)), new C30570e(new Ready(), new C43493m(this)), new C30570e(new Start(), new C43494n(this)), new C30570e(new SPAUpdated(), new C43495o(this)), new C30570e(new ProgressBarStart(), new C43496p(this)), new C30570e(new ProgressBarEnd(), new C43484g(this)));
        this.f117592t0 = new ConcurrentLinkedDeque<>();
        this.f117594u0 = new ConcurrentLinkedDeque<>();
        this.f117596v0 = new ConcurrentSkipListSet<>();
        this.f117598w0 = new ConcurrentSkipListSet<>();
        this.f117600x0 = new ConcurrentSkipListSet<>();
        this.f117602y0 = new ConcurrentSkipListSet<>();
        this.f117604z0 = mo67698U().f122684a.size() <= 0 ? false : z;
        this.f117521B0 = C36568h.m40985a(C30572h0.f82348d);
        this.f117523C0 = C36568h.m40985a(C30577z.f82353d);
        this.f117533H0 = C36568h.m40985a(C30569c0.f82344d);
        this.f117535I0 = C36568h.m40985a(C30568b0.f82343d);
    }

    /* renamed from: a1 */
    public static /* synthetic */ c$$d m47006a1(BaseWebViewController baseWebViewController, String str, boolean z, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                z = false;
            }
            if ((i2 & 4) != 0) {
                i = baseWebViewController.mo67700V(str);
            }
            return baseWebViewController.mo67706Z0(str, z, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startGetA8Key");
    }

    /* renamed from: A */
    public void mo63661A(int i, String str, int i2, int i3, String str2) {
        C87412m.m108594g(str, "reqUrl");
        C87412m.m108594g(str2, "errMsg");
        if (i == -1 || i == 0) {
            this.f117597w = null;
        }
        this.f117526E = str;
        mo67686O(this.f117566g0, str);
        for (C43558z b : this.f117547U) {
            b.mo64861b(i, str, i2, i3, str2);
        }
    }

    /* renamed from: A0 */
    public final synchronized boolean mo67666A0() {
        return this.f117602y0.contains(C24560g0.m30725a(Start.class).mo51264h());
    }

    /* renamed from: B */
    public void mo65764B(int i, String str) {
        C87412m.m108594g(str, "reqUrl");
        this.f117543Q.mo73829a("getA8KeyStart", System.currentTimeMillis());
        if (i != 5) {
            mo67686O(this.f117570i0, str);
        }
        if (!C87412m.m108589b(this.f117524D, str)) {
            ((C119157j) C119157j.f356862d).mo183895z(new C43478a0(this, i, str));
        }
    }

    /* renamed from: B0 */
    public final boolean mo67667B0(String str) {
        for (String b : mo67708b0()) {
            if (C12969d.m12408b(str, b, true)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: C0 */
    public void mo67668C0(int i) {
        MMWebView mMWebView = this.f117553a;
        if ((mMWebView != null ? mMWebView.getSettings() : null) != null) {
            if (i < 1) {
                i = 2;
            }
            String X = mo67703X();
            Log.m105924i(X, "localSetFontSize, fontSize = " + i);
            switch (i) {
                case 1:
                    this.f117553a.getSettings().setTextZoom(80);
                    break;
                case 2:
                    this.f117553a.getSettings().setTextZoom(100);
                    break;
                case 3:
                    this.f117553a.getSettings().setTextZoom(110);
                    break;
                case 4:
                    this.f117553a.getSettings().setTextZoom(112);
                    break;
                case 5:
                    this.f117553a.getSettings().setTextZoom(113);
                    break;
                case 6:
                    this.f117553a.getSettings().setTextZoom(140);
                    break;
                case 7:
                    this.f117553a.getSettings().setTextZoom(155);
                    break;
                case 8:
                    this.f117553a.getSettings().setTextZoom(165);
                    break;
                default:
                    this.f117553a.getSettings().setTextZoom(100);
                    break;
            }
            C52806b bVar = this.f117573k;
            int textZoom = this.f117553a.getSettings().getTextZoom();
            bVar.f147528f = i;
            bVar.f147529g = textZoom;
        }
    }

    /* renamed from: D */
    public void mo65765D(int i, String str) {
        C87412m.m108594g(str, "reqUrl");
        this.f117543Q.mo73829a("getA8KeyEnd", System.currentTimeMillis());
        for (C43558z a : this.f117547U) {
            a.mo67848a(i, str);
        }
    }

    /* renamed from: D0 */
    public boolean mo63665D0() {
        return true;
    }

    /* renamed from: E */
    public C45310h mo67669E() {
        return this.f117539M;
    }

    /* renamed from: E0 */
    public final String mo67670E0(String str) {
        return ((str == null || C112551y.m153811k(str)) || C12969d.m12408b(str, "about:blank", true) || C12969d.m12408b(str, "data:text/html;charset=utf-8", true)) ? this.f117518A : str;
    }

    /* renamed from: F */
    public void mo67671F(C43519u uVar) {
        C87412m.m108594g(uVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        if (!this.f117546T.contains(uVar)) {
            this.f117546T.add(uVar);
        }
    }

    /* renamed from: F0 */
    public void mo67672F0() {
    }

    /* renamed from: G */
    public boolean mo67673G() {
        return !mo67748s0(this.f117560d0);
    }

    /* renamed from: G0 */
    public final void mo67674G0() {
        String X = mo67703X();
        Log.m105924i(X, "onFinish " + Util.getStack());
        for (C43558z f : this.f117547U) {
            f.mo67851f();
        }
    }

    /* renamed from: H */
    public void mo67675H(float f) {
        this.f117573k.f147530h = f;
    }

    /* renamed from: H0 */
    public void mo67676H0() {
        if (!this.f117525D0) {
            mo67678I0();
            this.f117525D0 = true;
        }
        for (C43558z j : this.f117547U) {
            j.mo63706j();
        }
    }

    /* JADX WARNING: type inference failed for: r8v6, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo67677I(android.content.Intent r8) {
        /*
            r7 = this;
            java.lang.String r0 = "intent"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.String r0 = r7.mo67703X()
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r2 = r7.mo67719g()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            v83.b r2 = r7.f117573k
            boolean r2 = r2.f147534l
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r3 = 1
            r1[r3] = r2
            java.lang.String r2 = "startWebViewController#%s, isPreload: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r1)
            r7.f117528F = r3
            r7.f117603z = r8
            d93.h r0 = r7.f117539M
            java.lang.String r1 = "hardcode_jspermission"
            android.os.Parcelable r1 = r8.getParcelableExtra(r1)
            boolean r2 = r1 instanceof com.tencent.p014mm.protocal.JsapiPermissionWrapper
            r3 = 0
            if (r2 == 0) goto L_0x003b
            com.tencent.mm.protocal.JsapiPermissionWrapper r1 = (com.tencent.p014mm.protocal.JsapiPermissionWrapper) r1
            goto L_0x003c
        L_0x003b:
            r1 = r3
        L_0x003c:
            java.lang.String r2 = "hardcode_general_ctrl"
            android.os.Parcelable r2 = r8.getParcelableExtra(r2)
            boolean r4 = r2 instanceof com.tencent.p014mm.protocal.GeneralControlWrapper
            if (r4 == 0) goto L_0x0049
            com.tencent.mm.protocal.GeneralControlWrapper r2 = (com.tencent.p014mm.protocal.GeneralControlWrapper) r2
            goto L_0x004a
        L_0x0049:
            r2 = r3
        L_0x004a:
            r0.mo70865h(r1, r2)
            java.lang.String r0 = "scan_jspermission"
            boolean r1 = r8.hasExtra(r0)
            if (r1 == 0) goto L_0x007d
            java.lang.String r1 = "scan_general_ctrl"
            boolean r2 = r8.hasExtra(r1)
            if (r2 == 0) goto L_0x007d
            d93.h r2 = r7.f117539M
            java.lang.String r4 = r7.mo63683n0()
            android.os.Parcelable r0 = r8.getParcelableExtra(r0)
            boolean r5 = r0 instanceof com.tencent.p014mm.protocal.JsapiPermissionWrapper
            if (r5 == 0) goto L_0x006e
            com.tencent.mm.protocal.JsapiPermissionWrapper r0 = (com.tencent.p014mm.protocal.JsapiPermissionWrapper) r0
            goto L_0x006f
        L_0x006e:
            r0 = r3
        L_0x006f:
            android.os.Parcelable r8 = r8.getParcelableExtra(r1)
            boolean r1 = r8 instanceof com.tencent.p014mm.protocal.GeneralControlWrapper
            if (r1 == 0) goto L_0x007a
            r3 = r8
            com.tencent.mm.protocal.GeneralControlWrapper r3 = (com.tencent.p014mm.protocal.GeneralControlWrapper) r3
        L_0x007a:
            r2.mo70864g(r4, r0, r3)
        L_0x007d:
            int r8 = r7.f117558c0
            r7.mo67685N(r8)
            f93.c r8 = r7.f117563f
            ea3.u r0 = r7.f117543Q
            long r1 = r0.f123352s
            long r3 = r0.f123355v
            i93.e$a r0 = r0.f123350q
            r8.getClass()
            java.lang.String r5 = "procBootType"
            gy3.C87412m.m108594g(r0, r5)
            long r5 = java.lang.System.currentTimeMillis()
            r8.f123634a = r5
            r8.f123637d = r1
            r8.f123638e = r3
            r8.f123640g = r0
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Long> r0 = r8.f123639f
            r0.clear()
            i93.e$d r0 = i93.C46206e.m51495b()
            r8.f123642i = r0
            f93.c r8 = r7.f117563f
            v83.b r0 = r7.f117573k
            boolean r0 = r0.f147534l
            r8.f123644k = r0
            ea3.u r0 = r7.f117543Q
            boolean r0 = r0.f123349p
            r8.f123643j = r0
            java.lang.String r0 = r7.mo63683n0()
            java.lang.String r1 = "<set-?>"
            gy3.C87412m.m108594g(r0, r1)
            r8.f123635b = r0
            f93.c r8 = r7.f117563f
            rx3.g r0 = r7.f117593u
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = "prefetchId"
            gy3.C87412m.m108593f(r0, r2)
            r8.getClass()
            r8.f123636c = r0
            f93.c r8 = r7.f117563f
            i93.e$a r0 = r7.f117595v
            r8.getClass()
            gy3.C87412m.m108594g(r0, r1)
            r8.f123641h = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.core.BaseWebViewController.mo67677I(android.content.Intent):void");
    }

    /* renamed from: I0 */
    public void mo67678I0() {
    }

    /* renamed from: J */
    public final void mo67679J(C43505b0 b0Var) {
        C87412m.m108594g(b0Var, "interceptor");
        this.f117545S.add(b0Var);
        C43519u b = b0Var.mo67776b();
        if (b != null) {
            mo67671F(b);
        }
        C43558z d = b0Var.mo63687d();
        if (d != null) {
            mo67741p(d);
        }
        b0Var.f117636a = this;
        b0Var.mo62380h();
    }

    /* renamed from: J0 */
    public void mo63682j(int i, String str, String str2, C52018xt1 xt12) {
        boolean z;
        C87412m.m108594g(str, "reqUrl");
        C87412m.m108594g(str2, "fullUrl");
        C87412m.m108594g(xt12, "response");
        String X = mo67703X();
        Log.m105918d(X, "WebView-Trace onPermissionUpdate#" + mo67719g() + " reason:" + i + ", :" + str + ", fullUrl:" + str2);
        if (mo67757y0()) {
            Log.m105918d(mo67703X(), "onPermissionUpdate destroyCalled");
            return;
        }
        this.f117526E = str2;
        this.f117539M.mo70864g(str, mo67698U().mo70841g(str), mo67698U().mo70839d(str));
        this.f117539M.mo70864g(str2, mo67698U().mo70841g(str2), mo67698U().mo70839d(str2));
        for (C43558z k : this.f117547U) {
            k.mo67855k(i, str, xt12);
        }
        mo67686O(this.f117564f0, str);
        mo67686O(this.f117564f0, str2);
        boolean z2 = true;
        if (!this.f117589s) {
            GeneralControlWrapper b = this.f117539M.mo70859b();
            if (b != null) {
                z = (b.f121046d & 8388608) > 0;
                Log.m105918d("MicroMsg.GeneralControlWrapper", "isMarkRiskControl, ret = " + z);
            } else {
                z = false;
            }
            this.f117589s = z;
        }
        if (!this.f117591t) {
            C52304zt1 zt12 = mo67698U().f122707x;
            if (zt12 == null || zt12.f146215f != 1) {
                z2 = false;
            }
            this.f117591t = z2;
        }
        if (C87412m.m108589b(str, this.f117524D)) {
            mo67686O(this.f117580n0, str);
            String X2 = mo67703X();
            Log.m105924i(X2, "WebAction:Ready onPermissionUpdated Patch: " + this.f117524D);
        }
    }

    /* renamed from: K */
    public final boolean mo67680K(int i, String str) {
        C87412m.m108594g(str, "url");
        return C87412m.m108589b(str, this.f117520B) || i == this.f117574k0 || (this.f117584p0.contains(Integer.valueOf(i)) && C87412m.m108589b(str, this.f117524D)) || this.f117586q0.contains(Integer.valueOf(i));
    }

    /* renamed from: K0 */
    public boolean mo65766k(int i, String str, C52018xt1 xt12) {
        C87412m.m108594g(str, "reqUrl");
        C87412m.m108594g(xt12, "response");
        String X = mo67703X();
        Log.m105924i(X, "onProcessResult, req reason = " + i);
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f117540N;
        concurrentHashMap.clear();
        LinkedList<C48857bh2> linkedList = xt12.f144958x;
        C87412m.m108593f(linkedList, "response.HttpHeader");
        if (!linkedList.isEmpty()) {
            concurrentHashMap.putAll(C45298c.m50183f(xt12.f144958x));
        } else if (mo67715e0().getBooleanExtra("k_has_http_header", false)) {
            Log.m105924i(mo67703X(), "use intent httpheader info");
            String[] stringArrayExtra = mo67715e0().getStringArrayExtra("geta8key_result_http_header_key_list");
            String[] stringArrayExtra2 = mo67715e0().getStringArrayExtra("geta8key_result_http_header_value_list");
            mo67715e0().putExtra("k_has_http_header", false);
            mo67715e0().putStringArrayListExtra("geta8key_result_http_header_key_list", (ArrayList) null);
            mo67715e0().putStringArrayListExtra("geta8key_result_http_header_value_list", (ArrayList) null);
            if (!(stringArrayExtra == null || stringArrayExtra2 == null)) {
                if (!(stringArrayExtra.length == 0)) {
                    if ((!(stringArrayExtra2.length == 0)) && stringArrayExtra.length == stringArrayExtra2.length) {
                        int length = stringArrayExtra.length;
                        for (int i2 = 0; i2 < length; i2++) {
                            String str2 = stringArrayExtra[i2];
                            C87412m.m108593f(str2, "httpHeaderKey[i]");
                            String str3 = stringArrayExtra2[i2];
                            C87412m.m108593f(str3, "httpHeaderValue[i]");
                            concurrentHashMap.put(str2, str3);
                        }
                    }
                }
            }
        }
        String X2 = mo67703X();
        Log.m105924i(X2, "onProcessResult, HttpHeader = " + concurrentHashMap);
        if (mo67687O0(i, str, xt12)) {
            return true;
        }
        for (C43558z l : this.f117547U) {
            l.mo67856l(i, str, xt12);
        }
        return false;
    }

    /* renamed from: L */
    public boolean mo67682L(String str) {
        C87412m.m108594g(str, "url");
        if (C90188n0.f258947o) {
            Log.m105928w(mo67703X(), "skipLoadUrlCheck");
            return true;
        } else if (this.f117555b.f123180b) {
            Log.m105925i(mo67703X(), "albie: trust this url(%s)", str);
            return true;
        } else if (!C12969d.m12408b(str, "file://", true) || mo67667B0(str)) {
            return true;
        } else {
            if (!mo67667B0(mo63683n0())) {
                return false;
            }
            Log.m105925i(mo67703X(), "canLoadUrl rawUrl(%s) is in fileUrlWhiteList, url: %s", mo63683n0(), str);
            return true;
        }
    }

    /* renamed from: L0 */
    public void mo67683L0(C43791l lVar) {
    }

    /* renamed from: M */
    public boolean mo63673M(String str) {
        return false;
    }

    /* renamed from: M0 */
    public boolean mo67684M0() {
        return false;
    }

    /* renamed from: N */
    public final synchronized void mo67685N(int i) {
        if (!mo67757y0()) {
            ((C119157j) C119157j.f356862d).mo183895z(new C43497s(i, this));
        }
    }

    /* renamed from: N0 */
    public void mo63674N0() {
    }

    /* renamed from: O */
    public final synchronized void mo67686O(int i, String str) {
        C87412m.m108594g(str, "url");
        if (!mo67757y0()) {
            if (!C112551y.m153811k(str)) {
                ((C119157j) C119157j.f356862d).mo183895z(new C43498t(i, this, str));
                return;
            }
        }
        String X = mo67703X();
        Log.m105928w(X, "checkStatus return url=" + str);
    }

    /* renamed from: O0 */
    public boolean mo67687O0(int i, String str, C52018xt1 xt12) {
        C87412m.m108594g(str, "reqUrl");
        C87412m.m108594g(xt12, "resp");
        for (C43505b0 l : this.f117545S) {
            if (l.mo67782l(i, str, xt12)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: P */
    public final void mo67688P(WebView webView, String str) {
        if (webView != null && this.f117549W && webView.canGoBack()) {
            String X = mo67703X();
            Log.m105924i(X, "clearHistory :" + str);
            webView.clearHistory();
            if (!Util.isEqual(str, "about:blank")) {
                this.f117549W = false;
            }
        }
    }

    /* renamed from: P0 */
    public boolean mo67689P0(WebView webView, String str) {
        C87412m.m108594g(webView, "webView");
        C87412m.m108594g(str, "url");
        C43505b0.C43506a x0 = mo67755x0(webView, str);
        if (x0.f117638a) {
            return x0.f117639b;
        }
        return false;
    }

    /* renamed from: Q */
    public final void mo67690Q(String str, C32226l<? super String, C13598b0> lVar) {
        C87412m.m108594g(str, "script");
        C61926c.m72668M(new C43500v(this, str, lVar));
    }

    /* renamed from: Q0 */
    public final void mo67691Q0(String str) {
        C87412m.m108594g(str, "url");
        String X = mo67703X();
        Log.m105924i(X, "reload for:" + str);
        this.f117553a.loadUrl(str);
        this.f117549W = true;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: R */
    public final boolean mo67692R() {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.f117562e0     // Catch:{ all -> 0x0024 }
            monitor-enter(r2)     // Catch:{ all -> 0x0024 }
            java.util.concurrent.ConcurrentSkipListSet<java.lang.Integer> r1 = r2.f117598w0     // Catch:{ all -> 0x0021 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0021 }
            r1.remove(r0)     // Catch:{ all -> 0x0021 }
            monitor-exit(r2)     // Catch:{ all -> 0x0024 }
            int r0 = r2.f117560d0     // Catch:{ all -> 0x0024 }
            monitor-enter(r2)     // Catch:{ all -> 0x0024 }
            java.util.concurrent.ConcurrentSkipListSet<java.lang.Integer> r1 = r2.f117598w0     // Catch:{ all -> 0x001e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x001e }
            boolean r0 = r1.remove(r0)     // Catch:{ all -> 0x001e }
            monitor-exit(r2)     // Catch:{ all -> 0x0024 }
            monitor-exit(r2)
            return r0
        L_0x001e:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0024 }
            throw r0     // Catch:{ all -> 0x0024 }
        L_0x0021:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0024 }
            throw r0     // Catch:{ all -> 0x0024 }
        L_0x0024:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.core.BaseWebViewController.mo67692R():boolean");
    }

    /* renamed from: R0 */
    public final void mo67693R0(C43505b0 b0Var) {
        C87412m.m108594g(b0Var, "interceptor");
        this.f117545S.remove(b0Var);
        C43519u b = b0Var.mo67776b();
        if (b != null) {
            mo67723h(b);
        }
        C43558z d = b0Var.mo63687d();
        if (d != null) {
            mo67756y(d);
        }
    }

    /* renamed from: S */
    public String mo67694S(String str) {
        return "";
    }

    /* renamed from: S0 */
    public final void mo67695S0(boolean z) {
        try {
            mo67731m();
            if (!z) {
                mo67731m().mo68124cg(mo67719g());
            }
            mo67731m().mo68126dA(mo67719g(), z);
            Log.m105924i(mo67703X(), "removeInvoker ok");
        } catch (Exception e) {
            String X = mo67703X();
            Log.m105928w(X, "onDestroy, remove callback and invoke event on webview destroy, ex = " + e);
        }
    }

    /* renamed from: T */
    public final boolean mo67696T(String str) {
        C87412m.m108594g(str, "url");
        if (mo67682L(str)) {
            return false;
        }
        String X = mo67703X();
        Log.m105922f(X, "forceQuitOnUrlForbidden, canLoadUrl fail, url = " + str);
        Iterator<C43558z> it = this.f117547U.iterator();
        while (it.hasNext()) {
            it.next().mo67853h();
        }
        return true;
    }

    /* renamed from: T0 */
    public void mo67697T0(String str) {
        C87412m.m108594g(str, "value");
        if (mo63678d1(str)) {
            String X = mo67703X();
            Log.m105918d(X, "WebView-Trace commitUrl:" + str);
            this.f117522C = str;
        }
    }

    /* renamed from: U */
    public final C45298c mo67698U() {
        return (C45298c) this.f117599x.getValue();
    }

    /* renamed from: U0 */
    public void mo67699U0() {
    }

    /* renamed from: V */
    public final int mo67700V(String str) {
        for (C43505b0 a : this.f117545S) {
            int a2 = a.mo67775a(str);
            if (a2 != -1) {
                return a2;
            }
        }
        return mo67698U().mo70845k(str, false);
    }

    /* renamed from: V0 */
    public void mo67701V0(String str) {
        this.f117597w = str;
    }

    /* renamed from: W */
    public List<C30570e> mo63675W() {
        return this.f117590s0;
    }

    /* renamed from: W0 */
    public final void mo67702W0(String str) {
        C87412m.m108594g(str, "value");
        if (mo63679e1(str)) {
            String X = mo67703X();
            Log.m105918d(X, "WebView-Trace startUrl:" + str);
            this.f117520B = str;
        }
    }

    /* renamed from: X */
    public final String mo67703X() {
        return (String) ((C36570n) this.f117561e).getValue();
    }

    /* renamed from: X0 */
    public final void mo67704X0() {
        if (this.f117527E0 == null) {
            Log.m105924i(mo67703X(), "WebView-Trace setWebViewPluginClient");
            this.f117527E0 = C91167d.m114400a(this.f117553a, C46689b.getInstance(), ((C31365g0) C86312j.m106911c(C31365g0.class)).mo57928j(), (C40525w2) null);
        }
    }

    /* renamed from: Y */
    public final String mo67705Y(String str) {
        if (!mo63678d1(str)) {
            str = this.f117522C;
        }
        return (!C112551y.m153811k(str) || !mo67748s0(this.f117558c0)) ? str : mo63683n0();
    }

    /* renamed from: Y0 */
    public boolean mo63676Y0(String str, boolean z) {
        C87412m.m108594g(str, "url");
        return m47006a1(this, str, z, 0, 4, (Object) null) == c$$d.WILL_GET;
    }

    /* renamed from: Z */
    public boolean mo63677Z() {
        return this.f117588r0;
    }

    /* renamed from: Z0 */
    public final c$$d mo67706Z0(String str, boolean z, int i) {
        C87412m.m108594g(str, "url");
        if (this.f117555b.f123183e) {
            String X = mo67703X();
            Log.m105928w(X, "startGetA8Key neverGetA8Key " + str);
            return c$$d.NO_NEED;
        }
        for (C43505b0 j : this.f117545S) {
            if (j.mo67780j(str, z, i)) {
                return c$$d.INTERCEPTED;
            }
        }
        if (this.f117583p > 0) {
            C45298c U = mo67698U();
            C48763au1 au12 = new C48763au1();
            au12.f130773d = this.f117583p;
            au12.f130774e = (int) (System.currentTimeMillis() - this.f117585q);
            String X2 = mo67703X();
            Log.m105924i(X2, "GetA8KeySecurityInfo KeyBackCounts=" + au12.f130773d + ", KeyBackTimes=" + au12.f130774e);
            U.f122705v = au12;
        }
        return mo67698U().mo70851q(str, z, i, (C45303g) ((C36570n) this.f117571j).getValue());
    }

    /* renamed from: a0 */
    public final Context mo67707a0() {
        Context activityContextIfHas = this.f117553a.getActivityContextIfHas();
        C87412m.m108593f(activityContextIfHas, "viewWV.activityContextIfHas");
        return activityContextIfHas;
    }

    /* renamed from: b0 */
    public abstract Set<String> mo67708b0();

    /* renamed from: b1 */
    public final void mo67709b1(String str) {
        boolean contains;
        C48590l g0;
        if (((Boolean) ((C36570n) this.f117521B0).getValue()).booleanValue() && !this.f117553a.f122355e && !mo67748s0(this.f117560d0) && str != null && !C112551y.m153819s(str, "file:", false)) {
            synchronized (this) {
                contains = this.f117600x0.contains(C24560g0.m30725a(Inject.class).mo51264h());
            }
            if (!contains && (g0 = mo67720g0()) != null) {
                g0.f130011p = true;
                String randomString = Util.getRandomString(16);
                g0.f130012q = randomString;
                g0.f129996a.setRandomStr(randomString);
                Log.m105925i("MicroMsg.JsApiHandler", "WebView-Trace js digest updateDgtVerify randomStr = %s, hashCode: %d", g0.f130012q, Integer.valueOf(g0.hashCode()));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001b A[Catch:{ Exception -> 0x0028 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0016 A[Catch:{ Exception -> 0x0028 }] */
    /* renamed from: c0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo67710c0() {
        /*
            r4 = this;
            d93.c r0 = r4.mo67698U()     // Catch:{ Exception -> 0x0028 }
            java.lang.String r1 = r4.getCurrentUrl()     // Catch:{ Exception -> 0x0028 }
            if (r1 == 0) goto L_0x0013
            boolean r1 = z04.C112551y.m153811k(r1)     // Catch:{ Exception -> 0x0028 }
            if (r1 == 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r1 = 0
            goto L_0x0014
        L_0x0013:
            r1 = 1
        L_0x0014:
            if (r1 == 0) goto L_0x001b
            java.lang.String r1 = r4.mo63683n0()     // Catch:{ Exception -> 0x0028 }
            goto L_0x001f
        L_0x001b:
            java.lang.String r1 = r4.getCurrentUrl()     // Catch:{ Exception -> 0x0028 }
        L_0x001f:
            te3.bu1 r0 = r0.mo70840e(r1)     // Catch:{ Exception -> 0x0028 }
            byte[] r0 = r0.toByteArray()     // Catch:{ Exception -> 0x0028 }
            return r0
        L_0x0028:
            r0 = move-exception
            java.lang.String r1 = r4.mo67703X()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "saveLiveBarResp ex "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.core.BaseWebViewController.mo67710c0():byte[]");
    }

    /* renamed from: c1 */
    public void mo67711c1(boolean z, String str, JsapiPermissionWrapper jsapiPermissionWrapper) {
        C87412m.m108594g(str, "uiConfig");
    }

    /* renamed from: d0 */
    public final MMHandler mo67712d0() {
        return (MMHandler) ((C36570n) this.f117538L).getValue();
    }

    /* renamed from: d1 */
    public boolean mo63678d1(String str) {
        C87412m.m108594g(str, "url");
        if ((!C112551y.m153811k(str)) && !C112551y.m153819s(str, "data:text/html;charset=utf-8", false) && !C112551y.m153819s(str, "about:blank", false)) {
            if (!mo67748s0(this.f117560d0)) {
                return true;
            }
            String str2 = C32355a.f85865a;
            C87412m.m108593f(str2, "HARDCODE_URL");
            if (!C112551y.m153819s(str, str2, false)) {
                return true;
            }
        }
        return false;
    }

    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        C87412m.m108594g(webView, "view");
        C87412m.m108594g(str, "url");
        String url = webView.getUrl();
        String X = mo67703X();
        Log.m105924i(X, "WebView-Trace doUpdateVisitedHistory, url = " + str + ", wvUrl = " + url + ", isReload = " + z);
        if (C112551y.m153819s(str, "data:text/html;charset=utf-8", false)) {
            String X2 = mo67703X();
            Log.m105924i(X2, "url starts with data:text, url : " + str);
        } else if (C12969d.m12408b(str, "about:blank", true) || C12969d.m12408b(str, "file:///android_asset/", true)) {
            Log.m105920e(mo67703X(), "doUpdateVisitedHistory, url is invalid");
        } else {
            if (mo67748s0(this.f117560d0)) {
                String str2 = C32355a.f85865a;
                C87412m.m108593f(str2, "HARDCODE_URL");
                if (C12969d.m12408b(str, str2, true)) {
                    Log.m105924i(mo67703X(), "doUpdateVisitedHistory, url is HARDCODE_URL");
                    return;
                }
            }
            super.doUpdateVisitedHistory(webView, str, z);
            C87412m.m108593f(url, "wvUrl");
            if (C12969d.m12408b(url, "http", true)) {
                str = url;
            }
            if (!C87412m.m108589b(this.f117520B, str)) {
                String str3 = this.f117522C;
                if ((str3 == null || C112551y.m153811k(str3)) || C87412m.m108589b(C44404a.m48764a(str), C44404a.m48764a(this.f117522C))) {
                    String str4 = this.f117520B;
                    if ((str4 == null || C112551y.m153811k(str4)) || C87412m.m108589b(C44404a.m48764a(str), C44404a.m48764a(this.f117520B))) {
                        String X3 = mo67703X();
                        Log.m105918d(X3, "dealSPAUpdate url=" + str + ", startUrl=" + this.f117520B);
                        if (this.f117539M.mo70862e(str)) {
                            mo67686O(this.f117580n0, str);
                        }
                        C48583f1 f0 = mo67717f0();
                        if (f0.f129968a == null || f0.f129969b == null) {
                            Log.m105920e("MicroMsg.JsLoader", "auth, viewWV or jsapi is null");
                        } else {
                            Log.m105924i("MicroMsg.JsLoader", "SPA-Trace, spaHistoryChanged");
                            f0.f129969b.mo73236e0("sys:spa:historyChanged", new HashMap(), (JSONObject) null);
                        }
                        this.f117524D = str;
                        C46206e.C46209c cVar = this.f117565g;
                        long currentTimeMillis = System.currentTimeMillis();
                        String title = this.f117553a.getTitle();
                        C87412m.m108593f(title, "viewWV.title");
                        cVar.mo71629a(new C46206e.C46209c.C46210a(str, currentTimeMillis, title));
                    }
                }
                String X4 = mo67703X();
                Log.m105928w(X4, "dealSPAUpdate hot not equal, url=" + str + ", commitUrl=" + this.f117522C + ", startUrl=" + this.f117520B);
            }
            if (!this.f117555b.f123183e && !mo67698U().f122702s.mo70855b(str)) {
                mo67706Z0(str, false, mo67698U().mo70845k(str, true));
            }
            this.f117597w = str;
            for (C43519u uVar : this.f117546T) {
                if (mo67666A0()) {
                    uVar.mo67809a(webView, str, z);
                }
            }
            mo67688P(webView, str);
        }
    }

    /* renamed from: e */
    public boolean mo67714e() {
        return this.f117575l;
    }

    /* renamed from: e0 */
    public final Intent mo67715e0() {
        Intent intent = this.f117603z;
        if (intent != null) {
            return intent;
        }
        C87412m.m108603p("intent");
        throw null;
    }

    /* renamed from: e1 */
    public boolean mo63679e1(String str) {
        C87412m.m108594g(str, "url");
        return true;
    }

    /* renamed from: e3 */
    public String mo67716e3() {
        return this.f117522C;
    }

    /* renamed from: f0 */
    public final C48583f1 mo67717f0() {
        return (C48583f1) ((C36570n) this.f117534I).getValue();
    }

    /* renamed from: f1 */
    public final synchronized <T extends WebAction> void mo67718f1(Iterable<? extends C13604l<? extends T, ? extends C32224a<C13598b0>>> iterable, Set<String> set, String str) {
        Iterator<? extends C13604l<? extends T, ? extends C32224a<C13598b0>>> it = iterable.iterator();
        while (it.hasNext()) {
            C13604l lVar = (C13604l) it.next();
            WebAction webAction = (WebAction) lVar.f38555d;
            C32224a aVar = (C32224a) lVar.f38556e;
            boolean z = false;
            if (webAction instanceof PageAction) {
                if (str != null && ((PageAction) webAction).verify(str)) {
                    z = true;
                }
            } else if (webAction instanceof ControllerAction) {
                z = ((ControllerAction) webAction).verify();
            }
            if (z) {
                String X = mo67703X();
                Log.m105924i(X, "verify WebAction: " + C24560g0.m30725a(webAction.getClass()).mo51264h() + " start");
                if (!webAction.getKeep()) {
                    it.remove();
                }
                aVar.invoke();
                String h = C24560g0.m30725a(webAction.getClass()).mo51264h();
                if (h == null) {
                    h = "";
                }
                set.add(h);
                String X2 = mo67703X();
                Log.m105926v(X2, "verifyActions: " + C24560g0.m30725a(webAction.getClass()).mo51264h() + " end");
            }
        }
    }

    /* renamed from: g */
    public int mo67719g() {
        return ((Number) ((C36570n) this.f117537K).getValue()).intValue();
    }

    /* renamed from: g0 */
    public final C48590l mo67720g0() {
        return (C48590l) ((C36570n) this.f117536J).getValue();
    }

    /* renamed from: g1 */
    public boolean mo63680g1() {
        return false;
    }

    public String getCurrentUrl() {
        return C112551y.m153811k(this.f117524D) ? this.f117522C : this.f117524D;
    }

    public Object getWebViewPluginClientProxy() {
        if (this.f117527E0 == null) {
            mo67704X0();
        }
        return this.f117527E0;
    }

    /* renamed from: h */
    public void mo67723h(C43519u uVar) {
        C87412m.m108594g(uVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        if (this.f117546T.contains(uVar)) {
            this.f117546T.remove(uVar);
        }
    }

    /* renamed from: h0 */
    public final C30579m mo67724h0() {
        return (C30579m) ((C36570n) this.f117544R).getValue();
    }

    /* renamed from: h1 */
    public boolean mo63681h1() {
        return false;
    }

    /* renamed from: i */
    public void mo67725i(float f) {
        this.f117573k.f147531i = f;
    }

    /* renamed from: i0 */
    public final int mo67726i0() {
        if (!mo63685z0()) {
            return 0;
        }
        return this.f117587r ? 2 : 1;
    }

    public void init() {
        synchronized (this) {
            Log.m105924i(mo67703X(), "resetActions");
            this.f117598w0.clear();
            this.f117602y0.clear();
            this.f117592t0.clear();
            this.f117596v0.clear();
            this.f117600x0.clear();
            this.f117594u0.clear();
            try {
                long currentTimeMillis = System.currentTimeMillis();
                for (C30570e eVar : mo63675W()) {
                    WebAction webAction = eVar.f82345a;
                    webAction.setController(this);
                    if (webAction instanceof ControllerAction) {
                        this.f117592t0.add(new C13604l(webAction, eVar.f82346b));
                    } else if (webAction instanceof PageAction) {
                        this.f117594u0.add(new C13604l(webAction, eVar.f82346b));
                    }
                }
                String X = mo67703X();
                Log.m105918d(X, "resetActions init actionsCheckList cost " + (System.currentTimeMillis() - currentTimeMillis));
            } catch (Exception e) {
                String X2 = mo67703X();
                Log.m105924i(X2, "resetActions ex" + e.getMessage());
            }
        }
        mo67685N(this.f117554a0);
        MMWebView mMWebView = this.f117553a;
        ((ArrayList) mMWebView.f122364q).add(new C43480d());
        C48590l g0 = mo67720g0();
        g0.getClass();
        g0.f130009n = this;
        C48302a aVar = g0.f130021z;
        int g = mo67719g();
        aVar.getClass();
        Log.m105924i("MicroMsg.WebViewExtEventHandler", "setWebViewId: " + g);
        aVar.f129351a = g;
        return;
    }

    /* renamed from: j0 */
    public final C45604u mo67728j0() {
        return this.f117543Q;
    }

    /* renamed from: k0 */
    public int mo67729k0(String str) {
        return 0;
    }

    /* renamed from: l */
    public void mo65767l(int i, boolean z, String str, String str2, Object obj) {
        C52018xt1 xt12 = (C52018xt1) obj;
        C87412m.m108594g(str, "reqUrl");
        C87412m.m108594g(str2, "fullUrl");
        C87412m.m108594g(xt12, "response");
        boolean z2 = true;
        if (!mo67696T(str2)) {
            Iterator<C43505b0> it = this.f117545S.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().mo63689s(i, z, str, str2)) {
                        break;
                    }
                } else {
                    z2 = false;
                    break;
                }
            }
        } else {
            String X = mo67703X();
            Log.m105922f(X, "processGetA8Key qrcode, canLoadUrl fail, url = " + str2);
        }
        if (!z2) {
            String X2 = mo67703X();
            Log.m105918d(X2, "onUrlRedirect:" + str + "\nfrom:" + str2);
            C45520t.C45521a.m50512a(this, str2, this.f117540N, false, 4, (Object) null);
            Iterator<C43558z> it4 = this.f117547U.iterator();
            while (it4.hasNext()) {
                it4.next().mo67861q(i, str, xt12);
            }
        }
    }

    /* renamed from: l0 */
    public final String mo67730l0() {
        C45298c U = mo67698U();
        String currentUrl = getCurrentUrl();
        return U.mo70848n(currentUrl == null || C112551y.m153811k(currentUrl) ? mo63683n0() : getCurrentUrl());
    }

    /* renamed from: m */
    public C43791l mo67731m() {
        C43791l lVar = this.f117601y;
        if (lVar != null) {
            return lVar;
        }
        C87412m.m108603p("invoker");
        throw null;
    }

    /* renamed from: m0 */
    public final String mo67732m0() {
        return this.f117577m;
    }

    /* renamed from: n */
    public void mo67733n(String str) {
        C87412m.m108594g(str, "jumperExtInfo");
        this.f117573k.f147533k = str;
    }

    /* renamed from: n0 */
    public String mo63683n0() {
        try {
            return f117516J0.mo6892a(mo67715e0());
        } catch (Exception e) {
            Log.m105920e(mo67703X(), String.valueOf(e.getMessage()));
            mo67674G0();
            return "";
        }
    }

    /* renamed from: o */
    public String mo67734o() {
        return this.f117597w;
    }

    /* renamed from: o0 */
    public final ConcurrentLinkedDeque<C32224a<C13598b0>> mo67735o0(int i) {
        ConcurrentLinkedDeque<C32224a<C13598b0>> concurrentLinkedDeque = this.f117548V.get(Integer.valueOf(i));
        if (concurrentLinkedDeque != null) {
            return concurrentLinkedDeque;
        }
        ConcurrentLinkedDeque<C32224a<C13598b0>> concurrentLinkedDeque2 = new ConcurrentLinkedDeque<>();
        this.f117548V.put(Integer.valueOf(i), concurrentLinkedDeque2);
        return concurrentLinkedDeque2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        cy3.C58003b.m67160a(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDestroy() {
        /*
            r6 = this;
            r0 = 1
            r6.f117530G = r0
            boolean r1 = r6.f117532H
            r2 = 0
            if (r1 != 0) goto L_0x000b
            r6.mo67695S0(r2)
        L_0x000b:
            com.tencent.mm.plugin.webview.core.i r1 = r6.f117519A0
            r3 = 0
            if (r1 == 0) goto L_0x0026
            java.lang.String r4 = r6.mo67703X()     // Catch:{ all -> 0x001f }
            java.lang.String r5 = "unbindService"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)     // Catch:{ all -> 0x001f }
            rx3.b0 r4 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x001f }
            cy3.C58003b.m67160a(r1, r3)
            goto L_0x0026
        L_0x001f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0021 }
        L_0x0021:
            r2 = move-exception
            cy3.C58003b.m67160a(r1, r0)
            throw r2
        L_0x0026:
            com.tencent.mm.sdk.platformtools.MMHandler r1 = r6.mo67712d0()
            rx3.g r4 = r6.f117541O
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r1.removeCallbacksAndMessages(r4)
            t83.l r1 = r6.mo67720g0()
            r1.mo73251p()
            t83.f1 r1 = r6.mo67717f0()
            r1.getClass()
            java.lang.String r4 = "MicroMsg.JsLoader"
            java.lang.String r5 = "detach"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r4, r5)
            r1.f129968a = r3
            r1.f129969b = r3
            r1.f129970c = r3
            d93.c r1 = r6.mo67698U()
            r1.f122697n = r0
            d93.c r1 = r6.mo67698U()
            te3.zt1 r1 = r1.f122707x
            int r3 = r1.f146218i
            if (r3 > 0) goto L_0x006e
            boolean r4 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r4 != 0) goto L_0x006a
            boolean r4 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r4 == 0) goto L_0x006e
        L_0x006a:
            r2 = 5
            r1.f146218i = r2
            goto L_0x0072
        L_0x006e:
            if (r3 <= 0) goto L_0x0071
            goto L_0x0072
        L_0x0071:
            r0 = 0
        L_0x0072:
            if (r0 == 0) goto L_0x0081
            rx3.g r0 = r6.f117523C0
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            i93.d r0 = (i93.C33250d) r0
            r0.getClass()
        L_0x0081:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.core.BaseWebViewController.onDestroy():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPageCommitVisible(com.tencent.xweb.WebView r12, java.lang.String r13) {
        /*
            r11 = this;
            boolean r0 = r11.mo67757y0()
            if (r0 == 0) goto L_0x0010
            java.lang.String r12 = r11.mo67703X()
            java.lang.String r13 = "ActivityFinished"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r13)
            return
        L_0x0010:
            t83.l r0 = r11.mo67720g0()
            if (r0 == 0) goto L_0x001d
            java.util.LinkedList<t83.h1> r0 = r0.f130000e
            if (r0 == 0) goto L_0x001d
            r0.clear()
        L_0x001d:
            if (r13 != 0) goto L_0x0022
            java.lang.String r0 = ""
            goto L_0x0023
        L_0x0022:
            r0 = r13
        L_0x0023:
            java.lang.String r0 = r11.mo67705Y(r0)
            java.lang.String r1 = r11.mo67703X()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "WebView-Trace onPageCommitVisible#"
            r2.append(r3)
            int r3 = r11.mo67719g()
            r2.append(r3)
            java.lang.String r3 = ": "
            r2.append(r3)
            r2.append(r13)
            java.lang.String r3 = ", callbackUrl:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            r11.mo67697T0(r0)
            super.onPageCommitVisible(r12, r13)
            com.tencent.mm.plugin.webview.core.v$b r1 = com.tencent.p014mm.plugin.webview.core.C43520v.f117665a
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = com.tencent.p014mm.plugin.webview.core.C5857x.m5577a()
            java.lang.String r2 = "webview_page_commit_mock"
            r3 = 0
            boolean r1 = r1.getBoolean(r2, r3)
            if (r1 != 0) goto L_0x0082
            int r1 = r11.f117576l0
            java.lang.String r2 = r11.mo67670E0(r13)
            boolean r1 = r11.mo67680K(r1, r2)
            if (r1 == 0) goto L_0x0078
            r11.mo67709b1(r13)
        L_0x0078:
            int r1 = r11.f117576l0
            java.lang.String r2 = r11.mo67670E0(r13)
            r11.mo67686O(r1, r2)
            goto L_0x008b
        L_0x0082:
            java.lang.String r1 = r11.mo67703X()
            java.lang.String r2 = "WebView Page Commit Mock Enabled"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
        L_0x008b:
            if (r12 == 0) goto L_0x012e
            boolean r1 = r11.mo63673M(r13)
            if (r1 != 0) goto L_0x0114
            int r1 = r11.f117558c0
            boolean r1 = r11.mo67748s0(r1)
            if (r1 == 0) goto L_0x0114
            d93.c r1 = r11.mo67698U()
            te3.zt1 r1 = r1.f122707x
            int r2 = r1.f146218i
            r4 = 1
            if (r2 > 0) goto L_0x00b2
            boolean r5 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r5 != 0) goto L_0x00ae
            boolean r5 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r5 == 0) goto L_0x00b2
        L_0x00ae:
            r2 = 5
            r1.f146218i = r2
            goto L_0x00b4
        L_0x00b2:
            if (r2 <= 0) goto L_0x00b6
        L_0x00b4:
            r1 = 1
            goto L_0x00b7
        L_0x00b6:
            r1 = 0
        L_0x00b7:
            if (r1 == 0) goto L_0x0114
            java.lang.String r1 = r11.mo63683n0()
            if (r1 == 0) goto L_0x00c8
            boolean r1 = z04.C112551y.m153811k(r1)
            if (r1 == 0) goto L_0x00c6
            goto L_0x00c8
        L_0x00c6:
            r1 = 0
            goto L_0x00c9
        L_0x00c8:
            r1 = 1
        L_0x00c9:
            if (r1 != 0) goto L_0x0114
            rx3.g r1 = r11.f117523C0
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            r7 = r1
            i93.d r7 = (i93.C33250d) r7
            java.lang.String r9 = r11.mo63683n0()
            d93.c r1 = r11.mo67698U()
            r7.getClass()
            java.lang.String r2 = "a8Key"
            gy3.C87412m.m108594g(r1, r2)
            if (r13 != 0) goto L_0x00e9
            goto L_0x0114
        L_0x00e9:
            boolean r2 = r7.f90209b
            if (r2 == 0) goto L_0x00ee
            goto L_0x0114
        L_0x00ee:
            r7.f90209b = r4
            te3.zt1 r2 = r1.f122707x
            int r2 = r2.f146218i
            if (r2 <= 0) goto L_0x0114
            r4 = 30
            if (r2 <= r4) goto L_0x00fb
            goto L_0x0114
        L_0x00fb:
            int r10 = r1.f122692i
            zt3.t r1 = zt3.C119157j.f356862d
            i93.c r4 = new i93.c
            r5 = r4
            r6 = r12
            r8 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            long r5 = (long) r2
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r7
            zt3.j r1 = (zt3.C119157j) r1
            r1.getClass()
            r1.mo183892w(r4, r5, r3)
        L_0x0114:
            i93.e$c r1 = r11.f117565g
            i93.e$c$a r2 = new i93.e$c$a
            java.lang.String r3 = r11.f117522C
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r6 = r12.getTitle()
            java.lang.String r7 = "view.title"
            gy3.C87412m.m108593f(r6, r7)
            r2.<init>(r3, r4, r6)
            r1.mo71629a(r2)
        L_0x012e:
            java.util.concurrent.ConcurrentLinkedDeque<com.tencent.mm.plugin.webview.core.u> r1 = r11.f117546T
            java.util.Iterator r1 = r1.iterator()
        L_0x0134:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x014a
            java.lang.Object r2 = r1.next()
            com.tencent.mm.plugin.webview.core.u r2 = (com.tencent.p014mm.plugin.webview.core.C43519u) r2
            boolean r3 = r11.mo67666A0()
            if (r3 == 0) goto L_0x0134
            r2.mo64752b(r12, r0)
            goto L_0x0134
        L_0x014a:
            r11.mo67688P(r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.core.BaseWebViewController.onPageCommitVisible(com.tencent.xweb.WebView, java.lang.String):void");
    }

    public void onPageFinished(WebView webView, String str) {
        String url;
        if (mo67757y0()) {
            Log.m105928w(mo67703X(), "ActivityFinished");
            return;
        }
        if (!(webView == null || (url = webView.getUrl()) == null)) {
            str = url;
        }
        String Y = mo67705Y(str == null ? "" : str);
        String X = mo67703X();
        Log.m105924i(X, "WebView-Trace onPageFinished#" + mo67719g() + ": " + str + ", callbackUrl:" + Y);
        super.onPageFinished(webView, str);
        if (!this.f117596v0.contains(Integer.valueOf(this.f117576l0)) && !mo63685z0()) {
            C115669n.INSTANCE.idkeyStat(1200, 104, 1, false);
            String X2 = mo67703X();
            Log.m105924i(X2, "WebView-Trace onPageFinished#" + mo67719g() + " callback before onPageCommitVisible");
        }
        mo67686O(this.f117578m0, mo67670E0(str));
        for (C43519u uVar : this.f117546T) {
            if (mo67666A0()) {
                uVar.mo64753c(webView, Y);
            }
        }
        mo67688P(webView, str);
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        C87412m.m108594g(webView, "view");
        C87412m.m108594g(str, "url");
        if (mo67757y0()) {
            Log.m105928w(mo67703X(), "ActivityFinished");
            return;
        }
        mo67686O(this.f117568h0, str);
        String X = mo67703X();
        Log.m105924i(X, "WebView-Trace onPageStarted#" + mo67719g() + ": " + str);
        this.f117597w = str;
        synchronized (this) {
            String X2 = mo67703X();
            Log.m105924i(X2, "resetPageActions clear status:" + str + ", [" + C110818d0.m150921S(this.f117596v0, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null) + "] actions: [" + C110818d0.m150921S(this.f117600x0, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null) + ']');
            this.f117596v0.clear();
            this.f117600x0.clear();
            this.f117594u0.clear();
            for (C30570e eVar : mo63675W()) {
                WebAction webAction = eVar.f82345a;
                webAction.setController(this);
                if (webAction instanceof PageAction) {
                    this.f117594u0.add(new C13604l(webAction, eVar.f82346b));
                }
            }
            mo67702W0(str);
            this.f117524D = "";
        }
        for (C43519u uVar : this.f117546T) {
            if (mo67666A0()) {
                uVar.mo62156d(webView, mo67705Y(str));
            }
        }
        super.onPageStarted(webView, str, bitmap);
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        int i2;
        super.onReceivedError(webView, i, str, str2);
        if (!C11171e.m11046c(23)) {
            String X = mo67703X();
            Log.m105924i(X, "WebView-Trace onReceivedError-old#" + mo67719g() + ", errCode:" + i + ", description:" + str + ", failingUrl:" + str2);
            if (!mo67748s0(this.f117558c0)) {
                Log.m105924i(mo67703X(), "onReceivedError, intent not ready");
                return;
            }
            if (mo67748s0(this.f117556b0)) {
                C30579m h0 = mo67724h0();
                String S = mo67694S(getCurrentUrl());
                MMWebView mMWebView = this.f117553a;
                if (mMWebView == null) {
                    i2 = 0;
                } else {
                    i2 = mMWebView.isXWalkKernel() ? 2 : 3;
                }
                h0.mo57488c(i, str, str2, S, i2, mo67726i0(), true);
            }
            for (C43519u uVar : this.f117546T) {
                if (mo67666A0()) {
                    uVar.mo64754e(webView, i, str, str2);
                }
            }
        }
    }

    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        C87412m.m108594g(httpAuthHandler, "handler");
        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        C115669n.INSTANCE.mo175913w(155, 35, 1);
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        int i;
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        String X = mo67703X();
        StringBuilder sb = new StringBuilder();
        sb.append("WebView-Trace onReceivedHttpError#");
        sb.append(mo67719g());
        sb.append(", errCode:");
        Uri uri = null;
        sb.append(webResourceResponse != null ? Integer.valueOf(webResourceResponse.getStatusCode()) : null);
        sb.append(", description:");
        sb.append(webResourceResponse != null ? webResourceResponse.getReasonPhrase() : null);
        sb.append(", failingUrl:");
        if (webResourceRequest != null) {
            uri = webResourceRequest.getUrl();
        }
        sb.append(uri);
        Log.m105924i(X, sb.toString());
        if (!mo67748s0(this.f117558c0)) {
            Log.m105924i(mo67703X(), "onReceivedHttpError, intent not ready");
            return;
        }
        if (mo67748s0(this.f117556b0)) {
            C30579m h0 = mo67724h0();
            String S = mo67694S(getCurrentUrl());
            MMWebView mMWebView = this.f117553a;
            if (mMWebView == null) {
                i = 0;
            } else {
                i = mMWebView.isXWalkKernel() ? 2 : 3;
            }
            int i0 = mo67726i0();
            if (h0.mo57489d() && webResourceRequest != null) {
                ((C119157j) C119157j.f356862d).mo183876g(new C43517o(webResourceRequest, h0, webResourceResponse, S, i, i0), "MicroMsg.WebPageErrorMonitor");
            }
        }
        for (C43519u uVar : this.f117546T) {
            if (mo67666A0()) {
                uVar.mo64756g(webView, webResourceRequest, webResourceResponse);
            }
        }
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        int i;
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        String X = mo67703X();
        StringBuilder sb = new StringBuilder();
        sb.append("WebView-Trace onReceivedSslError#");
        sb.append(mo67719g());
        sb.append(", ");
        sb.append(sslError != null ? sslError.toString() : null);
        Log.m105924i(X, sb.toString());
        if (!mo67748s0(this.f117558c0)) {
            Log.m105924i(mo67703X(), "onReceivedSslError, intent not ready");
            return;
        }
        if (mo67748s0(this.f117556b0)) {
            C30579m h0 = mo67724h0();
            String S = mo67694S(getCurrentUrl());
            MMWebView mMWebView = this.f117553a;
            if (mMWebView == null) {
                i = 0;
            } else {
                i = mMWebView.isXWalkKernel() ? 2 : 3;
            }
            int i0 = mo67726i0();
            if (h0.mo57489d() && sslError != null) {
                ((C119157j) C119157j.f356862d).mo183876g(new C43518p(sslError, h0, S, i, i0), "MicroMsg.WebPageErrorMonitor");
            }
        }
        for (C43519u uVar : this.f117546T) {
            if (mo67666A0()) {
                uVar.mo64757h(webView, sslErrorHandler, sslError);
            }
        }
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (this.f117531G0) {
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
        C43516l lVar = this.f117529F0;
        if (lVar != null) {
            WebViewUI$$e0 webViewUI$$e0 = (WebViewUI$$e0) lVar;
            WebViewUI webViewUI = webViewUI$$e0.f118597a;
            if (webViewUI.f118581y1 || webViewUI.f118577x1 || webViewUI.isFinishing()) {
                Log.m105920e("MicroMsg.WebViewUI", "WebView-Trace RenderProcess has destroyed");
            } else if (webViewUI$$e0.f118597a.isPaused()) {
                Log.m105924i("MicroMsg.WebViewUI", "WebView-Trace RenderProcess has pause");
            } else {
                webViewUI$$e0.f118597a.getClass();
                if (!(BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_web_view_render_recover, 0) == 1)) {
                    Log.m105924i("MicroMsg.WebViewUI", "WebView-Trace RenderProcess recover mode not enable");
                } else if (webViewUI$$e0.f118597a.f118452B2) {
                    Log.m105920e("MicroMsg.WebViewUI", "WebView-Trace RenderProcessGone, hasCallRenderProcessGone, return");
                } else {
                    C115669n nVar = C115669n.INSTANCE;
                    nVar.mo175911u(1009, 230);
                    WebViewUI webViewUI2 = webViewUI$$e0.f118597a;
                    webViewUI2.f118452B2 = true;
                    Bundle extras = webViewUI2.getIntent().getExtras();
                    if (extras.getBoolean("renderRecoverMode", false)) {
                        nVar.mo175911u(1009, 232);
                        Log.m105920e("MicroMsg.WebViewUI", "WebView-Trace RenderProcessGone, will not open new page to recover");
                    } else {
                        nVar.mo175911u(1009, 231);
                        Log.m105924i("MicroMsg.WebViewUI", "WebView-Trace RenderProcessGone do , will not open new page to recover");
                        Intent intent = new Intent();
                        intent.putExtras(extras);
                        intent.putExtra("renderRecoverMode", true);
                        C88144b.m109791i(webViewUI$$e0.f118597a, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                        C119179t tVar = C119157j.f356862d;
                        C44035i2 i2Var = new C44035i2(webViewUI$$e0);
                        C119157j jVar = (C119157j) tVar;
                        jVar.getClass();
                        jVar.mo183892w(i2Var, 100, false);
                    }
                }
            }
            this.f117531G0 = true;
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    /* renamed from: p */
    public synchronized void mo67741p(C43558z zVar) {
        C87412m.m108594g(zVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        if (!this.f117547U.contains(zVar)) {
            zVar.f117774a = this;
            this.f117547U.add(zVar);
            if (this.f117602y0.contains(C24560g0.m30725a(Bind.class).mo51264h())) {
                Log.m105924i(mo67703X(), "Abe-Debug Patch Call onBind");
                zVar.mo64862e();
            }
        }
    }

    /* renamed from: p0 */
    public abstract Class<? extends Service> mo67742p0();

    /* renamed from: q */
    public C7580y mo67743q() {
        return mo67720g0();
    }

    /* renamed from: q0 */
    public final boolean mo67744q0() {
        return this.f117591t;
    }

    /* renamed from: r */
    public void mo65768r(int i, String str, String str2) {
        if (str2 != null) {
            WebSettings settings = this.f117553a.getSettings();
            if (settings != null) {
                settings.setJavaScriptEnabled(false);
            }
            this.f117553a.loadData(str2, "text/html", "utf-8");
        }
    }

    /* renamed from: r0 */
    public final MMWebView mo67745r0() {
        return this.f117553a;
    }

    public void reload() {
        MMWebView mMWebView = this.f117553a;
        if (mMWebView != null && !Util.isNullOrNil(mMWebView.getUrl())) {
            for (C43505b0 m : this.f117545S) {
                String url = this.f117553a.getUrl();
                C87412m.m108593f(url, "viewWV.url");
                if (m.mo63688m(mo67705Y(url))) {
                    return;
                }
            }
            Log.m105924i(mo67703X(), "reload");
            this.f117553a.reload();
        }
    }

    /* renamed from: s */
    public void mo67747s(float f) {
        this.f117573k.f147532j = f;
    }

    /* renamed from: s0 */
    public final synchronized boolean mo67748s0(int i) {
        return this.f117598w0.contains(Integer.valueOf(i));
    }

    public final boolean shouldInterceptLoadError(WebView webView, int i, String str, String str2) {
        int i2;
        WebView webView2 = webView;
        String str3 = str;
        String str4 = str2;
        C87412m.m108594g(webView2, "webview");
        C87412m.m108594g(str3, "description");
        C87412m.m108594g(str4, "failingUrl");
        int i3 = 3;
        Log.m105921e(mo67703X(), "shouldInterceptLoadError, failingUrl = %s, errorCode = %d, desc = %s", str4, Integer.valueOf(i), str3);
        String S = mo67694S(getCurrentUrl());
        MMWebView mMWebView = this.f117553a;
        if (mMWebView == null) {
            i2 = 0;
        } else {
            if (mMWebView.isXWalkKernel()) {
                i3 = 2;
            }
            i2 = i3;
        }
        C30579m h0 = mo67724h0();
        int i0 = mo67726i0();
        if (h0.mo57489d()) {
            ((C119157j) C119157j.f356862d).mo183876g(new C30583n(str2, i, h0, str, S, i2, i0), "MicroMsg.WebPageErrorMonitor");
        }
        for (C43505b0 g : this.f117545S) {
            if (g.mo62379g(webView2, i, str3, str4)) {
                return true;
            }
        }
        int i4 = i;
        return super.shouldInterceptLoadError(webView, i, str, str2);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest, Bundle bundle) {
        C87412m.m108594g(webView, "webview");
        C87412m.m108594g(webResourceRequest, "request");
        WebResourceResponse w0 = mo67753w0(webView, webResourceRequest, bundle);
        return w0 == null ? super.shouldInterceptRequest(webView, webResourceRequest, bundle) : w0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0070, code lost:
        if (r4 == false) goto L_0x0073;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean shouldOverrideUrlLoading(com.tencent.xweb.WebView r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.String r0 = "view"
            gy3.C87412m.m108594g(r4, r0)
            java.lang.String r0 = "url"
            gy3.C87412m.m108594g(r5, r0)
            java.lang.String r0 = r3.mo67703X()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "shouldOverrideUrlLoading: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            java.lang.String r0 = r3.mo67703X()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "doShouldOverrideUrlLoading url:"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r1)
            boolean r4 = r3.mo67689P0(r4, r5)
            r0 = 0
            r1 = 1
            if (r4 == 0) goto L_0x0046
        L_0x0044:
            r0 = 1
            goto L_0x0073
        L_0x0046:
            int r4 = r3.mo67700V(r5)
            r2 = 2
            if (r4 != r2) goto L_0x004f
            r4 = 1
            goto L_0x0050
        L_0x004f:
            r4 = 0
        L_0x0050:
            boolean r4 = r3.mo63676Y0(r5, r4)
            if (r4 == 0) goto L_0x0073
            e00.t$b r4 = r3.f117555b
            boolean r4 = r4.f123183e
            if (r4 != 0) goto L_0x006f
            int r4 = r3.mo67700V(r5)
            if (r4 == 0) goto L_0x006a
            if (r4 == r2) goto L_0x006a
            r2 = 8
            if (r4 == r2) goto L_0x006a
            r4 = 0
            goto L_0x006b
        L_0x006a:
            r4 = 1
        L_0x006b:
            if (r4 == 0) goto L_0x006f
            r4 = 1
            goto L_0x0070
        L_0x006f:
            r4 = 0
        L_0x0070:
            if (r4 == 0) goto L_0x0073
            goto L_0x0044
        L_0x0073:
            if (r0 != 0) goto L_0x007e
            com.tencent.mm.plugin.webview.core.k r4 = new com.tencent.mm.plugin.webview.core.k
            r4.<init>()
            r3.f117550X = r4
            r3.f117597w = r5
        L_0x007e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.core.BaseWebViewController.shouldOverrideUrlLoading(com.tencent.xweb.WebView, java.lang.String):boolean");
    }

    /* renamed from: t0 */
    public void mo63684t0() {
        if (((C87790d) C86312j.m106911c(C87790d.class)).isInstalled(XWalkEnvironment.MODULE_APPBRAND)) {
            mo67679J(new C45562a());
            mo67679J(new C44454s());
        }
        this.f117553a.setWebViewClient(this);
        MMWebView mMWebView = this.f117553a;
        WebSettings settings = mMWebView.getSettings();
        settings.setJavaScriptEnabled(((Boolean) ((C36570n) this.f117555b.f123179a.f123187b).getValue()).booleanValue());
        settings.setDomStorageEnabled(true);
        settings.setBuiltInZoomControls(((Boolean) ((C36570n) this.f117555b.f123179a.f123186a).getValue()).booleanValue());
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setSavePassword(false);
        settings.setSaveFormData(false);
        settings.setGeolocationEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setMixedContentMode(0);
        settings.setAppCacheMaxSize(10485760);
        settings.setAppCachePath(mMWebView.getContext().getDir("webviewcache", 0).getAbsolutePath());
        settings.setAppCacheEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setDatabasePath(C112760b.m154216X() + "databases/");
        settings.setAllowFileAccess(true);
        String userAgentString = settings.getUserAgentString();
        C87412m.m108593f(userAgentString, "currentUa");
        if (!C112550d0.m153801u(userAgentString, " MicroMessenger/", false)) {
            C46574u.C46575a aVar = (C46574u.C46575a) C89909e.m112436a(C46574u.C46575a.class);
            if (aVar == null) {
                aVar = new C40490e(mMWebView.getContext());
            }
            C45596j.C45597b bVar = C45596j.f123315f;
            ((MultiProcessMMKV) ((C36570n) C45596j.f123316g).getValue()).putString("key_web_prefetch_ua", userAgentString);
            String a = C46574u.m51897a(mMWebView.getContext(), userAgentString, aVar);
            mo67720g0().f129997b = a;
            settings.setUserAgentString(a);
        }
        if (!((Boolean) ((C36570n) this.f117555b.f123179a.f123188c).getValue()).booleanValue()) {
            mMWebView.setVerticalScrollBarEnabled(false);
            mMWebView.setHorizontalScrollBarEnabled(false);
        }
        CookieManager.getInstance().setAcceptCookie(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(mMWebView, true);
        Object systemService = mMWebView.getContext().getSystemService("window");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        WindowManager windowManager = (WindowManager) systemService;
        try {
            Field declaredField = WebView.class.getDeclaredField("mWebViewCore").getType().getDeclaredField("mBrowserFrame").getType().getDeclaredField("sConfigCallback");
            declaredField.setAccessible(true);
            Object obj = declaredField.get((Object) null);
            if (obj != null) {
                Field declaredField2 = declaredField.getType().getDeclaredField("mWindowManager");
                declaredField2.setAccessible(true);
                declaredField2.set(obj, windowManager);
            }
        } catch (Exception unused) {
        }
        MMWebView mMWebView2 = this.f117553a;
        if (mMWebView2.f122355e) {
            String url = mMWebView2.getUrl();
            if (url == null) {
                url = "";
            }
            mo67697T0(url);
        }
        MMWebView mMWebView3 = this.f117553a;
        ((HashSet) mMWebView3.f122360j).add(this.f117551Y);
        C45605v vVar = this.f117569i;
        if (vVar != null) {
            vVar.f123365h = System.currentTimeMillis();
        }
        this.f117543Q.mo73829a("onTryBindServiceStart", System.currentTimeMillis());
        Log.m105924i(mo67703X(), "WebView-Trace tryBindService");
        C43510e0.f117642a.mo67793a(true, mo67742p0(), new C43479b(new WeakReference(this)));
        this.f117543Q.mo73829a("onTryBindServiceEnd", System.currentTimeMillis());
    }

    /* renamed from: u0 */
    public final void mo67751u0(String str) {
        C87412m.m108594g(str, "url");
        try {
            if (mo67731m().mo68094Fu()) {
                mo67668C0(((C52572q0) C86312j.m106911c(C52572q0.class)).mo71616fj(mo67707a0(), mo67731m(), str));
            }
        } catch (Exception e) {
            String X = mo67703X();
            Log.m105928w(X, "initFont, ex = " + e.getMessage());
        }
    }

    /* renamed from: v0 */
    public final void mo67752v0(Intent intent, long j, long j2, boolean z, String str) {
        C45604u uVar = this.f117543Q;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        uVar.getClass();
        uVar.f123348o = str;
        C45604u uVar2 = this.f117543Q;
        uVar2.f123349p = z;
        String valueOf = String.valueOf(mo67719g());
        uVar2.getClass();
        C87412m.m108594g(valueOf, "controllerId");
        uVar2.f123354u = valueOf;
        uVar2.f123352s = j;
        uVar2.f123355v = j2;
        uVar2.f123350q = j <= 0 ? C46206e.C46207a.None : C86709a0.m107531m().mo58407a().f124992e.f125000h - j > 0 ? C46206e.C46207a.ColdBoot : C46206e.C46207a.WarmBoot;
        uVar2.f123351r = C46206e.m51495b();
        uVar2.mo73829a("onCreate", uVar2.f123355v);
        Log.m105924i("MicroMsg.WebViewPerformanceHelper", "initPerformanceHelper#" + valueOf + " start: " + j + ", create: " + j2 + ", reCreateUI: " + uVar2.f123349p + ", processBootType: " + uVar2.f123350q);
        C45604u uVar3 = this.f117543Q;
        int i = 0;
        if (intent != null) {
            i = intent.getIntExtra("KPageScene", 0);
        }
        uVar3.f123357x = i;
        C45604u uVar4 = this.f117543Q;
        String stringExtra = intent != null ? intent.getStringExtra("KPageInfo") : null;
        if (stringExtra != null) {
            str2 = stringExtra;
        }
        uVar4.getClass();
        uVar4.f123356w = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x012e, code lost:
        r10 = r10.toString();
     */
    /* renamed from: w0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.xweb.WebResourceResponse mo67753w0(com.tencent.xweb.WebView r19, com.tencent.xweb.WebResourceRequest r20, android.os.Bundle r21) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            r3 = r20
            r0 = r21
            java.lang.String r4 = "webView"
            gy3.C87412m.m108594g(r2, r4)
            java.lang.String r4 = "request"
            gy3.C87412m.m108594g(r3, r4)
            java.lang.String r4 = r18.mo67703X()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "shouldInterceptRequest, url = "
            r5.append(r6)
            android.net.Uri r6 = r20.getUrl()
            r5.append(r6)
            java.lang.String r6 = ", method = "
            r5.append(r6)
            java.lang.String r6 = r20.getMethod()
            r5.append(r6)
            java.lang.String r6 = ", isForMainFrame = "
            r5.append(r6)
            boolean r6 = r20.isForMainFrame()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            android.net.Uri r4 = r20.getUrl()
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "request.url.toString()"
            gy3.C87412m.m108593f(r4, r5)
            boolean r5 = r1.mo67696T(r4)
            r6 = 0
            if (r5 == 0) goto L_0x005c
            return r6
        L_0x005c:
            r5 = 1
            r7 = 0
            if (r0 == 0) goto L_0x00f5
            java.lang.String r8 = "resourceType"
            int r0 = r0.getInt(r8)     // Catch:{ Exception -> 0x00d8, all -> 0x00ba }
            if (r0 == r5) goto L_0x006d
            r8 = 7
            if (r0 == r8) goto L_0x006d
            goto L_0x00f5
        L_0x006d:
            java.lang.String r8 = r18.mo67703X()     // Catch:{ Exception -> 0x00d8, all -> 0x00ba }
            java.lang.String r9 = "get resoutce type is iframe : %d, start geta8key"
            java.lang.Object[] r10 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x00d8, all -> 0x00ba }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x00d8, all -> 0x00ba }
            r10[r7] = r0     // Catch:{ Exception -> 0x00d8, all -> 0x00ba }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r9, r10)     // Catch:{ Exception -> 0x00d8, all -> 0x00ba }
            d93.c r0 = r18.mo67698U()     // Catch:{ Exception -> 0x00d8, all -> 0x00ba }
            java.lang.String r8 = r18.getCurrentUrl()     // Catch:{ Exception -> 0x00d8, all -> 0x00ba }
            r0.getClass()     // Catch:{ Exception -> 0x00d8, all -> 0x00ba }
            java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x00d8, all -> 0x00ba }
            r9[r7] = r8     // Catch:{ Exception -> 0x00d8, all -> 0x00ba }
            java.lang.String r10 = "MicroMsg.LuggageGetA8Key"
            java.lang.String r11 = "setOuterUrlForIframe(%s)"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r11, r9)     // Catch:{ Exception -> 0x00d8, all -> 0x00ba }
            r0.f122701r = r8     // Catch:{ Exception -> 0x00d8, all -> 0x00ba }
            r0 = 5
            r1.mo67706Z0(r4, r7, r0)     // Catch:{ Exception -> 0x00d8, all -> 0x00ba }
            e00.t$b r0 = r1.f117555b     // Catch:{ Exception -> 0x00d8, all -> 0x00ba }
            boolean r0 = r0.f123185g     // Catch:{ Exception -> 0x00d8, all -> 0x00ba }
            if (r0 == 0) goto L_0x00f5
            java.util.ArrayList<java.lang.String> r0 = com.tencent.p014mm.plugin.webview.modeltools.C43757o.f118236a     // Catch:{ Exception -> 0x00d8, all -> 0x00ba }
            if (r0 != 0) goto L_0x00ab
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x00d8, all -> 0x00ba }
            r0.<init>()     // Catch:{ Exception -> 0x00d8, all -> 0x00ba }
            com.tencent.p014mm.plugin.webview.modeltools.C43757o.f118236a = r0     // Catch:{ Exception -> 0x00d8, all -> 0x00ba }
        L_0x00ab:
            java.util.ArrayList<java.lang.String> r0 = com.tencent.p014mm.plugin.webview.modeltools.C43757o.f118236a     // Catch:{ Exception -> 0x00d8, all -> 0x00ba }
            boolean r0 = r0.contains(r4)     // Catch:{ Exception -> 0x00d8, all -> 0x00ba }
            if (r0 == 0) goto L_0x00b4
            goto L_0x00f5
        L_0x00b4:
            java.util.ArrayList<java.lang.String> r0 = com.tencent.p014mm.plugin.webview.modeltools.C43757o.f118236a     // Catch:{ Exception -> 0x00d8, all -> 0x00ba }
            r0.add(r4)     // Catch:{ Exception -> 0x00d8, all -> 0x00ba }
            goto L_0x00f5
        L_0x00ba:
            r0 = move-exception
            java.lang.String r4 = r18.mo67703X()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "get resource type failed Throwable ; "
            r8.append(r9)
            java.lang.String r0 = r0.getMessage()
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
            goto L_0x00f5
        L_0x00d8:
            r0 = move-exception
            java.lang.String r4 = r18.mo67703X()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "get resource type failed Exception ; "
            r8.append(r9)
            java.lang.String r0 = r0.getMessage()
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
        L_0x00f5:
            java.util.concurrent.ConcurrentLinkedDeque<com.tencent.mm.plugin.webview.core.b0> r0 = r1.f117545S
            java.util.Iterator r0 = r0.iterator()
        L_0x00fb:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x010e
            java.lang.Object r4 = r0.next()
            com.tencent.mm.plugin.webview.core.b0 r4 = (com.tencent.p014mm.plugin.webview.core.C43505b0) r4
            com.tencent.xweb.WebResourceResponse r4 = r4.mo62378f(r2, r3)
            if (r4 == 0) goto L_0x00fb
            return r4
        L_0x010e:
            rx3.g r0 = r1.f117533H0
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0185
            java.lang.String[] r0 = f117517K0
            r2 = 4
            r4 = 0
            r8 = 0
        L_0x0123:
            if (r4 >= r2) goto L_0x0185
            r9 = r0[r4]
            int r8 = r8 + r5
            android.net.Uri r10 = r20.getUrl()
            if (r10 == 0) goto L_0x013c
            java.lang.String r10 = r10.toString()
            if (r10 == 0) goto L_0x013c
            boolean r10 = z04.C112551y.m153819s(r10, r9, r7)
            if (r10 != r5) goto L_0x013c
            r10 = 1
            goto L_0x013d
        L_0x013c:
            r10 = 0
        L_0x013d:
            if (r10 == 0) goto L_0x0182
            java.lang.String r10 = r18.mo67703X()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "QuickAppInterceptor interceptor url = "
            r11.append(r12)
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r9)
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 1551(0x60f, double:7.663E-321)
            long r14 = (long) r8
            r16 = 1
            r11.mo175913w(r12, r14, r16)
            rx3.g r9 = r1.f117535I0
            rx3.n r9 = (rx3.C36570n) r9
            java.lang.Object r9 = r9.getValue()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0182
            java.lang.String r0 = r18.mo67703X()
            java.lang.String r2 = "QuickAppInterceptor interceptor WebResourceResponse"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            com.tencent.xweb.WebResourceResponse r0 = new com.tencent.xweb.WebResourceResponse
            java.lang.String r2 = ""
            r0.<init>(r2, r6, r6)
            return r0
        L_0x0182:
            int r4 = r4 + 1
            goto L_0x0123
        L_0x0185:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.core.BaseWebViewController.mo67753w0(com.tencent.xweb.WebView, com.tencent.xweb.WebResourceRequest, android.os.Bundle):com.tencent.xweb.WebResourceResponse");
    }

    /* renamed from: x */
    public void mo67754x(String str, Map<String, String> map, boolean z) {
        C87412m.m108594g(str, "url");
        String X = mo67703X();
        Log.m105924i(X, "WebView-Trace loadUrl#" + mo67719g() + " url " + str);
        this.f117543Q.mo73829a("clientLoadUrl", System.currentTimeMillis());
        boolean z2 = true;
        if (z) {
            this.f117553a.loadUrl(str, C90364q0.m113146e(new C13604l("Pragma", "no-cache"), new C13604l("Cache-Control", "no-cache")));
            return;
        }
        if (map != null && !map.isEmpty()) {
            z2 = false;
        }
        if (z2) {
            this.f117553a.loadUrl(str);
        } else {
            this.f117553a.loadUrl(str, map);
        }
    }

    /* renamed from: x0 */
    public final C43505b0.C43506a mo67755x0(WebView webView, String str) {
        C87412m.m108594g(webView, "webView");
        C87412m.m108594g(str, "url");
        for (C43505b0 r : this.f117545S) {
            C43505b0.C43506a r2 = r.mo62382r(webView, str);
            if (r2.f117638a) {
                return r2;
            }
        }
        return new C43505b0.C43506a(false, false);
    }

    /* renamed from: y */
    public synchronized void mo67756y(C43558z zVar) {
        C87412m.m108594g(zVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        if (this.f117547U.contains(zVar)) {
            this.f117547U.remove(zVar);
        }
    }

    /* renamed from: y0 */
    public final boolean mo67757y0() {
        return this.f117532H || this.f117530G;
    }

    /* renamed from: z */
    public int mo67758z() {
        return 0;
    }

    /* renamed from: z0 */
    public boolean mo63685z0() {
        return mo67748s0(this.f117560d0) && C87412m.m108589b(this.f117518A, this.f117522C);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        C87412m.m108594g(webView, "webview");
        C87412m.m108594g(webResourceRequest, "request");
        WebResourceResponse w0 = mo67753w0(webView, webResourceRequest, (Bundle) null);
        return w0 == null ? super.shouldInterceptRequest(webView, webResourceRequest) : w0;
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b%\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006J\u001e\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u00062\u0006\u0010\u000b\u001a\u00020\nR\u001a\u0010\f\u001a\u00020\u00048\u0016XD¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/core/BaseWebViewController$WebAction;", "", "", "status", "", "waitFor", "Lny3/d;", "Lcom/tencent/mm/plugin/webview/core/BaseWebViewController$ControllerAction;", "clazz", "Lcom/tencent/mm/plugin/webview/core/BaseWebViewController$PageAction;", "", "url", "keep", "Z", "getKeep", "()Z", "Lcom/tencent/mm/plugin/webview/core/BaseWebViewController;", "controller", "Lcom/tencent/mm/plugin/webview/core/BaseWebViewController;", "getController", "()Lcom/tencent/mm/plugin/webview/core/BaseWebViewController;", "setController", "(Lcom/tencent/mm/plugin/webview/core/BaseWebViewController;)V", "<init>", "()V", "webview-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.webview.core.BaseWebViewController$WebAction */
    public static abstract class WebAction {
        public BaseWebViewController controller;
        private final boolean keep;

        public final BaseWebViewController getController() {
            BaseWebViewController baseWebViewController = this.controller;
            if (baseWebViewController != null) {
                return baseWebViewController;
            }
            C87412m.m108603p("controller");
            throw null;
        }

        public boolean getKeep() {
            return this.keep;
        }

        public final void setController(BaseWebViewController baseWebViewController) {
            C87412m.m108594g(baseWebViewController, "<set-?>");
            this.controller = baseWebViewController;
        }

        public final boolean waitFor(int i) {
            return getController().f117598w0.contains(Integer.valueOf(i));
        }

        public final boolean waitFor(C25235d<? extends ControllerAction> dVar) {
            C87412m.m108594g(dVar, "clazz");
            return getController().f117602y0.contains(dVar.mo51264h());
        }

        public final boolean waitFor(C25235d<? extends PageAction> dVar, String str) {
            C87412m.m108594g(dVar, "clazz");
            C87412m.m108594g(str, "url");
            return C87412m.m108589b(str, getController().f117520B) && getController().f117600x0.contains(dVar.mo51264h());
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        C43505b0.C43506a aVar;
        boolean z = false;
        if (webResourceRequest == null || webView == null) {
            return false;
        }
        Iterator<C43505b0> it = this.f117545S.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = new C43505b0.C43506a(false, false);
                break;
            }
            aVar = it.next().mo62381q(webView, webResourceRequest);
            if (aVar.f117638a) {
                break;
            }
        }
        if (aVar.f117638a) {
            z = aVar.f117639b;
        }
        if (!z) {
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        return true;
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        int i;
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (webResourceRequest != null && webResourceError != null && !C11171e.m11044a(23)) {
            int errorCode = webResourceError.getErrorCode();
            CharSequence description = webResourceError.getDescription();
            String obj = description != null ? description.toString() : null;
            Uri url = webResourceRequest.getUrl();
            String uri = url != null ? url.toString() : null;
            String X = mo67703X();
            Log.m105924i(X, "WebView-Trace onReceivedError#" + mo67719g() + ", errCode:" + errorCode + ", description:" + obj + ", failingUrl:" + uri);
            if (!mo67748s0(this.f117558c0)) {
                Log.m105924i(mo67703X(), "onReceivedError, intent not ready");
                return;
            }
            if (mo67748s0(this.f117556b0)) {
                C30579m h0 = mo67724h0();
                String S = mo67694S(getCurrentUrl());
                MMWebView mMWebView = this.f117553a;
                if (mMWebView == null) {
                    i = 0;
                } else {
                    i = mMWebView.isXWalkKernel() ? 2 : 3;
                }
                h0.mo57488c(errorCode, obj, uri, S, i, mo67726i0(), webResourceRequest.isForMainFrame());
            }
            for (C43519u uVar : this.f117546T) {
                if (mo67666A0()) {
                    uVar.mo64755f(webView, webResourceRequest, webResourceError);
                }
            }
        }
    }
}
