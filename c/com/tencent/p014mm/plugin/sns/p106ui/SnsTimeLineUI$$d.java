package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import ft2.C97979c;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$d */
public class SnsTimeLineUI$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsTimeLineUI f278736d;

    public SnsTimeLineUI$$d(SnsTimeLineUI snsTimeLineUI) {
        this.f278736d = snsTimeLineUI;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$1");
        C97979c J7 = SnsTimeLineUI.m122282J7(this.f278736d);
        if (J7 != null) {
            if (C94866e1.fy0().f275362q == 1) {
                SnsTimeLineUI snsTimeLineUI = this.f278736d;
                long h = J7.mo137293h(true);
                SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                snsTimeLineUI.f278700y0 = h;
                SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            }
            J7.mo137295j().mo137874k();
            J7.mo137295j().notifyVendingDataChange();
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$1");
    }
}
