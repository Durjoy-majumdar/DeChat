package u93;

import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import c00.C0405n;
import cc0.C92411b;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.ipcinvoker.C1255d;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.C82793b;
import com.tencent.p014mm.plugin.websearch.webview.BaseWebSearchWebView;
import com.tencent.p014mm.plugin.webview.p128ui.tools.fts.C43960b0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di0.C86299o;
import di3.C86312j;
import f40.C86718e;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kr0.C76630x0;
import o40.C61926c;
import org.json.JSONObject;
import p702ts.C78085c;
import q20.C89449a;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import t83.C13851h1;
import te3.C48884bn2;
import wi0.C90973a0;
import wi0.C91003z;
import z73.C53759a;
import z73.C53760c;
import zt3.C119157j;

/* renamed from: u93.c */
public final class C52480c extends C53760c {

    /* renamed from: d */
    public static final C52482b f146628d = new C52482b((C8480h) null);

    /* renamed from: e */
    public static final C13601g<MultiProcessMMKV> f146629e = C36568h.m40985a(C14139c.f39569d);

    /* renamed from: b */
    public final String f146630b = "onDeviceMotionFired";

    /* renamed from: c */
    public final String f146631c = "onCurrentLocationReady";

    /* renamed from: u93.c$c */
    public static final class C14139c extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C14139c f39569d = new C14139c();

        public C14139c() {
            super(0);
        }

