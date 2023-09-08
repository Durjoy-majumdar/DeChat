package com.tencent.p014mm.plugin.game.luggage.page;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.game.luggage.page.k */
public class C41968k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C41962j f113053d;

    public C41968k(C41962j jVar) {
        this.f113053d = jVar;
    }

    public void run() {
        Log.m105925i("MicroMsg.GameWebCoreImpl", "reloadUrl, url:%s", this.f113053d.f113037E);
        C41962j jVar = this.f113053d;
        jVar.loadUrl(jVar.f113037E, jVar.f113038F);
    }
}
