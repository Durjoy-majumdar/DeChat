package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.h4 */
public class C18202h4 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ BizTimeLineUI f50304d;

    public C18202h4(BizTimeLineUI bizTimeLineUI) {
        this.f50304d = bizTimeLineUI;
    }

    public void run() {
        if (!this.f50304d.activityHasDestroyed() && !this.f50304d.isFinishing()) {
            BizTimeLineUI.m18783H7(this.f50304d);
        }
    }
}
