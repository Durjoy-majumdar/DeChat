package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.j2 */
public class C95970j2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f280239d;

    /* renamed from: e */
    public final /* synthetic */ SightVideoFullScreenView f280240e;

    public C95970j2(SightVideoFullScreenView sightVideoFullScreenView, int i) {
        this.f280240e = sightVideoFullScreenView;
        this.f280239d = i;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$3");
        SightVideoFullScreenView.m121760h(this.f280240e).seek(this.f280239d);
        SightVideoFullScreenView sightVideoFullScreenView = this.f280240e;
        SightVideoFullScreenView.m121756d(sightVideoFullScreenView, SightVideoFullScreenView.m121754b(sightVideoFullScreenView).mo132290h());
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$3");
    }
}
