package e93;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.webview.stub.C43791l;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import t83.C13849g;
import t83.C13851h1;
import t83.C13853i;
import t83.C13854i1;
import t83.C13855j;
import t83.C13862n1;
import zt3.C119157j;

/* renamed from: e93.e */
public final class C45570e implements C13849g {

    /* renamed from: a */
    public final C13853i f123269a;

    /* renamed from: b */
    public JsapiPermissionWrapper f123270b;

    /* renamed from: c */
    public final MMWebView f123271c;

    /* renamed from: d */
    public MMHandler f123272d = new C45575g(this, Looper.getMainLooper());

    /* renamed from: e */
    public boolean f123273e;

    /* renamed from: f */
    public final List<String> f123274f = new ArrayList();

    /* renamed from: g */
    public final LinkedList<C13851h1> f123275g = new LinkedList<>();

    /* renamed from: h */
    public boolean f123276h;

    /* renamed from: i */
    public boolean f123277i;

    /* renamed from: j */
    public boolean f123278j;

    /* renamed from: k */
    public String f123279k = "";

    /* renamed from: l */
    public boolean f123280l;

    /* renamed from: e93.e$a */
    public static final class C45571a {
        public C45571a(C8480h hVar) {
        }
    }

    /* renamed from: e93.e$b */
    public static final class C45572b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C45570e f123281d;

        /* renamed from: e */
        public final /* synthetic */ String f123282e;

        /* renamed from: e93.e$b$a */
        public static final class C45573a implements ValueCallback<String> {
            public void onReceiveValue(Object obj) {
                Log.m105925i("MicroMsg.WebPrefetcherJsApiHandler", "doCallback onReceiveValue %s", (String) obj);
            }
        }

        public C45572b(C45570e eVar, String str) {
            this.f123281d = eVar;
            this.f123282e = str;
        }

