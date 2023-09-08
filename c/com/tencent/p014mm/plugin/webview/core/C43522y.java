package com.tencent.p014mm.plugin.webview.core;

import a70.C112760b;
import android.app.Dialog;
import android.app.Service;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import b93.C0258b;
import b93.C39746d;
import ca3.C39935f;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.opensdk.channel.MMessageActV2;
import com.tencent.p014mm.opensdk.modelbiz.OpenWebview;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.p136ui.tools.C7007c1;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.plugin.webview.core.C43505b0;
import com.tencent.p014mm.plugin.webview.core.C43520v;
import com.tencent.p014mm.plugin.webview.model.C43692a;
import com.tencent.p014mm.plugin.webview.model.C43699e2;
import com.tencent.p014mm.plugin.webview.model.C43703h1;
import com.tencent.p014mm.plugin.webview.model.C43704h2;
import com.tencent.p014mm.plugin.webview.model.C43724p0;
import com.tencent.p014mm.plugin.webview.model.C43725q1;
import com.tencent.p014mm.plugin.webview.model.C43731w1;
import com.tencent.p014mm.plugin.webview.model.C43733x1;
import com.tencent.p014mm.plugin.webview.model.C85523o0;
import com.tencent.p014mm.plugin.webview.model.C85538q0;
import com.tencent.p014mm.plugin.webview.modeltools.C43748c0;
import com.tencent.p014mm.plugin.webview.modeltools.C43757o;
import com.tencent.p014mm.plugin.webview.p128ui.tools.C43976g;
import com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1;
import com.tencent.p014mm.plugin.webview.p128ui.tools.C44130p1;
import com.tencent.p014mm.plugin.webview.p128ui.tools.C6594r1;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUIStyleHelper;
import com.tencent.p014mm.plugin.webview.p128ui.tools.floatball.C43860c;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44339m0;
import com.tencent.p014mm.plugin.webview.stub.C43787d;
import com.tencent.p014mm.plugin.webview.stub.C43791l;
import com.tencent.p014mm.plugin.webview.stub.WebViewStubService;
import com.tencent.p014mm.pluginsdk.model.app.C44580q1;
import com.tencent.p014mm.pluginsdk.model.app.C72688j0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C44625c2;
import com.tencent.p014mm.protocal.GeneralControlWrapper;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.QueueWorkerThread;
import com.tencent.p014mm.sdk.platformtools.StringKtKt;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.tav.coremedia.TimeUtil;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.SslErrorHandler;
import com.tencent.xweb.WebView;
import com.tencent.xweb.XWebSdk;
import d93.C45298c;
import di3.C86312j;
import e00.C45520t;
import ea3.C45603t;
import ea3.C45604u;
import ea3.C45605v;
import ea3.C45606x;
import ea3.C7608b;
import ex0.C45696d;
import f40.C86709a0;
import f93.C45764a;
import f93.C45765b;
import f93.C45766c;
import f93.C45767f;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C45984j0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import i83.C46196s;
import i93.C46206e;
import i93.C8866a;
import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import junit.framework.Assert;
import k93.C46658a;
import k93.C46659d;
import k93.C46660e;
import k93.C46661f;
import k93.C9572b;
import k93.C9573c;
import ke3.C88144b;
import kg3.C76577a;
import kw0.C46746a;
import nj3.C76879j;
import ob0.C47350c;
import org.json.JSONArray;
import org.json.JSONObject;
import org.xwalk.core.XWalkEnvironment;
import p167hz.C46138l;
import p206nj.C117627q;
import p225rc.C12969d;
import p225rc.C89925n;
import p237sp.C48455p;
import p763ym.C79138l;
import p823sg.C77710q;
import qo3.C89779i0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import s83.C48292d;
import sj0.C90210f;
import sx3.C110818d0;
import sx3.C13801s0;
import sx3.C64187h0;
import sx3.C64197v;
import sx3.C90364q0;
import t83.C13851h1;
import t83.C13853i;
import t83.C13864v;
import t83.C36979g1;
import t83.C48590l;
import te3.C49082d20;
import te3.C50914q43;
import te3.C51874wt1;
import te3.C52018xt1;
import te3.C90433r43;
import v83.C52806b;
import w93.C53094h;
import wc3.C90945m;
import x83.C53298a;
import z04.C112550d0;
import z04.C112551y;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.webview.core.y */
public class C43522y extends BaseWebViewController {

    /* renamed from: A1 */
    public final C43541l f117667A1;

    /* renamed from: B1 */
    public final C43527c f117668B1;

    /* renamed from: C1 */
    public long f117669C1;

    /* renamed from: D1 */
    public final C43531e f117670D1;

    /* renamed from: E1 */
    public final C43535g f117671E1;

    /* renamed from: L0 */
    public final C43704h2 f117672L0;

    /* renamed from: M0 */
    public final C13601g f117673M0;

    /* renamed from: N0 */
    public final C13601g f117674N0;

    /* renamed from: O0 */
    public C43977g1 f117675O0;

    /* renamed from: P0 */
    public WebViewUIStyleHelper f117676P0;

    /* renamed from: Q0 */
    public C39935f f117677Q0;

    /* renamed from: R0 */
    public final C43860c f117678R0;

    /* renamed from: S0 */
    public C46196s f117679S0;

    /* renamed from: T0 */
    public C46658a f117680T0;

    /* renamed from: U0 */
    public final C13601g f117681U0;

    /* renamed from: V0 */
    public final C13601g f117682V0;

    /* renamed from: W0 */
    public final C13601g f117683W0;

    /* renamed from: X0 */
    public final C13601g f117684X0;

    /* renamed from: Y0 */
    public final C43725q1 f117685Y0;

    /* renamed from: Z0 */
    public final C13601g f117686Z0;

    /* renamed from: a1 */
    public boolean f117687a1;

    /* renamed from: b1 */
    public final C13601g f117688b1;

    /* renamed from: c1 */
    public String f117689c1;

    /* renamed from: d1 */
    public final C13601g f117690d1;

    /* renamed from: e1 */
    public boolean f117691e1;

    /* renamed from: f1 */
    public boolean f117692f1;

    /* renamed from: g1 */
    public final String f117693g1;

    /* renamed from: h1 */
    public final Set<String> f117694h1;

    /* renamed from: i1 */
    public final C13601g f117695i1;

    /* renamed from: j1 */
    public final C85523o0.C85537c f117696j1;

    /* renamed from: k1 */
    public C43549r f117697k1;

    /* renamed from: l1 */
    public long f117698l1;

    /* renamed from: m1 */
    public final List<C53298a> f117699m1;

    /* renamed from: n1 */
    public final C43556y f117700n1;

    /* renamed from: o1 */
    public final C43538i f117701o1;

    /* renamed from: p1 */
    public final C43529d f117702p1;

    /* renamed from: q1 */
    public final C43539j f117703q1;

    /* renamed from: r1 */
    public final C43540k f117704r1;

    /* renamed from: s1 */
    public final C43523a f117705s1;

    /* renamed from: t1 */
    public String f117706t1;

    /* renamed from: u1 */
    public final boolean f117707u1;

    /* renamed from: v1 */
    public final C43545o f117708v1;

    /* renamed from: w1 */
    public final C43537h f117709w1;

    /* renamed from: x1 */
    public final C43544n f117710x1;

    /* renamed from: y1 */
    public final C43533f f117711y1;

    /* renamed from: z1 */
    public final C43525b f117712z1;

    /* renamed from: com.tencent.mm.plugin.webview.core.y$a */
    public static final class C43523a implements C53298a {

        /* renamed from: a */
        public final /* synthetic */ C43522y f117713a;

        public C43523a(C43522y yVar) {
            this.f117713a = yVar;
        }

        /* renamed from: b */
        public boolean mo67829b(String str) {
            C87412m.m108594g(str, "url");
            if (!this.f117713a.f117539M.mo70859b().mo69430b()) {
                Log.m105921e(this.f117713a.mo67822t1(), "ActivityJumpHandler not allow, no inner url generalcontrol, url = %s", str);
                return true;
            }
            try {
                this.f117713a.mo67731m().mo68143nO(str, this.f117713a.f117539M.mo70860c().mo69447f(7));
            } catch (Exception e) {
                String t1 = this.f117713a.mo67822t1();
                Log.m105928w(t1, "ActivityJumpHandler, ex = " + e.getMessage());
            }
            return true;
        }

