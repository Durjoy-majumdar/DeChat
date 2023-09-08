package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.Intent;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.u1 */
public class C105431u1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ IPCallTalkUI f313461d;

    public C105431u1(IPCallTalkUI iPCallTalkUI) {
        this.f313461d = iPCallTalkUI;
    }

    public void run() {
        this.f313461d.setResult(-1, new Intent());
        this.f313461d.finish();
    }
}
