package ft2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

public final /* synthetic */ class c$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f287354d;

    public /* synthetic */ c$$a(long j) {
        this.f287354d = j;
    }

    public final void run() {
        long j = this.f287354d;
        SnsMethodCalculate.markStartTimeMs("lambda$recordClickExceprtReadOrigin$1", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        if (C97979c.f287345j.containsKey(Long.valueOf(j))) {
            C97979c.f287345j.get(Long.valueOf(j)).getClass();
        }
        SnsMethodCalculate.markEndTimeMs("lambda$recordClickExceprtReadOrigin$1", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
    }
}
