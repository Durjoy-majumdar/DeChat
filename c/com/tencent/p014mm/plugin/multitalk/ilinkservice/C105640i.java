package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.plugin.multitalk.model.MultiTalkManager;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.i */
public class C105640i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f314129d;

    /* renamed from: e */
    public final /* synthetic */ Object f314130e;

    /* renamed from: f */
    public final /* synthetic */ C105608d f314131f;

    public C105640i(C105608d dVar, int i, Object obj) {
        this.f314131f = dVar;
        this.f314129d = i;
        this.f314130e = obj;
    }

    public void run() {
        MultiTalkManager multiTalkManager = this.f314131f.f314075a;
        if (multiTalkManager != null) {
            multiTalkManager.mo150631H(this.f314129d, this.f314130e);
        }
    }
}