        /* renamed from: e */
        public boolean mo67830e(String str) {
            C87412m.m108594g(str, "url");
            if (Util.isNullOrNil(str)) {
                return false;
            }
            QueueWorkerThread queueWorkerThread = C44625c2.f121005a;
            return C89925n.m112490c(str, "weixin://jump/");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.y$a0 */
    public static final class C43524a0 implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f117714d;

        /* renamed from: e */
        public final /* synthetic */ int f117715e;

        /* renamed from: f */
        public final /* synthetic */ String f117716f;

        /* renamed from: g */
        public final /* synthetic */ C43522y f117717g;

        public C43524a0(String str, int i, String str2, C43522y yVar) {
            this.f117714d = str;
            this.f117715e = i;
            this.f117716f = str2;
            this.f117717g = yVar;
        }

        public final void run() {
            String str;
            C115669n nVar = C115669n.INSTANCE;
            Object[] objArr = new Object[4];
            objArr[0] = this.f117714d;
            objArr[1] = Integer.valueOf(this.f117715e);
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            objArr[2] = NetStatusUtil.isWifi(context) ? "wifi" : NetStatusUtil.is5G(context) ? "5g" : NetStatusUtil.is4G(context) ? "4g" : NetStatusUtil.is3G(context) ? "3g" : NetStatusUtil.is2G(context) ? "2g" : "none";
            C43522y yVar = this.f117717g;
            String str2 = this.f117716f;
            StringBuilder sb = new StringBuilder();
            try {
                InetAddress[] allByName = InetAddress.getAllByName(str2);
                if (allByName != null && allByName.length > 0) {
                    for (InetAddress hostAddress : allByName) {
                        sb.append(hostAddress.getHostAddress());
                        sb.append(";");
                    }
                }
                str = sb.toString();
            } catch (UnknownHostException e) {
                Log.printErrStackTrace(yVar.mo67822t1(), e, "dnsIps", new Object[0]);
                str = null;
            }
            objArr[3] = str;
            nVar.mo160131h(17082, objArr);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.y$b */
    public static final class C43525b implements C53298a {

        /* renamed from: a */
        public final /* synthetic */ C43522y f117718a;

        public C43525b(C43522y yVar) {
            this.f117718a = yVar;
        }

        /* renamed from: b */
        public boolean mo67829b(String str) {
            C87412m.m108594g(str, "url");
            if (!this.f117718a.f117539M.mo70860c().mo69447f(5)) {
                Log.m105920e(this.f117718a.mo67822t1(), "AddFriendHandler, permission fail");
                return true;
            }
            String substring = str.substring(19);
            C87412m.m108593f(substring, "this as java.lang.String).substring(startIndex)");
            if (Util.isNullOrNil(substring)) {
                return false;
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("from_webview", true);
            bundle.putString("userName", substring);
            try {
                this.f117718a.mo67731m().mo68145pG(8, bundle, this.f117718a.mo67719g());
            } catch (Exception e) {
                String t1 = this.f117718a.mo67822t1();
                Log.m105928w(t1, "AddFriendHandler, ex = " + e.getMessage());
            }
            return true;
        }

        /* renamed from: e */
        public boolean mo67830e(String str) {
            C87412m.m108594g(str, "url");
            if (Util.isNullOrNil(str)) {
                return false;
            }
            QueueWorkerThread queueWorkerThread = C44625c2.f121005a;
            return C89925n.m112490c(str, "weixin://addfriend/");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.y$b0 */
    public static final class C43526b0 implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C43522y f117719d;

        /* renamed from: e */
        public final /* synthetic */ int f117720e;

        public C43526b0(C43522y yVar, int i) {
            this.f117719d = yVar;
            this.f117720e = i;
        }

        public final void run() {
            C48590l g0 = this.f117719d.mo67720g0();
            int i = this.f117720e;
            if (!g0.f130003h) {
                Log.m105920e("MicroMsg.JsApiHandler", "onFontSizeChanged fail, not ready");
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("fontSize", String.valueOf(i));
                String c = C13851h1.C13852a.m13143c("menu:setfont", hashMap, g0.f130011p, g0.f130012q);
                MMWebView mMWebView = g0.f129996a;
                mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + c + ")", (ValueCallback<String>) null);
            }
            C43522y yVar = this.f117719d;
            int i2 = this.f117720e;
            Iterator<C43558z> it = yVar.f117547U.iterator();
            while (it.hasNext()) {
                it.next().mo67852g(i2);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.y$c */
    public static final class C43527c implements C53298a {

        /* renamed from: a */
        public final /* synthetic */ C43522y f117721a;

        public C43527c(C43522y yVar) {
            this.f117721a = yVar;
        }

        /* renamed from: b */
        public boolean mo67829b(String str) {
            C87412m.m108594g(str, "url");
            if (!this.f117721a.f117539M.mo70860c().mo69447f(17)) {
                Log.m105920e(this.f117721a.mo67822t1(), "close window permission fail");
                return true;
            }
            this.f117721a.mo67674G0();
            return true;
        }

        /* renamed from: e */
        public boolean mo67830e(String str) {
            C87412m.m108594g(str, "url");
            if (Util.isNullOrNil(str)) {
                return false;
            }
            QueueWorkerThread queueWorkerThread = C44625c2.f121005a;
            return C89925n.m112490c(str, "weixin://webview/close/");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.y$c0 */
    public static final class C43528c0 extends C87413o implements C32224a<C43748c0> {

        /* renamed from: d */
        public static final C43528c0 f117722d = new C43528c0();

        public C43528c0() {
            super(0);
        }

        public Object invoke() {
            return new C43748c0();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.y$d */
    public static final class C43529d implements C53298a {

        /* renamed from: a */
        public final /* synthetic */ C43522y f117723a;

        public C43529d(C43522y yVar) {
            this.f117723a = yVar;
        }

        /* renamed from: b */
        public boolean mo67829b(String str) {
            C87412m.m108594g(str, "url");
            C115669n.INSTANCE.idkeyStat(405, 25, 1, true);
            C43522y.m47162i1(this.f117723a, 1);
            return true;
        }

        /* renamed from: e */
        public boolean mo67830e(String str) {
            C87412m.m108594g(str, "url");
            if (Util.isNullOrNil(str)) {
                return false;
            }
            QueueWorkerThread queueWorkerThread = C44625c2.f121005a;
            return C89925n.m112490c(str, "weixin://critical_update/");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.y$d0 */
    public static final class C43530d0 extends C87413o implements C32224a<C43542m> {

        /* renamed from: d */
        public final /* synthetic */ C43522y f117724d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43530d0(C43522y yVar) {
            super(0);
            this.f117724d = yVar;
        }

        public Object invoke() {
            return new C43542m(new WeakReference(this.f117724d));
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.y$e */
    public static final class C43531e implements C53298a {

        /* renamed from: a */
        public final /* synthetic */ C43522y f117725a;

        /* renamed from: b */
        public final /* synthetic */ MMWebView f117726b;

        public C43531e(C43522y yVar, MMWebView mMWebView) {
            this.f117725a = yVar;
            this.f117726b = mMWebView;
        }

        /* renamed from: b */
        public boolean mo67829b(String str) {
            C87412m.m108594g(str, "urlOrig");
            C43522y yVar = this.f117725a;
            String stringExtra = yVar.mo67715e0().getStringExtra("sentUsername");
            String str2 = "";
            if (stringExtra == null) {
                stringExtra = str2;
            }
            int k0 = yVar.mo67729k0(Util.nullAsNil(stringExtra));
            String s = C90945m.m114069s(str);
            if (!C90945m.m114065o(s, this.f117725a.f117669C1)) {
                return false;
            }
            try {
                if (C87412m.m108589b("weixin://dl/shopping", s)) {
                    String Oa = this.f117725a.mo67731m().mo68103Oa();
                    C87412m.m108593f(Oa, "invoker.getJDUrl()");
                    if (!Util.isNullOrNil(Oa)) {
                        C45520t.C45521a.m50512a(this.f117725a, Oa, (Map) null, false, 6, (Object) null);
                    }
                } else if (C87412m.m108589b("weixin://dl/faq", s)) {
                    int RT = this.f117725a.mo67731m().mo68107RT();
                    int Wy = this.f117725a.mo67731m().mo68117Wy();
                    String string = MMApplicationContext.getContext().getString(C0966R.string.f361332j01, new Object[]{Integer.valueOf(RT), Integer.valueOf(Wy)});
                    C87412m.m108593f(string, "getContext().getString(c…otice_url, uin, newCount)");
                    C45520t.C45521a.m50512a(this.f117725a, string, (Map) null, false, 6, (Object) null);
                } else if (C87412m.m108589b("weixin://dl/posts", s)) {
                    this.f117725a.mo67731m().mo68137jN();
                } else if (C87412m.m108589b("weixin://dl/moments", s)) {
                    this.f117725a.mo67731m().mo68135ha();
                } else {
                    C87412m.m108593f(s, "url");
                    if (C112551y.m153819s(s, "weixin://dl/feedback", false)) {
                        C87412m.m108593f(this.f117725a.mo67731m().Dj0(s), "invoker.getFeedbackUrl(url)");
                    } else if (C87412m.m108589b("weixin://dl/scan", s)) {
                        C88144b.m109792j(this.f117725a.mo67707a0(), "scanner", ".ui.BaseScanUI", new Intent(), false);
                    } else {
                        C90945m.m114062l(this.f117726b.getActivityContextIfHas(), s);
                    }
                }
                ArrayList arrayList = new ArrayList();
                C87412m.m108593f(s, "url");
                arrayList.add(s);
                arrayList.add("1");
                arrayList.add(String.valueOf(k0));
                String stringExtra2 = this.f117725a.mo67715e0().getStringExtra("sentUsername");
                if (stringExtra2 != null) {
                    str2 = stringExtra2;
                }
                String nullAsNil = Util.nullAsNil(str2);
                C87412m.m108593f(nullAsNil, "nullAsNil(sentUsername)");
                arrayList.add(nullAsNil);
                String nullAsNil2 = Util.nullAsNil(this.f117725a.mo63683n0());
                C87412m.m108593f(nullAsNil2, "nullAsNil(rawUrl)");
                arrayList.add(nullAsNil2);
                C115669n.INSTANCE.mo160137l(11405, arrayList);
                return true;
            } catch (Exception e) {
                Log.m105921e(this.f117725a.mo67822t1(), "kv report fail, ex = %s", e.getMessage());
                return true;
            }
        }

        /* renamed from: e */
        public boolean mo67830e(String str) {
            C87412m.m108594g(str, "url");
            if (Util.isNullOrNil(str)) {
                return false;
            }
            QueueWorkerThread queueWorkerThread = C44625c2.f121005a;
            return C89925n.m112490c(str, "weixin://");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.y$e0 */
    public static final class C43532e0 extends C87413o implements C32224a<C43976g> {

        /* renamed from: d */
        public final /* synthetic */ MMWebView f117727d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43532e0(MMWebView mMWebView) {
            super(0);
            this.f117727d = mMWebView;
        }

        public Object invoke() {
            return new C43976g(this.f117727d.getActivityContextIfHas(), this.f117727d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.y$f */
    public static final class C43533f implements C53298a {

        /* renamed from: a */
        public final /* synthetic */ C43522y f117728a;

        public C43533f(C43522y yVar) {
            this.f117728a = yVar;
        }

        /* renamed from: b */
        public boolean mo67829b(String str) {
            C87412m.m108594g(str, "url");
            Bundle bundle = new Bundle();
            bundle.putInt("MMActivity.OverrideEnterAnimation", 0);
            bundle.putInt("MMActivity.OverrideExitAnimation", C0966R.C0968anim.f2469dt);
            try {
                this.f117728a.mo67731m().mo68145pG(7, bundle, this.f117728a.mo67719g());
                return true;
            } catch (Exception e) {
                String t1 = this.f117728a.mo67822t1();
                Log.m105928w(t1, "FeedbackJumpHandler, ex = " + e.getMessage());
                return true;
            }
        }

        /* renamed from: e */
        public boolean mo67830e(String str) {
            C87412m.m108594g(str, "url");
            if (Util.isNullOrNil(str)) {
                return false;
            }
            QueueWorkerThread queueWorkerThread = C44625c2.f121005a;
            return C89925n.m112490c(str, "weixin://feedback/");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.y$f0 */
    public static final class C43534f0 extends C87413o implements C32224a<Class<WebViewStubService>> {

        /* renamed from: d */
        public static final C43534f0 f117729d = new C43534f0();

        public C43534f0() {
            super(0);
        }

        public Object invoke() {
            return WebViewStubService.class;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.y$g */
    public static final class C43535g implements C53298a {

        /* renamed from: a */
        public final /* synthetic */ C43522y f117730a;

        public C43535g(C43522y yVar) {
            this.f117730a = yVar;
        }

        /* renamed from: b */
        public boolean mo67829b(String str) {
            C87412m.m108594g(str, "url");
            Log.m105928w(this.f117730a.mo67822t1(), "freewifi had Deprecated");
            return true;
        }

        /* renamed from: e */
        public boolean mo67830e(String str) {
            C87412m.m108594g(str, "url");
            if (Util.isNullOrNil(str)) {
                return false;
            }
            QueueWorkerThread queueWorkerThread = C44625c2.f121005a;
            return C89925n.m112490c(str, "weixin://connectToFreeWifi/");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.y$g0 */
    public static final class C43536g0 extends C87413o implements C32224a<C43546p> {

        /* renamed from: d */
        public final /* synthetic */ C43522y f117731d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43536g0(C43522y yVar) {
            super(0);
            this.f117731d = yVar;
        }

        public Object invoke() {
            C43522y yVar = this.f117731d;
            return new C43546p(yVar, yVar);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.y$h */
    public static final class C43537h implements C53298a {

        /* renamed from: a */
        public final /* synthetic */ C43522y f117732a;

        public C43537h(C43522y yVar) {
            this.f117732a = yVar;
        }

        /* renamed from: b */
        public boolean mo67829b(String str) {
            C87412m.m108594g(str, "url");
            if (Util.isNullOrNil(str)) {
                return false;
            }
            String substring = str.substring(17);
            C87412m.m108593f(substring, "this as java.lang.String).substring(startIndex)");
            String t1 = this.f117732a.mo67822t1();
            Log.m105924i(t1, "[oneliang]get html content :" + substring);
            C43522y yVar = this.f117732a;
            yVar.getClass();
            Iterator<C43558z> it = yVar.f117547U.iterator();
            while (it.hasNext()) {
                it.next().mo67859o(substring);
            }
            return false;
        }

        /* renamed from: e */
        public boolean mo67830e(String str) {
            C87412m.m108594g(str, "url");
            if (Util.isNullOrNil(str)) {
                return false;
            }
            QueueWorkerThread queueWorkerThread = C44625c2.f121005a;
            return C89925n.m112490c(str, "weixin://gethtml/");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.y$i */
    public static final class C43538i implements C53298a {

        /* renamed from: a */
        public final /* synthetic */ C43522y f117733a;

        public C43538i(C43522y yVar) {
            this.f117733a = yVar;
        }

        /* renamed from: b */
        public boolean mo67829b(String str) {
            C87412m.m108594g(str, "url");
            String substring = str.substring(17);
            C87412m.m108593f(substring, "this as java.lang.String).substring(startIndex)");
            if (substring.length() == 0) {
                Log.m105920e(this.f117733a.mo67822t1(), "handleUrl fail, username is null");
                return true;
            }
            if (this.f117733a.f117539M.mo70860c().mo69447f(2)) {
                C48590l g0 = this.f117733a.mo67720g0();
                if (!g0.f130003h) {
                    Log.m105920e("MicroMsg.JsApiHandler", "onGoProfile fail, not ready");
                } else {
                    MMHandler mMHandler = g0.f130001f;
                    if (mMHandler != null) {
                        mMHandler.post(new C13864v(g0, substring));
                    }
                }
            }
            return true;
        }

        /* renamed from: e */
        public boolean mo67830e(String str) {
            C87412m.m108594g(str, "url");
            if (Util.isNullOrNil(str)) {
                return false;
            }
            QueueWorkerThread queueWorkerThread = C44625c2.f121005a;
            return C89925n.m112490c(str, "weixin://profile/");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.y$j */
    public static final class C43539j implements C53298a {

        /* renamed from: a */
        public final /* synthetic */ C43522y f117734a;

        public C43539j(C43522y yVar) {
            this.f117734a = yVar;
        }

        /* renamed from: b */
        public boolean mo67829b(String str) {
            C87412m.m108594g(str, "url");
            C115669n.INSTANCE.idkeyStat(405, 26, 1, true);
            C43522y.m47162i1(this.f117734a, 3);
            return true;
        }

        /* renamed from: e */
        public boolean mo67830e(String str) {
            C87412m.m108594g(str, "url");
            if (Util.isNullOrNil(str)) {
                return false;
            }
            QueueWorkerThread queueWorkerThread = C44625c2.f121005a;
            return C89925n.m112490c(str, "weixin://manual_update/");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.y$k */
    public static final class C43540k implements C53298a {

        /* renamed from: a */
        public final /* synthetic */ C43522y f117735a;

        public C43540k(C43522y yVar) {
            this.f117735a = yVar;
        }

        /* renamed from: b */
        public boolean mo67829b(String str) {
            C87412m.m108594g(str, "url");
            C115669n.INSTANCE.idkeyStat(405, 24, 1, true);
            C43522y.m47162i1(this.f117735a, 2);
            return true;
        }

        /* renamed from: e */
        public boolean mo67830e(String str) {
            C87412m.m108594g(str, "url");
            if (Util.isNullOrNil(str)) {
                return false;
            }
            QueueWorkerThread queueWorkerThread = C44625c2.f121005a;
            return C89925n.m112490c(str, "weixin://recommend_update/");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.y$l */
    public static final class C43541l implements C53298a {

        /* renamed from: a */
        public final /* synthetic */ C43522y f117736a;

        public C43541l(C43522y yVar) {
            this.f117736a = yVar;
        }

        /* renamed from: b */
        public boolean mo67829b(String str) {
            C87412m.m108594g(str, "url");
            OpenWebview.Resp resp = new OpenWebview.Resp();
            Uri parse = Uri.parse(str);
            resp.result = parse.getQuery();
            resp.errCode = Util.getInt(parse.getQueryParameter("errCode"), 0);
            resp.errStr = parse.getQueryParameter("errMsg");
            resp.transaction = this.f117736a.mo67715e0().getStringExtra("transaction_for_openapi_openwebview");
            String queryParameter = parse.getQueryParameter("appid");
            if (Util.isNullOrNil(queryParameter)) {
                Log.m105920e(this.f117736a.mo67822t1(), "SDKOpenWebViewResultHandler handleUrl, appId is null");
                return true;
            }
            Bundle bundle = new Bundle();
            resp.toBundle(bundle);
            C72688j0.m85021g(bundle);
            MMessageActV2.Args args = new MMessageActV2.Args();
            try {
                args.targetPkgName = this.f117736a.mo67731m().mo68146pa(queryParameter);
                args.bundle = bundle;
                C72688j0.m85024j(args);
                Log.m105919d(this.f117736a.mo67822t1(), "SDKOpenWebViewResultHandler, handleUrl, sendResp:%s", args);
                MMessageActV2.send(this.f117736a.mo67707a0(), args);
                this.f117736a.mo67674G0();
                return true;
            } catch (Exception e) {
                Log.printErrStackTrace(this.f117736a.mo67822t1(), e, "", new Object[0]);
                return true;
            }
        }

        /* renamed from: e */
        public boolean mo67830e(String str) {
            C87412m.m108594g(str, "url");
            if (Util.isNullOrNil(str)) {
                return false;
            }
            QueueWorkerThread queueWorkerThread = C44625c2.f121005a;
            return C89925n.m112490c(str, "weixin://openapi/openwebview/result?");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.y$m */
    public static final class C43542m extends C44339m0 {

        /* renamed from: e */
        public final WeakReference<C43522y> f117737e;

        /* renamed from: f */
        public final C13601g f117738f = C36568h.m40985a(new C43543a(this));

        /* renamed from: g */
        public final String f117739g = ("MicroMsg.WebViewController.SceneEndCallbacker:" + mo67833e());

        /* renamed from: com.tencent.mm.plugin.webview.core.y$m$a */
        public static final class C43543a extends C87413o implements C32224a<Integer> {

            /* renamed from: d */
            public final /* synthetic */ C43542m f117740d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C43543a(C43542m mVar) {
                super(0);
                this.f117740d = mVar;
            }

            public Object invoke() {
                return Integer.valueOf(this.f117740d.hashCode());
            }
        }

        public C43542m(WeakReference<C43522y> weakReference) {
            C87412m.m108594g(weakReference, "controller");
            this.f117737e = weakReference;
        }

        /* renamed from: e */
        public final int mo67833e() {
            return ((Number) this.f117738f.getValue()).intValue();
        }

        public boolean fq0(C43787d dVar) {
            String str = this.f117739g;
            Log.m105924i(str, "onSceneEnd, instance hashcode = " + hashCode());
            if (dVar != null) {
                int i = dVar.getData().getInt("scene_end_listener_hash_code");
                Log.m105925i(this.f117739g, "get hash code = %d, self hash code = %d", Integer.valueOf(i), Integer.valueOf(mo67833e()));
                String str2 = this.f117739g;
                Log.m105924i(str2, "edw onSceneEnd, type = " + dVar.getType() + ", errCode = " + dVar.Xe0() + ", errType = " + dVar.Dq0());
                if (i != mo67833e()) {
                    Log.m105920e(this.f117739g, "hash code not equal");
                    return false;
                }
                C43522y yVar = this.f117737e.get();
                if (yVar != null) {
                    int type = dVar.getType();
                    if (type == 106) {
                        C43522y.m47163j1(yVar, 106);
                        yVar.mo67674G0();
                    } else if (type == 666) {
                        C43522y.m47163j1(yVar, C90210f.CTRL_INDEX);
                        yVar.mo67674G0();
                    }
                }
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.y$n */
    public static final class C43544n implements C53298a {

        /* renamed from: a */
        public final /* synthetic */ C43522y f117741a;

        public C43544n(C43522y yVar) {
            this.f117741a = yVar;
        }

        /* renamed from: b */
        public boolean mo67829b(String str) {
            C87412m.m108594g(str, "url");
            String substring = str.substring(25);
            C87412m.m108593f(substring, "this as java.lang.String).substring(startIndex)");
            try {
                String decode = URLDecoder.decode(substring);
                Bundle bundle = new Bundle();
                bundle.putString("nowUrl", this.f117741a.f117706t1);
                bundle.putString("tweetid", Util.nullAsNil(this.f117741a.mo67715e0().getStringExtra("tweetid")));
                bundle.putString("htmlData", decode);
                bundle.putInt("type", this.f117741a.mo67715e0().getIntExtra("type", 0));
                this.f117741a.mo67731m().mo68145pG(3, bundle, this.f117741a.mo67719g());
                return true;
            } catch (Exception e) {
                String t1 = this.f117741a.mo67822t1();
                Log.m105920e(t1, "edw ViewImageGetHtmlHandler handleUrl, ex = " + e.getMessage());
                return false;
            }
        }

        /* renamed from: e */
        public boolean mo67830e(String str) {
            C87412m.m108594g(str, "url");
            if (Util.isNullOrNil(str)) {
                return false;
            }
            QueueWorkerThread queueWorkerThread = C44625c2.f121005a;
            return C89925n.m112490c(str, "weixin://private/gethtml/");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.y$o */
    public static final class C43545o implements C53298a {

        /* renamed from: a */
        public final /* synthetic */ C43522y f117742a;

        /* renamed from: b */
        public final /* synthetic */ MMWebView f117743b;

        public C43545o(C43522y yVar, MMWebView mMWebView) {
            this.f117742a = yVar;
            this.f117743b = mMWebView;
        }

        /* renamed from: b */
        public boolean mo67829b(String str) {
            C87412m.m108594g(str, "url");
            try {
                if (!this.f117742a.mo67731m().isSDCardAvailable()) {
                    this.f117742a.mo67731m().mo68145pG(2, (Bundle) null, this.f117742a.mo67719g());
                    return true;
                }
                C43522y yVar = this.f117742a;
                String substring = str.substring(19);
                C87412m.m108593f(substring, "this as java.lang.String).substring(startIndex)");
                yVar.f117706t1 = substring;
                String t1 = this.f117742a.mo67822t1();
                Log.m105924i(t1, "viewimage currentUrl :" + this.f117742a.f117706t1);
                MMWebView mMWebView = this.f117743b;
                this.f117742a.f117710x1.getClass();
                C44625c2.m49073f(mMWebView, "weixin://private/gethtml/", "'<head>' + document.getElementsByTagName('head')[0].innerHTML + '</head><body>' + document.getElementsByTagName('body')[0].innerHTML + '</body>'", this.f117742a.f117707u1);
                return true;
            } catch (Exception e) {
                String t15 = this.f117742a.mo67822t1();
                Log.m105920e(t15, "edw handleUrl, ex = " + e.getMessage());
                return false;
            }
        }

        /* renamed from: e */
        public boolean mo67830e(String str) {
            C87412m.m108594g(str, "url");
            if (Util.isNullOrNil(str)) {
                return false;
            }
            QueueWorkerThread queueWorkerThread = C44625c2.f121005a;
            return C89925n.m112490c(str, "weixin://viewimage/");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.y$p */
    public final class C43546p {

        /* renamed from: a */
        public final C43522y f117744a;

        /* renamed from: b */
        public String f117745b;

        /* renamed from: c */
        public int f117746c;

        /* renamed from: d */
        public volatile String f117747d = "";

        /* renamed from: e */
        public volatile String f117748e = "";

        /* renamed from: f */
        public long f117749f;

        /* renamed from: g */
        public int f117750g;

        /* renamed from: h */
        public final /* synthetic */ C43522y f117751h;

        /* renamed from: com.tencent.mm.plugin.webview.core.y$p$a */
        public static final class C43547a implements MessageQueue.IdleHandler {

            /* renamed from: d */
            public final /* synthetic */ C43546p f117752d;

            /* renamed from: e */
            public final /* synthetic */ String f117753e;

            /* renamed from: f */
            public final /* synthetic */ long f117754f;

            /* renamed from: g */
            public final /* synthetic */ int f117755g;

            public C43547a(C43546p pVar, String str, long j, int i) {
                this.f117752d = pVar;
                this.f117753e = str;
                this.f117754f = j;
                this.f117755g = i;
            }

            public boolean queueIdle() {
                Looper.myQueue().removeIdleHandler(this);
                this.f117752d.mo67834a(this.f117753e, this.f117754f, this.f117755g);
                return false;
            }
        }

        public C43546p(C43522y yVar, C43522y yVar2) {
            C87412m.m108594g(yVar2, "controller");
            this.f117751h = yVar;
            this.f117744a = yVar2;
            String userAgentString = yVar2.f117553a.getSettings().getUserAgentString();
            C87412m.m108593f(userAgentString, "controller.viewWV.settings.userAgentString");
            this.f117745b = userAgentString;
            this.f117746c = yVar2.mo67715e0().getIntExtra("from_scence", 0);
        }

        /* JADX WARNING: Removed duplicated region for block: B:57:0x01ca  */
        /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo67834a(java.lang.String r26, long r27, int r29) {
            /*
                r25 = this;
                r1 = r25
                r2 = r26
                r3 = r27
                java.lang.String r0 = "UTF-8"
                java.lang.String r5 = ""
                java.lang.String r6 = "targetUrl"
                gy3.C87412m.m108594g(r2, r6)
                android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                boolean r7 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isConnected((android.content.Context) r6)
                r12 = 1
                r13 = 0
                if (r7 == 0) goto L_0x0062
                boolean r7 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isWifi((android.content.Context) r6)
                if (r7 == 0) goto L_0x0023
                r6 = 1
                goto L_0x0044
            L_0x0023:
                boolean r7 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is5G(r6)
                if (r7 == 0) goto L_0x002b
                r6 = 5
                goto L_0x0044
            L_0x002b:
                boolean r7 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is4G(r6)
                if (r7 == 0) goto L_0x0033
                r6 = 4
                goto L_0x0044
            L_0x0033:
                boolean r7 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is3G(r6)
                if (r7 == 0) goto L_0x003b
                r6 = 3
                goto L_0x0044
            L_0x003b:
                boolean r6 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is2G(r6)
                if (r6 == 0) goto L_0x0043
                r6 = 2
                goto L_0x0044
            L_0x0043:
                r6 = 0
            L_0x0044:
                r1.f117750g = r6
                com.tencent.mm.plugin.webview.core.y r6 = r1.f117751h
                java.lang.String r6 = r6.mo67822t1()
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r14 = "get networkType "
                r7.append(r14)
                int r14 = r1.f117750g
                r7.append(r14)
                java.lang.String r7 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
            L_0x0062:
                com.tencent.mm.plugin.webview.core.y r6 = r1.f117744a
                java.lang.String r7 = r1.f117748e
                java.lang.String r6 = r6.mo67694S(r7)
                int r7 = r1.f117746c
                if (r7 == 0) goto L_0x0072
                java.lang.String r7 = " "
                r1.f117747d = r7
            L_0x0072:
                com.tencent.mm.plugin.webview.core.y r7 = r1.f117744a
                d93.h r7 = r7.f117539M
                com.tencent.mm.protocal.GeneralControlWrapper r7 = r7.mo70859b()
                int r7 = r7.f121046d
                r7 = r7 & 2048(0x800, float:2.87E-42)
                if (r7 <= 0) goto L_0x0082
                r7 = 1
                goto L_0x0083
            L_0x0082:
                r7 = 0
            L_0x0083:
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "allowReportPageEvent, ret = "
                r14.append(r15)
                r14.append(r7)
                java.lang.String r14 = r14.toString()
                java.lang.String r15 = "MicroMsg.GeneralControlWrapper"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r14)
                com.tencent.mm.plugin.webview.core.y r14 = r1.f117751h
                java.lang.String r14 = r14.mo67822t1()
                java.lang.Object[] r15 = new java.lang.Object[r12]
                java.lang.Boolean r16 = java.lang.Boolean.valueOf(r7)
                r15[r13] = r16
                java.lang.String r11 = "webpageVisitInfoReport enableReportPageEvent %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r14, r11, r15)
                long r14 = r1.f117749f
                r17 = 0
                int r11 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
                if (r11 <= 0) goto L_0x01c5
                com.tencent.mm.plugin.webview.core.y r11 = r1.f117751h
                long r10 = r11.f117698l1
                int r18 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
                if (r18 <= 0) goto L_0x01c5
                int r14 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
                if (r14 <= 0) goto L_0x01c5
                boolean r10 = android.text.TextUtils.isEmpty(r6)
                if (r10 != 0) goto L_0x01c5
                if (r7 == 0) goto L_0x01c5
                com.tencent.mm.plugin.webview.core.y r7 = r1.f117751h
                long r10 = r7.f117698l1
                long r14 = r1.f117749f
                long r14 = r10 - r14
                long r10 = r3 - r10
                java.lang.String r7 = r7.mo67822t1()
                r9 = 13
                java.lang.Object[] r9 = new java.lang.Object[r9]
                r8 = 13376(0x3440, float:1.8744E-41)
                java.lang.Integer r19 = java.lang.Integer.valueOf(r8)
                r9[r13] = r19
                r20 = r14
                long r13 = r1.f117749f
                java.lang.Long r13 = java.lang.Long.valueOf(r13)
                r9[r12] = r13
                r13 = 2
                r9[r13] = r6
                java.lang.Long r13 = java.lang.Long.valueOf(r20)
                r14 = 3
                r9[r14] = r13
                java.lang.Long r13 = java.lang.Long.valueOf(r10)
                r14 = 4
                r9[r14] = r13
                int r13 = r1.f117750g
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                r14 = 5
                r9[r14] = r13
                java.lang.String r13 = r1.f117745b
                r14 = 6
                r9[r14] = r13
                java.lang.String r13 = r1.f117748e
                r15 = 7
                r9[r15] = r13
                java.lang.String r13 = f32.C75676e.f222284a
                r22 = 8
                r9[r22] = r13
                java.lang.Integer r13 = java.lang.Integer.valueOf(r29)
                r23 = 9
                r9[r23] = r13
                r13 = 10
                r9[r13] = r2
                int r8 = r1.f117746c
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                r24 = 11
                r9[r24] = r8
                java.lang.String r8 = r1.f117747d
                r13 = 12
                r9[r13] = r8
                java.lang.String r8 = "report(%s), clickTimestamp : %d, appID : %s, usedTime : %s, stayTime : %s, networkType : %s, userAgent : %s, url : %s, sessionID : %s, targetAction : %s, targetUrl : %s,scene : %s, refererUrl : %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r8, r9)
                java.lang.String r7 = r1.f117745b     // Catch:{ UnsupportedEncodingException -> 0x0168 }
                java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r7)     // Catch:{ UnsupportedEncodingException -> 0x0168 }
                java.lang.String r7 = p206nj.C117627q.m165909b(r7, r0)     // Catch:{ UnsupportedEncodingException -> 0x0168 }
                java.lang.String r8 = r1.f117748e     // Catch:{ UnsupportedEncodingException -> 0x0165 }
                java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
                java.lang.String r8 = p206nj.C117627q.m165909b(r8, r0)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
                java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r26)     // Catch:{ UnsupportedEncodingException -> 0x0162 }
                java.lang.String r9 = p206nj.C117627q.m165909b(r9, r0)     // Catch:{ UnsupportedEncodingException -> 0x0162 }
                java.lang.String r15 = r1.f117747d     // Catch:{ UnsupportedEncodingException -> 0x0160 }
                java.lang.String r15 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r15)     // Catch:{ UnsupportedEncodingException -> 0x0160 }
                java.lang.String r5 = p206nj.C117627q.m165909b(r15, r0)     // Catch:{ UnsupportedEncodingException -> 0x0160 }
                r14 = 0
                goto L_0x0178
            L_0x0160:
                r0 = move-exception
                goto L_0x016c
            L_0x0162:
                r0 = move-exception
                r9 = r5
                goto L_0x016c
            L_0x0165:
                r0 = move-exception
                r8 = r5
                goto L_0x016b
            L_0x0168:
                r0 = move-exception
                r7 = r5
                r8 = r7
            L_0x016b:
                r9 = r8
            L_0x016c:
                com.tencent.mm.plugin.webview.core.y r15 = r1.f117751h
                java.lang.String r15 = r15.mo67822t1()
                r14 = 0
                java.lang.Object[] r12 = new java.lang.Object[r14]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r0, r5, r12)
            L_0x0178:
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                java.lang.Object[] r12 = new java.lang.Object[r13]
                long r3 = r1.f117749f
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                r12[r14] = r3
                r3 = 1
                r12[r3] = r6
                java.lang.Long r3 = java.lang.Long.valueOf(r20)
                r4 = 2
                r12[r4] = r3
                java.lang.Long r3 = java.lang.Long.valueOf(r10)
                r4 = 3
                r12[r4] = r3
                int r3 = r1.f117750g
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r4 = 4
                r12[r4] = r3
                r3 = 5
                r12[r3] = r7
                r3 = 6
                r12[r3] = r8
                java.lang.String r3 = f32.C75676e.f222284a
                r4 = 7
                r12[r4] = r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r29)
                r12[r22] = r3
                r12[r23] = r9
                int r3 = r1.f117746c
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r4 = 10
                r12[r4] = r3
                r12[r24] = r5
                r3 = 13376(0x3440, float:1.8744E-41)
                r0.mo160131h(r3, r12)
                r3 = 0
                r1.f117746c = r3
            L_0x01c5:
                r3 = r29
                r4 = 1
                if (r3 != r4) goto L_0x01d4
                java.lang.String r0 = r1.f117748e
                r1.f117747d = r0
                r1.f117748e = r2
                r2 = r27
                r1.f117749f = r2
            L_0x01d4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.core.C43522y.C43546p.mo67834a(java.lang.String, long, int):void");
        }

        /* renamed from: b */
        public final void mo67835b(String str, long j, int i) {
            C87412m.m108594g(str, "targetUrl");
            Looper.myQueue().addIdleHandler(new C43547a(this, str, j, i));
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.y$q */
    public static final class C43548q extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C43522y f117756d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43548q(C43522y yVar) {
            super(0);
            this.f117756d = yVar;
        }

        public Object invoke() {
            return "MicroMsg.WebViewController:" + this.f117756d.mo67719g();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.y$r */
    public static final class C43549r implements C85523o0.C43723a {

        /* renamed from: a */
        public final WeakReference<C43522y> f117757a;

        /* renamed from: b */
        public final Map<Integer, Integer> f117758b = new HashMap();

        public C43549r(WeakReference<C43522y> weakReference) {
            C87412m.m108594g(weakReference, "weakController");
            this.f117757a = weakReference;
        }

        public void remove(int i) {
            C43522y yVar = this.f117757a.get();
            if (yVar != null) {
                C43522y.m47163j1(yVar, i);
            }
            if (((HashMap) this.f117758b).containsKey(Integer.valueOf(i))) {
                Object obj = ((HashMap) this.f117758b).get(Integer.valueOf(i));
                C87412m.m108591d(obj);
                int intValue = ((Number) obj).intValue();
                Integer valueOf = Integer.valueOf(i);
                ((HashMap) this.f117758b).put(valueOf, Integer.valueOf(intValue - 1));
                return;
            }
            ((HashMap) this.f117758b).put(Integer.valueOf(i), 0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.y$s */
    public static final class C43550s implements C85523o0.C85537c {

        /* renamed from: a */
        public final WeakReference<C43522y> f117759a;

        /* renamed from: b */
        public C89779i0 f117760b;

        public C43550s(WeakReference<C43522y> weakReference) {
            C87412m.m108594g(weakReference, "weakController");
            this.f117759a = weakReference;
        }

        /* renamed from: a */
        public void mo67838a() {
            C89779i0 i0Var = this.f117760b;
            if (i0Var != null && i0Var.isShowing()) {
                i0Var.dismiss();
            }
            if (i0Var != null) {
                i0Var.setCancelMessage((Message) null);
            }
            if (i0Var != null) {
                i0Var.setDismissMessage((Message) null);
            }
            this.f117760b = null;
        }

        /* renamed from: b */
        public void mo67839b(String str, int i) {
            C87412m.m108594g(str, "url");
            C43522y yVar = this.f117759a.get();
            if (yVar != null) {
                boolean z = true;
                yVar.mo67706Z0(str, true, i);
                C46658a aVar = yVar.f117680T0;
                if (aVar == null || !((WebViewUI) aVar).f118458E.f125614a) {
                    z = false;
                }
                if (z && aVar != null) {
                    WebViewUI webViewUI = (WebViewUI) aVar;
                    C46661f fVar = webViewUI.f118458E;
                    fVar.getClass();
                    if (!fVar.f125614a) {
                        Log.m105924i("MicroMsg.WebViewSnapshotHelper", "exitSnapshotMode not in snap shot mode now");
                        return;
                    }
                    Log.m105924i("MicroMsg.WebViewSnapshotHelper", "exitSnapshotMode");
                    fVar.f125614a = false;
                    webViewUI.getController().mo177102w0(0);
                    MMWebView mMWebView = webViewUI.f118523f;
                    if (mMWebView != null) {
                        mMWebView.setVisibility(0);
                    }
                    ViewGroup viewGroup = fVar.f125615b;
                    if (viewGroup != null) {
                        viewGroup.setVisibility(8);
                    }
                    fVar.mo71920b();
                }
            }
        }

        /* renamed from: c */
        public void mo67840c(String str, String str2) {
            C46658a aVar;
            String str3 = str;
            C87412m.m108594g(str3, "pageUrl");
            C43522y yVar = this.f117759a.get();
            if (yVar != null && (aVar = yVar.f117680T0) != null) {
                WebViewUI webViewUI = (WebViewUI) aVar;
                C46661f fVar = webViewUI.f118458E;
                fVar.getClass();
                if (fVar.f125614a) {
                    Log.m105924i("MicroMsg.WebViewSnapshotHelper", "enterSnapshotMode already in snap shot mode now");
                    return;
                }
                C43704h2.m47540n(16);
                Log.m105924i("MicroMsg.WebViewSnapshotHelper", "enterSnapshotMode pageUrl=" + str3);
                fVar.f125625l = new WeakReference<>(webViewUI);
                if (fVar.f125615b == null) {
                    fVar.f125615b = (ViewGroup) ((ViewStub) webViewUI.findViewById(C0966R.C0970id.m8y)).inflate();
                }
                if (fVar.f125615b != null) {
                    fVar.f125616c = webViewUI.findViewById(C0966R.C0970id.m78);
                    fVar.f125617d = (FrameLayout) webViewUI.findViewById(C0966R.C0970id.jo9);
                    fVar.f125618e = (ScrollView) webViewUI.findViewById(C0966R.C0970id.jo7);
                    fVar.f125620g = webViewUI.findViewById(C0966R.C0970id.m74);
                    fVar.f125621h = webViewUI.findViewById(C0966R.C0970id.m77);
                    fVar.f125622i = (TextView) webViewUI.findViewById(C0966R.C0970id.m76);
                    View findViewById = webViewUI.findViewById(C0966R.C0970id.m75);
                    fVar.f125623j = findViewById;
                    if (findViewById != null) {
                        findViewById.setOnClickListener(C9573c.f29812d);
                    }
                    C7007c1.m7256a(fVar.f125621h);
                    C46746a.f125826a.mo71977j(fVar.f125616c, (float) C76577a.m92151b(webViewUI, 8), false, true);
                    View view = fVar.f125621h;
                    if (view != null) {
                        view.setOnClickListener(new C46659d(fVar));
                    }
                }
                fVar.f125614a = true;
                webViewUI.getController().mo177102w0(8);
                MMWebView mMWebView = webViewUI.f118523f;
                if (mMWebView != null) {
                    mMWebView.setVisibility(8);
                }
                String string = Util.isNullOrNil(str2) ? webViewUI.getString(C0966R.string.m0j) : str2;
                TextView textView = fVar.f125622i;
                if (textView != null) {
                    textView.setText(string);
                }
                MMWebView mMWebView2 = null;
                try {
                    Log.m105924i("MMWebView", "TRACE_ORDER:MMWebView.java");
                    XWebSdk.initWebviewCore(webViewUI, MMWebView.f122352r, XWalkEnvironment.MODULE_TOOLS, (WebView.PreInitCallback) null);
                    mMWebView2 = new MMWebView(webViewUI, (AttributeSet) null, 0, WebView.WebViewKind.WV_KIND_SYS);
                } catch (Exception unused) {
                }
                C87412m.m108593f(mMWebView2, "snapshotWebView");
                fVar.f125619f = mMWebView2;
                mMWebView2.setBackgroundColor(0);
                MMWebView mMWebView3 = fVar.f125619f;
                if (mMWebView3 != null) {
                    mMWebView3.setWebViewCallbackClient(fVar.f125629p);
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                FrameLayout frameLayout = fVar.f125617d;
                if (frameLayout != null) {
                    frameLayout.addView(fVar.f125619f, layoutParams);
                }
                View view2 = fVar.f125620g;
                if (view2 != null) {
                    view2.setOnClickListener(new C9572b(fVar, webViewUI));
                }
                MMWebView mMWebView4 = fVar.f125619f;
                ScrollView scrollView = fVar.f125618e;
                C87412m.m108591d(scrollView);
                C5843f0 f0Var = C5843f0.f22025a;
                if (mMWebView4 != null) {
                    scrollView.getViewTreeObserver().addOnScrollChangedListener(new C43513g0(scrollView, mMWebView4, mMWebView4.getScale()));
                }
                MMWebView mMWebView5 = fVar.f125619f;
                C87412m.m108591d(mMWebView5);
                C43522y yVar2 = new C43522y(mMWebView5, (C43704h2) null, new C45520t.C45522b((C45520t.C45523c) null, false, false, false, false, 0, true, 63, (C8480h) null), C64187h0.f181908d, (C13853i) null, 18, (C8480h) null);
                fVar.f125624k = yVar2;
                yVar2.init();
                Intent intent = new Intent();
                intent.putExtra("rawUrl", str3);
                fVar.f125626m = true;
                C119179t tVar = C119157j.f356862d;
                C46660e eVar = new C46660e(fVar);
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183892w(eVar, 3000, false);
                C43522y yVar3 = fVar.f125624k;
                if (yVar3 != null) {
                    yVar3.mo67741p(fVar.f125627n);
                }
                C43522y yVar4 = fVar.f125624k;
                if (yVar4 != null) {
                    yVar4.mo67677I(intent);
                }
            }
        }

        /* renamed from: d */
        public void mo67841d(DialogInterface.OnCancelListener onCancelListener) {
            C87412m.m108594g(onCancelListener, "cancelListener");
            C43522y yVar = this.f117759a.get();
            if (yVar != null) {
                C89779i0 i0Var = this.f117760b;
                if (i0Var != null && i0Var.isShowing()) {
                    i0Var.dismiss();
                }
                if (i0Var != null) {
                    i0Var.setCancelMessage((Message) null);
                }
                if (i0Var != null) {
                    i0Var.setDismissMessage((Message) null);
                }
                this.f117760b = C76879j.m92723Q(yVar.f117553a.getActivityContextIfHas(), (String) null, yVar.mo67707a0().getString(C0966R.string.hdw), true, true, onCancelListener);
            }
        }

        /* renamed from: e */
        public boolean mo67842e() {
            C43522y yVar = this.f117759a.get();
            if (yVar == null || yVar.f117680T0 == null) {
                return false;
            }
            C43520v.C43521b bVar = C43520v.f117665a;
            boolean z = C5857x.m5577a().getInt("openSnapOauth", 1) == 1;
            Log.m105924i("WebViewCommand", "openSnapOauth = " + z);
            return z;
        }

        public String getCurrentUrl() {
            C43522y yVar = this.f117759a.get();
            if (yVar == null) {
                return "";
            }
            String currentUrl = yVar.getCurrentUrl();
            return !(currentUrl == null || C112551y.m153811k(currentUrl)) ? yVar.getCurrentUrl() : yVar.mo63683n0();
        }

        public void goBack() {
            C43522y yVar = this.f117759a.get();
            if (yVar != null) {
                for (C43558z i : yVar.f117547U) {
                    i.mo67854i();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.y$t */
    public static final class C43551t implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C43522y f117761d;

        /* renamed from: e */
        public final /* synthetic */ Uri f117762e;

        public C43551t(C43522y yVar, Uri uri) {
            this.f117761d = yVar;
            this.f117762e = uri;
        }

        public final void run() {
            ((C79138l) C86312j.m106911c(C79138l.class)).xw0(this.f117761d.f117553a.getActivityContextIfHas(), this.f117762e, (C44580q1) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.y$u */
    public static final class C43552u extends C87413o implements C32224a<HashSet<String>> {

        /* renamed from: d */
        public final /* synthetic */ C43522y f117763d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43552u(C43522y yVar) {
            super(0);
            this.f117763d = yVar;
        }

        public Object invoke() {
            HashSet hashSet = new HashSet();
            C43522y yVar = this.f117763d;
            hashSet.add("file:///android_asset/");
            String g = C112760b.m154231g();
            hashSet.add("file://" + C43471q.m46983g(0).mo71059h());
            hashSet.add("file://" + C43471q.m46978b(3));
            hashSet.add("file://" + C43471q.m46983g(4).mo71075m());
            hashSet.add("file://" + C43471q.m46983g(8).mo71075m());
            hashSet.add("file://" + C43471q.m46983g(11).mo71075m());
            C86009m1 m1Var = new C86009m1(g, "emoji/res");
            hashSet.add("file://" + m1Var.mo119971i());
            C86009m1 m1Var2 = new C86009m1(C112760b.m154195C(), "emoji/res");
            hashSet.add("file://" + m1Var2.mo119971i());
            Log.m105925i(yVar.mo67822t1(), "add webview UI FILE URL WHITE LIST data: %s sdcard:%s", m1Var.mo119971i(), m1Var2.mo119971i());
            C43522y yVar2 = this.f117763d;
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                String t1 = yVar2.mo67822t1();
                Log.m105924i(t1, "albie: WebViewUI white list path : " + ((String) it.next()));
            }
            return hashSet;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.y$v */
    public static final class C43553v extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C43522y f117764d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43553v(C43522y yVar) {
            super(0);
            this.f117764d = yVar;
        }

        public Object invoke() {
            return Boolean.valueOf(this.f117764d.mo67715e0().getBooleanExtra("finishviewifloadfailed", false));
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.y$w */
    public static final class C43554w extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C43522y f117765d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43554w(C43522y yVar) {
            super(0);
            this.f117765d = yVar;
        }

        public Object invoke() {
            return Boolean.valueOf(this.f117765d.mo67715e0().getBooleanExtra("KFromLoginHistory", false));
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.y$x */
    public static final class C43555x extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C43522y f117766d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43555x(C43522y yVar) {
            super(0);
            this.f117766d = yVar;
        }

        public Object invoke() {
            return Boolean.valueOf(this.f117766d.mo67715e0().getBooleanExtra("neverBlockLocalRequest", false));
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.y$y */
    public static final class C43556y implements C53298a {

        /* renamed from: a */
        public boolean f117767a;

        /* renamed from: b */
        public String f117768b = "";

        /* renamed from: c */
        public Point f117769c;

        /* renamed from: d */
        public long f117770d;

        /* renamed from: e */
        public final /* synthetic */ C45520t.C45522b f117771e;

        /* renamed from: f */
        public final /* synthetic */ C43522y f117772f;

        public C43556y(C45520t.C45522b bVar, C43522y yVar) {
            this.f117771e = bVar;
            this.f117772f = yVar;
        }

        /* renamed from: a */
        public final boolean mo67846a(String str, int i) {
            String str2 = str;
            C87412m.m108594g(str2, "url");
            String stringExtra = this.f117772f.mo67715e0().getStringExtra("geta8key_username");
            int k0 = this.f117772f.mo67729k0(stringExtra);
            if (!this.f117767a) {
                this.f117768b = str2;
            }
            C52806b bVar = this.f117772f.f117573k;
            if (bVar.f147524b && bVar.f147534l && !bVar.f147525c) {
                C5843f0 f0Var = C5843f0.f22025a;
                if (((Boolean) ((C36570n) C5843f0.f22031g).getValue()).booleanValue()) {
                    Log.m105928w(this.f117772f.mo67822t1(), "handle oauth fail on background");
                    C43522y yVar = this.f117772f;
                    yVar.mo67686O(yVar.f117574k0, str2);
                    return false;
                }
            }
            C43791l m = this.f117772f.mo67731m();
            C43522y yVar2 = this.f117772f;
            C85523o0.C85537c cVar = yVar2.f117696j1;
            C43549r rVar = yVar2.f117697k1;
            int e = yVar2.mo67818p1().mo67833e();
            Context a0 = this.f117772f.mo67707a0();
            Dialog dialog = this.f117772f.f117579n;
            C85523o0.C85524b.f249235a = System.currentTimeMillis();
            C7608b.INSTANCE.mo8746c(1, "");
            C43550s sVar = (C43550s) cVar;
            String currentUrl = sVar.getCurrentUrl();
            Log.m105925i("MicroMsg.OauthAuthorizeLogic", "doOauthAuthorize scene: %d, autoOauth: %d, url=%s", Integer.valueOf(k0), Integer.valueOf(i), currentUrl);
            sVar.mo67841d(new C43724p0(sVar));
            C50914q43 q432 = new C50914q43();
            q432.f140131d = str2;
            q432.f140132e = stringExtra;
            q432.f140133f = k0;
            q432.f140134g = i;
            q432.f140136i = currentUrl;
            C47350c.C47352b bVar2 = new C47350c.C47352b();
            bVar2.f127066a = q432;
            bVar2.f127067b = new C90433r43();
            bVar2.f127068c = "/cgi-bin/mmbiz-bin/oauth_authorize";
            bVar2.f127069d = 1254;
            bVar2.f127070e = 0;
            bVar2.f127071f = 0;
            ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(bVar2.mo72403a(), new C85538q0(new WeakReference(a0), m, sVar, rVar, str, e, dialog));
            return true;
        }

        /* renamed from: b */
        public boolean mo67829b(String str) {
            C87412m.m108594g(str, "url");
            return mo67846a(str, (this.f117767a || !((C43550s) this.f117772f.f117696j1).mo67842e()) ? 0 : 1);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0053, code lost:
            r0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x002d, code lost:
            if (r0 == 1) goto L_0x0051;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x004f, code lost:
            if (com.tencent.p014mm.plugin.webview.model.C85523o0.C85524b.f249237c == 1) goto L_0x0051;
         */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00dd A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo67847c(java.lang.String r6) {
            /*
                r5 = this;
                java.lang.String r0 = "url"
                gy3.C87412m.m108594g(r6, r0)
                com.tencent.mm.plugin.webview.core.y r0 = r5.f117772f
                android.content.Intent r0 = r0.mo67715e0()
                java.lang.String r1 = "geta8key_scene"
                r2 = 0
                int r0 = r0.getIntExtra(r1, r2)
                java.lang.String r1 = "MicroMsg.OauthAuthorizeLogic"
                r3 = 6
                if (r3 != r0) goto L_0x001f
                java.lang.String r6 = "shouldNativeOauthIntercept from oauth"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r6)
                goto L_0x00de
            L_0x001f:
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
                if (r0 == 0) goto L_0x0027
                goto L_0x00de
            L_0x0027:
                int r0 = com.tencent.p014mm.plugin.webview.model.C85523o0.C85524b.f249237c
                r3 = -1
                r4 = 1
                if (r0 == r3) goto L_0x0030
                if (r0 != r4) goto L_0x0053
                goto L_0x0051
            L_0x0030:
                java.lang.Class<h81.h> r0 = h81.C32735h.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                h81.h r0 = (h81.C32735h) r0
                h81.h$c r3 = h81.C32735h.C32737c.clicfg_native_oauth_host_for_h5
                int r0 = r0.mo58779Qe(r3, r4)
                com.tencent.p014mm.plugin.webview.model.C85523o0.C85524b.f249237c = r0
                java.lang.Object[] r3 = new java.lang.Object[r4]
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r3[r2] = r0
                java.lang.String r0 = "isABTestOpen %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r3)
                int r0 = com.tencent.p014mm.plugin.webview.model.C85523o0.C85524b.f249237c
                if (r0 != r4) goto L_0x0053
            L_0x0051:
                r0 = 1
                goto L_0x0054
            L_0x0053:
                r0 = 0
            L_0x0054:
                if (r0 == 0) goto L_0x00de
                java.lang.String[] r0 = com.tencent.p014mm.plugin.webview.model.C85523o0.f249233a
                if (r0 != 0) goto L_0x008a
                boolean r0 = com.tencent.p014mm.plugin.webview.model.C85523o0.f249234b
                if (r0 != 0) goto L_0x008a
                java.lang.String r0 = com.tencent.p014mm.plugin.webview.model.C85523o0.m105551b()
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r3 == 0) goto L_0x0080
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r3 = 2131831323(0x7f112a1b, float:1.9295668E38)
                java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.WeChatHosts.domainString(r3)
                r0.append(r3)
                java.lang.String r3 = "/connect/oauth2/authorize"
                r0.append(r3)
                java.lang.String r0 = r0.toString()
            L_0x0080:
                java.lang.String r3 = ";"
                java.lang.String[] r0 = r0.split(r3)
                com.tencent.p014mm.plugin.webview.model.C85523o0.f249233a = r0
                com.tencent.p014mm.plugin.webview.model.C85523o0.f249234b = r4
            L_0x008a:
                java.lang.String[] r0 = com.tencent.p014mm.plugin.webview.model.C85523o0.f249233a
                if (r0 == 0) goto L_0x00d5
                int r0 = r0.length
                if (r0 != 0) goto L_0x0092
                goto L_0x00d5
            L_0x0092:
                android.net.Uri r6 = android.net.Uri.parse(r6)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = r6.getAuthority()
                r0.append(r3)
                java.lang.String r6 = r6.getPath()
                r0.append(r6)
                java.lang.String r6 = r0.toString()
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
                if (r0 == 0) goto L_0x00b9
                java.lang.String r6 = "isOauthHost target nil"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r6)
                goto L_0x00da
            L_0x00b9:
                java.lang.Object[] r0 = new java.lang.Object[r4]
                r0[r2] = r6
                java.lang.String r3 = "isOauthHost target:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r3, r0)
                r0 = 0
            L_0x00c3:
                java.lang.String[] r1 = com.tencent.p014mm.plugin.webview.model.C85523o0.f249233a
                int r3 = r1.length
                if (r0 >= r3) goto L_0x00da
                r1 = r1[r0]
                boolean r1 = r6.equalsIgnoreCase(r1)
                if (r1 == 0) goto L_0x00d2
                r6 = 1
                goto L_0x00db
            L_0x00d2:
                int r0 = r0 + 1
                goto L_0x00c3
            L_0x00d5:
                java.lang.String r6 = "isOauthHost sOauthHostPaths nil"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r6)
            L_0x00da:
                r6 = 0
            L_0x00db:
                if (r6 == 0) goto L_0x00de
                r2 = 1
            L_0x00de:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.core.C43522y.C43556y.mo67847c(java.lang.String):boolean");
        }

        /* renamed from: e */
        public boolean mo67830e(String str) {
            C87412m.m108594g(str, "url");
            return !this.f117771e.f123185g && mo67847c(str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.y$z */
    public static final class C43557z extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C43522y f117773d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43557z(C43522y yVar) {
            super(0);
            this.f117773d = yVar;
        }

        public Object invoke() {
            String str;
            String str2;
            String str3;
            C13604l[] lVarArr;
            C43522y yVar = this.f117773d;
            Iterator<C43558z> it = yVar.f117547U.iterator();
            while (it.hasNext()) {
                C43558z next = it.next();
                if (next instanceof C43504a0) {
                    ((C43504a0) next).mo67774s(yVar.f117543Q);
                }
            }
            C43522y yVar2 = this.f117773d;
            if (!yVar2.f117573k.f147534l) {
                C45604u uVar = yVar2.f117543Q;
                MMWebView mMWebView = yVar2.f117553a;
                C13601g gVar = C46206e.f124554a;
                C87412m.m108594g(uVar, "performanceHelper");
                C87412m.m108594g(mMWebView, "webView");
                long j = uVar.f123352s;
                StringBuilder sb = new StringBuilder();
                sb.append(Uri.parse(uVar.f123348o).getHost());
                sb.append(",");
                sb.append(C117627q.m165909b(uVar.f123348o, "utf-8"));
                sb.append(",");
                char c = 2;
                char c2 = 4;
                sb.append((uVar.f123342i | (uVar.f123338e ? (char) 2 : 0)) | (uVar.f123344k ? (char) 4 : 0) ? 1 : 0);
                sb.append(",");
                C117627q.m165909b(uVar.f123348o, "utf-8");
                boolean z = uVar.f123340g;
                if (uVar.f123345l.size() <= 0) {
                    c = 0;
                }
                if (uVar.f123346m.size() <= 0) {
                    c2 = 0;
                }
                sb.append((z | c) | c2 ? 1 : 0);
                sb.append(",");
                sb.append(uVar.f123339f ? 1 : 0);
                sb.append(",");
                sb.append(uVar.f123353t);
                sb.append(",");
                sb.append(C117627q.m165909b(uVar.f123356w, "utf-8"));
                sb.append(",");
                sb.append(",");
                sb.append(",");
                sb.append(",");
                sb.append(0);
                sb.append(",");
                sb.append(C46206e.m51497d("pageAppear", uVar, j));
                sb.append(C46206e.m51497d("onWebViewCreateStart", uVar, j));
                sb.append(C46206e.m51497d("onWebViewCreateEnd", uVar, j));
                sb.append(C46206e.m51497d("getA8KeyStart", uVar, j));
                sb.append(C46206e.m51497d("getA8KeyEnd", uVar, j));
                sb.append(C46206e.m51497d("clientLoadUrl", uVar, j));
                sb.append(C46206e.m51497d("navigationStart", uVar, j));
                sb.append(C46206e.m51497d("domainLookupStart", uVar, j));
                sb.append(C46206e.m51497d("domainLookupEnd", uVar, j));
                MMWebView mMWebView2 = mMWebView;
                sb.append(C46206e.m51497d("connectStart", uVar, j));
                String str4 = "connectStart";
                sb.append(C46206e.m51497d("connectEnd", uVar, j));
                String str5 = "connectEnd";
                sb.append(C46206e.m51497d("responseStart", uVar, j));
                String str6 = "responseStart";
                sb.append(C46206e.m51497d("responseEnd", uVar, j));
                String str7 = "responseEnd";
                if (uVar.f123342i) {
                    StringBuilder sb4 = new StringBuilder();
                    str2 = "navigationStart";
                    str = "domainLookupStart";
                    sb4.append(uVar.f123343j - j);
                    sb4.append(',');
                    str3 = sb4.toString();
                } else {
                    str2 = "navigationStart";
                    str = "domainLookupStart";
                    str3 = C46206e.m51497d("domLoading", uVar, j);
                }
                sb.append(str3);
                sb.append(C46206e.m51497d("domInteractive", uVar, j));
                sb.append(C46206e.m51497d("domContentLoadedEventStart", uVar, j));
                sb.append(C46206e.m51497d("domContentLoadedEventEnd", uVar, j));
                sb.append(C46206e.m51497d("loadEventStart", uVar, j));
                sb.append(C46206e.m51497d("loadEventEnd", uVar, j));
                sb.append(C46206e.m51497d("onTryBindServiceStart", uVar, j));
                String str8 = "onTryBindServiceStart";
                sb.append(C46206e.m51497d("onPostBindedEnd", uVar, j));
                String str9 = "onPostBindedEnd";
                sb.append(C46206e.m51497d("onCreate", uVar, j));
                String str10 = "onCreate";
                sb.append(C46206e.m51497d("onUIInitEnd", uVar, j));
                sb.append("0,0,0,0,0,0,0,");
                sb.append(C46206e.m51497d("onPostBindedStart", uVar, j));
                sb.append(C46206e.m51497d("firstContentfulPaint", uVar, j));
                if (uVar.f123351r == C46206e.C46211d.Unknown) {
                    uVar.f123351r = C46206e.m51495b();
                }
                sb.append(uVar.f123351r.f124570d);
                sb.append(",");
                sb.append(uVar.f123357x);
                sb.append(",");
                String sb5 = sb.toString();
                C87412m.m108593f(sb5, "StringBuilder().apply {\n…,\")\n\n        }.toString()");
                Log.m105927v("MicroMsg.WebViewPerformanceReporter", "reportCommonWebViewPerformance %s", sb5);
                C115669n nVar = C115669n.INSTANCE;
                nVar.kvStat(19471, sb5);
                boolean z2 = uVar.f123338e;
                boolean z3 = uVar.f123339f;
                if (z2) {
                    nVar.mo175913w(1200, 2, 1);
                }
                if (z3) {
                    nVar.mo175913w(1200, 3, 1);
                }
                String str11 = "firstContentfulPaint";
                C46206e.m51503j(uVar.f123353t, uVar.f123348o, false, true, uVar.f123338e, uVar.f123339f, uVar.f123340g, false, 128, (Object) null);
                if (C36979g1.m41111a()) {
                    long j2 = uVar.f123352s;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(0L);
                    arrayList.add(Long.valueOf(C46206e.m51494a("pageAppear", uVar, j2)));
                    arrayList.add(Long.valueOf(C46206e.m51494a("onWebViewCreateStart", uVar, j2)));
                    arrayList.add(Long.valueOf(C46206e.m51494a("onWebViewCreateEnd", uVar, j2)));
                    arrayList.add(Long.valueOf(C46206e.m51494a("getA8KeyStart", uVar, j2)));
                    arrayList.add(Long.valueOf(C46206e.m51494a("getA8KeyEnd", uVar, j2)));
                    arrayList.add(Long.valueOf(C46206e.m51494a("clientLoadUrl", uVar, j2)));
                    arrayList.add(Long.valueOf(C46206e.m51494a(str2, uVar, j2)));
                    arrayList.add(Long.valueOf(C46206e.m51494a(str, uVar, j2)));
                    arrayList.add(Long.valueOf(C46206e.m51494a("domainLookupEnd", uVar, j2)));
                    arrayList.add(Long.valueOf(C46206e.m51494a(str4, uVar, j2)));
                    arrayList.add(Long.valueOf(C46206e.m51494a(str5, uVar, j2)));
                    arrayList.add(Long.valueOf(C46206e.m51494a(str6, uVar, j2)));
                    arrayList.add(Long.valueOf(C46206e.m51494a(str7, uVar, j2)));
                    arrayList.add(Long.valueOf(C46206e.m51494a("domLoading", uVar, j2)));
                    arrayList.add(Long.valueOf(C46206e.m51494a("domInteractive", uVar, j2)));
                    arrayList.add(Long.valueOf(C46206e.m51494a(str8, uVar, j2)));
                    arrayList.add(Long.valueOf(C46206e.m51494a(str9, uVar, j2)));
                    arrayList.add(Long.valueOf(C46206e.m51494a(str10, uVar, j2)));
                    arrayList.add(Long.valueOf(C46206e.m51494a("onUIInitEnd", uVar, j2)));
                    long a = C46206e.m51494a(str11, uVar, j2);
                    if (a <= 0) {
                        arrayList.add(0L);
                        arrayList.add(0L);
                    } else {
                        arrayList.add(Long.valueOf(C46206e.m51494a("fetchStart", uVar, j2)));
                        arrayList.add(Long.valueOf(a));
                    }
                    String str12 = '[' + C110818d0.m150921S(C110818d0.m150947s0(arrayList, 22), (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 63, (Object) null) + ']';
                    String[][] strArr = uVar.f123337d;
                    if (strArr != null) {
                        ArrayList arrayList2 = new ArrayList(strArr.length);
                        for (String[] strArr2 : strArr) {
                            arrayList2.add(new C13604l(strArr2[0], strArr2[1]));
                        }
                        Object[] array = arrayList2.toArray(new C13604l[0]);
                        C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        lVarArr = (C13604l[]) array;
                    } else {
                        lVarArr = null;
                    }
                    C45984j0 j0Var = new C45984j0(11);
                    j0Var.mo71372a(new C13604l("section", "GetA8Key"));
                    j0Var.mo71372a(new C13604l("preGetA8Key", String.valueOf(uVar.f123338e)));
                    j0Var.mo71372a(new C13604l("preDns", String.valueOf(uVar.f123339f)));
                    if (lVarArr == null) {
                        lVarArr = new C13604l[0];
                    }
                    j0Var.mo71373b(lVarArr);
                    j0Var.mo71372a(new C13604l("section", "Prefetch"));
                    j0Var.mo71372a(new C13604l("prefetch", String.valueOf(uVar.f123340g)));
                    j0Var.mo71372a(new C13604l("prefetchId", uVar.f123341h));
                    j0Var.mo71372a(new C13604l("prefetchJS", C110818d0.m150921S(uVar.f123345l, "<br/>", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null)));
                    j0Var.mo71372a(new C13604l("prefetchCSS", C110818d0.m150921S(uVar.f123346m, "<br/>", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null)));
                    j0Var.mo71372a(new C13604l("section", "Prefetch Headers"));
                    HashMap<String, String> hashMap = uVar.f123347n;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry next2 : hashMap.entrySet()) {
                        String str13 = (String) next2.getValue();
                        String lowerCase = C112550d0.m153799i0((String) next2.getKey()).toString().toLowerCase();
                        C87412m.m108593f(lowerCase, "this as java.lang.String).toLowerCase()");
                        if (C112551y.m153819s(lowerCase, "x-wx-", false)) {
                            linkedHashMap.put(next2.getKey(), next2.getValue());
                        }
                    }
                    Object[] array2 = C13801s0.m13103o(linkedHashMap).toArray(new C13604l[0]);
                    C87412m.m108592e(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    j0Var.mo71373b(array2);
                    uVar.mo71121c("['PageAppear', 'WebView', 'GetA8key', 'ClientLoadToNavStart', 'DomainLookUp', 'ConnectStart', 'Response', 'DomLoadingToInteractive', 'Invoker', 'WebViewUICreate', 'FCPToFetchStart']", str12, mMWebView2, C64197v.m75537f(j0Var.mo71375d(new C13604l[j0Var.mo71374c()])));
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C43522y(com.tencent.p014mm.p136ui.widget.MMWebView r13, com.tencent.p014mm.plugin.webview.model.C43704h2 r14, e00.C45520t.C45522b r15, java.util.Set r16, t83.C13853i r17, int r18, gy3.C8480h r19) {
        /*
            r12 = this;
            r0 = r18 & 2
            if (r0 == 0) goto L_0x000a
            com.tencent.mm.plugin.webview.model.h2 r0 = new com.tencent.mm.plugin.webview.model.h2
            r0.<init>()
            goto L_0x000b
        L_0x000a:
            r0 = r14
        L_0x000b:
            r1 = r18 & 4
            if (r1 == 0) goto L_0x0020
            e00.t$b r1 = new e00.t$b
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 127(0x7f, float:1.78E-43)
            r11 = 0
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0021
        L_0x0020:
            r1 = r15
        L_0x0021:
            r2 = r18 & 8
            r3 = 0
            if (r2 == 0) goto L_0x0028
            r2 = r3
            goto L_0x002a
        L_0x0028:
            r2 = r16
        L_0x002a:
            r4 = r18 & 16
            if (r4 == 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r3 = r17
        L_0x0031:
            r14 = r12
            r15 = r13
            r16 = r0
            r17 = r1
            r18 = r2
            r19 = r3
            r14.<init>(r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.core.C43522y.<init>(com.tencent.mm.ui.widget.MMWebView, com.tencent.mm.plugin.webview.model.h2, e00.t$b, java.util.Set, t83.i, int, gy3.h):void");
    }

    /* renamed from: i1 */
    public static final void m47162i1(C43522y yVar, int i) {
        yVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putInt("update_type_key", i);
        try {
            yVar.mo67731m().mo68145pG(1, bundle, yVar.mo67719g());
        } catch (Exception e) {
            String t1 = yVar.mo67822t1();
            Log.m105920e(t1, "doUpdate fail, ex = " + e.getMessage());
        }
    }

    /* renamed from: j1 */
    public static final void m47163j1(C43522y yVar, int i) {
        yVar.getClass();
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("scene_end_type", i);
            bundle.putInt("scene_end_listener_hash_code", yVar.mo67818p1().mo67833e());
            yVar.mo67731m().mo68145pG(6, bundle, yVar.mo67818p1().mo67833e());
        } catch (Exception e) {
            String t1 = yVar.mo67822t1();
            Log.m105920e(t1, "removeSceneEnd, ex = " + e.getMessage());
        }
    }

    /* renamed from: D0 */
    public boolean mo63665D0() {
        for (C43505b0 k : this.f117545S) {
            if (!k.mo67781k(mo63683n0())) {
                return false;
            }
        }
        String stringExtra = mo67715e0().getStringExtra("data");
        return (stringExtra == null || C112551y.m153811k(stringExtra)) && !this.f117555b.f123183e;
    }

    /* renamed from: F0 */
    public void mo67672F0() {
        int i;
        int i2;
        String str;
        if (mo67757y0()) {
            Log.m105920e(mo67822t1(), "onBinded call when activity has been finished");
            return;
        }
        this.f117543Q.mo73829a("onPostBindedStart", System.currentTimeMillis());
        C45605v vVar = this.f117569i;
        if (vVar != null) {
            vVar.f123364g = vVar.f123366i - vVar.f123365h;
            vVar.f123362e = C86709a0.m107531m().mo58407a().f124992e.f125000h > vVar.f123358a;
            Log.m105924i("MicroMsg.WebViewPerformanceMonitor", "Web-Trace Report kernelMode=" + vVar.f123359b + ", progressMode=" + vVar.f123360c + ", progressLaunchTime=" + vVar.f123361d + ", isProgressColdLaunch=" + vVar.f123362e + ", webViewCreateTime=" + vVar.f123363f + ", bindCostTime=" + vVar.f123364g + ",isMPPreloadController=" + vVar.f123367j + ", isRenderProcessInit:" + vVar.f123370m + ", isGPUProcessInit:" + vVar.f123372o + ", isRenderSandBoxProcessInit:" + vVar.f123371n);
            C115669n nVar = C115669n.INSTANCE;
            Object[] objArr = new Object[19];
            objArr[0] = Integer.valueOf(vVar.f123359b);
            objArr[1] = Integer.valueOf(vVar.f123360c);
            objArr[2] = Long.valueOf(vVar.f123361d);
            objArr[3] = Integer.valueOf(vVar.f123362e ? 1 : 0);
            objArr[4] = Long.valueOf(vVar.f123363f);
            objArr[5] = Long.valueOf(vVar.f123364g);
            objArr[6] = Integer.valueOf(vVar.f123367j ? 1 : 0);
            objArr[7] = Integer.valueOf(XWebSdk.getXWebSdkVersion());
            objArr[8] = Integer.valueOf(XWebSdk.getInstalledNewstVersion(MMApplicationContext.getContext()));
            objArr[9] = Integer.valueOf(XWebSdk.getMultiProcessType());
            objArr[10] = Integer.valueOf(XWebSdk.getEnableSandbox() ? 1 : 2);
            objArr[11] = 0;
            objArr[12] = 0;
            objArr[13] = Integer.valueOf(vVar.f123370m ? 2 : 1);
            objArr[14] = Integer.valueOf(vVar.f123371n ? 2 : 1);
            objArr[15] = Integer.valueOf(vVar.f123372o ? 2 : 1);
            objArr[16] = "";
            objArr[17] = 3;
            objArr[18] = Integer.valueOf(vVar.f123368k ? 1 : 0);
            nVar.mo160131h(25365, objArr);
        }
        Log.m105924i(mo67822t1(), "Abe-Debug onPostBindedStart");
        C44130p1 p1Var = C44130p1.f119545i;
        p1Var.f119553h = mo67731m();
        String stringExtra = mo67715e0().getStringExtra("ad_info");
        if (stringExtra != null) {
            C43791l lVar = p1Var.f119553h;
            if (lVar != null) {
                try {
                    str = lVar.mo68114V5(23, (Bundle) null).getString("config_info_username");
                } catch (RemoteException e) {
                    Log.m105921e("MicroMsg.WebViewReportUtil", "setTraceId getConfigInfo exp:%s", e);
                }
                p1Var.mo68775f(stringExtra, str);
            }
            str = "";
            p1Var.mo68775f(stringExtra, str);
        }
        this.f117543Q.mo73829a("onJSAPIStart", System.currentTimeMillis());
        Bundle bundleExtra = mo67715e0().getBundleExtra("jsapiargs");
        if (bundleExtra == null) {
            bundleExtra = new Bundle();
        }
        Bundle bundle = bundleExtra;
        bundle.putInt("key_download_restrict", mo67715e0().getIntExtra("key_download_restrict", 0));
        bundle.putString("key_function_id", mo67715e0().getStringExtra("key_function_id"));
        Log.m105925i(mo67822t1(), "KDownloadRestrict = %d, KFunctionID = %s", Integer.valueOf(bundle.getInt("key_download_restrict", 0)), bundle.getString("key_function_id", ""));
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("jsapiargs", bundle);
        bundle2.putCharSequence("bizofstartfrom", mo67715e0().getStringExtra("bizofstartfrom"));
        bundle2.putBundle("startwebviewparams", mo67715e0().getBundleExtra("startwebviewparams"));
        Iterator<C43505b0> it = this.f117545S.iterator();
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            C43505b0 next = it.next();
            if (next.mo67778e() != -1) {
                i = next.mo67778e();
                break;
            }
        }
        bundle2.putInt("screen_orientation", i);
        try {
            mo67731m().mo68145pG(20, bundle2, mo67719g());
        } catch (RemoteException e2) {
            String t1 = mo67822t1();
            Log.m105920e(t1, "postBinded, invoke AC_SET_INITIAL_ARGS, ex = " + e2.getMessage());
        }
        String stringExtra2 = mo67715e0().getStringExtra("geta8key_username");
        int intExtra = mo67715e0().getIntExtra("preChatTYPE", 0);
        String stringExtra3 = mo67715e0().getStringExtra("srcUsername");
        String str2 = "";
        long longExtra = mo67715e0().getLongExtra("message_id", 0);
        int intExtra2 = mo67715e0().getIntExtra("message_index", 0);
        String stringExtra4 = mo67715e0().getStringExtra("KsnsViewId");
        String stringExtra5 = mo67715e0().getStringExtra("KPublisherId");
        String stringExtra6 = mo67715e0().getStringExtra("KAppId");
        if (stringExtra6 == null) {
            stringExtra6 = mo67715e0().getStringExtra("geta8key_open_webview_appid");
        }
        String str3 = "message_index";
        String stringExtra7 = mo67715e0().getStringExtra("pre_username");
        String str4 = "message_id";
        String stringExtra8 = mo67715e0().getStringExtra("expid_str");
        String string = bundle.getString("key_snsad_statextstr");
        C43699e2 k = this.f117672L0.mo68013k();
        k.f118082a = stringExtra2;
        k.f118099r = intExtra;
        k.f118083b = mo63683n0();
        k.f118090i = intExtra2;
        k.f118086e = mo67729k0(stringExtra2);
        k.f118089h = longExtra;
        k.f118093l = new C77710q(longExtra).toString();
        k.f118084c = stringExtra3;
        k.f118085d = stringExtra4;
        k.f118091j = stringExtra5;
        k.f118092k = stringExtra6;
        k.f118094m = stringExtra7;
        k.f118095n = this.f117689c1;
        k.f118096o = string;
        k.f118097p = mo67819q1();
        k.f118100s = stringExtra8;
        String stringExtra9 = mo67715e0().getStringExtra("share_report_pre_msg_desc");
        if (stringExtra9 == null) {
            stringExtra9 = str2;
        }
        k.f118098q = stringExtra9;
        C46206e.C46209c cVar = this.f117565g;
        C87412m.m108594g(cVar, "browseInfo");
        k.f118102u = cVar;
        C43703h1 i3 = this.f117672L0.mo68011i();
        i3.f118109a = stringExtra5;
        i3.f118114f = mo67729k0(stringExtra2);
        this.f117672L0.mo68006b().f118139c = mo63683n0();
        if (mo67826x1()) {
            try {
                Bundle bundle3 = new Bundle();
                bundle3.putString("srcUsername", mo67715e0().getStringExtra("srcUsername"));
                mo67731m().mo68145pG(29, bundle3, mo67719g());
            } catch (Exception unused) {
            }
        }
        if (!Util.isNullOrNil(stringExtra3)) {
            try {
                mo67731m().Th0(stringExtra3);
            } catch (Exception e3) {
                String t15 = mo67822t1();
                Log.m105920e(t15, "postBinded, fail triggerGetContact, ex = " + e3.getMessage());
            }
        }
        try {
            mo67825w1();
        } catch (Exception unused2) {
            Log.m105920e(mo67822t1(), "hy: init pay channel failed");
        }
        ((ArrayList) this.f117699m1).clear();
        C48590l g0 = mo67720g0();
        String stringExtra10 = mo67715e0().getStringExtra("geta8key_username");
        String str5 = str4;
        String str6 = str3;
        HashMap e4 = C90364q0.m113146e(new C13604l(str5, Long.valueOf(mo67715e0().getLongExtra(str5, 0))), new C13604l(str6, Integer.valueOf(mo67715e0().getIntExtra(str6, 0))), new C13604l(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, Integer.valueOf(mo67729k0(stringExtra10))), new C13604l("pay_channel", Integer.valueOf(mo67715e0().getIntExtra("pay_channel", 0))), new C13604l("stastic_scene", Integer.valueOf(mo67715e0().getIntExtra("stastic_scene", 0))), new C13604l("from_scence", Integer.valueOf(mo67715e0().getIntExtra("from_scence", 0))));
        String stringExtra11 = mo67715e0().getStringExtra("srcUsername");
        if (!(stringExtra11 == null || C112551y.m153811k(stringExtra11))) {
            e4.putAll(C90364q0.m113146e(new C13604l("srcUsername", mo67715e0().getStringExtra("srcUsername")), new C13604l("srcDisplayname", mo67715e0().getStringExtra("srcDisplayname"))));
        } else {
            if (!(stringExtra10 == null || C112551y.m153811k(stringExtra10))) {
                e4.put("srcUsername", stringExtra10);
            }
        }
        if (!Util.isNullOrNil(mo67715e0().getStringExtra("KTemplateId"))) {
            e4.put("KTemplateId", String.valueOf(mo67715e0().getStringExtra("KTemplateId")));
        }
        int intExtra3 = mo67715e0().getIntExtra("pay_scene", -1);
        if (intExtra3 != -1) {
            Log.m105925i(mo67822t1(), "get pay scene from extra: %s", Integer.valueOf(intExtra3));
        } else {
            Log.m105925i(mo67822t1(), "default pay scene to: %s", 3);
            intExtra3 = 3;
        }
        e4.put("pay_scene", Integer.valueOf(intExtra3));
        g0.f130002g = e4;
        List<C53298a> list = this.f117699m1;
        ArrayList arrayList = new ArrayList();
        arrayList.add(mo67720g0());
        arrayList.add(this.f117700n1);
        arrayList.add(this.f117701o1);
        arrayList.add(this.f117702p1);
        arrayList.add(this.f117703q1);
        arrayList.add(this.f117704r1);
        arrayList.add(this.f117705s1);
        arrayList.add(this.f117708v1);
        arrayList.add(this.f117711y1);
        arrayList.add(this.f117712z1);
        arrayList.add(this.f117668B1);
        arrayList.add(this.f117710x1);
        arrayList.add(this.f117667A1);
        arrayList.add(this.f117709w1);
        if (mo67715e0().getBooleanExtra("allow_wx_schema_url", false)) {
            arrayList.add(this.f117671E1);
        }
        arrayList.add(this.f117670D1);
        ((ArrayList) list).addAll(arrayList);
        Log.m105925i(mo67822t1(), "Abe-Debug controllerListeners call, size = %d", Integer.valueOf(this.f117547U.size()));
        for (C43558z zVar : this.f117547U) {
            long currentTimeMillis = System.currentTimeMillis();
            zVar.mo64862e();
            Log.m105919d(mo67822t1(), "%s.onBinded cost: %d", zVar, Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        }
        C115669n.INSTANCE.idkeyStat(64, 0, 1, false);
        try {
            i2 = Util.getInt(mo67731m().mf0("WebviewDisableDigestVerify"), 0);
        } catch (Exception e5) {
            String t16 = mo67822t1();
            Log.m105928w(t16, "getting js digest verification config fails, ex = " + e5.getMessage());
            i2 = 0;
        }
        Log.m105925i(mo67822t1(), "js digest verification config = %d", Integer.valueOf(i2));
        if (i2 == 0) {
            SharedPreferences sharedPreferences = mo67707a0().getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4);
            C87412m.m108593f(sharedPreferences, "context.getSharedPrefere…ntext.MODE_MULTI_PROCESS)");
            if (sharedPreferences.getBoolean("wvsha1", true) && this.f117555b.f123181c) {
                mo67720g0().mo73259t0(true);
            }
        }
        try {
            mo67827y1(mo63683n0());
        } catch (Exception e6) {
            String t17 = mo67822t1();
            Log.m105928w(t17, "postBinded, jumpToActivity, ex = " + e6.getMessage());
        }
        this.f117543Q.mo73829a("onPostBindedEnd", System.currentTimeMillis());
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0057  */
    /* renamed from: H0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo67676H0() {
        /*
            r11 = this;
            com.tencent.mm.plugin.webview.stub.l r0 = r11.mo67731m()     // Catch:{ Exception -> 0x002a }
            boolean r0 = r0.mo68094Fu()     // Catch:{ Exception -> 0x002a }
            if (r0 == 0) goto L_0x0047
            e00.t$b r0 = r11.f117555b     // Catch:{ Exception -> 0x002a }
            boolean r0 = r0.f123182d     // Catch:{ Exception -> 0x002a }
            if (r0 == 0) goto L_0x0021
            android.content.Context r0 = r11.mo67707a0()     // Catch:{ Exception -> 0x002a }
            com.tencent.mm.plugin.webview.stub.l r1 = r11.mo67731m()     // Catch:{ Exception -> 0x002a }
            java.lang.String r2 = r11.mo63683n0()     // Catch:{ Exception -> 0x002a }
            int r0 = ea3.C45598m.m50660b(r0, r1, r2)     // Catch:{ Exception -> 0x002a }
            goto L_0x0048
        L_0x0021:
            android.content.Context r0 = r11.mo67707a0()     // Catch:{ Exception -> 0x002a }
            int r0 = ea3.C45598m.m50659a(r0)     // Catch:{ Exception -> 0x002a }
            goto L_0x0048
        L_0x002a:
            r0 = move-exception
            java.lang.String r1 = r11.mo67822t1()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "onLoadJsApiFinished, ex = "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
        L_0x0047:
            r0 = 2
        L_0x0048:
            r11.mo67828z1(r0)
            com.tencent.mm.ui.widget.MMWebView r0 = r11.f117553a
            java.lang.String r0 = r0.getUrl()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 != 0) goto L_0x012c
            java.util.Set<java.lang.String> r1 = r11.f117694h1
            gy3.C87412m.m108591d(r0)
            java.util.HashSet r1 = (java.util.HashSet) r1
            boolean r1 = r1.add(r0)
            if (r1 == 0) goto L_0x012c
            d93.h r1 = r11.f117539M
            com.tencent.mm.protocal.GeneralControlWrapper r1 = r1.mo70859b()
            java.lang.String r2 = "wvPerm.genCtrl"
            gy3.C87412m.m108593f(r1, r2)
            int r2 = r1.f121046d
            r2 = r2 & 512(0x200, float:7.175E-43)
            r3 = 1
            r4 = 0
            if (r2 <= 0) goto L_0x007a
            r2 = 1
            goto L_0x007b
        L_0x007a:
            r2 = 0
        L_0x007b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "allowUploadHosts, ret = "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "MicroMsg.GeneralControlWrapper"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r5)
            if (r2 == 0) goto L_0x00d9
            t83.l r2 = r11.mo67720g0()
            java.lang.Object[] r5 = new java.lang.Object[r3]
            boolean r7 = r2.f130003h
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r5[r4] = r7
            java.lang.String r7 = "MicroMsg.JsApiHandler"
            java.lang.String r8 = "getAllHostsInPage, ready(%s)."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r5)
            com.tencent.mm.ui.widget.MMWebView r5 = r2.f129996a
            if (r5 == 0) goto L_0x00d9
            boolean r7 = r2.f130003h
            if (r7 == 0) goto L_0x00d9
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "javascript:WeixinJSBridge._handleMessageFromWeixin("
            r7.append(r8)
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            boolean r9 = r2.f130011p
            java.lang.String r2 = r2.f130012q
            java.lang.String r10 = "sys:get_all_hosts"
            java.lang.String r2 = t83.C13851h1.C13852a.m13143c(r10, r8, r9, r2)
            r7.append(r2)
            java.lang.String r2 = ")"
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            r7 = 0
            r5.evaluateJavascript(r2, r7)
        L_0x00d9:
            int r1 = r1.f121046d
            r1 = r1 & 1024(0x400, float:1.435E-42)
            if (r1 <= 0) goto L_0x00e1
            r1 = 1
            goto L_0x00e2
        L_0x00e1:
            r1 = 0
        L_0x00e2:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "allowUploadHTML, ret = "
            r2.append(r5)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r2)
            if (r1 == 0) goto L_0x0100
            t83.l r0 = r11.mo67720g0()
            r0.mo73261v(r4)
            return
        L_0x0100:
            com.tencent.mm.plugin.webview.model.q1 r1 = r11.f117685Y0
            r1.getClass()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 == 0) goto L_0x010c
            goto L_0x0123
        L_0x010c:
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r0 = r0.getHost()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 == 0) goto L_0x011b
            goto L_0x0123
        L_0x011b:
            java.util.Set<java.lang.String> r1 = r1.f118178b
            java.util.HashSet r1 = (java.util.HashSet) r1
            boolean r4 = r1.remove(r0)
        L_0x0123:
            if (r4 == 0) goto L_0x012c
            t83.l r0 = r11.mo67720g0()
            r0.mo73261v(r3)
        L_0x012c:
            super.mo67676H0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.core.C43522y.mo67676H0():void");
    }

    /* renamed from: I */
    public void mo67677I(Intent intent) {
        C87412m.m108594g(intent, "intent");
        super.mo67677I(intent);
        if (!this.f117687a1) {
            C0258b bVar = C0258b.f802a;
            String n0 = mo63683n0();
            boolean z = false;
            if ((n0 == null || n0.length() == 0 ? false : C112550d0.m153803w(n0, "adCgiRedirect=1", false, 2, (Object) null)) || bVar.mo299d(n0)) {
                boolean c = bVar.mo298c();
                Log.m105924i("MicroMsg.WebViewHighRiskAdH5Interceptor", "checkInitAdInterceptor, controller.hash=" + hashCode() + "，rawUrl=" + mo63683n0() + ", expt=" + c);
                String n05 = mo63683n0();
                if (!(n05 == null || n05.length() == 0)) {
                    z = C112550d0.m153803w(n05, "adCgiRedirect=1", false, 2, (Object) null);
                }
                boolean d = bVar.mo299d(mo63683n0());
                if (z) {
                    C115669n.INSTANCE.mo175911u(1951, 2);
                }
                if (d) {
                    C115669n.INSTANCE.mo175911u(1951, 11);
                }
                if (c) {
                    mo67679J(new C39746d());
                    this.f117687a1 = true;
                    C115669n.INSTANCE.mo175911u(1951, 1);
                }
            }
        }
        Log.m105918d(StringKtKt.TAG, "start, controller.hash=" + hashCode() + "， rawUrl=" + mo63683n0() + '}');
    }

    /* renamed from: I0 */
    public void mo67678I0() {
        C13601g gVar = C46206e.f124554a;
        C115669n.INSTANCE.mo175913w(1200, 100, 1);
        for (C43558z zVar : this.f117547U) {
            if (zVar instanceof C43504a0) {
                ((C43504a0) zVar).mo63690r(this.f117543Q);
            }
        }
        C45604u uVar = this.f117543Q;
        MMWebView mMWebView = this.f117553a;
        C43557z zVar2 = new C43557z(this);
        uVar.getClass();
        C87412m.m108594g(mMWebView, "webView");
        mMWebView.evaluateJavascript("JSON.stringify(Object.assign({timing: performance && performance.timing}, {paint:{'firstContentfulPaint':(function(p){return p[0] && parseInt(p[0].startTime + performance.timeOrigin)})(performance.getEntriesByName('first-contentful-paint'))}}))", new C45603t(uVar, zVar2));
    }

    /* renamed from: K0 */
    public boolean mo65766k(int i, String str, C52018xt1 xt12) {
        C87412m.m108594g(str, "reqUrl");
        C87412m.m108594g(xt12, "response");
        C49082d20 d202 = xt12.f144955u;
        this.f117669C1 = d202 != null ? d202.f132073d : -1;
        C43704h2 h2Var = this.f117672L0;
        String str2 = xt12.f144941d;
        C87412m.m108593f(str2, "response.FullURL");
        boolean s = C112551y.m153819s(str2, HttpWrapperBase.PROTOCAL_HTTPS, false);
        h2Var.getClass();
        C43704h2.f118116s = 0;
        if (s) {
            C43704h2.f118117t = 1;
        } else {
            C43704h2.f118117t = 0;
        }
        C43704h2 h2Var2 = this.f117672L0;
        if (h2Var2.f118119b == null) {
            h2Var2.f118119b = new C43704h2.C43714k(h2Var2);
        }
        h2Var2.f118119b.mo68020a(str, true);
        C43704h2.C43709f f = this.f117672L0.mo68009f();
        int i2 = C53094h.f148187c;
        String o1 = mo67817o1();
        f.f118147e = i2;
        f.f118148f = o1;
        String str3 = xt12.f144941d;
        if (Util.isNullOrNil(str3)) {
            Log.m105920e("MicroMsg.WebviewReporter", "WebViewRenderReporter.onPageStart failed, url is null");
        } else {
            f.f118145c = str3;
            f.f118146d = true;
            if (!f.f118143a.containsKey(str3)) {
                f.f118143a.put(str3, Long.valueOf(Util.nowMilliSecond()));
            }
            if (!f.f118144b.containsKey(str3)) {
                f.f118144b.put(str3, Long.valueOf(Util.nowMilliSecond()));
            }
        }
        return super.mo65766k(i, str, xt12);
    }

    /* renamed from: L0 */
    public void mo67683L0(C43791l lVar) {
        String t1 = mo67822t1();
        Object[] objArr = new Object[1];
        objArr[0] = Boolean.valueOf(lVar == null);
        Log.m105925i(t1, "onServiceConnected, invoker == null ? %b", objArr);
        if (lVar == null) {
            Log.m105922f(mo67822t1(), "service connect success, while invoker is null");
            mo67674G0();
            return;
        }
        try {
            lVar.Np0(mo67818p1(), mo67818p1().mo67833e());
        } catch (Exception e) {
            Log.m105921e(mo67822t1(), "addCallback fail, ex = %s", e.getMessage());
        }
    }

    /* renamed from: M */
    public boolean mo63673M(String str) {
        return false;
    }

    /* renamed from: M0 */
    public boolean mo67684M0() {
        boolean z;
        Log.m105924i(mo67822t1(), "edw onServiceDisconnected");
        Iterator<C43505b0> it = this.f117545S.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().mo67787u()) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            return false;
        }
        Log.m105924i(mo67822t1(), "maybe mm process crash, try rebind service");
        return true;
    }

    /* renamed from: N0 */
    public void mo63674N0() {
        C45764a aVar = C45764a.StartLoad;
        C45765b bVar = C45765b.NothingComplete;
        Iterator<C43505b0> it = this.f117545S.iterator();
        while (it.hasNext()) {
            if (it.next().mo67785p(mo63683n0(), mo67715e0())) {
                return;
            }
        }
        if (!mo67823u1(mo63683n0())) {
            if (mo63665D0()) {
                Log.m105924i(mo67822t1(), "needSyncGetA8Key");
                C45766c cVar = this.f117563f;
                cVar.getClass();
                cVar.f123647n = bVar;
                C45767f.f123649a.mo71242b(aVar, this.f117563f);
                BaseWebViewController.m47006a1(this, mo63683n0(), false, 0, 6, (Object) null);
                return;
            }
            String t1 = mo67822t1();
            Log.m105924i(t1, "terry onStartLoad:" + mo63683n0());
            String str = (String) ((C36570n) this.f117552Z).getValue();
            if (!(str == null || C112551y.m153811k(str))) {
                Log.m105924i(mo67822t1(), str);
                if (mo67715e0().getBooleanExtra("QRDataFlag", true)) {
                    try {
                        str = mo67731m().mo68144nP(str);
                    } catch (Exception e) {
                        String t15 = mo67822t1();
                        Log.m105928w(t15, "postBinded, formatQRString, ex = " + e.getMessage());
                    }
                }
                this.f117553a.getSettings().setUseWideViewPort(false);
                this.f117553a.getSettings().setLoadWithOverviewMode(false);
                this.f117553a.getSettings().setJavaScriptEnabled(false);
                Iterator<C43558z> it4 = this.f117547U.iterator();
                while (it4.hasNext()) {
                    it4.next().mo67860p(true);
                }
                this.f117553a.loadDataWithBaseURL((String) null, str, "text/html", "utf-8", (String) null);
                String t16 = mo67822t1();
                Log.m105924i(t16, "loadDataWithBaseUrl, data = " + str);
            } else if (mo67696T(mo63683n0())) {
                String t17 = mo67822t1();
                Log.m105922f(t17, "postBinded 2, canLoadUrl fail, url = " + mo63683n0());
            } else {
                if (this.f117555b.f123183e) {
                    this.f117539M.mo70864g(mo63683n0(), (JsapiPermissionWrapper) null, (GeneralControlWrapper) null);
                }
                Iterator<C43505b0> it5 = this.f117545S.iterator();
                while (it5.hasNext()) {
                    if (it5.next().mo67784o(mo63683n0())) {
                        return;
                    }
                }
                if (!this.f117553a.f122355e) {
                    C45766c cVar2 = this.f117563f;
                    cVar2.getClass();
                    cVar2.f123647n = bVar;
                    C45767f.f123649a.mo71242b(aVar, this.f117563f);
                    Iterator<C43558z> it6 = this.f117547U.iterator();
                    while (it6.hasNext()) {
                        it6.next().mo67860p(false);
                    }
                    C45520t.C45521a.m50512a(this, mo63683n0(), (Map) null, false, 6, (Object) null);
                }
            }
        }
    }

    /* renamed from: O0 */
    public boolean mo67687O0(int i, String str, C52018xt1 xt12) {
        C87412m.m108594g(str, "reqUrl");
        C87412m.m108594g(xt12, "resp");
        int i2 = xt12.f144943f;
        String str2 = xt12.f144941d;
        if (i2 == 3) {
            String t1 = mo67822t1();
            Log.m105924i(t1, "getA8key-app: " + str2);
            if (str2 == null || str2.length() == 0) {
                Log.m105920e(mo67822t1(), "getA8key-app, fullUrl is null");
                return false;
            }
            mo67814l1(str2);
            return true;
        } else if (i2 == 4) {
            C87412m.m108593f(str2, "fullUrl");
            if (Util.isNullOrNil(str2)) {
                Log.m105920e(mo67822t1(), "search contact err: null or nill url");
            } else {
                mo67813k1(106);
                Bundle bundle = new Bundle();
                bundle.putString("search_contact_data_url", str2);
                bundle.putInt("webview_binder_id", mo67818p1().mo67833e());
                try {
                    mo67731m().mo68108RV(106, bundle);
                } catch (Exception e) {
                    String t15 = mo67822t1();
                    Log.m105928w(t15, "startSearchContact, ex = " + e.getMessage());
                }
            }
            return true;
        } else if (i2 != 20) {
            return super.mo67687O0(i, str, xt12);
        } else {
            C87412m.m108593f(str2, "fullUrl");
            mo67813k1(106);
            Bundle bundle2 = new Bundle();
            bundle2.putString("emoji_store_jump_url", str2);
            bundle2.putInt("webview_binder_id", mo67818p1().mo67833e());
            try {
                mo67731m().mo68108RV(C90210f.CTRL_INDEX, bundle2);
            } catch (Exception e2) {
                String t16 = mo67822t1();
                Log.m105928w(t16, "startSearchContact, ex = " + e2.getMessage());
            }
            return true;
        }
    }

    /* renamed from: P0 */
    public boolean mo67689P0(WebView webView, String str) {
        C87412m.m108594g(webView, "webView");
        C87412m.m108594g(str, "url");
        String t1 = mo67822t1();
        Log.m105924i(t1, "WebView-Trace shouldOverride url = " + str);
        if (!this.f117700n1.mo67847c(str) && this.f117555b.f123185g) {
            if (C43757o.f118236a == null) {
                C43757o.f118236a = new ArrayList<>();
            }
            if (!C43757o.f118236a.contains(str)) {
                C43757o.f118236a.add(str);
            }
        }
        C43505b0.C43506a x0 = mo67755x0(webView, str);
        if (x0.f117638a) {
            return x0.f117639b;
        }
        if (mo67696T(str)) {
            String t15 = mo67822t1();
            Log.m105922f(t15, "shouldOverrideUrlLoading, canLoadUrl fail, url = " + str);
            return true;
        } else if (C12969d.m12408b(str, "about:blank", true)) {
            Log.m105920e(mo67822t1(), "shouldOverride, url is about:blank");
            return true;
        } else if (((C48455p) C86312j.m106911c(C48455p.class)).mo60667qU(str, mo67817o1(), webView)) {
            Log.m105924i(mo67822t1(), "use the downloader to download");
            return true;
        } else if (C12969d.m12408b(str, "weixinping://iframe", true) || C12969d.m12408b(str, "weixinpreinject://iframe", true)) {
            return true;
        } else {
            if (mo67815m1(str)) {
                String t16 = mo67822t1();
                Log.m105924i(t16, "weixin scheme url deal success, url = " + str);
                return true;
            } else if (mo67814l1(str)) {
                String t17 = mo67822t1();
                Log.m105924i(t17, "custom scheme url deal success, url = " + str);
                return true;
            } else {
                C43692a.m47525c(webView instanceof MMWebView ? (MMWebView) webView : null, str);
                return false;
            }
        }
    }

    /* renamed from: S */
    public String mo67694S(String str) {
        String str2;
        Throwable th;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Bundle bundle = new Bundle();
        bundle.putInt("webview_binder_id", mo67719g());
        bundle.putString("rawUrl", str);
        try {
            str2 = Util.nullAsNil(mo67731m().mo68114V5(76, bundle).getString("appId"));
            C87412m.m108593f(str2, "nullAsNil(data.getString(\"appId\"))");
            try {
                Log.m105925i(mo67822t1(), "stev cachedAppId %s", str2);
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            str2 = "";
            Log.m105929w(mo67822t1(), "get cachedAppId error %s", th.getMessage());
            return str2;
        }
        return str2;
    }

    /* renamed from: U0 */
    public void mo67699U0() {
        String str;
        String str2;
        String str3;
        Log.m105918d(mo67822t1(), "setGetA8KeyParams");
        byte[] byteArrayExtra = mo67715e0().getByteArrayExtra("key_scan_qr_code_get_a8key_req");
        byte[] byteArrayExtra2 = mo67715e0().getByteArrayExtra("key_scan_qr_code_get_a8key_resp");
        if (!(byteArrayExtra == null || byteArrayExtra2 == null)) {
            Log.m105924i(mo67822t1(), "set outer get A8key result");
            C45298c U = mo67698U();
            U.getClass();
            if (byteArrayExtra.length > 0 && byteArrayExtra2.length > 0) {
                C51874wt1 wt12 = new C51874wt1();
                C52018xt1 xt12 = new C52018xt1();
                try {
                    wt12.parseFrom(byteArrayExtra);
                    xt12.parseFrom(byteArrayExtra2);
                    U.f122698o = wt12.f144272i.f141175d;
                } catch (Exception unused) {
                }
                if (Util.isNullOrNil(U.f122698o) || xt12.f144941d == null) {
                    Log.m105920e("MicroMsg.LuggageGetA8Key", "ReqUrl or FullUrl is null");
                } else {
                    U.f122699p = xt12;
                    U.f122700q = wt12;
                }
            }
        }
        String stringExtra = mo67715e0().getStringExtra("geta8key_username");
        String stringExtra2 = mo67715e0().getStringExtra("msgUsername");
        String stringExtra3 = mo67715e0().getStringExtra("serverMsgID");
        String str4 = "";
        mo67698U().f122703t = stringExtra2 == null ? str4 : stringExtra2;
        C45298c U2 = mo67698U();
        String stringExtra4 = mo67715e0().getStringExtra("kReferrer");
        U2.f122686c = stringExtra4;
        boolean z = true;
        Log.m105919d("MicroMsg.LuggageGetA8Key", "setReferrer referrer = %s", stringExtra4);
        mo67698U().f122704u = stringExtra3;
        mo67698U().f122688e = stringExtra == null ? str4 : stringExtra;
        mo67698U().f122685b = mo67729k0(stringExtra);
        mo67698U().f122689f = mo67715e0().getStringExtra("geta8key_open_webview_appid");
        mo67698U().f122687d = 0;
        mo67698U().f122691h = mo67715e0().getByteArrayExtra("geta8key_cookie");
        mo67698U().f122696m = mo67715e0().getIntExtra("key_wallet_region", 0);
        C45298c U3 = mo67698U();
        String stringExtra5 = mo67715e0().getStringExtra("key_function_id");
        if (stringExtra5 == null) {
            stringExtra5 = str4;
        }
        U3.f122690g = stringExtra5;
        mo67698U().f122708y = mo67715e0().getIntExtra("KMsgType", 0);
        mo67698U().f122709z = mo67715e0().getIntExtra("KAppMsgType", 0);
        int intExtra = mo67715e0().getIntExtra("geta8key_session_id", 0);
        if (intExtra != 0) {
            String t1 = mo67822t1();
            Log.m105924i(t1, "set requestid:" + intExtra);
            mo67698U().f122692i = intExtra;
        }
        if (stringExtra2 == null || stringExtra2.length() == 0) {
            C45298c U4 = mo67698U();
            C51874wt1 wt13 = mo67698U().f122700q;
            if (wt13 == null || (str3 = wt13.f144259G) == null) {
                str3 = str4;
            }
            U4.f122703t = str3;
        }
        if (stringExtra == null || stringExtra.length() == 0) {
            C45298c U5 = mo67698U();
            C51874wt1 wt14 = mo67698U().f122700q;
            if (wt14 == null || (str2 = wt14.f144276p) == null) {
                str2 = str4;
            }
            U5.f122688e = str2;
        }
        if (!(stringExtra3 == null || stringExtra3.length() == 0)) {
            z = false;
        }
        if (z) {
            C45298c U6 = mo67698U();
            C51874wt1 wt15 = mo67698U().f122700q;
            if (!(wt15 == null || (str = wt15.f144260H) == null)) {
                str4 = str;
            }
            U6.f122704u = str4;
        }
    }

    /* renamed from: b0 */
    public Set<String> mo67708b0() {
        return (Set) ((C36570n) this.f117681U0).getValue();
    }

    /* renamed from: c1 */
    public void mo67711c1(boolean z, String str, JsapiPermissionWrapper jsapiPermissionWrapper) {
        WebViewUIStyleHelper webViewUIStyleHelper;
        WebViewUI webViewUI;
        C87412m.m108594g(str, "uiConfig");
        if (z) {
            if ((str.length() > 0) && (webViewUIStyleHelper = this.f117676P0) != null && (webViewUI = webViewUIStyleHelper.f118667d) != null && webViewUIStyleHelper.f118668e != null && webViewUI.f118478O1 != null && jsapiPermissionWrapper != null) {
                try {
                    JSONArray optJSONArray = new JSONObject(str).optJSONArray("uiConfigs");
                    if (optJSONArray == null) {
                        return;
                    }
                    if (optJSONArray.length() > 0) {
                        int length = optJSONArray.length();
                        for (int i = 0; i < length; i++) {
                            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                            if (optJSONObject != null) {
                                webViewUIStyleHelper.mo68369a(optJSONObject.optString("func"), optJSONObject.optJSONObject("data"), jsapiPermissionWrapper);
                            }
                        }
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.WebViewUIStyleHelper", e, "configWebPrefetchUIStyle exception", new Object[0]);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x016c A[Catch:{ Exception -> 0x0172 }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo67812d() {
        /*
            r9 = this;
            boolean r0 = r9.f117531G0
            r1 = 0
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x008a
            t83.l r0 = r9.mo67720g0()
            com.tencent.mm.ui.widget.MMWebView r4 = r9.f117553a
            java.lang.String r5 = "MicroMsg.WebViewReportOnLeaveHelper"
            if (r0 != 0) goto L_0x0017
            java.lang.String r0 = "handler is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r0)
            goto L_0x008a
        L_0x0017:
            java.lang.String r6 = r4.getUrl()
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r7 != 0) goto L_0x008a
            java.net.URL r7 = new java.net.URL     // Catch:{ Exception -> 0x0071 }
            r7.<init>(r6)     // Catch:{ Exception -> 0x0071 }
            java.lang.String r6 = r7.getHost()     // Catch:{ Exception -> 0x0071 }
            r7 = 2131831321(0x7f112a19, float:1.9295664E38)
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.WeChatHosts.domainString(r7)     // Catch:{ Exception -> 0x0071 }
            boolean r5 = r6.equals(r7)     // Catch:{ Exception -> 0x0071 }
            if (r5 != 0) goto L_0x0038
            goto L_0x008a
        L_0x0038:
            com.tencent.mm.plugin.webview.modeltools.y r5 = new com.tencent.mm.plugin.webview.modeltools.y
            r5.<init>(r4)
            boolean r4 = r0.f130003h
            if (r4 != 0) goto L_0x0045
            r5.onReceiveValue(r1)
            goto L_0x006f
        L_0x0045:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            boolean r6 = r0.f130011p
            java.lang.String r7 = r0.f130012q
            java.lang.String r8 = "reportOnLeaveForMP"
            java.lang.String r4 = t83.C13851h1.C13852a.m13143c(r8, r4, r6, r7)
            com.tencent.mm.ui.widget.MMWebView r0 = r0.f129996a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "javascript:WeixinJSBridge._handleMessageFromWeixin("
            r6.append(r7)
            r6.append(r4)
            java.lang.String r4 = ")"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r0.evaluateJavascript(r4, r5)
        L_0x006f:
            r0 = 1
            goto L_0x008b
        L_0x0071:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "create url fail : "
            r4.append(r6)
            java.lang.String r0 = r0.getLocalizedMessage()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
        L_0x008a:
            r0 = 0
        L_0x008b:
            ca3.f r4 = r9.f117677Q0
            if (r4 == 0) goto L_0x00d5
            monitor-enter(r4)
            java.util.Set<xc.a$a> r5 = r4.f107071f     // Catch:{ Exception -> 0x00a8 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x00a8 }
        L_0x0096:
            boolean r6 = r5.hasNext()     // Catch:{ Exception -> 0x00a8 }
            if (r6 == 0) goto L_0x00c3
            java.lang.Object r6 = r5.next()     // Catch:{ Exception -> 0x00a8 }
            xc.a$a r6 = (p830xc.C91165a.C53318a) r6     // Catch:{ Exception -> 0x00a8 }
            r6.onDestroy()     // Catch:{ Exception -> 0x00a8 }
            goto L_0x0096
        L_0x00a6:
            r0 = move-exception
            goto L_0x00d3
        L_0x00a8:
            r5 = move-exception
            java.lang.String r6 = r4.f107070e     // Catch:{ all -> 0x00a6 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a6 }
            r7.<init>()     // Catch:{ all -> 0x00a6 }
            java.lang.String r8 = "onDestroy ex "
            r7.append(r8)     // Catch:{ all -> 0x00a6 }
            java.lang.String r5 = r5.getMessage()     // Catch:{ all -> 0x00a6 }
            r7.append(r5)     // Catch:{ all -> 0x00a6 }
            java.lang.String r5 = r7.toString()     // Catch:{ all -> 0x00a6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r5)     // Catch:{ all -> 0x00a6 }
        L_0x00c3:
            java.util.Set<xc.a$a> r5 = r4.f107071f     // Catch:{ all -> 0x00a6 }
            r5.clear()     // Catch:{ all -> 0x00a6 }
            ba3.d r5 = r4.f107072g     // Catch:{ all -> 0x00a6 }
            if (r5 == 0) goto L_0x00d1
            java.util.Set<ba3.e> r5 = r5.f106660j     // Catch:{ all -> 0x00a6 }
            r5.clear()     // Catch:{ all -> 0x00a6 }
        L_0x00d1:
            monitor-exit(r4)
            goto L_0x00d5
        L_0x00d3:
            monitor-exit(r4)
            throw r0
        L_0x00d5:
            com.tencent.mm.plugin.webview.ui.tools.g1 r4 = r9.f117675O0
            if (r4 == 0) goto L_0x011f
            java.util.Map<java.lang.String, android.util.SparseBooleanArray> r5 = r4.f119129b
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.util.Collection r5 = r5.values()
            java.util.Iterator r5 = r5.iterator()
        L_0x00e5:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00f7
            java.lang.Object r6 = r5.next()
            android.util.SparseBooleanArray r6 = (android.util.SparseBooleanArray) r6
            if (r6 == 0) goto L_0x00e5
            r6.clear()
            goto L_0x00e5
        L_0x00f7:
            java.util.Map<java.lang.String, android.util.SparseBooleanArray> r5 = r4.f119129b
            java.util.HashMap r5 = (java.util.HashMap) r5
            r5.clear()
            java.util.HashMap<java.lang.String, java.lang.Integer> r5 = r4.f119138k
            r5.clear()
            qo3.n r5 = r4.f119144q
            if (r5 == 0) goto L_0x0119
            boolean r5 = r5.mo107563h()
            if (r5 == 0) goto L_0x0112
            qo3.n r5 = r4.f119144q
            r5.mo107572p()
        L_0x0112:
            qo3.n r5 = r4.f119144q
            r5.mo107565j()
            r4.f119144q = r1
        L_0x0119:
            r4.f119136i = r1
            r4.f119145r = r1
            r4.f119150w = r1
        L_0x011f:
            r9.onDestroy()
            com.tencent.mm.ui.widget.MMWebView r4 = r9.f117553a
            java.lang.String r5 = "MicroMsg"
            r4.removeJavascriptInterface(r5)
            com.tencent.mm.ui.widget.MMWebView r4 = r9.f117553a
            java.lang.String r5 = "JsApi"
            r4.removeJavascriptInterface(r5)
            com.tencent.mm.ui.widget.MMWebView r4 = r9.f117553a
            java.lang.String r5 = "__wx"
            r4.removeJavascriptInterface(r5)
            com.tencent.mm.ui.widget.MMWebView r4 = r9.f117553a
            java.lang.String r5 = "CustomFullscreenApi"
            r4.removeJavascriptInterface(r5)
            com.tencent.mm.ui.widget.MMWebView r4 = r9.f117553a
            java.lang.String r5 = "__wxtag"
            r4.removeJavascriptInterface(r5)
            com.tencent.mm.ui.widget.MMWebView r4 = r9.f117553a     // Catch:{ Exception -> 0x0172 }
            r4.setWebChromeClient(r1)     // Catch:{ Exception -> 0x0172 }
            com.tencent.mm.ui.widget.MMWebView r4 = r9.f117553a     // Catch:{ Exception -> 0x0172 }
            r4.setWebViewClient(r1)     // Catch:{ Exception -> 0x0172 }
            com.tencent.mm.ui.widget.MMWebView r4 = r9.f117553a     // Catch:{ Exception -> 0x0172 }
            r4.setOnTouchListener(r1)     // Catch:{ Exception -> 0x0172 }
            com.tencent.mm.ui.widget.MMWebView r4 = r9.f117553a     // Catch:{ Exception -> 0x0172 }
            r4.setOnLongClickListener(r1)     // Catch:{ Exception -> 0x0172 }
            com.tencent.mm.ui.widget.MMWebView r4 = r9.f117553a     // Catch:{ Exception -> 0x0172 }
            r5 = 8
            r4.setVisibility(r5)     // Catch:{ Exception -> 0x0172 }
            com.tencent.mm.ui.widget.MMWebView r4 = r9.f117553a     // Catch:{ Exception -> 0x0172 }
            r4.removeAllViews()     // Catch:{ Exception -> 0x0172 }
            com.tencent.mm.ui.widget.MMWebView r4 = r9.f117553a     // Catch:{ Exception -> 0x0172 }
            r4.clearView()     // Catch:{ Exception -> 0x0172 }
            if (r0 != 0) goto L_0x0184
            com.tencent.mm.ui.widget.MMWebView r0 = r9.f117553a     // Catch:{ Exception -> 0x0172 }
            r0.destroy()     // Catch:{ Exception -> 0x0172 }
            goto L_0x0184
        L_0x0172:
            r0 = move-exception
            java.lang.String r4 = r9.mo67822t1()
            java.lang.String r5 = "releaseWebView, ex = %s"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r0 = r0.getMessage()
            r3[r2] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r5, r3)
        L_0x0184:
            r9.f117677Q0 = r1
            r9.f117675O0 = r1
            r9.f117676P0 = r1
            r9.f117680T0 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.core.C43522y.mo67812d():void");
    }

    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        C87412m.m108594g(webView, "view");
        C87412m.m108594g(str, "url");
        this.f117597w = str;
        super.doUpdateVisitedHistory(webView, str, z);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:25|26) */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e(mo67822t1(), "invoke the check enterprise failed");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0061 */
    /* renamed from: k0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo67729k0(java.lang.String r6) {
        /*
            r5 = this;
            e00.t$b r0 = r5.f117555b
            int r0 = r0.f123184f
            if (r0 == 0) goto L_0x0007
            return r0
        L_0x0007:
            android.content.Intent r0 = r5.mo67715e0()
            java.lang.String r1 = "geta8key_scene"
            r2 = 0
            int r0 = r0.getIntExtra(r1, r2)
            r1 = 1
            if (r0 != 0) goto L_0x008d
            if (r6 == 0) goto L_0x0020
            int r0 = r6.length()
            if (r0 != 0) goto L_0x001e
            goto L_0x0020
        L_0x001e:
            r0 = 0
            goto L_0x0021
        L_0x0020:
            r0 = 1
        L_0x0021:
            if (r0 != 0) goto L_0x008c
            int r0 = r5.f117556b0     // Catch:{ Exception -> 0x006d }
            boolean r0 = r5.mo67748s0(r0)     // Catch:{ Exception -> 0x006d }
            if (r0 != 0) goto L_0x002d
        L_0x002b:
            r6 = 1
            goto L_0x006b
        L_0x002d:
            com.tencent.mm.plugin.webview.stub.l r0 = r5.mo67731m()     // Catch:{ Exception -> 0x006d }
            boolean r0 = r0.gg0(r6)     // Catch:{ Exception -> 0x006d }
            if (r0 == 0) goto L_0x003a
            r6 = 8
            goto L_0x006b
        L_0x003a:
            com.tencent.mm.plugin.webview.stub.l r0 = r5.mo67731m()     // Catch:{ Exception -> 0x006d }
            boolean r0 = r0.mo68095Gm(r6)     // Catch:{ Exception -> 0x006d }
            if (r0 == 0) goto L_0x002b
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ Exception -> 0x006d }
            r0.<init>()     // Catch:{ Exception -> 0x006d }
            java.lang.String r3 = "enterprise_biz_username"
            r0.putString(r3, r6)     // Catch:{ Exception -> 0x006d }
            com.tencent.mm.plugin.webview.stub.l r6 = r5.mo67731m()     // Catch:{ RemoteException -> 0x0061 }
            r3 = 102(0x66, float:1.43E-43)
            android.os.Bundle r6 = r6.mo68114V5(r3, r0)     // Catch:{ RemoteException -> 0x0061 }
            if (r6 == 0) goto L_0x006a
            java.lang.String r0 = "is_enterprise_username"
            boolean r6 = r6.getBoolean(r0)     // Catch:{ RemoteException -> 0x0061 }
            goto L_0x006a
        L_0x0061:
            java.lang.String r6 = r5.mo67822t1()     // Catch:{ Exception -> 0x006d }
            java.lang.String r0 = "invoke the check enterprise failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)     // Catch:{ Exception -> 0x006d }
        L_0x006a:
            r6 = 7
        L_0x006b:
            r0 = r6
            goto L_0x008d
        L_0x006d:
            r6 = move-exception
            java.lang.String r0 = r5.mo67822t1()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "getScene fail, ex = "
            r3.append(r4)
            java.lang.String r6 = r6.getMessage()
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r6)
            r0 = 1
            goto L_0x008d
        L_0x008c:
            r0 = 0
        L_0x008d:
            java.lang.String r6 = r5.mo67822t1()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r1[r2] = r3
            java.lang.String r2 = "KGetA8KeyScene = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.core.C43522y.mo67729k0(java.lang.String):int");
    }

    /* renamed from: k1 */
    public final void mo67813k1(int i) {
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("scene_end_type", i);
            bundle.putInt("scene_end_listener_hash_code", mo67818p1().mo67833e());
            mo67731m().mo68145pG(5, bundle, mo67818p1().mo67833e());
        } catch (Exception e) {
            String t1 = mo67822t1();
            Log.m105920e(t1, "addSceneEnd, ex = " + e.getMessage());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: l1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo67814l1(java.lang.String r20) {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            java.lang.String r0 = r19.mo67822t1()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "dealCustomScheme, url = "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0029
            int r0 = r20.length()
            if (r0 != 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r0 = 0
            goto L_0x002a
        L_0x0029:
            r0 = 1
        L_0x002a:
            if (r0 == 0) goto L_0x002d
            return r4
        L_0x002d:
            com.tencent.mm.plugin.webview.stub.l r0 = r19.mo67731m()     // Catch:{ Exception -> 0x005b }
            boolean r0 = r0.mo68112U0(r2)     // Catch:{ Exception -> 0x005b }
            if (r0 == 0) goto L_0x0078
            java.lang.String r0 = r19.mo67822t1()     // Catch:{ Exception -> 0x005b }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x005b }
            r5.<init>()     // Catch:{ Exception -> 0x005b }
            java.lang.String r6 = "dealCustomScheme, url is handled by QrCodeURLHelper, url = "
            r5.append(r6)     // Catch:{ Exception -> 0x005b }
            r5.append(r2)     // Catch:{ Exception -> 0x005b }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x005b }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)     // Catch:{ Exception -> 0x005b }
            com.tencent.mm.plugin.webview.stub.l r0 = r19.mo67731m()     // Catch:{ Exception -> 0x005b }
            int r5 = r19.mo67719g()     // Catch:{ Exception -> 0x005b }
            r0.mo68096Hz(r2, r5)     // Catch:{ Exception -> 0x005b }
            return r3
        L_0x005b:
            r0 = move-exception
            java.lang.String r5 = r19.mo67822t1()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "dealCustomScheme, tryHandleEvents, ex = "
            r6.append(r7)
            java.lang.String r0 = r0.getMessage()
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r0)
        L_0x0078:
            android.net.Uri r5 = android.net.Uri.parse(r20)
            if (r5 == 0) goto L_0x0368
            java.lang.String r0 = "weixin://"
            boolean r0 = z04.C112551y.m153819s(r2, r0, r4)
            if (r0 != 0) goto L_0x0368
            java.lang.String r0 = "http"
            boolean r0 = z04.C112551y.m153819s(r2, r0, r4)
            if (r0 != 0) goto L_0x0368
            java.lang.String r0 = "tel:"
            boolean r6 = z04.C112551y.m153819s(r2, r0, r4)
            java.lang.String r7 = ""
            if (r6 == 0) goto L_0x00c2
            java.lang.String r0 = z04.C112551y.m153814n(r2, r0, r7, r4)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 != 0) goto L_0x00c1
            com.tencent.mm.plugin.webview.stub.l r2 = r19.mo67731m()     // Catch:{ Exception -> 0x00af }
            int r5 = r19.mo67719g()     // Catch:{ Exception -> 0x00af }
            r2.mo68125d6(r0, r5)     // Catch:{ Exception -> 0x00af }
            goto L_0x00c1
        L_0x00af:
            r0 = move-exception
            java.lang.String r2 = r19.mo67822t1()
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r0 = r0.getMessage()
            r5[r4] = r0
            java.lang.String r0 = "showPhoneSpanDialog, ex = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r0, r5)
        L_0x00c1:
            return r3
        L_0x00c2:
            java.lang.String r0 = "sms:"
            boolean r0 = z04.C112551y.m153819s(r2, r0, r4)
            r6 = 2
            r8 = 3
            java.lang.String r9 = "UTF-8"
            if (r0 != 0) goto L_0x027a
            java.lang.String r0 = "smsto:"
            boolean r0 = z04.C112551y.m153819s(r2, r0, r4)
            if (r0 == 0) goto L_0x00d8
            goto L_0x027a
        L_0x00d8:
            java.lang.String r0 = "mailto:"
            boolean r0 = z04.C112551y.m153819s(r2, r0, r4)
            r10 = 268435456(0x10000000, float:2.5243549E-29)
            if (r0 == 0) goto L_0x013c
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.SENDTO"
            r0.<init>(r2)
            r0.addFlags(r10)
            r0.setData(r5)
            android.content.Context r2 = r19.mo67707a0()     // Catch:{ Exception -> 0x0129 }
            k20.a r5 = new k20.a     // Catch:{ Exception -> 0x0129 }
            r5.<init>()     // Catch:{ Exception -> 0x0129 }
            r5.mo10233c(r0)     // Catch:{ Exception -> 0x0129 }
            java.lang.Object[] r12 = r5.mo10232b()     // Catch:{ Exception -> 0x0129 }
            java.lang.String r13 = "com/tencent/mm/plugin/webview/core/WebViewController"
            java.lang.String r14 = "dealCustomScheme"
            java.lang.String r15 = "(Ljava/lang/String;)Z"
            java.lang.String r16 = "Undefined"
            java.lang.String r17 = "startActivity"
            java.lang.String r18 = "(Landroid/content/Intent;)V"
            r11 = r2
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x0129 }
            java.lang.Object r0 = r5.mo10231a(r4)     // Catch:{ Exception -> 0x0129 }
            android.content.Intent r0 = (android.content.Intent) r0     // Catch:{ Exception -> 0x0129 }
            r2.startActivity(r0)     // Catch:{ Exception -> 0x0129 }
            java.lang.String r12 = "com/tencent/mm/plugin/webview/core/WebViewController"
            java.lang.String r13 = "dealCustomScheme"
            java.lang.String r14 = "(Ljava/lang/String;)Z"
            java.lang.String r15 = "Undefined"
            java.lang.String r16 = "startActivity"
            java.lang.String r17 = "(Landroid/content/Intent;)V"
            r11 = r2
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x0129 }
            goto L_0x013b
        L_0x0129:
            r0 = move-exception
            java.lang.String r2 = r19.mo67822t1()
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r0 = r0.getMessage()
            r5[r4] = r0
            java.lang.String r0 = "start mailto app failed:[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r0, r5)
        L_0x013b:
            return r3
        L_0x013c:
            d93.h r0 = r1.f117539M     // Catch:{ Exception -> 0x01b8 }
            com.tencent.mm.protocal.GeneralControlWrapper r0 = r0.mo70859b()     // Catch:{ Exception -> 0x01b8 }
            int r0 = r0.f121046d     // Catch:{ Exception -> 0x01b8 }
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x014a
            r0 = 1
            goto L_0x014b
        L_0x014a:
            r0 = 0
        L_0x014b:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b8 }
            r11.<init>()     // Catch:{ Exception -> 0x01b8 }
            java.lang.String r12 = "allowOuterOpenUrl, ret = "
            r11.append(r12)     // Catch:{ Exception -> 0x01b8 }
            r11.append(r0)     // Catch:{ Exception -> 0x01b8 }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x01b8 }
            java.lang.String r12 = "MicroMsg.GeneralControlWrapper"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r11)     // Catch:{ Exception -> 0x01b8 }
            if (r0 != 0) goto L_0x0177
            com.tencent.mm.plugin.webview.stub.l r0 = r19.mo67731m()     // Catch:{ Exception -> 0x01b8 }
            boolean r0 = r0.mo68094Fu()     // Catch:{ Exception -> 0x01b8 }
            if (r0 == 0) goto L_0x0177
            java.lang.String r0 = r19.mo67822t1()     // Catch:{ Exception -> 0x01b8 }
            java.lang.String r11 = "dealCustomScheme, not allow outer open url"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r11)     // Catch:{ Exception -> 0x01b8 }
            return r3
        L_0x0177:
            android.content.Intent r0 = r19.mo67715e0()     // Catch:{ Exception -> 0x01b8 }
            java.lang.String r11 = "key_download_restrict"
            int r0 = r0.getIntExtra(r11, r4)     // Catch:{ Exception -> 0x01b8 }
            android.content.Intent r11 = r19.mo67715e0()     // Catch:{ Exception -> 0x01b8 }
            java.lang.String r12 = "key_function_id"
            java.lang.String r11 = r11.getStringExtra(r12)     // Catch:{ Exception -> 0x01b8 }
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)     // Catch:{ Exception -> 0x01b8 }
            if (r12 != 0) goto L_0x01a8
            com.tencent.mm.plugin.report.service.n r12 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x01b8 }
            r13 = 14596(0x3904, float:2.0453E-41)
            java.lang.Object[] r14 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x01b8 }
            r14[r4] = r11     // Catch:{ Exception -> 0x01b8 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x01b8 }
            r14[r3] = r11     // Catch:{ Exception -> 0x01b8 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x01b8 }
            r14[r6] = r11     // Catch:{ Exception -> 0x01b8 }
            r12.mo160131h(r13, r14)     // Catch:{ Exception -> 0x01b8 }
        L_0x01a8:
            if (r0 != r3) goto L_0x01c2
            java.lang.String r0 = r19.mo67822t1()     // Catch:{ Exception -> 0x01b8 }
            java.lang.String r11 = "not allow launch app by custom scheme : %s"
            java.lang.Object[] r12 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x01b8 }
            r12[r4] = r2     // Catch:{ Exception -> 0x01b8 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r11, r12)     // Catch:{ Exception -> 0x01b8 }
            return r3
        L_0x01b8:
            r0 = move-exception
            java.lang.String r11 = r19.mo67822t1()
            java.lang.Object[] r12 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r0, r7, r12)
        L_0x01c2:
            long r11 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            long r13 = r1.f117698l1
            long r11 = r11 - r13
            java.lang.String r0 = r19.mo67822t1()
            java.lang.Object[] r13 = new java.lang.Object[r3]
            java.lang.Long r14 = java.lang.Long.valueOf(r11)
            r13[r4] = r14
            java.lang.String r14 = "scheme launch interval ; %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r14, r13)
            r13 = 2
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 > 0) goto L_0x020a
            java.lang.String r0 = r19.getCurrentUrl()
            java.lang.String r0 = p206nj.C117627q.m165909b(r0, r9)     // Catch:{ Exception -> 0x01ed }
            java.lang.String r2 = p206nj.C117627q.m165909b(r2, r9)     // Catch:{ Exception -> 0x01ed }
            goto L_0x01f6
        L_0x01ed:
            java.lang.String r9 = r19.mo67822t1()
            java.lang.String r11 = "formate url failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r11)
        L_0x01f6:
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 13983(0x369f, float:1.9594E-41)
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r12 = 4
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r8[r4] = r12
            r8[r3] = r0
            r8[r6] = r2
            r9.mo160131h(r11, r8)
        L_0x020a:
            android.content.Intent r0 = r19.mo67715e0()
            java.lang.String r2 = "show_openapp_dialog"
            boolean r0 = r0.getBooleanExtra(r2, r3)
            if (r0 == 0) goto L_0x0220
            com.tencent.mm.plugin.webview.core.y$t r0 = new com.tencent.mm.plugin.webview.core.y$t
            r0.<init>(r1, r5)
            boolean r0 = ji3.C9457a.m9137a(r0)
            return r0
        L_0x0220:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.VIEW"
            r0.<init>(r2, r5)
            r0.addFlags(r10)
            android.content.Context r2 = r19.mo67707a0()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isIntentAvailable(r2, r0, r3)
            if (r2 == 0) goto L_0x0368
            android.content.Context r2 = r19.mo67707a0()     // Catch:{ Exception -> 0x026e }
            k20.a r5 = new k20.a     // Catch:{ Exception -> 0x026e }
            r5.<init>()     // Catch:{ Exception -> 0x026e }
            r5.mo10233c(r0)     // Catch:{ Exception -> 0x026e }
            java.lang.Object[] r9 = r5.mo10232b()     // Catch:{ Exception -> 0x026e }
            java.lang.String r10 = "com/tencent/mm/plugin/webview/core/WebViewController"
            java.lang.String r11 = "dealCustomScheme"
            java.lang.String r12 = "(Ljava/lang/String;)Z"
            java.lang.String r13 = "Undefined"
            java.lang.String r14 = "startActivity"
            java.lang.String r15 = "(Landroid/content/Intent;)V"
            r8 = r2
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x026e }
            java.lang.Object r0 = r5.mo10231a(r4)     // Catch:{ Exception -> 0x026e }
            android.content.Intent r0 = (android.content.Intent) r0     // Catch:{ Exception -> 0x026e }
            r2.startActivity(r0)     // Catch:{ Exception -> 0x026e }
            java.lang.String r9 = "com/tencent/mm/plugin/webview/core/WebViewController"
            java.lang.String r10 = "dealCustomScheme"
            java.lang.String r11 = "(Ljava/lang/String;)Z"
            java.lang.String r12 = "Undefined"
            java.lang.String r13 = "startActivity"
            java.lang.String r14 = "(Landroid/content/Intent;)V"
            r8 = r2
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x026e }
            goto L_0x0279
        L_0x026e:
            r0 = move-exception
            java.lang.String r2 = r19.mo67822t1()
            java.lang.Object[] r3 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r7, r3)
            r3 = 0
        L_0x0279:
            return r3
        L_0x027a:
            com.tencent.mm.ui.widget.MMWebView r0 = r1.f117553a
            android.content.Context r0 = r0.getActivityContextIfHas()
            if (r0 != 0) goto L_0x028c
            java.lang.String r0 = r19.mo67822t1()
            java.lang.String r2 = "sms, viewWV.activityContextIfHas = null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
            return r3
        L_0x028c:
            com.tencent.mm.ui.widget.MMWebView r0 = r1.f117553a
            android.content.Context r0 = r0.getActivityContextIfHas()
            java.lang.String r5 = "viewWV.activityContextIfHas"
            gy3.C87412m.m108593f(r0, r5)
            java.lang.String r5 = "sms:(\\d*)(\\?body=(.*))?"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.lang.String r10 = "compile(pattern)"
            gy3.C87412m.m108593f(r5, r10)
            java.lang.String r9 = java.net.URLDecoder.decode(r2, r9)
            java.lang.String r10 = "decodedUrl"
            gy3.C87412m.m108593f(r9, r10)
            java.util.regex.Matcher r5 = r5.matcher(r9)
            java.lang.String r10 = "nativePattern.matcher(input)"
            gy3.C87412m.m108593f(r5, r10)
            boolean r10 = r5.matches()
            r11 = 0
            if (r10 != 0) goto L_0x02be
            r10 = r11
            goto L_0x02c3
        L_0x02be:
            z04.h r10 = new z04.h
            r10.<init>(r5, r9)
        L_0x02c3:
            if (r10 == 0) goto L_0x02d0
            java.util.List r5 = r10.mo90752b()
            java.lang.Object r5 = sx3.C110818d0.m150917O(r5, r3)
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x02d1
        L_0x02d0:
            r5 = r11
        L_0x02d1:
            if (r10 == 0) goto L_0x02de
            java.util.List r9 = r10.mo90752b()
            java.lang.Object r8 = sx3.C110818d0.m150917O(r9, r8)
            r11 = r8
            java.lang.String r11 = (java.lang.String) r11
        L_0x02de:
            if (r5 == 0) goto L_0x02e9
            int r8 = r5.length()
            if (r8 != 0) goto L_0x02e7
            goto L_0x02e9
        L_0x02e7:
            r8 = 0
            goto L_0x02ea
        L_0x02e9:
            r8 = 1
        L_0x02ea:
            if (r8 == 0) goto L_0x02f4
            r5 = 2131838242(0x7f114522, float:1.9309702E38)
            java.lang.String r7 = r0.getString(r5)
            goto L_0x034d
        L_0x02f4:
            if (r5 == 0) goto L_0x02ff
            int r8 = r5.length()
            if (r8 != 0) goto L_0x02fd
            goto L_0x02ff
        L_0x02fd:
            r8 = 0
            goto L_0x0300
        L_0x02ff:
            r8 = 1
        L_0x0300:
            if (r8 != 0) goto L_0x0320
            if (r11 == 0) goto L_0x030d
            int r8 = r11.length()
            if (r8 != 0) goto L_0x030b
            goto L_0x030d
        L_0x030b:
            r8 = 0
            goto L_0x030e
        L_0x030d:
            r8 = 1
        L_0x030e:
            if (r8 == 0) goto L_0x0320
            r6 = 2131838243(0x7f114523, float:1.9309704E38)
            java.lang.String r6 = r0.getString(r6)
            java.lang.Object[] r7 = new java.lang.Object[r3]
            r7[r4] = r5
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.safeFormatString(r6, r7)
            goto L_0x034d
        L_0x0320:
            if (r5 == 0) goto L_0x032b
            int r8 = r5.length()
            if (r8 != 0) goto L_0x0329
            goto L_0x032b
        L_0x0329:
            r8 = 0
            goto L_0x032c
        L_0x032b:
            r8 = 1
        L_0x032c:
            if (r8 != 0) goto L_0x034d
            if (r11 == 0) goto L_0x0339
            int r8 = r11.length()
            if (r8 != 0) goto L_0x0337
            goto L_0x0339
        L_0x0337:
            r8 = 0
            goto L_0x033a
        L_0x0339:
            r8 = 1
        L_0x033a:
            if (r8 != 0) goto L_0x034d
            r7 = 2131838244(0x7f114524, float:1.9309706E38)
            java.lang.String r7 = r0.getString(r7)
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r4] = r11
            r6[r3] = r5
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.safeFormatString(r7, r6)
        L_0x034d:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r5 != 0) goto L_0x035c
            com.tencent.mm.plugin.webview.ui.tools.m0 r4 = new com.tencent.mm.plugin.webview.ui.tools.m0
            r4.<init>(r0, r7, r2)
            o40.C61926c.m72668M(r4)
            goto L_0x0367
        L_0x035c:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r4] = r2
            java.lang.String r2 = "MicroMsg.WebViewUI.SMSQueryHelper"
            java.lang.String r4 = "sms, url is illegal, url = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r4, r0)
        L_0x0367:
            return r3
        L_0x0368:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.core.C43522y.mo67814l1(java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0122, code lost:
        if (p225rc.C12969d.m12408b(r15, r0, true) != false) goto L_0x0124;
     */
    /* renamed from: m1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo67815m1(java.lang.String r15) {
        /*
            r14 = this;
            java.lang.String r0 = "pay_channel"
            r1 = 0
            r2 = 1
            if (r15 == 0) goto L_0x000f
            int r3 = r15.length()
            if (r3 != 0) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            r3 = 0
            goto L_0x0010
        L_0x000f:
            r3 = 1
        L_0x0010:
            if (r3 == 0) goto L_0x0013
            return r1
        L_0x0013:
            java.lang.String r3 = "weixin://jump/"
            boolean r3 = p225rc.C12969d.m12408b(r15, r3, r2)     // Catch:{ Exception -> 0x0145 }
            if (r3 != 0) goto L_0x0141
            java.lang.String r3 = "weixin://scanqrcode/"
            boolean r3 = p225rc.C12969d.m12408b(r15, r3, r2)     // Catch:{ Exception -> 0x0145 }
            if (r3 == 0) goto L_0x0027
            goto L_0x0141
        L_0x0027:
            java.lang.String r3 = "weixin://dl/business"
            boolean r3 = p225rc.C12969d.m12408b(r15, r3, r2)     // Catch:{ Exception -> 0x0145 }
            r4 = 2
            if (r3 == 0) goto L_0x00cc
            android.net.Uri r3 = android.net.Uri.parse(r15)     // Catch:{ Exception -> 0x0145 }
            boolean r3 = wc3.C90945m.m114067q(r3)     // Catch:{ Exception -> 0x0145 }
            if (r3 == 0) goto L_0x00cc
            java.lang.String r3 = r14.mo63683n0()     // Catch:{ Exception -> 0x0145 }
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ Exception -> 0x0145 }
            java.lang.String r3 = r3.getHost()     // Catch:{ Exception -> 0x0145 }
            android.content.Intent r5 = new android.content.Intent     // Catch:{ Exception -> 0x0145 }
            java.lang.String r6 = "android.intent.action.VIEW"
            r5.<init>(r6)     // Catch:{ Exception -> 0x0145 }
            java.lang.String r6 = "android.intent.category.BROWSABLE"
            r5.addCategory(r6)     // Catch:{ Exception -> 0x0145 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0145 }
            r6.<init>()     // Catch:{ Exception -> 0x0145 }
            r6.append(r15)     // Catch:{ Exception -> 0x0145 }
            java.lang.String r7 = "&domain="
            r6.append(r7)     // Catch:{ Exception -> 0x0145 }
            r6.append(r3)     // Catch:{ Exception -> 0x0145 }
            java.lang.String r3 = r6.toString()     // Catch:{ Exception -> 0x0145 }
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ Exception -> 0x0145 }
            r5.setData(r3)     // Catch:{ Exception -> 0x0145 }
            r3 = -1
            int r6 = r5.getIntExtra(r0, r3)     // Catch:{ Exception -> 0x0145 }
            if (r6 == r3) goto L_0x008b
            java.lang.String r3 = r14.mo67822t1()     // Catch:{ Exception -> 0x0145 }
            java.lang.String r7 = "%s do deeplink, bypass pay channel: %s"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0145 }
            r4[r1] = r15     // Catch:{ Exception -> 0x0145 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0145 }
            r4[r2] = r8     // Catch:{ Exception -> 0x0145 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r7, r4)     // Catch:{ Exception -> 0x0145 }
            r5.putExtra(r0, r6)     // Catch:{ Exception -> 0x0145 }
        L_0x008b:
            java.lang.String r0 = "translate_link_scene"
            r3 = 13
            r5.putExtra(r0, r3)     // Catch:{ Exception -> 0x0145 }
            android.content.Context r0 = r14.mo67707a0()     // Catch:{ Exception -> 0x0145 }
            k20.a r3 = new k20.a     // Catch:{ Exception -> 0x0145 }
            r3.<init>()     // Catch:{ Exception -> 0x0145 }
            r3.mo10233c(r5)     // Catch:{ Exception -> 0x0145 }
            java.lang.Object[] r7 = r3.mo10232b()     // Catch:{ Exception -> 0x0145 }
            java.lang.String r8 = "com/tencent/mm/plugin/webview/core/WebViewController"
            java.lang.String r9 = "dealWeixinScheme"
            java.lang.String r10 = "(Ljava/lang/String;)Z"
            java.lang.String r11 = "Undefined"
            java.lang.String r12 = "startActivity"
            java.lang.String r13 = "(Landroid/content/Intent;)V"
            r6 = r0
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x0145 }
            java.lang.Object r3 = r3.mo10231a(r1)     // Catch:{ Exception -> 0x0145 }
            android.content.Intent r3 = (android.content.Intent) r3     // Catch:{ Exception -> 0x0145 }
            r0.startActivity(r3)     // Catch:{ Exception -> 0x0145 }
            java.lang.String r7 = "com/tencent/mm/plugin/webview/core/WebViewController"
            java.lang.String r8 = "dealWeixinScheme"
            java.lang.String r9 = "(Ljava/lang/String;)Z"
            java.lang.String r10 = "Undefined"
            java.lang.String r11 = "startActivity"
            java.lang.String r12 = "(Landroid/content/Intent;)V"
            r6 = r0
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x0145 }
            return r2
        L_0x00cc:
            java.lang.String r0 = "weixinpreinject://iframe"
            boolean r0 = p225rc.C12969d.m12408b(r15, r0, r2)     // Catch:{ Exception -> 0x0145 }
            if (r0 == 0) goto L_0x00e0
            java.lang.String r0 = r14.mo67822t1()     // Catch:{ Exception -> 0x0145 }
            java.lang.String r3 = "preInjectJsBridge,accept preinject_Iframe and continue preinjectjsbridge"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)     // Catch:{ Exception -> 0x0145 }
            goto L_0x0162
        L_0x00e0:
            java.lang.String r0 = "weixin://dl/login/common_view"
            boolean r0 = p225rc.C12969d.m12408b(r15, r0, r2)     // Catch:{ Exception -> 0x0145 }
            if (r0 != 0) goto L_0x0106
            java.lang.String r0 = "weixin://dl/login/phone_view"
            boolean r0 = p225rc.C12969d.m12408b(r15, r0, r2)     // Catch:{ Exception -> 0x0145 }
            if (r0 == 0) goto L_0x00f3
            goto L_0x0106
        L_0x00f3:
            java.lang.String r0 = "weixin://webview/initReady/"
            boolean r0 = p225rc.C12969d.m12408b(r15, r0, r2)     // Catch:{ Exception -> 0x0145 }
            if (r0 != 0) goto L_0x0105
            java.lang.String r0 = "weixin://webview/preInjectJSBridge/"
            boolean r0 = p225rc.C12969d.m12408b(r15, r0, r2)     // Catch:{ Exception -> 0x0145 }
            if (r0 == 0) goto L_0x0162
        L_0x0105:
            return r2
        L_0x0106:
            java.lang.String r0 = r14.mo63683n0()     // Catch:{ Exception -> 0x0145 }
            java.lang.String r3 = wc3.C90945m.f260969c     // Catch:{ Exception -> 0x0145 }
            java.lang.String r4 = "PREFIX_SUPPORT_QQ"
            gy3.C87412m.m108593f(r3, r4)     // Catch:{ Exception -> 0x0145 }
            boolean r0 = p225rc.C12969d.m12408b(r0, r3, r2)     // Catch:{ Exception -> 0x0145 }
            if (r0 != 0) goto L_0x0124
            java.lang.String r0 = wc3.C90945m.f260970d     // Catch:{ Exception -> 0x0145 }
            java.lang.String r3 = "PREFIX_SUPPORT_WECHAT"
            gy3.C87412m.m108593f(r0, r3)     // Catch:{ Exception -> 0x0145 }
            boolean r0 = p225rc.C12969d.m12408b(r15, r0, r2)     // Catch:{ Exception -> 0x0145 }
            if (r0 == 0) goto L_0x0162
        L_0x0124:
            rx3.g r0 = r14.f117682V0     // Catch:{ Exception -> 0x0145 }
            rx3.n r0 = (rx3.C36570n) r0     // Catch:{ Exception -> 0x0145 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ Exception -> 0x0145 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x0145 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0145 }
            if (r0 == 0) goto L_0x0162
            com.tencent.mm.ui.widget.MMWebView r0 = r14.f117553a     // Catch:{ Exception -> 0x0145 }
            android.content.Context r0 = r0.getActivityContextIfHas()     // Catch:{ Exception -> 0x0145 }
            wc3.C90945m.m114061k(r0, r15)     // Catch:{ Exception -> 0x0145 }
            r14.mo67674G0()     // Catch:{ Exception -> 0x0145 }
            return r2
        L_0x0141:
            r14.mo67827y1(r15)     // Catch:{ Exception -> 0x0145 }
            return r2
        L_0x0145:
            r0 = move-exception
            java.lang.String r3 = r14.mo67822t1()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "shouldOverride, jumpToActivity, ex = "
            r4.append(r5)
            java.lang.String r0 = r0.getMessage()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
        L_0x0162:
            boolean r0 = r14.mo67823u1(r15)
            if (r0 == 0) goto L_0x0169
            return r2
        L_0x0169:
            java.lang.String r0 = "weixin://"
            boolean r0 = p225rc.C12969d.m12408b(r15, r0, r2)
            if (r0 == 0) goto L_0x0180
            java.lang.String r0 = r14.mo67822t1()
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r1] = r15
            java.lang.String r15 = "shouldOverrideUrlLoading, can not deal with this weixin scheme, stop directly, url = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r15, r3)
            return r2
        L_0x0180:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.core.C43522y.mo67815m1(java.lang.String):boolean");
    }

    /* renamed from: n1 */
    public final C45298c mo67816n1() {
        return mo67698U();
    }

    /* renamed from: o1 */
    public final String mo67817o1() {
        return !mo67748s0(this.f117558c0) ? "" : mo67715e0().getStringExtra("KPublisherId");
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0068 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDestroy() {
        /*
            r6 = this;
            java.lang.String r0 = "srcUsername"
            int r1 = r6.f117558c0
            boolean r1 = r6.mo67748s0(r1)
            if (r1 == 0) goto L_0x001e
            rx3.g r1 = r6.f117684X0
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            com.tencent.mm.plugin.webview.core.y$p r1 = (com.tencent.p014mm.plugin.webview.core.C43522y.C43546p) r1
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            r4 = 0
            java.lang.String r5 = ""
            r1.mo67834a(r5, r2, r4)
        L_0x001e:
            rx3.g r1 = r6.f117688b1
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            com.tencent.mm.plugin.webview.ui.tools.g r1 = (com.tencent.p014mm.plugin.webview.p128ui.tools.C43976g) r1
            r1.getClass()
            java.lang.String r2 = "MicroMsg.WebView.MMSslErrorHandler"
            java.lang.String r3 = "detach"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            r2 = 0
            r1.f119123a = r2
            r1.f119124b = r2
            java.util.Map<java.lang.String, java.util.List<com.tencent.xweb.SslErrorHandler>> r2 = r1.f119125c
            java.util.HashMap r2 = (java.util.HashMap) r2
            r2.clear()
            java.util.Map<java.lang.String, java.lang.Boolean> r1 = r1.f119126d
            java.util.HashMap r1 = (java.util.HashMap) r1
            r1.clear()
            boolean r1 = r6.mo67826x1()
            if (r1 == 0) goto L_0x0068
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ Exception -> 0x0068 }
            r1.<init>()     // Catch:{ Exception -> 0x0068 }
            android.content.Intent r2 = r6.mo67715e0()     // Catch:{ Exception -> 0x0068 }
            java.lang.String r2 = r2.getStringExtra(r0)     // Catch:{ Exception -> 0x0068 }
            r1.putString(r0, r2)     // Catch:{ Exception -> 0x0068 }
            com.tencent.mm.plugin.webview.stub.l r0 = r6.mo67731m()     // Catch:{ Exception -> 0x0068 }
            r2 = 30
            int r3 = r6.mo67719g()     // Catch:{ Exception -> 0x0068 }
            r0.mo68145pG(r2, r1, r3)     // Catch:{ Exception -> 0x0068 }
        L_0x0068:
            com.tencent.mm.plugin.webview.stub.l r0 = r6.mo67731m()     // Catch:{ Exception -> 0x0078 }
            com.tencent.mm.plugin.webview.core.y$m r1 = r6.mo67818p1()     // Catch:{ Exception -> 0x0078 }
            int r1 = r1.mo67833e()     // Catch:{ Exception -> 0x0078 }
            r0.mo68124cg(r1)     // Catch:{ Exception -> 0x0078 }
            goto L_0x0095
        L_0x0078:
            r0 = move-exception
            java.lang.String r1 = r6.mo67822t1()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "onDestroy remove callbacker ex "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
        L_0x0095:
            super.onDestroy()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.core.C43522y.onDestroy():void");
    }

    public void onLoadResource(WebView webView, String str) {
        C87412m.m108594g(str, "url");
        String t1 = mo67822t1();
        Log.m105924i(t1, "edw onLoadResource opt, url = " + str);
        if (mo67696T(str)) {
            String t15 = mo67822t1();
            Log.m105922f(t15, "onLoadResource, canLoadUrl fail, url = " + str);
            super.onLoadResource(webView, str);
            return;
        }
        C43704h2.C43709f f = this.f117672L0.mo68009f();
        f.getClass();
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.WebviewReporter", "WebViewRenderReporter.onLoadResource failed, url is null");
        } else {
            try {
                if (!Util.isNullOrNil(f.f118145c) && !str.equals(f.f118145c) && f.f118146d) {
                    if (f.f118143a.containsKey(f.f118145c)) {
                        f.f118143a.put(f.f118145c, Long.valueOf(Util.nowMilliSecond() - f.f118143a.get(f.f118145c).longValue()));
                    }
                    f.f118146d = false;
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.WebviewReporter", e, "onLoadResource", new Object[0]);
            }
        }
        super.onLoadResource(webView, str);
    }

    public void onPageCommitVisible(WebView webView, String str) {
        super.onPageCommitVisible(webView, str);
        this.f117543Q.mo73829a("onPageCommit", System.currentTimeMillis());
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01f2 A[Catch:{ Exception -> 0x0222 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01f8 A[Catch:{ Exception -> 0x0222 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x02b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPageFinished(com.tencent.xweb.WebView r28, java.lang.String r29) {
        /*
            r27 = this;
            r1 = r27
            r2 = r29
            super.onPageFinished(r28, r29)
            ea3.u r0 = r1.f117543Q
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r5 = "onPageFinished"
            r0.mo73829a(r5, r3)
            com.tencent.mm.ui.widget.MMWebView r0 = r1.f117553a
            com.tencent.p014mm.plugin.webview.model.C43692a.m47525c(r0, r2)
            boolean r0 = r1.mo63673M(r2)
            if (r0 == 0) goto L_0x001e
            return
        L_0x001e:
            boolean r0 = r1.f117692f1
            r3 = 5
            r4 = 3
            r5 = 4
            java.lang.String r11 = ""
            r12 = 0
            r14 = 6
            r15 = 2
            r7 = 1
            r6 = 0
            if (r0 != 0) goto L_0x01bb
            r1.f117692f1 = r7
            ea3.v r0 = r1.f117569i
            if (r0 != 0) goto L_0x0034
            goto L_0x003a
        L_0x0034:
            long r8 = java.lang.System.currentTimeMillis()
            r0.f123369l = r8
        L_0x003a:
            ea3.v r0 = r1.f117569i
            if (r0 == 0) goto L_0x01bb
            long r8 = r0.f123366i
            r17 = r11
            long r10 = r0.f123365h
            long r8 = r8 - r10
            r0.f123364g = r8
            long r8 = r0.f123369l
            long r10 = r0.f123358a
            long r8 = r8 - r10
            int r10 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r10 > 0) goto L_0x0052
            goto L_0x01bd
        L_0x0052:
            f40.j r10 = f40.C86709a0.m107531m()
            j40.a r10 = r10.mo58407a()
            j40.b r10 = (j40.C87829b) r10
            j40.a$a r10 = r10.f124992e
            long r10 = r10.f125000h
            long r12 = r0.f123358a
            int r18 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r18 <= 0) goto L_0x0068
            r10 = 1
            goto L_0x0069
        L_0x0068:
            r10 = 0
        L_0x0069:
            r0.f123362e = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Web-Trace Report kernelMode="
            r10.append(r11)
            int r11 = r0.f123359b
            r10.append(r11)
            java.lang.String r11 = ", progressMode="
            r10.append(r11)
            int r11 = r0.f123360c
            r10.append(r11)
            java.lang.String r11 = ", progressLaunchTime="
            r10.append(r11)
            long r11 = r0.f123361d
            r10.append(r11)
            java.lang.String r11 = ", isProgressColdLaunch="
            r10.append(r11)
            boolean r11 = r0.f123362e
            r10.append(r11)
            java.lang.String r11 = ", webViewCreateTime="
            r10.append(r11)
            long r11 = r0.f123363f
            r10.append(r11)
            java.lang.String r11 = ", bindCostTime="
            r10.append(r11)
            long r11 = r0.f123364g
            r10.append(r11)
            java.lang.String r11 = ",isMPPreloadController="
            r10.append(r11)
            boolean r11 = r0.f123367j
            r10.append(r11)
            java.lang.String r11 = ", isRenderProcessInit:"
            r10.append(r11)
            boolean r11 = r0.f123370m
            r10.append(r11)
            java.lang.String r11 = ", isGPUProcessInit:"
            r10.append(r11)
            boolean r11 = r0.f123372o
            r10.append(r11)
            java.lang.String r11 = ", isRenderSandBoxProcessInit:"
            r10.append(r11)
            boolean r11 = r0.f123371n
            r10.append(r11)
            java.lang.String r11 = ", onPageFinishedTime:"
            r10.append(r11)
            r10.append(r8)
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "MicroMsg.WebViewPerformanceMonitor"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r10)
            if (r2 != 0) goto L_0x00ea
            r10 = r17
            goto L_0x00eb
        L_0x00ea:
            r10 = r2
        L_0x00eb:
            java.lang.String r11 = "UTF-8"
            java.lang.String r10 = java.net.URLEncoder.encode(r10, r11)     // Catch:{ all -> 0x00f2 }
            goto L_0x00f5
        L_0x00f2:
            r10 = r17
        L_0x00f5:
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 18
            java.lang.Object[] r12 = new java.lang.Object[r12]
            int r13 = r0.f123359b
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12[r6] = r13
            int r13 = r0.f123360c
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12[r7] = r13
            long r6 = r0.f123361d
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r12[r15] = r6
            boolean r6 = r0.f123362e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r12[r4] = r6
            long r6 = r0.f123363f
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r12[r5] = r6
            long r6 = r0.f123364g
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r12[r3] = r6
            boolean r6 = r0.f123367j
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r12[r14] = r6
            int r6 = com.tencent.xweb.XWebSdk.getXWebSdkVersion()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 7
            r12[r7] = r6
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r6 = com.tencent.xweb.XWebSdk.getInstalledNewstVersion(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 8
            r12[r7] = r6
            int r6 = com.tencent.xweb.XWebSdk.getMultiProcessType()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 9
            r12[r7] = r6
            boolean r6 = com.tencent.xweb.XWebSdk.getEnableSandbox()
            if (r6 == 0) goto L_0x0162
            r6 = 1
            goto L_0x0163
        L_0x0162:
            r6 = 2
        L_0x0163:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 10
            r12[r7] = r6
            r6 = 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r6 = 11
            r12[r6] = r7
            r6 = 12
            java.lang.Long r7 = java.lang.Long.valueOf(r8)
            r12[r6] = r7
            r6 = 13
            boolean r7 = r0.f123370m
            if (r7 == 0) goto L_0x0184
            r7 = 2
            goto L_0x0185
        L_0x0184:
            r7 = 1
        L_0x0185:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r12[r6] = r7
            r6 = 14
            boolean r7 = r0.f123371n
            if (r7 == 0) goto L_0x0193
            r7 = 2
            goto L_0x0194
        L_0x0193:
            r7 = 1
        L_0x0194:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r12[r6] = r7
            r6 = 15
            boolean r0 = r0.f123372o
            if (r0 == 0) goto L_0x01a2
            r0 = 2
            goto L_0x01a3
        L_0x01a2:
            r0 = 1
        L_0x01a3:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12[r6] = r0
            r0 = 16
            r12[r0] = r10
            r0 = 17
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r12[r0] = r6
            r0 = 25365(0x6315, float:3.5544E-41)
            r11.mo160131h(r0, r12)
            goto L_0x01bd
        L_0x01bb:
            r17 = r11
        L_0x01bd:
            java.lang.String r0 = r27.mo67822t1()
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r6 = 0
            r7[r6] = r2
            java.lang.String r6 = "edw onPageFinished opt, url = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r6, r7)
            com.tencent.mm.plugin.webview.model.h2 r0 = r1.f117672L0
            com.tencent.mm.plugin.webview.model.h2$c r6 = r0.f118130m
            if (r6 != 0) goto L_0x01d9
            com.tencent.mm.plugin.webview.model.h2$c r6 = new com.tencent.mm.plugin.webview.model.h2$c
            r6.<init>()
            r0.f118130m = r6
        L_0x01d9:
            com.tencent.mm.plugin.webview.model.h2$c r0 = r0.f118130m
            java.lang.String r6 = "MicroMsg.WebviewReporter.DomainReporter"
            boolean r7 = r0.f118140a
            if (r7 == 0) goto L_0x022e
            boolean r7 = r0.f118141b
            if (r7 == 0) goto L_0x01e6
            goto L_0x022e
        L_0x01e6:
            android.net.Uri r7 = android.net.Uri.parse(r29)     // Catch:{ Exception -> 0x0222 }
            java.lang.String r8 = "http"
            boolean r8 = r2.startsWith(r8)     // Catch:{ Exception -> 0x0222 }
            if (r8 != 0) goto L_0x01f8
            java.lang.String r0 = "onPageFinished, url not startswith http"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)     // Catch:{ Exception -> 0x0222 }
            goto L_0x022e
        L_0x01f8:
            java.lang.String r7 = r7.getHost()     // Catch:{ Exception -> 0x0222 }
            if (r7 == 0) goto L_0x022e
            java.lang.String r8 = "v.html5.qq.com"
            boolean r7 = r7.equalsIgnoreCase(r8)     // Catch:{ Exception -> 0x0222 }
            if (r7 == 0) goto L_0x022e
            com.tencent.mm.plugin.report.service.n r19 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x0222 }
            r20 = 283(0x11b, double:1.4E-321)
            r22 = 0
            r24 = 1
            r26 = 1
            r19.idkeyStat(r20, r22, r24, r26)     // Catch:{ Exception -> 0x0222 }
            r7 = 1
            r0.f118141b = r7     // Catch:{ Exception -> 0x0223 }
            java.lang.String r0 = "onPageFinished, domain visit reported, url = %s"
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0223 }
            r7 = 0
            r8[r7] = r2     // Catch:{ Exception -> 0x0222 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r0, r8)     // Catch:{ Exception -> 0x0222 }
            goto L_0x022e
        L_0x0222:
            r7 = 1
        L_0x0223:
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r2
            java.lang.String r9 = "onPageFinished, parse url fail, url = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r9, r0)
            goto L_0x0230
        L_0x022e:
            r7 = 1
            r8 = 0
        L_0x0230:
            com.tencent.mm.plugin.webview.ui.tools.p1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C44130p1.f119545i
            java.lang.Object[] r6 = new java.lang.Object[r7]
            java.lang.String r7 = r0.f119546a
            r6[r8] = r7
            java.lang.String r7 = "MicroMsg.WebViewReportUtil"
            java.lang.String r9 = "onPageFinished traceid %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r7, r9, r6)
            java.lang.String r6 = r0.f119546a
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 == 0) goto L_0x024a
            r6 = r17
            goto L_0x024f
        L_0x024a:
            r6 = r17
            r0.mo68774e(r15, r6, r8)
        L_0x024f:
            rx3.g r0 = r1.f117690d1
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            com.tencent.mm.plugin.webview.modeltools.c0 r0 = (com.tencent.p014mm.plugin.webview.modeltools.C43748c0) r0
            r0.mo68055a(r2)
            android.content.Intent r0 = r27.mo67715e0()
            java.lang.String r7 = "shouldForceViewPort"
            r8 = 0
            boolean r0 = r0.getBooleanExtra(r7, r8)
            java.lang.String r7 = r27.mo67822t1()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "hy: shouldForceViewPort: "
            r8.append(r9)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r8)
            if (r0 == 0) goto L_0x0295
            android.content.Intent r0 = r27.mo67715e0()
            java.lang.String r7 = "view_port_code"
            java.lang.String r0 = r0.getStringExtra(r7)
            gy3.C87412m.m108591d(r28)
            r7 = 0
            r8 = r28
            r8.evaluateJavascript(r0, r7)
        L_0x0295:
            gy3.C87412m.m108591d(r29)
            boolean r0 = r1.mo67696T(r2)
            if (r0 == 0) goto L_0x02b7
            java.lang.String r0 = r27.mo67822t1()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "onPageFinished, canLoadUrl fail, url = "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105922f(r0, r2)
            return
        L_0x02b7:
            java.lang.String r0 = r1.f117693g1
            boolean r0 = gy3.C87412m.m108589b(r2, r0)
            if (r0 == 0) goto L_0x02c9
            java.lang.String r0 = r27.mo67822t1()
            java.lang.String r2 = "onPageFinished, js is finished loaded"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            return
        L_0x02c9:
            com.tencent.mm.plugin.webview.model.h2 r0 = r1.f117672L0
            com.tencent.mm.plugin.webview.model.h2$l r0 = r0.mo68008e()
            r0.getClass()
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r29)
            java.lang.String r8 = "MicroMsg.WebviewReporter"
            if (r7 == 0) goto L_0x02e0
            java.lang.String r0 = "WebviewOpenUrl.stopLoadUrl failed, url is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            goto L_0x0302
        L_0x02e0:
            java.util.HashMap<java.lang.String, java.lang.Long> r7 = r0.f118158a
            boolean r7 = r7.containsKey(r2)
            if (r7 == 0) goto L_0x0302
            java.util.HashMap<java.lang.String, java.lang.Long> r7 = r0.f118158a
            java.lang.Object r7 = r7.get(r2)
            java.lang.Long r7 = (java.lang.Long) r7
            long r9 = r7.longValue()
            long r11 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            long r11 = r11 - r9
            java.util.HashMap<java.lang.String, java.lang.Long> r0 = r0.f118158a
            java.lang.Long r7 = java.lang.Long.valueOf(r11)
            r0.put(r2, r7)
        L_0x0302:
            com.tencent.mm.plugin.webview.model.h2 r0 = r1.f117672L0
            com.tencent.mm.plugin.webview.model.h2$f r0 = r0.mo68009f()
            r0.getClass()
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r29)
            if (r7 == 0) goto L_0x0317
            java.lang.String r0 = "WebViewRenderReporter.onPageFinish failed, url is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            goto L_0x0343
        L_0x0317:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> r7 = r0.f118144b     // Catch:{ Exception -> 0x033a }
            boolean r7 = r7.containsKey(r2)     // Catch:{ Exception -> 0x033a }
            if (r7 == 0) goto L_0x0343
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> r7 = r0.f118144b     // Catch:{ Exception -> 0x033a }
            java.lang.Object r7 = r7.get(r2)     // Catch:{ Exception -> 0x033a }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ Exception -> 0x033a }
            long r9 = r7.longValue()     // Catch:{ Exception -> 0x033a }
            long r11 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()     // Catch:{ Exception -> 0x033a }
            long r11 = r11 - r9
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> r0 = r0.f118144b     // Catch:{ Exception -> 0x033a }
            java.lang.Long r7 = java.lang.Long.valueOf(r11)     // Catch:{ Exception -> 0x033a }
            r0.put(r2, r7)     // Catch:{ Exception -> 0x033a }
            goto L_0x0343
        L_0x033a:
            r0 = move-exception
            r7 = 0
            java.lang.Object[] r9 = new java.lang.Object[r7]
            java.lang.String r7 = "onPageFinish"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r7, r9)
        L_0x0343:
            com.tencent.mm.plugin.webview.model.h2 r0 = r1.f117672L0
            com.tencent.mm.plugin.webview.model.h2$g r7 = r0.f118123f
            if (r7 != 0) goto L_0x0350
            com.tencent.mm.plugin.webview.model.h2$g r7 = new com.tencent.mm.plugin.webview.model.h2$g
            r7.<init>(r0)
            r0.f118123f = r7
        L_0x0350:
            com.tencent.mm.plugin.webview.model.h2$g r0 = r0.f118123f
            boolean r7 = r0.f118151c
            if (r7 != 0) goto L_0x040e
            r7 = 1
            r0.f118151c = r7
            int r7 = com.tencent.p014mm.plugin.webview.model.C43704h2.m47539g()
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            long r11 = r0.f118149a
            long r9 = r9 - r11
            r11 = 0
            int r17 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r17 < 0) goto L_0x040e
            r11 = 180000(0x2bf20, double:8.8932E-319)
            int r17 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r17 <= 0) goto L_0x0373
            goto L_0x040e
        L_0x0373:
            java.lang.String r11 = r0.f118153e
            r12 = 11
            java.lang.Object[] r12 = new java.lang.Object[r12]
            java.lang.Integer r16 = java.lang.Integer.valueOf(r5)
            r17 = 0
            r12[r17] = r16
            java.lang.Long r16 = java.lang.Long.valueOf(r9)
            r13 = 1
            r12[r13] = r16
            java.lang.Integer r16 = java.lang.Integer.valueOf(r7)
            r12[r15] = r16
            java.lang.String r13 = r0.f118150b
            if (r13 != 0) goto L_0x0393
            goto L_0x039b
        L_0x0393:
            java.lang.String r15 = ","
            java.lang.String r14 = "!"
            java.lang.String r13 = r13.replace(r15, r14)
        L_0x039b:
            r12[r4] = r13
            r13 = 0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            r12[r5] = r14
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            r12[r3] = r14
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            r13 = 6
            r12[r13] = r14
            int r13 = com.tencent.p014mm.plugin.webview.model.C43704h2.f118116s
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r14 = 7
            r12[r14] = r13
            int r13 = com.tencent.p014mm.plugin.webview.model.C43704h2.f118117t
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r15 = 8
            r12[r15] = r13
            int r13 = r0.f118152d
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r15 = 9
            r12[r15] = r13
            java.lang.String r13 = r0.f118153e
            r15 = 10
            r12[r15] = r13
            com.tencent.p014mm.plugin.webview.model.C43704h2.m47537a(r11, r12)
            java.lang.Object[] r11 = new java.lang.Object[r14]
            java.lang.String r12 = r0.f118150b
            r13 = 0
            r11[r13] = r12
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r10 = 1
            r11[r10] = r9
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9 = 2
            r11[r9] = r7
            int r7 = com.tencent.p014mm.plugin.webview.model.C43704h2.f118116s
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r11[r4] = r7
            int r7 = com.tencent.p014mm.plugin.webview.model.C43704h2.f118117t
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r11[r5] = r7
            int r7 = r0.f118152d
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r11[r3] = r7
            java.lang.String r0 = r0.f118153e
            r3 = 6
            r11[r3] = r0
            java.lang.String r0 = "WebViewTotalTimeReporter.report url : %s, cost time : %d, netType : %d, %d, %d, getA8KeyScene:%d, prePublishid:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r0, r11)
        L_0x040e:
            android.content.Intent r0 = r27.mo67715e0()
            java.lang.String r3 = "jsapiargs"
            android.os.Parcelable r0 = r0.getParcelableExtra(r3)
            android.os.Bundle r0 = (android.os.Bundle) r0
            if (r0 == 0) goto L_0x0472
            java.lang.String r3 = "KSnsAdTag"
            android.os.Parcelable r3 = r0.getParcelable(r3)
            if (r3 == 0) goto L_0x0472
            boolean r7 = r3 instanceof com.tencent.p014mm.modelsns.SnsAdClick
            if (r7 == 0) goto L_0x0472
            java.lang.String r7 = "KAnsUxInfo"
            java.lang.String r0 = r0.getString(r7, r6)
            com.tencent.mm.plugin.webview.model.h2 r7 = r1.f117672L0
            com.tencent.mm.plugin.webview.model.w1 r7 = r7.mo68010h()
            com.tencent.mm.modelsns.SnsAdClick r3 = (com.tencent.p014mm.modelsns.SnsAdClick) r3
            r7.f118192a = r3
            com.tencent.mm.plugin.webview.model.h2 r3 = r1.f117672L0
            com.tencent.mm.plugin.webview.model.w1 r3 = r3.mo68010h()
            java.lang.String[] r5 = new java.lang.String[r5]
            r7 = 0
            r5[r7] = r2
            java.lang.String r7 = "1"
            r8 = 1
            r5[r8] = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            long r8 = java.lang.System.currentTimeMillis()
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r7 = 2
            r5[r7] = r6
            java.lang.String r6 = "uxInfo"
            gy3.C87412m.m108593f(r0, r6)
            r5[r4] = r0
            r3.mo68029b(r5)
            com.tencent.mm.plugin.webview.model.h2 r0 = r1.f117672L0
            com.tencent.mm.plugin.webview.model.w1 r0 = r0.mo68010h()
            r0.mo68028a()
        L_0x0472:
            com.tencent.mm.plugin.webview.ui.tools.r1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C6594r1.f23843a
            android.content.Intent r3 = r27.mo67715e0()
            r4 = 1
            r0.mo7521a(r3, r2, r4)
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            r1.f117698l1 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.core.C43522y.onPageFinished(com.tencent.xweb.WebView, java.lang.String):void");
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Parcelable parcelable;
        C87412m.m108594g(webView, "view");
        C87412m.m108594g(str, "url");
        this.f117691e1 = true;
        super.onPageStarted(webView, str, bitmap);
        mo67728j0().mo73829a("onPageStarted", System.currentTimeMillis());
        C43692a.m47525c(mo67745r0(), str);
        if (!mo63673M(str)) {
            if (!mo67745r0().supportFeature(2006)) {
                mo67720g0().mo73245m();
            }
            C45606x.m50663a(str);
            String t1 = mo67822t1();
            Log.m105924i(t1, "edw onPageStarted opt, url = " + str);
            C115669n.INSTANCE.idkeyStat(155, 0, 1, false);
            ((C46138l) C86312j.m106911c(C46138l.class)).mo32568qk(mo67817o1(), 0);
            if (CrashReportFactory.hasDebuger() && C87412m.m108589b("http://www.dktest-mmcrash.com/", str)) {
                Assert.assertTrue("test errlog in tools " + new SimpleDateFormat(TimeUtil.YYYY2MM2DD_HH1MM1SS).format(new Date()), false);
            }
            this.f117689c1 = mo67734o();
            ((C43546p) ((C36570n) this.f117684X0).getValue()).mo67835b(str, Util.nowSecond(), 1);
            this.f117672L0.mo68013k().mo68005a(this.f117689c1);
            mo67701V0(str);
            C44130p1.f119545i.mo68772c(str);
            Log.m105919d(mo67822t1(), "onPageStarted preUrl : %s, curUrl : %s.", this.f117689c1, mo67734o());
            if (mo67696T(str)) {
                String t15 = mo67822t1();
                Log.m105922f(t15, "onPageStarted, canLoadUrl fail, url = " + str);
                return;
            }
            ((C43748c0) ((C36570n) this.f117690d1).getValue()).mo68055a(str);
            C43704h2.C43715l e = this.f117672L0.mo68008e();
            e.mo68021a(mo67758z(), mo67817o1());
            e.mo68022b(str);
            Bundle bundle = (Bundle) mo67715e0().getParcelableExtra("jsapiargs");
            if (!(bundle == null || (parcelable = bundle.getParcelable("KSnsAdTag")) == null || !(parcelable instanceof SnsAdClick))) {
                String string = bundle.getString("KAnsUxInfo", "");
                this.f117672L0.mo68010h().mo68030c((SnsAdClick) parcelable);
                C43731w1 h = this.f117672L0.mo68010h();
                C87412m.m108593f(string, "uxInfo");
                h.mo68029b(str, "0", System.currentTimeMillis() + "", string);
                this.f117672L0.mo68010h().mo68028a();
            }
            C6594r1.f23843a.mo7521a(mo67715e0(), str, false);
            if (!this.f117700n1.mo67847c(str) && this.f117555b.f123185g) {
                if (C43757o.f118236a == null) {
                    C43757o.f118236a = new ArrayList<>();
                }
                if (!C43757o.f118236a.contains(str)) {
                    C43757o.f118236a.add(str);
                }
            }
        }
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        int i2 = i;
        String str3 = str2;
        Class cls = C46138l.class;
        if (!mo67748s0(this.f117558c0)) {
            Log.m105924i(mo67822t1(), "onReceivedError, intent not ready");
            return;
        }
        String domainString = WeChatHosts.domainString(C0966R.string.f360885fm3);
        boolean isConnected = NetStatusUtil.isConnected(MMApplicationContext.getContext());
        Log.m105921e(mo67822t1(), "edw onReceivedError, failingUrl = %s, errorCode = %d, desc = %s, isNetworkConnected = %b, allowFileAccess = %b", str3, Integer.valueOf(i), str, Boolean.valueOf(isConnected), Boolean.valueOf(this.f117553a.getSettings().getAllowFileAccess()));
        C115669n nVar = C115669n.INSTANCE;
        nVar.idkeyStat(155, 1, 1, false);
        nVar.idkeyStat(155, (long) C8866a.m8684a(i), 1, false);
        ((C46138l) C86312j.m106911c(cls)).mo32568qk(mo67817o1(), 1);
        ((C46138l) C86312j.m106911c(cls)).mo32568qk(mo67817o1(), C8866a.m8684a(i));
        ((C46138l) C86312j.m106911c(cls)).mo32567aW(mo67817o1(), mo63683n0(), C8866a.m8684a(i), this.f117672L0.mo68011i().f118110b);
        super.onReceivedError(webView, i, str, str2);
        C44130p1.f119545i.mo68773d(i2);
        this.f117672L0.mo68010h().f118193b = i2;
        C6594r1.f23844b = i2;
        if (((Boolean) ((C36570n) this.f117683W0).getValue()).booleanValue()) {
            mo67674G0();
        }
        try {
            if (C87412m.m108589b(new URL(str3).getHost(), domainString)) {
                ((C119157j) C119157j.f356862d).mo183876g(new C43524a0(str3, i2, domainString, this), "WebViewUI.CheckDNS");
            }
        } catch (MalformedURLException e) {
            Log.printErrStackTrace(mo67822t1(), e, "check mp url", new Object[0]);
        }
        super.onReceivedError(webView, i, str, str2);
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        Class cls = C46138l.class;
        if (!mo67748s0(this.f117558c0)) {
            Log.m105924i(mo67822t1(), "onReceivedSslError, intent not ready");
            return;
        }
        String url = (webView != null ? webView.getUrl() : null) == null ? this.f117597w : webView.getUrl();
        if (url != null) {
            String kk02 = ((C45696d) C86709a0.m107533q(C45696d.class)).kk0();
            C87412m.m108593f(kk02, "service(IBrandService::class.java).hardCodeUrl");
            if (C112551y.m153819s(url, kk02, false)) {
                url = mo63683n0();
            }
        }
        C115669n nVar = C115669n.INSTANCE;
        nVar.idkeyStat(155, 1, 1, false);
        nVar.idkeyStat(155, 30, 1, false);
        ((C46138l) C86312j.m106911c(cls)).mo32568qk(mo67817o1(), 1);
        ((C46138l) C86312j.m106911c(cls)).mo32568qk(mo67817o1(), 30);
        ((C46138l) C86312j.m106911c(cls)).mo32567aW(mo67817o1(), mo63683n0(), 30, this.f117672L0.mo68011i().f118110b);
        ((C43976g) ((C36570n) this.f117688b1).getValue()).mo68566b(url, sslErrorHandler, sslError);
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    /* renamed from: p0 */
    public Class<? extends Service> mo67742p0() {
        return (Class) ((C36570n) this.f117674N0).getValue();
    }

    /* renamed from: p1 */
    public final C43542m mo67818p1() {
        return (C43542m) ((C36570n) this.f117695i1).getValue();
    }

    /* renamed from: q1 */
    public final String mo67819q1() {
        String title = this.f117553a.getTitle();
        if (title != null) {
            return title;
        }
        String stringExtra = mo67715e0().getStringExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        if (stringExtra != null) {
            return stringExtra;
        }
        String stringExtra2 = mo67715e0().getStringExtra("webpageTitle");
        return stringExtra2 == null ? "" : stringExtra2;
    }

    /* renamed from: r1 */
    public final Point mo67820r1() {
        return this.f117700n1.f117769c;
    }

    /* renamed from: s1 */
    public final long mo67821s1() {
        return this.f117700n1.f117770d;
    }

    /* renamed from: t0 */
    public void mo63684t0() {
        mo67679J(new C43733x1());
        super.mo63684t0();
        mo67679J(new C48292d());
    }

    /* renamed from: t1 */
    public final String mo67822t1() {
        return (String) ((C36570n) this.f117673M0).getValue();
    }

    /* renamed from: u1 */
    public boolean mo67823u1(String str) {
        C87412m.m108594g(str, "url");
        Iterator it = ((ArrayList) this.f117699m1).iterator();
        while (it.hasNext()) {
            C53298a aVar = (C53298a) it.next();
            if (aVar.mo67830e(str)) {
                String t1 = mo67822t1();
                Log.m105924i(t1, "url handled, url = " + str);
                boolean b = aVar.mo67829b(str);
                String t15 = mo67822t1();
                Log.m105924i(t15, "url handled, ret = " + b + ", url = " + str);
                return true;
            }
        }
        return false;
    }

    /* renamed from: v1 */
    public final boolean mo67824v1() {
        return this.f117700n1.f117767a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
        r0 = r4.f117685Y0.mo68026b(r6.getUrl().toString(), r6, !((java.lang.Boolean) ((rx3.C36570n) r4.f117686Z0).getValue()).booleanValue(), mo67731m());
     */
    /* renamed from: w0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.xweb.WebResourceResponse mo67753w0(com.tencent.xweb.WebView r5, com.tencent.xweb.WebResourceRequest r6, android.os.Bundle r7) {
        /*
            r4 = this;
            java.lang.String r0 = "webview"
            gy3.C87412m.m108594g(r5, r0)
            java.lang.String r0 = "request"
            gy3.C87412m.m108594g(r6, r0)
            boolean r0 = r4.mo67666A0()
            if (r0 == 0) goto L_0x003e
            int r0 = r4.f117556b0
            boolean r0 = r4.mo67748s0(r0)
            if (r0 == 0) goto L_0x003e
            com.tencent.mm.plugin.webview.model.q1 r0 = r4.f117685Y0
            android.net.Uri r1 = r6.getUrl()
            java.lang.String r1 = r1.toString()
            rx3.g r2 = r4.f117686Z0
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r2 = r2 ^ 1
            com.tencent.mm.plugin.webview.stub.l r3 = r4.mo67731m()
            com.tencent.xweb.WebResourceResponse r0 = r0.mo68026b(r1, r6, r2, r3)
            if (r0 == 0) goto L_0x003e
            return r0
        L_0x003e:
            com.tencent.xweb.WebResourceResponse r5 = super.mo67753w0(r5, r6, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.core.C43522y.mo67753w0(com.tencent.xweb.WebView, com.tencent.xweb.WebResourceRequest, android.os.Bundle):com.tencent.xweb.WebResourceResponse");
    }

    /* renamed from: w1 */
    public final void mo67825w1() {
        int intExtra = mo67715e0().getIntExtra("pay_channel", -1);
        if (intExtra != -1) {
            Log.m105925i(mo67822t1(), "hy: found channel in intent. pay channel: %d", Integer.valueOf(intExtra));
            return;
        }
        int xs = mo67731m().mo68151xs();
        if (xs != -1) {
            Log.m105925i(mo67822t1(), "hy: found channel in channel helper. pay channel: %d", Integer.valueOf(xs));
            mo67715e0().putExtra("pay_channel", xs);
        }
    }

    /* renamed from: x */
    public void mo67754x(String str, Map<String, String> map, boolean z) {
        C87412m.m108594g(str, "url");
        C43692a.m47525c(this.f117553a, str);
        super.mo67754x(str, map, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: x1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo67826x1() {
        /*
            r4 = this;
            r0 = 0
            android.content.Intent r1 = r4.mo67715e0()     // Catch:{ Exception -> 0x002d }
            java.lang.String r2 = "srcUsername"
            java.lang.String r1 = r1.getStringExtra(r2)     // Catch:{ Exception -> 0x002d }
            android.content.Intent r2 = r4.mo67715e0()     // Catch:{ Exception -> 0x002d }
            java.lang.String r3 = "bizofstartfrom"
            java.lang.String r2 = r2.getStringExtra(r3)     // Catch:{ Exception -> 0x002d }
            r3 = 1
            if (r1 == 0) goto L_0x0021
            boolean r1 = z04.C112551y.m153811k(r1)     // Catch:{ Exception -> 0x002d }
            if (r1 == 0) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            r1 = 0
            goto L_0x0022
        L_0x0021:
            r1 = 1
        L_0x0022:
            if (r1 != 0) goto L_0x002d
            java.lang.String r1 = "enterpriseHomeSubBrand"
            boolean r1 = gy3.C87412m.m108589b(r2, r1)     // Catch:{ Exception -> 0x002d }
            if (r1 == 0) goto L_0x002d
            r0 = 1
        L_0x002d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.core.C43522y.mo67826x1():boolean");
    }

    /* renamed from: y1 */
    public void mo67827y1(String str) {
        C87412m.m108594g(str, "url");
        boolean booleanExtra = mo67715e0().getBooleanExtra(C74928u.C45093i.f122327s, false);
        if (this.f117539M.mo70859b().mo69430b() || booleanExtra) {
            String t1 = mo67822t1();
            Log.m105924i(t1, "allowJumpWithoutPerm: " + booleanExtra);
            Bundle bundle = new Bundle();
            bundle.putInt("fromScene", 100);
            if (mo67731m().Cb0(str, this.f117539M.mo70860c().mo69447f(7), bundle)) {
                String t15 = mo67822t1();
                Log.m105924i(t15, "shouldOverride, built in url handled, url = " + str);
                return;
            }
            return;
        }
        Log.m105928w(mo67822t1(), "shouldOverride, allow inner open url, not allow");
    }

    /* renamed from: z */
    public int mo67758z() {
        return mo67729k0(mo67715e0().getStringExtra("geta8key_username"));
    }

    /* renamed from: z1 */
    public final void mo67828z1(int i) {
        if (i < 1 || i > 8) {
            i = 2;
        }
        ((C119157j) C119157j.f356862d).mo183895z(new C43526b0(this, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43522y(MMWebView mMWebView, C43704h2 h2Var, C45520t.C45522b bVar, Set<String> set, C13853i iVar) {
        super(mMWebView, bVar, set, iVar);
        C87412m.m108594g(mMWebView, "viewWV");
        C87412m.m108594g(h2Var, "webviewReportMgr");
        C87412m.m108594g(bVar, "options");
        this.f117672L0 = h2Var;
        this.f117673M0 = C36568h.m40985a(new C43548q(this));
        this.f117674N0 = C36568h.m40985a(C43534f0.f117729d);
        this.f117678R0 = new C43860c();
        this.f117681U0 = C36568h.m40985a(new C43552u(this));
        this.f117682V0 = C36568h.m40985a(new C43554w(this));
        this.f117683W0 = C36568h.m40985a(new C43553v(this));
        this.f117684X0 = C36568h.m40985a(new C43536g0(this));
        this.f117685Y0 = new C43725q1(mo67707a0());
        this.f117686Z0 = C36568h.m40985a(new C43555x(this));
        this.f117688b1 = C36568h.m40985a(new C43532e0(mMWebView));
        this.f117690d1 = C36568h.m40985a(C43528c0.f117722d);
        this.f117693g1 = "file:///android_asset/jsapi/wxjs.js";
        this.f117694h1 = new HashSet();
        this.f117695i1 = C36568h.m40985a(new C43530d0(this));
        this.f117696j1 = new C43550s(new WeakReference(this));
        this.f117697k1 = new C43549r(new WeakReference(this));
        this.f117699m1 = new ArrayList();
        this.f117700n1 = new C43556y(bVar, this);
        this.f117701o1 = new C43538i(this);
        this.f117702p1 = new C43529d(this);
        this.f117703q1 = new C43539j(this);
        this.f117704r1 = new C43540k(this);
        this.f117705s1 = new C43523a(this);
        this.f117707u1 = true;
        this.f117708v1 = new C43545o(this, mMWebView);
        this.f117709w1 = new C43537h(this);
        this.f117710x1 = new C43544n(this);
        this.f117711y1 = new C43533f(this);
        this.f117712z1 = new C43525b(this);
        this.f117667A1 = new C43541l(this);
        this.f117668B1 = new C43527c(this);
        this.f117670D1 = new C43531e(this, mMWebView);
        this.f117671E1 = new C43535g(this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C43522y(MMWebView mMWebView, C43704h2 h2Var, C45520t.C45522b bVar) {
        this(mMWebView, h2Var, bVar, (Set) null, (C13853i) null, 16, (C8480h) null);
        C87412m.m108594g(mMWebView, "viewWV");
        C87412m.m108594g(h2Var, "webviewReportMgr");
        C87412m.m108594g(bVar, "options");
    }
}
