package com.tencent.p014mm.plugin.taskbar.p110ui;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.taskbar.ui.n */
public class C71337n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C71331l f206632d;

    public C71337n(C71331l lVar) {
        this.f206632d = lVar;
    }

    public void run() {
        Log.m105924i("MicroMsg.TaskBarAnimController", "alvinluo setIgnoreInLayout false");
        this.f206632d.f206588V = false;
    }
}
