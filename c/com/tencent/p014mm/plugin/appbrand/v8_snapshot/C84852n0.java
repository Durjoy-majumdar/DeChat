package com.tencent.p014mm.plugin.appbrand.v8_snapshot;

import android.os.SystemClock;
import com.eclipsesource.mmv8.snapshot.CreateSnapshotResult;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appcache.C81274j2;
import com.tencent.p014mm.plugin.appbrand.appcache.IPkgInfo;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84872v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C24565l;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import rx3.C13598b0;
import z04.C112550d0;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.n0 */
public final class C84852n0 implements C84871v {

    /* renamed from: d */
    public static final C84852n0 f247339d = new C84852n0();

    /* renamed from: e */
    public static final C81274j2.C81275a f247340e = C84858f.f247353a;

    /* renamed from: f */
    public static final AtomicBoolean f247341f = new AtomicBoolean(false);

    /* renamed from: g */
    public static final Set<ICommLibReader> f247342g = Collections.newSetFromMap(new HashMap());

    /* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.n0$a */
    public /* synthetic */ class C84853a extends C24565l implements C32226l<WxaPkgV8SnapshotInfo, WxaPkgV8SnapshotInfo> {

        /* renamed from: d */
        public static final C84853a f247343d = new C84853a();

        public C84853a() {
            super(1, WxaPkgV8SnapshotInfo.class, "onConsumeEnd", "onConsumeEnd()Lcom/tencent/mm/plugin/appbrand/v8_snapshot/WxaPkgV8SnapshotInfo;", 0);
        }

        public Object invoke(Object obj) {
            WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo = (WxaPkgV8SnapshotInfo) obj;
            C87412m.m108594g(wxaPkgV8SnapshotInfo, "p0");
            return WxaPkgV8SnapshotInfo.m104498b(wxaPkgV8SnapshotInfo, 0, (String) null, (String) null, 0, (C84872v0) null, (String) null, 0, 0, (String) null, (JSONObject) null, false, (String) null, 0, wxaPkgV8SnapshotInfo.f247281t - 1, 0, 24575, (Object) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.n0$b */
    public /* synthetic */ class C84854b extends C24565l implements C32226l<WxaPkgV8SnapshotInfo, WxaPkgV8SnapshotInfo> {

        /* renamed from: d */
        public static final C84854b f247344d = new C84854b();

        public C84854b() {
            super(1, WxaPkgV8SnapshotInfo.class, "onRecoverFromConsume", "onRecoverFromConsume()Lcom/tencent/mm/plugin/appbrand/v8_snapshot/WxaPkgV8SnapshotInfo;", 0);
        }

        public Object invoke(Object obj) {
            WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo = (WxaPkgV8SnapshotInfo) obj;
            C87412m.m108594g(wxaPkgV8SnapshotInfo, "p0");
            return WxaPkgV8SnapshotInfo.m104498b(wxaPkgV8SnapshotInfo, 0, (String) null, (String) null, 0, (C84872v0) null, (String) null, 0, 0, (String) null, (JSONObject) null, false, (String) null, 0, wxaPkgV8SnapshotInfo.f247281t - 2, wxaPkgV8SnapshotInfo.f247282u + 1, 8191, (Object) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.n0$c */
    public /* synthetic */ class C84855c extends C24565l implements C32226l<WxaPkgV8SnapshotInfo, WxaPkgV8SnapshotInfo> {

        /* renamed from: d */
        public static final C84855c f247345d = new C84855c();

        public C84855c() {
            super(1, WxaPkgV8SnapshotInfo.class, "onConsumeStart", "onConsumeStart()Lcom/tencent/mm/plugin/appbrand/v8_snapshot/WxaPkgV8SnapshotInfo;", 0);
        }

        public Object invoke(Object obj) {
            WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo = (WxaPkgV8SnapshotInfo) obj;
            C87412m.m108594g(wxaPkgV8SnapshotInfo, "p0");
            return WxaPkgV8SnapshotInfo.m104498b(wxaPkgV8SnapshotInfo, 0, (String) null, (String) null, 0, (C84872v0) null, (String) null, 0, 0, (String) null, (JSONObject) null, false, (String) null, 0, wxaPkgV8SnapshotInfo.f247281t + 1, 0, 24575, (Object) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.n0$d */
    public static final class C84856d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C84856d f247346d = new C84856d();

        public C84856d() {
            super(0);
        }

        public Object invoke() {
            Log.m105924i("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "done#createNodeOnlySnapshotIfNeed");
            C84852n0.f247341f.set(false);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.n0$e */
    public static final class C84857e extends C87413o implements C32226l<CreateSnapshotResult, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ long f247347d;

        /* renamed from: e */
        public final /* synthetic */ ICommLibReader f247348e;

        /* renamed from: f */
        public final /* synthetic */ C8479f0<WxaPkgV8SnapshotInfo> f247349f;

        /* renamed from: g */
        public final /* synthetic */ boolean f247350g;

        /* renamed from: h */
        public final /* synthetic */ boolean f247351h;

        /* renamed from: i */
        public final /* synthetic */ C32224a<C13598b0> f247352i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C84857e(long j, ICommLibReader iCommLibReader, C8479f0<WxaPkgV8SnapshotInfo> f0Var, boolean z, boolean z2, C32224a<C13598b0> aVar) {
            super(1);
            this.f247347d = j;
            this.f247348e = iCommLibReader;
            this.f247349f = f0Var;
            this.f247350g = z;
            this.f247351h = z2;
            this.f247352i = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x00b4, code lost:
            r10 = r10.f348991a.mo119945q(r10.f348992b);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r25) {
            /*
                r24 = this;
                r1 = r24
                r0 = r25
                com.eclipsesource.mmv8.snapshot.CreateSnapshotResult r0 = (com.eclipsesource.mmv8.snapshot.CreateSnapshotResult) r0
                java.lang.String r2 = "result"
                gy3.C87412m.m108594g(r0, r2)
                com.tencent.mm.plugin.appbrand.v8_snapshot.u0 r2 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84868u0.f247366a
                long r3 = r1.f247347d
                com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r5 = r1.f247348e
                gy3.f0<com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo> r6 = r1.f247349f
                T r6 = r6.f27484d
                com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo r6 = (com.tencent.p014mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo) r6
                com.tencent.mm.plugin.appbrand.v8_snapshot.v0 r6 = r6.f247272h
                boolean r7 = r1.f247350g
                java.lang.String r8 = "commLibReader"
                gy3.C87412m.m108594g(r5, r8)
                java.lang.String r8 = "category"
                gy3.C87412m.m108594g(r6, r8)
                long r8 = android.os.SystemClock.uptimeMillis()
                long r8 = r8 - r3
                com.tencent.mm.plugin.appbrand.v8_snapshot.f0 r3 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84840f0.f247297a
                r3.getClass()
                boolean r3 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84840f0.f247299c
                r4 = 0
                r12 = 0
                if (r3 == 0) goto L_0x00cd
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r13 = "onCreateSnapshotEnd, costTimeMs: "
                r3.append(r13)
                r3.append(r8)
                java.lang.String r13 = ", commLibReader: "
                r3.append(r13)
                java.lang.String r13 = r2.mo117623t(r5)
                r3.append(r13)
                java.lang.String r13 = ", category: "
                r3.append(r13)
                r3.append(r6)
                java.lang.String r13 = ", result: "
                r3.append(r13)
                r3.append(r0)
                java.lang.String r13 = ", isNodeSnapshot: "
                r3.append(r13)
                r3.append(r7)
                java.lang.String r3 = r3.toString()
                java.lang.String r13 = "MicroMsg.WxaCommLibV8SnapshotStats"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r3)
                boolean r3 = r0 instanceof com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Success
                if (r3 == 0) goto L_0x00cd
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r14 = "onCreateSnapshotEnd, snapshotSize: "
                r3.append(r14)
                r14 = r0
                com.eclipsesource.mmv8.snapshot.CreateSnapshotResult$Success r14 = (com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Success) r14
                java.lang.String r14 = r14.snapshotPath
                android.net.Uri r14 = com.tencent.p014mm.vfs.C116299g2.m163858n(r14)
                java.lang.String r15 = r14.getPath()
                if (r15 == 0) goto L_0x00a7
                java.lang.String r15 = com.tencent.p014mm.vfs.C116299g2.m163855k(r15, r4, r4)
                java.lang.String r10 = r14.getPath()
                boolean r10 = r10.equals(r15)
                if (r10 != 0) goto L_0x00a7
                android.net.Uri$Builder r10 = r14.buildUpon()
                android.net.Uri$Builder r10 = r10.path(r15)
                android.net.Uri r14 = r10.build()
            L_0x00a7:
                com.tencent.mm.vfs.f0 r10 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
                com.tencent.mm.vfs.f0$h r10 = r10.mo177799l(r14, r12)
                boolean r11 = r10.mo177810a()
                if (r11 != 0) goto L_0x00b4
                goto L_0x00be
            L_0x00b4:
                com.tencent.mm.vfs.FileSystem$c r11 = r10.f348991a
                java.lang.String r10 = r10.f348992b
                com.tencent.mm.vfs.b0 r10 = r11.mo119945q(r10)
                if (r10 != 0) goto L_0x00c1
            L_0x00be:
                r10 = 0
                goto L_0x00c3
            L_0x00c1:
                long r10 = r10.f250473c
            L_0x00c3:
                r3.append(r10)
                java.lang.String r3 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r3)
            L_0x00cd:
                boolean r3 = r2.mo117605b()
                if (r3 != 0) goto L_0x00d5
                goto L_0x0174
            L_0x00d5:
                boolean r3 = r0 instanceof com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Success
                java.lang.String r10 = "1"
                java.lang.String r11 = "0"
                if (r3 == 0) goto L_0x012a
                r3 = r0
                com.eclipsesource.mmv8.snapshot.CreateSnapshotResult$Success r3 = (com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Success) r3
                java.lang.String r3 = r3.snapshotPath
                android.net.Uri r3 = com.tencent.p014mm.vfs.C116299g2.m163858n(r3)
                java.lang.String r13 = r3.getPath()
                if (r13 == 0) goto L_0x0106
                java.lang.String r4 = com.tencent.p014mm.vfs.C116299g2.m163855k(r13, r4, r4)
                java.lang.String r13 = r3.getPath()
                boolean r13 = r13.equals(r4)
                if (r13 != 0) goto L_0x0106
                android.net.Uri$Builder r3 = r3.buildUpon()
                android.net.Uri$Builder r3 = r3.path(r4)
                android.net.Uri r3 = r3.build()
            L_0x0106:
                com.tencent.mm.vfs.f0 r4 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
                com.tencent.mm.vfs.f0$h r3 = r4.mo177799l(r3, r12)
                boolean r4 = r3.mo177810a()
                if (r4 != 0) goto L_0x0113
                goto L_0x011d
            L_0x0113:
                com.tencent.mm.vfs.FileSystem$c r4 = r3.f348991a
                java.lang.String r3 = r3.f348992b
                com.tencent.mm.vfs.b0 r3 = r4.mo119945q(r3)
                if (r3 != 0) goto L_0x0120
            L_0x011d:
                r16 = 0
                goto L_0x0124
            L_0x0120:
                long r3 = r3.f250473c
                r16 = r3
            L_0x0124:
                java.lang.String r3 = java.lang.String.valueOf(r16)
                r4 = r10
                goto L_0x013b
            L_0x012a:
                boolean r3 = r0 instanceof com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Failure
                if (r3 == 0) goto L_0x0138
                r3 = r0
                com.eclipsesource.mmv8.snapshot.CreateSnapshotResult$Failure r3 = (com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Failure) r3
                int r3 = r3.errno
                java.lang.String r3 = java.lang.String.valueOf(r3)
                goto L_0x013a
            L_0x0138:
                java.lang.String r3 = "-201"
            L_0x013a:
                r4 = r11
            L_0x013b:
                com.tencent.mm.autogen.mmdata.rpt.AndroidWAServiceLibSnapshotQualityStruct r12 = new com.tencent.mm.autogen.mmdata.rpt.AndroidWAServiceLibSnapshotQualityStruct
                r12.<init>()
                r13 = 5
                r12.f236322d = r13
                java.lang.String r2 = r2.mo117623t(r5)
                r12.mo112529v(r2)
                java.lang.String r2 = com.tencent.p014mm.appbrand.p942v8.C80658e.m98345b()
                r12.mo112530w(r2)
                r12.mo112526s(r8)
                r12.mo112527t(r4)
                r12.mo112528u(r3)
                java.lang.String r2 = r6.f247381d
                java.lang.String r3 = "ActionParams3"
                r4 = 1
                java.lang.String r2 = r12.mo86045b(r3, r2, r4)
                r12.f236328j = r2
                if (r7 == 0) goto L_0x0168
                goto L_0x0169
            L_0x0168:
                r10 = r11
            L_0x0169:
                java.lang.String r2 = "ActionParams4"
                java.lang.String r2 = r12.mo86045b(r2, r10, r4)
                r12.f236329k = r2
                r12.mo86054n()
            L_0x0174:
                boolean r2 = r0 instanceof com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Success
                if (r2 == 0) goto L_0x02dc
                gy3.f0<com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo> r2 = r1.f247349f
                T r3 = r2.f27484d
                r4 = r3
                com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo r4 = (com.tencent.p014mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo) r4
                com.eclipsesource.mmv8.snapshot.CreateSnapshotResult$Success r0 = (com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Success) r0
                boolean r3 = r1.f247350g
                r4.getClass()
                com.tencent.mm.vfs.m1 r5 = new com.tencent.mm.vfs.m1
                java.lang.String r6 = r0.snapshotPath
                r5.<init>((java.lang.String) r6)
                java.lang.String r10 = r0.snapshotPath
                java.lang.String r6 = "result.snapshotPath"
                gy3.C87412m.m108593f(r10, r6)
                long r11 = r5.mo119979q()
                long r13 = r5.mo119980r()
                com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo$c r5 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo.f247265v
                rx3.g<java.lang.String> r5 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo.f247266w
                rx3.n r5 = (rx3.C36570n) r5
                java.lang.Object r5 = r5.getValue()
                r15 = r5
                java.lang.String r15 = (java.lang.String) r15
                java.lang.String r5 = "curSnapshotBaseConfig"
                gy3.C87412m.m108593f(r15, r5)
                java.util.Map<java.lang.String, java.lang.Integer> r0 = r0.contextNameToSnapshotIndexMap
                java.lang.String r5 = "result.contextNameToSnapshotIndexMap"
                gy3.C87412m.m108593f(r0, r5)
                org.json.JSONObject r9 = new org.json.JSONObject
                r9.<init>()
                java.util.Set r0 = r0.entrySet()     // Catch:{ Exception -> 0x01e4 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x01e4 }
            L_0x01c4:
                boolean r5 = r0.hasNext()     // Catch:{ Exception -> 0x01e4 }
                if (r5 == 0) goto L_0x01fb
                java.lang.Object r5 = r0.next()     // Catch:{ Exception -> 0x01e4 }
                java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ Exception -> 0x01e4 }
                java.lang.Object r6 = r5.getKey()     // Catch:{ Exception -> 0x01e4 }
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x01e4 }
                java.lang.Object r5 = r5.getValue()     // Catch:{ Exception -> 0x01e4 }
                java.lang.Number r5 = (java.lang.Number) r5     // Catch:{ Exception -> 0x01e4 }
                int r5 = r5.intValue()     // Catch:{ Exception -> 0x01e4 }
                r9.put(r6, r5)     // Catch:{ Exception -> 0x01e4 }
                goto L_0x01c4
            L_0x01e4:
                r0 = move-exception
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "generateMetaInfo, failure since "
                r5.append(r6)
                r5.append(r0)
                java.lang.String r0 = r5.toString()
                java.lang.String r5 = "MicroMsg.WxaPkgV8SnapshotInfo"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            L_0x01fb:
                com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo$c r0 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo.f247265v
                rx3.g<java.lang.String> r0 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo.f247267x
                rx3.n r0 = (rx3.C36570n) r0
                java.lang.Object r0 = r0.getValue()
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r5 = "curSnapshotNodeFlag"
                gy3.C87412m.m108593f(r0, r5)
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 24607(0x601f, float:3.4482E-41)
                r23 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r16 = 0
                r17 = r9
                r9 = r16
                r16 = r17
                r17 = r3
                r18 = r0
                com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo r0 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo.m104498b(r4, r5, r6, r7, r8, r9, r10, r11, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                r2.f27484d = r0
                zt3.t r0 = zt3.C119157j.f356862d
                com.tencent.mm.plugin.appbrand.v8_snapshot.o0 r2 = new com.tencent.mm.plugin.appbrand.v8_snapshot.o0
                gy3.f0<com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo> r3 = r1.f247349f
                r2.<init>(r3)
                zt3.j r0 = (zt3.C119157j) r0
                java.lang.String r3 = "MicroMsg.WxaCommLibV8SnapshotServiceImpl"
                r0.mo183885p(r2, r3)
                boolean r0 = r1.f247351h
                if (r0 == 0) goto L_0x02dc
                gy3.f0<com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo> r0 = r1.f247349f
                T r0 = r0.f27484d
                com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo r0 = (com.tencent.p014mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo) r0
                com.tencent.mm.plugin.appbrand.v8_snapshot.f0 r2 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84840f0.f247297a
                r2.getClass()
                boolean r2 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84840f0.f247299c
                if (r2 == 0) goto L_0x0266
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "snapshotInfo#set, value: "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "MicroMsg.AppBrand.NodeOnlySnapshotQuickAccessible"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            L_0x0266:
                java.lang.String r2 = "NodeOnlySnapshotInfo#"
                if (r0 != 0) goto L_0x0287
                com.tencent.mm.plugin.appbrand.app.o r0 = com.tencent.p014mm.plugin.appbrand.app.C1510o.f10864a
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = r0.mo1516a()
                if (r0 == 0) goto L_0x02dc
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r2)
                int r2 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84878x0.f247394d
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                r0.remove(r2)
                goto L_0x02dc
            L_0x0287:
                com.tencent.mm.plugin.appbrand.app.o r3 = com.tencent.p014mm.plugin.appbrand.app.C1510o.f10864a
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r3 = r3.mo1516a()
                if (r3 == 0) goto L_0x02dc
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r2)
                int r2 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84878x0.f247394d
                r4.append(r2)
                java.lang.String r2 = r4.toString()
                org.json.JSONObject r4 = new org.json.JSONObject
                r4.<init>()
                java.lang.String r5 = r0.f247273i
                java.lang.String r6 = "snapshotPath"
                r4.put(r6, r5)
                long r5 = r0.f247274j
                java.lang.String r7 = "snapshotLastModified"
                r4.put(r7, r5)
                long r5 = r0.f247275n
                java.lang.String r7 = "snapshotLength"
                r4.put(r7, r5)
                java.lang.String r5 = r0.f247276o
                java.lang.String r6 = "snapshotBaseConfig"
                r4.put(r6, r5)
                org.json.JSONObject r5 = r0.f247277p
                java.lang.String r6 = "snapshotMetaInfo"
                r4.put(r6, r5)
                java.lang.String r0 = r0.f247279r
                java.lang.String r5 = "snapshotNodeConfig"
                r4.put(r5, r0)
                java.lang.String r0 = r4.toString()
                r3.putString(r2, r0)
            L_0x02dc:
                fy3.a<rx3.b0> r0 = r1.f247352i
                r0.invoke()
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84852n0.C84857e.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.n0$f */
    public static final class C84858f implements C81274j2.C81275a {

        /* renamed from: a */
        public static final C84858f f247353a = new C84858f();

        /* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.n0$f$a */
        public static final class C84859a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ ICommLibReader f247354d;

            public C84859a(ICommLibReader iCommLibReader) {
                this.f247354d = iCommLibReader;
            }

            public final void run() {
                C84852n0 n0Var = C84852n0.f247339d;
                n0Var.mo117599q();
                ICommLibReader iCommLibReader = this.f247354d;
                n0Var.getClass();
                Log.m105924i("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "onCommLibUsingVersionUpdate, reader: " + iCommLibReader);
                String b = C84838e0.m104511b(iCommLibReader);
                if (b == null || b.length() == 0) {
                    Log.m105920e("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "onCommLibUsingVersionUpdate, reader is invalid");
                    return;
                }
                Set<ICommLibReader> set = C84852n0.f247342g;
                if (set.contains(iCommLibReader)) {
                    Log.m105924i("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "onCommLibUsingVersionUpdate, is creating now");
                    return;
                }
                set.add(iCommLibReader);
                C84872v0[] values = C84872v0.values();
                ArrayList arrayList = new ArrayList();
                for (C84872v0 v0Var : values) {
                    if (!v0Var.f247382e) {
                        arrayList.add(v0Var);
                    }
                }
                AtomicInteger atomicInteger = new AtomicInteger(arrayList.size());
                Log.m105924i("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "onCommLibUsingVersionUpdate, creatingCount: " + atomicInteger);
                C84872v0.C84873a aVar = C84872v0.f247376f;
                C84866t0 t0Var = new C84866t0(iCommLibReader, b, atomicInteger);
                C84872v0[] values2 = C84872v0.values();
                ArrayList arrayList2 = new ArrayList();
                for (C84872v0 v0Var2 : values2) {
                    if (!v0Var2.f247382e) {
                        arrayList2.add(v0Var2);
                    }
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    t0Var.invoke(it.next());
                }
            }
        }

        /* renamed from: o3 */
        public final void mo113563o3(ICommLibReader iCommLibReader) {
            C87412m.m108594g(iCommLibReader, "reader");
            if (C84840f0.f247297a.mo117571c()) {
                if (C84848l0.f247335a.mo117593a()) {
                    Log.m105924i("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "onUpdateUsingVersion, block");
                    return;
                }
                ((C119157j) C119157j.f356862d).mo183885p(new C84859a(iCommLibReader), "MicroMsg.WxaCommLibV8SnapshotServiceImpl");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0089, code lost:
        if (r2.mo117555e() != false) goto L_0x008b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x025c  */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo117594B(com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader r40, java.lang.String r41, com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84872v0 r42, boolean r43, fy3.C32224a<rx3.C13598b0> r44) {
        /*
            r39 = this;
            r1 = r39
            r10 = r40
            r0 = r42
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "createSnapshotIfNeed, wxaPkgPath: "
            r2.append(r3)
            r3 = r41
            r2.append(r3)
            java.lang.String r4 = ", category: "
            r2.append(r4)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = "MicroMsg.WxaCommLibV8SnapshotServiceImpl"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            gy3.f0 r9 = new gy3.f0
            r9.<init>()
            com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo r2 = r1.mo117597Q(r10, r0)
            if (r2 != 0) goto L_0x0060
            com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo r2 = new com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo
            r11 = r2
            r12 = 0
            java.lang.String r13 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84838e0.m104510a(r40)
            com.tencent.mm.plugin.appbrand.appcache.IPkgInfo r6 = r40.mo113379c()
            int r15 = r6.pkgVersion()
            r17 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 32737(0x7fe1, float:4.5874E-41)
            r30 = 0
            r14 = r41
            r16 = r42
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30)
        L_0x0060:
            r9.f27484d = r2
            boolean r0 = r2.mo117558g()
            java.lang.String r3 = "MicroMsg.WxaPkgV8SnapshotInfo"
            if (r0 == 0) goto L_0x006b
            goto L_0x008b
        L_0x006b:
            boolean r0 = r2.mo117557f()
            if (r0 == 0) goto L_0x0072
            goto L_0x008d
        L_0x0072:
            java.lang.String r0 = r2.f247273i
            int r0 = r0.length()
            if (r0 != 0) goto L_0x007c
            r0 = 1
            goto L_0x007d
        L_0x007c:
            r0 = 0
        L_0x007d:
            if (r0 == 0) goto L_0x0085
            java.lang.String r0 = "needCreate, snapshotPath is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            goto L_0x008b
        L_0x0085:
            boolean r0 = r2.mo117555e()
            if (r0 == 0) goto L_0x008d
        L_0x008b:
            r0 = 1
            goto L_0x008e
        L_0x008d:
            r0 = 0
        L_0x008e:
            if (r0 != 0) goto L_0x0099
            java.lang.String r0 = "createSnapshotIfNeed, not need create snapshot for this pkg"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            r44.invoke()
            return
        L_0x0099:
            com.tencent.mm.plugin.appbrand.v8_snapshot.k0 r0 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84847k0.f247331a
            T r2 = r9.f27484d
            com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo r2 = (com.tencent.p014mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo) r2
            r0.mo117590a(r2)
            java.lang.String r0 = "createSnapshotIfNeed, need create snapshot"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            boolean r11 = r10 instanceof com.tencent.p014mm.plugin.appbrand.v8_snapshot.NodeFakeCommLibReader
            java.lang.String r2 = "snapshotConfig"
            java.lang.String r8 = "MicroMsg.WxaCommLibV8SnapshotStats"
            java.lang.String r12 = "category"
            java.lang.String r13 = "snapshotInfo"
            if (r11 != 0) goto L_0x0265
            com.tencent.mm.plugin.appbrand.v8_snapshot.y r0 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84880y.f247398b
            T r14 = r9.f27484d
            com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo r14 = (com.tencent.p014mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo) r14
            r0.getClass()
            gy3.C87412m.m108594g(r14, r13)
            com.tencent.mm.plugin.appbrand.v8_snapshot.b0 r0 = r0.f247399a
            r0.getClass()
            com.tencent.mm.plugin.appbrand.v8_snapshot.f0 r0 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84840f0.f247297a
            com.tencent.mm.plugin.appbrand.v8_snapshot.v0 r15 = r14.f247272h
            boolean r15 = r0.mo117576h(r10, r15)
            java.lang.String r7 = "MicroMsg.WxaCommLibCreateSnapshotParamsCreator"
            if (r15 != 0) goto L_0x00df
            java.lang.String r0 = "canCreate, ban by config"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            r18 = r8
            r17 = r11
            r16 = r13
            goto L_0x018a
        L_0x00df:
            boolean r0 = r0.mo117570b()
            if (r0 != 0) goto L_0x00ee
            int r0 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84840f0.f247316t
            int r15 = r14.f247280s
            if (r0 <= r15) goto L_0x00ec
            goto L_0x00ee
        L_0x00ec:
            r0 = 0
            goto L_0x00ef
        L_0x00ee:
            r0 = 1
        L_0x00ef:
            if (r0 != 0) goto L_0x017b
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r6 = "canCreate, reach create snapshot exception count threshold, info: "
            r15.append(r6)
            r15.append(r14)
            java.lang.String r6 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r6)
            com.tencent.mm.plugin.appbrand.v8_snapshot.u0 r3 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84868u0.f247366a
            com.tencent.mm.plugin.appbrand.v8_snapshot.v0 r6 = r14.f247272h
            int r15 = r14.f247280s
            gy3.C87412m.m108594g(r6, r12)
            boolean r16 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84840f0.f247299c
            if (r16 == 0) goto L_0x0140
            r16 = r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r17 = r11
            java.lang.String r11 = "onSnapshotCreateBlock, commLibReader: "
            r13.append(r11)
            java.lang.String r11 = r3.mo117623t(r10)
            r13.append(r11)
            java.lang.String r11 = ", category, :"
            r13.append(r11)
            r13.append(r6)
            java.lang.String r11 = ", createExceptionCount: "
            r13.append(r11)
            r13.append(r15)
            java.lang.String r11 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r11)
            goto L_0x0144
        L_0x0140:
            r17 = r11
            r16 = r13
        L_0x0144:
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r13 = 1923(0x783, float:2.695E-42)
            r18 = r8
            r8 = 1
            r11.mo175911u(r13, r8)
            boolean r8 = r3.mo117605b()
            if (r8 != 0) goto L_0x0155
            goto L_0x0181
        L_0x0155:
            com.tencent.mm.autogen.mmdata.rpt.AndroidWAServiceLibSnapshotQualityStruct r8 = new com.tencent.mm.autogen.mmdata.rpt.AndroidWAServiceLibSnapshotQualityStruct
            r8.<init>()
            r11 = 2
            r8.f236322d = r11
            java.lang.String r3 = r3.mo117623t(r10)
            r8.mo112529v(r3)
            java.lang.String r3 = com.tencent.p014mm.appbrand.p942v8.C80658e.m98345b()
            r8.mo112530w(r3)
            java.lang.String r3 = java.lang.String.valueOf(r15)
            r8.mo112527t(r3)
            java.lang.String r3 = r6.f247381d
            r8.mo112528u(r3)
            r8.mo86054n()
            goto L_0x0181
        L_0x017b:
            r18 = r8
            r17 = r11
            r16 = r13
        L_0x0181:
            if (r0 != 0) goto L_0x0184
            goto L_0x018a
        L_0x0184:
            java.lang.String r0 = r10.Yk0(r2)
            if (r0 != 0) goto L_0x018d
        L_0x018a:
            r7 = 0
            goto L_0x025a
        L_0x018d:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x023c }
            r3.<init>(r0)     // Catch:{ Exception -> 0x023c }
            java.util.Iterator r0 = r3.keys()     // Catch:{ Exception -> 0x023c }
            java.lang.String r6 = "snapshotConfigObj.keys()"
            gy3.C87412m.m108593f(r0, r6)     // Catch:{ Exception -> 0x023c }
            y04.h r0 = y04.C112349m.m153278a(r0)     // Catch:{ Exception -> 0x023c }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x023c }
        L_0x01a4:
            boolean r6 = r0.hasNext()     // Catch:{ Exception -> 0x023c }
            r8 = 0
            if (r6 == 0) goto L_0x01c3
            java.lang.Object r6 = r0.next()     // Catch:{ Exception -> 0x023c }
            r11 = r6
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x023c }
            java.lang.String r13 = "it"
            gy3.C87412m.m108593f(r11, r13)     // Catch:{ Exception -> 0x023c }
            com.tencent.mm.plugin.appbrand.v8_snapshot.v0 r13 = r14.f247272h     // Catch:{ Exception -> 0x023c }
            java.lang.String r13 = r13.f247381d     // Catch:{ Exception -> 0x023c }
            r15 = 0
            boolean r11 = z04.C112551y.m153819s(r11, r13, r15)     // Catch:{ Exception -> 0x023c }
            if (r11 == 0) goto L_0x01a4
            goto L_0x01c4
        L_0x01c3:
            r6 = r8
        L_0x01c4:
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x023c }
            if (r6 == 0) goto L_0x023a
            int r0 = r40.mo113371a()     // Catch:{ Exception -> 0x023c }
            if (r0 == 0) goto L_0x01cf
            goto L_0x01ec
        L_0x01cf:
            com.tencent.mm.plugin.appbrand.v8_snapshot.f0 r0 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84840f0.f247297a     // Catch:{ Exception -> 0x023c }
            r0.getClass()     // Catch:{ Exception -> 0x023c }
            rc.i r11 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84840f0.f247303g     // Catch:{ Exception -> 0x023c }
            ny3.m<java.lang.Object>[] r13 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84840f0.f247298b     // Catch:{ Exception -> 0x023c }
            r14 = 3
            r13 = r13[r14]     // Catch:{ Exception -> 0x023c }
            java.lang.Object r0 = r11.mo124238b(r0, r13)     // Catch:{ Exception -> 0x023c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x023c }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x023c }
            if (r0 == 0) goto L_0x01ee
            java.lang.String r0 = "canCreate, enable not compress lib snapshot"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)     // Catch:{ Exception -> 0x023c }
        L_0x01ec:
            r3 = 1
            goto L_0x0245
        L_0x01ee:
            org.json.JSONArray r0 = r3.getJSONArray(r6)     // Catch:{ Exception -> 0x023c }
            r3 = 0
            java.lang.String r0 = r0.optString(r3, r8)     // Catch:{ Exception -> 0x023c }
            if (r0 == 0) goto L_0x0230
            java.io.InputStream r0 = r10.openRead(r0)     // Catch:{ Exception -> 0x023c }
            if (r0 == 0) goto L_0x0230
            java.nio.charset.Charset r3 = z04.C119027c.f356488a     // Catch:{ Exception -> 0x023c }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x023c }
            r6.<init>(r0, r3)     // Catch:{ Exception -> 0x023c }
            r0 = 8192(0x2000, float:1.14794E-41)
            boolean r3 = r6 instanceof java.io.BufferedReader     // Catch:{ Exception -> 0x023c }
            if (r3 == 0) goto L_0x020f
            java.io.BufferedReader r6 = (java.io.BufferedReader) r6     // Catch:{ Exception -> 0x023c }
            goto L_0x0215
        L_0x020f:
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ Exception -> 0x023c }
            r3.<init>(r6, r0)     // Catch:{ Exception -> 0x023c }
            r6 = r3
        L_0x0215:
            y04.h r0 = cy3.C86157m.m106666b(r6)     // Catch:{ all -> 0x0227 }
            int r0 = y04.C112354s.m153283f(r0)     // Catch:{ all -> 0x0227 }
            if (r0 > r14) goto L_0x0221
            r0 = 1
            goto L_0x0222
        L_0x0221:
            r0 = 0
        L_0x0222:
            cy3.C58003b.m67160a(r6, r8)     // Catch:{ Exception -> 0x023c }
            r8 = r0
            goto L_0x0231
        L_0x0227:
            r0 = move-exception
            r3 = r0
            throw r3     // Catch:{ all -> 0x022a }
        L_0x022a:
            r0 = move-exception
            r8 = r0
            cy3.C58003b.m67160a(r6, r3)     // Catch:{ Exception -> 0x023c }
            throw r8     // Catch:{ Exception -> 0x023c }
        L_0x0230:
            r8 = 1
        L_0x0231:
            if (r8 != 0) goto L_0x0238
            java.lang.String r0 = "canCreate, not compress lib"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r0)     // Catch:{ Exception -> 0x023c }
        L_0x0238:
            r3 = r8
            goto L_0x0245
        L_0x023a:
            r3 = 0
            goto L_0x0245
        L_0x023c:
            r0 = move-exception
            r3 = 0
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r8 = "canCreate, check need create failure"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r8, r6)
        L_0x0245:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "canCreate, needCreate: "
            r0.append(r6)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            r7 = r3
        L_0x025a:
            if (r7 != 0) goto L_0x026b
            java.lang.String r0 = "createSnapshotIfNeed, can not create snapshot for this pkg"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            r44.invoke()
            return
        L_0x0265:
            r18 = r8
            r17 = r11
            r16 = r13
        L_0x026b:
            T r0 = r9.f27484d
            com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo r0 = (com.tencent.p014mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo) r0
            r19 = r0
            int r0 = r0.f247280s
            r3 = 1
            int r34 = r0 + 1
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r35 = 0
            r36 = 0
            r37 = 4095(0xfff, float:5.738E-42)
            r38 = 0
            com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo r0 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo.m104498b(r19, r20, r21, r22, r23, r24, r25, r26, r28, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            r9.f27484d = r0
            r1.mo117595D(r0)
            com.tencent.mm.plugin.appbrand.v8_snapshot.u0 r0 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84868u0.f247366a
            T r3 = r9.f27484d
            com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo r3 = (com.tencent.p014mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo) r3
            com.tencent.mm.plugin.appbrand.v8_snapshot.v0 r3 = r3.f247272h
            gy3.C87412m.m108594g(r3, r12)
            com.tencent.mm.plugin.appbrand.v8_snapshot.f0 r5 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84840f0.f247297a
            r5.getClass()
            boolean r5 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84840f0.f247299c
            if (r5 == 0) goto L_0x02d3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "onCreateSnapshotStart, commLibReader: "
            r5.append(r6)
            java.lang.String r6 = r0.mo117623t(r10)
            r5.append(r6)
            r5.append(r4)
            r5.append(r3)
            java.lang.String r4 = r5.toString()
            r5 = r18
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
        L_0x02d3:
            boolean r4 = r0.mo117605b()
            if (r4 != 0) goto L_0x02df
            long r2 = android.os.SystemClock.uptimeMillis()
        L_0x02dd:
            r3 = r2
            goto L_0x0313
        L_0x02df:
            java.lang.String r2 = r10.Yk0(r2)
            if (r2 != 0) goto L_0x02e7
            java.lang.String r2 = ""
        L_0x02e7:
            com.tencent.mm.autogen.mmdata.rpt.AndroidWAServiceLibSnapshotQualityStruct r4 = new com.tencent.mm.autogen.mmdata.rpt.AndroidWAServiceLibSnapshotQualityStruct
            r4.<init>()
            r5 = 4
            r4.f236322d = r5
            java.lang.String r0 = r0.mo117623t(r10)
            r4.mo112529v(r0)
            java.lang.String r0 = com.tencent.p014mm.appbrand.p942v8.C80658e.m98345b()
            r4.mo112530w(r0)
            java.lang.String r0 = "UTF-8"
            java.lang.String r0 = p206nj.C117627q.m165909b(r2, r0)
            r4.mo112527t(r0)
            java.lang.String r0 = r3.f247381d
            r4.mo112528u(r0)
            r4.mo86054n()
            long r2 = android.os.SystemClock.uptimeMillis()
            goto L_0x02dd
        L_0x0313:
            com.tencent.mm.plugin.appbrand.v8_snapshot.n0$e r0 = new com.tencent.mm.plugin.appbrand.v8_snapshot.n0$e
            r2 = r0
            r5 = r40
            r6 = r9
            r7 = r43
            r8 = r17
            r11 = r9
            r9 = r44
            r2.<init>(r3, r5, r6, r7, r8, r9)
            if (r17 == 0) goto L_0x033b
            T r2 = r11.f27484d
            com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo r2 = (com.tencent.p014mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo) r2
            r3 = r16
            gy3.C87412m.m108594g(r2, r3)
            zt3.t r3 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.appbrand.v8_snapshot.i0 r4 = new com.tencent.mm.plugin.appbrand.v8_snapshot.i0
            r4.<init>(r10, r2, r0)
            zt3.j r3 = (zt3.C119157j) r3
            r3.mo183884o(r4)
            goto L_0x0352
        L_0x033b:
            r3 = r16
            T r2 = r11.f27484d
            com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo r2 = (com.tencent.p014mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo) r2
            gy3.C87412m.m108594g(r2, r3)
            zt3.t r3 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.appbrand.v8_snapshot.h0 r4 = new com.tencent.mm.plugin.appbrand.v8_snapshot.h0
            r5 = r43
            r4.<init>(r10, r2, r5, r0)
            zt3.j r3 = (zt3.C119157j) r3
            r3.mo183884o(r4)
        L_0x0352:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84852n0.mo117594B(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader, java.lang.String, com.tencent.mm.plugin.appbrand.v8_snapshot.v0, boolean, fy3.a):void");
    }

    /* renamed from: D */
    public final boolean mo117595D(WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo) {
        boolean z;
        C84840f0.f247297a.getClass();
        if (C84840f0.f247299c) {
            Log.m105924i("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "flushSnapshotInfo, snapshotInfo: " + wxaPkgV8SnapshotInfo);
        }
        C84878x0 O = mo117596O();
        if (O != null) {
            wxaPkgV8SnapshotInfo.getClass();
            C84875w0 w0Var = new C84875w0();
            w0Var.field_arch = wxaPkgV8SnapshotInfo.f247268d;
            w0Var.field_wxaPkgMd5 = wxaPkgV8SnapshotInfo.f247269e;
            w0Var.field_wxaPkgPath = wxaPkgV8SnapshotInfo.f247270f;
            w0Var.field_wxaPkgVersion = wxaPkgV8SnapshotInfo.f247271g;
            w0Var.field_snapshotCategory = wxaPkgV8SnapshotInfo.f247272h.f247381d;
            w0Var.field_snapshotPath = wxaPkgV8SnapshotInfo.f247273i;
            w0Var.field_snapshotLastModified = wxaPkgV8SnapshotInfo.f247274j;
            w0Var.field_snapshotLength = wxaPkgV8SnapshotInfo.f247275n;
            w0Var.field_snapshotBaseConfig = wxaPkgV8SnapshotInfo.f247276o;
            w0Var.field_snapshotMetaInfo = wxaPkgV8SnapshotInfo.f247277p.toString();
            w0Var.field_isNodeSnapshot = wxaPkgV8SnapshotInfo.f247278q;
            w0Var.field_snapshotNodeConfig = wxaPkgV8SnapshotInfo.f247279r;
            w0Var.field_producingSnapshotCount = wxaPkgV8SnapshotInfo.f247280s;
            w0Var.field_consumingSnapshotCount = wxaPkgV8SnapshotInfo.f247281t;
            w0Var.field_recoverCount = wxaPkgV8SnapshotInfo.f247282u;
            z = O.mo117633Yt(w0Var);
        } else {
            z = false;
        }
        if (!z) {
            Log.m105920e("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "flushSnapshotInfo, insertOrReplace failure");
        }
        return z;
    }

    /* renamed from: Fr */
    public boolean mo117582Fr(String str) {
        C87412m.m108594g(str, "wxaPkgPath");
        C84878x0 O = mo117596O();
        if (O != null) {
            Log.m105924i("MicroMsg.WxaPkgV8SnapshotInfoStorage", "selectByWxaPkgPathAllArch, wxaPkgPath: " + str);
            return mo117598d(O.mo117631Lo(O.rawQuery("SELECT * FROM WxaPkgV8SnapshotInfoV3 WHERE wxaPkgPath = ?", str)), C84850m0.f247337d);
        }
        Log.m105920e("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "deleteSnapshotInfoAllCategory, storage is null");
        return false;
    }

    public boolean Lf0(int i) {
        C84878x0 O = mo117596O();
        if (O != null) {
            List<C84875w0> Ow = O.mo117632Ow(i);
            ArrayList arrayList = new ArrayList();
            for (T next : Ow) {
                if (((C84875w0) next).field_wxaPkgVersion > 0) {
                    arrayList.add(next);
                }
            }
            return mo117598d(arrayList, C84850m0.f247337d);
        }
        Log.m105920e("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "deleteAllSnapshotDirBelowVersion, storage is null");
        return false;
    }

    /* renamed from: O */
    public final C84878x0 mo117596O() {
        int i = C84878x0.f247394d;
        return (C84878x0) C81161g2.Bx0(C84878x0.class);
    }

    /* renamed from: Q */
    public final WxaPkgV8SnapshotInfo mo117597Q(ICommLibReader iCommLibReader, C84872v0 v0Var) {
        C84875w0 bD;
        String b = C84838e0.m104511b(iCommLibReader);
        Log.m105924i("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "querySnapshotInfo, wxaPkgPath: " + b);
        if (C84848l0.f247335a.mo117593a()) {
            Log.m105924i("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "querySnapshotInfo, block");
            return null;
        }
        if (b == null || b.length() == 0) {
            return null;
        }
        C84878x0 O = mo117596O();
        if (O == null || (bD = O.mo117634bD(b, v0Var)) == null) {
            Log.m105924i("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "querySnapshotInfo, dao not exist");
            return null;
        }
        WxaPkgV8SnapshotInfo a = WxaPkgV8SnapshotInfo.f247265v.mo117562a(bD);
        if (a == null) {
            Log.m105920e("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "querySnapshotInfo, create snapshotInfo failure");
            return null;
        }
        if ((a.f247271g == iCommLibReader.mo113379c().pkgVersion() && C87412m.m108589b(a.f247270f, C84838e0.m104511b(iCommLibReader))) ? C87412m.m108589b("/assets/wxa_library", a.f247270f) ? true : C87412m.m108589b(a.f247269e, C84838e0.m104510a(iCommLibReader)) : false) {
            return a;
        }
        Log.m105924i("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "querySnapshotInfo, wxaPkgMd5 change, do deleteSnapshotInfo");
        C84878x0 O2 = mo117596O();
        if (O2 != null) {
            Log.m105924i("MicroMsg.WxaPkgV8SnapshotInfoStorage", "selectByWxaPkgPathAllArch, wxaPkgPath: " + b + ", category: " + v0Var);
            mo117598d(O2.mo117631Lo(O2.rawQuery("SELECT * FROM WxaPkgV8SnapshotInfoV3 WHERE wxaPkgPath = ? AND snapshotCategory = ?", b, v0Var.f247381d)), new C84861p0(v0Var));
        } else {
            Log.m105920e("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "deleteSnapshotInfo, storage is null");
        }
        return null;
    }

    public void U00(WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo) {
        C87412m.m108594g(wxaPkgV8SnapshotInfo, "snapshotInfo");
        C84853a aVar = C84853a.f247343d;
        ((C119157j) C119157j.f356862d).mo183885p(new C84862q0(wxaPkgV8SnapshotInfo, aVar), "MicroMsg.WxaCommLibV8SnapshotServiceImpl");
    }

    /* renamed from: d */
    public final boolean mo117598d(List<C84875w0> list, C32226l<? super String, Boolean> lVar) {
        if (list.isEmpty()) {
            Log.m105924i("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "batchDeleteSnapshotInfo, daoList is empty");
            return false;
        }
        boolean z = true;
        for (C84875w0 a : list) {
            WxaPkgV8SnapshotInfo a2 = WxaPkgV8SnapshotInfo.f247265v.mo117562a(a);
            if (a2 == null) {
                Log.m105920e("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "batchDeleteSnapshotInfo, create snapshotInfo failure");
            } else {
                C84840f0.f247297a.getClass();
                if (C84840f0.f247299c) {
                    Log.m105924i("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "batchDeleteSnapshotInfo, snapshotInfo: " + a2);
                }
                boolean a3 = C84847k0.f247331a.mo117590a(a2);
                Log.m105924i("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "batchDeleteSnapshotInfo, snapshotDeleted: " + a3);
                if (a3 && lVar.invoke(a2.f247270f).booleanValue()) {
                }
            }
            z = false;
        }
        Log.m105924i("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "batchDeleteSnapshotInfo, allDeleted: " + z);
        return z;
    }

    /* renamed from: hf */
    public void mo117585hf(WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo) {
        C87412m.m108594g(wxaPkgV8SnapshotInfo, "snapshotInfo");
        C84855c cVar = C84855c.f247345d;
        ((C119157j) C119157j.f356862d).mo183885p(new C84862q0(wxaPkgV8SnapshotInfo, cVar), "MicroMsg.WxaCommLibV8SnapshotServiceImpl");
    }

    public void lv0(WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo) {
        C87412m.m108594g(wxaPkgV8SnapshotInfo, "snapshotInfo");
        C84854b bVar = C84854b.f247344d;
        ((C119157j) C119157j.f356862d).mo183885p(new C84862q0(wxaPkgV8SnapshotInfo, bVar), "MicroMsg.WxaCommLibV8SnapshotServiceImpl");
    }

    /* renamed from: mZ */
    public WxaPkgV8SnapshotInfo mo117587mZ() {
        C84840f0.f247297a.getClass();
        if (!C84840f0.f247299c) {
            return f247339d.mo117597Q(new NodeFakeCommLibReader((IPkgInfo) null, 1, (C8480h) null), C84872v0.NODE);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        WxaPkgV8SnapshotInfo Q = f247339d.mo117597Q(new NodeFakeCommLibReader((IPkgInfo) null, 1, (C8480h) null), C84872v0.NODE);
        Log.m105924i("MicroMsg.WxaCommLibV8SnapshotCommons", "clientQueryNodeOnlySnapshotInfo" + " cost " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        return Q;
    }

    /* renamed from: nX */
    public WxaPkgV8SnapshotInfo mo117588nX(ICommLibReader iCommLibReader, C84872v0 v0Var) {
        C87412m.m108594g(iCommLibReader, "reader");
        C87412m.m108594g(v0Var, "category");
        C84840f0.f247297a.getClass();
        if (!C84840f0.f247299c) {
            C84852n0 n0Var = f247339d;
            WxaPkgV8SnapshotInfo Q = n0Var.mo117597Q(iCommLibReader, v0Var);
            return Q == null ? n0Var.mo117587mZ() : Q;
        }
        SystemClock.elapsedRealtime();
        C84852n0 n0Var2 = f247339d;
        WxaPkgV8SnapshotInfo Q2 = n0Var2.mo117597Q(iCommLibReader, v0Var);
        return Q2 == null ? n0Var2.mo117587mZ() : Q2;
    }

    /* renamed from: q */
    public final void mo117599q() {
        NodeFakeCommLibReader nodeFakeCommLibReader = new NodeFakeCommLibReader((IPkgInfo) null, 1, (C8480h) null);
        C84840f0 f0Var = C84840f0.f247297a;
        C84872v0 v0Var = C84872v0.NODE;
        if (f0Var.mo117577i(nodeFakeCommLibReader, v0Var)) {
            if (!f247341f.compareAndSet(false, true)) {
                Log.m105924i("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "createNodeOnlySnapshotIfNeed, is creating now");
                return;
            }
            String b = C84838e0.m104511b(nodeFakeCommLibReader);
            C87412m.m108591d(b);
            mo117594B(nodeFakeCommLibReader, b, v0Var, true, C84856d.f247346d);
        }
    }

    /* renamed from: zk */
    public boolean mo117589zk(C86009m1 m1Var) {
        C87412m.m108594g(m1Var, "file");
        C84847k0 k0Var = C84847k0.f247331a;
        k0Var.getClass();
        C86009m1 c = k0Var.mo117592c();
        if (c == null) {
            Log.m105920e("MicroMsg.WxaCommLibV8SnapshotManager", "isSnapshot, snapshotParentDir is null");
            return false;
        }
        String i = m1Var.mo119971i();
        C87412m.m108593f(i, "file.absolutePath");
        String i2 = c.mo119971i();
        C87412m.m108593f(i2, "snapshotParentDir.absolutePath");
        C84840f0.f247297a.getClass();
        if (C84840f0.f247299c) {
            Log.m105924i("MicroMsg.WxaCommLibV8SnapshotManager", "isSnapshot, filePath: " + i + ", snapshotParentDirPath: " + i2);
        }
        return C112550d0.m153801u(i, i2, false);
    }
}
