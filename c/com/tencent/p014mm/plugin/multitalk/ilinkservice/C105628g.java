package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.plugin.multitalk.model.MultiTalkManager;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.g */
public class C105628g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C105608d f314108d;

    public C105628g(C105608d dVar) {
        this.f314108d = dVar;
    }

    public void run() {
        MultiTalkManager multiTalkManager = this.f314108d.f314075a;
        if (multiTalkManager != null) {
            multiTalkManager.mo150660f(false, false);
        }
    }
}
