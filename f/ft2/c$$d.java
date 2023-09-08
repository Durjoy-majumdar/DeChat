package ft2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import java.util.HashSet;

public class c$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsInfo f287356d;

    /* renamed from: e */
    public final /* synthetic */ int f287357e;

    public c$$d(SnsInfo snsInfo, int i) {
        this.f287356d = snsInfo;
        this.f287357e = i;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter$6");
        SnsInfo snsInfo = this.f287356d;
        if (snsInfo != null) {
            long j = snsInfo.field_snsId;
            if (C97979c.m126543b().containsKey(Long.valueOf(j))) {
                c$$e c__e = (c$$e) C97979c.m126543b().get(Long.valueOf(j));
                if (c__e.f287360c == null) {
                    c__e.f287360c = new HashSet<>();
                }
                if (!c__e.f287360c.contains(Integer.valueOf(this.f287357e + 1))) {
                    c__e.f287360c.add(Integer.valueOf(this.f287357e + 1));
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter$6");
    }
}
