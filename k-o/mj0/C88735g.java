package mj0;

import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.plugin.appbrand.appcache.C1514a1;
import com.tencent.p014mm.plugin.appbrand.appcache.ModulePkgInfo;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPluginPkgInfo;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaRuntimeModulePluginListMap;
import com.tencent.p014mm.plugin.appbrand.game.preload.C81889e;
import com.tencent.p014mm.plugin.appbrand.game.preload.C81891f;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40480g;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83185u;
import com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84835c0;
import com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84840f0;
import com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84868u0;
import com.tencent.p014mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import h81.C32735h;
import java.util.Arrays;
import java.util.List;
import p284zb.C91635f;
import p958eb.C86479j;
import p992kb.C88127c;

/* renamed from: mj0.g */
public class C88735g extends C86479j {

    /* renamed from: j */
    public C88732a f256123j;

    public C88735g(C91635f fVar, C83185u uVar) {
        super(fVar, uVar);
        this.f256123j = (C88732a) fVar.f262593H;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0131  */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo122585A(p1044ub.C90636f.C90637a r33, boolean r34, long r35, long r37, java.lang.Object r39) {
        /*
            r32 = this;
            r0 = r32
            r1 = r33
            r11 = r35
            r13 = r37
            r2 = r39
            java.lang.Class<eb.e> r15 = p958eb.C86474e.class
            java.lang.String r10 = r1.f260398i
            java.lang.String r3 = "plugin.js"
            boolean r3 = r10.endsWith(r3)
            r9 = 0
            r4 = -1
            r8 = 1
            java.lang.String r5 = "MicroMsg.WAGameJsContextInterfaceWC"
            r6 = 0
            if (r3 == 0) goto L_0x00db
            java.lang.String r13 = "plugin "
            if (r34 == 0) goto L_0x00ad
            SERVICE r3 = r0.f262488d
            boolean r3 = r3.mo114335b0()
            if (r3 != 0) goto L_0x0032
            SERVICE r3 = r0.f262488d
            boolean r3 = r3.isRunning()
            if (r3 == 0) goto L_0x032c
        L_0x0032:
            boolean r3 = r2 instanceof com.tencent.p014mm.appbrand.p942v8.C80669j.C80676g
            if (r3 == 0) goto L_0x003a
            com.tencent.mm.appbrand.v8.j$g r2 = (com.tencent.p014mm.appbrand.p942v8.C80669j.C80676g) r2
            r14 = r2
            goto L_0x003b
        L_0x003a:
            r14 = r6
        L_0x003b:
            SERVICE r2 = r0.f262488d
            fc.g r2 = r2.getRuntime()
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r6 = r1.f260398i
            r3[r9] = r6
            if (r2 == 0) goto L_0x004f
            int r6 = r2.hashCode()
            goto L_0x0050
        L_0x004f:
            r6 = -1
        L_0x0050:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3[r8] = r6
            java.lang.String r6 = "[QualitySystem] %s runtime.hashCode = [%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r3)
            SERVICE r3 = r0.f262488d
            java.lang.String r5 = r1.f260398i
            long r6 = r1.f260400k
            java.lang.String r9 = r1.f238716a
            int r10 = r1.f238717b
            if (r2 == 0) goto L_0x006e
            int r2 = r2.hashCode()
            r16 = r2
            goto L_0x0070
        L_0x006e:
            r16 = -1
        L_0x0070:
            r2 = r3
            r3 = r5
            r4 = r6
            r6 = r9
            r7 = r10
            r10 = 1
            r8 = r35
            r12 = 1
            r10 = r16
            r11 = r14
            com.tencent.p014mm.plugin.appbrand.report.quality.C84185b.m103772e(r2, r3, r4, r6, r7, r8, r10, r11)
            cb.i$b r2 = p935cb.C79980i.C79982b.INFO
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r13)
            java.lang.String r1 = r1.f238716a
            r3.append(r1)
            java.lang.String r1 = " inject success!"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            SERVICE r3 = r0.f262488d
            java.lang.Object r3 = r3.mo125517G0(r15)
            eb.e r3 = (p958eb.C86474e) r3
            if (r3 == 0) goto L_0x00a8
            cb.i r3 = r3.mo120894A()
            r3.mo110167a(r2, r1)
        L_0x00a8:
            r0.mo123175C(r12)
            goto L_0x032c
        L_0x00ad:
            cb.i$b r2 = p935cb.C79980i.C79982b.ERROR
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r13)
            java.lang.String r1 = r1.f238716a
            r3.append(r1)
            java.lang.String r1 = " inject fail!"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            SERVICE r3 = r0.f262488d
            java.lang.Object r3 = r3.mo125517G0(r15)
            eb.e r3 = (p958eb.C86474e) r3
            if (r3 == 0) goto L_0x00d6
            cb.i r3 = r3.mo120894A()
            r3.mo110167a(r2, r1)
        L_0x00d6:
            r0.mo123175C(r9)
            goto L_0x032c
        L_0x00db:
            r3 = 1
            java.lang.String r7 = "WAGameSubContext.js"
            boolean r7 = r7.equals(r10)
            r15 = 24
            if (r7 == 0) goto L_0x01e4
            if (r34 == 0) goto L_0x0153
            SERVICE r3 = r0.f262488d
            boolean r3 = r3.mo114335b0()
            if (r3 != 0) goto L_0x00f8
            SERVICE r3 = r0.f262488d
            boolean r3 = r3.isRunning()
            if (r3 == 0) goto L_0x0153
        L_0x00f8:
            boolean r3 = r2 instanceof com.tencent.p014mm.appbrand.p942v8.C80669j.C80676g
            if (r3 == 0) goto L_0x00ff
            r6 = r2
            com.tencent.mm.appbrand.v8.j$g r6 = (com.tencent.p014mm.appbrand.p942v8.C80669j.C80676g) r6
        L_0x00ff:
            com.tencent.mm.plugin.appbrand.report.quality.e r2 = com.tencent.p014mm.plugin.appbrand.report.quality.C84185b.f245912a
            SERVICE r3 = r0.f262488d
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualityLibInjectStruct r2 = r2.mo116888g(r3)
            r2.mo112531s(r10)
            long r3 = r1.f260400k
            r2.f236930p = r3
            if (r6 == 0) goto L_0x011d
            int r1 = r6.codeCacheStatus
            if (r1 < 0) goto L_0x011d
            int[] r3 = com.tencent.p014mm.plugin.appbrand.jsruntime.C83187w.f242988l0
            r4 = 7
            if (r1 >= r4) goto L_0x011d
            r1 = r3[r1]
            long r3 = (long) r1
            goto L_0x011f
        L_0x011d:
            r3 = 4
        L_0x011f:
            r2.f236932r = r3
            r3 = 1
            r2.f236933s = r3
            r3 = 0
            if (r6 == 0) goto L_0x012c
            long r7 = r6.flatJSCompileCost
            goto L_0x012d
        L_0x012c:
            r7 = r3
        L_0x012d:
            r2.f236934t = r7
            if (r6 == 0) goto L_0x0134
            int r1 = r6.f236060c
            long r3 = (long) r1
        L_0x0134:
            r2.f236936v = r3
            r2.f236925k = r11
            java.lang.String r1 = "StartTimeStampMs"
            r2.mo86048e(r1, r11)
            r2.f236926l = r13
            java.lang.String r1 = "EndTimeStampMs"
            r2.mo86048e(r1, r13)
            long r3 = r2.f236926l
            long r5 = r2.f236925k
            long r3 = r3 - r5
            r2.f236923i = r3
            java.lang.String r1 = "CostTimeMs"
            r2.mo86046c(r1, r3)
            r2.mo86054n()
        L_0x0153:
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r17 = 778(0x30a, double:3.844E-321)
            r19 = 17
            r21 = 1
            r23 = 0
            r16 = r1
            r16.idkeyStat(r17, r19, r21, r23)
            if (r34 == 0) goto L_0x0172
            r17 = 778(0x30a, double:3.844E-321)
            r19 = 19
            r21 = 1
            r23 = 0
            r16 = r1
            r16.idkeyStat(r17, r19, r21, r23)
            goto L_0x01b2
        L_0x0172:
            r17 = 778(0x30a, double:3.844E-321)
            r19 = 18
            r21 = 1
            r23 = 0
            r16 = r1
            r16.idkeyStat(r17, r19, r21, r23)
            SERVICE r1 = r0.f262488d
            java.lang.String r1 = r1.getAppId()
            com.tencent.p014mm.plugin.appbrand.report.C84240s.m103846l(r1, r15, r9)
            SERVICE r1 = r0.f262488d
            java.lang.String r2 = r1.getAppId()
            SERVICE r1 = r0.f262488d
            fc.g r1 = r1.getRuntime()
            com.tencent.luggage.sdk.config.AppBrandSysConfigLU r1 = r1.mo113051d0()
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r1 = r1.f261072r
            int r3 = r1.pkgVersion
            SERVICE r1 = r0.f262488d
            fc.g r1 = r1.getRuntime()
            com.tencent.luggage.sdk.config.AppBrandSysConfigLU r1 = r1.mo113051d0()
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r1 = r1.f261072r
            int r4 = r1.f238585d
            r5 = 778(0x30a, float:1.09E-42)
            r6 = 18
            r7 = 1
            com.tencent.p014mm.plugin.appbrand.report.C84240s.m103843i(r2, r3, r4, r5, r6, r7)
        L_0x01b2:
            SERVICE r1 = r0.f262488d
            fc.g r1 = r1.getRuntime()
            if (r1 == 0) goto L_0x032c
            if (r34 == 0) goto L_0x01cf
            SERVICE r1 = r0.f262488d
            java.lang.String r1 = r1.getAppId()
            uo0.a r2 = com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepInjectWAGameSubContext
            java.lang.String r3 = "WAGameSubContext.js"
            r4 = r35
            r6 = r37
            com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.m102129f(r1, r2, r3, r4, r6)
            goto L_0x032c
        L_0x01cf:
            SERVICE r1 = r0.f262488d
            java.lang.String r1 = r1.getAppId()
            uo0.a r2 = com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepInjectJSWASubContext
            java.lang.String r3 = ""
            java.lang.String r4 = "WAGameSubContext.js"
            r5 = r35
            r7 = r37
            com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.m102127d(r1, r2, r3, r4, r5, r7)
            goto L_0x032c
        L_0x01e4:
            java.lang.String r7 = "game.js"
            boolean r7 = r10.endsWith(r7)
            if (r7 == 0) goto L_0x032c
            SERVICE r7 = r0.f262488d
            boolean r7 = r7.mo114335b0()
            if (r7 != 0) goto L_0x0200
            SERVICE r7 = r0.f262488d
            boolean r7 = r7.isRunning()
            if (r7 == 0) goto L_0x01fd
            goto L_0x0200
        L_0x01fd:
            r17 = r10
            goto L_0x024b
        L_0x0200:
            boolean r7 = r2 instanceof com.tencent.p014mm.appbrand.p942v8.C80669j.C80676g
            if (r7 == 0) goto L_0x0209
            com.tencent.mm.appbrand.v8.j$g r2 = (com.tencent.p014mm.appbrand.p942v8.C80669j.C80676g) r2
            r16 = r2
            goto L_0x020b
        L_0x0209:
            r16 = r6
        L_0x020b:
            SERVICE r2 = r0.f262488d
            fc.g r2 = r2.getRuntime()
            java.lang.Object[] r3 = new java.lang.Object[r3]
            if (r2 == 0) goto L_0x021a
            int r6 = r2.hashCode()
            goto L_0x021b
        L_0x021a:
            r6 = -1
        L_0x021b:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3[r9] = r6
            java.lang.String r6 = "[QualitySystem] app-service.js runtime.hashCode = [%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r3)
            SERVICE r3 = r0.f262488d
            java.lang.String r5 = r1.f260398i
            long r6 = r1.f260400k
            r8 = 0
            if (r2 == 0) goto L_0x0236
            int r1 = r2.hashCode()
            r17 = r1
            goto L_0x0238
        L_0x0236:
            r17 = -1
        L_0x0238:
            java.lang.String r18 = ""
            r1 = r3
            r2 = r5
            r3 = r6
            r5 = r18
            r6 = r8
            r7 = r35
            r9 = r17
            r17 = r10
            r10 = r16
            com.tencent.p014mm.plugin.appbrand.report.quality.C84185b.m103772e(r1, r2, r3, r5, r6, r7, r9, r10)
        L_0x024b:
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r25 = 778(0x30a, double:3.844E-321)
            r27 = 21
            r29 = 1
            r31 = 0
            r24 = r1
            r24.idkeyStat(r25, r27, r29, r31)
            if (r34 == 0) goto L_0x026b
            r25 = 778(0x30a, double:3.844E-321)
            r27 = 23
            r29 = 1
            r31 = 0
            r24 = r1
            r24.idkeyStat(r25, r27, r29, r31)
            r2 = 0
            goto L_0x02ac
        L_0x026b:
            r25 = 778(0x30a, double:3.844E-321)
            r27 = 22
            r29 = 1
            r31 = 0
            r24 = r1
            r24.idkeyStat(r25, r27, r29, r31)
            SERVICE r1 = r0.f262488d
            java.lang.String r1 = r1.getAppId()
            r2 = 0
            com.tencent.p014mm.plugin.appbrand.report.C84240s.m103846l(r1, r15, r2)
            SERVICE r1 = r0.f262488d
            java.lang.String r3 = r1.getAppId()
            SERVICE r1 = r0.f262488d
            fc.g r1 = r1.getRuntime()
            com.tencent.luggage.sdk.config.AppBrandSysConfigLU r1 = r1.mo113051d0()
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r1 = r1.f261072r
            int r4 = r1.pkgVersion
            SERVICE r1 = r0.f262488d
            fc.g r1 = r1.getRuntime()
            com.tencent.luggage.sdk.config.AppBrandSysConfigLU r1 = r1.mo113051d0()
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r1 = r1.f261072r
            int r5 = r1.f238585d
            r6 = 778(0x30a, float:1.09E-42)
            r7 = 22
            r8 = 1
            com.tencent.p014mm.plugin.appbrand.report.C84240s.m103843i(r3, r4, r5, r6, r7, r8)
        L_0x02ac:
            SERVICE r1 = r0.f262488d
            java.lang.String r1 = r1.getAppId()
            sr0.c$b r3 = sr0.C90343c.C90345b.INJECT_JS
            sr0.b r4 = sr0.C90341b.C90342a.f259326a
            r5 = 20
            java.util.Map<java.lang.String, java.util.List<sr0.d>> r4 = r4.f259325a
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.String r7 = "WeAppLaunch"
            java.lang.Object r4 = r4.get(r7)
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L_0x02c7
            goto L_0x02da
        L_0x02c7:
            r9 = 0
        L_0x02c8:
            int r2 = r4.size()
            if (r9 >= r2) goto L_0x02da
            java.lang.Object r2 = r4.get(r9)
            sr0.d r2 = (sr0.C90346d) r2
            r2.mo124567b(r1, r3, r5)
            int r9 = r9 + 1
            goto L_0x02c8
        L_0x02da:
            SERVICE r1 = r0.f262488d
            fc.g r1 = r1.getRuntime()
            if (r1 == 0) goto L_0x032c
            SERVICE r1 = r0.f262488d
            fc.g r1 = r1.getRuntime()
            r2 = 204(0xcc, float:2.86E-43)
            long r3 = r13 - r11
            com.tencent.p014mm.plugin.appbrand.performance.AppBrandPerformanceManager.m103495d(r1, r2, r3)
            if (r34 == 0) goto L_0x030e
            SERVICE r1 = r0.f262488d
            java.lang.String r1 = r1.getAppId()
            uo0.a r2 = com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepInjectJSGame
            r3 = r17
            r4 = r35
            r6 = r37
            com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.m102129f(r1, r2, r3, r4, r6)
            SERVICE r1 = r0.f262488d
            java.lang.String r1 = r1.getAppId()
            uo0.a r2 = com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepServiceInit_Game
            com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.m102128e(r1, r2)
            goto L_0x032c
        L_0x030e:
            SERVICE r1 = r0.f262488d
            java.lang.String r1 = r1.getAppId()
            uo0.a r2 = com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepInjectJSGame
            java.lang.String r3 = ""
            r4 = r17
            r5 = r35
            r7 = r37
            com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.m102127d(r1, r2, r3, r4, r5, r7)
            SERVICE r1 = r0.f262488d
            java.lang.String r1 = r1.getAppId()
            uo0.a r2 = com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepServiceInit_Game
            com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.m102125b(r1, r2)
        L_0x032c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mj0.C88735g.mo122585A(ub.f$a, boolean, long, long, java.lang.Object):void");
    }

    /* renamed from: C */
    public final void mo123175C(boolean z) {
        C115669n nVar = C115669n.INSTANCE;
        nVar.idkeyStat(370, 40, 1, false);
        if (z) {
            nVar.idkeyStat(370, 49, 1, false);
        } else {
            nVar.idkeyStat(370, 50, 1, false);
        }
    }

    /* renamed from: b */
    public C40480g mo122587b(int i) {
        if (this.f256123j.f256108E == null) {
            return null;
        }
        return super.mo122587b(i);
    }

    /* renamed from: f */
    public int mo122590f() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_appbrand_common_lib_code_cache_type, 0);
    }

