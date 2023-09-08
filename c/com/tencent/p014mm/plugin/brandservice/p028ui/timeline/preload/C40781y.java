package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload;

import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import c30.C104289g;
import c30.C26827e;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40480g;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83161f;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.webcompt.C44404a;
import com.tencent.p014mm.pluginsdk.model.C44594n1;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMKVSlotManager;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.xweb.file.XVFSFile;
import com.tencent.xweb.internal.ConstValue;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import ea3.C7616k;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import r73.C47930c;
import r73.C47934j;
import r73.C47937l;
import r73.C47940m;
import r73.C47943r;
import r73.C47945s;
import r73.C47946t;
import r73.C47947u;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import s73.C48255c;
import t73.C48555a;
import t73.C48571o;
import t73.C48572p;
import t83.C13848e;
import t83.C13851h1;
import t83.C48586h;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.y */
public final class C40781y extends C48571o {

    /* renamed from: c */
    public String f109631c = "__Mp_Prefetcher_FakeAppId";

    /* renamed from: d */
    public final C13601g f109632d = C36568h.m40985a(C2136c.f12106d);

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.y$a */
    public static final class C2134a extends C87413o implements C32226l<C40480g, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f12103d;

        /* renamed from: e */
        public final /* synthetic */ C32226l<String, C13598b0> f12104e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2134a(String str, C32226l<? super String, C13598b0> lVar) {
            super(1);
            this.f12103d = str;
            this.f12104e = lVar;
        }

