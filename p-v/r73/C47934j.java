package r73;

import a70.C112760b;
import android.content.Context;
import android.os.Build;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import c30.C104289g;
import c30.C26827e;
import com.eclipsesource.mmv8.Platform;
import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import ea3.C45596j;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedList;
import js0.C46574u;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89144l0;
import ob0.l0$$e;
import org.json.JSONObject;
import p156gj.C87203t;
import pe3.C47465a;
import r73.C47930c;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49550gf;
import te3.C49694hf;

/* renamed from: r73.j */
public final class C47934j extends C47928a<C47930c> {

    /* renamed from: d */
    public static final C13601g<C45596j> f128617d = C36568h.m40985a(C36264a.f96576d);

    /* renamed from: e */
    public static final String f128618e = (C112760b.m154195C() + "jsengine/trace/");

    /* renamed from: r73.j$a */
    public static final class C36264a extends C87413o implements C32224a<C45596j> {

        /* renamed from: d */
        public static final C36264a f96576d = new C36264a();

        public C36264a() {
            super(0);
        }

        public Object invoke() {
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            return new C45596j(context);
        }
    }

    /* renamed from: r73.j$b */
    public static final class C36265b {
        public C36265b(C8480h hVar) {
        }
    }

    /* renamed from: r73.j$c */
    public static final class C47935c implements l0$$e {

        /* renamed from: d */
        public final /* synthetic */ C47934j f128619d;

        /* renamed from: e */
        public final /* synthetic */ String f128620e;

        public C47935c(C47934j jVar, String str) {
            this.f128619d = jVar;
            this.f128620e = str;
        }

