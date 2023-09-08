package ft2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import java.util.HashSet;

/* renamed from: ft2.f */
public class C97981f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsInfo f287372d;

    /* renamed from: e */
    public final /* synthetic */ int f287373e;

    public C97981f(SnsInfo snsInfo, int i) {
        this.f287372d = snsInfo;
        this.f287373e = i;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter$5");
        SnsInfo snsInfo = this.f287372d;
        if (snsInfo != null) {
            long j = snsInfo.field_snsId;
            if (C97979c.m126543b().containsKey(Long.valueOf(j))) {
                c$$e c__e = (c$$e) C97979c.m126543b().get(Long.valueOf(j));
                if (c__e.f287363f == 0) {
                    c__e.f287363f = this.f287373e + 1;
                }
                if (c__e.f287359b == null) {
                    c__e.f287359b = new HashSet<>();
                }
                c__e.f287359b.add(Integer.valueOf(this.f287373e + 1));
            }
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter$5");
    }
}
