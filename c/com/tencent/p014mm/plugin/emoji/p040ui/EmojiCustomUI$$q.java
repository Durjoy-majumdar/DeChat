package com.tencent.p014mm.plugin.emoji.p040ui;

import androidx.recyclerview.widget.GridLayoutManager;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$q */
public class EmojiCustomUI$$q extends GridLayoutManager.C0127b {

    /* renamed from: b */
    public final /* synthetic */ EmojiCustomUI f268455b;

    public EmojiCustomUI$$q(EmojiCustomUI emojiCustomUI) {
        this.f268455b = emojiCustomUI;
    }

    /* renamed from: c */
    public int mo118c(int i) {
        return this.f268455b.f268419f.getItemViewType(i) == 8 ? 5 : 1;
    }
}
