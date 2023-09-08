package com.tencent.p014mm.advertise.impl.jsapi;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import di3.C86312j;
import e42.C7594e;
import e42.C7596h;
import e42.C86430i;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p166hy.C60229z;
import p166hy.C8831u0;
import p166hy.C8832y;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import sx3.C64197v;

/* renamed from: com.tencent.mm.advertise.impl.jsapi.b */
public final class C0983b<T extends C7594e> extends C86430i<T> {

    /* renamed from: d */
    public final C13601g f9004d = C36568h.m40985a(C0984a.f9005d);

    /* renamed from: com.tencent.mm.advertise.impl.jsapi.b$a */
    public static final class C0984a extends C87413o implements C32224a<List<? extends String>> {

        /* renamed from: d */
        public static final C0984a f9005d = new C0984a();

        public C0984a() {
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

    /* renamed from: com.tencent.mm.advertise.impl.jsapi.b$b */
    public static final class C0985b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C7596h f9006d;

        /* renamed from: e */
        public final /* synthetic */ C0983b<T> f9007e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0985b(C7596h hVar, C0983b<T> bVar) {
            super(0);
            this.f9006d = hVar;
            this.f9007e = bVar;
        }

        public Object invoke() {
            Class cls = C60229z.class;
            HashMap hashMap = new HashMap();
            String d002 = ((C60229z) C86312j.m106911c(cls)).d00();
            C87412m.m108593f(d002, "getService(IAdDeviceInfo…rvice::class.java).imeiWx");
            hashMap.put("imei", d002);
            if (((C8832y) C86312j.m106911c(C8832y.class)).mo9676ut()) {
                String r4 = ((C60229z) C86312j.m106911c(cls)).mo85224r4();
                C87412m.m108593f(r4, "oaid");
                hashMap.put("oaid", r4);
                Log.m105918d("MicroMsg.MBJsApiGetAdIdInfo", "getAdIdInfo oaid=" + r4);
            }
            if (this.f9006d.has("waidPkg")) {
                String optString = this.f9006d.optString("waidPkg");
                Log.m105924i("MicroMsg.MBJsApiGetAdIdInfo", "waidPkg=" + optString);
                String ba = ((C8831u0) C86312j.m106911c(C8831u0.class)).mo9674ba(optString);
                C87412m.m108593f(ba, "getService(IWaidHelperSe…java).getAppWaid(waidPkg)");
                hashMap.put("waid", ba);
            } else {
                Log.m105928w("MicroMsg.MBJsApiGetAdIdInfo", "no waidPkg param");
            }
            String Uc0 = ((C60229z) C86312j.m106911c(cls)).Uc0();
            C87412m.m108593f(Uc0, "getService(IAdDeviceInfo…va).allDeviceInfoForJsapi");
            hashMap.put("devIdInfo", Uc0);
            C32226l<C7596h, C13598b0> p = this.f9007e.mo120840p();
            C0983b<T> bVar = this.f9007e;
            C7596h hVar = new C7596h((Map<String, ? extends Object>) hashMap);
            bVar.mo120845j(hVar);
            p.invoke(hVar);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: e */
    public String mo16e() {
        return "getAdIdInfo";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002c, code lost:
        if (((java.util.List) ((rx3.C36570n) r8.f9004d).getValue()).contains(r2) != false) goto L_0x002e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006b A[Catch:{ Exception -> 0x0097 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x008d  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18q(e42.C7596h r9) {
        /*
            r8 = this;
            java.lang.String r0 = "MicroMsg.MBJsApiGetAdIdInfo"
            java.lang.String r1 = "data"
            gy3.C87412m.m108594g(r9, r1)
            java.lang.String r1 = "url"
            java.lang.String r1 = r9.optString(r1)     // Catch:{ Exception -> 0x0097 }
            android.net.Uri r2 = android.net.Uri.parse(r1)     // Catch:{ Exception -> 0x0097 }
            java.lang.String r2 = r2.getHost()     // Catch:{ Exception -> 0x0097 }
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)     // Catch:{ Exception -> 0x0097 }
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x0030
            rx3.g r1 = r8.f9004d     // Catch:{ Exception -> 0x0097 }
            rx3.n r1 = (rx3.C36570n) r1     // Catch:{ Exception -> 0x0097 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ Exception -> 0x0097 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ Exception -> 0x0097 }
            boolean r1 = r1.contains(r2)     // Catch:{ Exception -> 0x0097 }
            if (r1 == 0) goto L_0x0069
        L_0x002e:
            r4 = 1
            goto L_0x0069
        L_0x0030:
            com.tencent.mm.vfs.m1 r3 = new com.tencent.mm.vfs.m1     // Catch:{ Exception -> 0x0097 }
            java.lang.String r6 = a70.C112760b.m154231g()     // Catch:{ Exception -> 0x0097 }
            java.lang.String r7 = "websearch/template"
            r3.<init>((java.lang.String) r6, (java.lang.String) r7)     // Catch:{ Exception -> 0x0097 }
            java.lang.String r3 = r3.mo119971i()     // Catch:{ Exception -> 0x0097 }
            java.lang.String r6 = "VFSFile(CConstants.DATAR…E_DATA_PATH).absolutePath"
            gy3.C87412m.m108593f(r3, r6)     // Catch:{ Exception -> 0x0097 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0097 }
            r6.<init>()     // Catch:{ Exception -> 0x0097 }
            java.lang.String r7 = "file://"
            r6.append(r7)     // Catch:{ Exception -> 0x0097 }
            r6.append(r3)     // Catch:{ Exception -> 0x0097 }
            java.lang.String r3 = r6.toString()     // Catch:{ Exception -> 0x0097 }
            if (r1 == 0) goto L_0x0060
            boolean r1 = z04.C112551y.m153819s(r1, r3, r4)     // Catch:{ Exception -> 0x0097 }
            if (r1 != r5) goto L_0x0060
            r1 = 1
            goto L_0x0061
        L_0x0060:
            r1 = 0
        L_0x0061:
            if (r1 == 0) goto L_0x0069
            java.lang.String r1 = "getAdIdInfo, isWebSearchUrl=true"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ Exception -> 0x0097 }
            goto L_0x002e
        L_0x0069:
            if (r4 != 0) goto L_0x008d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0097 }
            r9.<init>()     // Catch:{ Exception -> 0x0097 }
            java.lang.String r1 = "getAdIdInfo but not valid host "
            r9.append(r1)     // Catch:{ Exception -> 0x0097 }
            r9.append(r2)     // Catch:{ Exception -> 0x0097 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0097 }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r9)     // Catch:{ Exception -> 0x0097 }
            fy3.l r9 = r8.mo120840p()     // Catch:{ Exception -> 0x0097 }
            java.lang.String r1 = "invalid host"
            e42.h r1 = r8.mo120842g(r5, r1)     // Catch:{ Exception -> 0x0097 }
            r9.invoke(r1)     // Catch:{ Exception -> 0x0097 }
            return
        L_0x008d:
            com.tencent.mm.advertise.impl.jsapi.b$b r0 = new com.tencent.mm.advertise.impl.jsapi.b$b
            r0.<init>(r9, r8)
            r9 = 0
            o40.C61926c.m72656A(r9, r0)
            return
        L_0x0097:
            r9 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getAdIdInfo ex "
            r1.append(r2)
            java.lang.String r9 = r9.getMessage()
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r9)
            fy3.l r9 = r8.mo120840p()
            r0 = 2
            java.lang.String r1 = "url parse error"
            e42.h r0 = r8.mo120842g(r0, r1)
            r9.invoke(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.advertise.impl.jsapi.C0983b.mo18q(e42.h):void");
    }
}
