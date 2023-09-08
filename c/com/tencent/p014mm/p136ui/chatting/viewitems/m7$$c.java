package com.tencent.p014mm.p136ui.chatting.viewitems;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.m7$$c */
public final /* synthetic */ class m7$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C74123m7 f217586d;

    /* renamed from: e */
    public final /* synthetic */ int f217587e;

    public /* synthetic */ m7$$c(C74123m7 m7Var, int i) {
        this.f217586d = m7Var;
        this.f217587e = i;
    }

    public final void run() {
        C74123m7 m7Var = this.f217586d;
        m7Var.f217572s.setProgress(this.f217587e);
    }
}
