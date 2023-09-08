package ft2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

public final /* synthetic */ class c$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f287355d;

    public /* synthetic */ c$$b(long j) {
        this.f287355d = j;
    }

    public final void run() {
        long j = this.f287355d;
        SnsMethodCalculate.markStartTimeMs("lambda$recordClickExceprtBigImg$0", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        if (C97979c.f287345j.containsKey(Long.valueOf(j))) {
            C97979c.f287345j.get(Long.valueOf(j)).getClass();
        }
        SnsMethodCalculate.markEndTimeMs("lambda$recordClickExceprtBigImg$0", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
    }
}
