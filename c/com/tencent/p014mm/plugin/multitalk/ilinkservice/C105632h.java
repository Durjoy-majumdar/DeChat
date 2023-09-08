package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p1102pb.talkroom.sdk.MultiTalkGroup;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.h */
public class C105632h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C105689s f314115d;

    /* renamed from: e */
    public final /* synthetic */ C105608d f314116e;

    public C105632h(C105608d dVar, C105689s sVar) {
        this.f314116e = dVar;
        this.f314115d = sVar;
    }

    public void run() {
        C105608d dVar = this.f314116e;
        if (dVar.f314075a != null) {
            MultiTalkGroup a = dVar.mo150488a(this.f314115d);
            this.f314116e.f314075a.mo150658e(a, Boolean.TRUE);
            this.f314116e.f314075a.mo150628E(a);
        }
    }
}
