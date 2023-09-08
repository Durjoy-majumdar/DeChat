package bs2;

import as2.C92086h;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import java.util.HashMap;

/* renamed from: bs2.a */
public class C92301a {
    /* renamed from: a */
    public static void m116078a(int i, SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("report", "com.tencent.mm.plugin.sns.lucky.report.ReportReceiveQunZhong");
        SnsMethodCalculate.markStartTimeMs("report", "com.tencent.mm.plugin.sns.lucky.report.ReportReceiveQunZhong");
        if (snsInfo == null) {
            SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.lucky.report.ReportReceiveQunZhong");
        } else {
            String str = snsInfo.getTimeLine().f283893Id;
            if (i == 2) {
                C92086h.m115754a(snsInfo);
            }
            ThreadLocal<HashMap<String, Long>> threadLocal = C92086h.f263636a;
            SnsMethodCalculate.markStartTimeMs("getTotalMoney", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
            C92086h.m115758e(snsInfo, (SnsObject) null);
            SnsMethodCalculate.markEndTimeMs("getTotalMoney", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
            System.currentTimeMillis();
            SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.lucky.report.ReportReceiveQunZhong");
        }
        SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.lucky.report.ReportReceiveQunZhong");
    }
}
