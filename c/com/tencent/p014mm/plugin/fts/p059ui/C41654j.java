package com.tencent.p014mm.plugin.fts.p059ui;

import android.app.Dialog;

/* renamed from: com.tencent.mm.plugin.fts.ui.j */
public class C41654j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FTSAddFriendUI f112094d;

    public C41654j(FTSAddFriendUI fTSAddFriendUI) {
        this.f112094d = fTSAddFriendUI;
    }

    public void run() {
        Dialog dialog = this.f112094d.f52675M;
        if (dialog != null) {
            dialog.dismiss();
            this.f112094d.f52675M = null;
        }
    }
}
