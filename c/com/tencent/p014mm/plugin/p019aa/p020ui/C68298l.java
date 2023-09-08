package com.tencent.p014mm.plugin.p019aa.p020ui;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.aa.ui.l */
public class C68298l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AARemittanceUI f196318d;

    public C68298l(AARemittanceUI aARemittanceUI) {
        this.f196318d = aARemittanceUI;
    }

    public void run() {
        AARemittanceUI aARemittanceUI = this.f196318d;
        aARemittanceUI.f195966g = aARemittanceUI.f195972p.getWidth();
        this.f196318d.f195974r.setVisibility(8);
        Log.m105919d("MicroMsg.AARemittanceUI", "post: mMaxUnitWidth:%s", Integer.valueOf(this.f196318d.f195966g));
    }
}
