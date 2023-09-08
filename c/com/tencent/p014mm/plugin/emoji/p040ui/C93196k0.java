package com.tencent.p014mm.plugin.emoji.p040ui;

import android.view.MenuItem;

/* renamed from: com.tencent.mm.plugin.emoji.ui.k0 */
public class C93196k0 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ EmojiSortFragment f268753d;

    public C93196k0(EmojiSortFragment emojiSortFragment) {
        this.f268753d = emojiSortFragment;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        this.f268753d.finish();
        return true;
    }
}
