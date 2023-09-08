package com.tencent.p014mm.plugin.fts.p059ui;

import android.app.Dialog;

/* renamed from: com.tencent.mm.plugin.fts.ui.n */
public class C68988n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FTSBaseMainUI f198234d;

    public C68988n(FTSBaseMainUI fTSBaseMainUI) {
        this.f198234d = fTSBaseMainUI;
    }

    public void run() {
        Dialog dialog = this.f198234d.f52742z;
        if (dialog != null) {
            dialog.dismiss();
            this.f198234d.f52742z = null;
        }
    }
}
