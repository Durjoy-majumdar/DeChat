package wo0;

import android.os.Build;
import com.tencent.p014mm.plugin.appbrand.appcache.C81274j2;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.launching.C83508v3;
import com.tencent.p014mm.plugin.appbrand.permission.appidABTest.AppRuntimeAppidABTestPermissionBundle;
import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySession;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import java.util.List;
import junit.framework.Assert;
import ob0.C47350c;
import ob0.C89132b;
import p156gj.C87203t;
import te3.l45;
import te3.m45;
import te3.n45;

/* renamed from: wo0.g */
public class C91048g extends C89132b<n45> {

    /* renamed from: i */
    public final String f261196i;

    /* renamed from: j */
    public final int f261197j;

    /* renamed from: n */
    public final QualitySession f261198n;

    /* renamed from: o */
    public volatile boolean f261199o = false;

    /* renamed from: p */
    public volatile HashMap<String, AppRuntimeAppidABTestPermissionBundle> f261200p = new HashMap<>();

    public C91048g(String str, int i, List<C91051k> list, boolean z, QualitySession qualitySession, C83508v3 v3Var) {
        this.f261196i = str;
        this.f261197j = i;
        this.f261198n = qualitySession;
        if (BuildInfo.DEBUG && Util.isNullOrNil((List) list)) {
            Assert.fail("appIdList can not be Empty");
        }
        m45 m45 = new m45();
        for (C91051k next : list) {
            l45 l45 = new l45();
            l45.f137177d = next.f261208a;
            l45.f137178e = next.f261209b;
            l45.f137179f = next.f261210c;
            m45.f259682d.add(l45);
        }
        m45.f259683e = C87203t.m108275k();
        m45.f259684f = Build.BRAND;
        m45.f259685g = Build.MANUFACTURER;
        String str2 = Build.VERSION.RELEASE;
        m45.f259686h = str2;
        m45.f259689n = str2;
        m45.f259690o = Build.VERSION.INCREMENTAL;
        m45.f259691p = Build.DISPLAY;
        ICommLibReader a = C81274j2.m99632a();
        if (a != null) {
            m45.f259687i = a.mo113377i();
            m45.f259688j = a.mo113371a();
        }
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.mo72404b(5124);
        bVar.mo72409g("/cgi-bin/mmgame-bin/getwxagameabtestinfo");
        bVar.mo72405c(m45);
        bVar.mo72407e(new n45());
        mo123453j(bVar.mo72403a());
        Object[] objArr = new Object[5];
        objArr[0] = str;
        objArr[1] = Integer.valueOf(i);
        StringBuilder sb = new StringBuilder("[");
        for (C91051k next2 : list) {
            sb.append("{");
            sb.append("appId:");
            sb.append(next2.f261208a);
            sb.append(", appType:");
            sb.append(next2.f261209b);
            sb.append(", versionType:");
            sb.append(next2.f261210c);
            sb.append("}");
        }
        sb.append("]");
        objArr[2] = sb.toString();
        objArr[3] = Boolean.valueOf(z);
        objArr[4] = this.f261198n.f245832d;
        Log.m105925i("MicroMsg.AppBrand.CgiWxaAppidABTestInfo", "<init> appId:%s, versionType:%d, appIdList:%s, sync:%b, instanceId:%s", objArr);
    }

