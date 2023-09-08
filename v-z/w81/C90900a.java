package w81;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import h81.C32735h;
import j81.C87906e;

/* renamed from: w81.a */
public class C90900a {

    /* renamed from: a */
    public static Boolean f260887a = null;

    /* renamed from: b */
    public static String f260888b = "";

    /* renamed from: a */
    public static boolean m114028a() {
        if (f260887a == null) {
            if (C87906e.m109415i()) {
                f260887a = Boolean.TRUE;
            } else {
                f260887a = Boolean.valueOf(((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_edge_computing_is_monitor_performance, false));
            }
            Log.m105924i("EdgeComputingMonitor", "[EdgeComputingMonitor] getMonitorPerformanceSwitch sMonitorSwitch : " + f260887a);
        }
        return f260887a.booleanValue();
    }

    /* renamed from: b */
    public static void m114029b(String str, int i, long j) {
        if (m114028a()) {
            C115669n.INSTANCE.mo160131h(20177, str, Integer.valueOf(i), Long.valueOf(j));
        }
        C87906e.m109408b("EdgeComputingMonitor", "[EdgeComputingMonitor] monitorProcess configID : %s, process : %d, reportTimeEC : %d", str, Integer.valueOf(i), Long.valueOf(j));
    }

    /* renamed from: c */
    public static void m114030c(long j, int i) {
        if (j <= 10) {
            C115669n.INSTANCE.idkeyStat(1409, 26, 1, false);
        } else if (j <= 100) {
            C115669n.INSTANCE.idkeyStat(1409, 27, 1, false);
        } else if (j <= 1000) {
            C115669n.INSTANCE.idkeyStat(1409, 28, 1, false);
        } else {
            C115669n.INSTANCE.idkeyStat(1409, 29, 1, false);
        }
        if (j <= 1000) {
            C115669n nVar = C115669n.INSTANCE;
            nVar.idkeyStat(1409, 53, j, false);
            nVar.idkeyStat(1409, 54, 1, false);
        }
        C115669n nVar2 = C115669n.INSTANCE;
        nVar2.idkeyStat(1409, 98, 1, false);
        if (m114028a()) {
            nVar2.mo160131h(20176, f260888b, 5, Long.valueOf(j), Integer.valueOf(i), "");
        }
        C87906e.m109408b("EdgeComputingMonitor", "[EdgeComputingMonitor] statJsApiCostTime configID : %s, costTime : %d, type : %d", f260888b, Long.valueOf(j), Integer.valueOf(i));
    }

    /* renamed from: d */
    public static void m114031d(int i) {
        if (i == 1) {
            C115669n.INSTANCE.idkeyStat(1409, 38, 1, false);
        } else if (i == 2) {
            C115669n.INSTANCE.idkeyStat(1409, 30, 1, false);
        } else if (i == 3) {
            C115669n.INSTANCE.idkeyStat(1409, 31, 1, false);
        } else if (i == 4) {
            C115669n.INSTANCE.idkeyStat(1409, 32, 1, false);
        } else if (i == 5) {
            C115669n.INSTANCE.idkeyStat(1409, 33, 1, false);
        } else {
            return;
        }
        C87906e.m109407a("EdgeComputingMonitor", "[EdgeComputingMonitor] statRealReportProcess reportProcess : " + i);
    }

    /* renamed from: e */
    public static void m114032e(String str, long j) {
        if (m114028a()) {
            C115669n.INSTANCE.mo160131h(20176, str, 11, 0, Long.valueOf(j), "");
        }
    }

    /* renamed from: f */
    public static void m114033f(boolean z) {
        boolean z2 = z;
        if (z2) {
            C115669n.INSTANCE.idkeyStat(1409, 20, 1, false);
        } else {
            C115669n.INSTANCE.idkeyStat(1409, 21, 1, false);
        }
        C115669n.INSTANCE.idkeyStat(1409, 55, 1, false);
        C87906e.m109407a("EdgeComputingMonitor", "[EdgeComputingMonitor] statScriptConfigParseError success : " + z2);
    }

    /* renamed from: g */
    public static void m114034g(boolean z) {
        boolean z2 = z;
        if (z2) {
            C115669n.INSTANCE.idkeyStat(1409, 177, 1, false);
        } else {
            C115669n.INSTANCE.idkeyStat(1409, 178, 1, false);
        }
        C115669n.INSTANCE.idkeyStat(1409, 179, 1, false);
        C87906e.m109407a("EdgeComputingMonitor", "[EdgeComputingMonitor] statScriptDownloadSuccess success : " + z2);
    }

    /* renamed from: h */
    public static void m114035h(boolean z) {
        boolean z2 = z;
        if (z2) {
            C115669n.INSTANCE.idkeyStat(1409, 24, 1, false);
        } else {
            C115669n.INSTANCE.idkeyStat(1409, 25, 1, false);
        }
        C115669n.INSTANCE.idkeyStat(1409, 37, 1, false);
        C87906e.m109407a("EdgeComputingMonitor", "[EdgeComputingMonitor] statV8ScriptEngineInitError success : " + z2);
    }

    /* renamed from: i */
    public static void m114036i(boolean z) {
        boolean z2 = z;
        if (z2) {
            C115669n.INSTANCE.idkeyStat(1409, 22, 1, false);
        } else {
            C115669n.INSTANCE.idkeyStat(1409, 23, 1, false);
        }
        C115669n.INSTANCE.idkeyStat(1409, 36, 1, false);
        C87906e.m109407a("EdgeComputingMonitor", "[EdgeComputingMonitor] statSqlConfigParseError success : " + z2);
    }

    /* renamed from: j */
    public static void m114037j(String str, long j, int i) {
        if (j <= 10) {
            C115669n.INSTANCE.idkeyStat(1409, 8, 1, false);
        } else if (j <= 100) {
            C115669n.INSTANCE.idkeyStat(1409, 9, 1, false);
        } else if (j <= 1000) {
            C115669n.INSTANCE.idkeyStat(1409, 10, 1, false);
        } else {
            C115669n.INSTANCE.idkeyStat(1409, 11, 1, false);
        }
        if (j <= 1000) {
            C115669n nVar = C115669n.INSTANCE;
            nVar.idkeyStat(1409, 45, j, false);
            nVar.idkeyStat(1409, 46, 1, false);
        }
        C115669n nVar2 = C115669n.INSTANCE;
        nVar2.idkeyStat(1409, 91, 1, false);
        if (m114028a()) {
            nVar2.mo160131h(20176, str, 2, Long.valueOf(j), Integer.valueOf(i), "");
        }
        C87906e.m109408b("EdgeComputingMonitor", "[EdgeComputingMonitor] statStorageCostTime configID : %s, costTime : %d, dataSzie : %d", str, Long.valueOf(j), Integer.valueOf(i));
    }
}