        public Object invoke() {
            int h = C86718e.m107549h();
            Log.m105924i("MicroMsg.WebSearch.WebSearchJSApi", "webSearchMMKV: " + h);
            return MultiProcessMMKV.getMMKV(h + "_WebSearch");
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002 \u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo182094d2 = {"Lu93/c$a;", "Lcom/tencent/mm/ipcinvoker/d;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "", "", "", "<init>", "()V", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: u93.c$a */
    public static final class C52481a implements C1255d<IPCString, Map<String, Object>> {
        public void invoke(Object obj, C1256g gVar) {
            IPCString iPCString = (IPCString) obj;
            C87412m.m108594g(gVar, "callback");
            C52480c.f146628d.mo73431b(iPCString != null ? iPCString.f10315d : null, new C52479b(gVar));
        }
    }

    /* renamed from: u93.c$b */
    public static final class C52482b {

        /* renamed from: u93.c$b$a */
        public static final class C52483a implements C92411b.C92412a {

            /* renamed from: d */
            public final /* synthetic */ C52484d f146632d;

            public C52483a(C52484d dVar) {
                this.f146632d = dVar;
            }

            public boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
                HashMap hashMap = new HashMap();
                C52480c.f146628d.mo73430a(hashMap);
                ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms().mo126408b(this);
                C52484d dVar = this.f146632d;
                if (dVar == null) {
                    return true;
                }
                dVar.mo73421a(hashMap);
                return true;
            }
        }

        public C52482b(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo73430a(Map<String, Object> map) {
            C48884bn2 tp = ((C0405n) C86312j.m106911c(C0405n.class)).mo284tp();
            if (tp != null) {
                map.put("latitude", Float.valueOf(tp.f131220e));
                map.put("longitude", Float.valueOf(tp.f131219d));
                map.put("precision", Integer.valueOf(tp.f131221f));
                map.put("macAddr", tp.f131222g);
                map.put("cellId", tp.f131223h);
                map.put("gpsSource", Integer.valueOf(tp.f131224i));
                map.put("address", tp.f131225j);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0039  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x004e  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo73431b(java.lang.String r5, u93.C52480c.C52484d r6) {
            /*
                r4 = this;
                java.lang.String r0 = "MicroMsg.WebSearch.WebSearchJSApi"
                r1 = 1
                r2 = 0
                if (r5 == 0) goto L_0x0016
                org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ all -> 0x000c }
                r3.<init>(r5)     // Catch:{ all -> 0x000c }
                goto L_0x0017
            L_0x000c:
                r5 = move-exception
                java.lang.Object[] r3 = new java.lang.Object[r1]
                r3[r2] = r5
                java.lang.String r5 = "getCurrentLocationData err"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r5, r3)
            L_0x0016:
                r3 = 0
            L_0x0017:
                if (r3 == 0) goto L_0x0022
                java.lang.String r5 = "needUpdate"
                int r5 = r3.optInt(r5, r2)
                if (r5 != r1) goto L_0x0022
                goto L_0x0023
            L_0x0022:
                r1 = 0
            L_0x0023:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r3 = "getCurrentLocationData needUpdate = "
                r5.append(r3)
                r5.append(r1)
                java.lang.String r5 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
                if (r1 == 0) goto L_0x004e
                u93.c$b$a r5 = new u93.c$b$a
                r5.<init>(r6)
                java.lang.Class<ts.c> r6 = p702ts.C78085c.class
                di3.d r6 = di3.C86312j.m106911c(r6)
                ts.c r6 = (p702ts.C78085c) r6
                cc0.b r6 = r6.mo108056ms()
                r6.mo126407a(r5, r2)
                return
            L_0x004e:
                java.util.HashMap r5 = new java.util.HashMap
                r5.<init>()
                r4.mo73430a(r5)
                if (r6 == 0) goto L_0x005b
                r6.mo73421a(r5)
            L_0x005b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: u93.C52480c.C52482b.mo73431b(java.lang.String, u93.c$d):void");
        }
    }

    /* renamed from: u93.c$d */
    public interface C52484d {
        /* renamed from: a */
        void mo73421a(Map<String, Object> map);
    }

    /* renamed from: u93.c$e */
    public static final class C52485e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C52480c f146633d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52485e(C52480c cVar) {
            super(0);
            this.f146633d = cVar;
        }

        public Object invoke() {
            C53759a aVar = this.f146633d.f150904a;
            C52478a aVar2 = aVar instanceof C52478a ? (C52478a) aVar : null;
            if (aVar2 != null) {
                aVar2.mo68431K3();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: u93.c$f */
    public static final class C52486f implements C43960b0.C43962b {

        /* renamed from: a */
        public final /* synthetic */ C52480c f146634a;

        /* renamed from: u93.c$f$a */
        public static final class C52487a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ BaseWebSearchWebView f146635d;

            /* renamed from: e */
            public final /* synthetic */ String f146636e;

            /* renamed from: f */
            public final /* synthetic */ C52480c f146637f;

            public C52487a(BaseWebSearchWebView baseWebSearchWebView, String str, C52480c cVar) {
                this.f146635d = baseWebSearchWebView;
                this.f146636e = str;
                this.f146637f = cVar;
            }

            public final void run() {
                try {
                    Log.m105924i("MicroMsg.WebSearch.WebSearchJSApi", "startCheck , Runnable = " + this.f146635d.getRandomStr());
                    BaseWebSearchWebView baseWebSearchWebView = this.f146635d;
                    baseWebSearchWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f146636e + ')', (ValueCallback<String>) null);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.WebSearch.WebSearchJSApi", "onSendEventToJSBridge fail, event=%s, ex=%s", this.f146637f.f146630b, e.getMessage());
                }
            }
        }

        public C52486f(C52480c cVar) {
            this.f146634a = cVar;
        }

        public final void call() {
            BaseWebSearchWebView webView;
            StringBuilder sb = new StringBuilder();
            sb.append("startCheck , deviceMotionMonitor onshake. uiWebView = ");
            C53759a aVar = this.f146634a.f150904a;
            sb.append(aVar != null ? aVar.getWebView() : null);
            Log.m105924i("MicroMsg.WebSearch.WebSearchJSApi", sb.toString());
            C53759a aVar2 = this.f146634a.f150904a;
            if (aVar2 != null && (webView = aVar2.getWebView()) != null) {
                C52480c cVar = this.f146634a;
                C52487a aVar3 = new C52487a(webView, C13851h1.C13852a.m13143c(cVar.f146630b, (Map<String, Object>) null, false, webView.getRandomStr()), cVar);
                if (MMHandlerThread.isMainThread()) {
                    aVar3.run();
                } else {
                    MMHandlerThread.postToMainThread(aVar3);
                }
            }
        }
    }

    /* renamed from: u93.c$g */
    public static final class C52488g<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ C52484d f146638d;

        public C52488g(C52484d dVar) {
            this.f146638d = dVar;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            Map map = (Map) obj;
            C52484d dVar = this.f146638d;
            C87412m.m108591d(map);
            dVar.mo73421a(map);
        }
    }

    /* renamed from: u93.c$h */
    public static final class C52489h implements C52484d {

        /* renamed from: a */
        public final /* synthetic */ C52480c f146639a;

        /* renamed from: u93.c$h$a */
        public static final class C52490a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ BaseWebSearchWebView f146640d;

            /* renamed from: e */
            public final /* synthetic */ String f146641e;

            /* renamed from: f */
            public final /* synthetic */ C52480c f146642f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C52490a(BaseWebSearchWebView baseWebSearchWebView, String str, C52480c cVar) {
                super(0);
                this.f146640d = baseWebSearchWebView;
                this.f146641e = str;
                this.f146642f = cVar;
            }

            public Object invoke() {
                try {
                    Log.m105924i("MicroMsg.WebSearch.WebSearchJSApi", "startCheck , Runnable = " + this.f146640d.getRandomStr());
                    BaseWebSearchWebView baseWebSearchWebView = this.f146640d;
                    baseWebSearchWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f146641e + ')', (ValueCallback<String>) null);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.WebSearch.WebSearchJSApi", "onSendEventToJSBridge fail, event=%s, ex=%s", this.f146642f.f146631c, e.getMessage());
                }
                return C13598b0.f38549a;
            }
        }

        public C52489h(C52480c cVar) {
            this.f146639a = cVar;
        }

        /* renamed from: a */
        public void mo73421a(Map<String, Object> map) {
            BaseWebSearchWebView webView;
            C87412m.m108594g(map, "result");
            Object[] objArr = new Object[2];
            C53759a aVar = this.f146639a.f150904a;
            objArr[0] = aVar != null ? aVar.getWebView() : null;
            objArr[1] = map;
            Log.m105925i("MicroMsg.WebSearch.WebSearchJSApi", "startCheck , deviceMotionMonitor onshake. uiWebView = %s, locationObj = %s.", objArr);
            C53759a aVar2 = this.f146639a.f150904a;
            if (aVar2 != null && (webView = aVar2.getWebView()) != null) {
                C52480c cVar = this.f146639a;
                C61926c.m72668M(new C52490a(webView, C13851h1.C13852a.m13143c(cVar.f146631c, map, false, webView.getRandomStr()), cVar));
            }
        }
    }

    /* renamed from: u93.c$i */
    public static final class C52491i implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f146643d;

        public C52491i(String str) {
            this.f146643d = str;
        }

        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r6 = this;
                java.lang.String r0 = r6.f146643d
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r3 = 0
                r2[r3] = r0
                java.lang.String r4 = "MicroMsg.WebSearch.SosUtil"
                java.lang.String r5 = "setPreGetParams: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r2)
                if (r0 == 0) goto L_0x0021
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0017 }
                r2.<init>(r0)     // Catch:{ all -> 0x0017 }
                goto L_0x0022
            L_0x0017:
                r0 = move-exception
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r3] = r0
                java.lang.String r0 = "setPreGetParams err"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r0, r1)
            L_0x0021:
                r2 = 0
            L_0x0022:
                if (r2 == 0) goto L_0x002b
                java.lang.String r0 = "extReqParams"
                java.lang.String r0 = r2.optString(r0)
                goto L_0x002d
            L_0x002b:
                java.lang.String r0 = ""
            L_0x002d:
                java.lang.Class<u73.n> r1 = u73.C101980n.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                u73.n r1 = (u73.C101980n) r1
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = r1.mo134692sm()
                java.lang.String r2 = "websearch_preget_extReqParams"
                r1.encode((java.lang.String) r2, (java.lang.String) r0)
                int r0 = com.tencent.p014mm.plugin.websearch.C43471q.m46977a(r3)
                java.lang.String r2 = "websearch_preget_version"
                r1.encode((java.lang.String) r2, (int) r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: u93.C52480c.C52491i.run():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52480c(C52478a aVar) {
        super(aVar);
        C87412m.m108594g(aVar, "uiComponent");
    }

    /* renamed from: a */
    public boolean mo73422a(int i, String str, int i2) {
        C87412m.m108594g(str, "feature");
        return C87412m.m108589b(str, "clearSearchBarFocus") && i2 <= 0;
    }

    /* renamed from: b */
    public MultiProcessMMKV mo73423b() {
        MultiProcessMMKV multiProcessMMKV = (MultiProcessMMKV) ((C36570n) f146629e).getValue();
        C87412m.m108593f(multiProcessMMKV, "webSearchMMKV");
        return multiProcessMMKV;
    }

    /* renamed from: c */
    public boolean mo73424c() {
        return AppForegroundDelegate.INSTANCE.f343454n;
    }

    @JavascriptInterface
    public final String clearSearchBarFocus(String str) {
        Log.m105924i("MicroMsg.WebSearch.WebSearchJSApi", "clearSearchBarFocus: " + str);
        C61926c.m72668M(new C52485e(this));
        String jSONObject = mo74341e().toString();
        C87412m.m108593f(jSONObject, "returnSuccess().toString()");
        return jSONObject;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001c A[Catch:{ Exception -> 0x009e }] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025 A[Catch:{ Exception -> 0x009e }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042 A[Catch:{ Exception -> 0x009e }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005e A[Catch:{ Exception -> 0x009e }] */
    @android.webkit.JavascriptInterface
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String deviceMotionMonitor(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.Class<com.tencent.mm.plugin.webview.ui.tools.fts.b0> r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.fts.C43960b0.class
            java.lang.String r1 = "MicroMsg.WebSearch.WebSearchJSApi"
            r2 = 0
            r3 = 0
            if (r7 == 0) goto L_0x0019
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ all -> 0x000e }
            r4.<init>(r7)     // Catch:{ all -> 0x000e }
            goto L_0x001a
        L_0x000e:
            r7 = move-exception
            java.lang.String r4 = "deviceMotionMonitor err"
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x009e }
            r5[r2] = r7     // Catch:{ Exception -> 0x009e }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r4, r5)     // Catch:{ Exception -> 0x009e }
        L_0x0019:
            r4 = r3
        L_0x001a:
            if (r4 == 0) goto L_0x0025
            java.lang.String r7 = "action"
            java.lang.String r5 = ""
            java.lang.String r7 = r4.optString(r7, r5)     // Catch:{ Exception -> 0x009e }
            goto L_0x0026
        L_0x0025:
            r7 = r3
        L_0x0026:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009e }
            r4.<init>()     // Catch:{ Exception -> 0x009e }
            java.lang.String r5 = "deviceMotionMonitor = "
            r4.append(r5)     // Catch:{ Exception -> 0x009e }
            r4.append(r7)     // Catch:{ Exception -> 0x009e }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x009e }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)     // Catch:{ Exception -> 0x009e }
            java.lang.String r1 = "activate"
            boolean r1 = r1.equals(r7)     // Catch:{ Exception -> 0x009e }
            if (r1 == 0) goto L_0x005e
            com.tencent.mm.plugin.webview.ui.tools.fts.b0 r7 = com.tencent.p014mm.plugin.webview.p128ui.tools.fts.C43960b0.f119089e     // Catch:{ Exception -> 0x009e }
            if (r7 != 0) goto L_0x0053
            monitor-enter(r0)     // Catch:{ Exception -> 0x009e }
            com.tencent.mm.plugin.webview.ui.tools.fts.b0 r7 = new com.tencent.mm.plugin.webview.ui.tools.fts.b0     // Catch:{ all -> 0x0050 }
            r7.<init>()     // Catch:{ all -> 0x0050 }
            com.tencent.p014mm.plugin.webview.p128ui.tools.fts.C43960b0.f119089e = r7     // Catch:{ all -> 0x0050 }
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            goto L_0x0053
        L_0x0050:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            throw r7     // Catch:{ Exception -> 0x009e }
        L_0x0053:
            com.tencent.mm.plugin.webview.ui.tools.fts.b0 r7 = com.tencent.p014mm.plugin.webview.p128ui.tools.fts.C43960b0.f119089e     // Catch:{ Exception -> 0x009e }
            u93.c$f r0 = new u93.c$f     // Catch:{ Exception -> 0x009e }
            r0.<init>(r6)     // Catch:{ Exception -> 0x009e }
            r7.mo68556a(r0)     // Catch:{ Exception -> 0x009e }
            goto L_0x0090
        L_0x005e:
            java.lang.String r1 = "terminate"
            boolean r7 = r1.equals(r7)     // Catch:{ Exception -> 0x009e }
            if (r7 == 0) goto L_0x0090
            com.tencent.mm.plugin.webview.ui.tools.fts.b0 r7 = com.tencent.p014mm.plugin.webview.p128ui.tools.fts.C43960b0.f119089e     // Catch:{ Exception -> 0x009e }
            if (r7 != 0) goto L_0x0077
            monitor-enter(r0)     // Catch:{ Exception -> 0x009e }
            com.tencent.mm.plugin.webview.ui.tools.fts.b0 r7 = new com.tencent.mm.plugin.webview.ui.tools.fts.b0     // Catch:{ all -> 0x0074 }
            r7.<init>()     // Catch:{ all -> 0x0074 }
            com.tencent.p014mm.plugin.webview.p128ui.tools.fts.C43960b0.f119089e = r7     // Catch:{ all -> 0x0074 }
            monitor-exit(r0)     // Catch:{ all -> 0x0074 }
            goto L_0x0077
        L_0x0074:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0074 }
            throw r7     // Catch:{ Exception -> 0x009e }
        L_0x0077:
            com.tencent.mm.plugin.webview.ui.tools.fts.b0 r7 = com.tencent.p014mm.plugin.webview.p128ui.tools.fts.C43960b0.f119089e     // Catch:{ Exception -> 0x009e }
            r7.getClass()     // Catch:{ Exception -> 0x009e }
            java.lang.String r0 = "WebSearchShakeCheckingManager"
            java.lang.String r1 = "stopCheck"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ Exception -> 0x009e }
            ud3.d r0 = r7.f119090a     // Catch:{ Exception -> 0x009e }
            if (r0 == 0) goto L_0x008c
            r0.mo141498b()     // Catch:{ Exception -> 0x009e }
            r7.f119090a = r3     // Catch:{ Exception -> 0x009e }
        L_0x008c:
            r7.f119093d = r2     // Catch:{ Exception -> 0x009e }
            r7.f119092c = r2     // Catch:{ Exception -> 0x009e }
        L_0x0090:
            org.json.JSONObject r7 = r6.mo74341e()     // Catch:{ Exception -> 0x009e }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x009e }
            java.lang.String r0 = "returnSuccess().toString()"
            gy3.C87412m.m108593f(r7, r0)     // Catch:{ Exception -> 0x009e }
            return r7
        L_0x009e:
            org.json.JSONObject r7 = r6.mo74340d()
            java.lang.String r7 = r7.toString()
            java.lang.String r0 = "returnFail().toString()"
            gy3.C87412m.m108593f(r7, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: u93.C52480c.deviceMotionMonitor(java.lang.String):java.lang.String");
    }