        /* renamed from: a */
        public final int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            C87412m.m108594g(cVar, "rr");
            C87412m.m108594g(yVar, "<anonymous parameter 4>");
            if (i == 0 && i2 == 0) {
                C47465a aVar = cVar.f127056b.f127083a;
                C49694hf hfVar = aVar instanceof C49694hf ? (C49694hf) aVar : null;
                if (hfVar == null) {
                    return 0;
                }
                String str2 = this.f128619d.f128615c;
                Log.m105924i(str2, "reportCgi resp_json=" + hfVar.f134591f);
                C47930c cVar2 = (C47930c) this.f128619d.f128614b;
                String str3 = this.f128620e;
                String str4 = hfVar.f134591f;
                if (str4 == null) {
                    str4 = "null";
                }
                C47930c.C47931a.m53253a(cVar2, str3, str4, (ValueCallback) null, 4, (Object) null);
                return 0;
            }
            String str5 = this.f128620e;
            C104289g gVar = new C104289g();
            gVar.mo145953n("err_code", i2);
            gVar.put("err_msg", "fail");
            C13598b0 b0Var = C13598b0.f38549a;
            String gVar2 = gVar.toString();
            C87412m.m108593f(gVar2, "JSONObject().apply {\n   …             }.toString()");
            C47930c.C47931a.m53253a((C47930c) this.f128619d.f128614b, str5, gVar2, (ValueCallback) null, 4, (Object) null);
            return 0;
        }
    }

    static {
        new C36265b((C8480h) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47934j(C47930c cVar) {
        super("wxJsEngine", cVar);
        C87412m.m108594g(cVar, "context");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0099 A[SYNTHETIC, Splitter:B:28:0x0099] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0124 A[SYNTHETIC, Splitter:B:38:0x0124] */
    @android.webkit.JavascriptInterface
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dump(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.String r0 = "tag"
            gy3.C87412m.m108594g(r7, r0)
            java.lang.String r0 = "data"
            gy3.C87412m.m108594g(r8, r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
            if (r0 != 0) goto L_0x0018
            java.lang.String r7 = r6.f128615c
            java.lang.String r8 = "try to dump data without debugger"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r8)
            return
        L_0x0018:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "CPU_"
            r0.append(r1)
            r0.append(r7)
            r7 = 95
            r0.append(r7)
            long r1 = com.tencent.p014mm.sdk.platformtools.MMSlotKt.now()
            r0.append(r1)
            java.lang.String r7 = ".cpuprofile"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "close file error: "
            boolean r1 = p206nj.C88955f.m111058b()
            r2 = 0
            if (r1 != 0) goto L_0x004b
            java.lang.String r8 = r6.f128615c
            java.lang.String r0 = "dumpToFile error, SDCard is unavailable."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            goto L_0x00b2
        L_0x004b:
            r1 = 0
            com.tencent.mm.vfs.m1 r3 = new com.tencent.mm.vfs.m1     // Catch:{ Exception -> 0x0080 }
            java.lang.String r4 = f128618e     // Catch:{ Exception -> 0x0080 }
            r3.<init>((java.lang.String) r4)     // Catch:{ Exception -> 0x0080 }
            boolean r4 = r3.mo119967g()     // Catch:{ Exception -> 0x0080 }
            if (r4 != 0) goto L_0x005c
            r3.mo119987x()     // Catch:{ Exception -> 0x0080 }
        L_0x005c:
            com.tencent.mm.vfs.m1 r4 = new com.tencent.mm.vfs.m1     // Catch:{ Exception -> 0x0080 }
            r4.<init>((com.tencent.p014mm.vfs.C86009m1) r3, (java.lang.String) r7)     // Catch:{ Exception -> 0x0080 }
            com.tencent.mm.vfs.u1 r3 = new com.tencent.mm.vfs.u1     // Catch:{ Exception -> 0x0080 }
            r3.<init>((com.tencent.p014mm.vfs.C86009m1) r4, (boolean) r2)     // Catch:{ Exception -> 0x0080 }
            r3.write(r8)     // Catch:{ Exception -> 0x007a, all -> 0x0077 }
            r2 = 1
            r3.close()     // Catch:{ Exception -> 0x006e }
            goto L_0x00b2
        L_0x006e:
            r8 = move-exception
            java.lang.String r1 = r6.f128615c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            goto L_0x00a5
        L_0x0077:
            r7 = move-exception
            goto L_0x0122
        L_0x007a:
            r8 = move-exception
            r1 = r3
            goto L_0x0081
        L_0x007d:
            r7 = move-exception
            goto L_0x0121
        L_0x0080:
            r8 = move-exception
        L_0x0081:
            java.lang.String r3 = r6.f128615c     // Catch:{ all -> 0x007d }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x007d }
            r4.<init>()     // Catch:{ all -> 0x007d }
            java.lang.String r5 = "dump file error: "
            r4.append(r5)     // Catch:{ all -> 0x007d }
            r4.append(r8)     // Catch:{ all -> 0x007d }
            java.lang.String r8 = r4.toString()     // Catch:{ all -> 0x007d }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r8)     // Catch:{ all -> 0x007d }
            if (r1 == 0) goto L_0x00b2
            r1.close()     // Catch:{ Exception -> 0x009d }
            goto L_0x00b2
        L_0x009d:
            r8 = move-exception
            java.lang.String r1 = r6.f128615c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
        L_0x00a5:
            r3.append(r0)
            r3.append(r8)
            java.lang.String r8 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r8)
        L_0x00b2:
            if (r2 == 0) goto L_0x00f3
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = f128618e
            r8.append(r0)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            java.lang.String r0 = " exported."
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            r73.i r1 = new r73.i
            r1.<init>(r8)
            o40.C61926c.m72668M(r1)
            java.lang.String r8 = r6.f128615c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            r1.append(r0)
            java.lang.String r7 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r7)
            goto L_0x0120
        L_0x00f3:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            java.lang.String r0 = " export failed!"
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            r73.i r1 = new r73.i
            r1.<init>(r8)
            o40.C61926c.m72668M(r1)
            java.lang.String r8 = r6.f128615c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            r1.append(r0)
            java.lang.String r7 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r7)
        L_0x0120:
            return
        L_0x0121:
            r3 = r1
        L_0x0122:
            if (r3 == 0) goto L_0x013d
            r3.close()     // Catch:{ Exception -> 0x0128 }
            goto L_0x013d
        L_0x0128:
            r8 = move-exception
            java.lang.String r1 = r6.f128615c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r8)
        L_0x013d:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: r73.C47934j.dump(java.lang.String, java.lang.String):void");
    }

    @JavascriptInterface
    public final int getLogLevel() {
        return Log.getLogLevel();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a9  */
    @android.webkit.JavascriptInterface
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getNetWorkType() {
        /*
            r9 = this;
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isConnected((android.content.Context) r0)
            java.lang.String r2 = "JSONObject().apply { put…pe\", \"none\") }.toString()"
            java.lang.String r3 = "none"
            java.lang.String r4 = "networkType"
            if (r1 != 0) goto L_0x0027
            java.lang.String r0 = r9.f128615c
            java.lang.String r1 = "getNetworkType, not connected"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r0.put(r4, r3)
            java.lang.String r0 = r0.toString()
            gy3.C87412m.m108593f(r0, r2)
            return r0
        L_0x0027:
            java.lang.Class<q62.b> r1 = q62.C101048b.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            q62.b r1 = (q62.C101048b) r1
            if (r1 == 0) goto L_0x003c
            r5 = 16
            int r1 = r1.mo60590Os(r5)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x003d
        L_0x003c:
            r1 = 0
        L_0x003d:
            if (r1 != 0) goto L_0x0040
            goto L_0x004c
        L_0x0040:
            int r5 = r1.intValue()
            if (r5 != 0) goto L_0x004c
            r1 = 0
        L_0x0047:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x005d
        L_0x004c:
            if (r1 != 0) goto L_0x004f
            goto L_0x005b
        L_0x004f:
            int r1 = r1.intValue()
            r5 = 1
            if (r1 != r5) goto L_0x005b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            goto L_0x005d
        L_0x005b:
            r1 = 2
            goto L_0x0047
        L_0x005d:
            int r5 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.getNetType((android.content.Context) r0)
            java.lang.String r6 = r9.f128615c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "getNetworkType, type = "
            r7.append(r8)
            r7.append(r5)
            java.lang.String r5 = ", simType = "
            r7.append(r5)
            r7.append(r1)
            java.lang.String r5 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is2G(r0)
            java.lang.String r6 = "JSONObject().apply {\n   …\n            }.toString()"
            java.lang.String r7 = "simtype"
            if (r5 == 0) goto L_0x00a9
            java.lang.String r0 = r9.f128615c
            java.lang.String r2 = "getNetworkType, 2g"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r2 = "2g"
            r0.put(r4, r2)
            int r1 = r1.intValue()
            r0.put(r7, r1)
            java.lang.String r0 = r0.toString()
            gy3.C87412m.m108593f(r0, r6)
            return r0
        L_0x00a9:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is3G(r0)
            if (r5 == 0) goto L_0x00cf
            java.lang.String r0 = r9.f128615c
            java.lang.String r2 = "getNetworkType, 3g"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r2 = "3g"
            r0.put(r4, r2)
            int r1 = r1.intValue()
            r0.put(r7, r1)
            java.lang.String r0 = r0.toString()
            gy3.C87412m.m108593f(r0, r6)
            return r0
        L_0x00cf:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is4G(r0)
            if (r5 == 0) goto L_0x00f5
            java.lang.String r0 = r9.f128615c
            java.lang.String r2 = "getNetworkType, 4g"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r2 = "4g"
            r0.put(r4, r2)
            int r1 = r1.intValue()
            r0.put(r7, r1)
            java.lang.String r0 = r0.toString()
            gy3.C87412m.m108593f(r0, r6)
            return r0
        L_0x00f5:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is5G(r0)
            if (r5 == 0) goto L_0x011b
            java.lang.String r0 = r9.f128615c
            java.lang.String r2 = "getNetworkType, 5g"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r2 = "5g"
            r0.put(r4, r2)
            int r1 = r1.intValue()
            r0.put(r7, r1)
            java.lang.String r0 = r0.toString()
            gy3.C87412m.m108593f(r0, r6)
            return r0
        L_0x011b:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isWifi((android.content.Context) r0)
            if (r0 == 0) goto L_0x0142
            java.lang.String r0 = r9.f128615c
            java.lang.String r2 = "getNetworkType, wifi"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r2 = "wifi"
            r0.put(r4, r2)
            int r1 = r1.intValue()
            r0.put(r7, r1)
            java.lang.String r0 = r0.toString()
            gy3.C87412m.m108593f(r0, r6)
            return r0
        L_0x0142:
            java.lang.String r0 = r9.f128615c
            java.lang.String r1 = "getNetworkType, unknown"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r0.put(r4, r3)
            java.lang.String r0 = r0.toString()
            gy3.C87412m.m108593f(r0, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r73.C47934j.getNetWorkType():java.lang.String");
    }

    @JavascriptInterface
    public final String getPlatform() {
        return Platform.ANDROID;
    }

    @JavascriptInterface
    public final String getSystemInfo() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("devicesType", 2);
        jSONObject.put("osVersion", Build.VERSION.SDK_INT);
        jSONObject.put("brand", Build.BRAND);
        jSONObject.put("model", C87203t.m108275k());
        jSONObject.put("pixelRatio", Float.valueOf(C89894f.f258347d.mo124203c()));
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …tio)\n        }.toString()");
        return jSONObject2;
    }

    @JavascriptInterface
    public final void idkey(long j, long j2, long j3) {
        if (j <= 0) {
            Log.m105920e(this.f128615c, "idkey id can't be 0");
        } else {
            C115669n.INSTANCE.mo175913w(j, j2, j3);
        }
    }

    @JavascriptInterface
    public final void idkeyList(String str) {
        C87412m.m108594g(str, "idkeyList");
        C26827e eVar = new C26827e(str);
        LinkedList linkedList = new LinkedList();
        int length = eVar.length();
        for (int i = 0; i < length; i++) {
            C26827e n = eVar.mo53807h(i);
            linkedList.add(new IDKey(n.getLong(0), n.getLong(1), n.getLong(2)));
        }
        C115669n nVar = C115669n.INSTANCE;
        ArrayList arrayList = new ArrayList();
        for (Object next : linkedList) {
            if (((IDKey) next).GetID() > 0) {
                arrayList.add(next);
            }
        }
        nVar.mo160124a(new ArrayList(arrayList), false);
    }

    @JavascriptInterface
    /* renamed from: kv */
    public final void mo72699kv(int i, String str) {
        C87412m.m108594g(str, "data");
        String str2 = this.f128615c;
        Log.m105924i(str2, "kvStat id=" + i + ", data=" + str);
        C115669n.INSTANCE.kvStat(i, str);
    }

    @JavascriptInterface
    public final void reportCgi(Number number, String str, String str2) {
        C87412m.m108594g(number, "businessId");
        C87412m.m108594g(str, "reqJson");
        C87412m.m108594g(str2, "callback");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49550gf();
        bVar.f127067b = new C49694hf();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/report/bizcommreport";
        bVar.f127069d = 4779;
        C47350c a = bVar.mo72403a();
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BizCommReportReq");
        C49550gf gfVar = (C49550gf) aVar;
        gfVar.f134006d = number.intValue();
        gfVar.f134007e = str;
        Log.m105919d(this.f128615c, "reportCgi %s", str);
        String str3 = this.f128615c;
        Log.m105924i(str3, "reportCgi businessId=" + number);
        C89144l0.m111429e(a, new C47935c(this, str2), false);
    }

    @JavascriptInterface
    public final String userAgent() {
        String a = C46574u.m51897a(MMApplicationContext.getContext(), C45596j.f123315f.mo71117a(), (C45596j) ((C36570n) f128617d).getValue());
        String str = this.f128615c;
        Log.m105918d(str, "userAgent=" + a);
        C87412m.m108593f(a, "userAgent");
        return a;
    }
}
