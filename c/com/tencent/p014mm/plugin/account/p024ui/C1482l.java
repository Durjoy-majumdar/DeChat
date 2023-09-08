package com.tencent.p014mm.plugin.account.p024ui;

/* renamed from: com.tencent.mm.plugin.account.ui.l */
public class C1482l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ BaseLoginVoiceUI f10828d;

    public C1482l(BaseLoginVoiceUI baseLoginVoiceUI) {
        this.f10828d = baseLoginVoiceUI;
    }

    public void run() {
        this.f10828d.finish();
        this.f10828d.overridePendingTransition(-1, -1);
    }
}
