package hu2;

import com.tencent.p014mm.autogen.mmdata.rpt.SnsMethodReportStruct;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import java.util.Map;
import p156gj.C87203t;
import z04.C112551y;
import zt3.C119157j;

/* renamed from: hu2.b */
public final class C98534b {

    /* renamed from: a */
    public static final C98534b f288944a = new C98534b();

    /* renamed from: b */
    public static final HashMap<Integer, SnsMethodReportStruct> f288945b = new HashMap<>();

    /* renamed from: c */
    public static String f288946c = "";

    /* renamed from: d */
    public static int f288947d = -1;

    /* renamed from: hu2.b$a */
    public static final class C98535a implements Runnable {

        /* renamed from: d */
        public static final C98535a f288948d = new C98535a();

        public final void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport$1");
            Map<String, String> d = C87203t.m108268d();
            C98534b bVar = C98534b.f288944a;
            String str = (String) ((HashMap) d).get("hardware");
            String n = str != null ? C112551y.m153814n(str, ",", ";", false) : "";
            SnsMethodCalculate.markStartTimeMs("access$setCpuName$p", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
            C98534b.f288946c = n;
            SnsMethodCalculate.markEndTimeMs("access$setCpuName$p", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
            StringBuilder sb = new StringBuilder();
            sb.append("get cpu name:");
            C98534b bVar2 = C98534b.f288944a;
            SnsMethodCalculate.markStartTimeMs("getCpuName", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
            String str2 = C98534b.f288946c;
            SnsMethodCalculate.markEndTimeMs("getCpuName", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
            sb.append(str2);
            Log.m105924i("MicroMsg.SnsMethodReport", sb.toString());
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport$1");
        }
    }

    static {
        ((C119157j) C119157j.f356862d).mo183875f(C98535a.f288948d);
    }

    /* renamed from: a */
    public final void mo137890a(int i) {
        SnsMethodCalculate.markStartTimeMs("check", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
        HashMap<Integer, SnsMethodReportStruct> hashMap = f288945b;
        if (!hashMap.containsKey(Integer.valueOf(i))) {
            hashMap.put(Integer.valueOf(i), new SnsMethodReportStruct());
        }
        SnsMethodCalculate.markEndTimeMs("check", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
    }
}
