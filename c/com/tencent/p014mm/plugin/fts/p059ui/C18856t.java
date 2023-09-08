package com.tencent.p014mm.plugin.fts.p059ui;

import android.view.MenuItem;

/* renamed from: com.tencent.mm.plugin.fts.ui.t */
public class C18856t implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ FTSBaseVoiceSearchUI f52861d;

    public C18856t(FTSBaseVoiceSearchUI fTSBaseVoiceSearchUI) {
        this.f52861d = fTSBaseVoiceSearchUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        this.f52861d.finish();
        return true;
    }
}
