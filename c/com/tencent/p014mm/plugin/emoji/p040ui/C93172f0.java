package com.tencent.p014mm.plugin.emoji.p040ui;

import android.view.MenuItem;

/* renamed from: com.tencent.mm.plugin.emoji.ui.f0 */
public class C93172f0 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ EmojiMineUI f268693d;

    public C93172f0(EmojiMineUI emojiMineUI) {
        this.f268693d = emojiMineUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        this.f268693d.finish();
        return true;
    }
}
