package com.tencent.p014mm.plugin.emoji.p040ui.fts;

import android.view.MenuItem;

/* renamed from: com.tencent.mm.plugin.emoji.ui.fts.c */
public class C93181c implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ FTSEmojiDetailPageUI f268737d;

    public C93181c(FTSEmojiDetailPageUI fTSEmojiDetailPageUI) {
        this.f268737d = fTSEmojiDetailPageUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        this.f268737d.finish();
        return false;
    }
}
