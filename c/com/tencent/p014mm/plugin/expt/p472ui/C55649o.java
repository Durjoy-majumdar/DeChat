package com.tencent.p014mm.plugin.expt.p472ui;

import android.view.MenuItem;

/* renamed from: com.tencent.mm.plugin.expt.ui.o */
public class C55649o implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ KvInfoUI f158382d;

    public C55649o(KvInfoUI kvInfoUI) {
        this.f158382d = kvInfoUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        this.f158382d.finish();
        return true;
    }
}
