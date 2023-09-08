package com.tencent.p014mm.plugin.appbrand.report.quality;

import com.tencent.mars.smc.SmcLogic;
import com.tencent.p014mm.autogen.mmdata.rpt.WALifeCycleTimeAxisItemStruct;
import com.tencent.p014mm.plugin.appbrand.debugger.DebuggerShell;
import com.tencent.p014mm.plugin.appbrand.keylogger.C83229q;
import com.tencent.p014mm.plugin.appbrand.report.C55548a;
import com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import gy3.C87412m;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import lj2.C88544a;
import sx3.C64186f0;
import uo0.C78250j;
import uo0.C90709a;
import uo0.C90712d;
import uo0.C90714h;
import uo0.C90715k;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.appbrand.report.quality.b0 */
public final class C84186b0 implements C90712d {

    /* renamed from: a */
    public static final C84186b0 f245919a;

    /* renamed from: b */
    public static final ConcurrentHashMap<String, String> f245920b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public static final ConcurrentHashMap<C90709a, C90709a> f245921c = new ConcurrentHashMap<>();

    /* renamed from: com.tencent.mm.plugin.appbrand.report.quality.b0$a */
    public enum C84187a {
        START,
        OK
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.report.quality.b0$b */
    public /* synthetic */ class C84188b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f245925a;

        static {
            int[] iArr = new int[C84187a.values().length];
            iArr[2] = 1;
            iArr[1] = 2;
            iArr[0] = 3;
            f245925a = iArr;
        }
    }

    static {
        C84186b0 b0Var = new C84186b0();
        f245919a = b0Var;
        m103777f();
        C78250j c = C83229q.m102138c(KSProcessWeAppLaunch.class, WeChatBrands.Business.GROUP_MP);
        C87412m.m108593f(c, "root");
        b0Var.mo116884l(c);
    }

    /* renamed from: e */
    public static final boolean m103776e() {
        return BuildInfo.IS_FLAVOR_RED || BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_PURPLE || DebuggerShell.f239772d || WeChatEnvironment.hasDebugger();
    }

    /* renamed from: f */
    public static final void m103777f() {
        if (DebuggerShell.f239772d && m103776e()) {
            try {
                SmcLogic.SetDebugFlag(true);
            } catch (UnsatisfiedLinkError unused) {
            } catch (Throwable th) {
                C88544a.f255754a = true;
                throw th;
            }
            C88544a.f255754a = true;
            Log.setLevel(0, false);
            Log.setConsoleLogOpen(true);
        }
    }

    /* renamed from: h */
    public static final void m103778h(WALifeCycleTimeAxisItemStruct wALifeCycleTimeAxisItemStruct) {
        C87412m.m108594g(wALifeCycleTimeAxisItemStruct, "<this>");
        boolean z = DebuggerShell.f239772d;
        String p = wALifeCycleTimeAxisItemStruct.mo1005p();
        Log.m105918d("MicroMsg.AppBrand.WAKeyStepKvLogger", "custom report 19175 " + p + " |reportNow:" + z);
        C55548a aVar = C55548a.f158170a;
        C87412m.m108593f(p, "rptValue");
        aVar.mo77079c(19175, z ? 1 : 0, z, z, z, p);
    }

    /* renamed from: j */
    public static final WALifeCycleTimeAxisItemStruct m103779j(String str, String str2, C90709a aVar) {
        WALifeCycleTimeAxisItemStruct wALifeCycleTimeAxisItemStruct = new WALifeCycleTimeAxisItemStruct();
        wALifeCycleTimeAxisItemStruct.f236461d = wALifeCycleTimeAxisItemStruct.mo86045b("InstanceId", str, true);
        wALifeCycleTimeAxisItemStruct.f236462e = wALifeCycleTimeAxisItemStruct.mo86045b("Appid", str2, true);
        wALifeCycleTimeAxisItemStruct.f236464g = wALifeCycleTimeAxisItemStruct.mo86045b("EventName", aVar.name(), true);
        C90709a aVar2 = f245921c.get(aVar);
        wALifeCycleTimeAxisItemStruct.f236466i = wALifeCycleTimeAxisItemStruct.mo86045b("Parent", aVar2 == null ? null : KSProcessWeAppLaunch.stepLaunch == aVar2 ? "StartUp" : aVar2.name(), true);
        String c = aVar.mo124836c();
        C87412m.m108593f(c, "step.desc()");
        if (C112550d0.m153801u(c, "(Global)", false)) {
            wALifeCycleTimeAxisItemStruct.f236467j = 0;
        } else {
            String c2 = aVar.mo124836c();
            C87412m.m108593f(c2, "step.desc()");
            if (C112550d0.m153801u(c2, "(View)", false)) {
                wALifeCycleTimeAxisItemStruct.f236467j = 1;
            } else {
                String c3 = aVar.mo124836c();
                C87412m.m108593f(c3, "step.desc()");
                if (C112550d0.m153801u(c3, "(Service)", false)) {
                    wALifeCycleTimeAxisItemStruct.f236467j = 2;
                } else {
                    wALifeCycleTimeAxisItemStruct.f236467j = 3;
                }
            }
        }
        return wALifeCycleTimeAxisItemStruct;
    }

