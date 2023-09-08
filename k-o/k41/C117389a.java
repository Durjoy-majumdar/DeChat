package k41;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import h81.C32735h;
import java.util.ArrayList;
import m41.C117534a;
import u24.C90599h;

/* renamed from: k41.a */
public class C117389a {

    /* renamed from: a */
    public static Boolean f351432a;

    /* renamed from: b */
    public static int f351433b;

    /* renamed from: c */
    public static int f351434c;

    /* renamed from: d */
    public static int f351435d;

    /* renamed from: e */
    public static int f351436e;

    /* renamed from: a */
    public static boolean m165527a() {
        if (f351432a == null) {
            f351432a = Boolean.valueOf(((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_data_report_is_open_performance_report, false));
            Log.m105924i("DataReportPerformanceReport", "[isOpenPerformanceReport] mIsOpenPerformanceReport : " + f351432a);
        }
        if (C117534a.m165786i()) {
            f351432a = Boolean.TRUE;
        }
        return f351432a.booleanValue();
    }

    /* renamed from: b */
    public static void m165528b(String str) {
        if (m165527a() && !C90599h.m113511d(str)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("2");
            arrayList.add(str.replace(",", "`"));
            C115669n.INSTANCE.mo160137l(24504, arrayList);
        }
    }
}
