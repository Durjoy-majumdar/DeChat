package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.x8 */
public class C96316x8 extends BaseTimeLine {
    public C96316x8(Context context) {
        super(context, 2, "", 0, "");
        SnsMethodCalculate.markStartTimeMs("setLoadingEndInvisible", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        this.f276704n = false;
        SnsMethodCalculate.markEndTimeMs("setLoadingEndInvisible", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
    }

    /* renamed from: o */
    public int mo132093o() {
        SnsMethodCalculate.markStartTimeMs("timelineScene", "com.tencent.mm.plugin.sns.ui.WsFoldDetailTimeLine");
        SnsMethodCalculate.markEndTimeMs("timelineScene", "com.tencent.mm.plugin.sns.ui.WsFoldDetailTimeLine");
        return 1;
    }
}