    /* renamed from: g */
    public String mo122591g(C91635f fVar, String str) {
        String g = super.mo122591g(fVar, str);
        Log.m105925i("MicroMsg.WAGameJsContextInterfaceWC", "beforeInjectUserScript(%s)", str);
        C81889e d = C81889e.m100570d();
        d.getClass();
        if (!Util.isNullOrNil(str) && str.equals("game.js")) {
            C81891f.m100578a().mo114291b(2000, (int) (Util.nowMilliSecond() - d.f240194a.mo113210l1().f234800D));
            C81891f.m100578a().mo114291b(3001, d.f240203j.intValue());
            C81891f.m100578a().mo114291b(3003, d.f240202i.intValue());
            C81891f.m100578a().mo114291b(4001, d.f240204k.intValue());
        }
        if (this.f262488d != null && !Util.isNullOrNil(str) && str.equals("game.js")) {
            C88127c a = C88127c.m109723a(this.f262488d.getAppId());
            a.getClass();
            a.f254886b = Util.currentTicks();
        }
        return g;
    }

    /* renamed from: l */
    public int mo123176l(C40480g gVar, String str) {
        Log.m105925i("MicroMsg.WAGameJsContextInterfaceWC", "hy: injectWxaScript from js context interface: %s %d", str, Integer.valueOf(gVar.getContextId()));
        mo125495e(gVar);
        boolean parseBoolean = Boolean.parseBoolean(this.f262488d.mo114272k().Yk0("injectGameContextPlugin"));
        Log.m105925i("MicroMsg.WAGameJsContextInterfaceWC", "injectGameContextPlugin :%b, abtest:%b", Boolean.valueOf(parseBoolean), Boolean.valueOf(C1514a1.m1515a()));
        if (!C1514a1.m1515a() || !parseBoolean) {
            Log.m105924i("MicroMsg.WAGameJsContextInterfaceWC", "injectPluginCodeNewLogic");
            if (str.equals("game.js")) {
                WxaRuntimeModulePluginListMap wxaRuntimeModulePluginListMap = this.f262488d.getRuntime().mo113051d0().f261072r.f238590i;
                List<WxaPluginPkgInfo> list = null;
                if (wxaRuntimeModulePluginListMap != null) {
                    list = wxaRuntimeModulePluginListMap.mo113464b(ModulePkgInfo.MAIN_MODULE_NAME);
                } else {
                    Log.m105920e("MicroMsg.WAGameJsContextInterfaceWC", "pluginCodeList wxaRuntimeModulePluginListMap null");
                }
                if (list != null && list.size() > 0) {
                    Log.m105925i("MicroMsg.WAGameJsContextInterfaceWC", "client inject pluginCode size:%s", Integer.valueOf(list.size()));
                    for (WxaPluginPkgInfo next : list) {
                        List<Integer> list2 = next.contexts;
                        if (list2 != null) {
                            Log.m105919d("MicroMsg.WAGameJsContextInterfaceWC", "multiPkg contexts size:%d,contexts:%s", Integer.valueOf(list2.size()), Arrays.toString(list2.toArray()));
                        }
                        if (list2 != null && list2.contains(0)) {
                            String str2 = next.prefixPath + ModulePkgInfo.GAME_PLUGIN_SCRIPT;
                            Log.m105919d("MicroMsg.WAGameJsContextInterfaceWC", "pluginCodefilePath:%s", str2);
                            super.mo123176l(gVar, str2);
                        }
                    }
                }
            }
        }
        super.mo123176l(gVar, str);
        return 1;
    }

