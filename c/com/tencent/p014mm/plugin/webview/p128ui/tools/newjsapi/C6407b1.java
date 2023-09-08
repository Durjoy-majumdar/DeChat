package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1255d;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import kj2.C117407d;
import kotlin.Metadata;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;
import xk0.C91264c;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.b1 */
public final class C6407b1 extends C15053a {

    /* renamed from: d */
    public static final C6407b1 f23387d = new C6407b1();

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.b1$b */
    public static final class C6408b<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ WeakReference<C13849g> f23388d;

        /* renamed from: e */
        public final /* synthetic */ int f23389e;

        /* renamed from: f */
        public final /* synthetic */ String f23390f;

        public C6408b(WeakReference<C13849g> weakReference, int i, String str) {
            this.f23388d = weakReference;
            this.f23389e = i;
            this.f23390f = str;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            Bundle bundle = (Bundle) obj;
            C13849g gVar = this.f23388d.get();
            boolean z = bundle.getBoolean("ret");
            boolean z2 = false;
            Log.m105925i("MicroMsg.JsApiOnWebPageUrlExposed", "WebPrefetchAsyncTask callback jsapi: %s, ret: %s", gVar, Boolean.valueOf(z));
            if (gVar != null) {
                int i = this.f23389e;
                String str = this.f23390f;
                if (i == 0) {
                    C117407d.INSTANCE.mo182089r(1454, 192, 1);
                }
                if (z) {
                    HashMap hashMap = new HashMap();
                    String string = bundle.getString("url_result");
                    if (string == null || string.length() == 0) {
                        z2 = true;
                    }
                    if (!z2) {
                        hashMap.put("result_list", string);
                    }
                    C6407b1.f23387d.getClass();
                    gVar.mo10774a(str, "onWebPageUrlExposed:ok", hashMap);
                    return;
                }
                C6407b1.f23387d.getClass();
                gVar.mo10774a(str, "onWebPageUrlExposed:fail", (Map<String, Object>) null);
            }
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/b1$a;", "Lcom/tencent/mm/ipcinvoker/d;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.b1$a */
    public static final class C6409a implements C1255d<Bundle, Bundle> {
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00e2  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00f1  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void invoke(java.lang.Object r17, com.tencent.p014mm.ipcinvoker.C1256g r18) {
            /*
                r16 = this;
                r0 = r18
                r1 = r17
                android.os.Bundle r1 = (android.os.Bundle) r1
                java.lang.Class<ex0.h> r2 = ex0.C45700h.class
                java.lang.String r3 = "MicroMsg.JsApiOnWebPageUrlExposed"
                android.os.Bundle r4 = new android.os.Bundle
                r4.<init>()
                java.lang.String r5 = "ret"
                r6 = 0
                if (r1 != 0) goto L_0x001e
                r4.putBoolean(r5, r6)
                if (r0 == 0) goto L_0x0140
                r0.mo894a(r4)
                goto L_0x0140
            L_0x001e:
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.lang.String r9 = "urlList"
                java.lang.String r9 = r1.getString(r9)     // Catch:{ Exception -> 0x00d6 }
                java.lang.String r10 = "bizType"
                int r1 = r1.getInt(r10, r6)     // Catch:{ Exception -> 0x00d6 }
                org.json.JSONArray r10 = new org.json.JSONArray     // Catch:{ Exception -> 0x00d7 }
                r10.<init>(r9)     // Catch:{ Exception -> 0x00d7 }
                int r9 = r10.length()     // Catch:{ Exception -> 0x00d7 }
                if (r9 > 0) goto L_0x004a
                java.lang.String r9 = "decode urlList is empty"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r9)     // Catch:{ Exception -> 0x00d7 }
                r4.putBoolean(r5, r6)     // Catch:{ Exception -> 0x00d7 }
                if (r0 == 0) goto L_0x0140
                r0.mo894a(r4)     // Catch:{ Exception -> 0x00d7 }
                goto L_0x0140
            L_0x004a:
                int r9 = r10.length()     // Catch:{ Exception -> 0x00d7 }
                r11 = 0
            L_0x004f:
                if (r11 >= r9) goto L_0x00dc
                org.json.JSONObject r12 = r10.optJSONObject(r11)     // Catch:{ Exception -> 0x00d7 }
                if (r12 != 0) goto L_0x0059
                goto L_0x00d1
            L_0x0059:
                java.lang.String r13 = "url"
                java.lang.String r13 = r12.optString(r13)     // Catch:{ Exception -> 0x00d7 }
                java.lang.String r14 = "bizScene"
                int r14 = r12.optInt(r14)     // Catch:{ Exception -> 0x00d7 }
                java.lang.String r15 = "queryList"
                org.json.JSONArray r15 = r12.optJSONArray(r15)     // Catch:{ Exception -> 0x00d7 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d7 }
                r6.<init>()     // Catch:{ Exception -> 0x00d7 }
                java.lang.String r8 = "WebPrefetchTask  querKeyList: "
                r6.append(r8)     // Catch:{ Exception -> 0x00d7 }
                r6.append(r15)     // Catch:{ Exception -> 0x00d7 }
                java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x00d7 }
                com.tencent.p014mm.sdk.platformtools.Log.m105926v(r3, r6)     // Catch:{ Exception -> 0x00d7 }
                if (r13 == 0) goto L_0x008b
                boolean r6 = z04.C112551y.m153811k(r13)     // Catch:{ Exception -> 0x00d7 }
                r8 = 1
                if (r6 != r8) goto L_0x008b
                r8 = 1
                goto L_0x008c
            L_0x008b:
                r8 = 0
            L_0x008c:
                if (r8 == 0) goto L_0x0094
                java.lang.String r6 = "decode url is empty"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r6)     // Catch:{ Exception -> 0x00d7 }
                goto L_0x00d1
            L_0x0094:
                java.lang.String r6 = "extInfo"
                java.lang.String r6 = r12.optString(r6)     // Catch:{ Exception -> 0x00d7 }
                ex0.h$b r8 = new ex0.h$b     // Catch:{ Exception -> 0x00d7 }
                r8.<init>()     // Catch:{ Exception -> 0x00d7 }
                r8.f123504a = r13     // Catch:{ Exception -> 0x00d7 }
                r8.f123512i = r6     // Catch:{ Exception -> 0x00d7 }
                r6 = 176(0xb0, float:2.47E-43)
                r8.f123506c = r6     // Catch:{ Exception -> 0x00d7 }
                r8.f123513j = r14     // Catch:{ Exception -> 0x00d7 }
                java.lang.String r6 = "prefetchId"
                java.lang.String r13 = ""
                java.lang.String r6 = r12.optString(r6, r13)     // Catch:{ Exception -> 0x00d7 }
                r8.f123505b = r6     // Catch:{ Exception -> 0x00d7 }
                if (r15 == 0) goto L_0x00cb
                int r6 = r15.length()     // Catch:{ Exception -> 0x00d7 }
                if (r6 <= 0) goto L_0x00cb
                java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x00d7 }
                r6.<init>()     // Catch:{ Exception -> 0x00d7 }
                r8.f123514k = r6     // Catch:{ Exception -> 0x00d7 }
                com.tencent.mm.plugin.webview.ui.tools.newjsapi.z0 r6 = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.z0     // Catch:{ Exception -> 0x00d7 }
                r6.<init>(r8)     // Catch:{ Exception -> 0x00d7 }
                com.tencent.p014mm.sdk.json.JSONUtils.forEach(r15, r6)     // Catch:{ Exception -> 0x00d7 }
                goto L_0x00ce
            L_0x00cb:
                r6 = 0
                r8.f123514k = r6     // Catch:{ Exception -> 0x00d7 }
            L_0x00ce:
                r7.add(r8)     // Catch:{ Exception -> 0x00d7 }
            L_0x00d1:
                int r11 = r11 + 1
                r6 = 0
                goto L_0x004f
            L_0x00d6:
                r1 = 0
            L_0x00d7:
                java.lang.String r6 = "decode error"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r6)
            L_0x00dc:
                boolean r6 = r7.isEmpty()
                if (r6 == 0) goto L_0x00f1
                java.lang.String r1 = "decode list is empty"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
                r1 = 0
                r4.putBoolean(r5, r1)
                if (r0 == 0) goto L_0x0140
                r0.mo894a(r4)
                goto L_0x0140
            L_0x00f1:
                r6 = 1
                r4.putBoolean(r5, r6)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r8 = "WebPrefetchTask  bizType:"
                r5.append(r8)
                r5.append(r1)
                java.lang.String r5 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
                if (r1 != r6) goto L_0x011a
                k40.a r1 = f40.C86709a0.m107533q(r2)
                ex0.h r1 = (ex0.C45700h) r1
                r1.mo71034Ym(r7)
                if (r0 == 0) goto L_0x0140
                r0.mo894a(r4)
                goto L_0x0140
            L_0x011a:
                long r5 = java.lang.System.currentTimeMillis()
                k40.a r1 = f40.C86709a0.m107533q(r2)
                ex0.h r1 = (ex0.C45700h) r1
                com.tencent.mm.plugin.webview.ui.tools.newjsapi.a1 r3 = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.a1
                r3.<init>(r5, r4, r0)
                r1.mo71033Y4(r5, r3)
                k40.a r0 = f40.C86709a0.m107533q(r2)
                ex0.h r0 = (ex0.C45700h) r0
                r0.mo71040k1(r5, r7)
                r11 = 190(0xbe, double:9.4E-322)
                kj2.d r8 = kj2.C117407d.INSTANCE
                r9 = 1454(0x5ae, double:7.184E-321)
                r13 = 1
                r8.mo182089r(r9, r11, r13)
            L_0x0140:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.C6407b1.C6409a.invoke(java.lang.Object, com.tencent.mm.ipcinvoker.g):void");
        }
    }

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        String str = (String) h1Var.f38983a.get("urlList");
        if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.JsApiOnWebPageUrlExposed", "urlList is empty");
            C13849g gVar = jVar.f39001d;
            String str2 = h1Var.f38990c;
            gVar.mo10774a(str2, h1Var.f38996i + ":fail", (Map<String, Object>) null);
            return true;
        }
        Object obj = h1Var.f38983a.get("bizType");
        if (obj == null) {
            obj = "";
        }
        Bundle bundle = new Bundle();
        bundle.putString("urlList", str);
        boolean b = C87412m.m108589b(obj, "1");
        bundle.putInt("bizType", b ? 1 : 0);
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, bundle, C6409a.class, new C6408b(new WeakReference(jVar.f39001d), b, h1Var.f38990c));
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return C91264c.CTRL_INDEX;
    }

    /* renamed from: c */
    public String mo7288c() {
        return "onWebPageUrlExposed";
    }
}
