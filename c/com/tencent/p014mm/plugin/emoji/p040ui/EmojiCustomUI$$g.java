package com.tencent.p014mm.plugin.emoji.p040ui;

import android.view.MenuItem;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$g */
public class EmojiCustomUI$$g implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ EmojiCustomUI f268448d;

    public EmojiCustomUI$$g(EmojiCustomUI emojiCustomUI) {
        this.f268448d = emojiCustomUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        this.f268448d.finish();
        return true;
    }
}
