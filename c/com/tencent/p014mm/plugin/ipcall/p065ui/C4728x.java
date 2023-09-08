package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.DialogInterface;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.x */
public class C4728x implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ IPCallContactUI f19741d;

    public C4728x(IPCallContactUI iPCallContactUI) {
        this.f19741d = iPCallContactUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f19741d.finish();
    }
}
