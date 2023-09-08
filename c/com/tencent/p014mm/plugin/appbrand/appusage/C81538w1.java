package com.tencent.p014mm.plugin.appbrand.appusage;

import android.os.Bundle;
import android.os.Handler;
import com.tencent.p014mm.app.C114661d0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import eb0.C86497v5;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import o40.C61926c;
import ob0.C35136m;
import rx3.C13598b0;
import sf0.C48374j0;

/* renamed from: com.tencent.mm.plugin.appbrand.appusage.w1 */
public final class C81538w1 implements C114661d0, C86497v5.C31521b {

    /* renamed from: d */
    public final String f239147d = "MicroMsg.WxaStarAndHistoryPushingReceiver";

    /* renamed from: e */
    public final String f239148e = String.valueOf(hashCode());

    /* renamed from: f */
    public volatile boolean f239149f = true;

    /* renamed from: g */
    public volatile boolean f239150g;

    /* renamed from: h */
    public AtomicBoolean f239151h = new AtomicBoolean(true);

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.w1$a */
    public /* synthetic */ class C81539a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f239152a;

        static {
            int[] iArr = new int[C81515n1.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
            iArr[3] = 4;
            f239152a = iArr;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.w1$b */
    public static final class C81540b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C81538w1 f239153d;

        /* renamed from: e */
        public final /* synthetic */ String f239154e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C81540b(C81538w1 w1Var, String str) {
            super(0);
            this.f239153d = w1Var;
            this.f239154e = str;
        }

        /* JADX WARNING: Failed to insert additional move for type inference */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r14 = this;
                com.tencent.mm.plugin.appbrand.appusage.w1 r0 = r14.f239153d
                java.lang.String r1 = r14.f239154e
                java.lang.String r2 = "msgContent"
                gy3.C87412m.m108593f(r1, r2)
                r0.getClass()
                boolean r2 = f40.C86709a0.m107522a()
                if (r2 != 0) goto L_0x001c
                java.lang.String r0 = r0.f239147d
                java.lang.String r1 = "parseThenProcess, account not ready"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                goto L_0x0127
            L_0x001c:
                r2 = 0
                java.lang.String r3 = "sysmsg"
                java.util.Map r1 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r1, r3, r2)
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L_0x0031
                boolean r5 = r1.isEmpty()
                if (r5 == 0) goto L_0x002f
                goto L_0x0031
            L_0x002f:
                r5 = 0
                goto L_0x0032
            L_0x0031:
                r5 = 1
            L_0x0032:
                if (r5 == 0) goto L_0x0036
                goto L_0x0127
            L_0x0036:
                java.lang.String r5 = ".sysmsg.UpdateWxaUsageListNotify"
                java.lang.String r6 = ".sysmsg.UpdateWxaUsageListNotify.Type"
                java.lang.Object r6 = r1.get(r6)
                java.lang.String r6 = (java.lang.String) r6
                int r6 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r3)
                java.lang.String r7 = r0.f239147d
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "type:"
                r8.append(r9)
                com.tencent.mm.plugin.appbrand.appusage.n1[] r9 = com.tencent.p014mm.plugin.appbrand.appusage.C81515n1.values()
                int r10 = r9.length
                r11 = 0
            L_0x0057:
                if (r11 >= r10) goto L_0x0068
                r12 = r9[r11]
                int r13 = r12.f239116d
                if (r13 != r6) goto L_0x0061
                r13 = 1
                goto L_0x0062
            L_0x0061:
                r13 = 0
            L_0x0062:
                if (r13 == 0) goto L_0x0065
                goto L_0x0069
            L_0x0065:
                int r11 = r11 + 1
                goto L_0x0057
            L_0x0068:
                r12 = r2
            L_0x0069:
                if (r12 != 0) goto L_0x006d
                java.lang.String r12 = "NULL"
            L_0x006d:
                r8.append(r12)
                java.lang.String r8 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
                boolean r7 = r0.f239149f
                r8 = 2
                if (r7 != 0) goto L_0x0084
                java.util.concurrent.atomic.AtomicBoolean r7 = r0.f239151h
                boolean r7 = r7.get()
                if (r7 == 0) goto L_0x008a
            L_0x0084:
                if (r6 == r4) goto L_0x010c
                if (r6 != r8) goto L_0x008a
                goto L_0x010c
            L_0x008a:
                com.tencent.mm.plugin.appbrand.appusage.n1[] r7 = com.tencent.p014mm.plugin.appbrand.appusage.C81515n1.values()
                int r9 = r7.length
                r10 = 0
            L_0x0090:
                if (r10 >= r9) goto L_0x00a2
                r11 = r7[r10]
                int r12 = r11.f239116d
                if (r12 != r6) goto L_0x009a
                r12 = 1
                goto L_0x009b
            L_0x009a:
                r12 = 0
            L_0x009b:
                if (r12 == 0) goto L_0x009f
                r2 = r11
                goto L_0x00a2
            L_0x009f:
                int r10 = r10 + 1
                goto L_0x0090
            L_0x00a2:
                if (r2 != 0) goto L_0x00a6
                r2 = -1
                goto L_0x00ae
            L_0x00a6:
                int[] r6 = com.tencent.p014mm.plugin.appbrand.appusage.C81538w1.C81539a.f239152a
                int r2 = r2.ordinal()
                r2 = r6[r2]
            L_0x00ae:
                if (r2 == r4) goto L_0x0108
                if (r2 == r8) goto L_0x0104
                r4 = 3
                if (r2 == r4) goto L_0x00e4
                r4 = 4
                if (r2 == r4) goto L_0x00b9
                goto L_0x0127
            L_0x00b9:
                java.util.List r0 = r0.mo113809q(r1, r5)
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                java.util.Iterator r0 = r0.iterator()
            L_0x00c3:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x0127
                java.lang.Object r1 = r0.next()
                com.tencent.mm.plugin.appbrand.appusage.v1 r1 = (com.tencent.p014mm.plugin.appbrand.appusage.C29395v1) r1
                java.lang.String r2 = r1.f80191a
                java.lang.String r4 = r1.f80192b
                int r5 = r1.f80193c
                com.tencent.p014mm.plugin.appbrand.appusage.C81523q1.m100016a(r2, r4, r5)
                com.tencent.mm.plugin.appbrand.appusage.i0 r2 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Ax0()
                java.lang.String r4 = r1.f80191a
                int r1 = r1.f80193c
                r2.mo113795kD(r4, r1, r3)
                goto L_0x00c3
            L_0x00e4:
                java.util.List r0 = r0.mo113809q(r1, r5)
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                java.util.Iterator r0 = r0.iterator()
            L_0x00ee:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x0127
                java.lang.Object r1 = r0.next()
                com.tencent.mm.plugin.appbrand.appusage.v1 r1 = (com.tencent.p014mm.plugin.appbrand.appusage.C29395v1) r1
                java.lang.String r2 = r1.f80191a
                java.lang.String r3 = r1.f80192b
                int r1 = r1.f80193c
                com.tencent.p014mm.plugin.appbrand.appusage.C81523q1.m100016a(r2, r3, r1)
                goto L_0x00ee
            L_0x0104:
                r0.mo113808d()
                goto L_0x0127
            L_0x0108:
                r0.mo113808d()
                goto L_0x0127
            L_0x010c:
                java.lang.String r1 = r0.f239147d
                java.lang.String r2 = "app is in background status or force pending fetching,pending execute history and star fetching"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
                r0.f239150g = r4
                java.util.concurrent.atomic.AtomicBoolean r1 = r0.f239151h
                boolean r1 = r1.get()
                if (r1 == 0) goto L_0x0127
                r1 = 1500(0x5dc, double:7.41E-321)
                com.tencent.mm.plugin.appbrand.appusage.x1 r3 = new com.tencent.mm.plugin.appbrand.appusage.x1
                r3.<init>(r0)
                o40.C61926c.m72666K(r1, r3)
            L_0x0127:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appusage.C81538w1.C81540b.invoke():java.lang.Object");
        }
    }

    /* renamed from: C1 */
    public void mo9065C1(C35136m.C35138c cVar) {
    }

    /* renamed from: Y */
    public void mo9066Y(C35136m.C35137a aVar) {
        C87412m.m108594g(aVar, "addMsgInfo");
        if (C86709a0.m107522a()) {
            String g = C48374j0.m53718g(aVar.f94242a.f227631h);
            if (!Util.isNullOrNil(g)) {
                C61926c.m72661F(this.f239148e, new C81540b(this, g));
            }
        }
    }

    /* renamed from: d */
    public final void mo113808d() {
        Log.m105924i(this.f239147d, "fetchStartAndHistory");
        C81516o.m100007qq().sp0(Util.nowMilliSecond(), true, (Bundle) null, 4, 0);
    }

    public Handler getHandler() {
        return null;
    }

    public void onAppBackground(String str) {
        C87412m.m108594g(str, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (C86709a0.m107522a()) {
            Log.m105924i(this.f239147d, "onAppBackground");
            this.f239149f = true;
        }
    }

    public void onAppForeground(String str) {
        C87412m.m108594g(str, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (C86709a0.m107522a()) {
            Log.m105924i(this.f239147d, "onAppForeground");
            this.f239149f = false;
            if (this.f239150g) {
                this.f239150g = false;
                C61926c.m72661F(this.f239148e, new C81544y1(this));
            }
        }
    }

    /* renamed from: q */
    public final List<C29395v1> mo113809q(Map<String, String> map, String str) {
        int i = Util.getInt(map.get(str + ".DeleteCount"), 0);
        ArrayList arrayList = new ArrayList();
        if (i > 0) {
            int i2 = 0;
            while (i2 < i) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(".DeleteList.DeleteAppInfo");
                sb.append(i2 == 0 ? "" : Integer.valueOf(i2));
                String sb4 = sb.toString();
                String str2 = map.get(sb4 + ".UserName");
                String str3 = map.get(sb4 + ".AppID");
                int i3 = Util.getInt(map.get(sb4 + ".AppType"), 0);
                boolean z = true;
                if (!(str2 == null || str2.length() == 0)) {
                    if (!(str3 == null || str3.length() == 0)) {
                        z = false;
                    }
                    if (!z) {
                        arrayList.add(new C29395v1(str2, str3, i3));
                    }
                }
                i2++;
            }
        }
        return arrayList;
    }
}
