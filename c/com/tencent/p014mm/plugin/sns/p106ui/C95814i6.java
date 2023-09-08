package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.i6 */
public class C95814i6 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsTimeLineUI.C9564821 f279574d;

    public C95814i6(SnsTimeLineUI.C9564821 r1) {
        this.f279574d = r1;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$21$1");
        if (SnsTimeLineUI.m122282J7(SnsTimeLineUI.this) != null) {
            SnsTimeLineUI.m122282J7(SnsTimeLineUI.this).mo133186F0("");
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$21$1");
    }
}