        public final void run() {
            try {
                MMWebView mMWebView = this.f123281d.f123271c;
                mMWebView.evaluateJavascript("javascript:WeixinPrefecherJSBridge._handleMessageFromWeixin(" + this.f123282e + ')', new C45573a());
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.WebPrefetcherJsApiHandler", e, "doCallback exception", new Object[0]);
            }
        }
    }

    static {
        new C45571a((C8480h) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x007c, code lost:
        if (r5.intValue() == 1) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00b0, code lost:
        if (r5.intValue() != 1) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0039, code lost:
        if (r5.intValue() == 1) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x006d, code lost:
        if (r5.intValue() != 1) goto L_0x0071;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d0 A[SYNTHETIC, Splitter:B:29:0x00d0] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C45570e(t83.C13853i r5, com.tencent.p014mm.protocal.JsapiPermissionWrapper r6, com.tencent.p014mm.p136ui.widget.MMWebView r7) {
        /*
            r4 = this;
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            java.lang.String r1 = "jsApiPool"
            gy3.C87412m.m108594g(r5, r1)
            r4.<init>()
            r4.f123269a = r5
            r4.f123270b = r6
            r4.f123271c = r7
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4.f123274f = r5
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            r4.f123275g = r5
            java.lang.String r5 = ""
            r4.f123279k = r5
            android.os.Looper r5 = android.os.Looper.getMainLooper()
            e93.g r6 = new e93.g
            r6.<init>(r4, r5)
            r4.f123272d = r6
            java.lang.Integer r5 = e93.C45569d.f123267a
            r6 = 0
            r7 = 1
            java.lang.String r1 = "MicroMsg.WebPrefetcherJsApiConfigManager "
            if (r5 == 0) goto L_0x003c
            int r5 = r5.intValue()
            if (r5 != r7) goto L_0x0071
            goto L_0x006f
        L_0x003c:
            di3.d r5 = di3.C86312j.m106911c(r0)
            h81.h r5 = (h81.C32735h) r5
            h81.h$c r2 = h81.C32735h.C32737c.clicfg_webview_prefetcher_enable_digest_verify
            int r5 = r5.mo58779Qe(r2, r7)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            e93.C45569d.f123267a = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r2 = "enableDigestVerify "
            r5.append(r2)
            java.lang.Integer r2 = e93.C45569d.f123267a
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r5)
            java.lang.Integer r5 = e93.C45569d.f123267a
            if (r5 != 0) goto L_0x0069
            goto L_0x0071
        L_0x0069:
            int r5 = r5.intValue()
            if (r5 != r7) goto L_0x0071
        L_0x006f:
            r5 = 1
            goto L_0x0072
        L_0x0071:
            r5 = 0
        L_0x0072:
            r4.f123276h = r5
            java.lang.Integer r5 = e93.C45569d.f123268b
            if (r5 == 0) goto L_0x007f
            int r5 = r5.intValue()
            if (r5 != r7) goto L_0x00b4
            goto L_0x00b2
        L_0x007f:
            di3.d r5 = di3.C86312j.m106911c(r0)
            h81.h r5 = (h81.C32735h) r5
            h81.h$c r0 = h81.C32735h.C32737c.clicfg_webview_prefetcher_update_random_str
            int r5 = r5.mo58779Qe(r0, r7)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            e93.C45569d.f123268b = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "canUpdateRandomStr "
            r5.append(r0)
            java.lang.Integer r0 = e93.C45569d.f123268b
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r5)
            java.lang.Integer r5 = e93.C45569d.f123268b
            if (r5 != 0) goto L_0x00ac
            goto L_0x00b4
        L_0x00ac:
            int r5 = r5.intValue()
            if (r5 != r7) goto L_0x00b4
        L_0x00b2:
            r5 = 1
            goto L_0x00b5
        L_0x00b4:
            r5 = 0
        L_0x00b5:
            r4.f123277i = r5
            java.lang.String r5 = sf0.C90188n0.f258945m
            if (r5 == 0) goto L_0x00c4
            int r5 = r5.length()
            if (r5 != 0) goto L_0x00c2
            goto L_0x00c4
        L_0x00c2:
            r5 = 0
            goto L_0x00c5
        L_0x00c4:
            r5 = 1
        L_0x00c5:
            r0 = 0
            java.lang.String r1 = "MicroMsg.WebPrefetcherJsApiHandler"
            if (r5 == 0) goto L_0x00d0
            java.lang.String r5 = "getHardCodeJsPermission, Test.jsapiPermission is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r5)
            goto L_0x00fa
        L_0x00d0:
            java.lang.String r5 = sf0.C90188n0.f258945m     // Catch:{ Exception -> 0x00f2 }
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r6)     // Catch:{ Exception -> 0x00f2 }
            if (r5 >= 0) goto L_0x00de
            java.lang.String r5 = "getHardCodeJsPermission, Test.jsapiPermission wrong"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r5)     // Catch:{ Exception -> 0x00f2 }
            goto L_0x00fa
        L_0x00de:
            java.lang.String r2 = "getHardCodeJsPermission %d"
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x00f2 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x00f2 }
            r7[r6] = r3     // Catch:{ Exception -> 0x00f2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r7)     // Catch:{ Exception -> 0x00f2 }
            com.tencent.mm.protocal.JsapiPermissionWrapper r7 = new com.tencent.mm.protocal.JsapiPermissionWrapper     // Catch:{ Exception -> 0x00f2 }
            r7.<init>((int) r5)     // Catch:{ Exception -> 0x00f2 }
            r0 = r7
            goto L_0x00fa
        L_0x00f2:
            r5 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r7 = "getHardCodeJsPermission exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r5, r7, r6)
        L_0x00fa:
            if (r0 == 0) goto L_0x0103
            java.lang.String r5 = "init hardcodeJsPermission valid and use"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r5)
            r4.f123270b = r0
        L_0x0103:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e93.C45570e.<init>(t83.i, com.tencent.mm.protocal.JsapiPermissionWrapper, com.tencent.mm.ui.widget.MMWebView):void");
    }

    /* renamed from: b */
    public static final void m50617b(C45570e eVar) {
        boolean z;
        Context context;
        if (((ArrayList) eVar.f123274f).isEmpty()) {
            Log.m105924i("MicroMsg.WebPrefetcherJsApiHandler", "dealMsgQueue fail, resultValueList is empty");
            return;
        }
        Log.m105924i("MicroMsg.WebPrefetcherJsApiHandler", "dealMsgQueue, pre msgList = " + eVar.f123275g.size());
        try {
            List<C13851h1> b = C13854i1.m13149b((String) ((ArrayList) eVar.f123274f).remove(0), eVar.f123278j, eVar.f123279k);
            if (!Util.isNullOrNil((List) b)) {
                eVar.f123275g.addAll(b);
                Log.m105925i("MicroMsg.WebPrefetcherJsApiHandler", "dealMsgQueue now msg list size : %d", Integer.valueOf(eVar.f123275g.size()));
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WebPrefetcherJsApiHandler", e, "dealMsgQueue exception", new Object[0]);
        }
        Log.m105924i("MicroMsg.WebPrefetcherJsApiHandler", "dealMsgQueue, post msgList = " + eVar.f123275g.size());
        do {
            if (eVar.f123275g.isEmpty()) {
                Log.m105924i("MicroMsg.WebPrefetcherJsApiHandler", "dealNextMsg stop, msgList is empty");
            } else {
                Log.m105925i("MicroMsg.WebPrefetcherJsApiHandler", "dealNextMsg size: %s", Integer.valueOf(eVar.f123275g.size()));
                C13851h1 remove = eVar.f123275g.remove(0);
                if (remove != null) {
                    MMWebView mMWebView = eVar.f123271c;
                    if (mMWebView == null || (context = mMWebView.getContext()) == null) {
                        context = MMApplicationContext.getContext();
                    }
                    Context context2 = context;
                    C87412m.m108593f(context2, "wv?.context ?: MMApplicationContext.getContext()");
                    JsapiPermissionWrapper jsapiPermissionWrapper = eVar.f123270b;
                    if (jsapiPermissionWrapper == null) {
                        jsapiPermissionWrapper = remove.f38993f;
                    }
                    C13855j jVar = new C13855j(context2, jsapiPermissionWrapper, (C43791l) null, eVar, eVar.f123271c);
                    C13862n1 n1Var = C13862n1.f39019a;
                    C13853i iVar = eVar.f123269a;
                    C87412m.m108594g(iVar, "jsApiPool");
                    if (iVar.mo8736b(jVar, remove) && iVar.mo8735a(jVar, remove)) {
                        z = true;
                        continue;
                    }
                }
            }
            z = false;
            continue;
        } while (z);
        MMHandler mMHandler = eVar.f123272d;
        if (mMHandler != null) {
            mMHandler.post(new C45574f(eVar));
        }
    }

    public void _getAllHosts(String str) {
    }

    @JavascriptInterface
    public final String _getDgtVerifyRandomStr() {
        Log.m105925i("MicroMsg.WebPrefetcherJsApiHandler", "_getDgtVerifyRandomStr canUpdateRandomStr: %s, canGet: %s, randomStr: %s", Boolean.valueOf(this.f123277i), Boolean.valueOf(this.f123280l), this.f123279k);
        if (this.f123277i && !this.f123280l) {
            return "";
        }
        this.f123280l = false;
        return this.f123279k;
    }

    public void _getHtmlContent(String str) {
    }

    @JavascriptInterface
    public final boolean _isDgtVerifyEnabled() {
        return this.f123278j;
    }

    public void _ready(boolean z) {
    }

    @JavascriptInterface
    public void _sendMessage(String str) {
        Log.m105919d("MicroMsg.WebPrefetcherJsApiHandler", "_sendMessage msgContent: %s", str);
        if (this.f123272d != null) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = str;
            MMHandler mMHandler = this.f123272d;
            if (mMHandler != null) {
                mMHandler.sendMessage(obtain);
                return;
            }
            return;
        }
        Log.m105920e("MicroMsg.WebPrefetcherJsApiHandler", "_sendMessage msgQueueHandler err");
    }

    /* renamed from: a */
    public void mo10774a(String str, String str2, Map<String, Object> map) {
        boolean z = false;
        if (!(str == null || str.length() == 0)) {
            if (!(str == null || str.length() == 0)) {
                HashMap hashMap = new HashMap();
                hashMap.put("errMsg", str2 == null ? "" : str2);
                if (map == null || map.isEmpty()) {
                    z = true;
                }
                if (!z) {
                    Log.m105924i("MicroMsg.WebPrefetcherJsApiHandler", "doCallback, retValue size: " + map.size() + ' ');
                    hashMap.putAll(map);
                }
                String a = C13851h1.C13852a.m13141a(str, hashMap, this.f123278j, this.f123279k);
                Log.m105924i("MicroMsg.WebPrefetcherJsApiHandler", "doCallback, ret = " + str2 + ", cb = " + a);
                if (a != null && this.f123271c != null) {
                    C45572b bVar = new C45572b(this, a);
                    if (MMHandlerThread.isMainThread()) {
                        bVar.run();
                        return;
                    } else {
                        ((C119157j) C119157j.f356862d).mo183895z(bVar);
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        Log.m105920e("MicroMsg.WebPrefetcherJsApiHandler", "doCallback, invalid args, ret = " + str2);
    }

    /* renamed from: c */
    public C13853i mo13177c() {
        return this.f123269a;
    }

    public int getBinderID() {
        return 0;
    }
}
