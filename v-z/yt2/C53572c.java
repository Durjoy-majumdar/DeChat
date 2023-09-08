package yt2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: yt2.c */
public enum C53572c {
    ALBUM(1),
    RECORD(3),
    FINDER(6),
    SECOND_CUT(7);
    

    /* renamed from: d */
    public final int f150568d;

    /* access modifiers changed from: public */
    C53572c(int i) {
        this.f150568d = i;
    }

    /* renamed from: a */
    public final int mo74217a() {
        SnsMethodCalculate.markStartTimeMs("getValue", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.EntranceType");
        int i = this.f150568d;
        SnsMethodCalculate.markEndTimeMs("getValue", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.EntranceType");
        return i;
    }
}
