package rq2;

import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: rq2.r */
public class C101431r {
    /* renamed from: a */
    public static void m133118a(SnsAdClick snsAdClick, int i) {
        SnsMethodCalculate.markStartTimeMs("setSnsAdClickAction", "com.tencent.mm.plugin.sns.ad.utils.SnsAdClickUtil");
        if (snsAdClick != null) {
            snsAdClick.f267473h = i;
        }
        SnsMethodCalculate.markEndTimeMs("setSnsAdClickAction", "com.tencent.mm.plugin.sns.ad.utils.SnsAdClickUtil");
    }
}
