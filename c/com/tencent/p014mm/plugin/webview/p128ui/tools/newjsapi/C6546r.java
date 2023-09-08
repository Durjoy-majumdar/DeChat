package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.stub.C43791l;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import java.util.List;
import p166hy.C60229z;
import p166hy.C8831u0;
import p166hy.C8832y;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import sx3.C64197v;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.r */
public final class C6546r extends C15053a {

    /* renamed from: d */
    public static final C6546r f23726d = new C6546r();

    /* renamed from: e */
    public static final int f23727e = 375;

    /* renamed from: f */
    public static final String f23728f = "getAdIdInfo";

    /* renamed from: g */
    public static final C13601g f23729g = C36568h.m40985a(C6548b.f23732d);

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.r$a */
    public static final class C6547a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C13855j f23730d;

        /* renamed from: e */
        public final /* synthetic */ C13851h1 f23731e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6547a(C13855j jVar, C13851h1 h1Var) {
            super(0);
            this.f23730d = jVar;
            this.f23731e = h1Var;
        }

        public Object invoke() {
            C43791l lVar;
            Class cls = C60229z.class;
            HashMap hashMap = new HashMap();
            String d002 = ((C60229z) C86312j.m106911c(cls)).d00();
            C87412m.m108593f(d002, "getService(IAdDeviceInfo…::class.java).getImeiWx()");
            hashMap.put("imei", d002);
            if (((C8832y) C86312j.m106911c(C8832y.class)).mo9676ut()) {
                String r4 = ((C60229z) C86312j.m106911c(cls)).mo85224r4();
                if (Util.isNullOrNil(r4) && (lVar = this.f23730d.f39000c) != null) {
                    try {
                        r4 = lVar.mo68114V5(112, new Bundle()).getString("oaid", "");
                    } catch (Exception e) {
                        Log.m105920e("MicroMsg.JsApiGetAdIdInfo", "getOaid ex " + e.getMessage());
                    }
                }
                C87412m.m108593f(r4, "oaid");
                hashMap.put("oaid", r4);
                Log.m105918d("MicroMsg.JsApiGetAdIdInfo", "getAdIdInfo oaid=" + r4);
            }
            if (this.f23731e.f38983a.containsKey("waidPkg")) {
                Object obj = this.f23731e.f38983a.get("waidPkg");
                C87412m.m108592e(obj, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj;
                Log.m105924i("MicroMsg.JsApiGetAdIdInfo", "waidPkg=" + str);
                String ba = ((C8831u0) C86312j.m106911c(C8831u0.class)).mo9674ba(str);
                C87412m.m108593f(ba, "getService(IWaidHelperSe…java).getAppWaid(waidPkg)");
                hashMap.put("waid", ba);
            } else {
                Log.m105928w("MicroMsg.JsApiGetAdIdInfo", "no waidPkg param");
            }
            String Uc0 = ((C60229z) C86312j.m106911c(cls)).Uc0();
            C87412m.m108593f(Uc0, "getService(IAdDeviceInfo…etAllDeviceInfoForJsapi()");
            hashMap.put("devIdInfo", Uc0);
            C13849g gVar = this.f23730d.f39001d;
            String str2 = this.f23731e.f38990c;
            gVar.mo10774a(str2, this.f23731e.f38996i + ":ok", hashMap);
            C115669n.INSTANCE.mo175911u(1896, 21);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.r$b */
    public static final class C6548b extends C87413o implements C32224a<List<? extends String>> {

        /* renamed from: d */
        public static final C6548b f23732d = new C6548b();

        public C6548b() {
            super(0);
        }

        public Object invoke() {
            String[] strArr = new String[7];
            strArr[0] = WeChatHosts.domainString(C0966R.string.f360885fm3);
            strArr[1] = WeChatHosts.domainString(C0966R.string.fm9);
            strArr[2] = WeChatHosts.domainString(C0966R.string.fm8);
            strArr[3] = "pa.ugdtimg.com";
            strArr[4] = (BuildInfo.IS_FLAVOR_RED || WeChatEnvironment.hasDebugger()) ? "test-xj.gdt.qq.com" : "";
            strArr[5] = "h5.gdt.qq.com";
            strArr[6] = "xj.gdt.qq.com";
            return C64197v.m75537f(strArr);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004b, code lost:
        if (((java.util.List) ((rx3.C36570n) f23729g).getValue()).contains(r5) != false) goto L_0x004d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0089 A[Catch:{ Exception -> 0x00c1 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo7286a(t83.C13855j r10, t83.C13851h1 r11) {
        /*
            r9 = this;
            java.lang.String r0 = "MicroMsg.JsApiGetAdIdInfo"
            java.lang.String r1 = "env"
            gy3.C87412m.m108594g(r10, r1)
            java.lang.String r1 = "msg"
            gy3.C87412m.m108594g(r11, r1)
            android.os.Bundle r1 = r11.f38992e
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x001e
            java.lang.String r4 = "name"
            java.lang.String r1 = r1.getString(r4)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x00b8
        L_0x001e:
            r1 = 0
            java.util.Map<java.lang.String, java.lang.Object> r4 = r11.f38983a     // Catch:{ Exception -> 0x00c1 }
            java.lang.String r5 = "url"
            java.lang.Object r4 = r4.get(r5)     // Catch:{ Exception -> 0x00c1 }
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.String"
            gy3.C87412m.m108592e(r4, r5)     // Catch:{ Exception -> 0x00c1 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00c1 }
            android.net.Uri r5 = android.net.Uri.parse(r4)     // Catch:{ Exception -> 0x00c1 }
            java.lang.String r5 = r5.getHost()     // Catch:{ Exception -> 0x00c1 }
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)     // Catch:{ Exception -> 0x00c1 }
            if (r6 != 0) goto L_0x004f
            rx3.g r4 = f23729g     // Catch:{ Exception -> 0x00c1 }
            rx3.n r4 = (rx3.C36570n) r4     // Catch:{ Exception -> 0x00c1 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ Exception -> 0x00c1 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ Exception -> 0x00c1 }
            boolean r4 = r4.contains(r5)     // Catch:{ Exception -> 0x00c1 }
            if (r4 == 0) goto L_0x0086
        L_0x004d:
            r4 = 1
            goto L_0x0087
        L_0x004f:
            com.tencent.mm.vfs.m1 r6 = new com.tencent.mm.vfs.m1     // Catch:{ Exception -> 0x00c1 }
            java.lang.String r7 = a70.C112760b.m154231g()     // Catch:{ Exception -> 0x00c1 }
            java.lang.String r8 = "websearch/template"
            r6.<init>((java.lang.String) r7, (java.lang.String) r8)     // Catch:{ Exception -> 0x00c1 }
            java.lang.String r6 = r6.mo119971i()     // Catch:{ Exception -> 0x00c1 }
            java.lang.String r7 = "VFSFile(CConstants.DATAR…E_DATA_PATH).absolutePath"
            gy3.C87412m.m108593f(r6, r7)     // Catch:{ Exception -> 0x00c1 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c1 }
            r7.<init>()     // Catch:{ Exception -> 0x00c1 }
            java.lang.String r8 = "file://"
            r7.append(r8)     // Catch:{ Exception -> 0x00c1 }
            r7.append(r6)     // Catch:{ Exception -> 0x00c1 }
            java.lang.String r6 = r7.toString()     // Catch:{ Exception -> 0x00c1 }
            boolean r4 = z04.C112551y.m153819s(r4, r6, r1)     // Catch:{ Exception -> 0x00c1 }
            if (r4 != r3) goto L_0x007d
            r4 = 1
            goto L_0x007e
        L_0x007d:
            r4 = 0
        L_0x007e:
            if (r4 == 0) goto L_0x0086
            java.lang.String r4 = "getAdIdInfo, isWebSearchUrl=true"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)     // Catch:{ Exception -> 0x00c1 }
            goto L_0x004d
        L_0x0086:
            r4 = 0
        L_0x0087:
            if (r4 != 0) goto L_0x00b8
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c1 }
            r3.<init>()     // Catch:{ Exception -> 0x00c1 }
            java.lang.String r4 = "getAdIdInfo but not valid host "
            r3.append(r4)     // Catch:{ Exception -> 0x00c1 }
            r3.append(r5)     // Catch:{ Exception -> 0x00c1 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00c1 }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r3)     // Catch:{ Exception -> 0x00c1 }
            t83.g r3 = r10.f39001d     // Catch:{ Exception -> 0x00c1 }
            java.lang.String r4 = r11.f38990c     // Catch:{ Exception -> 0x00c1 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c1 }
            r5.<init>()     // Catch:{ Exception -> 0x00c1 }
            java.lang.String r6 = r11.f38996i     // Catch:{ Exception -> 0x00c1 }
            r5.append(r6)     // Catch:{ Exception -> 0x00c1 }
            java.lang.String r6 = ":fail invalid host"
            r5.append(r6)     // Catch:{ Exception -> 0x00c1 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x00c1 }
            r3.mo10774a(r4, r5, r2)     // Catch:{ Exception -> 0x00c1 }
            return r1
        L_0x00b8:
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.r$a r0 = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.r$a
            r0.<init>(r10, r11)
            o40.C61926c.m72656A(r2, r0)
            return r3
        L_0x00c1:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "getAdIdInfo ex "
            r4.append(r5)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r3)
            t83.g r10 = r10.f39001d
            java.lang.String r0 = r11.f38990c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r11 = r11.f38996i
            r3.append(r11)
            java.lang.String r11 = ":fail"
            r3.append(r11)
            java.lang.String r11 = r3.toString()
            r10.mo10774a(r0, r11, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.C6546r.mo7286a(t83.j, t83.h1):boolean");
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23727e;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23728f;
    }
}
