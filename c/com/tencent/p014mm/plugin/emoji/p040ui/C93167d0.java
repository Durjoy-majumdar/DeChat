package com.tencent.p014mm.plugin.emoji.p040ui;

import android.view.MenuItem;

/* renamed from: com.tencent.mm.plugin.emoji.ui.d0 */
public final class C93167d0 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ EmojiMineListFragment f268688d;

    public C93167d0(EmojiMineListFragment emojiMineListFragment) {
        this.f268688d = emojiMineListFragment;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        this.f268688d.finish();
        return true;
    }
}