    /* renamed from: n */
    public Object mo122593n(int i) {
        C88732a aVar = this.f256123j;
        WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo = aVar.f256108E;
        if (wxaPkgV8SnapshotInfo == null) {
            Log.m105920e("MicroMsg.WAGameJsContextInterfaceWC", "onAllocContextFromSnapshotStart, commLibSnapshotInfo is null");
            return null;
        }
        aVar.mo123164b1(new a$$a(C84835c0.f247296d));
        return wxaPkgV8SnapshotInfo;
    }

    /* renamed from: o */
    public void mo122594o(int i, Object obj) {
        if (obj != null) {
            C88732a aVar = this.f256123j;
            aVar.getClass();
            aVar.mo123164b1(new a$$b(C84835c0.f247296d));
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
            Log.m105924i("MicroMsg.WxaCommLibV8SnapshotStats", "onAllocEmptySubContextStart");
        }
        u0Var.mo117607d(C84868u0.C84869a.AllocEmptySubContext);
    }

    /* renamed from: r */
    public void mo122597r(String str, int i, boolean z) {
        C84868u0.f247366a.mo117609f(this.f256123j.f256107D, str, z, this.f262488d);
    }

    /* renamed from: s */
    public void mo122598s(String str, int i) {
        C84868u0.f247366a.mo117610g(this.f256123j.f256107D, str);
    }

    /* renamed from: t */
    public void mo122599t(String str, int i) {
        C84868u0.f247366a.mo117614k(this.f256123j.f256107D, str, this.f262488d);
    }

    /* renamed from: u */
    public void mo122600u(String str, int i) {
        C84868u0.f247366a.mo117615l(this.f256123j.f256107D, str);
    }

    /* renamed from: w */
    public void mo122601w(String str, String str2, String str3) {
        C84868u0.f247366a.mo117621r(this.f256123j.f256107D, str, str2, str3);
    }

    /* renamed from: x */
    public void mo122602x(int i, String str, List<Boolean> list, List<C80669j.C80676g> list2) {
        C84868u0.f247366a.mo117616m(this.f256123j.f256107D, str, list, list2, this.f262488d);
    }

    /* renamed from: y */
    public void mo120937y(int i, String str) {
        C84868u0.f247366a.mo117617n(this.f256123j.f256107D, str);
        super.mo120937y(i, str);
    }

    /* renamed from: z */
    public boolean mo122603z() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_appbrand_read_comm_lib_by_fd, 1) == 1;
    }
}
