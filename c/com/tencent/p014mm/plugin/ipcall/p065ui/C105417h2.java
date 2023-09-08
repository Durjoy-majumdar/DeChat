package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.DialogInterface;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.h2 */
public class C105417h2 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C105420i2 f313419d;

    public C105417h2(C105420i2 i2Var) {
        this.f313419d = i2Var;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f313419d.f313450w.finish();
        this.f313419d.f313450w = null;
    }
}
