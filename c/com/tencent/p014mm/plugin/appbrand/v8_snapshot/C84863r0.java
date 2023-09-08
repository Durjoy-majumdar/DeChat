package com.tencent.p014mm.plugin.appbrand.v8_snapshot;

import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.r0 */
public final class C84863r0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ICommLibReader f247359d;

    /* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.r0$a */
    public static final class C84864a extends C87413o implements C32226l<String, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ WxaPkgV8SnapshotInfo f247360d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C84864a(WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo) {
            super(1);
            this.f247360d = wxaPkgV8SnapshotInfo;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, "wxaPkgPath");
            C84878x0 O = C84852n0.f247339d.mo117596O();
            return Boolean.valueOf((O != null ? O.mo117635qq(str, this.f247360d.f247272h) : null) != null);
        }
    }

    public C84863r0(ICommLibReader iCommLibReader) {
        this.f247359d = iCommLibReader;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0022 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            java.util.Set<com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader> r0 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84852n0.f247342g
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r1 = r9.f247359d
            r0.remove(r1)
            com.tencent.mm.plugin.appbrand.v8_snapshot.n0 r0 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84852n0.f247339d
            com.tencent.mm.plugin.appbrand.v8_snapshot.x0 r0 = r0.mo117596O()
            if (r0 == 0) goto L_0x0017
            r1 = 2147483647(0x7fffffff, float:NaN)
            java.util.List r0 = r0.mo117632Ow(r1)
            goto L_0x0019
        L_0x0017:
            sx3.f0 r0 = sx3.C64186f0.f181907d
        L_0x0019:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0022:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x008c
            java.lang.Object r2 = r0.next()
            com.tencent.mm.plugin.appbrand.v8_snapshot.w0 r2 = (com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84875w0) r2
            com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo$c r3 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo.f247265v
            com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo r3 = r3.mo117562a(r2)
            r4 = 0
            if (r3 != 0) goto L_0x0039
        L_0x0037:
            r3 = r4
            goto L_0x0086
        L_0x0039:
            java.lang.String r5 = r3.f247270f
            android.net.Uri r5 = com.tencent.p014mm.vfs.C116299g2.m163858n(r5)
            java.lang.String r6 = r5.getPath()
            r7 = 0
            if (r6 == 0) goto L_0x0060
            java.lang.String r6 = com.tencent.p014mm.vfs.C116299g2.m163855k(r6, r7, r7)
            java.lang.String r8 = r5.getPath()
            boolean r8 = r8.equals(r6)
            if (r8 != 0) goto L_0x0060
            android.net.Uri$Builder r5 = r5.buildUpon()
            android.net.Uri$Builder r5 = r5.path(r6)
            android.net.Uri r5 = r5.build()
        L_0x0060:
            com.tencent.mm.vfs.f0 r6 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r5 = r6.mo177799l(r5, r4)
            boolean r6 = r5.mo177810a()
            if (r6 != 0) goto L_0x006d
            goto L_0x0075
        L_0x006d:
            com.tencent.mm.vfs.FileSystem$c r6 = r5.f348991a
            java.lang.String r5 = r5.f348992b
            boolean r7 = r6.mo119948x(r5)
        L_0x0075:
            if (r7 != 0) goto L_0x0086
            com.tencent.mm.plugin.appbrand.v8_snapshot.n0 r5 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84852n0.f247339d
            java.util.List r2 = sx3.C26236u.m33719b(r2)
            com.tencent.mm.plugin.appbrand.v8_snapshot.r0$a r6 = new com.tencent.mm.plugin.appbrand.v8_snapshot.r0$a
            r6.<init>(r3)
            r5.mo117598d(r2, r6)
            goto L_0x0037
        L_0x0086:
            if (r3 == 0) goto L_0x0022
            r1.add(r3)
            goto L_0x0022
        L_0x008c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "done#onCommLibUsingVersionUpdate, existSnapshotCount: "
            r0.append(r2)
            int r2 = r1.size()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MicroMsg.WxaCommLibV8SnapshotServiceImpl"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            com.tencent.mm.plugin.appbrand.v8_snapshot.f0 r0 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84840f0.f247297a
            r0.getClass()
            boolean r0 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84840f0.f247299c
            if (r0 == 0) goto L_0x00d4
            java.util.Iterator r0 = r1.iterator()
        L_0x00b3:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00d4
            java.lang.Object r1 = r0.next()
            com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo r1 = (com.tencent.p014mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo) r1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "done#onCommLibUsingVersionUpdate, existSnapshot: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            goto L_0x00b3
        L_0x00d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84863r0.run():void");
    }
}
