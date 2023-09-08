package as2;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: as2.b */
public class C28125b {
    /* renamed from: a */
    public static void m38099a(int i) {
        SnsMethodCalculate.markStartTimeMs("report", "com.tencent.mm.plugin.sns.lucky.model.ConstantsLuckyIDKEY");
        C115669n.INSTANCE.idkeyStat(270, (long) i, 1, true);
        SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.lucky.model.ConstantsLuckyIDKEY");
    }
}
