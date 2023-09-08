package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.performance.watchdogs.MemoryWatchDog;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import p757xv.C91353u;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$s */
public class SnsTimeLineUI$$s implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsTimeLineUI f249097d;

    public SnsTimeLineUI$$s(SnsTimeLineUI snsTimeLineUI) {
        this.f249097d = snsTimeLineUI;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$38");
        Log.m105925i("MicroMsg.SnsTimeLineUI", "%s", ((MemoryWatchDog) ((C91353u) C86312j.m106911c(C91353u.class)).mo112623CU()).mo118581g());
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$38");
    }
}
