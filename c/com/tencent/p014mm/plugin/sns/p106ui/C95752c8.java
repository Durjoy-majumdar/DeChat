package com.tencent.p014mm.plugin.sns.p106ui;

import android.widget.ListView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.sns.ui.c8 */
public final class C95752c8 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C95761d8 f279286d;

    /* renamed from: e */
    public final /* synthetic */ ListView f279287e;

    public C95752c8(C95761d8 d8Var, ListView listView) {
        this.f279286d = d8Var;
        this.f279287e = listView;
    }

    public final void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsWsFoldAutoPlayManager$startAutoPlayWithDelay$1");
        Log.m105924i("MicroMsg.SnsWsFoldAutoPlayManager", "startAutoPlayWithDelay");
        this.f279286d.mo133218a(this.f279287e);
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsWsFoldAutoPlayManager$startAutoPlayWithDelay$1");
    }
}
