package com.tencent.p014mm.app;

/* renamed from: com.tencent.mm.app.c$a$$a */
public final /* synthetic */ class c$a$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C114661d0 f343500d;

    /* renamed from: e */
    public final /* synthetic */ String f343501e;

    public /* synthetic */ c$a$$a(C114661d0 d0Var, String str) {
        this.f343500d = d0Var;
        this.f343501e = str;
    }

    public final void run() {
        this.f343500d.onAppBackground(this.f343501e);
    }
}
