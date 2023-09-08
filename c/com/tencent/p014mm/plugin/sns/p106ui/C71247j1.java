package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.j1 */
public class C71247j1 implements Runnable {
    public C71247j1(C71253l1 l1Var) {
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener$1");
        C71253l1.m83680a();
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener$1");
    }
}