    /* renamed from: k */
    public static String m114214k(String str, int i, int i2) {
        String str2 = i == 1 ? "_weApp" : i == 2 ? "_plugin" : "";
        return str + str2 + i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006e, code lost:
        r9 = r3.f138958d;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10094h(int r18, int r19, java.lang.String r20, te3.C49335eu3 r21, ob0.C117747y r22) {
        /*
            r17 = this;
            r1 = r17
            r0 = r21
            te3.n45 r0 = (te3.n45) r0
            if (r0 != 0) goto L_0x000b
            java.lang.String r2 = "NULL"
            goto L_0x0029
        L_0x000b:
            java.util.LinkedList<te3.o45> r2 = r0.f138407d
            if (r2 != 0) goto L_0x0012
            java.lang.String r2 = "NULL_API_INFO_LIST"
            goto L_0x0029
        L_0x0012:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "API_INFO_LIST SIZE:"
            r2.append(r3)
            java.util.LinkedList<te3.o45> r3 = r0.f138407d
            int r3 = r3.size()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
        L_0x0029:
            r3 = 5
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r18)
            r5 = 0
            r3[r5] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r19)
            r6 = 1
            r3[r6] = r4
            r4 = 2
            r3[r4] = r20
            boolean r7 = r1.f261199o
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r8 = 3
            r3[r8] = r7
            r7 = 4
            r3[r7] = r2
            java.lang.String r2 = "MicroMsg.AppBrand.CgiWxaAppidABTestInfo"
            java.lang.String r9 = "zbql:onCgiBack, errType %d, errCode %d, errMsg %s, req[sync %B], resp[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r9, r3)
            if (r18 != 0) goto L_0x021e
            if (r19 != 0) goto L_0x021e
            if (r0 == 0) goto L_0x021e
            java.util.LinkedList<te3.o45> r0 = r0.f138407d
            if (r0 == 0) goto L_0x021e
            java.util.Iterator r0 = r0.iterator()
        L_0x005f:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0132
            java.lang.Object r3 = r0.next()
            te3.o45 r3 = (te3.o45) r3
            if (r3 != 0) goto L_0x006e
            goto L_0x007e
        L_0x006e:
            te3.l45 r9 = r3.f138958d
            if (r9 == 0) goto L_0x007e
            java.lang.String r9 = r9.f137177d
            if (r9 != 0) goto L_0x0077
            goto L_0x007e
        L_0x0077:
            pe3.b r9 = r3.f138959e
            if (r9 != 0) goto L_0x007c
            goto L_0x007e
        L_0x007c:
            r9 = 1
            goto L_0x007f
        L_0x007e:
            r9 = 0
        L_0x007f:
            if (r9 != 0) goto L_0x0089
            java.lang.String r0 = "zbql: error! response is invalid"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            goto L_0x0132
        L_0x0089:
            te3.l45 r9 = r3.f138958d
            java.lang.String r9 = r9.f137177d
            com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()
            com.tencent.mm.plugin.appbrand.launching.a3 r10 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238481t
            te3.l45 r11 = r3.f138958d
            int r12 = r11.f137178e
            int r11 = r11.f137179f
            pe3.b r13 = r3.f138959e
            byte[] r13 = r13.mo123703f()
            r10.getClass()
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            java.lang.String r15 = "MicroMsg.LaunchWxaAppidABTestInfoStorage"
            if (r14 != 0) goto L_0x00f4
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r13)
            if (r14 == 0) goto L_0x00b0
            goto L_0x00f4
        L_0x00b0:
            java.lang.Object[] r14 = new java.lang.Object[r8]
            r14[r5] = r9
            java.lang.Integer r16 = java.lang.Integer.valueOf(r12)
            r14[r6] = r16
            java.lang.Integer r16 = java.lang.Integer.valueOf(r11)
            r14[r4] = r16
            java.lang.String r8 = "insertOrUpdate, appId:%s , appType :%d, versionType :%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r8, r14)
            com.tencent.mm.plugin.appbrand.launching.z2 r8 = new com.tencent.mm.plugin.appbrand.launching.z2
            r8.<init>()
            r8.field_appId = r9
            r8.field_appType = r12
            r8.field_versionType = r11
            r8.field_permissionBytes = r13
            java.lang.String[] r11 = new java.lang.String[r5]
            boolean r11 = r10.get(r8, r11)
            r8.field_permissionBytes = r13
            if (r11 == 0) goto L_0x00e3
            java.lang.String[] r11 = new java.lang.String[r5]
            boolean r8 = r10.update(r8, (java.lang.String[]) r11)
            goto L_0x00e7
        L_0x00e3:
            boolean r8 = r10.insert(r8)
        L_0x00e7:
            if (r8 == 0) goto L_0x00fe
            java.lang.Object[] r8 = new java.lang.Object[r6]
            r8[r5] = r9
            java.lang.String r10 = "setWxaAppidABTestInfo appId:%s ok"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r10, r8)
            goto L_0x00fe
        L_0x00f4:
            java.lang.Object[] r8 = new java.lang.Object[r6]
            r8[r5] = r9
            java.lang.String r10 = "setWxaAppidABTestInfo,invalid input %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r10, r8)
        L_0x00fe:
            java.util.HashMap<java.lang.String, com.tencent.mm.plugin.appbrand.permission.appidABTest.AppRuntimeAppidABTestPermissionBundle> r8 = r1.f261200p
            te3.l45 r10 = r3.f138958d
            int r11 = r10.f137178e
            int r10 = r10.f137179f
            java.lang.String r10 = m114214k(r9, r11, r10)
            com.tencent.mm.plugin.appbrand.permission.appidABTest.AppRuntimeAppidABTestPermissionBundle r11 = new com.tencent.mm.plugin.appbrand.permission.appidABTest.AppRuntimeAppidABTestPermissionBundle
            pe3.b r12 = r3.f138959e
            byte[] r12 = r12.mo123703f()
            r11.<init>((byte[]) r12)
            r8.put(r10, r11)
            java.lang.Object[] r8 = new java.lang.Object[r4]
            r8[r5] = r9
            pe3.b r3 = r3.f138959e
            byte[] r3 = r3.mo123703f()
            int r3 = r3.length
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r8[r6] = r3
            java.lang.String r3 = "zbql:wxaAppidABTest AppId:%s, size:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r8)
            r8 = 3
            goto L_0x005f
        L_0x0132:
            boolean r0 = r1.f261199o
            if (r0 != 0) goto L_0x021e
            java.lang.String r2 = r1.f261196i
            int r3 = r1.f261197j
            com.tencent.mm.plugin.appbrand.report.quality.QualitySession r0 = r1.f261198n
            java.lang.String r8 = r0.f245832d
            java.util.HashMap<java.lang.String, com.tencent.mm.plugin.appbrand.permission.appidABTest.AppRuntimeAppidABTestPermissionBundle> r9 = r1.f261200p
            java.lang.String r10 = "notifyAppidABTestPermissionInfoUpdate [update remote] appId[%s], type[%d], instanceId[%s], appidABTestMapSize:[%d]"
            com.tencent.mm.plugin.appbrand.launching.AppLaunchPrepareProcess r0 = com.tencent.p014mm.plugin.appbrand.launching.AppLaunchPrepareProcess.m102197i(r8)
            java.lang.String r11 = "MicroMsg.AppBrand.ILaunchWxaAppInfoNotify.INSTANCE[permission]"
            if (r0 == 0) goto L_0x01d3
            java.lang.Object[] r12 = new java.lang.Object[r7]
            r12[r5] = r2
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)
            r12[r6] = r13
            r12[r4] = r8
            if (r9 != 0) goto L_0x015a
            r13 = 0
            goto L_0x015e
        L_0x015a:
            int r13 = r9.size()
        L_0x015e:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r14 = 3
            r12[r14] = r13
            java.lang.String r13 = "notifyAppidABTestPermissionInfoUpdate [update deferred process] appId[%s], type[%d], instanceId[%s], appidABTestMapSize:[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r13, r12)
            op3.c<com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC, com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorAction, com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle> r12 = r0.f243260j
            java.lang.String r13 = "MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]"
            if (r12 == 0) goto L_0x01b1
            op3.c<com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC, com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorAction, com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle> r12 = r0.f243260j
            java.lang.Object r12 = r12.mo182596a(r5)
            com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC r12 = (com.tencent.p014mm.plugin.appbrand.config.AppBrandSysConfigWC) r12
            if (r12 != 0) goto L_0x0184
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r5] = r2
            java.lang.String r12 = "notifyAppidABTestPermissionInfoUpdate null config with appId(%s)"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r13, r12, r0)
            goto L_0x01d3
        L_0x0184:
            java.lang.Object[] r14 = new java.lang.Object[r7]
            r14[r5] = r2
            java.lang.Integer r15 = java.lang.Integer.valueOf(r3)
            r14[r6] = r15
            r14[r4] = r8
            if (r9 != 0) goto L_0x0194
            r15 = 0
            goto L_0x0198
        L_0x0194:
            int r15 = r9.size()
        L_0x0198:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r16 = 3
            r14[r16] = r15
            java.lang.String r15 = "[ILaunchWxaAppInfoNotify][notifyAppidABTestPermissionInfoUpdate] fillLaunchConfig to pending launchResult appId[%s] type[%d] instanceId[%s] info[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r15, r14)
            r12.f234858C = r9
            r13 = 0
            com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle r14 = r0.f243237K
            op3.c r12 = op3.C117882j.m166285d(r12, r13, r14)
            r0.f243260j = r12
            goto L_0x01d3
        L_0x01b1:
            java.lang.Object[] r12 = new java.lang.Object[r7]
            r12[r5] = r2
            java.lang.Integer r14 = java.lang.Integer.valueOf(r3)
            r12[r6] = r14
            r12[r4] = r8
            if (r9 != 0) goto L_0x01c1
            r14 = 0
            goto L_0x01c5
        L_0x01c1:
            int r14 = r9.size()
        L_0x01c5:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r15 = 3
            r12[r15] = r14
            java.lang.String r14 = "[ILaunchWxaAppInfoNotify][notifyAppidABTestPermissionInfoUpdate] set mMaybeUpdatedAppidABTestPermissionMap appId[%s] type[%d] instanceId[%s] info[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r14, r12)
            r0.f243252Y = r9
        L_0x01d3:
            java.lang.Object[] r0 = new java.lang.Object[r7]     // Catch:{ all -> 0x0200 }
            r0[r5] = r2     // Catch:{ all -> 0x0200 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0200 }
            r0[r6] = r12     // Catch:{ all -> 0x0200 }
            r0[r4] = r8     // Catch:{ all -> 0x0200 }
            if (r9 != 0) goto L_0x01e3
            r12 = 0
            goto L_0x01e7
        L_0x01e3:
            int r12 = r9.size()     // Catch:{ all -> 0x0200 }
        L_0x01e7:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0200 }
            r13 = 3
            r0[r13] = r12     // Catch:{ all -> 0x0200 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r10, r0)     // Catch:{ all -> 0x0200 }
            com.tencent.mm.plugin.appbrand.launching.ILaunchWxaAppInfoNotify$AppidABTestIpcWrapper r0 = new com.tencent.mm.plugin.appbrand.launching.ILaunchWxaAppInfoNotify$AppidABTestIpcWrapper     // Catch:{ all -> 0x0200 }
            r0.<init>()     // Catch:{ all -> 0x0200 }
            r0.f243338d = r2     // Catch:{ all -> 0x0200 }
            r0.f243339e = r3     // Catch:{ all -> 0x0200 }
            r0.f243340f = r9     // Catch:{ all -> 0x0200 }
            com.tencent.p014mm.plugin.appbrand.task.ipc.AppBrandLaunchWxaAppInfoNotifyMessage.C84298b.m103919a(r2, r0)     // Catch:{ all -> 0x0200 }
            goto L_0x021e
        L_0x0200:
            r0 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r5] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r7[r6] = r2
            r7[r4] = r8
            if (r9 != 0) goto L_0x0210
            goto L_0x0214
        L_0x0210:
            int r5 = r9.size()
        L_0x0214:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r3 = 3
            r7[r3] = r2
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r0, r10, r7)
        L_0x021e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wo0.C91048g.mo10094h(int, int, java.lang.String, te3.eu3, ob0.y):void");
    }
}
