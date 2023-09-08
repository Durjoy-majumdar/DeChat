package rq2;

import android.os.Bundle;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;

/* renamed from: rq2.n */
public class C101428n extends IntentUtil {
    /* renamed from: a */
    public static double m133107a(Bundle bundle, String str, double d) {
        SnsMethodCalculate.markStartTimeMs("getDouble", "com.tencent.mm.plugin.sns.ad.utils.IntentUtilEx");
        if (bundle == null) {
            SnsMethodCalculate.markEndTimeMs("getDouble", "com.tencent.mm.plugin.sns.ad.utils.IntentUtilEx");
            return d;
        }
        try {
            d = bundle.getDouble(str, d);
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("getDouble", "com.tencent.mm.plugin.sns.ad.utils.IntentUtilEx");
        return d;
    }
}