    @JavascriptInterface
    public String getCurrentLocation(String str) {
        Log.m105924i("MicroMsg.WebSearch.WebSearchJSApi", "getCurrentLocation = " + str);
        C52489h hVar = new C52489h(this);
        if (MMApplicationContext.isMMProcess()) {
            f146628d.mo73431b(str, hVar);
        } else {
            XIPCInvoker.m98748a(MMApplicationContext.getPackageName(), new IPCString(str), C52481a.class, new C52488g(hVar));
        }
        return mo74341e().toString();
    }

    @JavascriptInterface
    public String openTransparentWeApp(String str) {
        Class cls = C76630x0.class;
        Log.m105924i("MicroMsg.WebSearch.WebSearchJSApi", "openTransparentWeApp: " + str);
        JSONObject jSONObject = new JSONObject(str);
        C86299o oVar = new C86299o();
        oVar.f250929a = jSONObject.optString("userName");
        oVar.f250934f = jSONObject.optString("relativeURL");
        oVar.f250939k = jSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1000);
        oVar.f250931c = C82793b.m101536a(jSONObject.optString("envVersion"), C82793b.RELEASE).f242156d;
        if (!((C76630x0) C86312j.m106911c(cls)).fn0()) {
            oVar.f250913B = C90973a0.TRANSPARENT;
            C91003z zVar = C91003z.DISABLED;
            oVar.f250923L = zVar;
            oVar.f250924M = zVar;
        }
        ((C76630x0) C86312j.m106911c(cls)).mo106898tv(MMApplicationContext.getContext(), oVar);
        String jSONObject2 = mo74341e().toString();
        C87412m.m108593f(jSONObject2, "returnSuccess().toString()");
        return jSONObject2;
    }

    @JavascriptInterface
    public final void setPreGetParams(String str) {
        ((C119157j) C119157j.f356862d).mo183876g(new C52491i(str), "MicroMsg.WebSearch.WebSearchJSApi");
    }
}