    /* renamed from: a */
    public void mo116877a(String str, C90709a aVar) {
        mo116882i(str, aVar, 0, C84187a.START);
    }

    /* renamed from: b */
    public void mo116878b(String str) {
        if (str != null) {
            MultiProcessMMKV g = mo116881g();
            long j = g.getLong(str + "_PROCESS_START_TICK", MAlarmHandler.NEXT_FIRE_INTERVAL);
            MultiProcessMMKV g2 = f245919a.mo116881g();
            g2.removeValueForKey(str + "_PROCESS_START_TICK");
            if (j < MAlarmHandler.NEXT_FIRE_INTERVAL) {
                Log.m105924i("MicroMsg.AppBrand.WAKeyStepKvLogger", "onProcessEnd id:" + str + ", cost:" + (Util.currentTicks() - j));
            }
            mo116881g().remove(str).apply();
            MultiProcessMMKV g3 = mo116881g();
            g3.remove(str + "_RUNNING_RESOURCE_PREPARING");
            if (DebuggerShell.f239772d) {
                C55548a.m63179d(false);
            }
        }
    }

    /* renamed from: c */
    public void mo116879c(String str) {
        if (str != null) {
            String[] allKeys = mo116881g().allKeys();
            if (allKeys == null) {
                allKeys = new String[0];
            }
            int length = allKeys.length;
            for (int i = 0; i < length; i++) {
                String str2 = allKeys[i];
                if (C112551y.m153819s(str2 == null ? "" : str2, str, false)) {
                    f245919a.mo116881g().remove(str2);
                }
            }
            mo116881g().putBoolean(str, true).apply();
            MultiProcessMMKV g = mo116881g();
            g.putLong(str + "_PROCESS_START_TICK", Util.currentTicks()).apply();
            MultiProcessMMKV g2 = mo116881g();
            g2.remove(str + "_RUNNING_RESOURCE_PREPARING");
        }
    }

    /* renamed from: d */
    public void mo116880d(String str, C90709a aVar, long j) {
        mo116882i(str, aVar, j, C84187a.OK);
    }

    /* renamed from: g */
    public final MultiProcessMMKV mo116881g() {
        return MultiProcessMMKV.getMMKV("WAKeyStepKvLogger_RUNNING_PROCESS", 2);
    }

