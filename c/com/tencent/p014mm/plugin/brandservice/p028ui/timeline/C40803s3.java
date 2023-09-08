package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.s3 */
public final class C40803s3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ BizTimeLineSettingUI f109673d;

    public C40803s3(BizTimeLineSettingUI bizTimeLineSettingUI) {
        this.f109673d = bizTimeLineSettingUI;
    }

    public final void run() {
        BizTimeLineSettingUI bizTimeLineSettingUI = this.f109673d;
        if (bizTimeLineSettingUI.f109277h && !bizTimeLineSettingUI.isFinishing()) {
            BizTimeLineSettingUI.m43920H7(this.f109673d);
        }
    }
}
