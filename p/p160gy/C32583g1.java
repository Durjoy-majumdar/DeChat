package p160gy;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import di3.C86301e;
import ei3.C86522b;
import kv2.C34071b;
import p166hy.C8831u0;

@C86522b
/* renamed from: gy.g1 */
public class C32583g1 extends C86301e implements C8831u0 {
    /* renamed from: ba */
    public String mo9674ba(String str) {
        SnsMethodCalculate.markStartTimeMs("getAppWaid", "com.tencent.mm.feature.sns.WaidHelperService");
        String d = C34071b.m40230d(str);
        SnsMethodCalculate.markEndTimeMs("getAppWaid", "com.tencent.mm.feature.sns.WaidHelperService");
        return d;
    }

    public int dc0(String str) {
        SnsMethodCalculate.markStartTimeMs("parseWaidFromJsApi", "com.tencent.mm.feature.sns.WaidHelperService");
        SnsMethodCalculate.markStartTimeMs("parseWaidFromJsApi", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        SnsMethodCalculate.markEndTimeMs("parseWaidFromJsApi", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        SnsMethodCalculate.markEndTimeMs("parseWaidFromJsApi", "com.tencent.mm.feature.sns.WaidHelperService");
        return 0;
    }
}
