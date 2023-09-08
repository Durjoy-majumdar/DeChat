package com.tencent.p014mm.p136ui.chatting.viewitems;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.m7$$e$$b */
public final /* synthetic */ class m7$$e$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C74123m7 f217580d;

    /* renamed from: e */
    public final /* synthetic */ int f217581e;

    public /* synthetic */ m7$$e$$b(C74123m7 m7Var, int i) {
        this.f217580d = m7Var;
        this.f217581e = i;
    }

    public final void run() {
        C74123m7 m7Var = this.f217580d;
        m7Var.f217572s.setProgress(this.f217581e);
    }
}