        public Object invoke(Object obj) {
            C40480g gVar = (C40480g) obj;
            C87412m.m108594g(gVar, "jsContext");
            gVar.evaluateJavascript(this.f12103d, new C2133x(this.f12104e));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.y$b */
    public static final class C2135b<T> implements ValueCallback {

        /* renamed from: a */
        public final /* synthetic */ C32226l<String, C13598b0> f12105a;

        public C2135b(C32226l<? super String, C13598b0> lVar) {
            this.f12105a = lVar;
        }

        public void onReceiveValue(Object obj) {
            String str = (String) obj;
            Log.m105918d("MicroMsg.MpWebPrefetcherJsEngineInterceptor", "inject callback:" + str);
            C32226l<String, C13598b0> lVar = this.f12105a;
            C87412m.m108593f(str, LocaleUtil.ITALIAN);
            lVar.invoke(str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.y$c */
    public static final class C2136c extends C87413o implements C32224a<MMKVSlotManager> {

        /* renamed from: d */
        public static final C2136c f12106d = new C2136c();

        public C2136c() {
            super(0);
        }

        public Object invoke() {
            MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("PrefechLocalData");
            C87412m.m108593f(mmkv, "getMMKV(\"PrefechLocalData\")");
            return new MMKVSlotManager(mmkv, 2592000);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.y$d */
    public static final class C40782d implements C47945s {

        /* renamed from: d */
        public final String f109633d;

        /* renamed from: e */
        public final /* synthetic */ C40781y f109634e;

        public C40782d(String str, C40781y yVar) {
            this.f109634e = yVar;
            this.f109633d = str;
        }

        /* renamed from: I0 */
        public void mo60865I0(String str, String str2, ValueCallback<String> valueCallback) {
            C87412m.m108594g(str, "eventType");
            C87412m.m108594g(str2, "event");
            this.f109634e.mo73188e().mo60865I0(str, str2, valueCallback);
        }

        public String getId() {
            return this.f109633d;
        }

        /* renamed from: x0 */
        public void mo63605x0(int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.y$e */
    public static final class C40783e implements C47947u {
        /* renamed from: c0 */
        public void mo63711c0(String str) {
            String str2 = str;
            C87412m.m108594g(str2, "data");
            Log.m105918d("MicroMsg.MpWebPrefetcherJsEngineInterceptor", "[TRACE_VIDEO_PRELOAD] cacheVideo, data = " + str2);
            C40726l lVar = C40726l.f109414a;
            try {
                if (C7616k.f25897a.mo8749a()) {
                    C115669n.INSTANCE.idkeyStat(1379, 51, 1, false);
                }
                C26827e eVar = new C26827e(str2);
                int length = eVar.length();
                for (int i = 0; i < length; i++) {
                    C104289g o = eVar.mo53814m(i);
                    String optString = o.optString("url");
                    long optLong = o.optLong("position");
                    int optInt = o.optInt("preloadType");
                    long optLong2 = o.optLong("length");
                    if (optLong2 > 10485760) {
                        optLong2 = 10485760;
                    }
                    int optInt2 = o.optInt("videoType", 0);
                    if (optLong2 < 512000) {
                        optLong2 = 512000;
                    }
                    if (Util.isNullOrNil(optString)) {
                        Log.m105928w("MicroMsg.BizVideoPreloadLogic", "cacheVideo url is null");
                        return;
                    }
                    String str3 = C44594n1.m49046b() ? WeChatProcess.PROCESS_MAIN : WeChatProcess.PROCESS_TOOLS;
                    if (optInt != 0) {
                        str3 = WeChatProcess.PROCESS_APPBRAND0;
                    }
                    String str4 = str3;
                    C87412m.m108593f(str4, ConstValue.INIT_CONFIG_KEY_PROCESSNAME);
                    C87412m.m108593f(optString, "url");
                    lVar.mo63633b(str4, optString, optLong, optLong2, optInt2);
                }
            } catch (Exception e) {
                Log.m105920e("MicroMsg.BizVideoPreloadLogic", "cacheVideo ex " + e.getMessage());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.y$f */
    public static final class C40784f implements C47940m {

        /* renamed from: d */
        public final /* synthetic */ C40781y f109635d;

        /* renamed from: e */
        public final /* synthetic */ String f109636e;

        /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.y$f$a */
        public static final class C40785a implements C48586h {
            /* renamed from: h */
            public void mo63613h(C13851h1 h1Var, C13848e eVar) {
            }
        }

        public C40784f(C40781y yVar, String str) {
            this.f109635d = yVar;
            this.f109636e = str;
        }

        /* renamed from: B0 */
        public C48586h mo63606B0() {
            return new C40785a();
        }

        /* renamed from: I0 */
        public void mo60865I0(String str, String str2, ValueCallback<String> valueCallback) {
            C87412m.m108594g(str, "eventType");
            C87412m.m108594g(str2, "event");
            this.f109635d.mo73188e().mo60865I0(str, str2, valueCallback);
        }

        /* renamed from: d0 */
        public boolean mo63607d0(int i, String str) {
            C87412m.m108594g(str, "cgiUrl");
            return false;
        }

        @JavascriptInterface
        public String getLocalData(String str) {
            C87412m.m108594g(str, "key");
            String decodeString$default = MMKVSlotManager.decodeString$default((MMKVSlotManager) ((C36570n) this.f109635d.f109632d).getValue(), this.f109636e + XVFSFile.PATH_SEPARATOR_CHAR + str, (String) null, 2, (Object) null);
            if (decodeString$default == null) {
                decodeString$default = "";
            }
            Log.m105924i("MicroMsg.MpWebPrefetcherJsEngineInterceptor", "[TRACE_VIDEO_PRELOAD] getLocalData key = " + str + ", data = " + decodeString$default);
            return decodeString$default;
        }

        /* renamed from: i0 */
        public int mo63609i0() {
            return C44404a.m48766c(this.f109635d.mo73188e().mo72996G1());
        }

        /* renamed from: p0 */
        public void mo63610p0(String str, String str2) {
            C87412m.m108594g(str, "func");
            C87412m.m108594g(str2, StateEvent.Name.MESSAGE);
        }

        @JavascriptInterface
        public void setLocalData(String str, String str2) {
            C87412m.m108594g(str, "key");
            C87412m.m108594g(str2, "data");
            Log.m105924i("MicroMsg.MpWebPrefetcherJsEngineInterceptor", "[TRACE_VIDEO_PRELOAD] setLocalData key = " + str + ", data = " + str2);
            StringBuilder sb = new StringBuilder();
            sb.append(this.f109636e);
            sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
            sb.append(str);
            ((MultiProcessMMKV) ((MMKVSlotManager) ((C36570n) this.f109635d.f109632d).getValue()).getSlotForWrite()).encode(sb.toString(), str2);
        }

        /* renamed from: u0 */
        public int mo63612u0() {
            return 0;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.y$g */
    public static final class C40786g implements C47930c {

        /* renamed from: d */
        public final /* synthetic */ C40781y f109637d;

        public C40786g(C40781y yVar) {
            this.f109637d = yVar;
        }

        /* renamed from: I0 */
        public void mo60865I0(String str, String str2, ValueCallback<String> valueCallback) {
            C87412m.m108594g(str, "eventType");
            C87412m.m108594g(str2, "event");
            this.f109637d.mo73188e().mo60865I0(str, str2, valueCallback);
        }
    }

    /* renamed from: f */
    public boolean mo63709f(int i, C48555a aVar, String str, C32226l<? super String, C13598b0> lVar) {
        C48555a aVar2 = aVar;
        String str2 = str;
        C32226l<? super String, C13598b0> lVar2 = lVar;
        C87412m.m108594g(aVar2, "manifest");
        C87412m.m108594g(str2, "script");
        C87412m.m108594g(lVar2, "onCallback");
        if (i != 1) {
            return false;
        }
        String str3 = aVar2.f129893g;
        if (str3 == null) {
            str3 = C48572p.m53970a(aVar2.f129888b.f141131i + '-' + aVar2.f129888b.f141127e);
        }
        if (!mo73187d().containsKey(str3)) {
            C2134a aVar3 = new C2134a(str2, lVar2);
            String str4 = aVar2.f129887a.f140537d;
            Log.m105924i("MicroMsg.MpWebPrefetcherJsEngineInterceptor", "create domain:" + str4 + '#' + str3);
            try {
                C40480g X = mo73188e().mo115378X();
                C87412m.m108593f(str4, "domain");
                mo63710g(X, str3, str4);
                C48255c e = mo73188e();
                C48255c.m53593z1(e, X, "MpWebPrefetcherManifest#" + str3, "manifest", (C32226l) null, mo73186c("manifest", this.f109631c), 8, (Object) null);
                mo73187d().put(str3, Integer.valueOf(((C83161f) X).f242978h));
                aVar3.invoke(X);
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.MpWebPrefetcherJsEngineInterceptor", e2, "create id=" + str3, new Object[0]);
            }
        } else {
            C48255c e3 = mo73188e();
            Integer num = mo73187d().get(str3);
            C87412m.m108591d(num);
            e3.mo115375F0(num.intValue()).evaluateJavascript(str2, new C2135b(lVar2));
        }
        return true;
    }

    /* renamed from: g */
    public final void mo63710g(C83165i iVar, String str, String str2) {
        new C47943r(new C40782d(str, this)).mo72687a(iVar);
        new C47946t(new C40783e()).mo72687a(iVar);
        new C47937l(new C40784f(this, str2)).mo72687a(iVar);
        new C47934j(new C40786g(this)).mo72687a(iVar);
    }
}