    /* renamed from: i */
    public final void mo116882i(String str, C90709a aVar, long j, C84187a aVar2) {
        String str2;
        long j2;
        String str3 = str;
        C90709a aVar3 = aVar;
        if (m103776e() && aVar3 != null && str3 != null) {
            if (DebuggerShell.f239772d) {
                SmcLogic.SetDebugFlag(true);
            }
            if (!mo116881g().getBoolean(str3, false) || (str2 = f245920b.get(str3)) == null) {
                return;
            }
            if (aVar3 instanceof C90715k) {
                WALifeCycleTimeAxisItemStruct j3 = m103779j(str2, str3, aVar3);
                j3.f236464g = j3.mo86045b("EventName", "StartUp", true);
                j3.f236465h = 0;
                j3.f236463f = Util.nowMilliSecond();
                m103778h(j3);
                return;
            }
            long j4 = 1;
            if (aVar3 instanceof C90714h) {
                WALifeCycleTimeAxisItemStruct j5 = m103779j(str2, str3, aVar3);
                j5.f236464g = j5.mo86045b("EventName", "StartUp", true);
                j5.f236465h = 1;
                j5.f236463f = Util.nowMilliSecond();
                m103778h(j5);
            } else if (C84188b.f245925a[aVar2.ordinal()] == 3) {
                MultiProcessMMKV g = mo116881g();
                if (!g.containsKey(str3 + "__SPLITOR_PROCESS_REPORTED_STARTED__" + aVar.name())) {
                    Log.m105924i("MicroMsg.AppBrand.WAKeyStepKvLogger", "onStepStart id:" + str3 + " step:" + aVar.name());
                    WALifeCycleTimeAxisItemStruct j6 = m103779j(str2, str3, aVar3);
                    j6.f236465h = 0;
                    j6.f236463f = Util.nowMilliSecond();
                    m103778h(j6);
                    MultiProcessMMKV g2 = mo116881g();
                    g2.putLong(str3 + "__SPLITOR_PROCESS_REPORTED_STARTED__" + aVar.name(), Util.nowMilliSecond());
                }
            } else {
                MultiProcessMMKV g3 = mo116881g();
                if (g3.containsKey(str3 + "__SPLITOR_PROCESS_REPORTED_STARTED__" + aVar.name())) {
                    long nowMilliSecond = Util.nowMilliSecond();
                    MultiProcessMMKV g4 = mo116881g();
                    j2 = nowMilliSecond - g4.getLong(str3 + "__SPLITOR_PROCESS_REPORTED_STARTED__" + aVar.name(), nowMilliSecond);
                } else {
                    j2 = j;
                }
                int ordinal = aVar2.ordinal();
                if (ordinal == 1) {
                    Log.m105924i("MicroMsg.AppBrand.WAKeyStepKvLogger", "onStepOK id:" + str3 + " step:" + aVar.name() + " cost:" + j2);
                } else if (ordinal == 2) {
                    Log.m105924i("MicroMsg.AppBrand.WAKeyStepKvLogger", "onStepFail id:" + str3 + " step:" + aVar.name() + " cost:" + j2);
                }
                if (j2 > 0) {
                    WALifeCycleTimeAxisItemStruct j7 = m103779j(str2, str3, aVar3);
                    if (C84187a.OK != aVar2) {
                        j4 = 3;
                    }
                    j7.f236465h = j4;
                    j7.f236463f = Util.nowMilliSecond();
                    m103778h(j7);
                    MultiProcessMMKV g5 = mo116881g();
                    if (!g5.containsKey(str3 + "__SPLITOR_PROCESS_REPORTED_STARTED__" + aVar.name())) {
                        WALifeCycleTimeAxisItemStruct j8 = m103779j(str2, str3, aVar3);
                        j8.f236465h = 0;
                        j8.f236463f = Util.nowMilliSecond() - j2;
                        m103778h(j8);
                        return;
                    }
                    return;
                }
                WALifeCycleTimeAxisItemStruct j9 = m103779j(str2, str3, aVar3);
                j9.f236465h = 2;
                j9.f236463f = Util.nowMilliSecond();
                m103778h(j9);
            }
        }
    }

    /* renamed from: k */
    public final void mo116883k(String str, String str2) {
        C87412m.m108594g(str2, "instanceId");
        if (!(str == null || str.length() == 0)) {
            f245920b.put(str, str2);
        }
    }

    /* renamed from: l */
    public final void mo116884l(C78250j jVar) {
        Iterable<C78250j> iterable = jVar.f229220b;
        if (iterable == null) {
            iterable = C64186f0.f181907d;
        }
        for (C78250j jVar2 : iterable) {
            List<C78250j> list = jVar2.f229220b;
            if (!(list == null || list.isEmpty())) {
                f245919a.mo116884l(jVar2);
            }
            if (jVar.mo108265b() != null) {
                ConcurrentHashMap<C90709a, C90709a> concurrentHashMap = f245921c;
                C90709a b = jVar2.mo108265b();
                C87412m.m108591d(b);
                C90709a b2 = jVar.mo108265b();
                C87412m.m108591d(b2);
                concurrentHashMap.put(b, b2);
            }
        }
    }
}
