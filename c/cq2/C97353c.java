package cq2;

import com.tencent.p014mm.plugin.sns.p104ad.widget.living.C94762a;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import io2.C98771b;

/* renamed from: cq2.c */
public class C97353c implements C98771b.C98772a {
    public C97353c(C97354d dVar) {
    }

    /* renamed from: a */
    public void mo130218a(String str, int i, int i2, Object obj) {
        SnsMethodCalculate.markStartTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager$3");
        try {
            Log.m105924i("SnsAd.DynamicUpdate", "the requestFinderLivingState return errorCode is  " + i2);
            if (i2 == 0 && (obj instanceof Integer)) {
                Log.m105924i("SnsAd.DynamicUpdate", "requestFinderLivingState, the snsId is " + str + ", livingStatus is " + obj);
                C94762a.m120038g(str, ((Integer) obj).intValue());
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager$3");
    }
}
