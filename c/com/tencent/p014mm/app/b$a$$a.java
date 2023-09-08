package com.tencent.p014mm.app;

/* renamed from: com.tencent.mm.app.b$a$$a */
public final /* synthetic */ class b$a$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C114661d0 f343495d;

    /* renamed from: e */
    public final /* synthetic */ String f343496e;

    public /* synthetic */ b$a$$a(C114661d0 d0Var, String str) {
        this.f343495d = d0Var;
        this.f343496e = str;
    }

    public final void run() {
        this.f343495d.onAppForeground(this.f343496e);
    }
}
