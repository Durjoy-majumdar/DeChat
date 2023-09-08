package com.tencent.p014mm.plugin.sns.p106ui.item;

import android.app.Activity;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.sns.ui.item.f */
public class C95923f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C95917e f280078d;

    public C95923f(C95917e eVar) {
        this.f280078d = eVar;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$4");
        Activity activity = this.f280078d.f279904e;
        if (activity == null || activity.isFinishing()) {
            Log.m105920e("MicroMsg.FullCardAdTimeLineItemNew", "onCompletion, postDelayed-run activity isFinished");
        } else {
            C95917e eVar = this.f280078d;
            SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
            eVar.f280068t = false;
            SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
            if (this.f280078d.f280067s) {
                this.f280078d.f280066r.f280077F0.f293369n.mo134011c(true);
                C95917e eVar2 = this.f280078d;
                eVar2.f280071w.mo139448i(eVar2.f280066r.f280077F0.f293355K.f293342c);
            }
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$4");
    }
}
