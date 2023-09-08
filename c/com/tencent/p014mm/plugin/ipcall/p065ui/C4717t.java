package com.tencent.p014mm.plugin.ipcall.p065ui;

import com.tencent.p014mm.sdk.platformtools.Util;
import t12.C110899d;
import te3.C49828ic2;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.t */
public class C4717t implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C4725w f19723d;

    public C4717t(C4725w wVar) {
        this.f19723d = wVar;
    }

    public void run() {
        C49828ic2 e = C110899d.m151191e();
        if (e != null) {
            this.f19723d.f19736f.setText(e.f135212j);
            if (!Util.isNullOrNil(e.f135220u)) {
                this.f19723d.f19737g.setText(e.f135220u);
                this.f19723d.f19737g.setVisibility(0);
                return;
            }
            this.f19723d.f19737g.setText("");
            this.f19723d.f19737g.setVisibility(8);
            return;
        }
        this.f19723d.f19736f.setText("");
        this.f19723d.f19737g.setText("");
        this.f19723d.f19737g.setVisibility(8);
    }
}
