package com.tencent.p014mm.plugin.fts.p059ui;

import android.app.Dialog;

/* renamed from: com.tencent.mm.plugin.fts.ui.l */
public class C18851l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FTSAddWw f52853d;

    public C18851l(FTSAddWw fTSAddWw) {
        this.f52853d = fTSAddWw;
    }

    public void run() {
        Dialog dialog = this.f52853d.f52706K;
        if (dialog != null) {
            dialog.dismiss();
            this.f52853d.f52706K = null;
        }
    }
}
