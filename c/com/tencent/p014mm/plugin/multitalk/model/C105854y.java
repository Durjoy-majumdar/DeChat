package com.tencent.p014mm.plugin.multitalk.model;

/* renamed from: com.tencent.mm.plugin.multitalk.model.y */
public class C105854y implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MultiTalkManager f314832d;

    public C105854y(MultiTalkManager multiTalkManager) {
        this.f314832d = multiTalkManager;
    }

    public void run() {
        MultiTalkManager multiTalkManager = this.f314832d;
        multiTalkManager.f314475Q0.postValue(multiTalkManager.f314513y0);
    }
}
