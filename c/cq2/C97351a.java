package cq2;

import com.tencent.p014mm.plugin.sns.p104ad.widget.living.C94762a;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.List;
import te3.C49364f2;

/* renamed from: cq2.a */
public class C97351a implements C45147e {
    public C97351a(C97354d dVar) {
    }

    /* renamed from: a */
    public void mo70652a(int i, String str, List<C49364f2> list) {
        SnsMethodCalculate.markStartTimeMs("onResponse", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager$1");
        int i2 = -1;
        if (i == 0) {
            try {
                i2 = C94762a.m120037d(str, list);
            } catch (Throwable unused) {
            }
        }
        Log.m105918d("SnsAd.DynamicUpdate", "doWeAppLivingRequest::sns id is " + str + ", the status is " + i2);
        SnsMethodCalculate.markEndTimeMs("onResponse", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager$1");
    }
}
