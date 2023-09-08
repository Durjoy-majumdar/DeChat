package lo2;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.C30419z;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import java.net.URLEncoder;
import java.util.LinkedList;
import pe3.C89349b;
import te3.C50339m2;
import vr2.C102236a0;

/* renamed from: lo2.y0 */
public final class C34323y0 {

    /* renamed from: lo2.y0$a */
    public static class C34324a {

        /* renamed from: a */
        public LinkedList<C50339m2> f92481a = new LinkedList<>();

        /* renamed from: b */
        public static C34324a m40328b() {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.helper.SnsAdLogItemReportHelper$AdDelReqBuilder");
            C34324a aVar = new C34324a();
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.helper.SnsAdLogItemReportHelper$AdDelReqBuilder");
            return aVar;
        }

        /* renamed from: a */
        public C34324a mo59560a(String str, String str2, int i, int i2) {
            SnsMethodCalculate.markStartTimeMs("appendDelLogItem", "com.tencent.mm.plugin.sns.ad.helper.SnsAdLogItemReportHelper$AdDelReqBuilder");
            try {
                C50339m2 m2Var = new C50339m2();
                m2Var.f137758d = 13298;
                m2Var.f137760f = System.currentTimeMillis() / 1000;
                String str3 = "";
                if (!TextUtils.isEmpty(str)) {
                    str3 = URLEncoder.encode(str, "UTF-8");
                }
                String str4 = str3 + "," + i + "," + i2 + "," + str2;
                m2Var.f137759e = new C89349b(str4.getBytes());
                this.f92481a.add(m2Var);
                Log.m105924i("SnsAdLogItemReportHelper", "add logItem:" + str4);
            } catch (Throwable th) {
                Log.m105920e("SnsAdLogItemReportHelper", "appendDelLogItem, exp=" + th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("appendDelLogItem", "com.tencent.mm.plugin.sns.ad.helper.SnsAdLogItemReportHelper$AdDelReqBuilder");
            return this;
        }

        /* renamed from: c */
        public void mo59561c() {
            SnsMethodCalculate.markStartTimeMs("report", "com.tencent.mm.plugin.sns.ad.helper.SnsAdLogItemReportHelper$AdDelReqBuilder");
            C34323y0.m40326a(this.f92481a);
            SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.ad.helper.SnsAdLogItemReportHelper$AdDelReqBuilder");
        }
    }

    /* renamed from: a */
    public static void m40326a(LinkedList<C50339m2> linkedList) {
        SnsMethodCalculate.markStartTimeMs("report", "com.tencent.mm.plugin.sns.ad.helper.SnsAdLogItemReportHelper");
        if (linkedList.size() > 0) {
            Log.m105924i("SnsAdLogItemReportHelper", "report, logList.size=" + linkedList.size());
            try {
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123460f(new C30419z(linkedList));
            } catch (Throwable th) {
                Log.m105920e("SnsAdLogItemReportHelper", "report, exp=" + th.toString());
            }
        } else {
            Log.m105920e("SnsAdLogItemReportHelper", "report, logList.size=0");
        }
        SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.ad.helper.SnsAdLogItemReportHelper");
    }

    /* renamed from: b */
    public static void m40327b(String str, int i, long j) {
        SnsMethodCalculate.markStartTimeMs("reportAdLiftLog", "com.tencent.mm.plugin.sns.ad.helper.SnsAdLogItemReportHelper");
        try {
            C115669n.INSTANCE.mo175911u(1941, i);
            LinkedList linkedList = new LinkedList();
            C50339m2 m2Var = new C50339m2();
            m2Var.f137758d = 13298;
            m2Var.f137760f = System.currentTimeMillis() / 1000;
            String q0 = C102236a0.m134765q0(j);
            String str2 = "";
            if (!TextUtils.isEmpty(str)) {
                str2 = URLEncoder.encode(str, "UTF-8");
            }
            m2Var.f137759e = new C89349b((str2 + "," + 5 + "," + i + "," + q0).getBytes());
            linkedList.add(m2Var);
            m40326a(linkedList);
            Log.m105924i("SnsAdLogItemReportHelper", "reportAdLiftLog() called with: uxinfo = [" + str + "], code = [" + i + "], snsId = [" + j + "]");
        } catch (Throwable th) {
            Log.m105920e("SnsAdLogItemReportHelper", "reportAdLiftLog, error" + th.getMessage());
        }
        SnsMethodCalculate.markEndTimeMs("reportAdLiftLog", "com.tencent.mm.plugin.sns.ad.helper.SnsAdLogItemReportHelper");
    }
}
