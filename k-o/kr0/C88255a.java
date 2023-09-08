package kr0;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.appcache.C81386x1;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40480g;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83185u;
import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84185b;
import com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84835c0;
import com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84840f0;
import com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84868u0;
import com.tencent.p014mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.stubs.logger.Log;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import java.net.URL;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import js0.C88016e;
import p1044ub.C90636f;
import p284zb.C91635f;
import p284zb.C91653q;
import u24.C90599h;

/* renamed from: kr0.a */
public class C88255a extends C91653q<C88267e> {

    /* renamed from: i */
    public C88256b f255070i;

    public C88255a(C88267e eVar, C83185u uVar) {
        super(eVar, uVar);
        this.f255070i = (C88256b) eVar.f262593H;
    }

    /* JADX WARNING: type inference failed for: r12v1 */
    /* JADX WARNING: type inference failed for: r12v2 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r12v0, types: [boolean, int] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0283  */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo122585A(p1044ub.C90636f.C90637a r25, boolean r26, long r27, long r29, java.lang.Object r31) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r11 = r27
            r13 = r29
            r10 = r31
            java.lang.String r15 = r1.f260398i
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            SERVICE r3 = r0.f262488d
            kr0.e r3 = (kr0.C88267e) r3
            java.lang.String r3 = r3.getAppId()
            r16 = 0
            r2[r16] = r3
            r9 = 1
            r2[r9] = r15
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r26)
            r4 = 2
            r2[r4] = r3
            java.lang.String r7 = "MicroMsg.AppBrandJSContextInterfaceWC"
            java.lang.String r3 = "reportBootstrapScriptEvaluateResult appId[%s] name[%s] succeed[%b]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r3, r2)
            java.lang.String r2 = "WASubContext.js"
            boolean r2 = r2.equals(r15)
            r17 = 0
            if (r2 == 0) goto L_0x0156
            SERVICE r2 = r0.f262488d
            kr0.e r2 = (kr0.C88267e) r2
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r2 = r2.getRuntime()
            if (r2 == 0) goto L_0x006c
            if (r26 == 0) goto L_0x0057
            SERVICE r2 = r0.f262488d
            kr0.e r2 = (kr0.C88267e) r2
            java.lang.String r2 = r2.getAppId()
            uo0.a r3 = com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepInjectJSWASubContext
            java.lang.String r4 = "WASubContext.js"
            r5 = r27
            r7 = r29
            com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.m102129f(r2, r3, r4, r5, r7)
            goto L_0x006c
        L_0x0057:
            SERVICE r2 = r0.f262488d
            kr0.e r2 = (kr0.C88267e) r2
            java.lang.String r2 = r2.getAppId()
            uo0.a r3 = com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepInjectJSWASubContext
            java.lang.String r4 = ""
            java.lang.String r5 = "WASubContext.js"
            r6 = r27
            r8 = r29
            com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.m102127d(r2, r3, r4, r5, r6, r8)
        L_0x006c:
            r2 = 0
            if (r26 == 0) goto L_0x00e2
            SERVICE r4 = r0.f262488d
            kr0.e r4 = (kr0.C88267e) r4
            boolean r4 = r4.mo114335b0()
            if (r4 != 0) goto L_0x0084
            SERVICE r4 = r0.f262488d
            kr0.e r4 = (kr0.C88267e) r4
            boolean r4 = r4.isRunning()
            if (r4 == 0) goto L_0x00e2
        L_0x0084:
            boolean r4 = r10 instanceof com.tencent.p014mm.appbrand.p942v8.C80669j.C80676g
            if (r4 == 0) goto L_0x008c
            r17 = r10
            com.tencent.mm.appbrand.v8.j$g r17 = (com.tencent.p014mm.appbrand.p942v8.C80669j.C80676g) r17
        L_0x008c:
            r4 = r17
            com.tencent.mm.plugin.appbrand.report.quality.e r5 = com.tencent.p014mm.plugin.appbrand.report.quality.C84185b.f245912a
            SERVICE r6 = r0.f262488d
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualityLibInjectStruct r5 = r5.mo116888g(r6)
            r5.mo112531s(r15)
            long r6 = r1.f260400k
            r5.f236930p = r6
            if (r4 == 0) goto L_0x00ac
            int r6 = r4.codeCacheStatus
            if (r6 < 0) goto L_0x00ac
            int[] r7 = com.tencent.p014mm.plugin.appbrand.jsruntime.C83187w.f242988l0
            r8 = 7
            if (r6 >= r8) goto L_0x00ac
            r6 = r7[r6]
            long r6 = (long) r6
            goto L_0x00ae
        L_0x00ac:
            r6 = 4
        L_0x00ae:
            r5.f236932r = r6
            r6 = 1
            r5.f236933s = r6
            if (r4 == 0) goto L_0x00b9
            long r6 = r4.flatJSCompileCost
            goto L_0x00ba
        L_0x00b9:
            r6 = r2
        L_0x00ba:
            r5.f236934t = r6
            if (r4 == 0) goto L_0x00c2
            int r4 = r4.f236060c
            long r6 = (long) r4
            goto L_0x00c3
        L_0x00c2:
            r6 = r2
        L_0x00c3:
            r5.f236936v = r6
            r5.f236925k = r11
            java.lang.String r4 = "StartTimeStampMs"
            r5.mo86048e(r4, r11)
            r5.f236926l = r13
            java.lang.String r4 = "EndTimeStampMs"
            r5.mo86048e(r4, r13)
            long r6 = r5.f236926l
            long r8 = r5.f236925k
            long r6 = r6 - r8
            r5.f236923i = r6
            java.lang.String r4 = "CostTimeMs"
            r5.mo86046c(r4, r6)
            r5.mo86054n()
        L_0x00e2:
            com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r9 = 370(0x172, double:1.83E-321)
            r11 = 40
            r13 = 1
            r15 = 0
            r8 = r4
            r8.idkeyStat(r9, r11, r13, r15)
            if (r26 == 0) goto L_0x00fe
            r9 = 370(0x172, double:1.83E-321)
            r11 = 41
            r13 = 1
            r15 = 0
            r8 = r4
            r8.idkeyStat(r9, r11, r13, r15)
            goto L_0x02d6
        L_0x00fe:
            r9 = 370(0x172, double:1.83E-321)
            r11 = 42
            r13 = 1
            r15 = 0
            r8 = r4
            r8.idkeyStat(r9, r11, r13, r15)
            long r5 = r1.f260400k
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x0116
            r1 = 370(0x172, float:5.18E-43)
            r2 = 74
            r4.mo175911u(r1, r2)
        L_0x0116:
            SERVICE r1 = r0.f262488d
            kr0.e r1 = (kr0.C88267e) r1
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r1 = r1.getRuntime()
            if (r1 != 0) goto L_0x0121
            return
        L_0x0121:
            SERVICE r1 = r0.f262488d
            kr0.e r1 = (kr0.C88267e) r1
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r1 = r1.getRuntime()
            com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC r1 = r1.mo113213o1()
            if (r1 != 0) goto L_0x0130
            return
        L_0x0130:
            SERVICE r2 = r0.f262488d
            kr0.e r2 = (kr0.C88267e) r2
            java.lang.String r2 = r2.getAppId()
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r3 = r1.f261072r
            int r3 = r3.pkgVersion
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r1 = r1.f261072r
            int r1 = r1.f238585d
            r4 = 370(0x172, float:5.18E-43)
            r5 = 42
            r6 = 1
            r25 = r2
            r26 = r3
            r27 = r1
            r28 = r4
            r29 = r5
            r30 = r6
            com.tencent.p014mm.plugin.appbrand.report.C84240s.m103843i(r25, r26, r27, r28, r29, r30)
            goto L_0x02d6
        L_0x0156:
            java.lang.String r2 = "app-service.js"
            boolean r2 = r15.endsWith(r2)
            if (r2 == 0) goto L_0x02d6
            SERVICE r2 = r0.f262488d
            kr0.e r2 = (kr0.C88267e) r2
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r2 = r2.getRuntime()
            if (r2 == 0) goto L_0x01af
            if (r26 == 0) goto L_0x018b
            SERVICE r2 = r0.f262488d
            kr0.e r2 = (kr0.C88267e) r2
            java.lang.String r2 = r2.getAppId()
            uo0.a r3 = com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepInjectJSAppService
            r4 = r15
            r5 = r27
            r11 = r7
            r7 = r29
            com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.m102129f(r2, r3, r4, r5, r7)
            SERVICE r2 = r0.f262488d
            kr0.e r2 = (kr0.C88267e) r2
            java.lang.String r2 = r2.getAppId()
            uo0.a r3 = com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepServiceInit
            com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.m102128e(r2, r3)
            goto L_0x01b0
        L_0x018b:
            r11 = r7
            SERVICE r2 = r0.f262488d
            kr0.e r2 = (kr0.C88267e) r2
            java.lang.String r2 = r2.getAppId()
            uo0.a r3 = com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepInjectJSAppService
            java.lang.String r4 = ""
            r5 = r15
            r6 = r27
            r12 = 1
            r8 = r29
            com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.m102127d(r2, r3, r4, r5, r6, r8)
            SERVICE r2 = r0.f262488d
            kr0.e r2 = (kr0.C88267e) r2
            java.lang.String r2 = r2.getAppId()
            uo0.a r3 = com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepServiceInit
            com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.m102125b(r2, r3)
            goto L_0x01b1
        L_0x01af:
            r11 = r7
        L_0x01b0:
            r12 = 1
        L_0x01b1:
            if (r26 == 0) goto L_0x0266
            SERVICE r2 = r0.f262488d
            kr0.e r2 = (kr0.C88267e) r2
            boolean r2 = r2.mo114335b0()
            if (r2 != 0) goto L_0x01c7
            SERVICE r2 = r0.f262488d
            kr0.e r2 = (kr0.C88267e) r2
            boolean r2 = r2.isRunning()
            if (r2 == 0) goto L_0x020a
        L_0x01c7:
            SERVICE r2 = r0.f262488d
            kr0.e r2 = (kr0.C88267e) r2
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r2 = r2.getRuntime()
            boolean r3 = r10 instanceof com.tencent.p014mm.appbrand.p942v8.C80669j.C80676g
            if (r3 == 0) goto L_0x01d8
            r3 = r10
            com.tencent.mm.appbrand.v8.j$g r3 = (com.tencent.p014mm.appbrand.p942v8.C80669j.C80676g) r3
            r10 = r3
            goto L_0x01da
        L_0x01d8:
            r10 = r17
        L_0x01da:
            java.lang.Object[] r3 = new java.lang.Object[r12]
            r4 = -1
            if (r2 == 0) goto L_0x01e4
            int r5 = r2.hashCode()
            goto L_0x01e5
        L_0x01e4:
            r5 = -1
        L_0x01e5:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r16] = r5
            java.lang.String r5 = "[QualitySystem] app-service.js runtime.hashCode = [%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r5, r3)
            SERVICE r3 = r0.f262488d
            long r5 = r1.f260400k
            r7 = 0
            if (r2 == 0) goto L_0x01fd
            int r1 = r2.hashCode()
            r9 = r1
            goto L_0x01fe
        L_0x01fd:
            r9 = -1
        L_0x01fe:
            java.lang.String r8 = ""
            r1 = r3
            r2 = r15
            r3 = r5
            r5 = r8
            r6 = r7
            r7 = r27
            com.tencent.p014mm.plugin.appbrand.report.quality.C84185b.m103772e(r1, r2, r3, r5, r6, r7, r9, r10)
        L_0x020a:
            r16 = 1
            long r17 = r13 - r27
            SERVICE r1 = r0.f262488d
            kr0.e r1 = (kr0.C88267e) r1
            boolean r1 = r1.f240291y
            SERVICE r2 = r0.f262488d
            kr0.e r2 = (kr0.C88267e) r2
            java.lang.String r20 = r2.getAppId()
            r21 = -1
            r22 = 0
            SERVICE r2 = r0.f262488d
            kr0.e r2 = (kr0.C88267e) r2
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r2 = r2.mo114272k()
            int r23 = r2.mo113371a()
            r19 = r1
            p774zg.C39348q0.m42097c(r16, r17, r19, r20, r21, r22, r23)
            SERVICE r1 = r0.f262488d
            kr0.e r1 = (kr0.C88267e) r1
            java.lang.String r1 = r1.getAppId()
            com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime r1 = com.tencent.p014mm.plugin.appbrand.report.quality.C84185b.m103770c(r1, r12)
            if (r1 == 0) goto L_0x0266
            r2 = 7
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r1.f245847H
            long r3 = r3 - r5
            SERVICE r1 = r0.f262488d
            kr0.e r1 = (kr0.C88267e) r1
            boolean r5 = r1.f240291y
            SERVICE r1 = r0.f262488d
            kr0.e r1 = (kr0.C88267e) r1
            java.lang.String r6 = r1.getAppId()
            r7 = -1
            r8 = 0
            SERVICE r1 = r0.f262488d
            kr0.e r1 = (kr0.C88267e) r1
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r1 = r1.mo114272k()
            int r9 = r1.mo113371a()
            p774zg.C39348q0.m42097c(r2, r3, r5, r6, r7, r8, r9)
        L_0x0266:
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 370(0x172, double:1.83E-321)
            r13 = 44
            r15 = 1
            r17 = 0
            r10 = r1
            r10.idkeyStat(r11, r13, r15, r17)
            if (r26 == 0) goto L_0x0283
            r11 = 370(0x172, double:1.83E-321)
            r13 = 45
            r15 = 1
            r17 = 0
            r10 = r1
            r10.idkeyStat(r11, r13, r15, r17)
            goto L_0x02d6
        L_0x0283:
            r11 = 370(0x172, double:1.83E-321)
            r13 = 46
            r15 = 1
            r17 = 0
            r10 = r1
            r10.idkeyStat(r11, r13, r15, r17)
            SERVICE r1 = r0.f262488d
            kr0.e r1 = (kr0.C88267e) r1
            boolean r1 = r1.isRunning()
            if (r1 != 0) goto L_0x029a
            return
        L_0x029a:
            SERVICE r1 = r0.f262488d
            kr0.e r1 = (kr0.C88267e) r1
            java.lang.String r1 = r1.getAppId()
            SERVICE r2 = r0.f262488d
            kr0.e r2 = (kr0.C88267e) r2
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r2 = r2.getRuntime()
            com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC r2 = r2.mo113213o1()
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r2 = r2.f261072r
            int r2 = r2.pkgVersion
            SERVICE r3 = r0.f262488d
            kr0.e r3 = (kr0.C88267e) r3
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r3 = r3.getRuntime()
            com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC r3 = r3.mo113213o1()
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r3 = r3.f261072r
            int r3 = r3.f238585d
            r4 = 370(0x172, float:5.18E-43)
            r5 = 46
            r6 = 1
            r25 = r1
            r26 = r2
            r27 = r3
            r28 = r4
            r29 = r5
            r30 = r6
            com.tencent.p014mm.plugin.appbrand.report.C84240s.m103843i(r25, r26, r27, r28, r29, r30)
        L_0x02d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kr0.C88255a.mo122585A(ub.f$a, boolean, long, long, java.lang.Object):void");
    }

    /* renamed from: B */
    public void mo122586B(String str) {
        C115669n.INSTANCE.idkeyStat(370, 39, 1, false);
        C84240s.m103843i(((C88267e) this.f262488d).getAppId(), ((C88267e) this.f262488d).getRuntime().mo113213o1().f261072r.pkgVersion, ((C88267e) this.f262488d).getRuntime().mo113213o1().f261072r.f238585d, 370, 39, 1);
    }

    /* renamed from: b */
    public C40480g mo122587b(int i) {
        if (this.f255070i.f255074D == null) {
            return null;
        }
        return super.mo122587b(i);
    }

    /* renamed from: c */
    public void mo122588c(String str, boolean z, C90636f.C90637a[] aVarArr, boolean[] zArr, Object[] objArr, long j, long j2) {
        C80669j.C80676g gVar;
        long j3;
        long j4;
        C90636f.C90637a[] aVarArr2 = aVarArr;
        String uuid = (!TextUtils.isEmpty(str) || !BuildInfo.DEBUG) ? str : UUID.randomUUID().toString();
        if (!TextUtils.isEmpty(uuid) && aVarArr2.length != 0 && zArr.length != 0) {
            AppBrandRuntimeWC N0 = ((C88267e) this.f262488d).getRuntime();
            if (aVarArr2.length == 1) {
                C80669j.C80676g gVar2 = objArr[0];
                C80669j.C80676g gVar3 = gVar2 instanceof C80669j.C80676g ? gVar2 : null;
                if (gVar3 != null) {
                    j4 = (long) gVar3.sourceLength;
                } else {
                    C90636f.C90637a aVar = aVarArr2[0];
                    if (aVar != null) {
                        j4 = aVar.f260400k;
                    } else {
                        return;
                    }
                }
                gVar = gVar3;
                j3 = j4;
            } else {
                int i = 0;
                int i2 = 0;
                long j5 = 0;
                long j6 = 0;
                long j7 = 0;
                for (int i3 = 0; i3 < aVarArr2.length; i3++) {
                    C80669j.C80676g gVar4 = objArr[i3];
                    if (gVar4 instanceof C80669j.C80676g) {
                        C80669j.C80676g gVar5 = gVar4;
                        j7 += (long) gVar5.sourceLength;
                        j6 += gVar5.flatJSCompileCost;
                        j5 += gVar5.flatJSRunCost;
                        i = gVar5.codeCacheStatus;
                        i2 = gVar5.f236060c;
                    } else {
                        C90636f.C90637a aVar2 = aVarArr2[i3];
                        if (aVar2 != null) {
                            j7 += aVar2.f260400k;
                        }
                    }
                }
                if (j5 > 0) {
                    C80669j.C80676g gVar6 = new C80669j.C80676g();
                    gVar6.f236058a = j;
                    gVar6.f236059b = j2;
                    gVar6.codeCacheStatus = i;
                    gVar6.f236060c = i2;
                    gVar6.flatJSCompileCost = j6;
                    gVar6.flatJSRunCost = j5;
                    gVar6.sourceLength = (int) j7;
                    gVar = gVar6;
                    j3 = j7;
                } else {
                    j3 = j7;
                    gVar = null;
                }
            }
            SERVICE service = this.f262488d;
            Objects.requireNonNull(uuid);
            C84185b.m103773f(service, uuid, j3, "", 0, j, N0 != null ? N0.hashCode() : -1, gVar, z);
        }
    }

    /* renamed from: d */
    public void mo122589d(C91635f fVar, C40480g gVar) {
        C88267e eVar = (C88267e) fVar;
        C87412m.m108594g(eVar, "<this>");
        C87412m.m108594g(gVar, "context");
        if (eVar.getRuntime().mo113194Y1() || BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED) {
            Log.m106505i("MicroMsg.AppBrand.WXNativeInjector", "evaluate wxNative.js start. appId:" + eVar.getAppId() + ", contextId:" + gVar.getContextId());
            long currentTicks = Util.currentTicks();
            URL url = new URL("https://lib/wxNative.js");
            gVar.mo63304R0(url, C88016e.m109548e("wxNative.js") + "\n;(function() { return injectNativateRet; })()", new C46735i1(eVar, gVar, currentTicks));
        }
    }

    /* renamed from: f */
    public int mo122590f() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_appbrand_common_lib_code_cache_type, 0);
    }

    /* renamed from: g */
    public String mo122591g(C91635f fVar, String str) {
        try {
            return super.mo122591g((C88267e) fVar, str);
        } catch (C81386x1 e) {
            C115669n.INSTANCE.idkeyStat(370, 48, 1, false);
            C84240s.m103843i(((C88267e) this.f262488d).getAppId(), ((C88267e) this.f262488d).getRuntime().mo113213o1().f261072r.pkgVersion, ((C88267e) this.f262488d).getRuntime().mo113213o1().f261072r.f238585d, 370, 48, 1);
            throw e;
        }
    }

    /* renamed from: j */
    public void mo122592j(C40480g gVar) {
        SERVICE service = this.f262488d;
        if (service != null) {
            if (!((C88267e) service).f255131Q) {
                if (!(((C88267e) service).getRuntime() == null || ((C88267e) this.f262488d).getRuntime().f238280P1 == null)) {
                    return;
                }
            } else {
                return;
            }
        }
        super.mo122592j(gVar);
    }

    /* renamed from: n */
    public Object mo122593n(int i) {
        C88256b bVar = this.f255070i;
        WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo = bVar.f255074D;
        if (wxaPkgV8SnapshotInfo == null) {
            com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.AppBrandJSContextInterfaceWC", "onAllocContextFromSnapshotStart, commLibSnapshotInfo is null");
            return null;
        }
        bVar.mo122624e1(new b$$c(C84835c0.f247296d));
        return wxaPkgV8SnapshotInfo;
    }

    /* renamed from: o */
    public void mo122594o(int i, Object obj) {
        if (obj != null) {
            C88256b bVar = this.f255070i;
            bVar.getClass();
            bVar.mo122624e1(new b$$a(C84835c0.f247296d));
        }
    }

    /* renamed from: p */
    public void mo122595p(boolean z) {
        C84868u0.f247366a.mo117608e(z, this.f262488d);
    }

    /* renamed from: q */
    public void mo122596q() {
        C84868u0 u0Var = C84868u0.f247366a;
        C84840f0.f247297a.getClass();
        if (C84840f0.f247299c) {
            com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.WxaCommLibV8SnapshotStats", "onAllocEmptySubContextStart");
        }
        u0Var.mo117607d(C84868u0.C84869a.AllocEmptySubContext);
    }

    /* renamed from: r */
    public void mo122597r(String str, int i, boolean z) {
        C84868u0.f247366a.mo117609f(this.f255070i.f255073C, str, z, this.f262488d);
    }

    /* renamed from: s */
    public void mo122598s(String str, int i) {
        C84868u0.f247366a.mo117610g(this.f255070i.f255073C, str);
    }

    /* renamed from: t */
    public void mo122599t(String str, int i) {
        C84868u0.f247366a.mo117614k(this.f255070i.f255073C, str, this.f262488d);
    }

    /* renamed from: u */
    public void mo122600u(String str, int i) {
        C84868u0.f247366a.mo117615l(this.f255070i.f255073C, str);
    }

    /* renamed from: w */
    public void mo122601w(String str, String str2, String str3) {
        C84868u0.f247366a.mo117621r(this.f255070i.f255073C, str, str2, str3);
    }

    /* renamed from: x */
    public void mo122602x(int i, String str, List<Boolean> list, List<C80669j.C80676g> list2) {
        C84868u0.f247366a.mo117616m(this.f255070i.f255073C, str, list, list2, this.f262488d);
    }

    /* renamed from: y */
    public void mo120937y(int i, String str) {
        C84868u0.f247366a.mo117617n(this.f255070i.f255073C, str);
        C88267e eVar = (C88267e) this.f262488d;
        if ((eVar instanceof C88271f1) && C90599h.m113508a(str, "WASubContext.js")) {
            this.f262489e.mo115375F0(i).evaluateJavascript("" + Util.nullAsNil(((C88271f1) eVar).f255145W), (ValueCallback<String>) null);
        }
    }

    /* renamed from: z */
    public boolean mo122603z() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_appbrand_read_comm_lib_by_fd, 1) == 1;
    }
}
